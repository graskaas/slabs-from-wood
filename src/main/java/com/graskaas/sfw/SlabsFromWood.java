package com.graskaas.sfw;

import com.graskaas.sfw.util.SlabUtils;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.block.SlabBlock;
import net.minecraft.sound.BlockSoundGroup;

public class SlabsFromWood implements ModInitializer {

    private static final String MOD_ID = "sfw";
    /* NOTE: The following is a hack.

       This is an excerpt from the Fabric Wiki regarding blocks:

       =============

       `strength` sets both the hardness and the resistance of a block to the same value.
       Hardness determines how long the block takes to break, and resistance determines how strong the block is against blast damage (e.g. explosions).
       Stone has a hardness of 1.5f and a resistance of 6.0f, while Obsidian has a hardness of 50.0f and a resistance of 1200.0f.

       You can find the stats of all vanilla blocks in the class `Blocks`, where you can also reference other blocks.

       =============

       In the Blocks class, OAK_SLAB has a hardness of 2.0F and resistance of 3.0F which is why I use these values.
       In the game, these modded blocks take almost as much time to break as Obsidian.

       Moving the decimal seems to have worked for me as of 1.18.2 so this will stay for now, and is considered a hack.
     */
    private static final float HARDNESS = 2.0f / 10f;
    private static final float RESISTANCE = 3.0f / 10f;

    // normal logs
    public static final SlabBlock OAK_LOG_SLAB = new SlabBlock(FabricBlockSettings.of(Material.WOOD).strength(HARDNESS, RESISTANCE).sounds(BlockSoundGroup.WOOD));
    public static final SlabBlock DARK_OAK_LOG_SLAB = new SlabBlock(FabricBlockSettings.of(Material.WOOD).strength(HARDNESS, RESISTANCE).sounds(BlockSoundGroup.WOOD));
    public static final SlabBlock SPRUCE_LOG_SLAB = new SlabBlock(FabricBlockSettings.of(Material.WOOD).strength(HARDNESS, RESISTANCE).sounds(BlockSoundGroup.WOOD));
    public static final SlabBlock BIRCH_LOG_SLAB = new SlabBlock(FabricBlockSettings.of(Material.WOOD).strength(HARDNESS, RESISTANCE).sounds(BlockSoundGroup.WOOD));
    public static final SlabBlock ACACIA_LOG_SLAB = new SlabBlock(FabricBlockSettings.of(Material.WOOD).strength(HARDNESS, RESISTANCE).sounds(BlockSoundGroup.WOOD));
    public static final SlabBlock JUNGLE_LOG_SLAB = new SlabBlock(FabricBlockSettings.of(Material.WOOD).strength(HARDNESS, RESISTANCE).sounds(BlockSoundGroup.WOOD));
    public static final SlabBlock CRIMSON_STEM_SLAB = new SlabBlock(FabricBlockSettings.of(Material.NETHER_WOOD).strength(HARDNESS, RESISTANCE).sounds(BlockSoundGroup.NETHER_STEM));
    public static final SlabBlock WARPED_STEM_SLAB = new SlabBlock(FabricBlockSettings.of(Material.NETHER_WOOD).strength(HARDNESS, RESISTANCE).sounds(BlockSoundGroup.NETHER_STEM));

    // stripped logs
    public static final SlabBlock STRIPPED_OAK_LOG_SLAB = new SlabBlock(FabricBlockSettings.of(Material.WOOD).strength(HARDNESS, RESISTANCE).sounds(BlockSoundGroup.WOOD));
    public static final SlabBlock STRIPPED_DARK_OAK_LOG_SLAB = new SlabBlock(FabricBlockSettings.of(Material.WOOD).strength(HARDNESS, RESISTANCE).sounds(BlockSoundGroup.WOOD));
    public static final SlabBlock STRIPPED_SPRUCE_LOG_SLAB = new SlabBlock(FabricBlockSettings.of(Material.WOOD).strength(HARDNESS, RESISTANCE).sounds(BlockSoundGroup.WOOD));
    public static final SlabBlock STRIPPED_BIRCH_LOG_SLAB = new SlabBlock(FabricBlockSettings.of(Material.WOOD).strength(HARDNESS, RESISTANCE).sounds(BlockSoundGroup.WOOD));
    public static final SlabBlock STRIPPED_ACACIA_LOG_SLAB = new SlabBlock(FabricBlockSettings.of(Material.WOOD).strength(HARDNESS, RESISTANCE).sounds(BlockSoundGroup.WOOD));
    public static final SlabBlock STRIPPED_JUNGLE_LOG_SLAB = new SlabBlock(FabricBlockSettings.of(Material.WOOD).strength(HARDNESS, RESISTANCE).sounds(BlockSoundGroup.WOOD));
    public static final SlabBlock STRIPPED_CRIMSON_STEM_SLAB = new SlabBlock(FabricBlockSettings.of(Material.NETHER_WOOD).strength(HARDNESS, RESISTANCE).sounds(BlockSoundGroup.NETHER_STEM));
    public static final SlabBlock STRIPPED_WARPED_STEM_SLAB = new SlabBlock(FabricBlockSettings.of(Material.NETHER_WOOD).strength(HARDNESS, RESISTANCE).sounds(BlockSoundGroup.NETHER_STEM));

