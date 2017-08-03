package wtf.naftuli.logbackpro;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogbackPro extends Object {

  private static Logger logger = LoggerFactory.getLogger(LogbackPro.class);

  public static void main(String[] argv) {
    while (true) {
      logger.debug("A debug statement.");
      logger.info("An info statement.");
      logger.warn("A warning.");
      logger.error("An error.");

      try {
        Thread.sleep(5000);
      } catch (Exception e) {
        System.exit(1);
      }
    }
  }
}
