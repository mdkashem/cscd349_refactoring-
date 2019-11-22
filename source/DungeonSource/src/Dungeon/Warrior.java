package Dungeon;

/**
 * Title:
 * Description:
 * Copyright:    Copyright (c) 2001
 * Company:
 * @author
 * @version 1.0
 */




public class Warrior extends Hero
{

	private static String name = "Warrior";
	private static int hitpoints = 125;
	private static int attackSpeed = 4;    	
	private static int damageMin = 35;
	private static int damageMax = 60;
	private static double chanceToHit = .8;
	private static double chanceToBlock = .2;
	
	private List<Integer> intStats = new arrayList<Integer>();
	
	intStats.add(hitpoints);
	intStats.add(attackSpeed);
	intStats.add(damageMin);
	intStats.add(damageMax);
	
    public Warrior()
	{    	    			
		super(name, intStats, chanceToHit, chanceToBlock);


    }//end constructor


	public void crushingBlow(DungeonCharacter opponent)
	{
		if (Math.random() <= .4)
		{
			int blowPoints = (int)(Math.random() * 76) + 100;
			System.out.println(name + " lands a CRUSHING BLOW for " + blowPoints
								+ " damage!");
			opponent.subtractHitPoints(blowPoints);
		}//end blow succeeded
		else
		{
			System.out.println(name + " failed to land a crushing blow");
			System.out.println();
		}//blow failed

	}//end crushingBlow method

	public void attack(DungeonCharacter opponent)
	{
		System.out.println(name + " swings a mighty sword at " +
							opponent.getName() + ":");
		super.attack(opponent);
	}//end override of attack method




    public void battleChoices(DungeonCharacter opponent)
	{
		int choice;
		super.battleChoices(opponent);
		Scanner kin = new Scanner(System.in);

		do
		{
		    System.out.println("1. Attack Opponent");
		    System.out.println("2. Crushing Blow on Opponent");
		    System.out.print("Choose an option: ");
		    choice = kin.nextInt();

		    switch (choice)
		    {
			    case 1: attack(opponent);
			        break;
			    case 2: crushingBlow(opponent);
			        break;
			    default:
			        System.out.println("invalid choice!");
		    }//end switch

			numTurns--;
			if (numTurns > 0)
			    System.out.println("Number of turns remaining is: " + numTurns);

		} while(numTurns > 0);

    }//end battleChoices method

}//end Hero class