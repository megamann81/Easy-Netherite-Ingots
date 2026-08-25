package com.luke.customrecipe; 

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin; 

public class CustomNetheriteRecipe {
public static void registerRecipe(JavaPlugin plugin) {
NamespacedKey key = new NamespacedKey(plugin, "easy_netherite_ingots_recipe");
ShapedRecipe recipe = new ShapedRecipe(key, new ItemStack(Material.NETHERITE_INGOT, 1)); 

recipe.shape("SG");
recipe.setIngredient('S', Material.NETHERITE_SCRAP);
recipe.setIngredient('G', Material.GOLD_INGOT);

plugin.getServer().addRecipe(recipe);

}

}
