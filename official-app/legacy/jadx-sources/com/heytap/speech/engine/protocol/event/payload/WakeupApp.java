package com.heytap.speech.engine.protocol.event.payload;

import androidx.annotation.Keep;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006HÆ\u0003J5\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R(\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/heytap/speech/engine/protocol/event/payload/WakeupApp;", "", "packageName", "", "version", "extra", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getExtra", "()Ljava/util/Map;", "setExtra", "(Ljava/util/Map;)V", "getPackageName", "()Ljava/lang/String;", "setPackageName", "(Ljava/lang/String;)V", "getVersion", "setVersion", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class WakeupApp {

    @Nullable
    private Map<String, ? extends Object> extra;

    @NotNull
    private String packageName;

    @NotNull
    private String version;

    public WakeupApp(@NotNull String packageName, @NotNull String version, @Nullable Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(version, "version");
        this.packageName = packageName;
        this.version = version;
        this.extra = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WakeupApp copy$default(WakeupApp wakeupApp, String str, String str2, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wakeupApp.packageName;
        }
        if ((i & 2) != 0) {
            str2 = wakeupApp.version;
        }
        if ((i & 4) != 0) {
            map = wakeupApp.extra;
        }
        return wakeupApp.copy(str, str2, map);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPackageName() {
        return this.packageName;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    @Nullable
    public final Map<String, Object> component3() {
        return this.extra;
    }

    @NotNull
    public final WakeupApp copy(@NotNull String packageName, @NotNull String version, @Nullable Map<String, ? extends Object> extra) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(version, "version");
        return new WakeupApp(packageName, version, extra);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WakeupApp)) {
            return false;
        }
        WakeupApp wakeupApp = (WakeupApp) other;
        return Intrinsics.areEqual(this.packageName, wakeupApp.packageName) && Intrinsics.areEqual(this.version, wakeupApp.version) && Intrinsics.areEqual(this.extra, wakeupApp.extra);
    }

    @Nullable
    public final Map<String, Object> getExtra() {
        return this.extra;
    }

    @NotNull
    public final String getPackageName() {
        return this.packageName;
    }

    @NotNull
    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        int iHashCode = ((this.packageName.hashCode() * 31) + this.version.hashCode()) * 31;
        Map<String, ? extends Object> map = this.extra;
        return iHashCode + (map == null ? 0 : map.hashCode());
    }

    public final void setExtra(@Nullable Map<String, ? extends Object> map) {
        this.extra = map;
    }

    public final void setPackageName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.packageName = str;
    }

    public final void setVersion(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.version = str;
    }

    @NotNull
    public String toString() {
        return "WakeupApp(packageName=" + this.packageName + ", version=" + this.version + ", extra=" + this.extra + ')';
    }

    public /* synthetic */ WakeupApp(String str, String str2, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : map);
    }
}
