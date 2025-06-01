package org.expleo.sarch.dsl.generator;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.expleo.sarch.dsl.generator.json_model.ArchitectureDto;
import org.expleo.sarch.dsl.softwareArchitectureDsl.Architecture;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class SoftwareArchitectureDslGenerator extends AbstractGenerator {
    private static final Logger logger = LoggerFactory.getLogger(SoftwareArchitectureDslGenerator.class);

    @Override
    public void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
        // Basic check: Ensure the resource is valid and contains an Architecture model
        if (resource == null || resource.getContents().isEmpty() || !(resource.getContents().get(0) instanceof Architecture)) {
            logger.error("Generator received an invalid or empty resource, or not an Architecture model. Skipping generation.");
            return;
        }

        Architecture architecture = (Architecture) resource.getContents().get(0);
        ArchitectureDto architectureDto = SoftwareArchitectureJsonGenerator.createArchitectureDto(architecture);
        
        if (architectureDto == null) {
            logger.error("Invalid or null ArchitectureDto. Aborting generation.");
            return;
        }
        architectureDto.setName(architecture.getName());
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String jsonOutput = gson.toJson(architectureDto);

        // Correctly strip the file extension and append .json
        String baseFileName = resource.getURI().lastSegment().replaceFirst("\\.[^.]+$", "");
        String jsonOutputFileName = baseFileName + ".json";

        // Backup existing JSON if it exists
        if (fsa.isFile(jsonOutputFileName)) {
            String backupName = jsonOutputFileName.replace(".json", "_" + System.currentTimeMillis() + ".bak.json");
            CharSequence existingContent = fsa.readTextFile(jsonOutputFileName);
            if (existingContent != null) {
                fsa.generateFile(backupName, existingContent);
                logger.info("Backup created: {}", backupName);
            }
        }

        fsa.generateFile(jsonOutputFileName, jsonOutput);
        logger.info("Successfully generated JSON: {}", jsonOutputFileName);

        // --- PlantUML generation part ---

        String plantUmlContent = PlantUmlGenerator.generatePlantUml(architecture);

        // Remove quotes from architecture name if any (because your grammar uses STRING which includes quotes)
        String cleanName = architecture.getName().replaceAll("\"", "");
        String plantUmlFileName = cleanName + ".puml";

        // Backup existing PlantUML if exists
        if (fsa.isFile(plantUmlFileName)) {
            String backupPuml = plantUmlFileName.replace(".puml", "_" + System.currentTimeMillis() + ".bak.puml");
            CharSequence existingPuml = fsa.readTextFile(plantUmlFileName);
            if (existingPuml != null) {
                fsa.generateFile(backupPuml, existingPuml);
                logger.info("Backup created: {}", backupPuml);
            }
        }

        // Generate the PlantUML file
        fsa.generateFile(plantUmlFileName, plantUmlContent);
        logger.info("Successfully generated PlantUML: {}", plantUmlFileName);
        
    }

}
