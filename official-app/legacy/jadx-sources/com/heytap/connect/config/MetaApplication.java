package com.heytap.connect.config;

import androidx.annotation.Keep;
import com.heytap.log.consts.LogSenderConst;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b$\u0010%J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u001e\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\u0004J\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\u0004J\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\u0004JZ\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00022\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0004J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u000e\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001c\u001a\u0004\b\u001d\u0010\u0004R'\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u001e\u001a\u0004\b\u001f\u0010\u0007R\u0019\u0010\f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b \u0010\u0004R\u0019\u0010\u000f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001c\u001a\u0004\b!\u0010\u0004R\u0019\u0010\u0011\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001c\u001a\u0004\b\"\u0010\u0004R\u0019\u0010\u0010\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001c\u001a\u0004\b#\u0010\u0004¨\u0006&"}, d2 = {"Lcom/heytap/connect/config/MetaApplication;", "", "", "component1", "()Ljava/lang/String;", "", "component2", "()Ljava/util/Map;", "component3", "component4", "component5", "component6", LogSenderConst.PROTOCOLVERSION, "directiveVersion", SpeechConstant.KEY_APP_VERSION, "packageName", "channel", "appId", "copy", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/heytap/connect/config/MetaApplication;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAppVersion", "Ljava/util/Map;", "getDirectiveVersion", "getProtocolVersion", "getPackageName", "getAppId", "getChannel", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "connect_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class MetaApplication {

    @NotNull
    private final String appId;

    @NotNull
    private final String appVersion;

    @NotNull
    private final String channel;

    @Nullable
    private final Map<String, String> directiveVersion;

    @NotNull
    private final String packageName;

    @NotNull
    private final String protocolVersion;

    public MetaApplication(@NotNull String protocolVersion, @Nullable Map<String, String> map, @NotNull String appVersion, @NotNull String packageName, @NotNull String channel, @NotNull String appId) {
        Intrinsics.checkNotNullParameter(protocolVersion, "protocolVersion");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(appId, "appId");
        this.protocolVersion = protocolVersion;
        this.directiveVersion = map;
        this.appVersion = appVersion;
        this.packageName = packageName;
        this.channel = channel;
        this.appId = appId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MetaApplication copy$default(MetaApplication metaApplication, String str, Map map, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = metaApplication.protocolVersion;
        }
        if ((i & 2) != 0) {
            map = metaApplication.directiveVersion;
        }
        Map map2 = map;
        if ((i & 4) != 0) {
            str2 = metaApplication.appVersion;
        }
        String str6 = str2;
        if ((i & 8) != 0) {
            str3 = metaApplication.packageName;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            str4 = metaApplication.channel;
        }
        String str8 = str4;
        if ((i & 32) != 0) {
            str5 = metaApplication.appId;
        }
        return metaApplication.copy(str, map2, str6, str7, str8, str5);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getProtocolVersion() {
        return this.protocolVersion;
    }

    @Nullable
    public final Map<String, String> component2() {
        return this.directiveVersion;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAppVersion() {
        return this.appVersion;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPackageName() {
        return this.packageName;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getChannel() {
        return this.channel;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getAppId() {
        return this.appId;
    }

    @NotNull
    public final MetaApplication copy(@NotNull String protocolVersion, @Nullable Map<String, String> directiveVersion, @NotNull String appVersion, @NotNull String packageName, @NotNull String channel, @NotNull String appId) {
        Intrinsics.checkNotNullParameter(protocolVersion, "protocolVersion");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(appId, "appId");
        return new MetaApplication(protocolVersion, directiveVersion, appVersion, packageName, channel, appId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MetaApplication)) {
            return false;
        }
        MetaApplication metaApplication = (MetaApplication) other;
        return Intrinsics.areEqual(this.protocolVersion, metaApplication.protocolVersion) && Intrinsics.areEqual(this.directiveVersion, metaApplication.directiveVersion) && Intrinsics.areEqual(this.appVersion, metaApplication.appVersion) && Intrinsics.areEqual(this.packageName, metaApplication.packageName) && Intrinsics.areEqual(this.channel, metaApplication.channel) && Intrinsics.areEqual(this.appId, metaApplication.appId);
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
    public final String getChannel() {
        return this.channel;
    }

    @Nullable
    public final Map<String, String> getDirectiveVersion() {
        return this.directiveVersion;
    }

    @NotNull
    public final String getPackageName() {
        return this.packageName;
    }

    @NotNull
    public final String getProtocolVersion() {
        return this.protocolVersion;
    }

    public int hashCode() {
        int iHashCode = this.protocolVersion.hashCode() * 31;
        Map<String, String> map = this.directiveVersion;
        return ((((((((iHashCode + (map == null ? 0 : map.hashCode())) * 31) + this.appVersion.hashCode()) * 31) + this.packageName.hashCode()) * 31) + this.channel.hashCode()) * 31) + this.appId.hashCode();
    }

    @NotNull
    public String toString() {
        return "MetaApplication(protocolVersion=" + this.protocolVersion + ", directiveVersion=" + this.directiveVersion + ", appVersion=" + this.appVersion + ", packageName=" + this.packageName + ", channel=" + this.channel + ", appId=" + this.appId + ')';
    }
}
