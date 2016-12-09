package net.Towers.main.handlers;

import net.Towers.main.main;
import net.Towers.main.utils.z;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class TowerHandler implements Listener{
	
	@SuppressWarnings("unused")
	private static main y;
	public TowerHandler(main c) {
		TowerHandler.y = c;
	}
	
	@SuppressWarnings("deprecation")
	@EventHandler
	public void crateHandler(final PlayerInteractEvent e) {
		if (e.getAction() == Action.RIGHT_CLICK_BLOCK) {
			if(e.getHand() == EquipmentSlot.HAND){
				if (e.getClickedBlock() != null) {
					if (e.getClickedBlock().getType() == Material.DIAMOND_BLOCK){
						if(e.getPlayer().getItemInHand().getType() == Material.STONE_SWORD){
							if(e.getPlayer().getItemInHand().hasItemMeta()){
								if(e.getPlayer().getItemInHand().getItemMeta().getDisplayName().equals(z.f("&b(&eTower Maker&b)"))){
									createArtillaryTower(e.getClickedBlock());
									e.getPlayer().sendMessage(z.f("&bYou have: &e" + z.getCurrentPercentage(1600.0, 160.0 * 10) + " &bpercent complete!"));
									e.getPlayer().sendMessage(z.f("&bYou need: &e" + z.getPercentageNeeded(1600.0, 160.0 * 10) + " &bpercent needed!"));
								}
							}
						}
					}
				}
			}
		}
	}
	
	@SuppressWarnings("deprecation")
	public void createArtillaryTower(Block block){
		block.getLocation().add(1, 1, 1).getBlock().setTypeId(98);
		block.getLocation().add(-1, 1, 1).getBlock().setTypeId(98);
		block.getLocation().add(1, 1, -1).getBlock().setTypeId(98);
		block.getLocation().add(-1, 1, -1).getBlock().setTypeId(98);
		
		block.getLocation().add(1, 1, 0).getBlock().setTypeId(109);
		block.getLocation().add(1, 1, 0).getBlock().setData((byte)1);
		block.getLocation().add(-1, 1, 0).getBlock().setTypeId(109);
		block.getLocation().add(-1, 1, 0).getBlock().setData((byte)0);
		block.getLocation().add(0, 1, -1).getBlock().setTypeId(109);
		block.getLocation().add(0, 1, -1).getBlock().setData((byte)2);
		block.getLocation().add(0, 1, 1).getBlock().setTypeId(109);
		
		block.getLocation().add(0, 1, 0).getBlock().setTypeId(159);
		block.getLocation().add(0, 2, 0).getBlock().setTypeId(159);
		block.getLocation().add(0, 3, 0).getBlock().setTypeId(159);
		
		block.getLocation().add(0, 4, 0).getBlock().setTypeId(46);
		
		block.getLocation().add(1, 2, 1).getBlock().setTypeId(159);
		block.getLocation().add(1, 2, 1).getBlock().setData((byte)9);
		block.getLocation().add(-1, 2, 1).getBlock().setTypeId(159);
		block.getLocation().add(-1, 2, 1).getBlock().setData((byte)9);
		block.getLocation().add(1, 2, -1).getBlock().setTypeId(159);
		block.getLocation().add(1, 2, -1).getBlock().setData((byte)9);
		block.getLocation().add(-1, 2, -1).getBlock().setTypeId(159);
		block.getLocation().add(-1, 2, -1).getBlock().setData((byte)9);
		block.getLocation().add(1, 3, 1).getBlock().setTypeId(159);
		block.getLocation().add(1, 3, 1).getBlock().setData((byte)9);
		block.getLocation().add(-1, 3, 1).getBlock().setTypeId(159);
		block.getLocation().add(-1, 3, 1).getBlock().setData((byte)9);
		block.getLocation().add(1, 3, -1).getBlock().setTypeId(159);
		block.getLocation().add(1, 3, -1).getBlock().setData((byte)9);
		block.getLocation().add(-1, 3, -1).getBlock().setTypeId(159);
		block.getLocation().add(-1, 3, -1).getBlock().setData((byte)9);
		
		block.getLocation().add(1, 4, 1).getBlock().setTypeId(98);
		block.getLocation().add(1, 4, 1).getBlock().setData((byte)3);
		block.getLocation().add(-1, 4, 1).getBlock().setTypeId(98);
		block.getLocation().add(-1, 4, 1).getBlock().setData((byte)3);
		block.getLocation().add(1, 4, -1).getBlock().setTypeId(98);
		block.getLocation().add(1, 4, -1).getBlock().setData((byte)3);
		block.getLocation().add(-1, 4, -1).getBlock().setTypeId(98);
		block.getLocation().add(-1, 4, -1).getBlock().setData((byte)3);
		
		block.getLocation().add(-1, 4, 0).getBlock().setTypeId(109);
		block.getLocation().add(-1, 4, 0).getBlock().setData((byte)1);
		block.getLocation().add(1, 4, 0).getBlock().setTypeId(109);
		block.getLocation().add(1, 4, 0).getBlock().setData((byte)0);
		block.getLocation().add(0, 4, 1).getBlock().setTypeId(109);
		block.getLocation().add(0, 4, 1).getBlock().setData((byte)2);
		block.getLocation().add(0, 4, -1).getBlock().setTypeId(109);

		block.getLocation().add(1, 5, 1).getBlock().setTypeId(44);
		block.getLocation().add(1, 5, 1).getBlock().setData((byte)5);
		block.getLocation().add(-1, 5, 1).getBlock().setTypeId(44);
		block.getLocation().add(-1, 5, 1).getBlock().setData((byte)5);
		block.getLocation().add(1, 5, -1).getBlock().setTypeId(44);
		block.getLocation().add(1, 5, -1).getBlock().setData((byte)5);
		block.getLocation().add(-1, 5, -1).getBlock().setTypeId(44);
		block.getLocation().add(-1, 5, -1).getBlock().setData((byte)5);
	}
	
	@EventHandler
	public void onJoin(PlayerJoinEvent e){
		ItemStack item = new ItemStack(Material.STONE_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(z.f("&b(&eTower Maker&b)"));
		item.setItemMeta(meta);
		if(!e.getPlayer().getInventory().contains(item)){
			e.getPlayer().getInventory().addItem(item);
		}
	}
}
