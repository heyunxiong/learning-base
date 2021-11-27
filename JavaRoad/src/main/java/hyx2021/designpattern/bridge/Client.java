package hyx2021.designpattern.bridge;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 11/29/2020
 */
public class Client {
    public static void main(String[] args) {
        FoldedPhone foldedPhone = new FoldedPhone(new BrandXiaomi());
        foldedPhone.open();
        foldedPhone.call();
        foldedPhone.close();

        UprightPhone uprightPhone = new UprightPhone(new BrandVivo());
        uprightPhone.open();
        uprightPhone.call();
        uprightPhone.close();
    }
}
