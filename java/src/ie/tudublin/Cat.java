package ie.tudublin;

public class Cat extends Animal
{
    private int numLives;

    public void kill()
    {
        if(numLives > 0 )
        {
            System.out.println("Ouch!");
            numLives --;
        }
        else
        {
            System.out.println("I'm Dead!");
        }
    }
    
    public Cat(String name)
    {
        super(name);

    }

    public int getNumLives() {
        return numLives;
    }

    public void setNumLives(int numLives) {
        this.numLives = numLives;
    }
}