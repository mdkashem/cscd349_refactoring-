package Dungeon;

/**
 * Title:
 * Description:
 * Copyright:    Copyright (c) 2001
 * Company:
 * @author
 * @version 1.0
 */

public class Ogre extends Monster
{
	
	private static String name="Oscar the Ogre"; 
	private static int hitPoints =200; 
	private static int attackSpeed =2;
	private static double chanceToHit=.6; 
	private static double chanceToHeal = .1;
	private static int damageMin=30; 
	private static int damageMax=50;
	private static int minHeal = 30;
	private static int maxHeal = 50;
	
	private List<Integer> intStats = new arrayList<Integer>();
	
	intStats.add(hitpoints);
	intStats.add(attackSpeed);
	intStats.add(damageMin);
	intStats.add(damageMax);

    public Ogre()
	{
		super(name, intStats, chanceToHit, chanceToHeal, minHeal, maxHeal);


    }//end constructor

	public void attack(DungeonCharacter opponent)
	{
		System.out.println(name + " slowly swings a club toward's " +
							opponent.getName() + ":");
		super.attack(opponent);

	}//end override of attack


}//end Monster class