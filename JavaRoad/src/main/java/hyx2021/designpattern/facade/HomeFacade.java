package hyx2021.designpattern.facade;


/**
 * @author Yunxiong
 * @version 1.0
 * @date 11/29/2020
 */
public class HomeFacade {

    //持有子系统部件的对象
    private DVDPlayer dvdPlayer;
    private Peojector peojector;
    private Speaker speaker;

    public HomeFacade() {
        this.dvdPlayer = DVDPlayer.getDvdPlayer(); //直接获取对象即可，不需要传入
        this.peojector = Peojector.getPeojector();
        this.speaker = Speaker.getSpeaker();
    }

    //准备流程
    void ready(){
        //模拟流程，先开DVD，再打开投影仪，最后开音响
        dvdPlayer.on();
        peojector.on();
        speaker.on();

    }

    //播放流程,
    void play(){
        //播放dvd
        dvdPlayer.play();
        //投影仪对焦
        peojector.focus();
        //音箱播放
        speaker.speak();
    }
    //暂停。这里就只让dvd画面暂停
    void pause(){
        dvdPlayer.pause();
    }
    // 播放完毕，关闭流程
    void shutdown(){
        //先关闭DVD，关闭音箱，关闭投影仪
        dvdPlayer.off();
        speaker.off();
        peojector.off();
    }
}
