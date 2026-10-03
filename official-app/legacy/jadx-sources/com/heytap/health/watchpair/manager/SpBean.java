package com.heytap.health.watchpair.manager;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/heytap/health/watchpair/manager/SpBean;", "", "md5", "", "lastTime", "", "(Ljava/lang/String;J)V", "getLastTime", "()J", "setLastTime", "(J)V", "getMd5", "()Ljava/lang/String;", "setMd5", "(Ljava/lang/String;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SpBean {
    private long lastTime;

    @Nullable
    private String md5;

    public SpBean() {
        this(null, 0L, 3, null);
    }

    public static /* synthetic */ SpBean copy$default(SpBean spBean, String str, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = spBean.md5;
        }
        if ((i & 2) != 0) {
            j2 = spBean.lastTime;
        }
        return spBean.copy(str, j2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMd5() {
        return this.md5;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getLastTime() {
        return this.lastTime;
    }

    @NotNull
    public final SpBean copy(@Nullable String md5, long lastTime) {
        return new SpBean(md5, lastTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpBean)) {
            return false;
        }
        SpBean spBean = (SpBean) other;
        return Intrinsics.areEqual(this.md5, spBean.md5) && this.lastTime == spBean.lastTime;
    }

    public final long getLastTime() {
        return this.lastTime;
    }

    @Nullable
    public final String getMd5() {
        return this.md5;
    }

    public int hashCode() {
        String str = this.md5;
        return ((str == null ? 0 : str.hashCode()) * 31) + Long.hashCode(this.lastTime);
    }

    public final void setLastTime(long j2) {
        this.lastTime = j2;
    }

    public final void setMd5(@Nullable String str) {
        this.md5 = str;
    }

    @NotNull
    public String toString() {
        return "SpBean(md5=" + this.md5 + ", lastTime=" + this.lastTime + ")";
    }

    public SpBean(@Nullable String str, long j2) {
        this.md5 = str;
        this.lastTime = j2;
    }

    public /* synthetic */ SpBean(String str, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0L : j2);
    }
}
