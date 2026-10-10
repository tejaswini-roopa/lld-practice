package designpatterns.adapter;

public class ApplicationCode {
    ILogger logger = LoggerFactory.getLoggerFromName("log4j");
    public ApplicationCode()
    {

    }
    void doSomething()
    {
        logger.log("Hey there");
    }
}
