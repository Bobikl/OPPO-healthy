package com.oplus.aiunit.vision;

import android.content.Context;
import coil.ImageLoader;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/oplus/aiunit/vision/gk3;", "", "Landroid/content/Context;", "context", "Lcoil/ImageLoader;", "a", "b", "Lcoil/ImageLoader;", "imageLoader", "Lcom/oplus/aiunit/vision/c4a;", "Lcom/oplus/aiunit/vision/c4a;", "imageLoaderFactory", "<init>", "()V", "coil-singleton_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nCoil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Coil.kt\ncoil/Coil\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,105:1\n1#2:106\n*E\n"})
public final class gk3 {

    @NotNull
    public static final gk3 INSTANCE = new gk3();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public static ImageLoader imageLoader;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public static c4a imageLoaderFactory;

    @JvmStatic
    @NotNull
    public static final ImageLoader a(@NotNull Context context) {
        ImageLoader imageLoader2 = imageLoader;
        return imageLoader2 == null ? INSTANCE.b(context) : imageLoader2;
    }

    public final synchronized ImageLoader b(Context context) {
        ImageLoader imageLoaderA;
        ImageLoader imageLoader2 = imageLoader;
        if (imageLoader2 != null) {
            return imageLoader2;
        }
        c4a c4aVar = imageLoaderFactory;
        if (c4aVar == null || (imageLoaderA = c4aVar.a()) == null) {
            Object applicationContext = context.getApplicationContext();
            c4a c4aVar2 = applicationContext instanceof c4a ? (c4a) applicationContext : null;
            imageLoaderA = c4aVar2 != null ? c4aVar2.a() : coil.b.a(context);
        }
        imageLoaderFactory = null;
        imageLoader = imageLoaderA;
        return imageLoaderA;
    }
}
