package vectorwing.farmersdelight.items;

import net.minecraft.item.Food;

public class Foods
{
	// Raw Crops
	public static final Food CABBAGE = (new Food.Builder())
			.hunger(2).saturation(0.4f).build();
	public static final Food TOMATO = (new Food.Builder())
			.hunger(1).saturation(0.3f).build();
	public static final Food ONION = (new Food.Builder())
			.hunger(2).saturation(0.4f).build();

	// Basic Foods
	public static final Food FRIED_EGG = (new Food.Builder())
			.hunger(4).saturation(0.4f).build();
	public static final Food TOMATO_SAUCE = (new Food.Builder())
			.hunger(2).saturation(0.4f).build();
	public static final Food CAKE_SLICE = (new Food.Builder())
			.hunger(2).saturation(0.1f).build();

	// Simple Meals (1 Star)
	public static final Food FRESH_SALAD = (new Food.Builder())
			.hunger(6).saturation(0.5f).build();
	public static final Food BARBECUE_STICK = (new Food.Builder())
			.hunger(7).saturation(0.6f).build();
	public static final Food CHICKEN_SANDWICH = (new Food.Builder())
			.hunger(8).saturation(0.7f).build();
	public static final Food HAMBURGER = (new Food.Builder())
			.hunger(10).saturation(0.8f).build();

}