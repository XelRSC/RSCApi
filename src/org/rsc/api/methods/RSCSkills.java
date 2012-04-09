package org.rsc.api.methods;
import org.powerbot.game.api.methods.tab.Skills;
/**
 * @author Xel
 *
 */

public enum RSCSkills {
	ATTACK(0),
	DEFENSE(1),
	STRENGTH(2),
	HITPOINTS(3),
	RANGE(4),
	PRAYER(5),
	MAGIC(6),
	COOKING(7),
	WOODCUTTING(8),
	FLETCHING(9),
	FISHING(10),
	FIREMAKING(11),
	CRAFTING(12),
	SMITHING(13),
	MINING(14),
	HERBLORE(15),
	AGILITY(16),
	THIEVING(17),
	SLAYER(18),
	FARMING(19),
	RUNECRAFTING(20),
	HUNTER(21),
	CONSTRUCTION(22),
	SUMMONING(23),
	DUNGEONEERING(24);

	
	private int id;
	RSCSkills(int id) {
	this.id = id;
	}
	public int getId() {
		return id;
	}
		/**
		 * @return Current skill level
		 */
		public int getLevel() {
		return Skills.getLevels()[id];
	}
		/**
		 * @return Current skill experience
		 */
		public int getXp() {
		return Skills.getExperiences()[id];
		}
		/**
		 * @return Xp required for next level
		 */
		public int getXpToLvl(){
			int i = Skills.getLevels()[id] + 1;
			return Skills.getExperienceRequired(i) - Skills.getExperiences()[id];
		}
		/**
		 * @param startxp Skill starting xp
		 * @return Skill experience gained
		 */
		public int getXpGained(int startxp){
			return Skills.getExperiences()[id] - startxp;
		}
		
		}
