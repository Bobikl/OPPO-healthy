package com.oplus.aiunit.vision;

import android.graphics.Bitmap;
import com.google.protobuf.ByteString;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.z1a, reason: from toString */
/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0014\u0012\u0006\u0010\u001c\u001a\u00020\u0019¢\u0006\u0004\b\u001d\u0010\u001eJ\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\t\u0010\b\u001a\u00020\u0007HÖ\u0001R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0013\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\n\u0010\u0012R\u0017\u0010\u0018\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0010\u0010\u0017R\u0017\u0010\u001c\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u0015\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/oplus/aiunit/vision/z1a;", "", "other", "", "equals", "", "hashCode", "", "toString", "", "a", "J", "d", "()J", ClickApiEntity.TIME, "Landroid/graphics/Bitmap;", "b", "Landroid/graphics/Bitmap;", "()Landroid/graphics/Bitmap;", "bitmap", "", "c", "[B", "()[B", "byteArray", "Lcom/google/protobuf/ByteString;", "Lcom/google/protobuf/ByteString;", "()Lcom/google/protobuf/ByteString;", "byteString", "<init>", "(JLandroid/graphics/Bitmap;[BLcom/google/protobuf/ByteString;)V", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class IconCache {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final long time;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final Bitmap bitmap;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final byte[] byteArray;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    public final ByteString byteString;

    public IconCache(long j2, @NotNull Bitmap bitmap, @NotNull byte[] byteArray, @NotNull ByteString byteString) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(byteArray, "byteArray");
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        this.time = j2;
        this.bitmap = bitmap;
        this.byteArray = byteArray;
        this.byteString = byteString;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final byte[] getByteArray() {
        return this.byteArray;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final ByteString getByteString() {
        return this.byteString;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(IconCache.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.heytap.health.watch.notification.impl.transceiver.IconCache");
        IconCache iconCache = (IconCache) other;
        return this.time == iconCache.time && Intrinsics.areEqual(this.bitmap, iconCache.bitmap) && Arrays.equals(this.byteArray, iconCache.byteArray) && Intrinsics.areEqual(this.byteString, iconCache.byteString);
    }

    public int hashCode() {
        return (((((Long.hashCode(this.time) * 31) + this.bitmap.hashCode()) * 31) + Arrays.hashCode(this.byteArray)) * 31) + this.byteString.hashCode();
    }

    @NotNull
    public String toString() {
        return "IconCache(time=" + this.time + ", bitmap=" + this.bitmap + ", byteArray=" + Arrays.toString(this.byteArray) + ", byteString=" + this.byteString + ")";
    }
}
