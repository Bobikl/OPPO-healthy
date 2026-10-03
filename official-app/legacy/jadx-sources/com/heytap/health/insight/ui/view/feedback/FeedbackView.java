package com.heytap.health.insight.ui.view.feedback;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.heytap.health.health.impl.R$id;
import com.heytap.health.health.impl.R$layout;
import com.heytap.health.health.impl.R$string;
import com.heytap.health.insight.ui.view.feedback.FeedbackView;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.qtf;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0006\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002J\u001a\u0010\b\u001a\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002R\u0014\u0010\u000b\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/heytap/health/insight/ui/view/feedback/FeedbackView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lkotlin/Function1;", "Landroid/view/View;", "", "doSomethingOnClickPos", "setOnClickPos", "doSomethingOnClickNeg", "setOnClickNeg", "i", "Landroid/view/View;", "rootView", "Landroid/widget/TextView;", "j", "Landroid/widget/TextView;", "posBtn", MapSchema.FIELD_NAME_KEY, "negBtn", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Companion", "a", "health_impl_release"}, k = 1, mv = {1, 8, 0})
public final class FeedbackView extends ConstraintLayout {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final View rootView;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TextView posBtn;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final TextView negBtn;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedbackView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        View viewInflate = LayoutInflater.from(context).inflate(R$layout.health_insight_feedback, this);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "from(context)\n          …h_insight_feedback, this)");
        this.rootView = viewInflate;
        View viewFindViewById = viewInflate.findViewById(R$id.pos_tip);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "rootView.findViewById(R.id.pos_tip)");
        this.posBtn = (TextView) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(R$id.neg_tip);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "rootView.findViewById(R.id.neg_tip)");
        this.negBtn = (TextView) viewFindViewById2;
    }

    public static final void g(FeedbackView this$0, Function1 doSomethingOnClickNeg, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(doSomethingOnClickNeg, "$doSomethingOnClickNeg");
        Toast.makeText(this$0.getContext(), qtf.l(R$string.health_insight_feedback_thankful_advice), 0).show();
        doSomethingOnClickNeg.invoke(this$0.negBtn);
    }

    public static final void h(Function1 doSomethingOnClickPos, FeedbackView this$0, View view) {
        Intrinsics.checkNotNullParameter(doSomethingOnClickPos, "$doSomethingOnClickPos");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        doSomethingOnClickPos.invoke(this$0.posBtn);
    }

    public final void setOnClickNeg(@NotNull final Function1<? super View, Unit> doSomethingOnClickNeg) {
        Intrinsics.checkNotNullParameter(doSomethingOnClickNeg, "doSomethingOnClickNeg");
        this.negBtn.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.j97
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FeedbackView.g(this.i, doSomethingOnClickNeg, view);
            }
        });
    }

    public final void setOnClickPos(@NotNull final Function1<? super View, Unit> doSomethingOnClickPos) {
        Intrinsics.checkNotNullParameter(doSomethingOnClickPos, "doSomethingOnClickPos");
        a7b.f("InsightFeedbackView", "setOnClickPos");
        this.posBtn.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.i97
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FeedbackView.h(doSomethingOnClickPos, this, view);
            }
        });
    }
}
