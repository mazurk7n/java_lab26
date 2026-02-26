public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
    Point point = new Point();
    point.x = 6.7F;
    point.y = 4.1F;

    Point point2 = point.translated(2f, 2f);
        System.out.println(point2);
    point.translate(point.x, point.y);
        System.out.println(point);



    }

}
