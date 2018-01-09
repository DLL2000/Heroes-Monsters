public class Farmer
{
   private int xLocation;
   private int yLocation;
   private int farmer_number;
   private boolean treasure;
   private boolean invisible;
   private int found;
   public Farmer()
   {
       xLocation = (int)(Math.random() * 9);
       yLocation = (int)(Math.random() * 9);
       farmer_number = 0;
       treasure = true;
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
   public void setFarmerType(int num)
   {
       farmer_number = num;
   }
   public int getFarmerType()
   {
       return farmer_number;
   }
   public boolean getTreasure()
   {
       return treasure;
   }
   public void setTreasure(boolean item)
   {
       treasure = item;
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