package net.sweetmimike.automessage.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import net.sweetmimike.automessage.AutoMessager;
import net.sweetmimike.automessage.Main;

public class CommandAutoMessage implements CommandExecutor {
	
	Main main;
	AutoMessager am;
	
	public CommandAutoMessage(Main main, AutoMessager am) {
		this.main = main;
		this.am = am;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		
		if(args[0].equalsIgnoreCase("add") ) {
			String messageToAdd =  new String();
			for(int i = 1; i < args.length; i++) {
				messageToAdd += args[i] + " ";
			}
			messageToAdd.replace("&", "§");
			messageToAdd = messageToAdd.trim();
			am.getMessages().add(messageToAdd);
			main.getConfig().set("message", am.getMessages());
			main.saveConfig();
			return true;
		}
		
		
		return false;
	}

}
