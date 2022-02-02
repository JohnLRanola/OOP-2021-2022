package ie.tudublin;

public class Main
{
    public static void helloProcessing()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new HelloProcessing());
    }

    public void cat()
    {
        System.out.println("Hello world");

        Animal misty = new Animal("Misty");
        Animal lucy = new Animal("Lucy");

        lucy = misty;
        misty.setName("Tara");

        System.out.println(misty);
        System.out.println(lucy);

        Cat cat = new Cat("Ginger");

<<<<<<< HEAD
        while(cat.getNumLives() > 0 )
=======
        while(cat.getNumLives() > 0)
>>>>>>> f48aec3078eb59df87cccb1b9fae4670b81401f3
        {
            cat.kill();
        }
        cat.kill();

<<<<<<< HEAD
=======
    }
    public static void main(String[] args)
    {
        helloProcessing();

>>>>>>> f48aec3078eb59df87cccb1b9fae4670b81401f3
        // Tara Misty
        // Tara Tara
        
    }
}