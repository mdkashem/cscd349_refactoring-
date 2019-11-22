package Dungeon;

/**
 * Title:
 * Description:
 * Copyright:    Copyright (c) 2001
 * Company:
 * @author
 * @version 1.0
 */

public class Gremlin extends Monster
{

	private static String name="Gnarltooth the Gremlin"; 
	private static int hitPoints =70; 
	private static int attackSpeed =5;
	private static double chanceToHit=.8; 
	private static double chanceToHeal = .4;
	private static int damageMin=15; 
	private static int damageMax=13;
	private static int minHeal = 20;
	private static int maxHeal = 40;
	
	private List<Integer> intStats = new arrayList<Integer>();
	
	intStats.add(hitpoints);
	intStats.add(attackSpeed);
	intStats.add(damageMin);
	intStats.add(damageMax);
	
    public Gremlin()
	{
		super(name, intStats, chanceToHit, chanceToHeal, minHeal, maxHeal);

    }//end constructor

	public void attack(DungeonCharacter opponent)
	{
		System.out.println(name + " jabs his kris at " +
							opponent.getName() + ":");
		super.attack(opponent);

	}//end override of attack


}//end class Gremlin