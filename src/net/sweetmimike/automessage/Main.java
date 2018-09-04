package net.sweetmimike.automessage;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	private AutoMessager messager = new AutoMessager(this);
	
	@Override
	public void onEnable() {
		
		messager.onRunMessage();
		saveDefaultConfig();
		super.onEnable();
	}
	
	@Override
	public void onDisable() {
		// TODO Auto-generated method stub
		super.onDisable();
	}
}
