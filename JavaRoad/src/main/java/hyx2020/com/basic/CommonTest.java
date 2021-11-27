package hyx2020.com.basic;

import java.util.Arrays;

public class CommonTest {
    public static void main(String[] args) {
        //int x = 5;
        //int y = x++;
        //int z = ++x;

        // System.out.println("x :"+ ++x);
        // System.out.println("x :"+ x++);
//        System.out.println("y :"+y);
        // System.out.println("z :"+z);

        int i = 1;
        int j = i++; // i先赋值给j，j=1，然后i自身加1，i=2
        int n = 2;
        int m = ++n; // n自身先加1，n=3，然后赋值给m m=3;
        System.out.println("i :" + i);
        System.out.println("j :" + j);
        System.out.println("n :" + n);
        System.out.println("m :" + m);


    }
}
