package org.expleo.sarch.dsl.generator;

import com.google.common.collect.Iterables;
import java.util.ArrayList;
import org.eclipse.emf.common.util.EList;
import org.expleo.sarch.dsl.generator.json_model.ArchitectureDto;
import org.expleo.sarch.dsl.generator.json_model.ComponentDto;
import org.expleo.sarch.dsl.generator.json_model.ElementDto;
import org.expleo.sarch.dsl.generator.json_model.InterfaceDto;
import org.expleo.sarch.dsl.generator.json_model.InterfaceElementLeafDto;
import org.expleo.sarch.dsl.generator.json_model.LeafInstanceDto;
import org.expleo.sarch.dsl.generator.json_model.PortDto;
import org.expleo.sarch.dsl.generator.json_model.PortLeafDto;
import org.expleo.sarch.dsl.softwareArchitectureDsl.Architecture;
import org.expleo.sarch.dsl.softwareArchitectureDsl.Component;
import org.expleo.sarch.dsl.softwareArchitectureDsl.Element;
import org.expleo.sarch.dsl.softwareArchitectureDsl.Interface;
import org.expleo.sarch.dsl.softwareArchitectureDsl.PPort;
import org.expleo.sarch.dsl.softwareArchitectureDsl.Port;
import org.expleo.sarch.dsl.softwareArchitectureDsl.RPort;

/**
 * Xtend helper functions for generating the Architecture JSON.
 * This version uses an explicit class wrapper as requested.
 */
@SuppressWarnings("all")
public class SoftwareArchitectureJsonGenerator {
  public static ArchitectureDto createArchitectureDto(final Architecture architecture) {
    final ArchitectureDto architectureDto = new ArchitectureDto();
    architectureDto.architectureName = architecture.eResource().getURI().lastSegment().replace(".sa", "").replace(".arch", "").replace(".results", "");
    ArrayList<ComponentDto> _arrayList = new ArrayList<ComponentDto>();
    architectureDto.components = _arrayList;
    Iterable<Component> _filter = Iterables.<Component>filter(architecture.getElements(), Component.class);
    for (final Component component : _filter) {
      architectureDto.components.add(SoftwareArchitectureJsonGenerator.toComponentDto(component));
    }
    ArrayList<InterfaceDto> _arrayList_1 = new ArrayList<InterfaceDto>();
    architectureDto.interfaces = _arrayList_1;
    Iterable<Interface> _filter_1 = Iterables.<Interface>filter(architecture.getElements(), Interface.class);
    for (final Interface iface : _filter_1) {
      architectureDto.interfaces.add(SoftwareArchitectureJsonGenerator.toInterfaceDto(iface));
    }
    ArrayList<LeafInstanceDto> _arrayList_2 = new ArrayList<LeafInstanceDto>();
    architectureDto.leafInstances = _arrayList_2;
    Iterable<Interface> _filter_2 = Iterables.<Interface>filter(architecture.getElements(), Interface.class);
    for (final Interface iface_1 : _filter_2) {
      EList<Element> _elements = iface_1.getElements();
      for (final Element element : _elements) {
        {
          final InterfaceElementLeafDto leaf = new InterfaceElementLeafDto();
          leaf.name = element.getName();
          leaf.dataType = element.getType().getLiteral();
          leaf.definedInInterface = iface_1.getName();
          architectureDto.leafInstances.add(leaf);
        }
      }
    }
    Iterable<Component> _filter_3 = Iterables.<Component>filter(architecture.getElements(), Component.class);
    for (final Component component_1 : _filter_3) {
      EList<Port> _ports = component_1.getPorts();
      for (final Port port : _ports) {
        {
          final PortLeafDto leaf = new PortLeafDto();
          leaf.name = port.getName();
          String _xifexpression = null;
          if ((port instanceof PPort)) {
            _xifexpression = "provides";
          } else {
            String _xifexpression_1 = null;
            if ((port instanceof RPort)) {
              _xifexpression_1 = "requires";
            } else {
              _xifexpression_1 = "unknown";
            }
            _xifexpression = _xifexpression_1;
          }
          leaf.portType = _xifexpression;
          Interface _interface = port.getInterface();
          boolean _tripleNotEquals = (_interface != null);
          if (_tripleNotEquals) {
            leaf.interfaceName = port.getInterface().getName();
          } else {
            leaf.interfaceName = "unresolved";
          }
          leaf.definedInComponent = component_1.getName();
          architectureDto.leafInstances.add(leaf);
        }
      }
    }
    return architectureDto;
  }

  public static ComponentDto toComponentDto(final Component component) {
    final ComponentDto dto = new ComponentDto();
    dto.name = component.getName();
    ArrayList<PortDto> _arrayList = new ArrayList<PortDto>();
    dto.ports = _arrayList;
    EList<Port> _ports = component.getPorts();
    for (final Port port : _ports) {
      dto.ports.add(SoftwareArchitectureJsonGenerator.toPortDto(port));
    }
    return dto;
  }

  public static PortDto toPortDto(final Port port) {
    final PortDto dto = new PortDto();
    dto.name = port.getName();
    String _xifexpression = null;
    if ((port instanceof PPort)) {
      _xifexpression = "provides";
    } else {
      String _xifexpression_1 = null;
      if ((port instanceof RPort)) {
        _xifexpression_1 = "requires";
      } else {
        _xifexpression_1 = "unknown";
      }
      _xifexpression = _xifexpression_1;
    }
    dto.type = _xifexpression;
    String _elvis = null;
    Interface _interface = port.getInterface();
    String _name = null;
    if (_interface!=null) {
      _name=_interface.getName();
    }
    if (_name != null) {
      _elvis = _name;
    } else {
      _elvis = "unresolved";
    }
    dto.interfaceName = _elvis;
    return dto;
  }

  public static InterfaceDto toInterfaceDto(final Interface iface) {
    final InterfaceDto dto = new InterfaceDto();
    dto.name = iface.getName();
    ArrayList<ElementDto> _arrayList = new ArrayList<ElementDto>();
    dto.elements = _arrayList;
    EList<Element> _elements = iface.getElements();
    for (final Element element : _elements) {
      dto.elements.add(SoftwareArchitectureJsonGenerator.toElementDto(element));
    }
    return dto;
  }

  public static ElementDto toElementDto(final Element element) {
    final ElementDto dto = new ElementDto();
    dto.name = element.getName();
    dto.dataType = element.getType().getLiteral();
    return dto;
  }
}
