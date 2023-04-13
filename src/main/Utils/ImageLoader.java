package Utils;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ImageLoader {
    private File file;
    public Image img;
    //
    public ImageLoader(String path) {
        file = new File(path);
        //
        try {
            img = ImageIO.read(file);
        } catch(IOException e) { e.printStackTrace(); }
        //
    }
    //
    public Image getTexture() {
        return img;
    }
}
