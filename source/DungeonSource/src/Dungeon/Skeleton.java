package Dungeon;

/**
 * Title:
 * Description:
 * Copyright:    Copyright (c) 2001
 * Company:
 * @author
 * @version 1.0
 */

public class Skeleton extends Monster
{
	
	private static String name="Sargath the Skeleton"; 
	private static int hitPoints =100; 
	private static int attackSpeed =3;
	private static double chanceToHit=.8; 
	private static double chanceToHeal = .3;
	private static int damageMin=30; 
	private static int damageMax=50;
	private static int minHeal = 30;
	private static int maxHeal = 50;
	
private List<Integer> intStats = new arrayList<Integer>();
	
	intStats.add(hitpoints);
	intStats.add(attackSpeed);
	intStats.add(damageMin);
	intStats.add(damageMax);

    public Skeleton()
	{
		super(name, intStats, chanceToHit, chanceToHeal, minHeal, maxHeal);

    }//end constructor

	public void attack(DungeonCharacter opponent)
	{
		System.out.println(name + " slices his rusty blade at " +
							opponent.getName() + ":");
		super.attack(opponent);

	}//end override of attack


}//end class Skeleton