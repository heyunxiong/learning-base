package hyx2021.designpattern.facade;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 11/29/2020
 */
public class Client {

    //可以直接调用各个设备，但是很麻烦，所以可以用一个外观类作为中介。

    public static void main(String[] args) {
        HomeFacade homeFacade = new HomeFacade();

        homeFacade.ready();
        homeFacade.play();
        homeFacade.pause();
        homeFacade.shutdown();
    }
}
