package dev.imabad.theatrical.fixtures;

import dev.architectury.registry.registries.Registrar;
import dev.architectury.registry.registries.RegistrySupplier;
import dev.imabad.theatrical.Theatrical;
import dev.imabad.theatrical.TheatricalRegistry;
import dev.imabad.theatrical.api.Fixture;
import net.minecraft.resources.ResourceLocation;

public class Fixtures {
	private static final ResourceLocation REGISTRY_ID = new ResourceLocation(Theatrical.MOD_ID, "fixtures");
	public static final Registrar<Fixture> FIXTURES = TheatricalRegistry.create(REGISTRY_ID);

	public static final RegistrySupplier<Fixture> MOVING_LIGHT =
		FIXTURES.register(new ResourceLocation(Theatrical.MOD_ID, "moving_light"), MovingLightFixture::new);

	public static void init() {
		// NOOP
	}
}
