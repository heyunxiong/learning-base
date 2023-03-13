package com.sean.hyx2021.designpattern.flyweitght;

import java.util.HashMap;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 11/30/2020
 */
// 返回网站
public class WebSiteFactory {

    // 池
    private  HashMap<String, ConcreteWebSite> pool = new HashMap<String, ConcreteWebSite>();

    public WebSite getWebSiteCategory(String type){
        //如果池中没有这种type的就创建一个
        if(!pool.containsKey(type)){
            pool.put(type,new ConcreteWebSite(type));
        }
        return  (WebSite)pool.get(type);
    }

    public int getPoolSize(){
        return pool.size();
    }
}
