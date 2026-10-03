package com.glyphix.mas.utils;

import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* JADX INFO: loaded from: classes13.dex */
public abstract class c extends Handler {
    public void a() {
        b.c().b();
    }

    public abstract void a(String str);

    public abstract void b(String str);

    public abstract void c(String str);

    @Override // java.util.logging.Handler
    public void close() {
    }

    public abstract void d(String str);

    @Override // java.util.logging.Handler
    public void flush() {
    }

    @Override // java.util.logging.Handler
    public void publish(LogRecord logRecord) {
        String str = logRecord.getLoggerName() + " " + logRecord.getMessage();
        Level level = logRecord.getLevel();
        if (level.equals(Level.FINE) || level.equals(Level.CONFIG)) {
            a(str);
            return;
        }
        if (!level.equals(Level.INFO)) {
            if (level.equals(Level.WARNING)) {
                d(str);
                return;
            } else if (level.equals(Level.SEVERE)) {
                b(str);
                return;
            }
        }
        c(str);
    }
}
