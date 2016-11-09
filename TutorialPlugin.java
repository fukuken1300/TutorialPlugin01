package com.github.fukuken1300.tutorialplugin;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class TutorialPlugin extends JavaPlugin {

	 @Override
	    public void onEnable() {
	        getLogger().info("読み込まれました！");
	    }

	    @Override
	    public void onDisable() {
	        getLogger().info("onDisableメソッドが呼び出されたよ！！");
	    }

	    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
	        if (sender instanceof Player) {
	            Player player = (Player) sender;
	            if (cmd.getName().equalsIgnoreCase("upstone")) {
	            	sender.sendMessage("ナイス!");
	            	player.getLocation();
	    	       World world=Bukkit.getWorld("world");
	    	       Location loc=player.getLocation();

	    	       for(int c=-1; c<=1; c++){
	    	    	   for(int b=-1; b<=1; b++){
	    	    		   Block block=world.getBlockAt((int)loc.getX()+(b),(int)loc.getY()-1,(int)loc.getZ()+(c));
	    	    		   for(int a=0; a<5;a++){
	    	    			   Block shower = block.getRelative(BlockFace.UP, a);
	    	    			   shower.setType(Material.STONE);
	    	    		   }
	    	    	   }
	    	       }

	            }

	            return true;
	        } else {
	            sender.sendMessage(ChatColor.RED + "ゲーム内から実行してください！");
	            return false;
	        }
	    }
}