    // normal woods
    public static final SlabBlock OAK_WOOD_SLAB = new SlabBlock(FabricBlockSettings.of(Material.WOOD).strength(HARDNESS, RESISTANCE).sounds(BlockSoundGroup.WOOD));
    public static final SlabBlock DARK_OAK_WOOD_SLAB = new SlabBlock(FabricBlockSettings.of(Material.WOOD).strength(HARDNESS, RESISTANCE).sounds(BlockSoundGroup.WOOD));
    public static final SlabBlock SPRUCE_WOOD_SLAB = new SlabBlock(FabricBlockSettings.of(Material.WOOD).strength(HARDNESS, RESISTANCE).sounds(BlockSoundGroup.WOOD));
    public static final SlabBlock BIRCH_WOOD_SLAB = new SlabBlock(FabricBlockSettings.of(Material.WOOD).strength(HARDNESS, RESISTANCE).sounds(BlockSoundGroup.WOOD));
    public static final SlabBlock ACACIA_WOOD_SLAB = new SlabBlock(FabricBlockSettings.of(Material.WOOD).strength(HARDNESS, RESISTANCE).sounds(BlockSoundGroup.WOOD));
    public static final SlabBlock JUNGLE_WOOD_SLAB = new SlabBlock(FabricBlockSettings.of(Material.WOOD).strength(HARDNESS, RESISTANCE).sounds(BlockSoundGroup.WOOD));
    public static final SlabBlock CRIMSON_HYPHAE_SLAB = new SlabBlock(FabricBlockSettings.of(Material.NETHER_WOOD).strength(HARDNESS, RESISTANCE).sounds(BlockSoundGroup.NETHER_STEM));
    public static final SlabBlock WARPED_HYPHAE_SLAB = new SlabBlock(FabricBlockSettings.of(Material.NETHER_WOOD).strength(HARDNESS, RESISTANCE).sounds(BlockSoundGroup.NETHER_STEM));

    // stripped woods
    public static final SlabBlock STRIPPED_OAK_WOOD_SLAB = new SlabBlock(FabricBlockSettings.of(Material.WOOD).strength(HARDNESS, RESISTANCE).sounds(BlockSoundGroup.WOOD));
    public static final SlabBlock STRIPPED_DARK_OAK_WOOD_SLAB = new SlabBlock(FabricBlockSettings.of(Material.WOOD).strength(HARDNESS, RESISTANCE).sounds(BlockSoundGroup.WOOD));
    public static final SlabBlock STRIPPED_SPRUCE_WOOD_SLAB = new SlabBlock(FabricBlockSettings.of(Material.WOOD).strength(HARDNESS, RESISTANCE).sounds(BlockSoundGroup.WOOD));
    public static final SlabBlock STRIPPED_BIRCH_WOOD_SLAB = new SlabBlock(FabricBlockSettings.of(Material.WOOD).strength(HARDNESS, RESISTANCE).sounds(BlockSoundGroup.WOOD));
    public static final SlabBlock STRIPPED_ACACIA_WOOD_SLAB = new SlabBlock(FabricBlockSettings.of(Material.WOOD).strength(HARDNESS, RESISTANCE).sounds(BlockSoundGroup.WOOD));
    public static final SlabBlock STRIPPED_JUNGLE_WOOD_SLAB = new SlabBlock(FabricBlockSettings.of(Material.WOOD).strength(HARDNESS, RESISTANCE).sounds(BlockSoundGroup.WOOD));
    public static final SlabBlock STRIPPED_CRIMSON_HYPHAE_SLAB = new SlabBlock(FabricBlockSettings.of(Material.NETHER_WOOD).strength(HARDNESS, RESISTANCE).sounds(BlockSoundGroup.NETHER_STEM));
    public static final SlabBlock STRIPPED_WARPED_HYPHAE_SLAB = new SlabBlock(FabricBlockSettings.of(Material.NETHER_WOOD).strength(HARDNESS, RESISTANCE).sounds(BlockSoundGroup.NETHER_STEM));

