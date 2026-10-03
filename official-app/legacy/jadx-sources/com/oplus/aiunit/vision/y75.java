package com.oplus.aiunit.vision;

import android.graphics.Bitmap;
import androidx.lifecycle.Lifecycle;
import coil.request.CachePolicy;
import coil.size.Precision;
import coil.size.Scale;
import com.heytap.log.formatter.LogFieldKey;
import io.protostuff.MapSchema;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010)\u001a\u0004\u0018\u00010%\u0012\b\u0010/\u001a\u0004\u0018\u00010*\u0012\b\u00104\u001a\u0004\u0018\u000100\u0012\b\u00107\u001a\u0004\u0018\u00010\u0003\u0012\b\u00108\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010<\u001a\u0004\u0018\u000109\u0012\b\u0010=\u001a\u0004\u0018\u000109\u0012\b\u0010>\u001a\u0004\u0018\u000109¢\u0006\u0004\b?\u0010@J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010!\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010\u001dR\u0019\u0010\"\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b\u001a\u0010\u001dR\u0019\u0010$\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b#\u0010\u001dR\u0019\u0010)\u001a\u0004\u0018\u00010%8\u0006¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010/\u001a\u0004\u0018\u00010*8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0019\u00104\u001a\u0004\u0018\u0001008\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b\u0014\u00103R\u0019\u00107\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b-\u00105\u001a\u0004\b\b\u00106R\u0019\u00108\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0016\u00105\u001a\u0004\b\u000e\u00106R\u0019\u0010<\u001a\u0004\u0018\u0001098\u0006¢\u0006\f\n\u0004\b\u0010\u0010:\u001a\u0004\b+\u0010;R\u0019\u0010=\u001a\u0004\u0018\u0001098\u0006¢\u0006\f\n\u0004\b#\u0010:\u001a\u0004\b\u001f\u0010;R\u0019\u0010>\u001a\u0004\u0018\u0001098\u0006¢\u0006\f\n\u0004\b'\u0010:\u001a\u0004\b1\u0010;¨\u0006A"}, d2 = {"Lcom/oplus/aiunit/vision/y75;", "", "other", "", "equals", "", "hashCode", "Landroidx/lifecycle/Lifecycle;", "a", "Landroidx/lifecycle/Lifecycle;", b2n.g, "()Landroidx/lifecycle/Lifecycle;", "lifecycle", "Lcom/oplus/aiunit/vision/m7h;", "b", "Lcom/oplus/aiunit/vision/m7h;", LogFieldKey.MESSAGE_KEY, "()Lcom/oplus/aiunit/vision/m7h;", "sizeResolver", "Lcoil/size/Scale;", "c", "Lcoil/size/Scale;", LogFieldKey.LEVEL_KEY, "()Lcoil/size/Scale;", "scale", "Lkotlinx/coroutines/CoroutineDispatcher;", "d", "Lkotlinx/coroutines/CoroutineDispatcher;", b2n.f, "()Lkotlinx/coroutines/CoroutineDispatcher;", "interceptorDispatcher", MapSchema.FIELD_NAME_ENTRY, "f", "fetcherDispatcher", "decoderDispatcher", "n", "transformationDispatcher", "Lcom/oplus/aiunit/vision/nak$a;", "Lcom/oplus/aiunit/vision/nak$a;", "o", "()Lcom/oplus/aiunit/vision/nak$a;", "transitionFactory", "Lcoil/size/Precision;", "i", "Lcoil/size/Precision;", MapSchema.FIELD_NAME_KEY, "()Lcoil/size/Precision;", "precision", "Landroid/graphics/Bitmap$Config;", "j", "Landroid/graphics/Bitmap$Config;", "()Landroid/graphics/Bitmap$Config;", "bitmapConfig", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "allowHardware", "allowRgb565", "Lcoil/request/CachePolicy;", "Lcoil/request/CachePolicy;", "()Lcoil/request/CachePolicy;", "memoryCachePolicy", "diskCachePolicy", "networkCachePolicy", "<init>", "(Landroidx/lifecycle/Lifecycle;Lcom/oplus/aiunit/vision/m7h;Lcoil/size/Scale;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;Lcom/oplus/aiunit/vision/nak$a;Lcoil/size/Precision;Landroid/graphics/Bitmap$Config;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcoil/request/CachePolicy;Lcoil/request/CachePolicy;Lcoil/request/CachePolicy;)V", "coil-base_release"}, k = 1, mv = {1, 9, 0})
public final class y75 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public final Lifecycle lifecycle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final m7h sizeResolver;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Scale scale;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public final CoroutineDispatcher interceptorDispatcher;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final CoroutineDispatcher fetcherDispatcher;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public final CoroutineDispatcher decoderDispatcher;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public final CoroutineDispatcher transformationDispatcher;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public final nak.a transitionFactory;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public final Precision precision;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Bitmap.Config bitmapConfig;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public final Boolean allowHardware;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Boolean allowRgb565;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public final CachePolicy memoryCachePolicy;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final CachePolicy diskCachePolicy;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @Nullable
    public final CachePolicy networkCachePolicy;

    public y75(@Nullable Lifecycle lifecycle, @Nullable m7h m7hVar, @Nullable Scale scale, @Nullable CoroutineDispatcher coroutineDispatcher, @Nullable CoroutineDispatcher coroutineDispatcher2, @Nullable CoroutineDispatcher coroutineDispatcher3, @Nullable CoroutineDispatcher coroutineDispatcher4, @Nullable nak.a aVar, @Nullable Precision precision, @Nullable Bitmap.Config config, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable CachePolicy cachePolicy, @Nullable CachePolicy cachePolicy2, @Nullable CachePolicy cachePolicy3) {
        this.lifecycle = lifecycle;
        this.sizeResolver = m7hVar;
        this.scale = scale;
        this.interceptorDispatcher = coroutineDispatcher;
        this.fetcherDispatcher = coroutineDispatcher2;
        this.decoderDispatcher = coroutineDispatcher3;
        this.transformationDispatcher = coroutineDispatcher4;
        this.transitionFactory = aVar;
        this.precision = precision;
        this.bitmapConfig = config;
        this.allowHardware = bool;
        this.allowRgb565 = bool2;
        this.memoryCachePolicy = cachePolicy;
        this.diskCachePolicy = cachePolicy2;
        this.networkCachePolicy = cachePolicy3;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Boolean getAllowHardware() {
        return this.allowHardware;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Boolean getAllowRgb565() {
        return this.allowRgb565;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final Bitmap.Config getBitmapConfig() {
        return this.bitmapConfig;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final CoroutineDispatcher getDecoderDispatcher() {
        return this.decoderDispatcher;
    }

    @Nullable
    /* JADX INFO: renamed from: e, reason: from getter */
    public final CachePolicy getDiskCachePolicy() {
        return this.diskCachePolicy;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof y75) {
            y75 y75Var = (y75) other;
            if (Intrinsics.areEqual(this.lifecycle, y75Var.lifecycle) && Intrinsics.areEqual(this.sizeResolver, y75Var.sizeResolver) && this.scale == y75Var.scale && Intrinsics.areEqual(this.interceptorDispatcher, y75Var.interceptorDispatcher) && Intrinsics.areEqual(this.fetcherDispatcher, y75Var.fetcherDispatcher) && Intrinsics.areEqual(this.decoderDispatcher, y75Var.decoderDispatcher) && Intrinsics.areEqual(this.transformationDispatcher, y75Var.transformationDispatcher) && Intrinsics.areEqual(this.transitionFactory, y75Var.transitionFactory) && this.precision == y75Var.precision && this.bitmapConfig == y75Var.bitmapConfig && Intrinsics.areEqual(this.allowHardware, y75Var.allowHardware) && Intrinsics.areEqual(this.allowRgb565, y75Var.allowRgb565) && this.memoryCachePolicy == y75Var.memoryCachePolicy && this.diskCachePolicy == y75Var.diskCachePolicy && this.networkCachePolicy == y75Var.networkCachePolicy) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    /* JADX INFO: renamed from: f, reason: from getter */
    public final CoroutineDispatcher getFetcherDispatcher() {
        return this.fetcherDispatcher;
    }

    @Nullable
    /* JADX INFO: renamed from: g, reason: from getter */
    public final CoroutineDispatcher getInterceptorDispatcher() {
        return this.interceptorDispatcher;
    }

    @Nullable
    /* JADX INFO: renamed from: h, reason: from getter */
    public final Lifecycle getLifecycle() {
        return this.lifecycle;
    }

    public int hashCode() {
        Lifecycle lifecycle = this.lifecycle;
        int iHashCode = (lifecycle != null ? lifecycle.hashCode() : 0) * 31;
        m7h m7hVar = this.sizeResolver;
        int iHashCode2 = (iHashCode + (m7hVar != null ? m7hVar.hashCode() : 0)) * 31;
        Scale scale = this.scale;
        int iHashCode3 = (iHashCode2 + (scale != null ? scale.hashCode() : 0)) * 31;
        CoroutineDispatcher coroutineDispatcher = this.interceptorDispatcher;
        int iHashCode4 = (iHashCode3 + (coroutineDispatcher != null ? coroutineDispatcher.hashCode() : 0)) * 31;
        CoroutineDispatcher coroutineDispatcher2 = this.fetcherDispatcher;
        int iHashCode5 = (iHashCode4 + (coroutineDispatcher2 != null ? coroutineDispatcher2.hashCode() : 0)) * 31;
        CoroutineDispatcher coroutineDispatcher3 = this.decoderDispatcher;
        int iHashCode6 = (iHashCode5 + (coroutineDispatcher3 != null ? coroutineDispatcher3.hashCode() : 0)) * 31;
        CoroutineDispatcher coroutineDispatcher4 = this.transformationDispatcher;
        int iHashCode7 = (iHashCode6 + (coroutineDispatcher4 != null ? coroutineDispatcher4.hashCode() : 0)) * 31;
        nak.a aVar = this.transitionFactory;
        int iHashCode8 = (iHashCode7 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        Precision precision = this.precision;
        int iHashCode9 = (iHashCode8 + (precision != null ? precision.hashCode() : 0)) * 31;
        Bitmap.Config config = this.bitmapConfig;
        int iHashCode10 = (iHashCode9 + (config != null ? config.hashCode() : 0)) * 31;
        Boolean bool = this.allowHardware;
        int iHashCode11 = (iHashCode10 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.allowRgb565;
        int iHashCode12 = (iHashCode11 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        CachePolicy cachePolicy = this.memoryCachePolicy;
        int iHashCode13 = (iHashCode12 + (cachePolicy != null ? cachePolicy.hashCode() : 0)) * 31;
        CachePolicy cachePolicy2 = this.diskCachePolicy;
        int iHashCode14 = (iHashCode13 + (cachePolicy2 != null ? cachePolicy2.hashCode() : 0)) * 31;
        CachePolicy cachePolicy3 = this.networkCachePolicy;
        return iHashCode14 + (cachePolicy3 != null ? cachePolicy3.hashCode() : 0);
    }

    @Nullable
    /* JADX INFO: renamed from: i, reason: from getter */
    public final CachePolicy getMemoryCachePolicy() {
        return this.memoryCachePolicy;
    }

    @Nullable
    /* JADX INFO: renamed from: j, reason: from getter */
    public final CachePolicy getNetworkCachePolicy() {
        return this.networkCachePolicy;
    }

    @Nullable
    /* JADX INFO: renamed from: k, reason: from getter */
    public final Precision getPrecision() {
        return this.precision;
    }

    @Nullable
    /* JADX INFO: renamed from: l, reason: from getter */
    public final Scale getScale() {
        return this.scale;
    }

    @Nullable
    /* JADX INFO: renamed from: m, reason: from getter */
    public final m7h getSizeResolver() {
        return this.sizeResolver;
    }

    @Nullable
    /* JADX INFO: renamed from: n, reason: from getter */
    public final CoroutineDispatcher getTransformationDispatcher() {
        return this.transformationDispatcher;
    }

    @Nullable
    /* JADX INFO: renamed from: o, reason: from getter */
    public final nak.a getTransitionFactory() {
        return this.transitionFactory;
    }
}
