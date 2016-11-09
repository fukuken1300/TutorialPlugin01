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
	    	   /* Location loc=player.getLocation();//インスタンスを生成（Locationクラス）配列版
    	        	for(int index=0; index<10; index++){
    	        		List<Location>locations=new ArrayList<Location>();
    	        	}
    	       */
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
	    	        loc.setY(loc.getY() + 2);//上
	    	        loc1.setX(loc1.getX()-1);//右上
	    	        loc1.setY(loc1.getY()+1);//右上
	    	        loc2.setX(loc2.getX()-1);//右
	    	        loc3.setZ(loc3.getZ()+1);//前上
	    	        loc3.setY(loc3.getY()+1);//前上
	    	        loc4.setZ(loc4.getZ()+1);//前   Z+
	    	        loc5.setY(loc5.getY()+1);//左上
	    	        loc5.setX(loc5.getX()+1);//左上
	    	        loc6.setX(loc6.getX()+1);//左
	    	        loc7.setZ(loc7.getZ()-1);//後上
	    	        loc7.setY(loc7.getY()+1);//後上
	    	        loc8.setZ(loc8.getZ()-1);//後
	    	        loc9.setY(loc9.getY()-1);//下



	    	        // 指定位置のブロックを石に変える
	    	        Block ue = loc.getBlock();
	    	        Block migiue = loc1.getBlock();
	    	        Block migi = loc2.getBlock();
	    	        Block maeue = loc3.getBlock();
	    	        Block mae = loc4.getBlock();
	    	        Block hidariue = loc5.getBlock();
	    	        Block hidari = loc6.getBlock();
	    	        Block usiroue = loc7.getBlock();
	    	        Block usiro = loc8.getBlock();
	    	        Block sita = loc9.getBlock();
	    	        // ブロックの種類に石（STONE）を設定します。
	    	        ue.setType(Material.STONE);
	    	        migiue.setType(Material.STONE);
	    	        migi.setType(Material.STONE);
	    	        maeue.setType(Material.STONE);
	    	        mae.setType(Material.STONE);
	    	        hidariue.setType(Material.STONE);
	    	        hidari.setType(Material.STONE);
	    	        usiroue.setType(Material.STONE);
	    	        usiro.setType(Material.STONE);
	    	        sita.setType(Material.STONE);

	            }

	            return true;
	        } else {
	            sender.sendMessage(ChatColor.RED + "ゲーム内から実行してください！");
	            return false;
	        }
	    }
}