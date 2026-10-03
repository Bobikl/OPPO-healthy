package com.heytap.health.watchface.business.creation.category.flexible.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import androidx.recyclerview.widget.RecyclerView;
import com.heytap.health.ui.widget.CircleImageView;
import com.heytap.health.wallet.ui.adapter.BaseRecyclerViewHolder;
import com.heytap.health.watchface.R$id;
import com.heytap.health.watchface.R$layout;
import com.heytap.health.watchface.business.creation.category.flexible.adapter.DofRecordAdapter;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.a78;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.vd4;
import com.oplus.smartenginehelper.ParserTag;
import com.oplus.smartenginehelper.entity.ViewEntity;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0010\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001*B#\u0012\u0006\u0010\u0017\u001a\u00020\t\u0012\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u0018¢\u0006\u0004\b(\u0010)J\u0014\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003J\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tJ\u0006\u0010\f\u001a\u00020\u0006J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0018\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J\b\u0010\u0015\u001a\u00020\u000fH\u0016R\u0014\u0010\u0017\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0016R \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016R\u0016\u0010\"\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R0\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0019\u001a\u0004\b$\u0010%\"\u0004\b\u001c\u0010&¨\u0006+"}, d2 = {"Lcom/heytap/health/watchface/business/creation/category/flexible/adapter/DofRecordAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/heytap/health/watchface/business/creation/category/flexible/adapter/DofRecordAdapter$ViewHolder;", "", "Lcom/oplus/aiunit/vision/vd4;", "list", "", LogFieldKey.LEVEL_KEY, "f", "", ViewEntity.ENABLED, "j", MapSchema.FIELD_NAME_ENTRY, "Landroid/view/ViewGroup;", "parent", "", ParserTag.VIEW_TYPE, "i", BaseRecyclerViewHolder.HOLDER_TAG_HEADER, "position", b2n.f, "getItemCount", "Z", "isCircle", "Lkotlin/Function1;", "Lkotlin/jvm/functions/Function1;", "onItemClick", "", MapSchema.FIELD_NAME_KEY, "Ljava/util/List;", "records", "delMode", LogFieldKey.MESSAGE_KEY, "I", "deleteSize", "n", "getOnSelectedChanged", "()Lkotlin/jvm/functions/Function1;", "(Lkotlin/jvm/functions/Function1;)V", "onSelectedChanged", "<init>", "(ZLkotlin/jvm/functions/Function1;)V", "ViewHolder", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDofRecordAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DofRecordAdapter.kt\ncom/heytap/health/watchface/business/creation/category/flexible/adapter/DofRecordAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,88:1\n1855#2,2:89\n1855#2,2:91\n*S KotlinDebug\n*F\n+ 1 DofRecordAdapter.kt\ncom/heytap/health/watchface/business/creation/category/flexible/adapter/DofRecordAdapter\n*L\n35#1:89,2\n44#1:91,2\n*E\n"})
public final class DofRecordAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final boolean isCircle;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function1<vd4, Unit> onItemClick;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final List<vd4> records;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public boolean delMode;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public int deleteSize;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<? super Integer, Unit> onSelectedChanged;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0018"}, d2 = {"Lcom/heytap/health/watchface/business/creation/category/flexible/adapter/DofRecordAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "", "previewPath", "", "isCircle", "", "a", "Lcom/heytap/health/ui/widget/CircleImageView;", "i", "Lcom/heytap/health/ui/widget/CircleImageView;", "getIvPreview", "()Lcom/heytap/health/ui/widget/CircleImageView;", "ivPreview", "Landroid/widget/CheckBox;", "j", "Landroid/widget/CheckBox;", "b", "()Landroid/widget/CheckBox;", "cbSelect", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class ViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @NotNull
        public final CircleImageView ivPreview;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final CheckBox cbSelect;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            View viewFindViewById = itemView.findViewById(R$id.iv_template_preview);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "itemView.findViewById(R.id.iv_template_preview)");
            this.ivPreview = (CircleImageView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(R$id.cb_select);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "itemView.findViewById(R.id.cb_select)");
            this.cbSelect = (CheckBox) viewFindViewById2;
        }

        public final void a(@Nullable String previewPath, boolean isCircle) {
            boolean z = true;
            this.ivPreview.setType(!isCircle ? 1 : 0);
            if (previewPath != null && previewPath.length() != 0) {
                z = false;
            }
            if (z) {
                return;
            }
            a78.c(this.itemView.getContext(), previewPath, this.ivPreview);
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final CheckBox getCbSelect() {
            return this.cbSelect;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DofRecordAdapter(boolean z, @NotNull Function1<? super vd4, Unit> onItemClick) {
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        this.isCircle = z;
        this.onItemClick = onItemClick;
        this.records = new ArrayList();
    }

    public static final void h(DofRecordAdapter this$0, vd4 record, ViewHolder holder, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(record, "$record");
        Intrinsics.checkNotNullParameter(holder, "$holder");
        if (!this$0.delMode) {
            this$0.onItemClick.invoke(record);
            return;
        }
        boolean z = record.m;
        int i = this$0.deleteSize;
        this$0.deleteSize = z ? i - 1 : i + 1;
        record.m = !z;
        this$0.notifyItemChanged(holder.getAdapterPosition());
        Function1<? super Integer, Unit> function1 = this$0.onSelectedChanged;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(this$0.deleteSize));
        }
    }

    public final void e() {
        this.deleteSize = 0;
        Iterator<T> it = this.records.iterator();
        while (it.hasNext()) {
            ((vd4) it.next()).m = false;
        }
        notifyDataSetChanged();
    }

    @NotNull
    public final List<vd4> f() {
        return this.records;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull final ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        final vd4 vd4Var = this.records.get(position);
        holder.a(vd4Var.d, this.isCircle);
        holder.getCbSelect().setVisibility(this.delMode ? 0 : 8);
        holder.getCbSelect().setChecked(vd4Var.m);
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.ry5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DofRecordAdapter.h(this.i, vd4Var, holder, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.records.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View view = LayoutInflater.from(parent.getContext()).inflate(R$layout.watch_face_item_dof_template, parent, false);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        return new ViewHolder(view);
    }

    public final void j(boolean enabled) {
        this.delMode = enabled;
        if (!enabled) {
            this.deleteSize = 0;
            Iterator<T> it = this.records.iterator();
            while (it.hasNext()) {
                ((vd4) it.next()).m = false;
            }
        }
        notifyDataSetChanged();
    }

    public final void k(@Nullable Function1<? super Integer, Unit> function1) {
        this.onSelectedChanged = function1;
    }

    public final void l(@NotNull List<? extends vd4> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.records.clear();
        this.records.addAll(list);
        notifyDataSetChanged();
    }
}
