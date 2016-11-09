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
	            if (cmd.getName().equalsIgnoreCase("upstone")) { 				//"/upstone"と入力したら
	            	sender.sendMessage("ナイス!");
	            	player.getLocation();										//位置座標が読み込まれる
	    	       World world=Bukkit.getWorld("world");
	    	       Location loc=player.getLocation();							//位置座標をlocに格納

	    	       //石柱製造
	    	       for(int c=-1; c<=1; c++){
	    	    	   for(int b=-1; b<=1; b++){
	    	    		   Block block=world.getBlockAt((int)loc.getX()+(b),(int)loc.getY()-1,(int)loc.getZ()+(c));
	    	    		   for(int a=0; a<4;a++){
	    	    			   for(BlockFace face:BlockFace.values()){				//説明等
	    	    				   sender.sendMessage("あなたは石で囲まれました");
	    	    			   }
	    	    			   Block shower = block.getRelative(BlockFace.UP, a);		//a回上に上がったところにブロックを置く
	    	    			   shower.setType(Material.STONE);							//石ブロックを置く
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
/*答え
 * for(int y=0; y<=1; y++){
    				   for(BlockFace face:BlockFace.values()){
    					   Block block=player.getLocation().add(0,y,0).getBlock.getRelative(face);

    					   if(block.equals(player.getLocation().getBlock()||k())
    							   continue;
    					   block.setType(Material.STONE);
    				   }
    			   }*/