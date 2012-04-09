package org.rsc.api.methods;

import org.powerbot.game.api.methods.interactive.Players;
import org.powerbot.game.api.wrappers.Tile;

/**
 * Player status information
 * @author Xel
 *
 */

public class RSCPlayer {
	
	/**
	 * @param i Health percentage
	 * @return true if player health % < health
	 */
	public static boolean healthBelow(int i){
		if(Players.getLocal().getHpPercent() < i){
			return true;
		}
		return false;
	}
	/**
	 * @return true if idle
	 */
	public static boolean isIdle(){
		if (Players.getLocal().getAnimation() == -1){
			return true;
		}
		return false;
	}
	
	/**
	 * @return player location as tile
	 */
	public static Tile playerLoc(){
		return Players.getLocal().getPosition();
	}
	
	/**
	 * @return true if is in combat
	 */
	public static boolean isInCombat(){
		if (Players.getLocal().isInCombat()){
			return true;
		}
		return false;
	}
	/**
	 * @return player animation
	 */
	public static  int playerAnim(){
		return Players.getLocal().getAnimation();
	}
	
	
	
	

}
