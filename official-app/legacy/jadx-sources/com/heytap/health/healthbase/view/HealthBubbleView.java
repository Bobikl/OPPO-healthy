package com.heytap.health.healthbase.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.heytap.health.health_base.R$dimen;
import com.heytap.health.health_base.R$id;
import com.heytap.health.health_base.R$layout;
import com.heytap.health.health_base.R$styleable;
import com.heytap.health.healthbase.view.HealthBubbleView;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.ll3;
import com.oplus.aiunit.vision.tm9;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b4\u00105B\u001b\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b4\u00106B#\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u00107\u001a\u00020\u0002¢\u0006\u0004\b4\u00108J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0014J0\u0010\r\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0014J\u000e\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eJ\u001a\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0003J(\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001aH\u0002J\f\u0010\t\u001a\u00020\u0007*\u00020\u001eH\u0002J\f\u0010\u001f\u001a\u00020\u0005*\u00020\u001eH\u0002R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010$\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010'\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010(\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\t\u0010#R\u0016\u0010)\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u0010#R\u0016\u0010+\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010&R\u0016\u0010-\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b,\u0010#R\u0016\u0010/\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b.\u0010#R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00103\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u00102¨\u00069"}, d2 = {"Lcom/heytap/health/healthbase/view/HealthBubbleView;", "Landroid/widget/RelativeLayout;", "", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "", "changed", LogFieldKey.LEVEL_KEY, "t", "r", "b", "onLayout", "Lcom/oplus/aiunit/vision/tm9;", "listener", "setOnBubbleClickListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", b2n.f, "Landroidx/constraintlayout/widget/ConstraintLayout;", "rootView", "Landroid/widget/TextView;", "textView", "Landroid/widget/LinearLayout;", "actionView", "actionView2", "f", "Landroid/view/View;", LogFieldKey.MESSAGE_KEY, "i", "Landroidx/constraintlayout/widget/ConstraintLayout;", "j", "Landroid/widget/TextView;", "tvTopTips", MapSchema.FIELD_NAME_KEY, "Landroid/widget/LinearLayout;", "layoutTopTips", "tvAction1", "tvAction2", "n", "layoutTopTips2", "o", "tvAction3", LogFieldKey.PROCESS_NAME_KEY, "tvAction4", "q", "Lcom/oplus/aiunit/vision/tm9;", "Z", "adjust", "<init>", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "health_base_release"}, k = 1, mv = {1, 8, 0})
public final class HealthBubbleView extends RelativeLayout {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public ConstraintLayout rootView;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public TextView tvTopTips;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public LinearLayout layoutTopTips;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public TextView tvAction1;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public TextView tvAction2;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public LinearLayout layoutTopTips2;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public TextView tvAction3;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public TextView tvAction4;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @Nullable
    public tm9 listener;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public boolean adjust;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HealthBubbleView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.adjust = true;
        g(context, null);
    }

    public static final void h(HealthBubbleView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        tm9 tm9Var = this$0.listener;
        if (tm9Var != null) {
            tm9Var.a();
        }
    }

    public static final void i(HealthBubbleView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        tm9 tm9Var = this$0.listener;
        if (tm9Var != null) {
            tm9Var.a();
        }
    }

    public static final void j(HealthBubbleView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        tm9 tm9Var = this$0.listener;
        if (tm9Var != null) {
            tm9Var.b();
        }
    }

    public static final void k(HealthBubbleView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        tm9 tm9Var = this$0.listener;
        if (tm9Var != null) {
            tm9Var.b();
        }
    }

    public static final void n(View this_safeRequestLayout) {
        Intrinsics.checkNotNullParameter(this_safeRequestLayout, "$this_safeRequestLayout");
        this_safeRequestLayout.requestLayout();
    }

    public final void f(ConstraintLayout rootView, TextView textView, LinearLayout actionView, LinearLayout actionView2) {
        int measuredWidth = rootView.getMeasuredWidth();
        if (textView.getMeasuredWidth() + actionView.getMeasuredWidth() > (measuredWidth - getResources().getDimensionPixelOffset(R$dimen.health_top_tip_text_margin_start)) - getResources().getDimensionPixelOffset(R$dimen.health_top_tip_text_margin_end)) {
            actionView.setVisibility(8);
            actionView2.setVisibility(0);
        } else {
            actionView.setVisibility(0);
            actionView2.setVisibility(8);
        }
        m(this);
    }

    @SuppressLint({"CustomViewStyleable"})
    public final void g(Context context, AttributeSet attrs) {
        View.inflate(context, R$layout.health_common_bubble_tip_view, this);
        View viewFindViewById = findViewById(R$id.rootView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(R.id.rootView)");
        this.rootView = (ConstraintLayout) viewFindViewById;
        View viewFindViewById2 = findViewById(R$id.tv_top_tips);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(R.id.tv_top_tips)");
        this.tvTopTips = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R$id.layout_top_tips);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(R.id.layout_top_tips)");
        this.layoutTopTips = (LinearLayout) viewFindViewById3;
        View viewFindViewById4 = findViewById(R$id.tv_action1);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(R.id.tv_action1)");
        this.tvAction1 = (TextView) viewFindViewById4;
        View viewFindViewById5 = findViewById(R$id.tv_action2);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(R.id.tv_action2)");
        this.tvAction2 = (TextView) viewFindViewById5;
        View viewFindViewById6 = findViewById(R$id.layout_top_tips2);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(R.id.layout_top_tips2)");
        this.layoutTopTips2 = (LinearLayout) viewFindViewById6;
        View viewFindViewById7 = findViewById(R$id.tv_action3);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(R.id.tv_action3)");
        this.tvAction3 = (TextView) viewFindViewById7;
        View viewFindViewById8 = findViewById(R$id.tv_action4);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(R.id.tv_action4)");
        this.tvAction4 = (TextView) viewFindViewById8;
        TextView textView = this.tvAction1;
        TextView textView2 = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvAction1");
            textView = null;
        }
        textView.setTextColor(ll3.a(context));
        TextView textView3 = this.tvAction2;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvAction2");
            textView3 = null;
        }
        textView3.setTextColor(ll3.a(context));
        TextView textView4 = this.tvAction3;
        if (textView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvAction3");
            textView4 = null;
        }
        textView4.setTextColor(ll3.a(context));
        TextView textView5 = this.tvAction4;
        if (textView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvAction4");
            textView5 = null;
        }
        textView5.setTextColor(ll3.a(context));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, R$styleable.health_base_bubble_view);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "context.obtainStyledAttr….health_base_bubble_view)");
        String string = typedArrayObtainStyledAttributes.getString(R$styleable.health_base_bubble_view_health_base_tipsText);
        String string2 = typedArrayObtainStyledAttributes.getString(R$styleable.health_base_bubble_view_health_base_actionTextOne);
        String string3 = typedArrayObtainStyledAttributes.getString(R$styleable.health_base_bubble_view_health_base_actionTextTwo);
        TextView textView6 = this.tvTopTips;
        if (textView6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvTopTips");
            textView6 = null;
        }
        textView6.setText(string);
        TextView textView7 = this.tvAction1;
        if (textView7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvAction1");
            textView7 = null;
        }
        textView7.setText(string2);
        TextView textView8 = this.tvAction3;
        if (textView8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvAction3");
            textView8 = null;
        }
        textView8.setText(string2);
        if (TextUtils.isEmpty(string3)) {
            TextView textView9 = this.tvAction2;
            if (textView9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvAction2");
                textView9 = null;
            }
            textView9.setVisibility(8);
            TextView textView10 = this.tvAction4;
            if (textView10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvAction4");
                textView10 = null;
            }
            textView10.setVisibility(8);
        } else {
            TextView textView11 = this.tvAction2;
            if (textView11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvAction2");
                textView11 = null;
            }
            textView11.setVisibility(0);
            TextView textView12 = this.tvAction2;
            if (textView12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvAction2");
                textView12 = null;
            }
            textView12.setText(string3);
            TextView textView13 = this.tvAction4;
            if (textView13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvAction4");
                textView13 = null;
            }
            textView13.setVisibility(0);
            TextView textView14 = this.tvAction4;
            if (textView14 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvAction4");
                textView14 = null;
            }
            textView14.setText(string3);
        }
        TextView textView15 = this.tvAction1;
        if (textView15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvAction1");
            textView15 = null;
        }
        textView15.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.ep8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HealthBubbleView.h(this.i, view);
            }
        });
        TextView textView16 = this.tvAction3;
        if (textView16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvAction3");
            textView16 = null;
        }
        textView16.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.fp8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HealthBubbleView.i(this.i, view);
            }
        });
        TextView textView17 = this.tvAction2;
        if (textView17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvAction2");
            textView17 = null;
        }
        textView17.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.gp8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HealthBubbleView.j(this.i, view);
            }
        });
        TextView textView18 = this.tvAction4;
        if (textView18 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvAction4");
        } else {
            textView2 = textView18;
        }
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.hp8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HealthBubbleView.k(this.i, view);
            }
        });
        typedArrayObtainStyledAttributes.recycle();
    }

    public final boolean l(View view) {
        boolean z;
        if (!view.isInLayout()) {
            ViewParent parent = view.getParent();
            while (true) {
                if (parent == null) {
                    z = false;
                    break;
                }
                if (parent.isLayoutRequested()) {
                    z = true;
                    break;
                }
                parent = parent.getParent();
            }
            if (!z) {
                return true;
            }
        } else if (!view.isLayoutRequested()) {
            return true;
        }
        return false;
    }

    public final void m(final View view) {
        if (l(view)) {
            view.requestLayout();
        } else {
            view.post(new Runnable() { // from class: com.oplus.aiunit.vision.dp8
                @Override // java.lang.Runnable
                public final void run() {
                    HealthBubbleView.n(view);
                }
            });
        }
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int l2, int t, int r, int b) {
        super.onLayout(changed, l2, t, r, b);
        if (this.adjust) {
            ConstraintLayout constraintLayout = this.rootView;
            LinearLayout linearLayout = null;
            if (constraintLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rootView");
                constraintLayout = null;
            }
            TextView textView = this.tvTopTips;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvTopTips");
                textView = null;
            }
            LinearLayout linearLayout2 = this.layoutTopTips;
            if (linearLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutTopTips");
                linearLayout2 = null;
            }
            LinearLayout linearLayout3 = this.layoutTopTips2;
            if (linearLayout3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutTopTips2");
            } else {
                linearLayout = linearLayout3;
            }
            f(constraintLayout, textView, linearLayout2, linearLayout);
            this.adjust = false;
        }
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    public final void setOnBubbleClickListener(@NotNull tm9 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listener = listener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HealthBubbleView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.adjust = true;
        g(context, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HealthBubbleView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.adjust = true;
        g(context, attributeSet);
    }
}
