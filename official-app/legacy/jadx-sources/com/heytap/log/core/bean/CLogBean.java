package com.heytap.log.core.bean;

/* JADX INFO: loaded from: classes19.dex */
public class CLogBean {
    private String msg;
    private byte priority;
    private String tag;
    private int type;
    private boolean isKeyFlag = false;
    private String threadName = Thread.currentThread().getName();
    private long threadLog = Thread.currentThread().getId();

    public String getMsg() {
        return this.msg;
    }

    public byte getPriority() {
        return this.priority;
    }

    public String getTag() {
        return this.tag;
    }

    public long getThreadLog() {
        return this.threadLog;
    }

    public String getThreadName() {
        return this.threadName;
    }

    public int getType() {
        return this.type;
    }

    public boolean isKeyFlag() {
        return this.isKeyFlag;
    }

    public void setKeyFlag(boolean z) {
        this.isKeyFlag = z;
    }

    public void setMsg(String str) {
        this.msg = str;
    }

    public void setPriority(byte b) {
        this.priority = b;
    }

    public void setTag(String str) {
        this.tag = str;
    }

    public void setThreadLog(long j2) {
        this.threadLog = j2;
    }

    public void setThreadName(String str) {
        this.threadName = str;
    }

    public void setType(int i) {
        this.type = i;
    }
}
