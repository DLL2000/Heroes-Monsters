public class Monster
{
    private int health;
    private int speed;
    private int attack;
    private int xLocation;
    private int yLocation;
    private boolean invisible;
    public Monster()
    {
        health = (int)Math.ceil(Math.random() * 100);
        speed = (int)Math.floor(Math.random() * 4);
        attack = (int)Math.ceil(Math.random() * 30);
        xLocation = (int)(Math.random() * 9);
        yLocation = (int)(Math.random() * 9);
        invisible = true;
    }
    public void healthLoss(int damage)
    {
        health -= damage;
    }
    public int getX()
    {
        return xLocation;
    }
    public int getY()
    {
        return yLocation;
    }
    public void setX(int x)
    {
        xLocation = x;
    }
    public void setY(int y)
    {
        yLocation = y;
    }
    public int getHealth()
    {
        return health;
    }
    public int getAttack()
    {
        return attack;
    }
    public int getSpeed()
    {
        return speed;
    }
    public boolean getVisibility()
    {
        return invisible;
    }
    public void setVisibility(boolean visible)
    {
        invisible = visible;
    }
}
