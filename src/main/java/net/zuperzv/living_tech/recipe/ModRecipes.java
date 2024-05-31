package net.zuperzv.living_tech.recipe;

import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.zuperzv.living_tech.LivingTech;
import net.zuperzv.living_tech.screen.RottenCauldronMenu;

public class ModRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, LivingTech.MOD_ID);

    public static final RegistryObject<RecipeSerializer<RottenCauldronRecipe>> ROTTEN_CAULDRON_SERIALIZER =
            SERIALIZERS.register("rotten_cauldron", () -> RottenCauldronRecipe.Serializer.INSTANCE);

    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
    }
}