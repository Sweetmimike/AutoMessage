package net.sweetmimike.automessage;

import org.bukkit.plugin.java.JavaPlugin;

import net.sweetmimike.automessage.commands.CommandAutoMessage;

public class Main extends JavaPlugin {
	
	private AutoMessager messager = new AutoMessager(this);
	
	@Override
	public void onEnable() {
		
		messager.onRunMessage();
		getCommand("automessage").setExecutor(new CommandAutoMessage(this, messager));
		saveDefaultConfig();
		super.onEnable();
	}
	
	@Override
	public void onDisable() {
		// TODO Auto-generated method stub
		super.onDisable();
	}
}
