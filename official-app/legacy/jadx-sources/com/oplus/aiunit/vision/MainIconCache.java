package com.oplus.aiunit.vision;

import android.graphics.drawable.Drawable;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.feb, reason: from toString */
/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0012\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\n\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/oplus/aiunit/vision/feb;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "a", "J", "b", "()J", ClickApiEntity.TIME, "Landroid/graphics/drawable/Drawable;", "Landroid/graphics/drawable/Drawable;", "()Landroid/graphics/drawable/Drawable;", "data", "<init>", "(JLandroid/graphics/drawable/Drawable;)V", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class MainIconCache {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final long time;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final Drawable data;

    public MainIconCache(long j2, @NotNull Drawable data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.time = j2;
        this.data = data;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Drawable getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MainIconCache)) {
            return false;
        }
        MainIconCache mainIconCache = (MainIconCache) other;
        return this.time == mainIconCache.time && Intrinsics.areEqual(this.data, mainIconCache.data);
    }

    public int hashCode() {
        return (Long.hashCode(this.time) * 31) + this.data.hashCode();
    }

    @NotNull
    public String toString() {
        return "MainIconCache(time=" + this.time + ", data=" + this.data + ")";
    }
}
