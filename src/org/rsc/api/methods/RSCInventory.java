package org.rsc.api.methods;

import org.powerbot.game.api.methods.tab.Inventory;
import org.powerbot.game.api.util.Time;
import org.powerbot.game.api.wrappers.node.Item;

public class RSCInventory {
	public int getInvCount(){
		return Inventory.getCount();
	}
	
	public boolean isInvFull(){
		if (getInvCount() == 28){
			return true;
		}
		return false;
	}
	
	/**
	 * @param itemId Item id, 0 for all items
	 */
	public void dropItem(int itemId){
		Item[] drop = Inventory.getItems();	
		for (int i = 0 ; i < drop.length ; i++){
			if (drop[i].getId() == itemId && itemId != 0){
			drop[i].getWidgetChild().interact("drop");
			Time.sleep(500);
			}
			if (itemId == 0){
				drop[i].getWidgetChild().interact("drop");
				Time.sleep(500);
			}
		}	
	}
}