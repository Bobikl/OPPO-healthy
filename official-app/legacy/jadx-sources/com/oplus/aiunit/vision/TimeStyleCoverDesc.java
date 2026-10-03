package com.oplus.aiunit.vision;

import android.graphics.Rect;
import com.heytap.health.watchface.business.store.view.CoverDirection;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.hzj, reason: from toString */
/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001f\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u0017\u0010\u0017\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\t\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/oplus/aiunit/vision/hzj;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "source", "", "Landroid/graphics/Rect;", "b", "Ljava/util/List;", "()Ljava/util/List;", "coverRegions", "Lcom/heytap/health/watchface/business/store/view/CoverDirection;", "Lcom/heytap/health/watchface/business/store/view/CoverDirection;", "()Lcom/heytap/health/watchface/business/store/view/CoverDirection;", "coverDirection", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/heytap/health/watchface/business/store/view/CoverDirection;)V", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class TimeStyleCoverDesc {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final String source;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    public final List<Rect> coverRegions;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final CoverDirection coverDirection;

    public TimeStyleCoverDesc(@NotNull String source, @Nullable List<Rect> list, @NotNull CoverDirection coverDirection) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(coverDirection, "coverDirection");
        this.source = source;
        this.coverRegions = list;
        this.coverDirection = coverDirection;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final CoverDirection getCoverDirection() {
        return this.coverDirection;
    }

    @Nullable
    public final List<Rect> b() {
        return this.coverRegions;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimeStyleCoverDesc)) {
            return false;
        }
        TimeStyleCoverDesc timeStyleCoverDesc = (TimeStyleCoverDesc) other;
        return Intrinsics.areEqual(this.source, timeStyleCoverDesc.source) && Intrinsics.areEqual(this.coverRegions, timeStyleCoverDesc.coverRegions) && this.coverDirection == timeStyleCoverDesc.coverDirection;
    }

    public int hashCode() {
        int iHashCode = this.source.hashCode() * 31;
        List<Rect> list = this.coverRegions;
        return ((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + this.coverDirection.hashCode();
    }

    @NotNull
    public String toString() {
        return "TimeStyleCoverDesc(source=" + this.source + ", coverRegions=" + this.coverRegions + ", coverDirection=" + this.coverDirection + ")";
    }

    public /* synthetic */ TimeStyleCoverDesc(String str, List list, CoverDirection coverDirection, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, (i & 4) != 0 ? CoverDirection.VERTICAL : coverDirection);
    }
}
