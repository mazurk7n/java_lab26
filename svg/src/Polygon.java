import java.util.Arrays;
import java.util.Locale;

public class Polygon {

    public Point[] points;
    private Style style;


    public Polygon(Point[] points) {
        this(points, new Style("transparent","black", 1.0));
        //System.arraycopy(points, 0, this.points, 0, points.length);
    }

    public Polygon(Point[] points, Style style) {
        //this.points = points;
        this.points = new Point[points.length];
        this.style=style;
        for (int i = 0; i < points.length; i++) {
            this.points[i] = new Point(points[i]);
        }
    }

    public Polygon(Polygon p) {
        this(p.points);
    }

    public static Polygon square(Segment segment, Style style){
        Segment perp = segment.perpendicular();
        Point[] points = new Point[4];
        points[0]=segment.getP();
        points[1]=perp.getP();
        points[2]=segment.getQ();
        points[3]=perp.getQ();
        return new Polygon(points, style);
    }


    @Override
    public String toString() {
        return "Polygon{" +
                "points=" + Arrays.toString(points) +
                '}';
    }
    public String toSvg() {
        StringBuilder pointString = new StringBuilder();
        for (Point point : points){
            point.getX();
            point.getY();
            pointString.append(point.getX()).append(",").append(point.getY()).append(" ");
        }
        return String.format(Locale.ENGLISH, "<polygon points=\"%s\" style="+style.toSvg()+" />", pointString.toString());
        }
}