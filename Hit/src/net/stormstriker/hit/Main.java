package net.stormstriker.hit;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.Effect;
import org.bukkit.Sound;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;


public class Main extends JavaPlugin implements Listener{
	
	public void onEnable(){
		PluginManager pm = Bukkit.getServer().getPluginManager();
		pm.registerEvents(this, this);
	}
	
	@SuppressWarnings("deprecation")
	public void onEntityDamage(EntityDamageEvent e) {
		if(e.getEntityType() == EntityType.PLAYER) {
			Player p = (Player) e.getEntity();
			p.playSound(p.getLocation(), Sound.VILLAGER_HIT, 6, 1);
			p.playEffect(p.getLocation(), Effect.MOBSPAWNER_FLAMES, 1);
		}
	}

}
