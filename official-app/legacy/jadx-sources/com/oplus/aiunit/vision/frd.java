package com.oplus.aiunit.vision;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import coil.request.CachePolicy;
import coil.request.Parameters;
import coil.request.Tags;
import coil.size.Scale;
import coil.size.Size;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b*\u0018\u00002\u00020\u0001B\u009f\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\bG\u0010HJ \u0001\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u0018J\u0013\u0010\u001e\u001a\u00020\f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010 \u001a\u00020\u001fH\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b*\u00100\u001a\u0004\b1\u00102R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b&\u00103\u001a\u0004\b(\u00104R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\"\u00103\u001a\u0004\b,\u00104R\u0017\u0010\u000f\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b5\u00103\u001a\u0004\b6\u00104R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b5\u00109R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b:\u0010<R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bA\u0010CR\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b6\u0010D\u001a\u0004\bE\u0010FR\u0017\u0010\u001a\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b1\u0010D\u001a\u0004\b7\u0010FR\u0017\u0010\u001b\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b.\u0010D\u001a\u0004\b=\u0010F¨\u0006I"}, d2 = {"Lcom/oplus/aiunit/vision/frd;", "", "Landroid/content/Context;", "context", "Landroid/graphics/Bitmap$Config;", "config", "Landroid/graphics/ColorSpace;", "colorSpace", "Lcoil/size/e;", "size", "Lcoil/size/Scale;", "scale", "", "allowInexactSize", "allowRgb565", "premultipliedAlpha", "", "diskCacheKey", "Lcom/oplus/aiunit/vision/gj8;", "headers", "Lcoil/request/d;", UTraceSQLiteHelperKt.COL_TAGS, "Lcoil/request/b;", "parameters", "Lcoil/request/CachePolicy;", "memoryCachePolicy", "diskCachePolicy", "networkCachePolicy", "a", "other", "equals", "", "hashCode", "Landroid/content/Context;", b2n.f, "()Landroid/content/Context;", "b", "Landroid/graphics/Bitmap$Config;", "f", "()Landroid/graphics/Bitmap$Config;", "c", "Landroid/graphics/ColorSpace;", MapSchema.FIELD_NAME_ENTRY, "()Landroid/graphics/ColorSpace;", "d", "Lcoil/size/e;", "o", "()Lcoil/size/e;", "Lcoil/size/Scale;", "n", "()Lcoil/size/Scale;", "Z", "()Z", b2n.g, LogFieldKey.MESSAGE_KEY, "i", "Ljava/lang/String;", "()Ljava/lang/String;", "j", "Lcom/oplus/aiunit/vision/gj8;", "()Lcom/oplus/aiunit/vision/gj8;", MapSchema.FIELD_NAME_KEY, "Lcoil/request/d;", LogFieldKey.PROCESS_NAME_KEY, "()Lcoil/request/d;", LogFieldKey.LEVEL_KEY, "Lcoil/request/b;", "()Lcoil/request/b;", "Lcoil/request/CachePolicy;", "getMemoryCachePolicy", "()Lcoil/request/CachePolicy;", "<init>", "(Landroid/content/Context;Landroid/graphics/Bitmap$Config;Landroid/graphics/ColorSpace;Lcoil/size/e;Lcoil/size/Scale;ZZZLjava/lang/String;Lcom/oplus/aiunit/vision/gj8;Lcoil/request/d;Lcoil/request/b;Lcoil/request/CachePolicy;Lcoil/request/CachePolicy;Lcoil/request/CachePolicy;)V", "coil-base_release"}, k = 1, mv = {1, 9, 0})
public final class frd {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Bitmap.Config config;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final ColorSpace colorSpace;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Size size;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Scale scale;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final boolean allowInexactSize;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final boolean allowRgb565;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public final boolean premultipliedAlpha;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public final String diskCacheKey;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final gj8 headers;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final Tags tags;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Parameters parameters;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final CachePolicy memoryCachePolicy;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final CachePolicy diskCachePolicy;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final CachePolicy networkCachePolicy;

    public frd(@NotNull Context context, @NotNull Bitmap.Config config, @Nullable ColorSpace colorSpace, @NotNull Size size, @NotNull Scale scale, boolean z, boolean z2, boolean z3, @Nullable String str, @NotNull gj8 gj8Var, @NotNull Tags tags, @NotNull Parameters parameters, @NotNull CachePolicy cachePolicy, @NotNull CachePolicy cachePolicy2, @NotNull CachePolicy cachePolicy3) {
        this.context = context;
        this.config = config;
        this.colorSpace = colorSpace;
        this.size = size;
        this.scale = scale;
        this.allowInexactSize = z;
        this.allowRgb565 = z2;
        this.premultipliedAlpha = z3;
        this.diskCacheKey = str;
        this.headers = gj8Var;
        this.tags = tags;
        this.parameters = parameters;
        this.memoryCachePolicy = cachePolicy;
        this.diskCachePolicy = cachePolicy2;
        this.networkCachePolicy = cachePolicy3;
    }

