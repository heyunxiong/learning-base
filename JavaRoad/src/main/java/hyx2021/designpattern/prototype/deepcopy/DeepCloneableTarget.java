package hyx2021.designpattern.prototype.deepcopy;

import java.io.Serializable;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 11/28/2020
 */
public class DeepCloneableTarget implements Cloneable, Serializable {

    private static final long serialVersionUID = 1L;

    private String cloneName;
    private String cloneClass;

    public DeepCloneableTarget(String cloneName, String cloneClass) {
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
