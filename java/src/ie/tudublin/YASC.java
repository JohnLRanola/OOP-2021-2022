package ie.tudublin;

import processing.core.PApplet;

public class YASC extends PApplet
{

   Player p;
   Player p1;


    public void setup()
    {
        p = new Player(100, 100, 50, this);
        p1 = new Player(200, 200, 100, this);
    }

    public void settings()
    {
        size(500,500);
    }

    public void draw()
    {
        background(0);

        p.render();
        p.update();
        p1.render();
        p1.update();	
    }    
}