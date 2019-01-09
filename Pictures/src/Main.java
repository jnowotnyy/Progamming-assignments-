import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import java.util.List;

public class Main {
    private static BufferedImage image;
    public static void main(String[] args){
        Picture pic = new Picture();
        try {
            File initialImage = new File("C://Users/Owner/Desktop/dolphin.png");
            image = ImageIO.read(initialImage);
        }catch(IOException e){
            System.out.println("there is an error"+e.getMessage());
        }
    }
    List[][] listy = Picture.images(image);
}
