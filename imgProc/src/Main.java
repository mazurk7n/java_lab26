import java.io.IOException;

public class Main {
    static void main(String[] args) throws IOException, InterruptedException {
        ImageProcessor processor = new ImageProcessor();
        processor.load("arc.jpg");
        long start = System.currentTimeMillis();
        processor.addBrightnessThreaded(-100);
        long end = System.currentTimeMillis();
        System.out.println(end-start);
        processor.save("arc2.jpg");

    /*
        ImageProcessor processor = new ImageProcessor();
        processor.load("rika.jpg");
        long start = System.currentTimeMillis();
        processor.addBrightness(-100);
        long end = System.currentTimeMillis();
        System.out.println(end-start);
        processor.save("rika2.jpg");
    */
    }

}
