package cn.itcast.reflect;

/**
 * @Description：Class对象功能
 * @Author 金宇佳
 * @Date 2020/12/15 18:32
 * @Version 1.0
 */

/**
 *      Class对象功能：
 *          * 获取功能：
 *          1. 获取成员变量们
 *              * Field[] getFields()
 *              * Field getField(String name)
 *
 *              * Field[] getDeclaredFields()
 *              * Field getDeclaredField(String name)
 *          2. 获取构造方法们
 *              * Constructor<?>[] getConstructors()
 *              * Constructor<T> getConstructor(类<?>... parameterTypes)
 *
 *              * Constructor<T> getDeclaredConstructor(类<?>... parameterTypes)
 *              * Constructor<?>[] getDeclaredConstructors()
 *          3. 获取成员方法们：
 *              * Method[] getMethods()
 *              * Method getMethod(String name, 类<?>... parameterTypes)
 *
 *              * Method[] getDeclaredMethods()
 *              * Method getDeclaredMethod(String name, 类<?>... parameterTypes)
 *
 *          4. 获取类名
 *              * String getName()
 */
public class ReflectDemo2 {
    public static void main(String[] args) {

    }
}