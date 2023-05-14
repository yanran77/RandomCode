import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Test {

	public static void main(String[] args) {
	 Images images=new Images();
	 BufferedImage bi=images.getImages();
	 try {
		ImageIO.write(bi, "jpg", new File("D:/mydata/222.jpg"));
	} catch (IOException e) {
		e.printStackTrace();
	}
	}

}
