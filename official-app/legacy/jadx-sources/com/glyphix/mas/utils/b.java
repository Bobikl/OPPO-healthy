package com.glyphix.mas.utils;

import com.oplus.aiunit.vision.ix3;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes13.dex */
public class b {
    private static b d = new b();
    private Logger a = Logger.getLogger("[Glyphix]");
    private boolean b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    FileHandler f2350c;

    public class a extends Formatter {
        private SimpleDateFormat a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");

        public a() {
        }

        @Override // java.util.logging.Formatter
        public String format(LogRecord logRecord) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.a.format(new Date(logRecord.getMillis())));
            sb.append(" 【Thread】 " + Thread.currentThread().getId() + " ");
            sb.append(logRecord.getLevel().getName());
            sb.append(": ");
            sb.append(formatMessage(logRecord));
            sb.append(System.lineSeparator());
            return sb.toString();
        }
    }

    public static b c() {
        return d;
    }

    private String d(String... strArr) {
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            sb.append(str);
            sb.append(" ");
        }
        return sb.toString();
    }

    public void a(Handler handler) {
        if (handler == null) {
            return;
        }
        this.a.addHandler(handler);
    }

    public void b() {
        this.b = true;
        this.a.setUseParentHandlers(false);
        FileHandler fileHandler = this.f2350c;
        if (fileHandler != null) {
            fileHandler.close();
            this.a.removeHandler(this.f2350c);
        }
    }

    public void e(String... strArr) {
        this.a.warning(d(strArr));
    }

    public void a(String str) {
        if (this.b) {
            return;
        }
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        FileHandler fileHandler = new FileHandler(str + "/glyphix%g.log", ix3.DEFAULT_MQTT_MAX_SIZE, 10, true);
        this.f2350c = fileHandler;
        fileHandler.setFormatter(new a());
        this.a.addHandler(this.f2350c);
    }

    public void b(String... strArr) {
        this.a.severe(d(strArr));
    }

    public void c(String... strArr) {
        this.a.info(d(strArr));
    }

    public void a(String... strArr) {
        this.a.fine(d(strArr));
    }

    public void a() {
        FileHandler fileHandler = this.f2350c;
        if (fileHandler != null) {
            fileHandler.close();
            this.a.removeHandler(this.f2350c);
        }
    }

    public void a(Exception exc) {
        this.a.log(Level.SEVERE, "", (Throwable) exc);
    }
}
