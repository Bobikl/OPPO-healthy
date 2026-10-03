package com.heytap.health.watchface.business.manager.base;

import androidx.exifinterface.media.ExifInterface;
import androidx.recyclerview.widget.AsyncListDiffer;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.ltl;
import com.oplus.smartenginehelper.ParserTag;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000 .*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\b\u0012\u0004\u0012\u00028\u00010\u0004:\u0001/B\u0017\b\u0016\u0012\f\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000*¢\u0006\u0004\b,\u0010-J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\u0016\u0010\r\u001a\u00020\u00072\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000bJ\u0016\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tJ\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bJ\u0018\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\tH\u0002J\u0010\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002R*\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u0018\u0010\u001cR\"\u0010#\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\u001e\u0010\"R\u001c\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010)\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010\u001f¨\u00060"}, d2 = {"Lcom/heytap/health/watchface/business/manager/base/BaseListDifferAdapter;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "VH", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "onAttachedToRecyclerView", "", "getItemCount", "", "list", "submitList", "positionStart", "itemCount", b2n.f, "getCurrentList", "position", b2n.g, "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", ParserTag.LAYOUT_MANAGER, "f", "Lkotlin/Function0;", "i", "Lkotlin/jvm/functions/Function0;", "getOnPreload", "()Lkotlin/jvm/functions/Function0;", "(Lkotlin/jvm/functions/Function0;)V", "onPreload", "j", "I", "getPreloadCount", "()I", "(I)V", "preloadCount", "Landroidx/recyclerview/widget/AsyncListDiffer;", MapSchema.FIELD_NAME_KEY, "Landroidx/recyclerview/widget/AsyncListDiffer;", "listDiffer", LogFieldKey.LEVEL_KEY, "hasLoadedCount", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "itemCallback", "<init>", "(Landroidx/recyclerview/widget/DiffUtil$ItemCallback;)V", "Companion", "a", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
public abstract class BaseListDifferAdapter<T, VH extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<VH> {

    @NotNull
    public static final String TAG = "ListDifferAdapter";

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public Function0<Unit> onPreload;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public int preloadCount;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public AsyncListDiffer<T> listDiffer;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public int hasLoadedCount;

    public BaseListDifferAdapter(@NotNull DiffUtil.ItemCallback<T> itemCallback) {
        Intrinsics.checkNotNullParameter(itemCallback, "itemCallback");
        this.listDiffer = new AsyncListDiffer<>(this, itemCallback);
    }

    public final int f(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) layoutManager).findLastVisibleItemPosition();
        }
        return -1;
    }

    public final void g(int positionStart, int itemCount) {
        ltl.a(TAG, "notifyRangeInserted positionStart " + positionStart + ",itemCount " + itemCount);
        notifyItemRangeInserted(positionStart, itemCount);
    }

    @NotNull
    public final List<T> getCurrentList() {
        List<T> currentList = this.listDiffer.getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList, "listDiffer.currentList");
        return currentList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.listDiffer.getCurrentList().size();
    }

    public final void h(int itemCount, int position) {
        if (itemCount == this.hasLoadedCount || this.onPreload == null || position < Math.max((itemCount - 1) - this.preloadCount, 0)) {
            return;
        }
        ltl.a(TAG, "onScrollToPreload on preload data.");
        this.hasLoadedCount = itemCount;
        Function0<Unit> function0 = this.onPreload;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void i(@Nullable Function0<Unit> function0) {
        this.onPreload = function0;
    }

    public final void j(int i) {
        this.preloadCount = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        final RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener(this) { // from class: com.heytap.health.watchface.business.manager.base.BaseListDifferAdapter.onAttachedToRecyclerView.1
            public final /* synthetic */ BaseListDifferAdapter<T, VH> a;

            {
                this.a = this;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(@NotNull RecyclerView recyclerView2, int newState) {
                Intrinsics.checkNotNullParameter(recyclerView2, "recyclerView");
                super.onScrollStateChanged(recyclerView2, newState);
                if (newState == 0) {
                    BaseListDifferAdapter<T, VH> baseListDifferAdapter = this.a;
                    RecyclerView.LayoutManager layoutManager2 = layoutManager;
                    Intrinsics.checkNotNull(layoutManager2);
                    int iF = baseListDifferAdapter.f(layoutManager2);
                    BaseListDifferAdapter<T, VH> baseListDifferAdapter2 = this.a;
                    baseListDifferAdapter2.h(baseListDifferAdapter2.getItemCount(), iF);
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(@NotNull RecyclerView recyclerView2, int dx, int dy) {
                Intrinsics.checkNotNullParameter(recyclerView2, "recyclerView");
                super.onScrolled(recyclerView2, dx, dy);
                BaseListDifferAdapter<T, VH> baseListDifferAdapter = this.a;
                RecyclerView.LayoutManager layoutManager2 = layoutManager;
                Intrinsics.checkNotNull(layoutManager2);
                int iF = baseListDifferAdapter.f(layoutManager2);
                BaseListDifferAdapter<T, VH> baseListDifferAdapter2 = this.a;
                baseListDifferAdapter2.h(baseListDifferAdapter2.getItemCount(), iF);
            }
        });
    }

    public final void submitList(@Nullable List<? extends T> list) {
        Intrinsics.checkNotNull(list);
        ltl.a(TAG, "submitList new list size " + list.size());
        this.listDiffer.submitList(list);
    }
}