    @NotNull
    public final frd a(@NotNull Context context, @NotNull Bitmap.Config config, @Nullable ColorSpace colorSpace, @NotNull Size size, @NotNull Scale scale, boolean allowInexactSize, boolean allowRgb565, boolean premultipliedAlpha, @Nullable String diskCacheKey, @NotNull gj8 headers, @NotNull Tags tags, @NotNull Parameters parameters, @NotNull CachePolicy memoryCachePolicy, @NotNull CachePolicy diskCachePolicy, @NotNull CachePolicy networkCachePolicy) {
        return new frd(context, config, colorSpace, size, scale, allowInexactSize, allowRgb565, premultipliedAlpha, diskCacheKey, headers, tags, parameters, memoryCachePolicy, diskCachePolicy, networkCachePolicy);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getAllowInexactSize() {
        return this.allowInexactSize;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getAllowRgb565() {
        return this.allowRgb565;
    }

    @Nullable
    /* JADX INFO: renamed from: e, reason: from getter */
    public final ColorSpace getColorSpace() {
        return this.colorSpace;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof frd) {
            frd frdVar = (frd) other;
            if (Intrinsics.areEqual(this.context, frdVar.context) && this.config == frdVar.config && Intrinsics.areEqual(this.colorSpace, frdVar.colorSpace) && Intrinsics.areEqual(this.size, frdVar.size) && this.scale == frdVar.scale && this.allowInexactSize == frdVar.allowInexactSize && this.allowRgb565 == frdVar.allowRgb565 && this.premultipliedAlpha == frdVar.premultipliedAlpha && Intrinsics.areEqual(this.diskCacheKey, frdVar.diskCacheKey) && Intrinsics.areEqual(this.headers, frdVar.headers) && Intrinsics.areEqual(this.tags, frdVar.tags) && Intrinsics.areEqual(this.parameters, frdVar.parameters) && this.memoryCachePolicy == frdVar.memoryCachePolicy && this.diskCachePolicy == frdVar.diskCachePolicy && this.networkCachePolicy == frdVar.networkCachePolicy) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final Bitmap.Config getConfig() {
        return this.config;
    }

    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public final Context getContext() {
        return this.context;
    }

    @Nullable
    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getDiskCacheKey() {
        return this.diskCacheKey;
    }

    public int hashCode() {
        int iHashCode = ((this.context.hashCode() * 31) + this.config.hashCode()) * 31;
        ColorSpace colorSpace = this.colorSpace;
        int iHashCode2 = (((((((((((iHashCode + (colorSpace != null ? colorSpace.hashCode() : 0)) * 31) + this.size.hashCode()) * 31) + this.scale.hashCode()) * 31) + Boolean.hashCode(this.allowInexactSize)) * 31) + Boolean.hashCode(this.allowRgb565)) * 31) + Boolean.hashCode(this.premultipliedAlpha)) * 31;
        String str = this.diskCacheKey;
        return ((((((((((((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.headers.hashCode()) * 31) + this.tags.hashCode()) * 31) + this.parameters.hashCode()) * 31) + this.memoryCachePolicy.hashCode()) * 31) + this.diskCachePolicy.hashCode()) * 31) + this.networkCachePolicy.hashCode();
    }

    @NotNull
    /* JADX INFO: renamed from: i, reason: from getter */
    public final CachePolicy getDiskCachePolicy() {
        return this.diskCachePolicy;
    }

    @NotNull
    /* JADX INFO: renamed from: j, reason: from getter */
    public final gj8 getHeaders() {
        return this.headers;
    }

    @NotNull
    /* JADX INFO: renamed from: k, reason: from getter */
    public final CachePolicy getNetworkCachePolicy() {
        return this.networkCachePolicy;
    }

    @NotNull
    /* JADX INFO: renamed from: l, reason: from getter */
    public final Parameters getParameters() {
        return this.parameters;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final boolean getPremultipliedAlpha() {
        return this.premultipliedAlpha;
    }

    @NotNull
    /* JADX INFO: renamed from: n, reason: from getter */
    public final Scale getScale() {
        return this.scale;
    }

    @NotNull
    /* JADX INFO: renamed from: o, reason: from getter */
    public final Size getSize() {
        return this.size;
    }

    @NotNull
    /* JADX INFO: renamed from: p, reason: from getter */
    public final Tags getTags() {
        return this.tags;
    }
}
