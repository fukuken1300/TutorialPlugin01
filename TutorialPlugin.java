package com.github.fukuken1300.tutorialplugin;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerMoveEvent;
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
	    @EventHandler
	    public void onPlayerMove(PlayerMoveEvent evt) {
	        // プレイヤーの位置を取得します。
	        Location loc = evt.getPlayer().getLocation();
	        // 位置のY座標を+3します。位置情報を変更しているだけで、実際にプレイヤーの位置が移動するわけではないことに注意してください。
	        loc.setY(loc.getY() + 3);
	        // 指定位置のブロックを取得します。
	        Block b = loc.getBlock();
	        // ブロックの種類に石（STONE）を設定します。
	        b.setType(Material.STONE);
	    }

	    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
	        if (sender instanceof Player) {
	            Player player = (Player) sender;
	            if (cmd.getName().equalsIgnoreCase("upstone")) {
	            	sender.sendMessage("ナイス!");
	            	onPlayerMove(null);//←ここで上に石を置きたい

	            }

	            return true;
	        } else {
	            sender.sendMessage(ChatColor.RED + "ゲーム内から実行してください！");
	            return false;
	        }
	    }
}