package 异常;

/**
 * Exception强制性异常处理，RuntimeException选择性异常处理
 */

public class Main {

    public static void main(String[] args) {
        test();

        try {
            test1();
        } catch (MyException e) {
            e.printStackTrace();
        }
    }


    public static void test(){
        throw new MyRuntimeException();
    }

    public static void test1() throws MyException {
        throw new MyException();
    }
}
