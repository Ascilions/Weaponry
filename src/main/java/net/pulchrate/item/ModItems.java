package net.pulchrate.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import net.pulchrate.Asc_firstmod;

public class ModItems {
    public static final Item NETHERITE_LONGSWORD = registerItem("netherite_longsword",
            new SwordItem(ModToolMaterial.NETHERITE, 4, -2.8f,
                new FabricItemSettings().group(ItemGroup.COMBAT).maxCount(1).fireproof().rarity(Rarity.COMMON)));

    public static final Item NETHERITE_SCYTHE = registerItem("netherite_scythe",
            new SwordItem(ModToolMaterial.NETHERITE, 5, -3f,
                    new FabricItemSettings().group(ItemGroup.COMBAT).maxCount(1).fireproof().rarity(Rarity.COMMON)));

    public static final Item NETHERITE_GLAIVE = registerItem("netherite_glaive",
            new SwordItem(ModToolMaterial.NETHERITE, 6, -3.25f,
                    new FabricItemSettings().group(ItemGroup.COMBAT).maxCount(1).fireproof().rarity(Rarity.COMMON)));

    public static final Item NETHERITE_SWORD_UPGRADED = registerItem("upgraded_sword",
            new SwordItem(ModToolMaterial.NETHERITE, 5, -2.4f,
                    new FabricItemSettings().group(ItemGroup.COMBAT).maxCount(1).fireproof().rarity(Rarity.COMMON)));

    public static final Item NETHERITE_AXE_UPGRADED = registerItem("upgraded_axe",
            new SwordItem(ModToolMaterial.NETHERITE, 5, -2.4f,
                    new FabricItemSettings().group(ItemGroup.COMBAT).maxCount(1).fireproof().rarity(Rarity.COMMON)));

    public static final Item NETHERITE_MACE = registerItem("netherite_mace",
            new SwordItem(ModToolMaterial.NETHERITE, 5, -2.4f,
                    new FabricItemSettings().group(ItemGroup.COMBAT).maxCount(1).fireproof().rarity(Rarity.COMMON)));

    public static final Item NETHERITE_DAGGER = registerItem("netherite_dagger",
            new SwordItem(ModToolMaterial.NETHERITE, 5, -2.4f,
                    new FabricItemSettings().group(ItemGroup.COMBAT).maxCount(1).fireproof().rarity(Rarity.COMMON)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier("asc_firstmod",name), item);
    }


    public static void registerModItems(){
        Asc_firstmod.LOGGER.debug("Registering Mod Items for Ascilions! FirstMod");
    }

}
