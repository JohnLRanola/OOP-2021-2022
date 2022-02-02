package ie.tudublin;

public class Cat extends Animal
{
    private int numLives;

    public void kill()
    {
<<<<<<< HEAD
        if(numLives > 0 )
=======
        if (numLives > 0)
>>>>>>> f48aec3078eb59df87cccb1b9fae4670b81401f3
        {
            System.out.println("Ouch!");
            numLives --;
        }
        else
        {
<<<<<<< HEAD
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
=======
            System.out.println("Im dead");
        }
    }

    
    public int getNumLives() {
        return numLives;
    }


    public void setNumLives(int numLives) {
        this.numLives = numLives;
    }


    public Cat(String name)
    {
        super(name);
        numLives = 9;
>>>>>>> f48aec3078eb59df87cccb1b9fae4670b81401f3
    }
}