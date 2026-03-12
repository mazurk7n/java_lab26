import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
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

    Point[] points2 = new Point[3];
    points2[0] = new Point(8F, 7F);
    points2[1] = new Point(34F, 23F);
    points2[2] = new Point(56F, 79F);


    Polygon polygon = new Polygon(points);
        System.out.println(polygon);
        System.out.println(polygon.toSvg());

    Polygon polygon2 = new Polygon(points2);

    Polygon polygon3 = new Polygon(new Point[]{
            new Point(8F, 7F),
            new Point(33F, 12F),
            new Point(21F, 53F),
    });

    SvgScene scene=new SvgScene();
    scene.addPolygon(polygon);
    scene.addPolygon(polygon2);
    scene.addPolygon(polygon3);

    System.out.println(scene.toSvg());

    scene.save("out.svg");

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
