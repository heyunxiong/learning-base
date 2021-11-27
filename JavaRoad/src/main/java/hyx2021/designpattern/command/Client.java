package hyx2021.designpattern.command;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 12/2/2020
 */
public class Client {
    public static void main(String[] args) {
        LightReceiver lightReceiver = new LightReceiver();

        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);

        //遥控器
        RemoteController remoteController = new RemoteController();
        //遥控器设置no=0的电灯的开和关操作
        remoteController.setCommands(0,lightOnCommand,lightOffCommand);
        System.out.println("按下灯的开按钮");
        remoteController.onButton(0);

        System.out.println("按下灯的关按钮");
        remoteController.offButton(0);

        System.out.println("按下撤销按钮");
        remoteController.onUndo(0);

    }

}
