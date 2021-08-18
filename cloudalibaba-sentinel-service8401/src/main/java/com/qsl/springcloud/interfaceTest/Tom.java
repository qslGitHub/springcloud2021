package com.qsl.springcloud.interfaceTest;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author sileiqiang
 * @create 2021/8/16 10:34 下午
 */
public class Tom implements Person {
    @Override
    public String say(String str) {
        System.out.println("tom saying" + str + "!!!");
        return "tom";
    }

    public static void tomsy(Function<String, String> function, String msg) {
        String result = function.apply(msg);
        System.out.println(result);
//        consumer.accept(msg);
//        String hello = p.say("helloworld");
//        System.out.println(hello);
    }

    @Override
    public void play() {
        System.out.println("Tom playing");
    }

    public static void main(String[] args) {
        Person p = new Tom();
        final int i = 1;
        Person e = (str) -> {
            System.out.println("e saying " + str + i);
            return str;
        };
//        i=4;
        e.say("hello!");
        p.eat();
        p.play();
        p.say("");
        //传的是行为
//        Tom.tomsy((str) -> System.out.println("消费了"+str),"sdsd");
        Tom.tomsy((msg) -> msg + "转化了", "jerry");

        List<Integer> list= Arrays.asList(1,2,56,84,2,11,37);
        //map 映射   forEach 消费，无返回值
        list.stream().map(item->item*10).forEach(item-> System.out.println(item));
        //collect 结束操作
        list=list.stream().map(item->item*5).collect(Collectors.toList());
        //sort 排序
        list.sort((num1,num2)->num1-num2);
        //最优雅的排序
        list.sort(Comparator.comparingInt(num -> (int) num).thenComparing(num -> (int) num).reversed());
        //distinct 去重
        list = list.stream().distinct().collect(Collectors.toList());
        //deduce 归约
        Optional<Integer> reduce = list.stream().reduce((num1, num2) -> num1 + num2);
        list.stream().forEach(item-> System.out.println(item));
        System.out.println("optional is "+reduce);

    }
}
