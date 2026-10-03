package com.coui.appcompat.opensource;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.heytap.health.wallet.ui.adapter.BaseRecyclerViewHolder;
import com.oplus.aiunit.vision.StatementSegment;
import com.oplus.smartenginehelper.ParserTag;
import com.support.component.R$layout;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u0000 \u000f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0010\u0011\u0012B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0006H\u0016¨\u0006\u0013"}, d2 = {"Lcom/coui/appcompat/opensource/COUIOpenSourceStatementAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/oplus/aiunit/vision/zmi;", "Lcom/coui/appcompat/opensource/COUIOpenSourceStatementAdapter$ViewHolder;", "Landroid/view/ViewGroup;", "parent", "", ParserTag.VIEW_TYPE, MapSchema.FIELD_NAME_ENTRY, BaseRecyclerViewHolder.HOLDER_TAG_HEADER, "position", "", "d", "<init>", "()V", "Companion", "a", "TimeConsumingOperationOnMainThreadException", "ViewHolder", "coui-support-component_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCOUIOpenSourceStatementAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 COUIOpenSourceStatementAdapter.kt\ncom/coui/appcompat/opensource/COUIOpenSourceStatementAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,126:1\n1#2:127\n*E\n"})
public final class COUIOpenSourceStatementAdapter extends ListAdapter<StatementSegment, ViewHolder> {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/coui/appcompat/opensource/COUIOpenSourceStatementAdapter$TimeConsumingOperationOnMainThreadException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "()V", "coui-support-component_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class TimeConsumingOperationOnMainThreadException extends RuntimeException {
        public TimeConsumingOperationOnMainThreadException() {
            super("The method loadText is time consuming, can not call this method on main thread");
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/coui/appcompat/opensource/COUIOpenSourceStatementAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/widget/TextView;", "i", "Landroid/widget/TextView;", "a", "()Landroid/widget/TextView;", "content", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "coui-support-component_release"}, k = 1, mv = {1, 8, 0})
    public static final class ViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @NotNull
        public final TextView content;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.content = (TextView) itemView;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final TextView getContent() {
            return this.content;
        }
    }

    public COUIOpenSourceStatementAdapter() {
        super(new DiffCallback());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.getContent().setText(getItem(position).getContent());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View textView = View.inflate(parent.getContext(), R$layout.coui_component_opensource_statement_article_body, null);
        textView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        Intrinsics.checkNotNullExpressionValue(textView, "textView");
        return new ViewHolder(textView);
    }
}
