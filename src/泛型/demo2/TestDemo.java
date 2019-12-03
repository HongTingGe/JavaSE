package 泛型.demo2;

/**
 * 通配符
 */
public class TestDemo {

    public static void main(String[] args) {
        Message<String> message = new Message<>();
        message.setMsg("www.ght.com");

        Message<Integer> message1 = new Message<>();
        message1.setMsg(22);

        fun(message);
        fun(message1);
        System.out.println(message.getMsg());
        System.out.println(message1.getMsg());

    }

    /**
     * 随意修改属性内容，逻辑错误
     * @param temp
     */
    public static void fun(Message temp){
        temp.setMsg("ght");
        System.out.println(temp.getMsg());
    }

    /**
     * 使用通配符"？"的意义在于可以接收类对象，但不能修改对象属性
     * @param temp
     */
    public static void fun1(Message<?> temp){
        //temp.setMsg("ght"); 报错
        System.out.println(temp.getMsg());
    }
}
