import processing.core.*;

public class ProcessingTest extends PApplet
{
	
	public static void main(String[] args)
	{
        PApplet.main("ProcessingTest");
    }

	Circle c;
	
    public void settings()
    {
    	size(500, 500);
    }

    public void setup()
    {
    	c = new Circle(this);
    }

    public void draw()
    {
    	background(0);
    	c.caller();
    }
}