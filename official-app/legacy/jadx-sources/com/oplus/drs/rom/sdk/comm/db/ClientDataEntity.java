package com.oplus.drs.rom.sdk.comm.db;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class ClientDataEntity {
    public static final String COL_APP_ID = "app_id";
    public static final String COL_CREATE_TIME = "create_time";
    public static final String COL_DATA = "data";
    public static final String COL_DATA_SIZE = "data_size";
    public static final String COL_EVENT_TIME = "event_time";
    public static final String COL_EXCEPTION_CODE = "exception_code";
    public static final String COL_EXCEPTION_TYPE = "exception_type";
    public static final String COL_ID = "_id";
    public static final String COL_IS_EXCEPTION_EVENT = "is_exception_event";
    public static final String COL_PRIORITY = "priority";
    public static final String COL_RETRY_COUNT = "retry_count";
    public static final String COL_STATUS = "status";
    public static final String COL_UPDATE_TIME = "update_time";
    public static final int STATUS_FAILED = 2;
    public static final int STATUS_PENDING = 0;
    public static final int STATUS_UPLOADING = 1;
    private long _id;
    private String appId;
    private long createTime;
    private String data;
    private int dataSize;
    private long eventTime;
    private String exceptionCode;
    private String exceptionType;
    private int isExceptionEvent;
    private int priority;
    private int retryCount;
    private int status;
    private long updateTime;

    public ClientDataEntity() {
        this.status = 0;
        this.retryCount = 0;
        this.createTime = System.currentTimeMillis();
        this.updateTime = System.currentTimeMillis();
        this.priority = 1;
        this.isExceptionEvent = 0;
    }

    public boolean canRetry(int i) {
        return this.status == 0 && this.retryCount < i;
    }

    public long getAgeInHours() {
        return (System.currentTimeMillis() - this.createTime) / 3600000;
    }

    public String getAppId() {
        return this.appId;
    }

    public long getCreateTime() {
        return this.createTime;
    }

    public String getData() {
        return this.data;
    }

    public int getDataSize() {
        return this.dataSize;
    }

    public long getEventTime() {
        return this.eventTime;
    }

    public String getExceptionCode() {
        return this.exceptionCode;
    }

    public String getExceptionType() {
        return this.exceptionType;
    }

    public long getId() {
        return this._id;
    }

    public int getIsExceptionEvent() {
        return this.isExceptionEvent;
    }

    public int getPriority() {
        return this.priority;
    }

    public int getRetryCount() {
        return this.retryCount;
    }

    public int getStatus() {
        return this.status;
    }

    public long getUpdateTime() {
        return this.updateTime;
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    public void setCreateTime(long j2) {
        this.createTime = j2;
    }

    public void setData(String str) {
        this.data = str;
    }

    public void setDataSize(int i) {
        this.dataSize = i;
    }

    public void setEventTime(long j2) {
        this.eventTime = j2;
    }

    public void setExceptionCode(String str) {
        this.exceptionCode = str;
    }

    public void setExceptionType(String str) {
        this.exceptionType = str;
    }

    public void setId(long j2) {
        this._id = j2;
    }

    public void setIsExceptionEvent(int i) {
        this.isExceptionEvent = i;
    }

    public void setPriority(int i) {
        this.priority = i;
    }

    public void setRetryCount(int i) {
        this.retryCount = i;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public void setUpdateTime(long j2) {
        this.updateTime = j2;
    }

    public String toString() {
        return "ClientDataEntity{_id=" + this._id + ", data='" + this.data + "', eventTime=" + this.eventTime + ", appId=" + this.appId + ", status=" + this.status + ", retryCount=" + this.retryCount + ", createTime=" + this.createTime + ", updateTime=" + this.updateTime + ", dataSize=" + this.dataSize + ", priority=" + this.priority + ", isExceptionEvent=" + this.isExceptionEvent + ", exceptionType='" + this.exceptionType + "', exceptionCode='" + this.exceptionCode + "'}";
    }

    public ClientDataEntity(long j2, String str, long j3, String str2, int i, int i2, long j4, long j5, int i3) {
        this.status = 0;
        this.retryCount = 0;
        this.createTime = System.currentTimeMillis();
        System.currentTimeMillis();
        this._id = j2;
        this.data = str;
        this.eventTime = j3;
        this.appId = str2;
        this.status = i;
        this.retryCount = i2;
        this.createTime = j4;
        this.updateTime = j5;
        this.dataSize = i3;
        this.priority = 1;
        this.isExceptionEvent = 0;
    }

    public ClientDataEntity(long j2, String str, long j3, String str2, int i, int i2, long j4, long j5, int i3, int i4, int i5, String str3, String str4) {
        this.status = 0;
        this.retryCount = 0;
        this.createTime = System.currentTimeMillis();
        System.currentTimeMillis();
        this._id = j2;
        this.data = str;
        this.eventTime = j3;
        this.appId = str2;
        this.status = i;
        this.retryCount = i2;
        this.createTime = j4;
        this.updateTime = j5;
        this.dataSize = i3;
        this.priority = i4;
        this.isExceptionEvent = i5;
        this.exceptionType = str3;
        this.exceptionCode = str4;
    }
}
