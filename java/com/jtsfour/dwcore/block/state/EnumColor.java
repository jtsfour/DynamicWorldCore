package com.jtsfour.dwcore.block.state;

import net.minecraft.util.IStringSerializable;

public enum EnumColor implements IStringSerializable {
	

	BLUE(0, "blue"),
    YELLOW(1, "yellow");

    private int ID;
    private String name;
    
    private EnumColor(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }
    
    @Override
    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }
    
    @Override
    public String toString() {
        return getName();
    }

}
