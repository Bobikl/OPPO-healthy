package com.heytap.health.health_archives.bean;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.f04;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0010"}, d2 = {"Lcom/heytap/health/health_archives/bean/ArchiveShareBean;", "", f04.KEY_SHARED_ID, "", "(Ljava/lang/String;)V", "getShareId", "()Ljava/lang/String;", "setShareId", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "health_archives_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ArchiveShareBean {

    @Nullable
    private String shareId;

    /* JADX WARN: Multi-variable type inference failed */
    public ArchiveShareBean() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ArchiveShareBean copy$default(ArchiveShareBean archiveShareBean, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = archiveShareBean.shareId;
        }
        return archiveShareBean.copy(str);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getShareId() {
        return this.shareId;
    }

    @NotNull
    public final ArchiveShareBean copy(@Nullable String shareId) {
        return new ArchiveShareBean(shareId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ArchiveShareBean) && Intrinsics.areEqual(this.shareId, ((ArchiveShareBean) other).shareId);
    }

    @Nullable
    public final String getShareId() {
        return this.shareId;
    }

    public int hashCode() {
        String str = this.shareId;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final void setShareId(@Nullable String str) {
        this.shareId = str;
    }

    @NotNull
    public String toString() {
        return "ArchiveShareBean(shareId=" + this.shareId + ")";
    }

    public ArchiveShareBean(@Nullable String str) {
        this.shareId = str;
    }

    public /* synthetic */ ArchiveShareBean(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
