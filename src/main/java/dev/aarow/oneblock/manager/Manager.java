package dev.aarow.oneblock.manager;

import dev.aarow.oneblock.OneBlock;

public abstract class Manager {

    public OneBlock plugin = OneBlock.getInstance();

    public Manager(){
        this.setup();
    }

    public abstract void setup();
}
