package hyx2020.com.basic;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 7/5/2020
 */
public class CharArrayTest {
    public static void main(String[] args) {
        char[] cs = new char[5];
        for (int i = 0; i < cs.length - 1; i++) {
            System.out.println(cs[i]);
        }


        int num; //声明
        num = 18; //初始化
        int id = 161; //声明+初始化
        int[] ids; //声明
        //1.1静态初始化：数组的初始化和数组元素的赋值操作同时进行
        ids = new int[] {101,1082,103,14};
        //1.2动态初始化：数组的初始化和数组元素的赋值操作分开进行
        String[] names = new String[5];
        //省略也是正确的写法：类型推断
        int[] arr4 = {1,2,3,4};


    }
}
