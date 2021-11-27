package hyx2021.designpattern.command;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 12/2/2020
 */
public class LightOffCommand implements Command {
    private LightReceiver lights = null;

    public LightOffCommand(LightReceiver lights) {
        this.lights = lights;
    }

    public void execute() {
        lights.off();
    }

    public void undo() {
        lights.on();
    }
}
