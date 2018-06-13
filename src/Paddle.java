import processing.core.*;

public class Paddle {
	PApplet parent;
	
	float x = 30;
	float y = 250;
	
	Paddle(PApplet p) {
		parent = p;
	}
	
	void caller() {
		show();
		move();
	}
	
	void show() {
		parent.fill(255);
		parent.noStroke();
		parent.rectMode(3);
		parent.rect(x, y, 30, 100);
	}
	
	void move() {
		if(parent.keyPressed == true) {
			if(parent.key == 's') {
				y += 10;
			}
			if(parent.key == 'w') {
				y -= 10;
			}
		}
	}
}
