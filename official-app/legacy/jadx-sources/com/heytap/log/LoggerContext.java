package com.heytap.log;

import java.util.HashMap;

/* JADX INFO: loaded from: classes19.dex */
public class LoggerContext {
    private static volatile LoggerContext instance;
    private final HashMap<String, Logger> loggers = new HashMap<>();

    private LoggerContext() {
    }

    public static LoggerContext getInstance() {
        if (instance == null) {
            synchronized (LoggerContext.class) {
                if (instance == null) {
                    instance = new LoggerContext();
                }
            }
        }
        return instance;
    }

    public Logger getLogger(Settings settings) {
        String str = settings.getBusiness() + "_" + settings.getMdpName();
        synchronized (this.loggers) {
            if (this.loggers.containsKey(str)) {
                return this.loggers.get(str);
            }
            Logger logger = new Logger();
            logger.init(settings);
            this.loggers.put(str, logger);
            return logger;
        }
    }
}
