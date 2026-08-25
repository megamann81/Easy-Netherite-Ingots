package com.luke.customrecipe; 

import org.bukkit.plugin.java.JavaPlugin; 

public class EasyNetheriteIngots extends JavaPlugin {
@Override
public void onEnable() {
getLogger().info("Easy Netherite Ingots has been enabled!");
CustomNetheriteRecipe.registerRecipe(this);
} 

@Override
public void onDisable() {
getLogger().info("Easy Netherite Ingots has been disabled!");
}
}
