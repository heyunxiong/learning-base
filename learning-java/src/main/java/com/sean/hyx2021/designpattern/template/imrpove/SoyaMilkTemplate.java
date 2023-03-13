package com.sean.hyx2021.designpattern.template.imrpove;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 11/30/2020
 */

public abstract class SoyaMilkTemplate {
    //模板方法可以做成final，不让子类进行修改

    // 制作过程
    final void make(){
        //可以提取公共的方法
        select();
        soak();
        if(addOrNot()){
            add();
        }
        //。。。可能还有其他步骤
    };
    //选取材料
    void select(){
        System.out.println("选豆子");
    };
    // 浸泡
    void soak(){
        System.out.println("泡豆子");
    };

    // 添加配料，由子类去实现加什么配料
    abstract void add();

    //钩子方法：是否添加配料的判断方法。默认是加配料
    boolean addOrNot(){
        return true;
    }
}
