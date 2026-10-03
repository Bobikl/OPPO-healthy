package com.heytap.health.voiceassistant.tts;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0012\b\u0002\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0013\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0005HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0012\b\u0002\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R$\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/heytap/health/voiceassistant/tts/AppStatus;", "", "topApp", "", "runningApps", "", "(Ljava/lang/String;Ljava/util/List;)V", "getRunningApps", "()Ljava/util/List;", "setRunningApps", "(Ljava/util/List;)V", "getTopApp", "()Ljava/lang/String;", "setTopApp", "(Ljava/lang/String;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "voiceassistant_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class AppStatus {

    @Nullable
    private List<String> runningApps;

    @Nullable
    private String topApp;

    /* JADX WARN: Multi-variable type inference failed */
    public AppStatus() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AppStatus copy$default(AppStatus appStatus, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = appStatus.topApp;
        }
        if ((i & 2) != 0) {
            list = appStatus.runningApps;
        }
        return appStatus.copy(str, list);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTopApp() {
        return this.topApp;
    }

    @Nullable
    public final List<String> component2() {
        return this.runningApps;
    }

    @NotNull
    public final AppStatus copy(@Nullable String topApp, @Nullable List<String> runningApps) {
        return new AppStatus(topApp, runningApps);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppStatus)) {
            return false;
        }
        AppStatus appStatus = (AppStatus) other;
        return Intrinsics.areEqual(this.topApp, appStatus.topApp) && Intrinsics.areEqual(this.runningApps, appStatus.runningApps);
    }

    @Nullable
    public final List<String> getRunningApps() {
        return this.runningApps;
    }

    @Nullable
    public final String getTopApp() {
        return this.topApp;
    }

    public int hashCode() {
        String str = this.topApp;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<String> list = this.runningApps;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final void setRunningApps(@Nullable List<String> list) {
        this.runningApps = list;
    }

    public final void setTopApp(@Nullable String str) {
        this.topApp = str;
    }

    @NotNull
    public String toString() {
        return "AppStatus(topApp=" + this.topApp + ", runningApps=" + this.runningApps + ")";
    }

    public AppStatus(@Nullable String str, @Nullable List<String> list) {
        this.topApp = str;
        this.runningApps = list;
    }

    public /* synthetic */ AppStatus(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list);
    }
}
