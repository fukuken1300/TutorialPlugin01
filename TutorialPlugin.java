package com.github.fukuken1300.tutorialplugin;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
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
	    	        // プレイヤーの位置を取得してそれぞれの変数の作成
	    	        player.getLocation();
	    	        Location loc=player.getLocation();//インスタンスを生成（Locationクラス）
	    	        Location loc1=loc.clone();
	    	        Location loc2=loc.clone();
	    	        Location loc3=loc.clone();
	    	        Location loc4=loc.clone();
	    	        Location loc5=loc.clone();
	    	        Location loc6=loc.clone();
	    	        Location loc7=loc.clone();
	    	        Location loc8=loc.clone();
	    	        Location loc9=loc.clone();
	    	        // 座標設定
	    	        loc.setY(loc.getY() + 2);
	    	        //loc1.set(loc1.getX(),loc1.getY()+1,loc1.getZ()+1);
	    	        loc1.setY(loc.getY()+1);
	    	        loc2.setZ(loc2.getZ()+1);



	    	        // 指定位置のブロックを石に変える
	    	        Block ue = loc.getBlock();
	    	        Block maeue = loc1.getBlock();
	    	        Block maesita = loc2.getBlock();
	    	       /* Block hidariue = loc.getBlock();
	    	        Block hidarisita = loc.getBlock();
	    	        Block usiroue = loc.getBlock();
	    	        Block usirosita = loc.getBlock();
	    	        Block migiue = loc.getBlock();
	    	        Block migisita = loc.getBlock();*/
	    	        // ブロックの種類に石（STONE）を設定します。
	    	        ue.setType(Material.STONE);
	    	        maeue.setType(Material.STONE);
	    	        maesita.setType(Material.STONE);
	    	        /*hidariue.setType(Material.STONE);
	    	        hidarisita.setType(Material.STONE);
	    	        usiroue.setType(Material.STONE);
	    	        usirosita.setType(Material.STONE);
	    	        migiue.setType(Material.STONE);
	    	        migisita.setType(Material.STONE);*/

	            }

	            return true;
	        } else {
	            sender.sendMessage(ChatColor.RED + "ゲーム内から実行してください！");
	            return false;
	        }
	    }
}