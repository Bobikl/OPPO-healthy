package androidx.compose.ui.node;

import android.view.View;
import android.view.ViewGroup;
import androidx.exifinterface.media.ExifInterface;
import com.oplus.smartenginehelper.ParserTag;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J1\u0010\u0012\u001a\u0002H\u0013\"\b\b\u0000\u0010\u0013*\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00130\u0015H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u0016J\u0018\u0010\u0017\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/node/MergedViewAdapter;", "Landroidx/compose/ui/node/ViewAdapter;", "()V", "adapters", "", "getAdapters", "()Ljava/util/List;", "id", "", "getId", "()I", "didInsert", "", "view", "Landroid/view/View;", "parent", "Landroid/view/ViewGroup;", "didUpdate", ParserTag.TAG_GET, ExifInterface.GPS_DIRECTION_TRUE, "factory", "Lkotlin/Function0;", "(ILkotlin/jvm/functions/Function0;)Landroidx/compose/ui/node/ViewAdapter;", "willInsert", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nViewInterop.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewInterop.android.kt\nandroidx/compose/ui/node/MergedViewAdapter\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,97:1\n116#2,2:98\n33#2,6:100\n118#2:106\n33#2,6:107\n33#2,6:113\n33#2,6:119\n*S KotlinDebug\n*F\n+ 1 ViewInterop.android.kt\nandroidx/compose/ui/node/MergedViewAdapter\n*L\n54#1:98,2\n54#1:100,6\n54#1:106\n62#1:107,6\n66#1:113,6\n70#1:119,6\n*E\n"})
public final class MergedViewAdapter implements ViewAdapter {

    @NotNull
    private final List<ViewAdapter> adapters = new ArrayList();
    private final int id;

    @Override // androidx.compose.ui.node.ViewAdapter
    public void didInsert(@NotNull View view, @NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        List<ViewAdapter> list = this.adapters;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.get(i).didInsert(view, parent);
        }
    }

    @Override // androidx.compose.ui.node.ViewAdapter
    public void didUpdate(@NotNull View view, @NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        List<ViewAdapter> list = this.adapters;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.get(i).didUpdate(view, parent);
        }
    }

    @NotNull
    public final <T extends ViewAdapter> T get(int id, @NotNull Function0<? extends T> factory) {
        ViewAdapter viewAdapter;
        Intrinsics.checkNotNullParameter(factory, "factory");
        List<ViewAdapter> adapters = getAdapters();
        int size = adapters.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                viewAdapter = null;
                break;
            }
            viewAdapter = adapters.get(i);
            if (viewAdapter.getId() == id) {
                break;
            }
            i++;
        }
        T t = viewAdapter instanceof ViewAdapter ? (T) viewAdapter : null;
        if (t != null) {
            return t;
        }
        T tInvoke = factory.invoke();
        getAdapters().add(tInvoke);
        return tInvoke;
    }

    @NotNull
    public final List<ViewAdapter> getAdapters() {
        return this.adapters;
    }

    @Override // androidx.compose.ui.node.ViewAdapter
    public int getId() {
        return this.id;
    }

    @Override // androidx.compose.ui.node.ViewAdapter
    public void willInsert(@NotNull View view, @NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        List<ViewAdapter> list = this.adapters;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.get(i).willInsert(view, parent);
        }
    }
}
