package com.sean.hyx2021.designpattern.flyweitght;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 11/30/2020
 */
public class Client {
    public static void main(String[] args) {
        WebSiteFactory webSiteFactory = new WebSiteFactory();

        WebSite news = webSiteFactory.getWebSiteCategory("news");
        User user = new User();
        user.setName("tom");
        news.use(user);

        WebSite blog = webSiteFactory.getWebSiteCategory("blog");
        User user2 = new User();
        user.setName("jack");
        blog.use(user);

    }
}
