package net.sweetmimike.automessage;

import java.util.List;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;

public class Main extends JavaPlugin {
	
	List<String> messages = getConfig().getStringList("message");
	int nbMessage = messages.size();
	int valeur;
	long cooldown = getConfig().getLong("cooldown") * 20;
	
	@Override
	public void onEnable() {
		
		saveDefaultConfig();
		super.onEnable();
		
		new BukkitRunnable() {
			Random rand = new Random();
			@Override
			public void run() {
				
				valeur = rand.nextInt(nbMessage);
				Bukkit.broadcastMessage(messages.get(valeur).replace("&", "§"));
				
			}
		}.runTaskTimer(this, 0, cooldown);
	}
}
