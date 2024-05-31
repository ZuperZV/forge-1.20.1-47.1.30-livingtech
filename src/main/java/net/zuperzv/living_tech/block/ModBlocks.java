package net.zuperzv.living_tech.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.zuperzv.living_tech.LivingTech;
import net.zuperzv.living_tech.block.custom.RottenCauldronBlock;
import net.zuperzv.living_tech.fluid.ModFluids;
import net.zuperzv.living_tech.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, LivingTech.MOD_ID);
    public static final DeferredRegister<BlockEntityType<?>> ENTITY = DeferredRegister
            .create(ForgeRegistries.BLOCK_ENTITY_TYPES, LivingTech.MOD_ID);


    public static final RegistryObject<Block> ROTTEN_CAULDRON = registerBlock("rotten_cauldron",
            () -> new RottenCauldronBlock(BlockBehaviour.Properties.copy(Blocks.CAULDRON)));

    public static final RegistryObject<LiquidBlock> FLESH_WATER_BLOCK = BLOCKS.register("flesh_water_block",
            () -> new LiquidBlock(ModFluids.SOURCE_FLESH_WATER, BlockBehaviour.Properties.copy(Blocks.LAVA).noLootTable()));


    private static <T extends Block> RegistryObject<T> registerBlockWithoutBlockItem(String name, Supplier<T> block) {
        return BLOCKS.register(name, block);
    }

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
