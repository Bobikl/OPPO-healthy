package com.heytap.log.core;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes19.dex */
class WriteAction {
    int flag;
    public byte level;
    long localTime;
    String log;
    public String spanContext;
    public String tag;
    long threadId;
    String threadName = "";
    boolean isKeyFlag = false;

    public boolean isValid() {
        return !TextUtils.isEmpty(this.log);
    }
}
