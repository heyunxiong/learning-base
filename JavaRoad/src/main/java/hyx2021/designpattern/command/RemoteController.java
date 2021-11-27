package hyx2021.designpattern.command;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 12/2/2020
 */
public class RemoteController {
    // 开/关
    private Command[] onCommands = null;
    private Command[] offCommands = null;

    // 撤销
    private Command undoCommands = null;

    public RemoteController() {
        // 开关各五个
        onCommands = new Command[5];
        offCommands = new Command[5];
        //初始化的时候不选择任何名命令。默认是空执行
        for (int i = 0; i < 5; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }
    //设置按钮的命令
    // no表示第几个命令，onCommand表示开，off表示关
    void setCommands(int no, Command onCommand, Command offCommand){
        onCommands[no] = onCommand; //意思是onCommand[2] 表示第三个命令是开
        offCommands[no] = offCommand;
    }

    // 开
    void onButton(int no){
        //打开调用相应的方法
        onCommands[no].execute();
        //记录，用于撤销
        undoCommands = onCommands[no];

    }
    //关
    void offButton(int no){
        //打开调用相应的方法
        offCommands[no].execute();
        //记录，用于撤销
        undoCommands = offCommands[no];

    }

    void onUndo(int no){
        undoCommands.undo();
    }
}
