package 泛型.demo4;

/**
 * 设置泛型的下限，方法参数上使用
 */

class Message<T>{
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
        Message<String> m1 = new Message<>();
        m1.setMsg("ght");
        fun(m1);
    }

    /**
     * 意味着只能设置String或它的父类Object
     * @param temp
     */
    public static void fun(Message<? super String> temp){
        System.out.println(temp.getMsg());
    }
}

