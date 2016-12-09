package net.Towers.main.utils;

import java.util.Random;

import net.Towers.main.main;

import org.bukkit.ChatColor;
import org.bukkit.FireworkEffect;
import org.bukkit.Location;
import org.bukkit.craftbukkit.v1_10_R1.entity.CraftFirework;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Firework;
import org.bukkit.event.Listener;
import org.bukkit.inventory.meta.FireworkMeta;

public class z implements Listener{
	
	static main y;
	public z(main c) {
		z.y = c;
	}
	public static String f(String x){
		return ChatColor.translateAlternateColorCodes('&', x);
	}
	
	public static double getCurrentPercentage(Double totalamount, Double amounthas){
		double num3 = totalamount - amounthas;
		double num4 = num3/amounthas;
		/*if(num4 >= 1000){
			return num5;
		}else{
			return num4;
		}*/
		return num4;
	}
	
	public static int randomNum(int Low, int High){
		Random r = new Random();
		int R = r.nextInt(High-Low) + Low;
		return R;
	}
	
	public static double getPercentageNeeded(Double totalamount, Double amounthas){
		double num3 = totalamount - amounthas;
		double num4 = num3/amounthas;
		double num5 = num4 * 100;
		return num5;
	}
	
	public static void p(Location paramLocation,
			FireworkEffect paramFireworkEffect, Integer lifeSpan) {
		Entity localEntity = paramLocation.getWorld().spawnEntity(
				paramLocation, EntityType.FIREWORK);
		Firework localFirework = (Firework) localEntity;
		FireworkMeta localFireworkMeta = localFirework.getFireworkMeta();
		localFireworkMeta.addEffect(paramFireworkEffect);
		localFireworkMeta.setPower(1);
		localFirework.setFireworkMeta(localFireworkMeta);

		((CraftFirework) localFirework).getHandle().expectedLifespan = lifeSpan;
	}
}