    @Override
    public void onInitialize() {
        registerVanillaSlabs();
    }

    private void registerVanillaSlabs() {
        // oak
        SlabUtils.registerSlab("oak_log_slab", OAK_LOG_SLAB, MOD_ID);
        SlabUtils.registerSlab("stripped_oak_log_slab", STRIPPED_OAK_LOG_SLAB, MOD_ID);
        SlabUtils.registerSlab("oak_wood_slab", OAK_WOOD_SLAB, MOD_ID);
        SlabUtils.registerSlab("stripped_oak_wood_slab", STRIPPED_OAK_WOOD_SLAB, MOD_ID);

        // dark oak
        SlabUtils.registerSlab("dark_oak_log_slab", DARK_OAK_LOG_SLAB, MOD_ID);
        SlabUtils.registerSlab("stripped_dark_oak_log_slab", STRIPPED_DARK_OAK_LOG_SLAB, MOD_ID);
        SlabUtils.registerSlab("dark_oak_wood_slab", DARK_OAK_WOOD_SLAB, MOD_ID);
        SlabUtils.registerSlab("stripped_dark_oak_wood_slab", STRIPPED_DARK_OAK_WOOD_SLAB, MOD_ID);

        // spruce
        SlabUtils.registerSlab("spruce_log_slab", SPRUCE_LOG_SLAB, MOD_ID);
        SlabUtils.registerSlab("stripped_spruce_log_slab", STRIPPED_SPRUCE_LOG_SLAB, MOD_ID);
        SlabUtils.registerSlab("spruce_wood_slab", SPRUCE_WOOD_SLAB, MOD_ID);
        SlabUtils.registerSlab("stripped_spruce_wood_slab", STRIPPED_SPRUCE_WOOD_SLAB, MOD_ID);

        // birch
        SlabUtils.registerSlab("birch_log_slab", BIRCH_LOG_SLAB, MOD_ID);
        SlabUtils.registerSlab("stripped_birch_log_slab", STRIPPED_BIRCH_LOG_SLAB, MOD_ID);
        SlabUtils.registerSlab("birch_wood_slab", BIRCH_WOOD_SLAB, MOD_ID);
        SlabUtils.registerSlab("stripped_birch_wood_slab", STRIPPED_BIRCH_WOOD_SLAB, MOD_ID);

        // acacia
        SlabUtils.registerSlab("acacia_log_slab", ACACIA_LOG_SLAB, MOD_ID);
        SlabUtils.registerSlab("stripped_acacia_log_slab", STRIPPED_ACACIA_LOG_SLAB, MOD_ID);
        SlabUtils.registerSlab("acacia_wood_slab", ACACIA_WOOD_SLAB, MOD_ID);
        SlabUtils.registerSlab("stripped_acacia_wood_slab", STRIPPED_ACACIA_WOOD_SLAB, MOD_ID);

        // jungle
        SlabUtils.registerSlab("jungle_log_slab", JUNGLE_LOG_SLAB, MOD_ID);
        SlabUtils.registerSlab("stripped_jungle_log_slab", STRIPPED_JUNGLE_LOG_SLAB, MOD_ID);
        SlabUtils.registerSlab("jungle_wood_slab", JUNGLE_WOOD_SLAB, MOD_ID);
        SlabUtils.registerSlab("stripped_jungle_wood_slab", STRIPPED_JUNGLE_WOOD_SLAB, MOD_ID);

        // crimson
        SlabUtils.registerSlab("crimson_stem_slab", CRIMSON_STEM_SLAB, MOD_ID);
        SlabUtils.registerSlab("stripped_crimson_stem_slab", STRIPPED_CRIMSON_STEM_SLAB, MOD_ID);
        SlabUtils.registerSlab("crimson_hyphae_slab", CRIMSON_HYPHAE_SLAB, MOD_ID);
        SlabUtils.registerSlab("stripped_crimson_hyphae_slab", STRIPPED_CRIMSON_HYPHAE_SLAB, MOD_ID);

        // warped
        SlabUtils.registerSlab("warped_stem_slab", WARPED_STEM_SLAB, MOD_ID);
        SlabUtils.registerSlab("stripped_warped_stem_slab", STRIPPED_WARPED_STEM_SLAB, MOD_ID);
        SlabUtils.registerSlab("warped_hyphae_slab", WARPED_HYPHAE_SLAB, MOD_ID);
        SlabUtils.registerSlab("stripped_warped_hyphae_slab", STRIPPED_WARPED_HYPHAE_SLAB, MOD_ID);
    }
}
