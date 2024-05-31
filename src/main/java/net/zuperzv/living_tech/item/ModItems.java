package net.zuperzv.living_tech.item;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.zuperzv.living_tech.LivingTech;
import net.zuperzv.living_tech.fluid.ModFluids;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, LivingTech.MOD_ID);

    public static final RegistryObject<Item> DIAMOND_NUGGET = ITEMS.register("diamond_nugget",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> FLESH_WATER_BUCKET = ITEMS.register("flesh_water_bucket",
            () -> new BucketItem(ModFluids.SOURCE_FLESH_WATER.get(), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}