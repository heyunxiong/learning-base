package hyx2021.designpattern.flyweitght;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 11/30/2020
 */
//具体的网站
public class ConcreteWebSite extends WebSite{
    //共享的内部状态。
    String type = null;// 网站形式

    public ConcreteWebSite(String type) {
        this.type = type;
    }

    @Override
    void use(User u) {
        System.out.println("网站的形式:"+ type+ " user is "+u.getName());
    }
}
