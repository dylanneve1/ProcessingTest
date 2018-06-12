import processing.core.*;

public class Circle {
	PApplet parent;
	int x = 250;
	int y = 250;
	
	Circle(PApplet p) {
		parent = p;
	}
	
	void caller()
	{
		show();
	}
	
	void show()
	{
		parent.fill(255);
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
		}
	}
}
