package imageAscii;

import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class imageValues {

	public static void main(String[] args) {
		
		try {
			BufferedImage image = ImageIO.read(new File("image.jpg"))
		}
		
		catch (Exception e) {
			System.out.println("Error:" e.getMessage());
		}

	}

}
