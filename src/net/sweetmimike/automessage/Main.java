package net.sweetmimike.automessage;

import java.util.List;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;

public class Main extends JavaPlugin {
	
	List<String> messages = getConfig().getStringList("message");
	
	@Override
	public void onEnable() {
		System.out.println("salut");
		saveDefaultConfig();
		super.onEnable();
		
		new BukkitRunnable() {
			Random rand = new Random();
			@Override
			public void run() {
				int valeur = rand.nextInt(3);
				Bukkit.broadcastMessage(messages.get(valeur));
				
			}
		}.runTaskTimer(this, 0, 40);
	}
}
