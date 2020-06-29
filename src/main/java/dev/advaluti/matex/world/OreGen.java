package dev.advaluti.matex.world;

import dev.advaluti.matex.blocks.*;
import dev.advaluti.matex.setup.Registration;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class OreGen {
    public static void OreGenerate() {
        for(Biome biome : ForgeRegistries.BIOMES) {
            ConfiguredPlacement copperGen = Placement.COUNT_RANGE.configure(new CountRangeConfig(16, 30,2,86));
            ConfiguredPlacement tinGen = Placement.COUNT_RANGE.configure(new CountRangeConfig(10, 8,3,72));
            ConfiguredPlacement leadGen = Placement.COUNT_RANGE.configure(new CountRangeConfig(8, 8,5,64));
            ConfiguredPlacement aluminiumGen = Placement.COUNT_RANGE.configure(new CountRangeConfig(8, 8,5,64));
            ConfiguredPlacement silverGen = Placement.COUNT_RANGE.configure(new CountRangeConfig(2, 4,5,32));

            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
                    new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, Registration.ORECOPPER.get().getDefaultState(), 10)).withPlacement(copperGen));

            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
                    new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, Registration.ORETIN.get().getDefaultState(), 10)).withPlacement(tinGen));

            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
                            new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, Registration.ORELEAD.get().getDefaultState(), 10)).withPlacement(leadGen));

            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
                    new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, Registration.OREALUMINIUM.get().getDefaultState(), 10)).withPlacement(aluminiumGen));

            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
                    new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, Registration.ORESILVER.get().getDefaultState(), 10)).withPlacement(silverGen));
        }
    }
}