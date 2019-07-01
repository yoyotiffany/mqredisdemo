package com.mqredisdemo.demo.Common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;
import redis.clients.jedis.JedisPoolConfig;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * author：yq
 * date: 2019/6/19
 */
public class test {

    public static void main(String[] args) {
//redis集群1111
//yq-1 first commit
        //没通过再次提交
        JedisPoolConfig poolConfig = new JedisPoolConfig();
        // 最大连接数
        poolConfig.setMaxTotal(1);
        // 最大空闲数
        poolConfig.setMaxIdle(1);
        // 最大允许等待时间，如果超过这个时间还未获取到连接，则会报JedisException异常：
        // Could not get a resource from the pool
        poolConfig.setMaxWaitMillis(1000);
        Set<HostAndPort> nodes = new LinkedHashSet<HostAndPort>();
        nodes.add(new HostAndPort("192.168.2.131", 7000));
        nodes.add(new HostAndPort("192.168.2.131", 7001));
        nodes.add(new HostAndPort("192.168.2.131", 7002));
        nodes.add(new HostAndPort("192.168.2.131", 7003));
        nodes.add(new HostAndPort("192.168.2.131", 7004));
        nodes.add(new HostAndPort("192.168.2.131", 7005));
        JedisCluster cluster = new JedisCluster(nodes, poolConfig);
       // String name = cluster.get("name");
       // System.out.println(name);
        cluster.set("age", "18");
        System.out.println(cluster.get("age"));
        try {
            cluster.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
