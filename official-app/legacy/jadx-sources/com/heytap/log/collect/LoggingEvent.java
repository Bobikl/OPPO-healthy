package com.heytap.log.collect;

import com.heytap.log.appender.Layout.Layout;
import java.util.HashMap;

/* JADX INFO: loaded from: classes19.dex */
public class LoggingEvent {
    private HashMap<String, String> mExtras;
    private Layout mLayout;
    private Object mMessage;
    private byte mPriority;
    private String mTag;
    private String mThreadName;
    private Boolean mShowConsole = null;
    private long mTimeStamp = System.currentTimeMillis();

    public LoggingEvent(String str, Object obj, byte b, String str2, HashMap<String, String> map, Layout layout) {
        this.mMessage = obj;
        this.mTag = str;
        this.mPriority = b;
        this.mThreadName = str2;
        this.mExtras = map;
        this.mLayout = layout;
    }

    public HashMap<String, String> getExtras() {
        return this.mExtras;
    }

    public Layout getLayout() {
        return this.mLayout;
    }

    public Object getMessage() {
        return this.mMessage;
    }

    public byte getPriority() {
        return this.mPriority;
    }

    public Boolean getShowConsole() {
        return this.mShowConsole;
    }

    public String getTag() {
        return this.mTag;
    }

    public String getThreadName() {
        return this.mThreadName;
    }

    public long getTimeStamp() {
        return this.mTimeStamp;
    }

    public void setExtras(HashMap<String, String> map) {
        this.mExtras = map;
    }

    public void setLayout(Layout layout) {
        this.mLayout = layout;
    }

    public void setMessage(String str) {
        this.mMessage = str;
    }

    public void setPriority(byte b) {
        this.mPriority = b;
    }

    public void setShowConsole(boolean z) {
        this.mShowConsole = Boolean.valueOf(z);
    }

    public void setTag(String str) {
        this.mTag = str;
    }

    public void setThreadName(String str) {
        this.mThreadName = str;
    }

    public void setTimeStamp(long j2) {
        this.mTimeStamp = j2;
    }
}
