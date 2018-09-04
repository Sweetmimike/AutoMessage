package net.sweetmimike.automessage;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		System.out.println("salut");
		super.onEnable();
		
		new BukkitRunnable() {
			
			@Override
			public void run() {
				Bukkit.broadcastMessage("salut");
				
			}
		}.runTaskTimer(this, 0, 40);
	}
}
