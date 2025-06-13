package com.example.simplefarmingtancompat;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import toughasnails.api.thirst.ThirstHelper;

@Mod("simplefarmingtancompat")
public class SimpleFarmingTANCompat {

    public static final String MODID = "simplefarmingtancompat";

    public SimpleFarmingTANCompat() {
        IEventBus modEventBus = MinecraftForge.EVENT_BUS;
        modEventBus.addListener(this::setup);
    }

    private void setup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            registerDrink("simplefarming:red_wine", 4, 0.5f);
            registerDrink("simplefarming:white_wine", 4, 0.5f);
            registerDrink("simplefarming:apple_cider", 3, 0.3f);
            registerDrink("simplefarming:lemonade", 5, 0.6f);
            registerDrink("simplefarming:grape_juice", 4, 0.5f);
            registerDrink("simplefarming:orange_juice", 4, 0.5f);
            registerDrink("simplefarming:tomato_juice", 3, 0.4f);
            registerDrink("simplefarming:melon_juice", 4, 0.4f);
            registerDrink("simplefarming:berry_juice", 4, 0.4f);
            registerDrink("simplefarming:apple", 2, 0.2f);
            registerDrink("simplefarming:banana", 2, 0.2f);
            registerDrink("simplefarming:cherry", 2, 0.2f);
            registerDrink("simplefarming:grape", 2, 0.2f);
            registerDrink("simplefarming:lemon", 2, 0.2f);
            registerDrink("simplefarming:lime", 2, 0.2f);
            registerDrink("simplefarming:mango", 2, 0.2f);
            registerDrink("simplefarming:orange", 2, 0.2f);
            registerDrink("simplefarming:pear", 2, 0.2f);
            registerDrink("simplefarming:plum", 2, 0.2f);
            registerDrink("simplefarming:raspberry", 1, 0.1f);
            registerDrink("simplefarming:strawberry", 1, 0.1f);
            registerDrink("simplefarming:blueberry", 1, 0.1f);
            registerDrink("simplefarming:blackberry", 1, 0.1f);
        });
    }

    private void registerDrink(String itemId, int thirstAmount, float hydrationAmount) {
        Item item = net.minecraftforge.registries.ForgeRegistries.ITEMS.getValue(new net.minecraft.resources.ResourceLocation(itemId));
        if (item != null && item != Items.AIR) {
            ThirstHelper.registerDrink(item, thirstAmount, hydrationAmount);
        }
    }
}