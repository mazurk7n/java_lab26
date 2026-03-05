import java.util.Arrays;
import java.util.Locale;

public class Polygon {

    public Point[] points;

    public Polygon(Point[] points) {
        //this.points = points;
        this.points = new Point[points.length];
        System.arraycopy(points, 0, this.points, 0, points.length);
    }

    public Polygon(Polygon p) {
        this(p.points);
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
        return String.format(Locale.ENGLISH, "<polygon points=\"%s\" style=\"fill:lime;stroke:purple;stroke-width:3\" />", pointString.toString());
        }
}