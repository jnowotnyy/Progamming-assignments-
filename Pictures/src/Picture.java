import java.awt.image.BufferedImage;
import java.util.Collections;
import java.util.List;
import java.util.List;
import java.awt.Color;

public class Picture {
    public static void Picture(){};
    public static List[][] images(BufferedImage img) {
        int width = img.getWidth();
        int height = img.getHeight();
        List[][] listy = new List[width][height];
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                listy[i][j] = Collections.singletonList(img.getRGB(i, j));
            }
        }
        return listy;
    }
}
