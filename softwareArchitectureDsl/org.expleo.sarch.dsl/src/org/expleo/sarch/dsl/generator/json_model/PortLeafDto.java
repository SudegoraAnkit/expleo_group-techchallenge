package org.expleo.sarch.dsl.generator.json_model;

public class PortLeafDto extends LeafInstanceDto{
	public String portType; // "provides" or "requires"
    public String interfaceName;
    public String definedInComponent;

    public PortLeafDto() {
        this.type = "Port"; // Set the type directly
    }
}
