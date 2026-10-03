package com.heytap.speech.engine.protocol.directive.template;

import androidx.annotation.Keep;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import com.heytap.speech.engine.protocol.directive.common.Action;
import com.heytap.speech.engine.protocol.directive.common.TrackingInfo;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR \u0010\u0012\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR \u0010\u0015\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR \u0010\u0018\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000eR\"\u0010\u001b\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010!\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R \u0010\"\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\f\"\u0004\b$\u0010\u000eR \u0010%\u001a\u0004\u0018\u00010&8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/template/AppInfo;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", "action", "Lcom/heytap/speech/engine/protocol/directive/common/Action;", "getAction", "()Lcom/heytap/speech/engine/protocol/directive/common/Action;", "setAction", "(Lcom/heytap/speech/engine/protocol/directive/common/Action;)V", "appId", "", "getAppId", "()Ljava/lang/String;", "setAppId", "(Ljava/lang/String;)V", "appLogo", "getAppLogo", "setAppLogo", "appName", "getAppName", "setAppName", "downloadDesc", "getDownloadDesc", "setDownloadDesc", "packageName", "getPackageName", "setPackageName", "resType", "", "getResType", "()Ljava/lang/Integer;", "setResType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "sizeDesc", "getSizeDesc", "setSizeDesc", "tracking", "Lcom/heytap/speech/engine/protocol/directive/common/TrackingInfo;", "getTracking", "()Lcom/heytap/speech/engine/protocol/directive/common/TrackingInfo;", "setTracking", "(Lcom/heytap/speech/engine/protocol/directive/common/TrackingInfo;)V", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class AppInfo extends DirectivePayload {

    @JsonProperty("action")
    @Nullable
    private Action action;

    @JsonProperty("appId")
    @Nullable
    private String appId;

    @JsonProperty("appLogo")
    @Nullable
    private String appLogo;

    @JsonProperty("appName")
    @Nullable
    private String appName;

    @JsonProperty("downloadDesc")
    @Nullable
    private String downloadDesc;

    @JsonProperty("packageName")
    @Nullable
    private String packageName;

    @JsonProperty("resType")
    @Nullable
    private Integer resType;

    @JsonProperty("sizeDesc")
    @Nullable
    private String sizeDesc;

    @JsonProperty("tracking")
    @Nullable
    private TrackingInfo tracking;

    @Nullable
    public final Action getAction() {
        return this.action;
    }

    @Nullable
    public final String getAppId() {
        return this.appId;
    }

    @Nullable
    public final String getAppLogo() {
        return this.appLogo;
    }

    @Nullable
    public final String getAppName() {
        return this.appName;
    }

    @Nullable
    public final String getDownloadDesc() {
        return this.downloadDesc;
    }

    @Nullable
    public final String getPackageName() {
        return this.packageName;
    }

    @Nullable
    public final Integer getResType() {
        return this.resType;
    }

    @Nullable
    public final String getSizeDesc() {
        return this.sizeDesc;
    }

    @Nullable
    public final TrackingInfo getTracking() {
        return this.tracking;
    }

    public final void setAction(@Nullable Action action) {
        this.action = action;
    }

    public final void setAppId(@Nullable String str) {
        this.appId = str;
    }

    public final void setAppLogo(@Nullable String str) {
        this.appLogo = str;
    }

    public final void setAppName(@Nullable String str) {
        this.appName = str;
    }

    public final void setDownloadDesc(@Nullable String str) {
        this.downloadDesc = str;
    }

    public final void setPackageName(@Nullable String str) {
        this.packageName = str;
    }

    public final void setResType(@Nullable Integer num) {
        this.resType = num;
    }

    public final void setSizeDesc(@Nullable String str) {
        this.sizeDesc = str;
    }

    public final void setTracking(@Nullable TrackingInfo trackingInfo) {
        this.tracking = trackingInfo;
    }
}
