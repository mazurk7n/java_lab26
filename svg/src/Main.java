public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
    Point point = new Point();
    point.setX(6.7F);
    point.setY(4.1F);


    Point[] points = new Point[5];
    points[0] = new Point(80F, 74F);
    points[1] = new Point(60F, 64F);
    points[2] = new Point(65F, 97F);
    points[3] = new Point(43F, 93F);
    points[4] = new Point(87F, 56F);



    Polygon polygon = new Polygon(points);
        System.out.println(polygon);
        System.out.println(polygon.toSvg());



/*
    Point point2 = point.translated(2f, 2f);
        System.out.println(point2);
    point.translate(point.getX(), point.getY());
        System.out.println(point);

    Segment segment = new Segment(point, point2);
        System.out.println(segment.length());
        System.out.println(segment.toString());
*/
    }

}
