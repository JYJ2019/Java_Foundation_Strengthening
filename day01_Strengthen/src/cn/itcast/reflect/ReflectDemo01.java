package cn.itcast.reflect;

import cn.itcast.domain.Person;
import cn.itcast.domain.Student;

/**
 * @Description：获取Class对象的方式
 * @Author 金宇佳
 * @Date 2020/12/15 18:02
 * @Version 1.0
 */
/*
    获取Class对象的方式:
    1.Class.forName("全类名"):将字节码文件加载进内存,返回Class对象
    2.类名:class:通过类名的属性class获取
    3.对象.getClass(): getClass()方法在 Object类中定义着
 */
public class ReflectDemo01 {
    public static void main(String[] args) throws ClassNotFoundException {
        //1.Class.forName("全类名")
        //多用于配置文件，将类名定义在配置文件中。读取文件，加载类
        Class cls1 = Class.forName("cn.itcast.domain.Person");
        System.out.println(cls1);
        //2.类名.class
        //多用于参数的传递
        Class cls2 = Person.class;
        System.out.println(cls2);
        //3.对象.getClass()
        //多用于对象的获取字节码的方式
        Person p = new Person();
        Class cls3 = p.getClass();
        System.out.println(cls3);

        //== 比较三个对象
        System.out.println(cls1 == cls2);//true
        System.out.println(cls1 == cls3);//true

        Class cls4 = Student.class;
        System.out.println(cls1 == cls4);//false
    }
}