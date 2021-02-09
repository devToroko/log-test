package me.sickbbang.bravo_log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BravoLogTest {
    private static final Logger log = LoggerFactory.getLogger(BravoLogTest.class);
    public void run() {
        log.trace("trace!!!!!");
        log.debug("debug!!!!");
        log.info("info!!!!!");
        log.warn("warn!!!!!");
        log.error("error!!!!");
    }
}
