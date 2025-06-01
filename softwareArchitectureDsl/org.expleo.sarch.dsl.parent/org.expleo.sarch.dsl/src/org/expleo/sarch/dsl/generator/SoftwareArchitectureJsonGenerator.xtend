package org.expleo.sarch.dsl.generator

import java.util.ArrayList
import org.expleo.sarch.dsl.generator.json_model.ArchitectureDto
import org.expleo.sarch.dsl.generator.json_model.ComponentDto
import org.expleo.sarch.dsl.generator.json_model.ElementDto
import org.expleo.sarch.dsl.generator.json_model.InterfaceDto
import org.expleo.sarch.dsl.generator.json_model.InterfaceElementLeafDto
import org.expleo.sarch.dsl.generator.json_model.LeafInstanceDto
import org.expleo.sarch.dsl.generator.json_model.PortDto
import org.expleo.sarch.dsl.generator.json_model.PortLeafDto
import org.expleo.sarch.dsl.softwareArchitectureDsl.Architecture
import org.expleo.sarch.dsl.softwareArchitectureDsl.Component
import org.expleo.sarch.dsl.softwareArchitectureDsl.Element
import org.expleo.sarch.dsl.softwareArchitectureDsl.Interface
import org.expleo.sarch.dsl.softwareArchitectureDsl.PPort
import org.expleo.sarch.dsl.softwareArchitectureDsl.Port
import org.expleo.sarch.dsl.softwareArchitectureDsl.RPort

/**
 * Xtend helper functions for generating the Architecture JSON.
 * This version uses an explicit class wrapper as requested.
 */
class SoftwareArchitectureJsonGenerator { // Explicit class wrapper
	// This is the main function that will be called from your Java generator
	// It takes the root of your model (Architecture) and returns the populated DTO object.
    static def ArchitectureDto createArchitectureDto(Architecture architecture) {
        val architectureDto = new ArchitectureDto
        architectureDto.architectureName = architecture.eResource.URI.lastSegment.
            replace(".sa", "").
            replace(".arch", "").
            replace(".results", "")
        
        architectureDto.components = new ArrayList<ComponentDto>
        for (component : architecture.elements.filter(typeof(Component))) {
            // Now call toComponentDto as a static method of this class
            architectureDto.components.add(SoftwareArchitectureJsonGenerator.toComponentDto(component)) // <-- CHANGED
        }

        architectureDto.interfaces = new ArrayList<InterfaceDto>
        for (iface : architecture.elements.filter(typeof(Interface))) {
            // Now call toInterfaceDto as a static method of this class
            architectureDto.interfaces.add(SoftwareArchitectureJsonGenerator.toInterfaceDto(iface)) // <-- CHANGED
        }

        architectureDto.leafInstances = new ArrayList<LeafInstanceDto>
        for (iface : architecture.elements.filter(typeof(Interface))) {
            for (element : iface.elements) {
                val leaf = new InterfaceElementLeafDto
                leaf.name = element.name
                leaf.dataType = element.type.literal
                leaf.definedInInterface = iface.name
                architectureDto.leafInstances.add(leaf)
            }
        }
        for (component : architecture.elements.filter(typeof(Component))) {
            for (port : component.ports) {
                val leaf = new PortLeafDto
                leaf.name = port.name
                leaf.portType = if (port instanceof PPort) "provides" else if (port instanceof RPort) "requires" else "unknown"
                if (port.interface !== null) {
                    leaf.interfaceName = port.interface.name
                } else {
                    leaf.interfaceName = "unresolved"
                }
                leaf.definedInComponent = component.name
                architectureDto.leafInstances.add(leaf)
            }
        }

        return architectureDto
    }

    // Mark all helper methods as 'static' as well
    static def ComponentDto toComponentDto(Component component) { // <-- ADD 'static' HERE
        val dto = new ComponentDto
        dto.name = component.name
        dto.ports = new ArrayList<PortDto>
        for (port : component.ports) {
            // Call toPortDto as a static method as well
            dto.ports.add(SoftwareArchitectureJsonGenerator.toPortDto(port)) // <-- CHANGED
        }
        return dto
    }
    
    static def PortDto toPortDto(Port port) {
	    val dto = new PortDto
	    dto.name = port.name
	    dto.type = if (port instanceof PPort) "provides" else if (port instanceof RPort) "requires" else "unknown"
	    dto.interfaceName = port.interface?.name ?: "unresolved"
	    return dto
	}

    
    static def InterfaceDto toInterfaceDto(Interface iface) { // <-- ADD 'static' HERE
        val dto = new InterfaceDto
        dto.name = iface.name
        dto.elements = new ArrayList<ElementDto>
        for (element : iface.elements) {
            // Call toElementDto as a static method as well
            dto.elements.add(SoftwareArchitectureJsonGenerator.toElementDto(element)) // <-- CHANGED
        }
        return dto
    }
    
    static def ElementDto toElementDto(Element element) { // <-- ADD 'static' HERE
        val dto = new ElementDto
        dto.name = element.name
        dto.dataType = element.type.literal
        return dto
    }
}

