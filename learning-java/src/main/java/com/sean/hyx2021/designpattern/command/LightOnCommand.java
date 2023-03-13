package com.sean.hyx2021.designpattern.command;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 12/2/2020
 */
public class LightOnCommand implements Command {
    private LightReceiver lights = null;

    public LightOnCommand(LightReceiver lights) {
        this.lights = lights;
    }

    public void execute() {
        lights.on();
    }

    public void undo() {
        lights.off();
    }
}
