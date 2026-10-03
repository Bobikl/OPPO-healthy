package androidx.compose.ui.node;

import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a1\u0010\u0005\u001a\u0002H\u0006\"\b\b\u0000\u0010\u0006*\u00020\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00060\u000bH\u0007¢\u0006\u0002\u0010\f\u001a\f\u0010\r\u001a\u00020\u000e*\u00020\bH\u0000\u001a\u000e\u0010\u000f\u001a\u0004\u0018\u00010\u000e*\u00020\bH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"viewAdaptersKey", "", "tagKey", "key", "", "getOrAddAdapter", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/ui/node/ViewAdapter;", "Landroid/view/View;", "id", "factory", "Lkotlin/Function0;", "(Landroid/view/View;ILkotlin/jvm/functions/Function0;)Landroidx/compose/ui/node/ViewAdapter;", "getViewAdapter", "Landroidx/compose/ui/node/MergedViewAdapter;", "getViewAdapterIfExists", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nViewInterop.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewInterop.android.kt\nandroidx/compose/ui/node/ViewInterop_androidKt\n+ 2 ViewInterop.android.kt\nandroidx/compose/ui/node/MergedViewAdapter\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,97:1\n54#2:98\n55#2,4:108\n116#3,2:99\n33#3,6:101\n118#3:107\n*S KotlinDebug\n*F\n+ 1 ViewInterop.android.kt\nandroidx/compose/ui/node/ViewInterop_androidKt\n*L\n45#1:98\n45#1:108,4\n45#1:99,2\n45#1:101,6\n45#1:107\n*E\n"})
public final class ViewInterop_androidKt {
    private static final int viewAdaptersKey = tagKey("ViewAdapter");

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public static final <T extends ViewAdapter> T getOrAddAdapter(@NotNull View view, int i, @NotNull Function0<? extends T> factory) {
        ViewAdapter viewAdapter;
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(factory, "factory");
        MergedViewAdapter viewAdapter2 = getViewAdapter(view);
        List<ViewAdapter> adapters = viewAdapter2.getAdapters();
        int size = adapters.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                viewAdapter = null;
                break;
            }
            viewAdapter = adapters.get(i2);
            if (viewAdapter.getId() == i) {
                break;
            }
            i2++;
        }
        T t = viewAdapter instanceof ViewAdapter ? (T) viewAdapter : null;
        if (t != null) {
            return t;
        }
        T tInvoke = factory.invoke();
        viewAdapter2.getAdapters().add(tInvoke);
        return tInvoke;
    }

    @NotNull
    public static final MergedViewAdapter getViewAdapter(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        int i = viewAdaptersKey;
        Object tag = view.getTag(i);
        MergedViewAdapter mergedViewAdapter = tag instanceof MergedViewAdapter ? (MergedViewAdapter) tag : null;
        if (mergedViewAdapter != null) {
            return mergedViewAdapter;
        }
        MergedViewAdapter mergedViewAdapter2 = new MergedViewAdapter();
        view.setTag(i, mergedViewAdapter2);
        return mergedViewAdapter2;
    }

    @Nullable
    public static final MergedViewAdapter getViewAdapterIfExists(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Object tag = view.getTag(viewAdaptersKey);
        if (tag instanceof MergedViewAdapter) {
            return (MergedViewAdapter) tag;
        }
        return null;
    }

    public static final int tagKey(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return key.hashCode() | 50331648;
    }
}
