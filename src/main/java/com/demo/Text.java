package com.demo;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.util.JSONPObject;
import jdk.nashorn.internal.runtime.JSONFunctions;

import java.util.*;

public class Text {
//    public static void main(String[] args) {
//
//        Collection collection = new ArrayList<>();
//        collection.add("张三");
//        collection.add("李四");
//        collection.add("王五");
//        collection.add("赵六");
//        System.out.println("集合结果:"+collection);
//
//        for (Object coll : collection) {
//            System.out.println("遍历集合:"+coll);
//
//        }
//        System.out.println("------------------");
//
//        Iterator iterator = collection.iterator();
//        while (iterator.hasNext()){
////            String next = (String) iterator.next();
//            String s = iterator.next().toString();
//            System.out.println("迭代:"+s);
//        }
//        System.out.println("判断:"+collection.isEmpty());
//
//    }

//    public static void main(String[] args) {
////        List<Student> list = new ArrayList<>();
////        list.add(new Student("张三",1));
////        list.add(new Student("李四",2));
////        list.add(new Student("王五",3));
////
////        System.out.println("list:"+list);
////        list.remove(0);
////        System.out.println(list);
////
////        Map<String,Object> map = new HashMap<>();
////            map.put("1","张林");
////            map.put("2","郑钦文");
////            map.put("3","曲浩云");
////        System.out.println("map:"+map.toString());
////
////        for (String s : map.keySet()) {
////            System.out.println("key"+s+map.get(s));
////        }
////        System.out.println(
////                map.keySet()
////        );
////
////
////        for (Object value : map.values()) {
////            System.out.println("value"+value);
////        }
////        for (Map.Entry<String, Object> stringObjectEntry : map.entrySet()) {
////            System.out.println(
////                    "key+value"+stringObjectEntry
////            );
////            System.out.println(
////                    map.containsKey("2")
////            );
////        }
//
////        JSONObject jsonObject = new JSONObject();
////        jsonObject.put("1","张三");
////        jsonObject.put("2","李四");
////        jsonObject.put("3","王五");
////        System.out.println("jsonObject:"+jsonObject);
//
//    }
public static void main(String[] args) {
    String s1 = "zhanglin";
    String s2 = "zhengqinwen";
    StringBuilder sb = new StringBuilder();
    sb.append(s1+s2).append(System.getProperty("line.separator"));
    System.out.println("sb------:"+sb);
    sb.insert(6,"zzzzzz");
    System.out.println(sb);


}


}
