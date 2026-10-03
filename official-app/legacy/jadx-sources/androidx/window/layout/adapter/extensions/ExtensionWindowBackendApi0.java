package androidx.window.layout.adapter.extensions;

import android.content.Context;
import androidx.core.util.Consumer;
import androidx.window.layout.WindowLayoutInfo;
import androidx.window.layout.adapter.WindowBackend;
import androidx.window.layout.adapter.extensions.ExtensionWindowBackendApi0;
import java.util.concurrent.Executor;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u0016\u0010\f\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¨\u0006\r"}, d2 = {"Landroidx/window/layout/adapter/extensions/ExtensionWindowBackendApi0;", "Landroidx/window/layout/adapter/WindowBackend;", "()V", "registerLayoutChangeCallback", "", "context", "Landroid/content/Context;", "executor", "Ljava/util/concurrent/Executor;", "callback", "Landroidx/core/util/Consumer;", "Landroidx/window/layout/WindowLayoutInfo;", "unregisterLayoutChangeCallback", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ExtensionWindowBackendApi0 implements WindowBackend {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void registerLayoutChangeCallback$lambda$0(Consumer callback) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        callback.accept(new WindowLayoutInfo(CollectionsKt__CollectionsKt.emptyList()));
    }

    @Override // androidx.window.layout.adapter.WindowBackend
    public void registerLayoutChangeCallback(@NotNull Context context, @NotNull Executor executor, @NotNull final Consumer<WindowLayoutInfo> callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        executor.execute(new Runnable() { // from class: com.oplus.aiunit.vision.sz6
            @Override // java.lang.Runnable
            public final void run() {
                ExtensionWindowBackendApi0.registerLayoutChangeCallback$lambda$0(callback);
            }
        });
    }

    @Override // androidx.window.layout.adapter.WindowBackend
    public void unregisterLayoutChangeCallback(@NotNull Consumer<WindowLayoutInfo> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
    }
}
