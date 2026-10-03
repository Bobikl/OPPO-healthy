package androidx.lifecycle;

import android.view.View;
import androidx.lifecycle.viewmodel.R;
import com.oplus.smartenginehelper.ParserTag;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmName;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.sequences.SequencesKt__SequencesKt;
import p010kotlin.sequences.SequencesKt___SequencesKt;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0007¢\u0006\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0005*\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"findViewTreeViewModelStoreOwner", "Landroidx/lifecycle/ViewModelStoreOwner;", "Landroid/view/View;", ParserTag.TAG_GET, "setViewTreeViewModelStoreOwner", "", "viewModelStoreOwner", "set", "lifecycle-viewmodel_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@JvmName(name = "ViewTreeViewModelStoreOwner")
public final class ViewTreeViewModelStoreOwner {
    @JvmName(name = ParserTag.TAG_GET)
    @Nullable
    public static final ViewModelStoreOwner get(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return (ViewModelStoreOwner) SequencesKt___SequencesKt.firstOrNull(SequencesKt___SequencesKt.mapNotNull(SequencesKt__SequencesKt.generateSequence(view, (Function1<? super View, ? extends View>) ((Function1<? super Object, ? extends Object>) new Function1<View, View>() { // from class: androidx.lifecycle.ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$1
            @Override // p010kotlin.jvm.functions.Function1
            @Nullable
            public final View invoke(@NotNull View view2) {
                Intrinsics.checkNotNullParameter(view2, "view");
                Object parent = view2.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            }
        })), new Function1<View, ViewModelStoreOwner>() { // from class: androidx.lifecycle.ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$2
            @Override // p010kotlin.jvm.functions.Function1
            @Nullable
            public final ViewModelStoreOwner invoke(@NotNull View view2) {
                Intrinsics.checkNotNullParameter(view2, "view");
                Object tag = view2.getTag(R.id.view_tree_view_model_store_owner);
                if (tag instanceof ViewModelStoreOwner) {
                    return (ViewModelStoreOwner) tag;
                }
                return null;
            }
        }));
    }

    @JvmName(name = "set")
    public static final void set(@NotNull View view, @Nullable ViewModelStoreOwner viewModelStoreOwner) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTag(R.id.view_tree_view_model_store_owner, viewModelStoreOwner);
    }
}
