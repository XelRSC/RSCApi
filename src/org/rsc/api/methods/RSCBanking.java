package org.rsc.api.methods;


/**
 * @author Xel
 *
 */

public enum RSCBanking{
	/**
	 * The east bank is south of Falador Park and north of the mining guild entrance. 
	 */
	FALADOREAST(0),
	/**
	 * The west bank is south of the hairdresser's shop and north of Herquin's Gems. 
	 */
	FALADORWEST(0),
	/**
	 * Grand Exchange
	 */
	VARROCKGE(0),
	/**
	 * The west bank is near the west city gate.
	 */
	VARROCKWEST(0),
	/**
	 * The east bank is south-east of the palace, just north of Aubury's Rune Shop. 
	 */
	VARROCKEAST(0),
	/**
	 * Just west of the Emir's palace near the ship to Daemonheim. 
	 */
	ALKHARID(0),
	/**
	 * In the hospital, with two bank chests and Fadli. 
	 */
	DUELARENA(0),
	/**
	 * In the central part of the town, on the west bank of River Lum. 
	 */
	EDGEVILLE(0),
	/**
	 * Bank chest on the eastern wall of the Clan Wars challenge hall. 
	 */
	CLANWARS(0),
	/**
	 * Inside the Fist of Guthix lobby. 
	 */
	FISTOFGUTHIX(0),
	/**
	 * Located on the 3rd floor of the castle. 
	 */
	LUMBRIDGETOP(0),
	/**
	 * The Culinaromancer's Chest (simply called Chest in-game) appears in the castle cellar after Recipe for Disaster subquest one is finished. 
	 */
	LUBMRIDGECELLAR(0),
	/**
	 * East of the market and fishing spots. 
	 */
	DRAYNOR(0),
	/**
	 * Right outside the castle is the Fremennik Banker. 
	 */
	DAEMONHEIN(0),
	/**
	 * At the southwest end of town, near the boat to Daemonheim. 
	 */
	TAVERLEY(0),
	/**
	 * Inside the Rogues' Den. Closest bank to an everlasting fire, being adjacent to it. 
	 */
	ROGUESDEN(0),
	/**
	 * A bank chest sits in the area with the Major. 
	 */
	BURTHORPE(0),
	/**
	 * Warriors' Guild west of Burthope, on the ground floor. Requires a combined Attack and Strength level of 130 or either 99 Attack or 99 Strength
	 */
	WARRIORSGUILD(0),
	/**
	 * West of the palace near a small obelisk. 
	 */
	KELDAGRIM(0),
	/**
	 * Northwest corner of the base. 
	 */
	MOBILISINGARMIES(0),
	/**
	 * South of the pools, requires As a First Resort. 
	 */
	OOGLOG(0),
	/**
	 * North of the Burgher's house is a hut with four bank chests. 
	 */
	NEITIZNOT(0),
	/**
	 * Southwest part of town. 
	 */
	JATISZO(0),
	/**
	 * There is a bank on Etceteria behind the castle. 
	 */
	ETCETERIA(0),
	/**
	 * Near the entrance. Lunar Diplomacy must be finished up to sailing to the isle. Completion of Dream Mentor removes the need for a Seal of Passage when banking. 
	 */
	LUNARISLE(0),
	/**
	 * Beside the docks and to the east of the candle shop. Closest bank to an allotment. 
	 */
	CATHERBY(0),
	/**
	 * North of the Court House and east of the Elemental Workshop.
	 */
	SEERSVILLAGE(0),
	/**
	 * Near the bank of the River Dougne in the north part of the city. 
	 */
	ARDOUGNENORTH(0),
	/**
	 * Slightly southwest of the marketplace. 
	 */
	ARDOUGNESOUTH(0),
	/**
	 * At the east side of the town. 
	 */
	YANILLE(0),
	/**
	 * Up the east ladder on the second floor there is a bank. 
	 */
	LEGENDSGUILD(0),
	/**
	 * At the entrance to the altar; requires a payment of 20 of any type of rune to access. 
	 */
	OURANIA(0),
	/**
	 * A bank chest is located at the south side of the entrance, near the Zamorak portal. 
	 */
	CASTLEWARS(0),
	/**
	 * Directly southwest of the Spirit Tree, near some Yew and Magic trees. 
	 */
	GNOMESTRONGHOLD(0),
	/**
	 * In the west branch of the second floor of the Grand Tree. 
	 */
	GRANDTREE(0),
	/**
	 * Centre of the colony. Swan Song must be completed to use this bank. This is the closest bank to a general store in the game. 
	 */
	FISHINGCOLONY(0),
	/**
	 * Inside the Fishing Guild. 68 Fishing is required (skill boosts can be used). 
	 */
	FISHINGGUILD(0),
	/**
	 * Opposite the TzHaar Fight Caves entrance. 
	 */
	TZHAARCITY(0),
	/**
	 * Located in the southern part of the village. Shilo Village quest must be completed. 
	 */
	SHILOVILLAGE(0),
	/**
	 * At the southern end of town. 
	 */
	NARDAH(0),
	/**
	 * Beneath the building in the northeast, discovered during Contact!, and accessible after said quest. 
	 */
	SPOHNANEM(0),
	/**
	 * A bank chest sits near the gateway. Closest bank to Kalphite Lair if travelling on foot. 
	 */
	SHANTAYPASS(0),
	/**
	 * Bank chest along the west wall. 
	 */
	DOMINIONTOWER(0),
	/**
	 * Inside the Thieves' Guild, west of the training hall. All capers must be completed. 
	 */
	THIEVESGUILD(0),
	/**
	 * In the Cooks' Guild. Only accessible after the Hard Varrock Tasks are completed. Closest bank to a range in the game. 
	 */
	COOKSGUILD(0),
	/**
	 * East of the pub. 
	 */
	CANIFIS(0),
	/**
	 * Along the coast of the River Salve in the northern half of the swamp. 
	 */
	MORTMYRE(0),
	/**
	 * To the south of the houses. This is the second closest bank to a furnace, behind Edgeville. 
	 */
	PHASMATYS(0),
	/**
	 * Located south of the ruined pub. Requires completion of In Aid of the Myreque up to the point where you repair the bank. Closest bank for Shades of Mort'ton and Barrows. 
	 */
	BURGHDEROTT(0),
	/**
	 * In the upper tier, west of the Arboretum. Requires completion of Branches of Darkmeyer up to accessing the upper tier. A Darkmeyer disguise is highly recommended to prevent disruptions while banking. 
	 */
	DARKMEYER(0),
	/**
	 * At the south-eastern corner of the city. 
	 */
	LLETYA(0),
	/**
	 * Northernmost part of the Wilderness, accessible through a teleport lever in a small hut next to the Mage Arena. Being teleblocked will prevent access. 
	 */
	MAGEARENA(0),
	/**
	 * North of the Pest Control landers. 
	 */
	PESTCONTROL(0),
	/**
	 * In the centre of town, next to the clothes store. 
	 */
	MOSLEHARMLESS(0),
	/**
	 * Directly west of the portal to Edgeville. 
	 */
	SOULWARS(0),
	/**
	 * On the west side of the city. (Must have completed Lost City quest.) 
	 */
	ZANARIS(0),
	/**
	 * Near the entrance, requires Death to the Dorgeshuun. 
	 */
	DORGESHKAAN(0),
	/**
	 * Deposit box located near the Monks of Entrana. 
	 */
	PORTSARIMDEPOSIT(0),
	/**
	 * Deposit box in the Stealing Creation lobby. 
	 */
	STEALINGCREATIONDEPOSIT(0),
	/**
	 * A deposit box can be found in the resource dungeon outside the Mining Guild. 15 Dungeoneering is required to access. 
	 */
	DWARVENMINEDEPOSIT(0),
	/**
	 * Deposit box near Wizard Vief. 50 Runecrafting needed. 
	 */
	RUNECRAFTINGGUILDDEPOSIT(0),
	/**
	 * Inside the Customs Office is a locker serving as a deposit box. Requires Rocking Out to be started or finished. 
	 */
	RIMMINGTONDEPOSIT(0),
	/**
	 * The pulley lift in Farli's camp works like a bank deposit box. 
	 */
	LRCDEPOSIT(0),
	/**
	 * There is a deposit box at Barbarian Assault. 
	 */
	BARBARIANASSAULTDEPOSIT(0),
	/**
	 * Peer the Seer provides bank deposit services during The Fremennik Trials and after completion of the first part of the Fremennik Province Tasks. 
	 */
	RELLEKKADEPOSIT(0),
	/**
	 * Near the Fishing Trawler is a deposit box. 
	 */
	PORTKHAZARDDEPOSIT(0),
	/**
	 * Deposit box north of the village along the coast. Requires Deadliest Catch. 
	 */
	TAIBWOWANNAIDEPOSIT(0),
	/**
	 * At the south end of the habitat is a deposit box. 
	 */
	HERBLOREHABITATDEPOSIT(0),
	/**
	 * Along the shore of the River Elid in the northern half of town is a deposit box. Requires Deadliest Catch. 
	 */
	POLLNIVNEACHDEPOSIT(0),
	/**
	 * A deposit box can be found along the shore north of the camp. Requires Deadliest Catch. 
	 */
	BEDABINCAMPDEPOSIT(0),
	/**
	 * South of the camp is a deposit box. Requires Deadliest Catch. 
	 */
	ELFCAMPDEPOSIT(0),
	/**
	 * At Trouble Brewing lobby is a deposit box. 
	 */
	TROUBLEBREWINGDEPOSIT(0),
	/**
	 * A deposit box is located along the west shore after Deadliest Catch. 
	 */
	HARMONYISLANDDEPOSIT(0);
	
	private int id;
	RSCBanking(int id) {
	this.id = id;
	}
	
	
	
	
}