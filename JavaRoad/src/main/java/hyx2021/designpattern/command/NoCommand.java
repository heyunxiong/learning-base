package hyx2021.designpattern.command;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 12/2/2020
 */
//没有任何命令，空执行，调用代表什么都不做
public class NoCommand implements Command {
    public void execute() {
        System.out.println("No Command execute()");
    }

    public void undo() {
        System.out.println("No Command undo()");
    }
}
