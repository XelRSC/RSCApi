package org.rsc.api.methods.magic;

import org.powerbot.game.api.methods.Tabs;
import org.powerbot.game.api.methods.Widgets;
import org.powerbot.game.api.util.Time;
import org.powerbot.game.api.wrappers.widget.Widget;


/**
 * Handles spellbook teleports only.
 * For item teleporting use RSCInventory/RSCEquipment
 * @author Xel
 *
 */
public enum RSCTeleport {
	HOME(0),
	MOBILISINGARMIES(0),
	VARROCK(0),
	LUMBRIDGE(0),
	FALADOR(0),
	HOUSE(0),
	CAMELOT(0),
	ARDOUGNE(0),
	WATCHTOWER(0),
	TROLLHEIM(0),
	APOATOLL(0),
	EDGEVILLEHOME(0),
	/**
	 * Edgeville dungeon
	 */
	PADDEWWA(0),
	/**
	 * Digsite
	 */
	SENNTISTEN(0),
	/**
	 * Senntisten
	 */
	KHARYRLL(0),
	/**
	 * Canifis
	 */
	LASSAR(0),
	/**
	 * lvl 26 Wilderness ruins
	 */
	DAREEYAK(0),
	/**
	 * lvl 18 Wilderness Graveyard of shadows
	 */
	CARRALLANGAR(0),
	/**
	 * lvl 45 Wilderness Demonic ruins
	 */
	ANNAKARL(0),
	/**
	 * lvl 54 Wilderness Ice plateau
	 */
	GHORROCK(0),
	LUNARHOME(0),
	MOONCLAN(0),
	OURANIA(0),
	WATERBIRTH(0),
	SOUTHFALADOR(0),
	BARBARIAN(0),
	NORTHARDOUGNE(0),
	KHAZARD(0),
	FISHINGGUILD(0),
	CATHERBY(0),
	ICEPLATEAU(0),
	DUNGEONHOME(0),
	GATESTONE(0),
	GROUPGATESTONE(0);
	
	private int id;
	
	RSCTeleport(int id) {
		this.id = id;
		}
		

		public int getId() {
			return id;
		}
		
		public void tele(){
			if (tabopen()){			
				Spellbook().getChild(id).click(true);
			}else{
				openTab();
				Time.sleep(500);
				tele();
			}
		}
		
		public boolean openTab(){
			return Tabs.MAGIC.open();
		}		

		public static boolean tabopen(){
			return true;
		}
		
		public int getSpellbook(){
			return 1; //TODO
		}
		
		public Widget Spellbook(){
			return Widgets.get(getSpellbook());
		}
	
}
