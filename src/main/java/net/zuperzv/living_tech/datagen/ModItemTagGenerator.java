package net.zuperzv.living_tech.datagen;

import net.zuperzv.living_tech.LivingTech;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
//import net.zuperzv.resource_armadillo.block.ModBlocks;
//import net.zuperzv.resource_armadillo.util.ModTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> future,
                               CompletableFuture<TagLookup<Block>> completableFuture, @Nullable ExistingFileHelper existingFileHelper) {
        super(packOutput, future, completableFuture, LivingTech.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {

        /*this.tag(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.WEEPING_WILLOW_LOG.get().asItem())
                .add(ModBlocks.WEEPING_WILLOW_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_WEEPING_WILLOW_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_WEEPING_WILLOW_WOOD.get().asItem());

        this.tag(ItemTags.PLANKS)
                .add(ModBlocks.WEEPING_WILLOW_PLANKS.get().asItem());

        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.BOGGANIUM_HELMET.get())
                .add(ModItems.BOGGANIUM_CHESTPLATE.get())
                .add(ModItems.BOGGANIUM_LEGGINGS.get())
                .add(ModItems.BOGGANIUM_BOOTS.get())

                .add(ModItems.BOGWALKER_HELMET.get())
                .add(ModItems.BOGWALKER_CHESTPLATE.get())
                .add(ModItems.BOGWALKER_LEGGINGS.get())
                .add(ModItems.BOGWALKER_BOOTS.get())

                .add(ModItems.SILVER_HELMET.get())
                .add(ModItems.SILVER_CHESTPLATE.get())
                .add(ModItems.SILVER_LEGGINGS.get())
                .add(ModItems.SILVER_BOOTS.get())

                .add(ModItems.SILVER_DIAMOND_HELMET.get())
                .add(ModItems.SILVER_DIAMOND_CHESTPLATE.get())
                .add(ModItems.SILVER_DIAMOND_LEGGINGS.get())
                .add(ModItems.SILVER_DIAMOND_BOOTS.get())

                .add(ModItems.URANIUM_HELMET.get())
                .add(ModItems.URANIUM_CHESTPLATE.get())
                .add(ModItems.URANIUM_LEGGINGS.get())
                .add(ModItems.URANIUM_BOOTS.get())

                .add(ModItems.TITANIUM_HELMET.get())
                .add(ModItems.TITANIUM_CHESTPLATE.get())
                .add(ModItems.TITANIUM_LEGGINGS.get())
                .add(ModItems.TITANIUM_BOOTS.get());

        this.tag(ModTags.Items.BOG_LEATHER)
                .add(ModItems.BOGSKIN.get())
                .add(ModItems.SLIMY_PIECE_OF_SKIN.get());



        this.tag(ModTags.Items.SILVER_DIAMOND)
                .add(ModItems.SILVER.get())
                .add(Items.DIAMOND);


        this.tag(ItemTags.STONE_TOOL_MATERIALS)
                .add(ModBlocks.MUD_STONE.get().asItem())
                .add(ModBlocks.MOSSY_MUD_STONE_BRICKS.get().asItem())
                .add(ModBlocks.MUD_STONE_BRICKS.get().asItem())
                .add(ModBlocks.ANDESITE_MUD_STONE.get().asItem());

        copy(ModTags.Blocks.ORES_SILVER, ModTags.Items.ORES_SILVER);

        copy(ModTags.Blocks.ORES_URANIUM, ModTags.Items.ORES_URANIUM);

        copy(ModTags.Blocks.ORES_TITANIUM, ModTags.Items.ORES_TITANIUM);

         */
    }

    @Override
    public String getName() {
        return "Item Tags";
    }
}