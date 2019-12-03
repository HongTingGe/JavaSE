package 泛型.demo3;


/**
 * 设置泛型的上限，可以在声明和方法参数上使用
 */

class Message<T extends Number>{
    private T msg;

    public T getMsg(){
        return this.msg;
    }

    public void setMsg(T msg){
        this.msg = msg;
    }
}
public class TestDemo {

    public static void main(String[] args) {
        Message<Integer> m1 = new Message<>();
        m1.setMsg(100);
        fun(m1);
    }

    public static void fun(Message<? extends Number> temp){
        System.out.println(temp.getMsg());
    }
}
