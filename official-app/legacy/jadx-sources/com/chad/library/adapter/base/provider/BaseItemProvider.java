package com.chad.library.adapter.base.provider;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.LayoutRes;
import androidx.exifinterface.media.ExifInterface;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.heytap.health.wallet.ui.adapter.BaseRecyclerViewHolder;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.up;
import com.oplus.smartenginehelper.ParserTag;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.LazyThreadSafetyMode;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b6\u00107J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0018\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0003H\u0016J\u0010\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0003H\u0016J/\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ/\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ/\u0010 \u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00020\u000fH\u0016¢\u0006\u0004\b \u0010\u001cJ/\u0010!\u001a\u00020\u001d2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00020\u000fH\u0016¢\u0006\u0004\b!\u0010\u001fJ\u0016\u0010$\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\"j\b\u0012\u0004\u0012\u00020\u000f`#J\u0016\u0010%\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\"j\b\u0012\u0004\u0012\u00020\u000f`#R\"\u0010,\u001a\u00020&8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0007\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R+\u00100\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\"j\b\u0012\u0004\u0012\u00020\u000f`#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010-\u001a\u0004\b.\u0010/R+\u00102\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\"j\b\u0012\u0004\u0012\u00020\u000f`#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010-\u001a\u0004\b1\u0010/R\u0014\u00105\u001a\u00020\u000f8gX¦\u0004¢\u0006\u0006\u001a\u0004\b3\u00104¨\u00068"}, d2 = {"Lcom/chad/library/adapter/base/provider/BaseItemProvider;", ExifInterface.GPS_DIRECTION_TRUE, "", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "helper", "item", "", "a", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Ljava/lang/Object;)V", "", "payloads", "b", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Ljava/lang/Object;Ljava/util/List;)V", "Landroid/view/ViewGroup;", "parent", "", ParserTag.VIEW_TYPE, MapSchema.FIELD_NAME_KEY, "viewHolder", "o", BaseRecyclerViewHolder.HOLDER_TAG_HEADER, LogFieldKey.MESSAGE_KEY, "n", "Landroid/view/View;", "view", "data", "position", "j", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Landroid/view/View;Ljava/lang/Object;I)V", "", LogFieldKey.LEVEL_KEY, "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Landroid/view/View;Ljava/lang/Object;I)Z", b2n.g, "i", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "c", "d", "Landroid/content/Context;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", LogFieldKey.PROCESS_NAME_KEY, "(Landroid/content/Context;)V", "context", "Lkotlin/Lazy;", MapSchema.FIELD_NAME_ENTRY, "()Ljava/util/ArrayList;", "clickViewIds", b2n.f, "longClickViewIds", "f", "()I", "layoutId", "<init>", "()V", "com.github.CymChad.brvah"}, k = 1, mv = {1, 6, 0})
public abstract class BaseItemProvider<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Lazy clickViewIds;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy longClickViewIds;

    public BaseItemProvider() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.clickViewIds = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ArrayList<Integer>>() { // from class: com.chad.library.adapter.base.provider.BaseItemProvider$clickViewIds$2
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final ArrayList<Integer> invoke() {
                return new ArrayList<>();
            }
        });
        this.longClickViewIds = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ArrayList<Integer>>() { // from class: com.chad.library.adapter.base.provider.BaseItemProvider$longClickViewIds$2
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final ArrayList<Integer> invoke() {
                return new ArrayList<>();
            }
        });
    }

    public abstract void a(@NotNull BaseViewHolder helper, T item);

    public void b(@NotNull BaseViewHolder helper, T item, @NotNull List<? extends Object> payloads) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
    }

    @NotNull
    public final ArrayList<Integer> c() {
        return e();
    }

    @NotNull
    public final ArrayList<Integer> d() {
        return g();
    }

    public final ArrayList<Integer> e() {
        return (ArrayList) this.clickViewIds.getValue();
    }

    @LayoutRes
    public abstract int f();

    public final ArrayList<Integer> g() {
        return (ArrayList) this.longClickViewIds.getValue();
    }

    public void h(@NotNull BaseViewHolder helper, @NotNull View view, T data, int position) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(view, "view");
    }

    public boolean i(@NotNull BaseViewHolder helper, @NotNull View view, T data, int position) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(view, "view");
        return false;
    }

    public void j(@NotNull BaseViewHolder helper, @NotNull View view, T data, int position) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @NotNull
    public BaseViewHolder k(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new BaseViewHolder(up.a(parent, f()));
    }

    public boolean l(@NotNull BaseViewHolder helper, @NotNull View view, T data, int position) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(view, "view");
        return false;
    }

    public void m(@NotNull BaseViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
    }

    public void n(@NotNull BaseViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
    }

    public void o(@NotNull BaseViewHolder viewHolder, int viewType) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
    }

    public final void p(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.context = context;
    }
}
