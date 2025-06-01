/**
 * 
 */
package org.expleo.sarch.dsl.generator.json_model;

import java.util.List;

/**
 * 
 */
public class ArchitectureDto {
	public String architectureName;
    public List<ComponentDto> components;
    public List<InterfaceDto> interfaces;
    public List<LeafInstanceDto> leafInstances;
	
    public String getName() { return architectureName; }
    public void setName(String name) { this.architectureName = name; }
	public List<ComponentDto> getComponents() {
		return components;
	}
	public void setComponents(List<ComponentDto> components) {
		this.components = components;
	}
	public List<InterfaceDto> getInterfaces() {
		return interfaces;
	}
	public void setInterfaces(List<InterfaceDto> interfaces) {
		this.interfaces = interfaces;
	}
	public List<LeafInstanceDto> getLeafInstances() {
		return leafInstances;
	}
	public void setLeafInstances(List<LeafInstanceDto> leafInstances) {
		this.leafInstances = leafInstances;
	}
    
    
}
