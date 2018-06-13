import processing.core.*;

public class Circle {
	PApplet parent;
	int x = 250;
	int y = 250;
	
	float r = 255;
	float g = 255;
	float b = 255;
	
	double gravity = 0.4;
	double yspeed = 3;
	double xspeed = 3;
	
	Circle(PApplet p) {
		parent = p;
	}
	
	public void caller()
	{
		show();
		gravity();
		collision();
		move();
	}
	
	private void move()
	{
		x += xspeed;
		y += yspeed;
	}
	
	private void show()
	{
		parent.fill(r, g, b);
		parent.ellipse(x, y, 50, 50);
	}
	
	private void gravity()
	{
		yspeed += gravity;
		if(yspeed >= 30) {
			yspeed = 3;
		}
	}
	
	private void collision()
	{
		if(x <= 0) {
			xspeed *= -1;
			r = parent.random(0, 255);
			g = parent.random(0, 255);
			b = parent.random(0, 255);
		}
		if(x >= 500) {
			xspeed *= -1;
			r = parent.random(0, 255);
			g = parent.random(0, 255);
			b = parent.random(0, 255);
		}
		if(y <= 0) {
			yspeed *= -1;
			r = parent.random(0, 255);
			g = parent.random(0, 255);
			b = parent.random(0, 255);
		}
		if(y >= 500) {
			yspeed *= -1;
			r = parent.random(0, 255);
			g = parent.random(0, 255);
			b = parent.random(0, 255);
		}
	}
}
