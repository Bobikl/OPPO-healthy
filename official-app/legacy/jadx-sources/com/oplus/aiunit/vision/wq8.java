package com.oplus.aiunit.vision;

import androidx.annotation.Size;
import io.protostuff.MapSchema;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.coroutines.CoroutineContext;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002R \u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\b\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR \u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u0012\u0004\b\u000f\u0010\f\u001a\u0004\b\u000e\u0010\nR \u0010\u0013\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\b\u0012\u0004\b\u0012\u0010\f\u001a\u0004\b\u0011\u0010\nR \u0010\u0016\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010\b\u0012\u0004\b\u0015\u0010\f\u001a\u0004\b\u0014\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/oplus/aiunit/vision/wq8;", "", "", "coroutineName", "Lkotlin/coroutines/CoroutineContext;", "a", "c", "b", "Lkotlin/coroutines/CoroutineContext;", "d", "()Lkotlin/coroutines/CoroutineContext;", "getDefault$annotations", "()V", "Default", "f", "getMain$annotations", "Main", MapSchema.FIELD_NAME_ENTRY, "getIO$annotations", "IO", "getUnconfined", "getUnconfined$annotations", "Unconfined", "<init>", "lib_base_release"}, k = 1, mv = {1, 8, 0})
public final class wq8 {

    @NotNull
    public static final wq8 INSTANCE = new wq8();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final CoroutineContext Default = Dispatchers.getDefault().plus(new Coroutine(apj.Thread_Type_KotlinCoroutine_Default));

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final CoroutineContext Main = Dispatchers.getMain().plus(new Coroutine(apj.Thread_Type_KotlinCoroutine_Main));

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final CoroutineContext IO = Dispatchers.getIO().plus(new Coroutine(apj.Thread_Type_KotlinCoroutine_IO));

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final CoroutineContext Unconfined = Dispatchers.getUnconfined().plus(new Coroutine(apj.Thread_Type_KotlinCoroutine_Unconfined));

    @NotNull
    public final CoroutineContext a(@Size(max = apj.MAX_CALLER_LENGTH) @NotNull String coroutineName) {
        Intrinsics.checkNotNullParameter(coroutineName, "coroutineName");
        return Dispatchers.getDefault().plus(new Coroutine(apj.Thread_Type_KotlinCoroutine_Default)).plus(new CoroutineName(coroutineName));
    }

    @NotNull
    public final CoroutineContext b(@Size(max = apj.MAX_CALLER_LENGTH) @NotNull String coroutineName) {
        Intrinsics.checkNotNullParameter(coroutineName, "coroutineName");
        return Dispatchers.getIO().plus(new Coroutine(apj.Thread_Type_KotlinCoroutine_IO)).plus(new CoroutineName(coroutineName));
    }

    @NotNull
    public final CoroutineContext c(@Size(max = apj.MAX_CALLER_LENGTH) @NotNull String coroutineName) {
        Intrinsics.checkNotNullParameter(coroutineName, "coroutineName");
        return Dispatchers.getMain().plus(new Coroutine(apj.Thread_Type_KotlinCoroutine_Main)).plus(new CoroutineName(coroutineName));
    }

    @NotNull
    public final CoroutineContext d() {
        return Default;
    }

    @NotNull
    public final CoroutineContext e() {
        return IO;
    }

    @NotNull
    public final CoroutineContext f() {
        return Main;
    }
}
