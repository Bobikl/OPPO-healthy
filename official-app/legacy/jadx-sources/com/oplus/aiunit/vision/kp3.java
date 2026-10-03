package com.oplus.aiunit.vision;

import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0006\u0010\u0006\u001a\u00020\u0002J\"\u0010\u000b\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\u001c\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¨\u0006\u0010"}, d2 = {"Lcom/oplus/aiunit/vision/kp3;", "", "", "text", "", "d", "c", "Lkotlin/Function0;", "", "block", "fallback", "a", "lock", "b", "<init>", "()V", "speechEngine_release"}, k = 1, mv = {1, 5, 1})
public final class kp3 {

    @NotNull
    public static final kp3 INSTANCE = new kp3();

    public final void a(@NotNull Function0<Unit> block, @NotNull Function0<Unit> fallback) {
        Intrinsics.checkNotNullParameter(block, "block");
        Intrinsics.checkNotNullParameter(fallback, "fallback");
        try {
            block.invoke();
        } catch (Exception unused) {
            fallback.invoke();
        }
    }

    public final void b(@NotNull Object lock, @NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(lock, "lock");
        Intrinsics.checkNotNullParameter(block, "block");
        synchronized (lock) {
            block.invoke();
            Unit unit = Unit.INSTANCE;
        }
    }

    @NotNull
    public final String c() {
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
        return StringsKt__StringsJVMKt.replace$default(string, "-", "", false, 4, (Object) null);
    }

    public final boolean d(@Nullable String text) {
        return text != null && StringsKt__StringsJVMKt.startsWith$default(text, "<speak>", false, 2, null) && StringsKt__StringsJVMKt.endsWith$default(text, "</speak>", false, 2, null);
    }
}
