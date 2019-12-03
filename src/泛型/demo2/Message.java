package 泛型.demo2;

/**
 * 通配符
 */
public class Message<T> {

    private T msg;

    public void setMsg(T msg){
        this.msg = msg;
    }

    public T getMsg(){
        return this.msg;
    }

}
