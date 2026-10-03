package com.heytap.health.watchface.business.manager.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.heytap.health.wallet.ui.adapter.BaseRecyclerViewHolder;
import com.heytap.health.watchface.R$id;
import com.heytap.health.watchface.R$layout;
import com.heytap.health.watchface.business.manager.adapter.SearchSuggestionAdapter;
import com.oplus.smartenginehelper.ParserTag;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001b\u001cB\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0019\u0010\u001aJ\u0014\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003J\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\nH\u0016J\u0018\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\nH\u0016R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001d"}, d2 = {"Lcom/heytap/health/watchface/business/manager/adapter/SearchSuggestionAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "", "", "suggestions", "", "f", "Landroid/view/ViewGroup;", "parent", "", ParserTag.VIEW_TYPE, "onCreateViewHolder", "getItemCount", BaseRecyclerViewHolder.HOLDER_TAG_HEADER, "position", "onBindViewHolder", "Lcom/heytap/health/watchface/business/manager/adapter/SearchSuggestionAdapter$a;", "i", "Lcom/heytap/health/watchface/business/manager/adapter/SearchSuggestionAdapter$a;", "listener", "", "j", "Ljava/util/List;", "mSuggestions", "<init>", "(Lcom/heytap/health/watchface/business/manager/adapter/SearchSuggestionAdapter$a;)V", "a", "ViewHolder", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
public final class SearchSuggestionAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final a listener;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<String> mSuggestions;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/heytap/health/watchface/business/manager/adapter/SearchSuggestionAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/widget/TextView;", "i", "Landroid/widget/TextView;", "a", "()Landroid/widget/TextView;", "titleTv", "Landroid/view/View;", "itemView", "<init>", "(Lcom/heytap/health/watchface/business/manager/adapter/SearchSuggestionAdapter;Landroid/view/View;)V", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
    public final class ViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @NotNull
        public final TextView titleTv;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ SearchSuggestionAdapter f7041j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull SearchSuggestionAdapter searchSuggestionAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.f7041j = searchSuggestionAdapter;
            View viewFindViewById = itemView.findViewById(R$id.tv_title);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "itemView.findViewById(R.id.tv_title)");
            this.titleTv = (TextView) viewFindViewById;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final TextView getTitleTv() {
            return this.titleTv;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/heytap/health/watchface/business/manager/adapter/SearchSuggestionAdapter$a;", "", "", "suggestion", "", "a", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
    public interface a {
        void a(@NotNull String suggestion);
    }

    public SearchSuggestionAdapter(@NotNull a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listener = listener;
        this.mSuggestions = new ArrayList();
    }

    public static final void e(SearchSuggestionAdapter this$0, String suggestion, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(suggestion, "$suggestion");
        this$0.listener.a(suggestion);
    }

    public final void f(@NotNull List<String> suggestions) {
        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
        int size = this.mSuggestions.size();
        this.mSuggestions.clear();
        this.mSuggestions.addAll(suggestions);
        if (size <= 0) {
            notifyItemRangeInserted(0, suggestions.size());
            return;
        }
        notifyItemRangeChanged(0, suggestions.size());
        if (size > suggestions.size()) {
            notifyItemRangeRemoved(suggestions.size(), size - suggestions.size());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.mSuggestions.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        final String str = this.mSuggestions.get(position);
        if (holder instanceof ViewHolder) {
            ((ViewHolder) holder).getTitleTv().setText(str);
            holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.kkg
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SearchSuggestionAdapter.e(this.i, str, view);
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R$layout.watch_face_item_search_suggestion, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "from(parent.context).inf…      false\n            )");
        return new ViewHolder(this, viewInflate);
    }
}
