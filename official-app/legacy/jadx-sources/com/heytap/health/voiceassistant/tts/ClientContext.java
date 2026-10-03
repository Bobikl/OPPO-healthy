package com.heytap.health.voiceassistant.tts;

import androidx.annotation.Keep;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u001d\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000eR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\f\"\u0004\b\u001d\u0010\u000eR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\f\"\u0004\b \u0010\u000eR\u001c\u0010!\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\f\"\u0004\b#\u0010\u000eR\u001c\u0010$\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\f\"\u0004\b&\u0010\u000eR\u001c\u0010'\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\f\"\u0004\b)\u0010\u000eR\u001c\u0010*\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\f\"\u0004\b,\u0010\u000eR\u001c\u0010-\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\f\"\u0004\b/\u0010\u000e¨\u00060"}, d2 = {"Lcom/heytap/health/voiceassistant/tts/ClientContext;", "", "()V", "appStatus", "Lcom/heytap/health/voiceassistant/tts/AppStatus;", "getAppStatus", "()Lcom/heytap/health/voiceassistant/tts/AppStatus;", "setAppStatus", "(Lcom/heytap/health/voiceassistant/tts/AppStatus;)V", SpeechConstant.KEY_APP_VERSION, "", "getAppVersion", "()Ljava/lang/String;", "setAppVersion", "(Ljava/lang/String;)V", "channel", "getChannel", "setChannel", "colorosVersion", "", "getColorosVersion", "()I", "setColorosVersion", "(I)V", "cuid", "getCuid", "setCuid", "imei", "getImei", "setImei", "model", "getModel", "setModel", "packageName", "getPackageName", "setPackageName", "thirdPartDeviceId", "getThirdPartDeviceId", "setThirdPartDeviceId", SpeechConstant.KEY_USER_TOKEN, "getUserToken", "setUserToken", "videoStatus", "getVideoStatus", "setVideoStatus", "voiceStatus", "getVoiceStatus", "setVoiceStatus", "voiceassistant_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ClientContext {

    @Nullable
    private AppStatus appStatus;

    @Nullable
    private String appVersion;

    @Nullable
    private String channel;
    private int colorosVersion;

    @Nullable
    private String cuid;

    @Nullable
    private String imei;

    @Nullable
    private String model;

    @Nullable
    private String packageName;

    @Nullable
    private String thirdPartDeviceId;

    @Nullable
    private String userToken;

    @Nullable
    private String videoStatus;

    @Nullable
    private String voiceStatus;

    @Nullable
    public final AppStatus getAppStatus() {
        return this.appStatus;
    }

    @Nullable
    public final String getAppVersion() {
        return this.appVersion;
    }

    @Nullable
    public final String getChannel() {
        return this.channel;
    }

    public final int getColorosVersion() {
        return this.colorosVersion;
    }

    @Nullable
    public final String getCuid() {
        return this.cuid;
    }

    @Nullable
    public final String getImei() {
        return this.imei;
    }

    @Nullable
    public final String getModel() {
        return this.model;
    }

    @Nullable
    public final String getPackageName() {
        return this.packageName;
    }

    @Nullable
    public final String getThirdPartDeviceId() {
        return this.thirdPartDeviceId;
    }

    @Nullable
    public final String getUserToken() {
        return this.userToken;
    }

    @Nullable
    public final String getVideoStatus() {
        return this.videoStatus;
    }

    @Nullable
    public final String getVoiceStatus() {
        return this.voiceStatus;
    }

    public final void setAppStatus(@Nullable AppStatus appStatus) {
        this.appStatus = appStatus;
    }

    public final void setAppVersion(@Nullable String str) {
        this.appVersion = str;
    }

    public final void setChannel(@Nullable String str) {
        this.channel = str;
    }

    public final void setColorosVersion(int i) {
        this.colorosVersion = i;
    }

    public final void setCuid(@Nullable String str) {
        this.cuid = str;
    }

    public final void setImei(@Nullable String str) {
        this.imei = str;
    }

    public final void setModel(@Nullable String str) {
        this.model = str;
    }

    public final void setPackageName(@Nullable String str) {
        this.packageName = str;
    }

    public final void setThirdPartDeviceId(@Nullable String str) {
        this.thirdPartDeviceId = str;
    }

    public final void setUserToken(@Nullable String str) {
        this.userToken = str;
    }

    public final void setVideoStatus(@Nullable String str) {
        this.videoStatus = str;
    }

    public final void setVoiceStatus(@Nullable String str) {
        this.voiceStatus = str;
    }
}
