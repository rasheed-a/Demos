import java.awt.*;

public class Trap extends SimpleShape{
	
	private int length;
	private int height;
	
	public Trap() {
		super();
		length = 40;
		height = 10;
	}
	
	public void changeSize(int len, int h) {
		length = len;
		height = h;
	}
	
	public void draw() {
		if(isVisible()) {
            Canvas canvas = Canvas.getCanvas();
            int[] xpoints = { getxPosition(), getxPosition() + (length/4), getxPosition() + 3*length/4, getxPosition()+length};
            int[] ypoints = { getyPosition(), getyPosition() - height, getyPosition() + - height, getyPosition() };
            canvas.draw(this, getColor(), new Polygon(xpoints, ypoints, 4));
            canvas.wait(10);
		}
	}
}
