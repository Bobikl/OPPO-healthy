package com.heytap.health.watchface.business.creation.category.flexible.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.heytap.health.ui.widget.CircleImageView;
import com.heytap.health.wallet.ui.adapter.BaseRecyclerViewHolder;
import com.heytap.health.watchface.R$id;
import com.heytap.health.watchface.R$layout;
import com.heytap.health.watchface.business.creation.category.flexible.adapter.DofTemplateAdapter;
import com.heytap.health.watchface.business.creation.category.flexible.bean.DofTemplateBean;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.a78;
import com.oplus.aiunit.vision.b2n;
import com.oplus.smartenginehelper.ParserTag;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#B#\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0017¢\u0006\u0004\b!\u0010\"J\"\u0010\t\u001a\u00020\b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003J\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0018\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\fH\u0016J\b\u0010\u0012\u001a\u00020\fH\u0016R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00060\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001d¨\u0006$"}, d2 = {"Lcom/heytap/health/watchface/business/creation/category/flexible/adapter/DofTemplateAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/heytap/health/watchface/business/creation/category/flexible/adapter/DofTemplateAdapter$ViewHolder;", "", "Lcom/heytap/health/watchface/business/creation/category/flexible/bean/DofTemplateBean;", "list", "", "resolvedPreviewPaths", "", b2n.g, "Landroid/view/ViewGroup;", "parent", "", ParserTag.VIEW_TYPE, b2n.f, BaseRecyclerViewHolder.HOLDER_TAG_HEADER, "position", MapSchema.FIELD_NAME_ENTRY, "getItemCount", "", "i", "Z", "isCircle", "Lkotlin/Function1;", "j", "Lkotlin/jvm/functions/Function1;", "onItemClick", "", MapSchema.FIELD_NAME_KEY, "Ljava/util/List;", "templates", LogFieldKey.LEVEL_KEY, "previewPaths", "<init>", "(ZLkotlin/jvm/functions/Function1;)V", "ViewHolder", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
public final class DofTemplateAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final boolean isCircle;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function1<DofTemplateBean, Unit> onItemClick;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final List<DofTemplateBean> templates;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<String> previewPaths;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/heytap/health/watchface/business/creation/category/flexible/adapter/DofTemplateAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "", "previewPath", "", "isCircle", "", "a", "Lcom/heytap/health/ui/widget/CircleImageView;", "i", "Lcom/heytap/health/ui/widget/CircleImageView;", "ivPreview", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class ViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @NotNull
        public final CircleImageView ivPreview;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            View viewFindViewById = itemView.findViewById(R$id.iv_template_preview);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "itemView.findViewById(R.id.iv_template_preview)");
            this.ivPreview = (CircleImageView) viewFindViewById;
        }

        public final void a(@NotNull String previewPath, boolean isCircle) {
            Intrinsics.checkNotNullParameter(previewPath, "previewPath");
            this.ivPreview.setType(!isCircle ? 1 : 0);
            if (previewPath.length() > 0) {
                a78.c(this.itemView.getContext(), previewPath, this.ivPreview);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DofTemplateAdapter(boolean z, @NotNull Function1<? super DofTemplateBean, Unit> onItemClick) {
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        this.isCircle = z;
        this.onItemClick = onItemClick;
        this.templates = new ArrayList();
        this.previewPaths = new ArrayList();
    }

    public static final void f(DofTemplateAdapter this$0, DofTemplateBean template, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(template, "$template");
        this$0.onItemClick.invoke(template);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        final DofTemplateBean dofTemplateBean = this.templates.get(position);
        boolean z = false;
        if (position >= 0 && position < this.previewPaths.size()) {
            z = true;
        }
        holder.a(z ? this.previewPaths.get(position) : "", this.isCircle);
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.yy5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DofTemplateAdapter.f(this.i, dofTemplateBean, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View view = LayoutInflater.from(parent.getContext()).inflate(R$layout.watch_face_item_dof_template, parent, false);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        return new ViewHolder(view);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.templates.size();
    }

    public final void h(@NotNull List<DofTemplateBean> list, @NotNull List<String> resolvedPreviewPaths) {
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(resolvedPreviewPaths, "resolvedPreviewPaths");
        this.templates.clear();
        this.templates.addAll(list);
        this.previewPaths.clear();
        this.previewPaths.addAll(resolvedPreviewPaths);
        notifyDataSetChanged();
    }
}
