package com.heytap.health.hr.jni;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes16.dex */
@Keep
public interface HrLogListener {
    void debug(String str);

    void error(String str);

    void info(String str);
}
