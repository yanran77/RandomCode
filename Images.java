import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.Random;

public class Images {
	private int width=150;
	private int height=50;
	private int fontsize=39;
	private int codecount=6;
	private Random random=new Random();
	public String generatecode() {
		String str="";
		int count=0;
		char[]codes=new char[62];
		for(int i='A';i<='Z';i++) {
			codes[count]=(char)i;
			count++; 
		}
		for(int i='a';i<='z';i++) {
			codes[count]=(char)i;
			count++; 
		}
		for(int i=0;i<=9;i++) {
			codes[count]=(char)i;
			count++; 
		}
		for(int i=0;i<codecount;i++) {
			int r=random.nextInt(codes.length);
			str+=codes[r];
		}
		return str;
		
	}
	public BufferedImage getImages() {
		BufferedImage bi=new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
		Graphics g2=bi.getGraphics();
		g2.setColor(new Color(51,102,205));
		g2.fillRect(0, 0, width, height);
		g2.setFont(new Font("宋体",Font.BOLD,fontsize));
		String str=this.generatecode();
		int x=0;
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			int r=random.nextInt(255);
			int g=random.nextInt(255);
			int b=random.nextInt(255);
			g2.setColor(new Color(r,g,b));
			g2.drawString(c+"", x, 40);
			x+=width/codecount;
		}
		for(int i=0;i<10;i++) {
			int r=random.nextInt(255);
			int g=random.nextInt(255);
			int b=random.nextInt(255);
			g2.setColor(new Color(r,g,b));
			int x1=random.nextInt(width);
			int y1=random.nextInt(height);
			int x2=random.nextInt(width);
			int y2=random.nextInt(height);
			g2.drawLine(x1, y1, x2, y2);
		}
		
		return bi;
		
	}
}
