public class Hero
{
    private int health;
    private int xLocation;
    private int yLocation;
    private Weapon weapon;
    private int potion;
    private double armor;
    public Hero()
    {
        health = 100;
        xLocation = 9;
        yLocation = 0;
        weapon = new Weapon(10, 30);
        armor = 0;
        potion = 0;
    }
    public Weapon getWeapon()
    {
        return weapon;
    }
    public Weapon foundSword(Weapon sword)
    {
        weapon = sword;
        return weapon;
    }
    public int getHealth()
    {
        return health;
    }
    public int setPotion()
    {
        return potion++;
    }
    public int getPotion()
    {
        return potion;
    }
    public double getArmor()
    {
        return armor;
    }
    public void foundArmor()
    {
        armor++;
    }
    public void healthLoss(int damage)
    {
        health -= damage;
    }
    public void heal(int heal)
    {
        health = heal;
    }
    public void foundPotion()
    {
        potion++;
    }
    public int getX()
    {
        return xLocation;
    }
    public int getY()
    {
        return yLocation;
    }
    public int setX(int xPos)
    {
        xLocation = xLocation + xPos;
        return xLocation;
    }
    public int setY(int yPos)
    {
        yLocation = yLocation + yPos;
        return yLocation;
    }
        public int placeX(int xPos)
    {
        xLocation = xPos;
        return xLocation;
    }
    public int placeY(int yPos)
    {
        yLocation = yPos;
        return yLocation;
    }
    public boolean move(String input)
    {
        input = input.toLowerCase();
        boolean valid_move = false;
        int heal;
        if(input.equals("d"))
        {
            setY(1);
            if(yLocation > 9)
            {
                System.out.println("Error! Hero can not go off the map. Choose a valid direction (ASDW): ");
                setY(-1);
            }
            else
            {
                valid_move = true;
            }
        }
        else if(input.equals("s"))
        {
            setX(1);
            if(xLocation > 9)
            {
                System.out.println("Error! Hero can not go off the map. Choose a valid direction (ASDW): ");
                setX(-1);
            }
            else
            {
                valid_move = true;
            }
        }
        else if(input.equals("a"))
        {
            setY(-1);
            if(yLocation < 0)
            {
                System.out.println("Error! Hero can not go off the map. Choose a valid direction (ASDW): ");
                setY(1);
            }
            else
            {
                valid_move = true;
            }
        }
        else if(input.equals("w"))
        {
            setX(-1);
            if(xLocation < 0)
            {
                System.out.println("Error! Hero can not go off the map. Choose a valid direction (ASDW): ");
                setX(1);
            }
            else
            {
                valid_move = true;
            }
        }
        else if(input.equals("potion"))
        {
            if(potion == 0)
            {
                System.out.println("Error! You have no more potions.");
            }
            else if(potion > 0)
            {
                heal = 100 - health;
                heal += health;
                heal(heal);
                potion--;
                System.out.println("The potion healed you to full health.");
            }
            else if(getHealth() == 100)
            {
                System.out.println("You are already at full health.");
            }
        }
        else
        {
            System.out.println("Error! Choose a direction (ASDW): ");
        }
        return valid_move;
    }
}
