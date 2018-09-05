package net.sweetmimike.automessage;

import java.util.List;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.scheduler.BukkitRunnable;

public class AutoMessager {
	
	Main main;
	List<String> messages;
	int nbMessage;
	int valeur;
	long cooldown;
	
	public AutoMessager(Main main) {
		this.main = main;
		cooldown = main.getConfig().getLong("cooldown") * 20;
	}
	
	
	
	public void onRunMessage() {
		
		new BukkitRunnable() {
			Random rand = new Random();
			@Override
			public void run() {
				messages = main.getConfig().getStringList("message");
				nbMessage = messages.size();
				valeur = rand.nextInt(nbMessage);
				Bukkit.broadcastMessage(messages.get(valeur).replace("&", "§"));
				
				
			}
		}.runTaskTimer(main, 0, cooldown);
	}
	
	public List<String> getMessages() {
		return messages;
	}

}
