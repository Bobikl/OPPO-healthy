package com.heytap.log.core;

/* JADX INFO: loaded from: classes19.dex */
public interface LoganProtocolHandler {
    void logan_clean();

    void logan_debug(boolean z);

    void logan_flush();

    void logan_init(String str, String str2, int i, String str3, String str4, int i2);

    void logan_open(String str);

    void logan_write(int i, String str, long j2, String str2, long j3);

    void setOnLoganProtocolStatus(OnLoganProtocolStatus onLoganProtocolStatus);
}
