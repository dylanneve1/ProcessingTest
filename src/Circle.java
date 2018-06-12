import processing.core.*;

public class Circle {
	PApplet parent;
	int x = 250;
	int y = 250;
	
	float r = 255;
	float g = 255;
	float b = 255;
	
	Circle(PApplet p) {
		parent = p;
	}
	
	void caller()
	{
		show();
	}
	
	void show()
	{
		parent.fill(r, g, b);
		parent.ellipse(x, y, 50, 50);
		if(parent.keyPressed == true) {
			if(parent.key == 'a') {
				x -= 5;
			}
			if(parent.key == 'd') {
				x += 5;
			}
			if(parent.key == 's') {
				y += 5;
			}
			if(parent.key == 'w') {
				y -= 5;
			}
			if(parent.key == 'r') {
				r = parent.random(0, 255);
				g = parent.random(0, 255);
				b = parent.random(0, 255);
			}
		}
	}
}
