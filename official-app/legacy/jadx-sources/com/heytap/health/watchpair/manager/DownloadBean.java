package com.heytap.health.watchpair.manager;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/heytap/health/watchpair/manager/DownloadBean;", "", "path", "", "md5", "(Ljava/lang/String;Ljava/lang/String;)V", "getMd5", "()Ljava/lang/String;", "getPath", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class DownloadBean {

    @NotNull
    private final String md5;

    @NotNull
    private final String path;

    public DownloadBean(@NotNull String path, @NotNull String md5) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(md5, "md5");
        this.path = path;
        this.md5 = md5;
    }

    public static /* synthetic */ DownloadBean copy$default(DownloadBean downloadBean, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = downloadBean.path;
        }
        if ((i & 2) != 0) {
            str2 = downloadBean.md5;
        }
        return downloadBean.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMd5() {
        return this.md5;
    }

    @NotNull
    public final DownloadBean copy(@NotNull String path, @NotNull String md5) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(md5, "md5");
        return new DownloadBean(path, md5);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DownloadBean)) {
            return false;
        }
        DownloadBean downloadBean = (DownloadBean) other;
        return Intrinsics.areEqual(this.path, downloadBean.path) && Intrinsics.areEqual(this.md5, downloadBean.md5);
    }

    @NotNull
    public final String getMd5() {
        return this.md5;
    }

    @NotNull
    public final String getPath() {
        return this.path;
    }

    public int hashCode() {
        return (this.path.hashCode() * 31) + this.md5.hashCode();
    }

    @NotNull
    public String toString() {
        return "DownloadBean(path=" + this.path + ", md5=" + this.md5 + ")";
    }
}
