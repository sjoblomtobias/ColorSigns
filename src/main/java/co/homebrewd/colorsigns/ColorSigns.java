package co.homebrewd.colorsigns;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.SignChangeEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class ColorSigns extends JavaPlugin implements Listener {

	@Override
	public void onEnable() {
		this.getServer().getPluginManager().registerEvents(this, this);
	}

	@Override
	public void onDisable() {}

	@EventHandler
	public void onFinish(SignChangeEvent event) {
		for (int i = 0; i <= 3; i++) {
			if (event.getLine(i).contains("&")) {
				event.setLine(i, event.getLine(i).replaceAll("&", "§"));
			}
		}
	}

}
