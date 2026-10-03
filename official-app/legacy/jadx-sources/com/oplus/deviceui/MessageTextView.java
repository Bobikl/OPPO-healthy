package com.oplus.deviceui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.heytap.udeviceui.R$id;
import com.heytap.udeviceui.R$layout;
import io.protostuff.MapSchema;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001f2\u00020\u0001:\u0001 B\u0011\b\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bB\u001b\b\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001a\u0010\u001eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002R\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006!"}, d2 = {"Lcom/oplus/deviceui/MessageTextView;", "Landroid/widget/FrameLayout;", "", "msg", "", "setMessage", "d", "c", "Landroid/view/View;", "view", "", "b", "", "i", "Z", "isTopTipShow", "Landroid/animation/ValueAnimator;", "j", "Landroid/animation/ValueAnimator;", "topTipAnimation", "Landroid/animation/ValueAnimator$AnimatorUpdateListener;", MapSchema.FIELD_NAME_KEY, "Landroid/animation/ValueAnimator$AnimatorUpdateListener;", "animatorUpdateListener", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Companion", "a", "udeviceui_release"}, k = 1, mv = {1, 4, 2})
public final class MessageTextView extends FrameLayout {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public boolean isTopTipShow;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public ValueAnimator topTipAnimation;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public final ValueAnimator.AnimatorUpdateListener animatorUpdateListener;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public HashMap f19682l;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "animation", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, k = 3, mv = {1, 4, 2})
    public static final class b implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ViewGroup.LayoutParams layoutParams;
            Object animatedValue = valueAnimator != null ? valueAnimator.getAnimatedValue() : null;
            if (animatedValue == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
            }
            int iIntValue = ((Integer) animatedValue).intValue();
            MessageTextView messageTextView = MessageTextView.this;
            int i = R$id.topTipLayout;
            FrameLayout frameLayout = (FrameLayout) messageTextView.a(i);
            if (frameLayout != null && (layoutParams = frameLayout.getLayoutParams()) != null) {
                layoutParams.height = iIntValue;
            }
            FrameLayout frameLayout2 = (FrameLayout) MessageTextView.this.a(i);
            if (frameLayout2 != null) {
                frameLayout2.requestLayout();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageTextView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.animatorUpdateListener = new b();
        View.inflate(getContext(), R$layout.message_text_layout, this);
    }

    public View a(int i) {
        if (this.f19682l == null) {
            this.f19682l = new HashMap();
        }
        View view = (View) this.f19682l.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i);
        this.f19682l.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    public final int b(View view) {
        view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        return view.getMeasuredHeight();
    }

    public final void c() {
        ValueAnimator valueAnimator;
        if (this.isTopTipShow && (valueAnimator = this.topTipAnimation) != null && valueAnimator.isRunning()) {
            Log.i("MessageTextView", "During show top tip, ignore hide event");
            return;
        }
        if (this.isTopTipShow) {
            this.isTopTipShow = false;
            int i = R$id.topTipLayout;
            if (((FrameLayout) a(i)) != null) {
                ValueAnimator valueAnimator2 = this.topTipAnimation;
                if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                    FrameLayout topTipLayout = (FrameLayout) a(i);
                    Intrinsics.checkNotNullExpressionValue(topTipLayout, "topTipLayout");
                    ValueAnimator duration = ValueAnimator.ofInt(b(topTipLayout), 0).setDuration(500L);
                    this.topTipAnimation = duration;
                    if (duration != null) {
                        duration.addUpdateListener(this.animatorUpdateListener);
                    }
                    ValueAnimator valueAnimator3 = this.topTipAnimation;
                    if (valueAnimator3 != null) {
                        valueAnimator3.start();
                    }
                }
            }
        }
    }

    public final void d() {
        ValueAnimator valueAnimator;
        if (!this.isTopTipShow && (valueAnimator = this.topTipAnimation) != null && valueAnimator.isRunning()) {
            Log.i("MessageTextView", "During hide top tip, ignore show event");
            return;
        }
        if (this.isTopTipShow) {
            Log.d("MessageTextView", "current top tip is show.");
            return;
        }
        this.isTopTipShow = true;
        int i = R$id.topTipLayout;
        if (((FrameLayout) a(i)) != null) {
            FrameLayout topTipLayout = (FrameLayout) a(i);
            Intrinsics.checkNotNullExpressionValue(topTipLayout, "topTipLayout");
            ValueAnimator duration = ValueAnimator.ofInt(0, b(topTipLayout)).setDuration(500L);
            this.topTipAnimation = duration;
            if (duration != null) {
                duration.addUpdateListener(this.animatorUpdateListener);
            }
            ValueAnimator valueAnimator2 = this.topTipAnimation;
            if (valueAnimator2 != null) {
                valueAnimator2.start();
            }
        }
    }

    public final void setMessage(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (StringsKt__StringsJVMKt.isBlank(msg)) {
            c();
            return;
        }
        AppCompatTextView topTipContent = (AppCompatTextView) a(R$id.topTipContent);
        Intrinsics.checkNotNullExpressionValue(topTipContent, "topTipContent");
        topTipContent.setText(msg);
        d();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.animatorUpdateListener = new b();
        View.inflate(getContext(), R$layout.message_text_layout, this);
    }
}
