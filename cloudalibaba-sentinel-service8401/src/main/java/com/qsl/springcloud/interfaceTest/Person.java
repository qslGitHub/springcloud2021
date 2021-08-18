package com.qsl.springcloud.interfaceTest;

/**
 * @Author sileiqiang
 * @create 2021/8/16 10:32 下午
 */
public interface Person {

    String a = "test";

    String say(String msg);

    default void play(){
        System.out.println("play");
    };

    default void eat(){
        System.out.println("eat");
    }


}
