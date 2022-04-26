<<<<<<< HEAD
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
=======
package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;

public class YASC extends PApplet
{

    Player p;
    Player p1;
    Health h;

    ArrayList<GameObject> gameObjects = new ArrayList<GameObject>();


    public void setup()
    {
        p = new Player(250, 250, 50, this);
        p1 = new Player(50, 50, 100, this);
        h = new Health(50, this);
    }

    public void settings()
    {
        size(500,500);
    }

    public void draw()
    {
        background(0);
        p.update();        
        p.render();
        
        p1.update();
        p1.render();

        h.update();
        h.render();

        for(GameObject go: gameObjects)
        {
            go.update();
            go.render();
        }
    }    
}
>>>>>>> 74741885e9318c670d6be4ad6557aea130c7cd11
