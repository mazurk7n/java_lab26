public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
    Point point = new Point();
    point.setX(6.7F);
    point.setY(4.1F);

    Point point2 = point.translated(2f, 2f);
        System.out.println(point2);
    point.translate(point.getX(), point.getY());
        System.out.println(point);

    Segment segment = new Segment();
    segment.p=point;
    segment.q=point2;
        System.out.println(segment.length());

    }

}
