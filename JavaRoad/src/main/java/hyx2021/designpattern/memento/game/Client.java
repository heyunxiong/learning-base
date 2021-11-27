package hyx2021.designpattern.memento.game;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 12/3/2020
 */
public class Client {
    public static void main(String[] args) {
        GameRole gameRole = new GameRole();
        gameRole.setVit(100);
        gameRole.setDef(100);

        System.out.println("打boss前===");
        gameRole.display();

        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(gameRole.createMemento());

        System.out.println("打完boss之后");
        gameRole.setVit(0);
        gameRole.setDef(0);
        gameRole.display();

        System.out.println("角色阵亡,恢复角色");

        gameRole.recoverGameRoleFromMemento(caretaker.getMemento());
        gameRole.display();
    }
}
