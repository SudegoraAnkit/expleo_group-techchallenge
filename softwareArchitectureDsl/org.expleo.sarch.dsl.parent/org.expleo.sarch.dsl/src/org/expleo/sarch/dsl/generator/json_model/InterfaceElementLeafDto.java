package org.expleo.sarch.dsl.generator.json_model;

public class InterfaceElementLeafDto extends LeafInstanceDto {
	public String dataType;
    public String definedInInterface;

    public InterfaceElementLeafDto() {
        this.type = "InterfaceElement"; // Set the type directly
    }
}
