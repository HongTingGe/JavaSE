package 泛型.demo1;

public class TestDemo {

    public static void main(String[] args) {

        Point<String> p = new Point<>();
        p.setX("东经100度");
        p.setY("北纬20度");

        String x = p.getX();
        String y = p.getX();

        System.out.println("X坐标:"+x+",y坐标:"+y);
    }
}
