package net.zuperzv.living_tech.block.entity;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.zuperzv.living_tech.LivingTech;
import net.zuperzv.living_tech.block.ModBlocks;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, LivingTech.MOD_ID);

    public static final RegistryObject<BlockEntityType<RottenCauldronBlockEntity>> ROTTEN_CAULDRON_BE =
            BLOCK_ENTITIES.register("rotten_cauldron_block_entity", () ->
                    BlockEntityType.Builder.of(RottenCauldronBlockEntity::new,
                            ModBlocks.ROTTEN_CAULDRON.get()).build(null));


    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}