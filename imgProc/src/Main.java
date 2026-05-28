import java.io.IOException;

public class Main {
    static void main(String[] args) throws IOException {
        ImageProcessor processor = new ImageProcessor();
        processor.load("rika.png");
        processor.addBrightness(100);
        processor.save("rika2.jpg");
    }
}
