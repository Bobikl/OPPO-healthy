package com.heytap.health.sleepcheck.jni;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public interface SleepLogListener {
    void debug(String str);

    void error(String str);

    void info(String str);
}
