package com.heytap.log;

/* JADX INFO: loaded from: classes19.dex */
public class CachedLogBean {
    private byte level;
    private String message;
    private boolean showConsole;
    private String tag;
    private long timestamp;

    public byte getLevel() {
        return this.level;
    }

    public String getMessage() {
        return this.message;
    }

    public String getTag() {
        return this.tag;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public boolean isShowConsole() {
        return this.showConsole;
    }

    public void setLevel(byte b) {
        this.level = b;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setShowConsole(boolean z) {
        this.showConsole = z;
    }

    public void setTag(String str) {
        this.tag = str;
    }

    public void setTimestamp(long j2) {
        this.timestamp = j2;
    }
}
