package hyx2020.com.thread.jdk8.lambda;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 5/1/2020
 */
public class MyLambda {

    // Lambda表达式，其实是简化了匿名内部类的操作

    public static void main(String[] args) {

        // 匿名内部类需要借助接口或者父类创建。这里使用了接口创建匿名内部类myFunction
        MyFunction myFunction = new MyFunction() {
            @Override
            public void cook() {
                System.out.println("i like cooking.");
            }
        };
        // 通过匿名内部类调用实现了的cook方法
        myFunction.cook();

        // 使用Lambda简化这段代码
        MyFunction myFunction2 = null;
        myFunction2 = ()->{
            System.out.println("这是lambda表达式");
        };

        myFunction2.cook();

        // 带参数的,用匿名内部类实现
        MyFunctionP myFunction3 =null;
        myFunction3 = new MyFunctionP() {
            @Override
            public void cook(int num) {
                System.out.println("i like cooking: " + num);
            }
        };

        // lambda
        myFunction3 = (int a) -> {
            System.out.println("这是带参数" + a + "的Lambda");
        };

        // 简化1：
        myFunction3 = (a) -> {
            System.out.println("简化1：去掉参数类型： 这是带参数" + a + "的Lambda");
        };

        // 简化2：
        myFunction3 = a -> {
            System.out.println("简化2：如果只有一个参数，可去掉括号： 这是带参数" + a + "的Lambda");
        };

        // 简化3：
        myFunction3 = b -> System.out.println("简化3：如果只有一条语句，可去掉花括号： 这是带参数" + b + "的Lambda");

        myFunction3.cook(100);

    }
}


// 定义一个函数式接口,函数式接口只有一个方法

interface MyFunction{
    void cook();
}

// 定义一个带参数的函数式接口
interface MyFunctionP{
    void cook(int num);
}