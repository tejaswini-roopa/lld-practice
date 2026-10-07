package adapter;

import adapter.thirdparty.log4j.Log4JSDK;

public class Log4JAdapter implements ILogger {
    private Log4JSDK log4J = new Log4JSDK();
    public void log(String message) {
        log4J.sendStream(message);
    }
}
