package de.kesuaheli.streamname;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StreamName implements ModInitializer {
  public static final Logger LOGGER = LoggerFactory.getLogger(StreamName.class);

  @Override
  public void onInitialize() {
    LOGGER.info("Hello Server!");
  }
}
