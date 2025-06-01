package org.expleo.sarch.dsl.generator;

import java.util.List;
import java.util.stream.Collectors;

import org.expleo.sarch.dsl.softwareArchitectureDsl.Architecture;
import org.expleo.sarch.dsl.softwareArchitectureDsl.Component;
import org.expleo.sarch.dsl.softwareArchitectureDsl.Element;
import org.expleo.sarch.dsl.softwareArchitectureDsl.Interface;
import org.expleo.sarch.dsl.softwareArchitectureDsl.Port;
import org.expleo.sarch.dsl.softwareArchitectureDsl.PPort;
import org.expleo.sarch.dsl.softwareArchitectureDsl.RPort;

public class PlantUmlGenerator {

    public static String generatePlantUml(Architecture architecture) {
        StringBuilder sb = new StringBuilder();

        sb.append("@startuml\n");
        sb.append("title Architecture: ").append(architecture.getName()).append("\n\n");

        // Get interfaces from elements list
        List<Interface> interfaces = architecture.getElements().stream()
            .filter(e -> e instanceof Interface)
            .map(e -> (Interface) e)
            .collect(Collectors.toList());

        // Get components from elements list
        List<Component> components = architecture.getElements().stream()
            .filter(e -> e instanceof Component)
            .map(e -> (Component) e)
            .collect(Collectors.toList());

        // Interfaces as UML interfaces
        for (Interface iface : interfaces) {
            sb.append("interface ").append(iface.getName()).append(" {\n");
            for (Element element : iface.getElements()) {
                sb.append("  ").append(element.getType().getLiteral()).append(" ").append(element.getName()).append("\n");
            }
            sb.append("}\n\n");
        }

        // Components with ports as UML components
        for (Component component : components) {
            sb.append("component ").append(component.getName()).append(" {\n");
            for (Port port : component.getPorts()) {
                String portType = "";
                if (port instanceof PPort) {
                    portType = "provides";
                } else if (port instanceof RPort) {
                    portType = "requires";
                }
                String ifaceName = (port.getInterface() != null) ? port.getInterface().getName() : "UNKNOWN_INTERFACE";

                sb.append("  ").append(portType).append(" ").append(port.getName())
                  .append(" : ").append(ifaceName).append("\n");
            }
            sb.append("}\n\n");
        }

        // Relationships: component ports connected to interfaces
        for (Component component : components) {
            for (Port port : component.getPorts()) {
                String arrow = " --> ";
                if (port instanceof RPort) {
                    arrow = " <.. ";
                }
                String ifaceName = (port.getInterface() != null) ? port.getInterface().getName() : "UNKNOWN_INTERFACE";

                sb.append(component.getName())
                  .append(arrow)
                  .append(ifaceName)
                  .append(" : ")
                  .append(port.getName())
                  .append("\n");
            }
        }

        sb.append("\n@enduml");
        return sb.toString();
    }
}
