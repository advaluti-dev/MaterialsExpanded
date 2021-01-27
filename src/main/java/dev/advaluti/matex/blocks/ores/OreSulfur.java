package dev.advaluti.matex.blocks.ores;

import dev.advaluti.matex.util.ConfigGeneral;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class OreSulfur extends Block {

    public OreSulfur() {
        super(Properties.create(Material.ROCK)
                .sound(SoundType.STONE)
                .hardnessAndResistance(2.5f)
                .harvestTool(ToolType.PICKAXE)
                .harvestLevel(ConfigGeneral.HarvestSulfur.get())
        );
    }
}