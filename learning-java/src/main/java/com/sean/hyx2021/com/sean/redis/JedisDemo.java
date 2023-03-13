package com.sean.hyx2021.com.sean.redis;/*
package com.sean.redis;

import redis.clients.jedis.*;

*/
/**
 * @author Yunxiong
 * @version 1.0
 * @date 2021-01-08
 *//*

public class JedisDemo {

    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost");

        jedis.set("javakey", "javavalue");

        System.out.println(jedis.get("javakey"));


        //create pipeline

        Pipeline pipeline = jedis.pipelined();

        pipeline.set("p1","v1");
        pipeline.sadd("p2","v2","v22");
        pipeline.set("p3","v3");
        pipeline.set("p4","v4");

        pipeline.sync();

        //create transaction
        Transaction transaction = jedis.multi();

        //submit transaction
        transaction.exec();

        // threadpool
        JedisPool jedisPool = new JedisPool(new JedisPoolConfig(), "localhost");

    }


}
*/
