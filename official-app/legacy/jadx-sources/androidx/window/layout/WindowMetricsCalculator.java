package androidx.window.layout;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.view.WindowInsetsCompat;
import androidx.window.core.Bounds;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.NotImplementedError;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \t2\u00020\u0001:\u0001\tJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Landroidx/window/layout/WindowMetricsCalculator;", "", "computeCurrentWindowMetrics", "Landroidx/window/layout/WindowMetrics;", "activity", "Landroid/app/Activity;", "context", "Landroid/content/Context;", "computeMaximumWindowMetrics", "Companion", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface WindowMetricsCalculator {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0000¢\u0006\u0002\b\nJ\b\u0010\u000b\u001a\u00020\u0005H\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\b\u0010\u0010\u001a\u00020\rH\u0007J\u0015\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0013H\u0001¢\u0006\u0002\b\u0014R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Landroidx/window/layout/WindowMetricsCalculator$Companion;", "", "()V", "decorator", "Lkotlin/Function1;", "Landroidx/window/layout/WindowMetricsCalculator;", "fromDisplayMetrics", "Landroidx/window/layout/WindowMetrics;", "displayMetrics", "Landroid/util/DisplayMetrics;", "fromDisplayMetrics$window_release", "getOrCreate", "overrideDecorator", "", "overridingDecorator", "Landroidx/window/layout/WindowMetricsCalculatorDecorator;", "reset", "translateWindowMetrics", "windowMetrics", "Landroid/view/WindowMetrics;", "translateWindowMetrics$window_release", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        private static Function1<? super WindowMetricsCalculator, ? extends WindowMetricsCalculator> decorator = new Function1<WindowMetricsCalculator, WindowMetricsCalculator>() { // from class: androidx.window.layout.WindowMetricsCalculator$Companion$decorator$1
            @Override // p010kotlin.jvm.functions.Function1
            @NotNull
            public final WindowMetricsCalculator invoke(@NotNull WindowMetricsCalculator it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it;
            }
        };

        private Companion() {
        }

        @NotNull
        public final WindowMetrics fromDisplayMetrics$window_release(@NotNull DisplayMetrics displayMetrics) {
            Intrinsics.checkNotNullParameter(displayMetrics, "displayMetrics");
            Bounds bounds = new Bounds(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
            WindowInsetsCompat windowInsetsCompatBuild = new WindowInsetsCompat.Builder().build();
            Intrinsics.checkNotNullExpressionValue(windowInsetsCompatBuild, "Builder().build()");
            return new WindowMetrics(bounds, windowInsetsCompatBuild);
        }

        @JvmStatic
        @NotNull
        public final WindowMetricsCalculator getOrCreate() {
            return decorator.invoke(WindowMetricsCalculatorCompat.INSTANCE);
        }

        @JvmStatic
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final void overrideDecorator(@NotNull WindowMetricsCalculatorDecorator overridingDecorator) {
            Intrinsics.checkNotNullParameter(overridingDecorator, "overridingDecorator");
            decorator = new WindowMetricsCalculator$Companion$overrideDecorator$1(overridingDecorator);
        }

        @JvmStatic
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final void reset() {
            decorator = new Function1<WindowMetricsCalculator, WindowMetricsCalculator>() { // from class: androidx.window.layout.WindowMetricsCalculator$Companion$reset$1
                @Override // p010kotlin.jvm.functions.Function1
                @NotNull
                public final WindowMetricsCalculator invoke(@NotNull WindowMetricsCalculator it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return it;
                }
            };
        }

        @RequiresApi(30)
        @NotNull
        public final WindowMetrics translateWindowMetrics$window_release(@NotNull android.view.WindowMetrics windowMetrics) {
            Intrinsics.checkNotNullParameter(windowMetrics, "windowMetrics");
            Rect bounds = windowMetrics.getBounds();
            Intrinsics.checkNotNullExpressionValue(bounds, "windowMetrics.bounds");
            WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(windowMetrics.getWindowInsets());
            Intrinsics.checkNotNullExpressionValue(windowInsetsCompat, "toWindowInsetsCompat(windowMetrics.windowInsets)");
            return new WindowMetrics(bounds, windowInsetsCompat);
        }
    }

    @JvmStatic
    @NotNull
    static WindowMetricsCalculator getOrCreate() {
        return INSTANCE.getOrCreate();
    }

    @JvmStatic
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    static void overrideDecorator(@NotNull WindowMetricsCalculatorDecorator windowMetricsCalculatorDecorator) {
        INSTANCE.overrideDecorator(windowMetricsCalculatorDecorator);
    }

    @JvmStatic
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    static void reset() {
        INSTANCE.reset();
    }

    @NotNull
    WindowMetrics computeCurrentWindowMetrics(@NotNull Activity activity);

    @NotNull
    default WindowMetrics computeCurrentWindowMetrics(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        throw new NotImplementedError("Must override computeCurrentWindowMetrics(context) and provide an implementation.");
    }

    @NotNull
    WindowMetrics computeMaximumWindowMetrics(@NotNull Activity activity);

    @NotNull
    default WindowMetrics computeMaximumWindowMetrics(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        throw new NotImplementedError("Must override computeMaximumWindowMetrics(context) and provide an implementation.");
    }
}
