package com.graskaas.sfw.util;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.SlabBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class SlabUtils {

    public static void registerSlab(String path, SlabBlock base, String modId) {
        Registry.register(Registry.BLOCK, new Identifier(modId, path), base);
        Registry.register(Registry.ITEM, new Identifier(modId, path), new BlockItem(base, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
    }

}
