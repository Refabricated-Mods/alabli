package io.github.unix_supremacist.alabli;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;

public class AlabliBlockItem extends BlockItem {
    public AlabliBlockItem(Block block, Properties properties) {
        super(block, properties.tab(Alabli.tab));
    }
}
