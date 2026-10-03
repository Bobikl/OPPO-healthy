package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.JvmName;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u001d\u0010\b\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/oplus/aiunit/vision/z6h;", "", "Ljava/lang/Runnable;", "task", "", "c", "Lkotlin/Function0;", "block", "b", "(Lkotlin/jvm/functions/Function0;)V", "<init>", "()V", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0})
public abstract class z6h {
    public static final void d(Function0 block) {
        Intrinsics.checkNotNullParameter(block, "$block");
        block.invoke();
    }

    @JvmName(name = "-execute")
    public final void b(@NotNull final Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        c(new Runnable() { // from class: com.oplus.aiunit.vision.y6h
            @Override // java.lang.Runnable
            public final void run() {
                z6h.d(block);
            }
        });
    }

    public abstract void c(@NotNull Runnable task);
}
