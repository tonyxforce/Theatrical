package dev.imabad.theatrical.net;

import dev.architectury.networking.simple.MessageType;
import dev.architectury.networking.simple.SimpleNetworkManager;
import dev.imabad.theatrical.Theatrical;
import dev.imabad.theatrical.net.artnet.*;

public interface TheatricalNet {
    SimpleNetworkManager MAIN = SimpleNetworkManager.create(Theatrical.MOD_ID);
    // C2S
    MessageType SEND_ARTNET_TO_SERVER = MAIN.registerC2S("send_artnet_to_server", SendArtNetData::new);
    MessageType UPDATE_ARTNET_INTERFACE = MAIN.registerC2S("update_artnet_interface", UpdateArtNetInterface::new);
    MessageType UPDATE_DMX_FIXTURE = MAIN.registerC2S("update_dmx_fixture", UpdateDMXFixture::new);
    MessageType UPDATE_FIXTURE_POS = MAIN.registerC2S("update_fixture_pos", UpdateFixturePosition::new);
    MessageType RDM_UPDATE_FIXTURE = MAIN.registerC2S("rdm_update_fixture", RDMUpdateConsumer::new);
    MessageType REQUEST_CONSUMERS = MAIN.registerC2S("request_consumers", RequestConsumers::new);

    // S2C
    MessageType NOTIFY_CONSUMER_CHANGE = MAIN.registerS2C("notify_consumer_change", NotifyConsumerChange::new);
    MessageType LIST_CONSUMERS = MAIN.registerS2C("list_consumers", ListConsumers::new);
    static void init(){}
}
