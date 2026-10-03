package com.oplus.aiunit.vision;

import android.graphics.Bitmap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.yvk, reason: from toString */
/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R$\u0010\u0018\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\n\u0010\u0016\"\u0004\b\u0014\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/oplus/aiunit/vision/yvk;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "a", "J", "getDuration", "()J", "duration", "b", "I", "()I", "limit", "Landroid/graphics/Bitmap;", "c", "Landroid/graphics/Bitmap;", "()Landroid/graphics/Bitmap;", "(Landroid/graphics/Bitmap;)V", "bitmap", "<init>", "(JILandroid/graphics/Bitmap;)V", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class VideoBean {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final long duration;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final int limit;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public Bitmap bitmap;

    public VideoBean(long j2, int i, @Nullable Bitmap bitmap) {
        this.duration = j2;
        this.limit = i;
        this.bitmap = bitmap;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getLimit() {
        return this.limit;
    }

    public final void c(@Nullable Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoBean)) {
            return false;
        }
        VideoBean videoBean = (VideoBean) other;
        return this.duration == videoBean.duration && this.limit == videoBean.limit && Intrinsics.areEqual(this.bitmap, videoBean.bitmap);
    }

    public int hashCode() {
        int iHashCode = ((Long.hashCode(this.duration) * 31) + Integer.hashCode(this.limit)) * 31;
        Bitmap bitmap = this.bitmap;
        return iHashCode + (bitmap == null ? 0 : bitmap.hashCode());
    }

    @NotNull
    public String toString() {
        return "VideoBean(duration=" + this.duration + ", limit=" + this.limit + ", bitmap=" + this.bitmap + ")";
    }

    public /* synthetic */ VideoBean(long j2, int i, Bitmap bitmap, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, i, (i2 & 4) != 0 ? null : bitmap);
    }
}
