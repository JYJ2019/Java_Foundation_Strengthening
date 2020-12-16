package cn.itcast.annotation;

/**
 * @Description：TODO
 * @Author 金宇佳
 * @Date 2020/12/16 10:18
 * @Version 1.0
 */
@MyAnno(value = 1, per = Person.p1, anno2 = @MyAnno2, strs = {"abc", "bbb"})
@MyAnno3()
public class Worker {

    public String name = "aaa";

    public void show() {

    }
}
