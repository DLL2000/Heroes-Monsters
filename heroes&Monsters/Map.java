public class Map
{
   public static void printMap(Object[][] map, Hero h)
   {
       int hero_x = 0;
       int hero_y = 0;
       for(int i = 0; i < 10; i++)
       {
           for(int j = 0; j < 10; j++)
           {
               if(map[i][j] == null)
               {
                   System.out.print("0 ");
               }
               else if (map[i][j] instanceof Hero)
               {
                   System.out.print("H ");
                   hero_x = i;
                   hero_y = j;
               }
               else if(map[i][j] instanceof Monster == true)
               {
                   Monster m = (Monster)map[i][j];
                   if(m.getVisibility() == true)
                   {
                       System.out.print("0 ");
                   }
                   else if(m.getVisibility() == false)
                   {
                       System.out.print("M ");
                   }
               }
               else if (map[i][j] instanceof Potion == true)
               {
                   Potion p = (Potion)map[i][j];
                   if(p.getVisibility() == true)
                   {
                       System.out.print("0 ");
                   }
                   else if(p.getVisibility() == false)
                   {
                       System.out.print("P ");
                   }
               }
               else if (map[i][j] instanceof Farmer == true)
               {
                   Farmer f = (Farmer)map[i][j];
                   if(f.getVisibility() == true)
                   {
                       System.out.print("0 ");
                   }
                   else if(f.getVisibility() == false)
                   {
                       System.out.print("F ");
                   }
               }
               else 
               { 
                   System.out.print("? ");
               }
           }
           System.out.println();
       }
   }
}

