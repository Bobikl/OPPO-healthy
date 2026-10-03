package androidx.window.layout.adapter.extensions;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import androidx.window.core.Bounds;
import androidx.window.layout.FoldingFeature;
import androidx.window.layout.HardwareFoldingFeature;
import androidx.window.layout.WindowLayoutInfo;
import androidx.window.layout.WindowMetrics;
import androidx.window.layout.WindowMetricsCalculatorCompat;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001d\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000¢\u0006\u0002\b\tJ\u001f\u0010\u0003\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0000¢\u0006\u0002\b\tJ\u001d\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\bH\u0000¢\u0006\u0002\b\tJ\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002¨\u0006\u0013"}, d2 = {"Landroidx/window/layout/adapter/extensions/ExtensionsWindowLayoutInfoAdapter;", "", "()V", "translate", "Landroidx/window/layout/WindowLayoutInfo;", "context", "Landroid/content/Context;", UTraceSQLiteHelperKt.COL_INFO, "Landroidx/window/extensions/layout/WindowLayoutInfo;", "translate$window_release", "Landroidx/window/layout/FoldingFeature;", "windowMetrics", "Landroidx/window/layout/WindowMetrics;", "oemFeature", "Landroidx/window/extensions/layout/FoldingFeature;", "validBounds", "", "bounds", "Landroidx/window/core/Bounds;", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nExtensionsWindowLayoutInfoAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExtensionsWindowLayoutInfoAdapter.kt\nandroidx/window/layout/adapter/extensions/ExtensionsWindowLayoutInfoAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,117:1\n1603#2,9:118\n1855#2:127\n1856#2:129\n1612#2:130\n1#3:128\n*S KotlinDebug\n*F\n+ 1 ExtensionsWindowLayoutInfoAdapter.kt\nandroidx/window/layout/adapter/extensions/ExtensionsWindowLayoutInfoAdapter\n*L\n80#1:118,9\n80#1:127\n80#1:129\n80#1:130\n80#1:128\n*E\n"})
public final class ExtensionsWindowLayoutInfoAdapter {

    @NotNull
    public static final ExtensionsWindowLayoutInfoAdapter INSTANCE = new ExtensionsWindowLayoutInfoAdapter();

    private ExtensionsWindowLayoutInfoAdapter() {
    }

    private final boolean validBounds(WindowMetrics windowMetrics, Bounds bounds) {
        Rect bounds2 = windowMetrics.getBounds();
        if (bounds.isZero()) {
            return false;
        }
        if (bounds.getWidth() != bounds2.width() && bounds.getHeight() != bounds2.height()) {
            return false;
        }
        if (bounds.getWidth() >= bounds2.width() || bounds.getHeight() >= bounds2.height()) {
            return (bounds.getWidth() == bounds2.width() && bounds.getHeight() == bounds2.height()) ? false : true;
        }
        return false;
    }

    @Nullable
    public final FoldingFeature translate$window_release(@NotNull WindowMetrics windowMetrics, @NotNull androidx.window.extensions.layout.FoldingFeature oemFeature) {
        HardwareFoldingFeature.Type fold;
        FoldingFeature.State state;
        Intrinsics.checkNotNullParameter(windowMetrics, "windowMetrics");
        Intrinsics.checkNotNullParameter(oemFeature, "oemFeature");
        int type = oemFeature.getType();
        if (type == 1) {
            fold = HardwareFoldingFeature.Type.INSTANCE.getFOLD();
        } else {
            if (type != 2) {
                return null;
            }
            fold = HardwareFoldingFeature.Type.INSTANCE.getHINGE();
        }
        int state2 = oemFeature.getState();
        if (state2 == 1) {
            state = FoldingFeature.State.FLAT;
        } else {
            if (state2 != 2) {
                return null;
            }
            state = FoldingFeature.State.HALF_OPENED;
        }
        Rect bounds = oemFeature.getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds, "oemFeature.bounds");
        if (!validBounds(windowMetrics, new Bounds(bounds))) {
            return null;
        }
        Rect bounds2 = oemFeature.getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds2, "oemFeature.bounds");
        return new HardwareFoldingFeature(new Bounds(bounds2), fold, state);
    }

    @NotNull
    public final WindowLayoutInfo translate$window_release(@NotNull Context context, @NotNull androidx.window.extensions.layout.WindowLayoutInfo info) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(info, "info");
        if (Build.VERSION.SDK_INT >= 30) {
            return translate$window_release(WindowMetricsCalculatorCompat.INSTANCE.computeCurrentWindowMetrics(context), info);
        }
        if (context instanceof Activity) {
            return translate$window_release(WindowMetricsCalculatorCompat.INSTANCE.computeCurrentWindowMetrics((Activity) context), info);
        }
        throw new UnsupportedOperationException("Display Features are only supported after Q. Display features for non-Activity contexts are not expected to be reported on devices running Q.");
    }

    @NotNull
    public final WindowLayoutInfo translate$window_release(@NotNull WindowMetrics windowMetrics, @NotNull androidx.window.extensions.layout.WindowLayoutInfo info) {
        FoldingFeature foldingFeatureTranslate$window_release;
        Intrinsics.checkNotNullParameter(windowMetrics, "windowMetrics");
        Intrinsics.checkNotNullParameter(info, "info");
        List<androidx.window.extensions.layout.FoldingFeature> displayFeatures = info.getDisplayFeatures();
        Intrinsics.checkNotNullExpressionValue(displayFeatures, "info.displayFeatures");
        ArrayList arrayList = new ArrayList();
        for (androidx.window.extensions.layout.FoldingFeature feature : displayFeatures) {
            if (feature instanceof androidx.window.extensions.layout.FoldingFeature) {
                ExtensionsWindowLayoutInfoAdapter extensionsWindowLayoutInfoAdapter = INSTANCE;
                Intrinsics.checkNotNullExpressionValue(feature, "feature");
                foldingFeatureTranslate$window_release = extensionsWindowLayoutInfoAdapter.translate$window_release(windowMetrics, feature);
            } else {
                foldingFeatureTranslate$window_release = null;
            }
            if (foldingFeatureTranslate$window_release != null) {
                arrayList.add(foldingFeatureTranslate$window_release);
            }
        }
        return new WindowLayoutInfo(arrayList);
    }
}
