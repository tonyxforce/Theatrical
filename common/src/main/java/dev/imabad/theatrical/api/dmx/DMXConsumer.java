package dev.imabad.theatrical.api.dmx;

import ch.bildspur.artnet.rdm.RDMDeviceId;
import net.minecraft.resources.ResourceLocation;

public interface DMXConsumer {

    int getChannelCount();

    int getChannelStart();

    int getUniverse();

    void consume(byte[] dmxValues);

    RDMDeviceId getDeviceId();

    int getDeviceTypeId();

    String getModelName();

    ResourceLocation getFixtureId();

    int getActivePersonality();

}
