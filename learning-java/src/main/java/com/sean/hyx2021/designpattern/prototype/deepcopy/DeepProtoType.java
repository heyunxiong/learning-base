package com.sean.hyx2021.designpattern.prototype.deepcopy;

import java.io.*;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 11/28/2020
 */
public class DeepProtoType implements Cloneable, Serializable {
    public String name;
    public DeepCloneableTarget deepCloneableTarget; //引用类型

    public DeepProtoType() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DeepCloneableTarget getDeepCloneableTarget() {
        return deepCloneableTarget;
    }

    public void setDeepCloneableTarget(DeepCloneableTarget deepCloneableTarget) {
        this.deepCloneableTarget = deepCloneableTarget;
    }

    // 深拷贝 使用clone 方法
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep = null;
        //完成基本数据类型属性和String的克隆
        deep = super.clone();
        //对引用类型的属性进行处理
        //1.先把Object类型的deep转成DeepProtoType，这一步的原因是前面已经对基本数据类型进行了克隆
        DeepProtoType deepProtoType = (DeepProtoType)deep;
        deepProtoType.deepCloneableTarget = (DeepCloneableTarget) deepCloneableTarget.clone();

        return deep;
    }

    // 深拷贝 方式二 使用序列化 推荐使用
    public Object deepClone() throws IOException, ClassNotFoundException {
        //创建输出流对象
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        //序列化
        oos.writeObject(this); //当前这个对象以对象流的方式输出

        //创建输入流对象
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);

        //反序列化
        DeepProtoType deepCopy = (DeepProtoType) ois.readObject();

        ois.close();
        bis.close();
        oos.close();
        bos.close();

        return deepCopy;
    }

}
