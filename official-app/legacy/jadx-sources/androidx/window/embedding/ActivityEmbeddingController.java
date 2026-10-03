package androidx.window.embedding;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.os.IBinder;
import androidx.window.RequiresWindowSdkExtension;
import androidx.window.core.ExperimentalWindowApi;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bJ\u001d\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0001¢\u0006\u0002\b\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Landroidx/window/embedding/ActivityEmbeddingController;", "", "backend", "Landroidx/window/embedding/EmbeddingBackend;", "(Landroidx/window/embedding/EmbeddingBackend;)V", "getActivityStack", "Landroidx/window/embedding/ActivityStack;", "activity", "Landroid/app/Activity;", "isActivityEmbedded", "", "setLaunchingActivityStack", "Landroid/app/ActivityOptions;", "options", "token", "Landroid/os/IBinder;", "setLaunchingActivityStack$window_release", "Companion", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ActivityEmbeddingController {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final EmbeddingBackend backend;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Landroidx/window/embedding/ActivityEmbeddingController$Companion;", "", "()V", "getInstance", "Landroidx/window/embedding/ActivityEmbeddingController;", "context", "Landroid/content/Context;", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final ActivityEmbeddingController getInstance(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new ActivityEmbeddingController(EmbeddingBackend.INSTANCE.getInstance(context));
        }
    }

    public ActivityEmbeddingController(@NotNull EmbeddingBackend backend) {
        Intrinsics.checkNotNullParameter(backend, "backend");
        this.backend = backend;
    }

    @JvmStatic
    @NotNull
    public static final ActivityEmbeddingController getInstance(@NotNull Context context) {
        return INSTANCE.getInstance(context);
    }

    @ExperimentalWindowApi
    @Nullable
    public final ActivityStack getActivityStack(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        return this.backend.getActivityStack(activity);
    }

    public final boolean isActivityEmbedded(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        return this.backend.isActivityEmbedded(activity);
    }

    @RequiresWindowSdkExtension(version = 3)
    @NotNull
    public final ActivityOptions setLaunchingActivityStack$window_release(@NotNull ActivityOptions options, @NotNull IBinder token) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(token, "token");
        return this.backend.setLaunchingActivityStack(options, token);
    }
}
