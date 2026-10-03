package org.oconscrypt.metrics;

/* JADX INFO: loaded from: classes11.dex */
public class ReflexiveStatsLog {
    private static final Class<?> c_statsEvent;
    private static final Class<?> c_statsLog;
    private static final OptionalMethod write;

    static {
        Class<?> clsInitStatsLogClass = initStatsLogClass();
        c_statsLog = clsInitStatsLogClass;
        Class<?> clsInitStatsEventClass = initStatsEventClass();
        c_statsEvent = clsInitStatsEventClass;
        write = new OptionalMethod(clsInitStatsLogClass, "write", clsInitStatsEventClass);
    }

    private ReflexiveStatsLog() {
    }

    private static Class<?> initStatsEventClass() {
        try {
            return Class.forName("android.util.StatsEvent");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    private static Class<?> initStatsLogClass() {
        try {
            return Class.forName("android.util.StatsLog");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static void write(ReflexiveStatsEvent reflexiveStatsEvent) {
        Object statsEvent = reflexiveStatsEvent.getStatsEvent();
        if (statsEvent != null) {
            write.invokeStatic(statsEvent);
        }
    }
}
