package io.github.unix_supremacist.alabli;

import net.minecraft.tags.TagKey;
import net.minecraft.world.item.DiggerItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.block.Block;

public class AlabliDiggerItem extends DiggerItem {
    public AlabliDiggerItem(float f, float g, Tier tier, TagKey<Block> tagKey, Properties properties) {
        super(f, g, tier, tagKey, properties.tab(Alabli.tab));
    }
}
