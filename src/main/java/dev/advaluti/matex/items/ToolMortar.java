package dev.advaluti.matex.items;

import dev.advaluti.matex.interfaces.IToolMortar;
import dev.advaluti.matex.util.ModSetup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.extensions.IForgeItem;

import javax.annotation.Nonnull;
import java.util.Random;


public class ToolMortar extends Item implements IForgeItem, IToolMortar {

    public static final Random RAND = new Random();

    public ToolMortar() {
        super(new Item.Properties()
                .group(ModSetup.MATEXTOOLS_GROUP)
                .defaultMaxDamage(16)
        );
    }

    @Override
    public void setDamage(ItemStack stack, int damage)
    {
        stack.getOrCreateTag().putInt("Damage", Math.max(0, damage));
    }

    @Override
    public boolean showDurabilityBar(ItemStack stack) {
        return true;

    }

    @Nonnull
    @Override
    public ItemStack getContainerItem(@Nonnull ItemStack stack)
    {
        ItemStack container = stack.copy();
        if(container.attemptDamageItem(1, RAND, null))
            return ItemStack.EMPTY;
        else
            return container;
    }

    @Override
    public boolean hasContainerItem(@Nonnull ItemStack stack)
    {
        return true;
    }

    @Override
    public boolean isTool(ItemStack item)
    {
        return true;
    }

}