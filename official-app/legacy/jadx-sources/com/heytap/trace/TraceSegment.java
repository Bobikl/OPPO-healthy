package com.heytap.trace;

import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u001d\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u00042\b\u00103\u001a\u0004\u0018\u00010\u0004J\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000405J\b\u00106\u001a\u00020\u0004H\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR*\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\rj\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001c\u0010!\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR\u001c\u0010$\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0006\"\u0004\b&\u0010\bR\u001a\u0010'\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0015\"\u0004\b)\u0010\u0017R\u001c\u0010*\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0006\"\u0004\b,\u0010\bR\u001c\u0010-\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0006\"\u0004\b/\u0010\b¨\u00067"}, d2 = {"Lcom/heytap/trace/TraceSegment;", "Ljava/io/Serializable;", "()V", "appPackage", "", "getAppPackage", "()Ljava/lang/String;", "setAppPackage", "(Ljava/lang/String;)V", SpeechConstant.KEY_APP_VERSION, "getAppVersion", "setAppVersion", "attachment", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "brand", "getBrand", "setBrand", "endTime", "", "getEndTime", "()J", "setEndTime", "(J)V", "errorMsg", "getErrorMsg", "setErrorMsg", "level", "getLevel", "setLevel", "methodName", "getMethodName", "setMethodName", "model", "getModel", "setModel", "serverIp", "getServerIp", "setServerIp", "startTime", "getStartTime", "setStartTime", "status", "getStatus", "setStatus", "traceId", "getTraceId", "setTraceId", "addAttachment", "", "key", "value", "getAttachment", "", "toString", "com.heytap.nearx.common"}, k = 1, mv = {1, 4, 0})
public final class TraceSegment implements Serializable {

    @Nullable
    private String appPackage;

    @Nullable
    private String appVersion;
    private final HashMap<String, String> attachment = new HashMap<>();

    @Nullable
    private String brand;
    private long endTime;

    @Nullable
    private String errorMsg;

    @Nullable
    private String level;

    @Nullable
    private String methodName;

    @Nullable
    private String model;

    @Nullable
    private String serverIp;
    private long startTime;

    @Nullable
    private String status;

    @Nullable
    private String traceId;

    public final void addAttachment(@Nullable String key, @Nullable String value) {
        if (key == null || key.length() == 0) {
            return;
        }
        if (value == null || value.length() == 0) {
            return;
        }
        this.attachment.put(key, value);
    }

    @Nullable
    public final String getAppPackage() {
        return this.appPackage;
    }

    @Nullable
    public final String getAppVersion() {
        return this.appVersion;
    }

    @NotNull
    public final Map<String, String> getAttachment() {
        return this.attachment;
    }

    @Nullable
    public final String getBrand() {
        return this.brand;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    @Nullable
    public final String getErrorMsg() {
        return this.errorMsg;
    }

    @Nullable
    public final String getLevel() {
        return this.level;
    }

    @Nullable
    public final String getMethodName() {
        return this.methodName;
    }

    @Nullable
    public final String getModel() {
        return this.model;
    }

    @Nullable
    public final String getServerIp() {
        return this.serverIp;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    public final String getTraceId() {
        return this.traceId;
    }

    public final void setAppPackage(@Nullable String str) {
        this.appPackage = str;
    }

    public final void setAppVersion(@Nullable String str) {
        this.appVersion = str;
    }

    public final void setBrand(@Nullable String str) {
        this.brand = str;
    }

    public final void setEndTime(long j2) {
        this.endTime = j2;
    }

    public final void setErrorMsg(@Nullable String str) {
        this.errorMsg = str;
    }

    public final void setLevel(@Nullable String str) {
        this.level = str;
    }

    public final void setMethodName(@Nullable String str) {
        this.methodName = str;
    }

    public final void setModel(@Nullable String str) {
        this.model = str;
    }

    public final void setServerIp(@Nullable String str) {
        this.serverIp = str;
    }

    public final void setStartTime(long j2) {
        this.startTime = j2;
    }

    public final void setStatus(@Nullable String str) {
        this.status = str;
    }

    public final void setTraceId(@Nullable String str) {
        this.traceId = str;
    }

    @NotNull
    public String toString() {
        return "AndroidTraceSegment{traceId='" + this.traceId + "', methodName='" + this.methodName + "', level='" + this.level + "', appPackage='" + this.appPackage + "', serverIp='" + this.serverIp + "', brand='" + this.brand + "', appVersion='" + this.appVersion + "', model='" + this.model + "', startTime=" + this.startTime + ", endTime=" + this.endTime + ", status='" + this.status + "', errorMsg='" + this.errorMsg + "', attachmentList='" + this.attachment.toString() + "}";
    }
}
