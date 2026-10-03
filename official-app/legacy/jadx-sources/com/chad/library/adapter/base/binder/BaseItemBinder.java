package com.chad.library.adapter.base.binder;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.exifinterface.media.ExifInterface;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.heytap.health.wallet.ui.adapter.BaseRecyclerViewHolder;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.b2n;
import com.oplus.smartenginehelper.ParserTag;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.LazyThreadSafetyMode;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004B\u0007¢\u0006\u0004\b4\u00105J\u001f\u0010\t\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00028\u00012\u0006\u0010\f\u001a\u00028\u0000H&¢\u0006\u0004\b\u000e\u0010\u000fJ-\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00028\u00012\u0006\u0010\f\u001a\u00028\u00002\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J/\u0010\u001d\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00028\u00012\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u001c\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ/\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00028\u00012\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u001c\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001f\u0010 J/\u0010!\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00028\u00012\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u001c\u001a\u00020\u0007H\u0016¢\u0006\u0004\b!\u0010\u001eJ/\u0010\"\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00028\u00012\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u001c\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\"\u0010 J\u0016\u0010%\u001a\u0012\u0012\u0004\u0012\u00020\u00070#j\b\u0012\u0004\u0012\u00020\u0007`$J\u0016\u0010&\u001a\u0012\u0012\u0004\u0012\u00020\u00070#j\b\u0012\u0004\u0012\u00020\u0007`$R+\u0010*\u001a\u0012\u0012\u0004\u0012\u00020\u00070#j\b\u0012\u0004\u0012\u00020\u0007`$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010'\u001a\u0004\b(\u0010)R+\u0010,\u001a\u0012\u0012\u0004\u0012\u00020\u00070#j\b\u0012\u0004\u0012\u00020\u0007`$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010'\u001a\u0004\b+\u0010)R$\u00103\u001a\u0004\u0018\u00010-8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b%\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102¨\u00066"}, d2 = {"Lcom/chad/library/adapter/base/binder/BaseItemBinder;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "VH", "", "Landroid/view/ViewGroup;", "parent", "", ParserTag.VIEW_TYPE, "j", "(Landroid/view/ViewGroup;I)Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", BaseRecyclerViewHolder.HOLDER_TAG_HEADER, "data", "", "a", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Ljava/lang/Object;)V", "", "payloads", "b", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Ljava/lang/Object;Ljava/util/List;)V", "", MapSchema.FIELD_NAME_KEY, "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;)Z", LogFieldKey.MESSAGE_KEY, "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;)V", "n", "Landroid/view/View;", "view", "position", "i", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Landroid/view/View;Ljava/lang/Object;I)V", LogFieldKey.LEVEL_KEY, "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Landroid/view/View;Ljava/lang/Object;I)Z", b2n.f, b2n.g, "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "c", "d", "Lkotlin/Lazy;", MapSchema.FIELD_NAME_ENTRY, "()Ljava/util/ArrayList;", "clickViewIds", "f", "longClickViewIds", "Landroid/content/Context;", "Landroid/content/Context;", "get_context$com_github_CymChad_brvah", "()Landroid/content/Context;", "o", "(Landroid/content/Context;)V", "_context", "<init>", "()V", "com.github.CymChad.brvah"}, k = 1, mv = {1, 6, 0})
public abstract class BaseItemBinder<T, VH extends BaseViewHolder> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Lazy clickViewIds;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Lazy longClickViewIds;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Context _context;

    public BaseItemBinder() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.clickViewIds = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ArrayList<Integer>>() { // from class: com.chad.library.adapter.base.binder.BaseItemBinder$clickViewIds$2
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final ArrayList<Integer> invoke() {
                return new ArrayList<>();
            }
        });
        this.longClickViewIds = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ArrayList<Integer>>() { // from class: com.chad.library.adapter.base.binder.BaseItemBinder$longClickViewIds$2
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final ArrayList<Integer> invoke() {
                return new ArrayList<>();
            }
        });
    }

    public abstract void a(@NotNull VH holder, T data);

    public void b(@NotNull VH holder, T data, @NotNull List<? extends Object> payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
    }

    @NotNull
    public final ArrayList<Integer> c() {
        return e();
    }

    @NotNull
    public final ArrayList<Integer> d() {
        return f();
    }

    public final ArrayList<Integer> e() {
        return (ArrayList) this.clickViewIds.getValue();
    }

    public final ArrayList<Integer> f() {
        return (ArrayList) this.longClickViewIds.getValue();
    }

    public void g(@NotNull VH holder, @NotNull View view, T data, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(view, "view");
    }

    public boolean h(@NotNull VH holder, @NotNull View view, T data, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(view, "view");
        return false;
    }

    public void i(@NotNull VH holder, @NotNull View view, T data, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @NotNull
    public abstract VH j(@NotNull ViewGroup parent, int viewType);

    public boolean k(@NotNull VH holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        return false;
    }

    public boolean l(@NotNull VH holder, @NotNull View view, T data, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(view, "view");
        return false;
    }

    public void m(@NotNull VH holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
    }

    public void n(@NotNull VH holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
    }

    public final void o(@Nullable Context context) {
        this._context = context;
    }
}
