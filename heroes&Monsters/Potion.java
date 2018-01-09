public class Potion
{
    int heal;
    int xLocation;
    int yLocation;
    private int findPotion = 0;
    private boolean invisible;
    private int found;
    public Potion()
    {
        heal = 100;
        xLocation = (int)(Math.random() * 9);
        yLocation = (int)(Math.random() * 9);
        invisible = true;
        found = 1;
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
    public boolean getVisibility()
    {
        return invisible;
    }
    public void setVisibility(boolean visible)
    {
        invisible = visible;
    }
    public void found()
    {
        found = 0;
    }
    public int getFound()
    {
        return found;
    }
}
