package com.heytap.health.esim.nec.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J2\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0003H\u0016J\t\u0010\u0018\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/heytap/health/esim/nec/bean/Switch93ConfigBean;", "", "minColorOSVersion", "", "blackWatchModelList", "", "", "activeSupport", "(I[Ljava/lang/String;I)V", "getActiveSupport", "()I", "getBlackWatchModelList", "()[Ljava/lang/String;", "[Ljava/lang/String;", "getMinColorOSVersion", "component1", "component2", "component3", "copy", "(I[Ljava/lang/String;I)Lcom/heytap/health/esim/nec/bean/Switch93ConfigBean;", "equals", "", "other", "hashCode", "toString", "esim_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class Switch93ConfigBean {
    public static final int $stable = 8;
    private final int activeSupport;

    @NotNull
    private final String[] blackWatchModelList;
    private final int minColorOSVersion;

    public Switch93ConfigBean(int i, @NotNull String[] blackWatchModelList, int i2) {
        Intrinsics.checkNotNullParameter(blackWatchModelList, "blackWatchModelList");
        this.minColorOSVersion = i;
        this.blackWatchModelList = blackWatchModelList;
        this.activeSupport = i2;
    }

    public static /* synthetic */ Switch93ConfigBean copy$default(Switch93ConfigBean switch93ConfigBean, int i, String[] strArr, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = switch93ConfigBean.minColorOSVersion;
        }
        if ((i3 & 2) != 0) {
            strArr = switch93ConfigBean.blackWatchModelList;
        }
        if ((i3 & 4) != 0) {
            i2 = switch93ConfigBean.activeSupport;
        }
        return switch93ConfigBean.copy(i, strArr, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getMinColorOSVersion() {
        return this.minColorOSVersion;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String[] getBlackWatchModelList() {
        return this.blackWatchModelList;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getActiveSupport() {
        return this.activeSupport;
    }

    @NotNull
    public final Switch93ConfigBean copy(int minColorOSVersion, @NotNull String[] blackWatchModelList, int activeSupport) {
        Intrinsics.checkNotNullParameter(blackWatchModelList, "blackWatchModelList");
        return new Switch93ConfigBean(minColorOSVersion, blackWatchModelList, activeSupport);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(Switch93ConfigBean.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.heytap.health.esim.nec.bean.Switch93ConfigBean");
        Switch93ConfigBean switch93ConfigBean = (Switch93ConfigBean) other;
        return this.minColorOSVersion == switch93ConfigBean.minColorOSVersion && this.activeSupport == switch93ConfigBean.activeSupport && Arrays.equals(this.blackWatchModelList, switch93ConfigBean.blackWatchModelList);
    }

    public final int getActiveSupport() {
        return this.activeSupport;
    }

    @NotNull
    public final String[] getBlackWatchModelList() {
        return this.blackWatchModelList;
    }

    public final int getMinColorOSVersion() {
        return this.minColorOSVersion;
    }

    public int hashCode() {
        return (((this.minColorOSVersion * 31) + this.activeSupport) * 31) + Arrays.hashCode(this.blackWatchModelList);
    }

    @NotNull
    public String toString() {
        return "Switch93ConfigBean(minColorOSVersion=" + this.minColorOSVersion + ", blackWatchModelList=" + Arrays.toString(this.blackWatchModelList) + ", activeSupport=" + this.activeSupport + ")";
    }
}
