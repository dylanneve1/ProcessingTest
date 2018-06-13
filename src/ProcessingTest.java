import processing.core.*;

public class ProcessingTest extends PApplet
{
	
	public static void main(String[] args)
	{
        PApplet.main("ProcessingTest");
    }

	Paddle p;
	Circle c;
	
    public void settings()
    {
    	size(500, 500);
    }

    public void setup()
    {
    	frameRate(120);
    	p = new Paddle(this);
    	c = new Circle(this);
    }

    public void draw()
    {
    	background(0);
    	p.caller();
    	c.caller();
    }
}