package net.Towers.main;

import net.Towers.main.handlers.TowerHandler;
import net.Towers.main.utils.z;

import org.bukkit.Bukkit;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin implements Listener{
	
	String e = "&e[&cTowers&e] &aHas been enabled!";
	public void onEnable(){
		t();
		ConsoleCommandSender u = Bukkit.getConsoleSender();
		u.sendMessage(z.f(e));
	}
	
	String b = "&e[&cTowers&e] &cHas been disabled!";
	public void onDisable(){
		ConsoleCommandSender v = Bukkit.getConsoleSender();
		v.sendMessage(z.f(b));
	}
	
	public void t(){
		PluginManager m = Bukkit.getPluginManager();
		m.registerEvents(new z(this), this);
		m.registerEvents(new TowerHandler(this), this);
	}

}
