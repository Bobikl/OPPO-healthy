package com.oplus.aiunit.vision;

import android.content.Context;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.io.FilesKt__UtilsKt;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/oplus/aiunit/vision/i7h;", "", "Landroid/content/Context;", "context", "Lcoil/disk/a;", "a", "Lcoil/disk/a;", "instance", "<init>", "()V", "coil-base_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Utils.kt\ncoil/util/SingletonDiskCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,302:1\n1#2:303\n*E\n"})
public final class i7h {

    @NotNull
    public static final i7h INSTANCE = new i7h();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public static coil.disk.a instance;

    @NotNull
    public final synchronized coil.disk.a a(@NotNull Context context) {
        coil.disk.a aVarA;
        aVarA = instance;
        if (aVarA == null) {
            aVarA = new coil.disk.a.C0132a().b(FilesKt__UtilsKt.resolve(j.m(context), "image_cache")).a();
            instance = aVarA;
        }
        return aVarA;
    }
}
