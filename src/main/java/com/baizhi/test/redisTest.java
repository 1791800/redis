package com.baizhi.test;

import org.junit.Test;
import redis.clients.jedis.Jedis;

import java.util.List;
import java.util.Set;

public class redisTest {
    private Jedis jedis = new Jedis("192.168.244.20", 6379);

    @Test
    public void test() {
        jedis.select(0);
        String name = jedis.type("name");
        System.out.println(name);
    }

    @Test
    public void test1() {
        jedis.select(0);
        Set<String> keys = jedis.keys("*");
        for (String key : keys) {
            System.out.println(key);
        }
    }

    @Test
    public void test2() {
        jedis.select(0);
        String s = jedis.randomKey();
        System.out.println(s);
    }

    @Test
    public void test3() {
        String age = jedis.set("age", "123123");
    }

    @Test
    public void tets4() {
        String age = jedis.get("age");
        System.out.println(age);
    }

    @Test
    public void test5() {
        String age = jedis.type("age");
        System.out.println(age);
    }

    @Test
    public void test6() {
        jedis.lpush("names", "san");
    }

    @Test
    public void test7() {
        jedis.lpushx("names", "san");
    }

    @Test
    public void test8() {
        List<String> names = jedis.lrange("names", 0, -1);
        for (String name : names) {
            System.out.println(name);
        }
    }

    @Test
    public void tset9() {
        Long names = jedis.llen("names");
        System.out.println(names);
    }

    @Test
    public void test10() {
        jedis.lrem("names", 2, "san");
    }

    @Test
    public void test11() {
        jedis.select(0);
        String name = jedis.type("name");
        System.out.println(name);
    }

    @Test
    public void test12() {
        jedis.select(0);
        Set<String> keys = jedis.keys("*");
        for (String key : keys) {
            System.out.println(key);
        }
    }

    @Test
    public void test13() {
        jedis.select(0);
        String s = jedis.randomKey();
        System.out.println(s);
    }

    @Test
    public void test21() {
        jedis.sadd("set", "11");
    }

    @Test
    public void tets14() {
        Long set = jedis.scard("set");
        System.out.println(set);
    }

    @Test
    public void test15() {
        Set<String> set = jedis.smembers("set");
        for (String s : set) {
            System.out.println(s);
        }
    }

    @Test
    public void test16() {
        String set = jedis.spop("set");
        System.out.println(set);
    }

    @Test
    public void test17() {
        jedis.srem("set");
    }

    @Test
    public void test18() {
        String set = jedis.srandmember("set");
        System.out.println(set);
    }

    @Test
    public void tset19() {
        Boolean set = jedis.sismember("set", "11");
        System.out.println(set);
    }

    @Test
    public void test20() {
        jedis.zadd("zset", 1, "22");
    }

    @Test
    public void test30() {
        Long zset = jedis.zcard("zset");
        System.out.println(zset);
    }

    @Test
    public void test31() {
        Set<String> zsey = jedis.zrange("zsey", 0, -1);
        for (String s : zsey) {
            System.out.println(s);
        }
    }

    @Test
    public void test32() {
        Long zset = jedis.zrank("zset", "22");
        System.out.println(zset);
    }

    @Test
    public void test33() {
        Long zset = jedis.zrevrank("zset", "22");
        System.out.println(zset);
    }

    @Test
    public void test35() {
        Double zscore = jedis.zscore("zset", "22");
        System.out.println(zscore);
    }

    @Test
    public void test36() {
        jedis.zrem("zset", "22");
    }

    @Test
    public void test22() {
        jedis.hset("hash", "11", "22");
    }

    @Test
    public void test23() {
        jedis.hget("hash", "11");
    }

    @Test
    public void test24() {
        jedis.hgetAll("hash");
    }

    @Test
    public void test25() {
        jedis.hdel("hash");
    }

    @Test
    public void test26() {
        jedis.hexists("hash", "11");
    }

    @Test
    public void test27() {
        jedis.hkeys("hash");
    }

    @Test
    public void test28() {
        jedis.hvals("hash");
    }

}
