package com.sean.hyx2021.designpattern.prototype.deepcopy;

import java.io.IOException;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 11/28/2020
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        DeepProtoType p = new DeepProtoType();
        p.name = "sean";
        p.deepCloneableTarget = new DeepCloneableTarget("copySean","copyClss");

//        System.out.println(deepProtoType.clone());
        // 方式一完成深拷贝 ,使用clone方法
        //DeepProtoType p2 = (DeepProtoType)p.clone();
        // 方式二完成深拷贝， 使用序列化的方式
        DeepProtoType p2 = (DeepProtoType) p.deepClone();

        System.out.println(p.name);
        System.out.println(p.deepCloneableTarget.hashCode());
        System.out.println(p2.name);
        System.out.println(p2.deepCloneableTarget.hashCode());




    }
}
