package net.y_dash.minecraft.enderdragon_craftable_spawn_egg_mod.enderdragoncraftablespawneggmod;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SpawnEggItem;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import static net.minecraft.entity.EntityType.ENDER_DRAGON;

@Mod("enderdragon-craftable-spawn-egg-mod")
public class EnderdragonCraftableSpawnEggMod {

    public EnderdragonCraftableSpawnEggMod() {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> itemRegistryEvent) {
            itemRegistryEvent.getRegistry().registerAll(Items.ENDERDRAGON_CRAFTABLE_SPAWN_EGG);
        }
    }

    public static class Items {
        public static final SpawnEggItem ENDERDRAGON_CRAFTABLE_SPAWN_EGG = (SpawnEggItem) new SpawnEggItem(ENDER_DRAGON, 0x000000FF, 0x000000FF, new net.minecraft.item.Item.Properties()
                .group(ItemGroup.MISC))
                .setRegistryName("enderdragon_craftable_spawn_egg");
    }
}
