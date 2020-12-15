package cn.itcast.domain;

/**
 * @Description：Person
 * @Author 金宇佳
 * @Date 2020/12/15 18:06
 * @Version 1.0
 */
public class Person {
    private String name;
    private int age;

    public String a;
    protected String b;
    String c;
    private String d;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", a='" + a + '\'' +
                ", b='" + b + '\'' +
                ", c='" + c + '\'' +
                ", d='" + d + '\'' +
                '}';
    }

    public void  eat() {
        System.out.println("eat...");
    }

    public void  eat(String foot) {
        System.out.println("eat..." + foot);
    }
}