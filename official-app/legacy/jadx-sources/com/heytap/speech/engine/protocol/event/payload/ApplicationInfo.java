package com.heytap.speech.engine.protocol.event.payload;

import androidx.annotation.Keep;
import com.heytap.log.consts.LogSenderConst;
import com.heytap.speech.engine.protocol.event.Payload;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u000fHÆ\u0003J\u0017\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J\u0017\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J\u0017\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\rHÆ\u0003J\u0097\u0001\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00052\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0003J\t\u0010.\u001a\u00020/HÖ\u0001J\t\u00100\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u00061"}, d2 = {"Lcom/heytap/speech/engine/protocol/event/payload/ApplicationInfo;", "Lcom/heytap/speech/engine/protocol/event/Payload;", LogSenderConst.PROTOCOLVERSION, "", "directiveVersion", "", "namespaceVersion", "eventVersion", SpeechConstant.KEY_APP_VERSION, "packageName", "channel", "appId", "asrConfig", "Lcom/heytap/speech/engine/protocol/event/payload/AsrInfo;", "ttsConfig", "Lcom/heytap/speech/engine/protocol/event/payload/TtsInfo;", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/heytap/speech/engine/protocol/event/payload/AsrInfo;Lcom/heytap/speech/engine/protocol/event/payload/TtsInfo;)V", "getAppId", "()Ljava/lang/String;", "getAppVersion", "getAsrConfig", "()Lcom/heytap/speech/engine/protocol/event/payload/AsrInfo;", "getChannel", "getDirectiveVersion", "()Ljava/util/Map;", "getEventVersion", "getNamespaceVersion", "getPackageName", "getProtocolVersion", "getTtsConfig", "()Lcom/heytap/speech/engine/protocol/event/payload/TtsInfo;", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "", "toString", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class ApplicationInfo extends Payload {

    @NotNull
    private final String appId;

    @NotNull
    private final String appVersion;

    @NotNull
    private final AsrInfo asrConfig;

    @NotNull
    private final String channel;

    @Nullable
    private final Map<String, String> directiveVersion;

    @Nullable
    private final Map<String, String> eventVersion;

    @Nullable
    private final Map<String, String> namespaceVersion;

    @NotNull
    private final String packageName;

    @NotNull
    private final String protocolVersion;

    @NotNull
    private final TtsInfo ttsConfig;

    public /* synthetic */ ApplicationInfo(String str, Map map, Map map2, Map map3, String str2, String str3, String str4, String str5, AsrInfo asrInfo, TtsInfo ttsInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, map, map2, (i & 8) != 0 ? null : map3, str2, str3, str4, str5, asrInfo, ttsInfo);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getProtocolVersion() {
        return this.protocolVersion;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final TtsInfo getTtsConfig() {
        return this.ttsConfig;
    }

    @Nullable
    public final Map<String, String> component2() {
        return this.directiveVersion;
    }

    @Nullable
    public final Map<String, String> component3() {
        return this.namespaceVersion;
    }

    @Nullable
    public final Map<String, String> component4() {
        return this.eventVersion;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAppVersion() {
        return this.appVersion;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getPackageName() {
        return this.packageName;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getChannel() {
        return this.channel;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getAppId() {
        return this.appId;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final AsrInfo getAsrConfig() {
        return this.asrConfig;
    }

    @NotNull
    public final ApplicationInfo copy(@NotNull String protocolVersion, @Nullable Map<String, String> directiveVersion, @Nullable Map<String, String> namespaceVersion, @Nullable Map<String, String> eventVersion, @NotNull String appVersion, @NotNull String packageName, @NotNull String channel, @NotNull String appId, @NotNull AsrInfo asrConfig, @NotNull TtsInfo ttsConfig) {
        Intrinsics.checkNotNullParameter(protocolVersion, "protocolVersion");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(asrConfig, "asrConfig");
        Intrinsics.checkNotNullParameter(ttsConfig, "ttsConfig");
        return new ApplicationInfo(protocolVersion, directiveVersion, namespaceVersion, eventVersion, appVersion, packageName, channel, appId, asrConfig, ttsConfig);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApplicationInfo)) {
            return false;
        }
        ApplicationInfo applicationInfo = (ApplicationInfo) other;
        return Intrinsics.areEqual(this.protocolVersion, applicationInfo.protocolVersion) && Intrinsics.areEqual(this.directiveVersion, applicationInfo.directiveVersion) && Intrinsics.areEqual(this.namespaceVersion, applicationInfo.namespaceVersion) && Intrinsics.areEqual(this.eventVersion, applicationInfo.eventVersion) && Intrinsics.areEqual(this.appVersion, applicationInfo.appVersion) && Intrinsics.areEqual(this.packageName, applicationInfo.packageName) && Intrinsics.areEqual(this.channel, applicationInfo.channel) && Intrinsics.areEqual(this.appId, applicationInfo.appId) && Intrinsics.areEqual(this.asrConfig, applicationInfo.asrConfig) && Intrinsics.areEqual(this.ttsConfig, applicationInfo.ttsConfig);
    }

    @NotNull
    public final String getAppId() {
        return this.appId;
    }

    @NotNull
    public final String getAppVersion() {
        return this.appVersion;
    }

    @NotNull
    public final AsrInfo getAsrConfig() {
        return this.asrConfig;
    }

    @NotNull
    public final String getChannel() {
        return this.channel;
    }

    @Nullable
    public final Map<String, String> getDirectiveVersion() {
        return this.directiveVersion;
    }

    @Nullable
    public final Map<String, String> getEventVersion() {
        return this.eventVersion;
    }

    @Nullable
    public final Map<String, String> getNamespaceVersion() {
        return this.namespaceVersion;
    }

    @NotNull
    public final String getPackageName() {
        return this.packageName;
    }

    @NotNull
    public final String getProtocolVersion() {
        return this.protocolVersion;
    }

    @NotNull
    public final TtsInfo getTtsConfig() {
        return this.ttsConfig;
    }

    public int hashCode() {
        int iHashCode = this.protocolVersion.hashCode() * 31;
        Map<String, String> map = this.directiveVersion;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, String> map2 = this.namespaceVersion;
        int iHashCode3 = (iHashCode2 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map<String, String> map3 = this.eventVersion;
        return ((((((((((((iHashCode3 + (map3 != null ? map3.hashCode() : 0)) * 31) + this.appVersion.hashCode()) * 31) + this.packageName.hashCode()) * 31) + this.channel.hashCode()) * 31) + this.appId.hashCode()) * 31) + this.asrConfig.hashCode()) * 31) + this.ttsConfig.hashCode();
    }

    @NotNull
    public String toString() {
        return "ApplicationInfo(protocolVersion=" + this.protocolVersion + ", directiveVersion=" + this.directiveVersion + ", namespaceVersion=" + this.namespaceVersion + ", eventVersion=" + this.eventVersion + ", appVersion=" + this.appVersion + ", packageName=" + this.packageName + ", channel=" + this.channel + ", appId=" + this.appId + ", asrConfig=" + this.asrConfig + ", ttsConfig=" + this.ttsConfig + ')';
    }

    public ApplicationInfo(@NotNull String protocolVersion, @Nullable Map<String, String> map, @Nullable Map<String, String> map2, @Nullable Map<String, String> map3, @NotNull String appVersion, @NotNull String packageName, @NotNull String channel, @NotNull String appId, @NotNull AsrInfo asrConfig, @NotNull TtsInfo ttsConfig) {
        Intrinsics.checkNotNullParameter(protocolVersion, "protocolVersion");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(asrConfig, "asrConfig");
        Intrinsics.checkNotNullParameter(ttsConfig, "ttsConfig");
        this.protocolVersion = protocolVersion;
        this.directiveVersion = map;
        this.namespaceVersion = map2;
        this.eventVersion = map3;
        this.appVersion = appVersion;
        this.packageName = packageName;
        this.channel = channel;
        this.appId = appId;
        this.asrConfig = asrConfig;
        this.ttsConfig = ttsConfig;
    }
}
