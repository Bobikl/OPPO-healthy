package com.oplus.aiunit.vision;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.coui.appcompat.progressbar.COUILoadingView;
import com.heytap.health.cervical_vertebra.R$drawable;
import com.heytap.health.cervical_vertebra.R$id;
import com.heytap.health.cervical_vertebra.R$layout;
import com.heytap.health.cervical_vertebra.datamodel.Procedure;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.store.base.core.state.Constants;
import com.oplus.smartenginehelper.ParserTag;
import io.protostuff.MapSchema;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.ArraysKt___ArraysKt;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001f B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u000e\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nJ\u0018\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\rJ\u000e\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nJ\b\u0010\u0012\u001a\u00020\bH\u0002J\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002R\u0016\u0010\u0016\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0017R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001a¨\u0006!"}, d2 = {"Lcom/oplus/aiunit/vision/l1c;", "Lcom/heytap/health/base/view/recyclercard/a;", "", MapSchema.FIELD_NAME_ENTRY, "Landroid/content/Context;", "context", "Landroid/view/View;", "cardView", "", LogFieldKey.LEVEL_KEY, "Lcom/heytap/health/cervical_vertebra/datamodel/Procedure;", "procedure", "q", "", "angle", "t", "r", "s", LogFieldKey.PROCESS_NAME_KEY, "o", "Landroid/view/ViewGroup;", "Landroid/view/ViewGroup;", ParserTag.CHILD_LAYOUT, "Landroid/content/Context;", "", "Lcom/oplus/aiunit/vision/l1c$b;", "[Lcom/oplus/aiunit/vision/l1c$b;", "items", "<init>", "()V", "Companion", "a", "b", "cervical_vertebra_release"}, k = 1, mv = {1, 8, 0})
public final class l1c extends com.heytap.health.base.view.recyclercard.a {
    public static final int EVALUATING = 2;
    public static final int FAILURE = 3;
    public static final int INIT = 1;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public ViewGroup layout;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public Context context;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public final ItemViewHolder[] items = new ItemViewHolder[7];

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.l1c$b, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\t\u0012\u0006\u0010\u0016\u001a\u00020\u0012\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0011\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u0017\u0010\u0016\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u001a\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0018\u001a\u0004\b\n\u0010\u0019R\u0017\u0010\u001c\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u000f\u0010\u0019¨\u0006\u001f"}, d2 = {"Lcom/oplus/aiunit/vision/l1c$b;", "", "", "toString", "", "hashCode", "other", "", "equals", "Landroid/widget/TextView;", "a", "Landroid/widget/TextView;", "getTitle", "()Landroid/widget/TextView;", "title", "b", "d", "subtitle", "Landroid/widget/ImageView;", "c", "Landroid/widget/ImageView;", "()Landroid/widget/ImageView;", "statusImg", "Landroid/view/View;", "Landroid/view/View;", "()Landroid/view/View;", Constants.LOADING, MapSchema.FIELD_NAME_ENTRY, "skip", "<init>", "(Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ImageView;Landroid/view/View;Landroid/view/View;)V", "cervical_vertebra_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class ItemViewHolder {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public final TextView title;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final TextView subtitle;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final ImageView statusImg;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
        @NotNull
        public final View loading;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final View skip;

        public ItemViewHolder(@NotNull TextView title, @NotNull TextView subtitle, @NotNull ImageView statusImg, @NotNull View loading, @NotNull View skip) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(statusImg, "statusImg");
            Intrinsics.checkNotNullParameter(loading, "loading");
            Intrinsics.checkNotNullParameter(skip, "skip");
            this.title = title;
            this.subtitle = subtitle;
            this.statusImg = statusImg;
            this.loading = loading;
            this.skip = skip;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final View getLoading() {
            return this.loading;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final View getSkip() {
            return this.skip;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final ImageView getStatusImg() {
            return this.statusImg;
        }

        @NotNull
        /* JADX INFO: renamed from: d, reason: from getter */
        public final TextView getSubtitle() {
            return this.subtitle;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ItemViewHolder)) {
                return false;
            }
            ItemViewHolder itemViewHolder = (ItemViewHolder) other;
            return Intrinsics.areEqual(this.title, itemViewHolder.title) && Intrinsics.areEqual(this.subtitle, itemViewHolder.subtitle) && Intrinsics.areEqual(this.statusImg, itemViewHolder.statusImg) && Intrinsics.areEqual(this.loading, itemViewHolder.loading) && Intrinsics.areEqual(this.skip, itemViewHolder.skip);
        }

        public int hashCode() {
            return (((((((this.title.hashCode() * 31) + this.subtitle.hashCode()) * 31) + this.statusImg.hashCode()) * 31) + this.loading.hashCode()) * 31) + this.skip.hashCode();
        }

        @NotNull
        public String toString() {
            return "ItemViewHolder(title=" + this.title + ", subtitle=" + this.subtitle + ", statusImg=" + this.statusImg + ", loading=" + this.loading + ", skip=" + this.skip + ")";
        }
    }

    @Override // com.heytap.health.base.view.recyclercard.a
    public int e() {
        return R$layout.health_cervical_vertebra_card_mobility_evaluate;
    }

    @Override // com.heytap.health.base.view.recyclercard.a
    public void l(@Nullable Context context, @NotNull View cardView) {
        Intrinsics.checkNotNullParameter(cardView, "cardView");
        super.l(context, cardView);
        View viewA = a(cardView, R$id.ll_mobility_evaluate_actions_container);
        Intrinsics.checkNotNull(viewA, "null cannot be cast to non-null type android.view.ViewGroup");
        this.layout = (ViewGroup) viewA;
        if (context == null) {
            context = cardView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "cardView.context");
        }
        this.context = context;
        p();
    }

    public final void o(Procedure procedure) {
        Context context = this.context;
        ViewGroup viewGroup = null;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
            context = null;
        }
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        int i = R$layout.health_cervical_vertebra_item_evaluate;
        ViewGroup viewGroup2 = this.layout;
        if (viewGroup2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(ParserTag.CHILD_LAYOUT);
            viewGroup2 = null;
        }
        View viewInflate = layoutInflaterFrom.inflate(i, viewGroup2, false);
        viewInflate.setTag(procedure);
        TextView title = (TextView) viewInflate.findViewById(R$id.tv_mobility_evaluate_item_title);
        TextView subtitle = (TextView) viewInflate.findViewById(R$id.tv_mobility_evaluate_item_subtitle);
        ImageView statusImg = (ImageView) viewInflate.findViewById(R$id.iv_mobility_evaluate_item_status);
        COUILoadingView loadingProgressBar = (COUILoadingView) viewInflate.findViewById(R$id.progress_mobility_evaluate_item_loading);
        View skipTv = viewInflate.findViewById(R$id.tv_mobility_evaluate_item_skip);
        o1c o1cVar = o1c.INSTANCE;
        Context context2 = this.context;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
            context2 = null;
        }
        title.setText(o1cVar.b(procedure, context2));
        Context context3 = this.context;
        if (context3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
            context3 = null;
        }
        subtitle.setText(o1cVar.a(1, context3));
        Intrinsics.checkNotNullExpressionValue(title, "title");
        Intrinsics.checkNotNullExpressionValue(subtitle, "subtitle");
        Intrinsics.checkNotNullExpressionValue(statusImg, "statusImg");
        Intrinsics.checkNotNullExpressionValue(loadingProgressBar, "loadingProgressBar");
        Intrinsics.checkNotNullExpressionValue(skipTv, "skipTv");
        this.items[procedure.ordinal()] = new ItemViewHolder(title, subtitle, statusImg, loadingProgressBar, skipTv);
        ViewGroup viewGroup3 = this.layout;
        if (viewGroup3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(ParserTag.CHILD_LAYOUT);
        } else {
            viewGroup = viewGroup3;
        }
        viewGroup.addView(viewInflate);
    }

    public final void p() {
        Iterator it = ArraysKt___ArraysKt.take(Procedure.values(), 7).iterator();
        while (it.hasNext()) {
            o((Procedure) it.next());
        }
    }

    public final void q(@NotNull Procedure procedure) {
        Intrinsics.checkNotNullParameter(procedure, "procedure");
        ItemViewHolder itemViewHolder = this.items[procedure.ordinal()];
        if (itemViewHolder != null) {
            TextView subtitle = itemViewHolder.getSubtitle();
            o1c o1cVar = o1c.INSTANCE;
            Context context = this.context;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException("context");
                context = null;
            }
            subtitle.setText(o1cVar.a(2, context));
            itemViewHolder.getStatusImg().setVisibility(8);
            itemViewHolder.getLoading().setVisibility(0);
        }
    }

    public final void r(@NotNull Procedure procedure) {
        Intrinsics.checkNotNullParameter(procedure, "procedure");
        ItemViewHolder itemViewHolder = this.items[procedure.ordinal()];
        if (itemViewHolder != null) {
            TextView subtitle = itemViewHolder.getSubtitle();
            o1c o1cVar = o1c.INSTANCE;
            Context context = this.context;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException("context");
                context = null;
            }
            subtitle.setText(o1cVar.a(3, context));
            itemViewHolder.getStatusImg().setVisibility(0);
            itemViewHolder.getStatusImg().setImageResource(R$drawable.ic_evaluate_failed);
            itemViewHolder.getLoading().setVisibility(8);
        }
    }

    public final void s(@NotNull Procedure procedure) {
        Intrinsics.checkNotNullParameter(procedure, "procedure");
        ItemViewHolder itemViewHolder = this.items[procedure.ordinal()];
        if (itemViewHolder != null) {
            itemViewHolder.getSubtitle().setText("");
            itemViewHolder.getStatusImg().setVisibility(8);
            itemViewHolder.getLoading().setVisibility(8);
            itemViewHolder.getSkip().setVisibility(0);
        }
    }

    public final void t(@NotNull Procedure procedure, @Nullable String angle) {
        Intrinsics.checkNotNullParameter(procedure, "procedure");
        ItemViewHolder itemViewHolder = this.items[procedure.ordinal()];
        if (itemViewHolder != null) {
            if (TextUtils.isEmpty(angle)) {
                itemViewHolder.getSubtitle().setVisibility(8);
            } else {
                itemViewHolder.getSubtitle().setText(angle);
            }
            itemViewHolder.getStatusImg().setVisibility(0);
            itemViewHolder.getStatusImg().setImageResource(R$drawable.ic_evaluate_success);
            itemViewHolder.getLoading().setVisibility(8);
        }
    }
}
