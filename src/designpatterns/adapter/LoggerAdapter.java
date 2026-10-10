package designpatterns.adapter;

import designpatterns.adapter.thirdparty.logger.LoggerAPI;

public class LoggerAdapter implements ILogger {
    private LoggerAPI loggerAPI = new LoggerAPI();
    @Override
    public void log(String message) {
        loggerAPI.printLog(message.getBytes());
    }
}
