package com.heytap.log.log;

import android.os.Process;
import com.heytap.log.collect.LoggingEvent;

/* JADX INFO: loaded from: classes19.dex */
public class LogBean {
    public static final int COMMON_LOG_TYPE = 0;
    public static final int EVENT_LOG_TYPE = 1;
    private LoggingEvent event;
    private boolean keyFlag;
    private byte level;
    private String log;
    private int logType;
    private int mark;
    private boolean showConsole;
    private String tag;
    private long threadLog;
    private String threadName;

    public LogBean(LoggingEvent loggingEvent, int i) {
        this.showConsole = false;
        this.keyFlag = false;
        this.event = loggingEvent;
        this.logType = i;
        this.mark = 1;
        this.threadName = Thread.currentThread().getName();
        this.threadLog = Process.myTid();
    }

    public LoggingEvent getEvent() {
        return this.event;
    }

    public byte getLevel() {
        return this.level;
    }

    public String getLog() {
        return this.log;
    }

    public int getLogType() {
        return this.logType;
    }

    public int getMark() {
        return this.mark;
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

    public boolean isKeyFlag() {
        return this.keyFlag;
    }

    public boolean isShowConsole() {
        return this.showConsole;
    }

    public void setEvent(LoggingEvent loggingEvent) {
        this.event = loggingEvent;
    }

    public void setKeyFlag(boolean z) {
        this.keyFlag = z;
    }

    public void setLevel(byte b) {
        this.level = b;
    }

    public void setLog(String str) {
        this.log = str;
    }

    public void setLogType(int i) {
        this.logType = i;
    }

    public void setMark(int i) {
        this.mark = i;
    }

    public void setShowConsole(boolean z) {
        this.showConsole = z;
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

    public String toString() {
        return "LogBean{tag='" + this.tag + "', level=" + ((int) this.level) + ", log='" + this.log + "', showConsole=" + this.showConsole + ", event=" + this.event + ", logType=" + this.logType + ", mark=" + this.mark + ", threadName='" + this.threadName + "', threadLog=" + this.threadLog + ", keyFlag=" + this.keyFlag + '}';
    }

    public LogBean(byte b, String str, String str2) {
        this.showConsole = false;
        this.mark = 0;
        this.keyFlag = false;
        this.tag = str;
        this.level = b;
        this.log = str2;
        this.threadName = Thread.currentThread().getName();
        this.threadLog = Process.myTid();
    }

    public LogBean(byte b, String str, String str2, boolean z) {
        this.mark = 0;
        this.keyFlag = false;
        this.tag = str;
        this.level = b;
        this.log = str2;
        this.showConsole = z;
        this.threadName = Thread.currentThread().getName();
        this.threadLog = Process.myTid();
    }
}
