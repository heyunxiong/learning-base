package hyx2021.designpattern.template.imrpove;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 11/30/2020
 */
public class PureMilk extends SoyaMilkTemplate {
    @Override
    void add() {
    //默认空实现
    }

    //这里就是子类选择的钩子方法
    @Override
    boolean addOrNot() {
        return false;
    }
}
