package com.github.fukuken1300.tutorialplugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class TutorialPlugin extends JavaPlugin {

	 @Override
	    public void onEnable() {
	        getLogger().info("onEnableメソッドが呼び出されたよ！！");
	    }

	    @Override
	    public void onDisable() {
	        getLogger().info("onDisableメソッドが呼び出されたよ！！");
	    }

	    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
	    	if (cmd.getName().equalsIgnoreCase("basic")) {
	    		// プレイヤーが /basic を実行すると、この部分の処理が実行されます...
	    		sender.sendMessage("成功");
	    		return true;
	    	} else if (cmd.getName().equalsIgnoreCase("basic2")) {
	                    // プレイヤーが /basic2 を実行すると、この部分の処理が実行されます...
	    		if (!(sender instanceof Player)) {
	    			sender.sendMessage("このコマンドはゲーム内から実行してください。");
	    		} else {
	    			Player player = (Player) sender;
	    			// コマンドの実行処理...
	    		}
	    		return true;
	    	}
	    	return false;
	    }
}

