package com.heytap.store.base.core.view;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Outline;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.heytap.store.base.core.R;
import com.heytap.store.base.core.util.DisplayUtil;
import com.heytap.store.base.core.view.RedBubbleView;
import com.oplus.smartenginehelper.ParserTag;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u0014H\u0002J\b\u0010\u001a\u001a\u00020\u0014H\u0002J\u0006\u0010\u001b\u001a\u00020\u0014J\u000e\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001eJ\u000e\u0010\u001f\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u000eJ\b\u0010!\u001a\u00020\u0014H\u0002J\b\u0010\"\u001a\u00020\u0014H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/heytap/store/base/core/view/RedBubbleView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defaultStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "flWipes", "Landroid/widget/FrameLayout;", "imgWipes", "Landroidx/appcompat/widget/AppCompatImageView;", "isAnim", "", "isAniming", "needAnim", "tvItemBubble", "Landroid/widget/TextView;", "addOutlineProviders", "", "view", "Landroid/view/View;", "radius", "", "initView", "lastAnimation", "resetAnim", "setData", "count", "", "setNeedAnim", "need", "start", "startWipes", "Core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class RedBubbleView extends ConstraintLayout {
    private FrameLayout flWipes;
    private AppCompatImageView imgWipes;
    private boolean isAnim;
    private boolean isAniming;
    private boolean needAnim;
    private TextView tvItemBubble;

    /* JADX INFO: renamed from: com.heytap.store.base.core.view.RedBubbleView$lastAnimation$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"com/heytap/store/base/core/view/RedBubbleView$lastAnimation$2", "Landroid/animation/Animator$AnimatorListener;", ParserTag.TAG_ON_ANIMATION_CANCEL, "", "animation", "Landroid/animation/Animator;", ParserTag.TAG_ON_ANIMATION_END, ParserTag.TAG_ON_ANIMATION_REPEAT, ParserTag.TAG_ON_ANIMATION_START, "Core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class AnonymousClass2 implements Animator.AnimatorListener {
        public AnonymousClass2() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: onAnimationEnd$lambda-0, reason: not valid java name */
        public static final void m4807onAnimationEnd$lambda0(RedBubbleView this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.start();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@NotNull Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NotNull Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            final RedBubbleView redBubbleView = RedBubbleView.this;
            redBubbleView.postDelayed(new Runnable() { // from class: com.oplus.aiunit.vision.wjf
                @Override // java.lang.Runnable
                public final void run() {
                    RedBubbleView.AnonymousClass2.m4807onAnimationEnd$lambda0(redBubbleView);
                }
            }, 1800L);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@NotNull Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NotNull Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
        }
    }

    /* JADX INFO: renamed from: com.heytap.store.base.core.view.RedBubbleView$start$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"com/heytap/store/base/core/view/RedBubbleView$start$1", "Landroid/animation/Animator$AnimatorListener;", ParserTag.TAG_ON_ANIMATION_CANCEL, "", "animation", "Landroid/animation/Animator;", ParserTag.TAG_ON_ANIMATION_END, ParserTag.TAG_ON_ANIMATION_REPEAT, ParserTag.TAG_ON_ANIMATION_START, "Core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class C16251 implements Animator.AnimatorListener {
        public C16251() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: onAnimationEnd$lambda-0, reason: not valid java name */
        public static final void m4808onAnimationEnd$lambda0(RedBubbleView this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.startWipes();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@NotNull Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NotNull Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            final RedBubbleView redBubbleView = RedBubbleView.this;
            redBubbleView.postDelayed(new Runnable() { // from class: com.oplus.aiunit.vision.xjf
                @Override // java.lang.Runnable
                public final void run() {
                    RedBubbleView.C16251.m4808onAnimationEnd$lambda0(redBubbleView);
                }
            }, 600L);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@NotNull Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NotNull Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RedBubbleView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void addOutlineProviders(View view, final float radius) {
        view.setOutlineProvider(new ViewOutlineProvider() { // from class: com.heytap.store.base.core.view.RedBubbleView.addOutlineProviders.1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(@NotNull View view2, @NotNull Outline outline) {
                Intrinsics.checkNotNullParameter(view2, "view");
                Intrinsics.checkNotNullParameter(outline, "outline");
                outline.setRoundRect(0, 0, view2.getWidth(), view2.getHeight(), radius);
                view2.setClipToOutline(true);
            }
        });
    }

    private final void initView() {
        View.inflate(getContext(), R.layout.pf_core_view_red_bubble, this);
        View viewFindViewById = findViewById(R.id.tv_item_bubble);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(R.id.tv_item_bubble)");
        this.tvItemBubble = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.fl_wipes);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(R.id.fl_wipes)");
        this.flWipes = (FrameLayout) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.img_wipes);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(R.id.img_wipes)");
        this.imgWipes = (AppCompatImageView) viewFindViewById3;
        setClipChildren(false);
        FrameLayout frameLayout = this.flWipes;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("flWipes");
            frameLayout = null;
        }
        addOutlineProviders(frameLayout, DisplayUtil.dip2px(6.5f));
    }

    private final void lastAnimation() {
        TextView textView = this.tvItemBubble;
        TextView textView2 = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvItemBubble");
            textView = null;
        }
        textView.setPivotX(0.0f);
        TextView textView3 = this.tvItemBubble;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvItemBubble");
            textView3 = null;
        }
        TextView textView4 = this.tvItemBubble;
        if (textView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvItemBubble");
            textView4 = null;
        }
        textView3.setPivotY(textView4.getHeight());
        AnimatorSet animatorSet = new AnimatorSet();
        TextView textView5 = this.tvItemBubble;
        if (textView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvItemBubble");
            textView5 = null;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView5, "scaleX", 1.0f, 1.14f, 1.14f, 0.0f);
        TextView textView6 = this.tvItemBubble;
        if (textView6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvItemBubble");
            textView6 = null;
        }
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(textView6, "scaleY", 1.0f, 1.14f, 1.14f, 0.0f);
        TextView textView7 = this.tvItemBubble;
        if (textView7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvItemBubble");
        } else {
            textView2 = textView7;
        }
        final ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(textView2, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat3.setDuration(150L);
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        animatorSet.setDuration(400L);
        animatorSet.start();
        postDelayed(new Runnable() { // from class: com.oplus.aiunit.vision.vjf
            @Override // java.lang.Runnable
            public final void run() {
                objectAnimatorOfFloat3.start();
            }
        }, 200L);
        animatorSet.addListener(new AnonymousClass2());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void start() {
        if (this.isAniming) {
            return;
        }
        this.isAniming = true;
        TextView textView = this.tvItemBubble;
        TextView textView2 = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvItemBubble");
            textView = null;
        }
        textView.setPivotX(0.0f);
        TextView textView3 = this.tvItemBubble;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvItemBubble");
            textView3 = null;
        }
        TextView textView4 = this.tvItemBubble;
        if (textView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvItemBubble");
            textView4 = null;
        }
        textView3.setPivotY(textView4.getHeight());
        AnimatorSet animatorSet = new AnimatorSet();
        TextView textView5 = this.tvItemBubble;
        if (textView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvItemBubble");
            textView5 = null;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView5, "scaleX", 0.0f, 1.14f, 1.14f, 1.0f);
        TextView textView6 = this.tvItemBubble;
        if (textView6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvItemBubble");
            textView6 = null;
        }
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(textView6, "scaleY", 0.0f, 1.14f, 1.14f, 1.0f);
        TextView textView7 = this.tvItemBubble;
        if (textView7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvItemBubble");
        } else {
            textView2 = textView7;
        }
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(textView2, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat3.setDuration(150L);
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3);
        animatorSet.setDuration(400L);
        animatorSet.start();
        animatorSet.addListener(new C16251());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startWipes() {
        AppCompatImageView appCompatImageView = this.imgWipes;
        TextView textView = null;
        if (appCompatImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgWipes");
            appCompatImageView = null;
        }
        float width = appCompatImageView.getWidth();
        AppCompatImageView appCompatImageView2 = this.imgWipes;
        if (appCompatImageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgWipes");
            appCompatImageView2 = null;
        }
        float[] fArr = new float[2];
        float f = width / 2;
        fArr[0] = 0.0f - f;
        TextView textView2 = this.tvItemBubble;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvItemBubble");
        } else {
            textView = textView2;
        }
        fArr[1] = textView.getWidth() - f;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(appCompatImageView2, "translationX", fArr);
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: com.heytap.store.base.core.view.RedBubbleView.startWipes.1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                AppCompatImageView appCompatImageView3 = RedBubbleView.this.imgWipes;
                if (appCompatImageView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("imgWipes");
                    appCompatImageView3 = null;
                }
                appCompatImageView3.setVisibility(4);
                RedBubbleView.this.isAniming = false;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@NotNull Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@NotNull Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                AppCompatImageView appCompatImageView3 = RedBubbleView.this.imgWipes;
                if (appCompatImageView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("imgWipes");
                    appCompatImageView3 = null;
                }
                appCompatImageView3.setVisibility(0);
            }
        });
        objectAnimatorOfFloat.start();
    }

    public final void resetAnim() {
        this.isAnim = true;
    }

    public final void setData(long count) {
        if (count == 0) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        TextView textView = this.tvItemBubble;
        TextView textView2 = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvItemBubble");
            textView = null;
        }
        textView.setVisibility(0);
        if (count > 99) {
            TextView textView3 = this.tvItemBubble;
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvItemBubble");
            } else {
                textView2 = textView3;
            }
            textView2.setText("99+");
        } else {
            TextView textView4 = this.tvItemBubble;
            if (textView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvItemBubble");
            } else {
                textView2 = textView4;
            }
            textView2.setText(String.valueOf(count));
        }
        if (this.isAnim && this.needAnim) {
            this.isAnim = false;
            start();
        }
    }

    public final void setNeedAnim(boolean need) {
        this.needAnim = need;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RedBubbleView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ RedBubbleView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RedBubbleView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.isAnim = true;
        initView();
    }
}
