package com.heytap.speech.engine.protocol.directive.multimedia;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import com.heytap.store.base.core.util.deeplink.DeepLinkInterpreter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b)\b\u0007\u0018\u0000 02\u00020\u0001:\u00011B\u0007¢\u0006\u0004\b.\u0010/R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR$\u0010\u0013\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR$\u0010\u0016\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u000b\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000fR$\u0010\u0019\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u000b\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000fR$\u0010\u001c\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u000b\u001a\u0004\b\u001d\u0010\r\"\u0004\b\u001e\u0010\u000fR$\u0010\u001f\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u000b\u001a\u0004\b \u0010\r\"\u0004\b!\u0010\u000fR$\u0010\"\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u000b\u001a\u0004\b#\u0010\r\"\u0004\b$\u0010\u000fR$\u0010%\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u000b\u001a\u0004\b&\u0010\r\"\u0004\b'\u0010\u000fR$\u0010(\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010\u000b\u001a\u0004\b)\u0010\r\"\u0004\b*\u0010\u000fR$\u0010+\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010\u000b\u001a\u0004\b,\u0010\r\"\u0004\b-\u0010\u000f¨\u00062"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/multimedia/PlaySingleAudio;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "Lcom/heytap/speech/engine/protocol/directive/multimedia/AudioData;", "data", "Lcom/heytap/speech/engine/protocol/directive/multimedia/AudioData;", "getData", "()Lcom/heytap/speech/engine/protocol/directive/multimedia/AudioData;", "setData", "(Lcom/heytap/speech/engine/protocol/directive/multimedia/AudioData;)V", "", "bgPictureUrl", "Ljava/lang/String;", "getBgPictureUrl", "()Ljava/lang/String;", "setBgPictureUrl", "(Ljava/lang/String;)V", "appIconUrl", "getAppIconUrl", "setAppIconUrl", "appDarkModeIconUrl", "getAppDarkModeIconUrl", "setAppDarkModeIconUrl", "appName", "getAppName", "setAppName", "packageName", "getPackageName", "setPackageName", "quickAppLink", "getQuickAppLink", "setQuickAppLink", "traceId", "getTraceId", "setTraceId", "sceneId", "getSceneId", "setSceneId", DeepLinkInterpreter.KEY_DEEP_LINK, "getDeepLink", "setDeepLink", "speak", "getSpeak", "setSpeak", "type", "getType", "setType", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class PlaySingleAudio extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.0";

    @Nullable
    private String appDarkModeIconUrl;

    @Nullable
    private String appIconUrl;

    @Nullable
    private String appName;

    @Nullable
    private String bgPictureUrl;

    @Nullable
    private AudioData data;

    @Nullable
    private String deepLink;

    @Nullable
    private String packageName;

    @Nullable
    private String quickAppLink;

    @Nullable
    private String sceneId;

    @Nullable
    private String speak;

    @Nullable
    private String traceId;

    @Nullable
    private String type;

    @Nullable
    public final String getAppDarkModeIconUrl() {
        return this.appDarkModeIconUrl;
    }

    @Nullable
    public final String getAppIconUrl() {
        return this.appIconUrl;
    }

    @Nullable
    public final String getAppName() {
        return this.appName;
    }

    @Nullable
    public final String getBgPictureUrl() {
        return this.bgPictureUrl;
    }

    @Nullable
    public final AudioData getData() {
        return this.data;
    }

    @Nullable
    public final String getDeepLink() {
        return this.deepLink;
    }

    @Nullable
    public final String getPackageName() {
        return this.packageName;
    }

    @Nullable
    public final String getQuickAppLink() {
        return this.quickAppLink;
    }

    @Nullable
    public final String getSceneId() {
        return this.sceneId;
    }

    @Nullable
    public final String getSpeak() {
        return this.speak;
    }

    @Nullable
    public final String getTraceId() {
        return this.traceId;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public final void setAppDarkModeIconUrl(@Nullable String str) {
        this.appDarkModeIconUrl = str;
    }

    public final void setAppIconUrl(@Nullable String str) {
        this.appIconUrl = str;
    }

    public final void setAppName(@Nullable String str) {
        this.appName = str;
    }

    public final void setBgPictureUrl(@Nullable String str) {
        this.bgPictureUrl = str;
    }

    public final void setData(@Nullable AudioData audioData) {
        this.data = audioData;
    }

    public final void setDeepLink(@Nullable String str) {
        this.deepLink = str;
    }

    public final void setPackageName(@Nullable String str) {
        this.packageName = str;
    }

    public final void setQuickAppLink(@Nullable String str) {
        this.quickAppLink = str;
    }

    public final void setSceneId(@Nullable String str) {
        this.sceneId = str;
    }

    public final void setSpeak(@Nullable String str) {
        this.speak = str;
    }

    public final void setTraceId(@Nullable String str) {
        this.traceId = str;
    }

    public final void setType(@Nullable String str) {
        this.type = str;
    }
}
