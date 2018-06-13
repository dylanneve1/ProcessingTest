import processing.core.*;

public class Circle {
	PApplet parent;
	int x = 250;
	int y = 250;
	
	double yspeed = 2;
	double xspeed = 5;
	
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
		parent.noStroke();
		parent.fill(150);
		parent.ellipse(x, y, 50, 50);
	}
	
	private void gravity()
	{
		if(yspeed >= 30) {
			yspeed = 3;
		}
	}
	
	private void collision()
	{
		if(x <= 0) {
			xspeed *= -1;
		}
		if(x >= 500) {
			xspeed *= -1;
		}
		if(y <= 0) {
			yspeed *= -1;
		}
		if(y >= 500) {
			yspeed *= -1;
		}
	}
}
