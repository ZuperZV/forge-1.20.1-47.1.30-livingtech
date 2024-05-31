package net.zuperzv.living_tech.fluid;

import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.zuperzv.living_tech.LivingTech;
import net.zuperzv.living_tech.block.ModBlocks;
import net.zuperzv.living_tech.item.ModItems;

import java.rmi.dgc.Lease;

public class ModFluids {
    public static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(ForgeRegistries.FLUIDS, LivingTech.MOD_ID);

    public static final RegistryObject<FlowingFluid> SOURCE_FLESH_WATER = FLUIDS.register("flesh_water_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.FLESH_WATER_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_FLESH_WATER = FLUIDS.register("flowing_flesh_water_fluid",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.FLESH_WATER_FLUID_PROPERTIES));


    public static final ForgeFlowingFluid.Properties FLESH_WATER_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.FLESH_WATER_FLUID_TYPE, SOURCE_FLESH_WATER, FLOWING_FLESH_WATER)
            .slopeFindDistance(4).levelDecreasePerBlock(3).block(ModBlocks.FLESH_WATER_BLOCK)
            .bucket(ModItems.FLESH_WATER_BUCKET);


    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }
}