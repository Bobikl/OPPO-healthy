package com.oplus.drs.core.config.entity;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes6.dex */
public class DebugModeEntity {
    public static final String KEY_APP_ID = "appId";
    public static final String KEY_AREA = "area";
    public static final String KEY_CODE = "code";
    public static final String KEY_END_AT = "endAt";
    public static final String KEY_SAMPLE = "sample";
    public static final String KEY_START_AT = "startAt";
    public static final String KEY_UPLOAD_TYPE = "uploadType";
    private final String appId;
    private final String area;
    private final String code;
    private final long endAt;
    private final int sample;
    private final long startAt;
    private final int uploadType;

    public DebugModeEntity(String str, String str2, int i, int i2, long j2, long j3, String str3) {
        this.appId = str;
        this.area = str2;
        this.uploadType = i;
        this.sample = i2;
        this.startAt = j2;
        this.endAt = j3;
        this.code = str3;
    }

    public String getAppId() {
        return this.appId;
    }

    public String getArea() {
        return this.area;
    }

    public String getCode() {
        return this.code;
    }

    public long getEndAt() {
        return this.endAt;
    }

    public int getSample() {
        return this.sample;
    }

    public long getStartAt() {
        return this.startAt;
    }

    public int getUploadType() {
        return this.uploadType;
    }

    @NonNull
    public String toString() {
        return "DebugModeEntity{appId='" + this.appId + "', area='" + this.area + "', uploadType=" + this.uploadType + ", sample=" + this.sample + ", startAt=" + this.startAt + ", endAt=" + this.endAt + ", code='" + this.code + "'}";
    }
}
