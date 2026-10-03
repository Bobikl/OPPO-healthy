package com.oplus.aiunit.vision;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import com.customer.feedback.sdk.util.LogUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes10.dex */
@RequiresApi(33)
@SourceDebugExtension({"SMAP\nOnBackInvokedImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnBackInvokedImpl.kt\ncom/customer/feedback/common/api33/OnBackInvokedImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,54:1\n1#2:55\n*E\n"})
public final class cwm {
    @JvmStatic
    @DoNotInline
    @NotNull
    public static final OnBackInvokedCallback a(@NotNull final Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        return new OnBackInvokedCallback() { // from class: com.oplus.aiunit.vision.svm
            public final void onBackInvoked() {
                cwm.b(runnable);
            }
        };
    }

    public static final void b(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "$runnable");
        runnable.run();
    }

    @JvmStatic
    @DoNotInline
    public static final void c(@Nullable Object obj, int i, @Nullable Object obj2) {
        LogUtil.d("OnBackInvokedImpl", "registerOnBackInvokedCallback: " + obj2);
        OnBackInvokedDispatcher onBackInvokedDispatcherA = nvm.a(obj) ? u80.a(obj) : null;
        OnBackInvokedCallback onBackInvokedCallbackA = ovm.a(obj2) ? t80.a(obj2) : null;
        if (onBackInvokedCallbackA == null || onBackInvokedDispatcherA == null) {
            return;
        }
        onBackInvokedDispatcherA.registerOnBackInvokedCallback(i, onBackInvokedCallbackA);
    }

    @JvmStatic
    @DoNotInline
    public static final void d(@Nullable Object obj, @Nullable Object obj2) {
        LogUtil.d("OnBackInvokedImpl", "unregisterOnBackInvokedCallback: " + obj2);
        OnBackInvokedDispatcher onBackInvokedDispatcherA = nvm.a(obj) ? u80.a(obj) : null;
        OnBackInvokedCallback onBackInvokedCallbackA = ovm.a(obj2) ? t80.a(obj2) : null;
        if (onBackInvokedCallbackA == null || onBackInvokedDispatcherA == null) {
            return;
        }
        onBackInvokedDispatcherA.unregisterOnBackInvokedCallback(onBackInvokedCallbackA);
    }
}
