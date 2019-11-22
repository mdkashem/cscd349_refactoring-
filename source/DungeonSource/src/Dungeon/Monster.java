package Dungeon;

/**
 * Title:
 * Description:
 * Copyright:    Copyright (c) 2001
 * Company:
 * @author
 * @version 1.0
 */


public abstract class Monster extends DungeonCharacter
{
	private double chanceToHeal;
	private int minHeal, maxHeal;

//-----------------------------------------------------------------
  public Monster(String name, List<Integer> intStats,  double chanceToHit, double chanceToHeal, int minHeal, int maxHeal)
  {
	super(name, intStats, chanceToHit);
	this.chanceToHeal = chanceToHeal;
	this.maxHeal = maxHeal;
	this.minHeal = minHeal;

  }//end monster construcotr

//-----------------------------------------------------------------
  public void heal()
  {
	boolean canHeal;
	int healPoints;

	canHeal = (Math.random() <= chanceToHeal) && (hitPoints > 0);

	if (canHeal)
	{
		healPoints = (int)(Math.random() * (maxHeal - minHeal + 1)) + minHeal;
		addHitPoints(healPoints);
		System.out.println(name + " healed itself for " + healPoints + " points.\n"
							+ "Total hit points remaining are: " + hitPoints);
		System.out.println();
	}//end can heal


  }//end heal method

//-----------------------------------------------------------------
 public void subtractHitPoints(int hitPoints)
 {
		super.subtractHitPoints(hitPoints);
		heal();

 }//end method


}//end Monster class