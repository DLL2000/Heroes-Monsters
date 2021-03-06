public class Weapon
{
   private int minDamage;
   private int maxDamage;
   private int xLocation;
   private int yLocation;
   private int damage;
   public Weapon(int min, int max)
   {
       minDamage = min;
       maxDamage = max;
   }
   public int getDamage()
   {
       return damage;
   }
   public int setDamage()
   {
       damage = (int)(Math.random() * (maxDamage - minDamage + 1)) + minDamage;
       return damage;
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
   public int getMax()
   {
       return maxDamage;
   }
   public int getMin()
   {
       return minDamage;
   }
}
