import java.util.List;
import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;
public class Tester
{
   public static void main(String args[])
   {
       Object[][] map = new Object[10][10];
       int x = 0;
       int y = 0;
       Hero hero = new Hero();
       map[hero.getX()][hero.getY()] = hero;
       Armor armor = new Armor();
       int monsterAmount = 0;
       int findPotion = 0;
       int findFarmer = 0;
       Potion potion1 = new Potion();
       if(map[potion1.getX()][potion1.getY()] != null)
       {
           while(map[potion1.getX()][potion1.getY()] != null)
           {
               x = (int)(Math.random() * 9);
               y = (int)(Math.random() * 9);
               potion1.setX(x);
               potion1.setY(y);
               map[potion1.getX()][potion1.getY()] = potion1;
           }
       }
       else
       {
           map[potion1.getX()][potion1.getY()] = potion1;
       }
       Potion potion2 = new Potion();
       if(map[potion2.getX()][potion2.getY()] != null)
       {
           while(map[potion2.getX()][potion2.getY()] != null)
           {
               x = (int)(Math.random() * 9);
               y = (int)(Math.random() * 9);
               potion2.setX(x);
               potion2.setY(y);
               map[potion2.getX()][potion2.getY()] = potion2;
           }
       }
       else
       {
           map[potion2.getX()][potion2.getY()] = potion2;
       }
       Farmer farmer1 = new Farmer();           
       farmer1.setFarmerType(1);
       if(map[farmer1.getX()][farmer1.getY()] != null)
       {
           while(map[farmer1.getX()][farmer1.getY()] != null)
           {
               x = (int)(Math.random() * 9);
               y = (int)(Math.random() * 9);
               farmer1.setX(x);
               farmer1.setY(y);
               farmer1.setTreasure(true);
               map[farmer1.getX()][farmer1.getY()] = farmer1;
           }
       }
       else
       {
           map[farmer1.getX()][farmer1.getY()] = farmer1;
       }
       Farmer farmer2 = new Farmer();
       farmer2.setFarmerType(2);
       if(map[farmer2.getX()][farmer2.getY()] != null)
       {
           while(map[farmer2.getX()][farmer2.getY()] != null)
           {
               x = (int)(Math.random() * 9);
               y = (int)(Math.random() * 9);
               farmer2.setX(x);
               farmer2.setY(y);
               farmer2.setTreasure(true);
               map[farmer2.getX()][farmer2.getY()] = farmer2;
           }
       }
       else
       {
           map[farmer2.getX()][farmer2.getY()] = farmer2;
       }
       Weapon sword = new Weapon(20, 50);
       Monster monster1 = new Monster();
       if(map[monster1.getX()][monster1.getY()] != null)
       {
           while(map[monster1.getX()][monster1.getY()] != null)
           {
               x = (int)(Math.random() * 9);
               y = (int)(Math.random() * 9);
               monster1.setX(x);
               monster1.setY(y);
               map[monster1.getX()][monster1.getY()] = monster1;
           }
       }
       else
       {
           map[monster1.getX()][monster1.getY()] = monster1;
       }
       Monster monster2 = new Monster();
       if(map[monster2.getX()][monster2.getY()] != null)
       {
           while(map[monster2.getX()][monster2.getY()] != null)
           {
               x = (int)(Math.random() * 9);
               y = (int)(Math.random() * 9);
               monster2.setX(x);
               monster2.setY(y);
               map[monster2.getX()][monster2.getY()] = monster2;
           }
       }
       else
       {
           map[monster2.getX()][monster2.getY()] = monster2;
       }
       Monster monster3 = new Monster();
       if(map[monster3.getX()][monster3.getY()] != null)
       {
           while(map[monster3.getX()][monster3.getY()] != null)
           {
               x = (int)(Math.random() * 9);
               y = (int)(Math.random() * 9);
               monster3.setX(x);
               monster3.setY(y);
               map[monster3.getX()][monster3.getY()] = monster3;
           }
       }
       else
       {
           map[monster3.getX()][monster3.getY()] = monster3;
       }
       Monster monster4 = new Monster();
       if(map[monster4.getX()][monster4.getY()] != null)
       {
           while(map[monster4.getX()][monster4.getY()] != null)
           {
               x = (int)(Math.random() * 9);
               y = (int)(Math.random() * 9);
               monster4.setX(x);
               monster4.setY(y);
               map[monster4.getX()][monster4.getY()] = monster4;
           }
       }
       else
       {
           map[monster4.getX()][monster4.getY()] = monster4;
       }
       Monster monster5 = new Monster();
       if(map[monster5.getX()][monster5.getY()] != null)
       {
           while(map[monster5.getX()][monster5.getY()] != null)
           {
               x = (int)(Math.random() * 9);
               y = (int)(Math.random() * 9);
               monster5.setX(x);
               monster5.setY(y);
               map[monster5.getX()][monster5.getY()] = monster5;
           }
       }
       else
       {
           map[monster5.getX()][monster5.getY()] = monster5;
       }
       Monster monster6 = new Monster();     
       if(map[monster6.getX()][monster6.getY()] != null)
       {
           while(map[monster6.getX()][monster6.getY()] != null)
           {
               x = (int)(Math.random() * 9);
               y = (int)(Math.random() * 9);
               monster6.setX(x);
               monster6.setY(y);
               map[monster6.getX()][monster6.getY()] = monster6;
           }
       }
       else
       {
           map[monster6.getX()][monster6.getY()] = monster6;
       }
       System.out.println("Welcome to Hero & Monsters!");
       Map.printMap(map, hero);
       monsterAmount = 6;
       findPotion = 2;
       findFarmer = 2;
       
       boolean game;
       boolean correct;
       boolean fight;
       String input;
       int old_hero_xpos;
       int old_hero_ypos;
       int run = 0;
       
       game = true;
       fight = true;
       while(game)
       {
           if(hero.getPotion() == 0)
           {
               System.out.println("Where do you want to move? (ASDW): ");
           }
           else if(hero.getPotion() > 0)
           {
               System.out.println("What do you want to do? (ASDW || Potion): ");
           }
           Scanner choice = new Scanner(System.in);
           input = choice.nextLine(); 
           old_hero_xpos = hero.getX();
           old_hero_ypos = hero.getY();
           if((hero.move(input) == true) && (monsterAmount >= 0) || (findPotion >= 0) || (findFarmer >= 0))
           {
               map[old_hero_xpos][old_hero_ypos] = null;
               Object mapObject = check(hero.getX(), hero.getY(), map, hero, monsterAmount);
               if(hero.getHealth() <= 0)
               {
                   game = false;
               }               
               if(mapObject == hero) 
               { 
                   --monsterAmount;
                   mapObject = null;
               } 
               if(mapObject == null)
               {
                  map[hero.getX()][hero.getY()] = hero;
               }
               else
               {
                  hero.placeX(old_hero_xpos);
                  hero.placeY(old_hero_ypos);
                  map[hero.getX()][hero.getY()] = hero;
               }
           }
           if(search(monsterAmount, potion1.getFound(), potion2.getFound(), farmer1.getFound(), farmer2.getFound()) == true)
           {
               System.out.println("Find the remaining items:");
               if(potion1.getFound() != 0)
               {
                   System.out.println("Potion: (" + potion1.getX() + ", " + potion1.getY() + ")");
               }
               if(potion2.getFound() != 0)
               {
                   System.out.println("Potion: (" + potion2.getX() + ", " + potion2.getY() + ")");;
               }
               if(farmer1.getFound() != 0)
               {
                   System.out.println("Farmer: (" + farmer1.getX() + ", " + farmer1.getY() + ")");;
               }
               if(farmer2.getFound() != 0)
               {
                   System.out.println("Farmer: (" + farmer2.getX() + ", " + farmer2.getY() + ")");;
               }
               System.out.println("Hero Position: (" + hero.getX() + ", " + hero.getY() + ")"); 
           }
           Map.printMap(map, hero);
           if(checkEnd(monsterAmount, potion1.getFound(), potion2.getFound(), farmer1.getFound(), farmer2.getFound()) == true)
           {
               System.out.println("You have finished the game!");
               game = false;
           }
       }
   }
   public static Object check(int x, int y, Object[][] map, Hero h, int monsterAmount)
   {
       Object mapObject = new Object();
       Weapon sword = new Weapon(20, 50);
       Armor a = new Armor();
       String input;
       int checkResult = 0;
       if(((h.getX() >= 0) && (h.getX() < 10)) && ((h.getY() >= 0) && (h.getY() < 10)))
       {
           if(map[x][y] instanceof Monster == true)
           {
               Monster m = (Monster)map[x][y];
               m.setVisibility(false);
               if(m.getHealth() > 0)
               {
                   System.out.println("You have encountered a monster!");
               }
               if(foundMon(h, m, a) != 1) 
               {
                  mapObject = m;
               }
               else
               {                  
                  mapObject = h;
               }
           }
           else if(map[x][y] instanceof Potion == true)
           {
               Potion p = (Potion)map[x][y];
               p.setVisibility(false);
               addPotion(h, p);
               p.found();
               mapObject = null;
           }
           else if(map[x][y] instanceof Farmer == true)
           {
               Farmer f = (Farmer)map[x][y];
               f.setVisibility(false);
               checkResult = foundFarmer(h, f);
               if(checkResult == 1)
               {
                   if(f.getTreasure() == true)
                   {
                       if(monsterAmount > 4) 
                       {
                           System.out.println("Farmer: If you defeat 2 monsters, you can have my armor.");
                       }
                       else
                       {
                           System.out.println("Farmer: You have defeated the monsters and are worthy of my armor, hero!");
                           System.out.println("Hero now takes 1/3 less damage.");
                           h.foundArmor();
                           f.found();
                           f.setTreasure(false);
                       }
                   }
                   else if(f.getTreasure() == false)
                   {
                       System.out.println("Farmer: Defeat the rest of the monsters, hero.");
                   }
               }
               if(checkResult == 2)
               {
                   if(f.getTreasure() == true)
                   {
                       if(monsterAmount > 2) 
                       {
                           System.out.println("Farmer: If you defeat 4 monsters, you can have my sword.");
                       }
                       else
                       {
                           System.out.println("Farmer: You have defeated the monsters and are worthy of my sword, hero!");
                           System.out.println("Hero's damage now has a range of 20-50.");
                           h.foundSword(sword);
                           f.found();
                           f.setTreasure(false);
                       }
                   }
                   else if(f.getTreasure() == false)
                   {
                       System.out.println("Farmer: Defeat the rest of the monsters, hero.");
                   }
               }
               mapObject = f;
           }
           else
           {
               mapObject = null;
           }
       }
       return mapObject;
   } 
   public static int foundMon(Hero h, Monster m, Armor a)
   { 
       int fightOutcome = 0; 
       int run = 0;
       int actionResult = 0;
       boolean continueFight = true;
       while(continueFight == true)
       {
           actionResult = action(h, m, a);
           if(actionResult == 0)
           {
               fightOutcome = 0;
               continueFight = false;
           }
           else if(actionResult == 1)
           { 
               fightOutcome = 1;
               continueFight = false;
           }
           else if(actionResult == 2)
           { 
               fightOutcome = 2;
               continueFight = false;
           }
           else if (actionResult == 3)
           {
               continueFight = true;
           }
       }
       return fightOutcome;
   }
   public static int action(Hero h, Monster m, Armor a)
   {
       int action = 0;
       boolean fight = true;
       int actionResult = 0;
       if((h.getX() == m.getX()) && (h.getY() == m.getY()) && h.getHealth() > 0)
       {
           System.out.println("Hero's health: " + h.getHealth());
           System.out.println("Monster's health: " + m.getHealth());
           System.out.println("Monster's attack: " + m.getAttack());
           System.out.println("Monster's speed: " + m.getSpeed());
           System.out.println("What will you do? (Fight || Run): ");
           Scanner encounter = new Scanner(System.in);
           String battle = encounter.nextLine();
           battle = battle.toLowerCase();
           if(battle.equals("fight"))
           {
               actionResult = attack(h, m, a);
               if(actionResult == 0)
               {
                   action = 0;
                   fight = false;
               }
               else if(actionResult == 1)
               {
                   action = 1;
                   fight = false;
               }
               else if(actionResult == 3)
               {
                   action = 3;
                   fight = true;
               }
           }
           else if(battle.equals("run"))
           {
               actionResult = run(h, m, a);
               if(actionResult == 0)
               {
                   action = 0;
                   fight = false;
               }
               else if(actionResult == 2)
               {
                   action = 2;
                   fight = false;
               }
               else if(actionResult == 3)
               {
                   action = 3;
                   fight = true;
               }
           }
           else
           {
               System.out.println("Input an action.");
               action = 3;
               fight = true;
           }
       }
       return action;
   }
   public static int attack(Hero h, Monster m, Armor a)
   {
       int attack = 0;
       m.healthLoss(h.getWeapon().setDamage());
       System.out.println("Monster's health: " + m.getHealth());
       System.out.println("Damage: " + (h.getWeapon().getDamage()));
       if(m.getHealth() <= 0 )
       {
           System.out.println("You have defeated the monster.");
           m.setX(-1);
           m.setY(-1);
           attack = 1;
       }
       if(m.getHealth() > 0)
       {
           if(h.getArmor() == 0)
           {
               h.healthLoss(m.getAttack());
               attack = 3;
           }
           else if(h.getArmor() > 0)
           {
               System.out.println("Your armor blocked some of the damage.");
               h.healthLoss((int)Math.ceil(m.getAttack() * 2 / 3));
               attack = 3;
           }
       }
       if(h.getHealth() <= 0)
       {
           System.out.println("You have died.");
       }
       return attack;
   }
   public static int run(Hero h, Monster m, Armor a)
   {
       int run = 0;
       int retreat = 0;
       retreat = (int)(Math.random() * 100);
       if(m.getSpeed() == 0)
       {
           if(retreat <= 75)
           {
               System.out.println("You successfully escaped.");
               run = 2;
           }
           else
           {
               System.out.println("You failed to escape.");
               if(h.getArmor() == 0)
               {
                   h.healthLoss(m.getAttack());
                   run = 3;
               }
               else if(h.getArmor() > 0)
               {
                   System.out.println("Your armor blocked some of the damage.");
                   h.healthLoss((int)Math.ceil(m.getAttack() * 2 / 3));
                   run = 3;
               }
               if(h.getHealth() <= 0)
               {
                   System.out.println("You have died.");
                   run = 0;
               }
           }
       }
       else if(m.getSpeed() == 1)
       {
           if(retreat <= 50)
           {
               System.out.println("You successfully escaped.");
               run = 2;
           }
           else
           {
               System.out.println("You failed to escape.");
               if(h.getArmor() == 0)
               {
                   h.healthLoss(m.getAttack());
                   run = 3;
               }
               else if(h.getArmor() > 0)
               {
                   System.out.println("Your armor blocked some of the damage.");
                   h.healthLoss((int)Math.ceil(m.getAttack() * 2 / 3));
                   run = 3;
               }
               if(h.getHealth() <= 0)
               {
                   System.out.println("You have died.");
                   run = 0;
               }
           }
       }
       else if(m.getSpeed() == 2)
       {
           if(retreat <= 25)
           {
               System.out.println("You successfully escaped.");
               run = 2;
           }
           else
           {
               System.out.println("You failed to escape.");
               if(h.getArmor() == 0)
               {
                   h.healthLoss(m.getAttack());
                   run = 3;
               }
               else if(h.getArmor() > 0)
               {
                   System.out.println("Your armor blocked some of the damage.");
                   h.healthLoss((int)Math.ceil(m.getAttack() * 2 / 3));
                   run = 3;
               }
               if(h.getHealth() <= 0)
               {
                   System.out.println("You have died.");
                   run = 0;
               }
           }
       }
       else if(m.getSpeed() == 3)
       {
           System.out.println("You cannot escape.");
           if(h.getArmor() == 0)
           {
               h.healthLoss(m.getAttack());
               run = 3;
           }
           else if(h.getArmor() > 0)
           {
               System.out.println("Your armor blocked some of the damage.");
               h.healthLoss((int)Math.ceil(m.getAttack() * 2 / 3));
               run = 3;
           }
           if(h.getHealth() <= 0)
           {
               System.out.println("You have died.");
               run = 0;
           }
       }
       return run;
   }
   public static void addPotion(Hero h, Potion p)
   {
       if((h.getX() == p.getX()) && (h.getY() == p.getY()))
       {
           h.foundPotion();
           System.out.println("You have found a potion.");
           p.setX(-1);
           p.setY(-1);
       }
   }
   public static int foundFarmer(Hero h, Farmer f)
   {
       int farmer = 0;
       if((h.getX() == f.getX()) && (h.getY() == f.getY())&& (f.getFarmerType() == 1))
       {
           farmer = 1;
       }
       else if((h.getX() == f.getX()) && (h.getY() == f.getY()) && (f.getFarmerType() == 2))
       {
           farmer = 2;
       }
       return farmer;
   }
   public static boolean search(int monsterAmount, int findPotion1, int findPotion2, int findFarmer1, int findFarmer2)
   {
       boolean find = false;
       if((monsterAmount == 0) && ((findPotion1 != 0) || (findPotion2 != 0) || (findFarmer1 != 0) || (findFarmer2 != 0)))
       {
           find = true;
       }
       return find;
   }
   public static boolean checkEnd(int monsterAmount, int findPotion1, int findPotion2, int findFarmer1, int findFarmer2)
   {
       boolean end = false;
       if((monsterAmount == 0) && (findPotion1 == 0) && (findPotion2 == 0) && (findFarmer1 == 0) && (findFarmer2 == 0))
       {
           end = true;
       }
       return end;
   }  
} 