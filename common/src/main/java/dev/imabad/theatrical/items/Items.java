package dev.imabad.theatrical.items;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import dev.imabad.theatrical.Theatrical;
import dev.imabad.theatrical.TheatricalRegistry;
import dev.imabad.theatrical.blocks.Blocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;

public class Items {
    public static final DeferredRegister<Item> ITEMS = TheatricalRegistry.get(Registries.ITEM);
    public static final RegistrySupplier<Item> MOVING_LIGHT = ITEMS.register(
        "moving_light",
        () -> new BlockItem(Blocks.MOVING_LIGHT_BLOCK.get(), new Item.Properties().arch$tab(Theatrical.TAB))
    );
    public static final RegistrySupplier<Item> PIPE = ITEMS.register(
        "pipe",
        () -> new BlockItem(Blocks.PIPE_BLOCK.get(), new Item.Properties().arch$tab(Theatrical.TAB))
    );
    public static final RegistrySupplier<Item> ART_NET_INTERFACE = ITEMS.register(
        "artnet_interface",
        () -> new BlockItem(Blocks.ART_NET_INTERFACE.get(), new Item.Properties().arch$tab(Theatrical.TAB))
    );
    public static final RegistrySupplier<Item> BUNDLED_CABLE = ITEMS.register("bundled_cable", BundledCableItem::new);
}
