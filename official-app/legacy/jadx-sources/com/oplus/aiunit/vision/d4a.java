package com.oplus.aiunit.vision;

import coil.decode.ExifOrientationPolicy;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\r\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0005R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0005R\u0017\u0010\u0010\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b\n\u0010\u000fR\u0017\u0010\u0014\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0012\u001a\u0004\b\u0007\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/oplus/aiunit/vision/d4a;", "", "", "a", "Z", "()Z", "addLastModifiedToFileCacheKey", "b", "d", "networkObserverEnabled", "c", MapSchema.FIELD_NAME_ENTRY, "respectCacheHeaders", "", "I", "()I", "bitmapFactoryMaxParallelism", "Lcoil/decode/ExifOrientationPolicy;", "Lcoil/decode/ExifOrientationPolicy;", "()Lcoil/decode/ExifOrientationPolicy;", "bitmapFactoryExifOrientationPolicy", "<init>", "(ZZZILcoil/decode/ExifOrientationPolicy;)V", "coil-base_release"}, k = 1, mv = {1, 9, 0})
public final class d4a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final boolean addLastModifiedToFileCacheKey;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final boolean networkObserverEnabled;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final boolean respectCacheHeaders;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final int bitmapFactoryMaxParallelism;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ExifOrientationPolicy bitmapFactoryExifOrientationPolicy;

    public d4a(boolean z, boolean z2, boolean z3, int i, @NotNull ExifOrientationPolicy exifOrientationPolicy) {
        this.addLastModifiedToFileCacheKey = z;
        this.networkObserverEnabled = z2;
        this.respectCacheHeaders = z3;
        this.bitmapFactoryMaxParallelism = i;
        this.bitmapFactoryExifOrientationPolicy = exifOrientationPolicy;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getAddLastModifiedToFileCacheKey() {
        return this.addLastModifiedToFileCacheKey;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final ExifOrientationPolicy getBitmapFactoryExifOrientationPolicy() {
        return this.bitmapFactoryExifOrientationPolicy;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getBitmapFactoryMaxParallelism() {
        return this.bitmapFactoryMaxParallelism;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getNetworkObserverEnabled() {
        return this.networkObserverEnabled;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getRespectCacheHeaders() {
        return this.respectCacheHeaders;
    }

    public /* synthetic */ d4a(boolean z, boolean z2, boolean z3, int i, ExifOrientationPolicy exifOrientationPolicy, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? true : z, (i2 & 2) != 0 ? true : z2, (i2 & 4) != 0 ? true : z3, (i2 & 8) != 0 ? 4 : i, (i2 & 16) != 0 ? ExifOrientationPolicy.RESPECT_PERFORMANCE : exifOrientationPolicy);
    }
}
