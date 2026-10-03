package com.badlogic.gdx;

import com.oplus.aiunit.vision.af0;

/* JADX INFO: loaded from: classes13.dex */
public interface Application {
    public static final int LOG_DEBUG = 3;
    public static final int LOG_ERROR = 1;
    public static final int LOG_INFO = 2;
    public static final int LOG_NONE = 0;

    public enum ApplicationType {
        Android,
        Desktop,
        HeadlessDesktop,
        Applet,
        WebGL,
        iOS
    }

    void H(Runnable runnable);

    Graphics P();

    void b(String str, String str2, Throwable th);

    void c(String str, String str2);

    void debug(String str, String str2);

    void error(String str, String str2);

    void error(String str, String str2, Throwable th);

    ApplicationType getType();

    af0 o();
}
