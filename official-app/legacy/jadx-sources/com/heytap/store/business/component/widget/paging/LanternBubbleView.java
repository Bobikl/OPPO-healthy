package com.heytap.store.business.component.widget.paging;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.heytap.store.base.core.util.DisplayUtil;
import com.heytap.store.business.component.databinding.LayoutLanternBubbleViewBinding;
import com.heytap.store.business.component.utils.ViewKtKt;
import com.heytap.store.business.component.widget.paging.LanternBubbleView;
import com.oplus.smartenginehelper.ParserTag;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u0016\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\nJ\b\u0010\u0015\u001a\u00020\u0010H\u0002J\b\u0010\u0016\u001a\u00020\u0010H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/heytap/store/business/component/widget/paging/LanternBubbleView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defaultStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "isCancle", "", "isLoop", "isMoreText", "mBinding", "Lcom/heytap/store/business/component/databinding/LayoutLanternBubbleViewBinding;", "lastAnimation", "", "setData", "text", "", "isNeedAnimation", "start", "startWipes", "widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class LanternBubbleView extends ConstraintLayout {

    @NotNull
    public Map<Integer, View> _$_findViewCache;
    private boolean isCancle;
    private boolean isLoop;
    private boolean isMoreText;

    @NotNull
    private final LayoutLanternBubbleViewBinding mBinding;

    /* JADX INFO: renamed from: com.heytap.store.business.component.widget.paging.LanternBubbleView$lastAnimation$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\t"}, d2 = {"com/heytap/store/business/component/widget/paging/LanternBubbleView$lastAnimation$2", "Landroid/animation/Animator$AnimatorListener;", ParserTag.TAG_ON_ANIMATION_CANCEL, "", "animation", "Landroid/animation/Animator;", ParserTag.TAG_ON_ANIMATION_END, ParserTag.TAG_ON_ANIMATION_REPEAT, ParserTag.TAG_ON_ANIMATION_START, "widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class AnonymousClass2 implements Animator.AnimatorListener {
        public AnonymousClass2() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: onAnimationEnd$lambda-0, reason: not valid java name */
        public static final void m4863onAnimationEnd$lambda0(LanternBubbleView this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.start();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@Nullable Animator animation) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@Nullable Animator animation) {
            final LanternBubbleView lanternBubbleView = LanternBubbleView.this;
            lanternBubbleView.postDelayed(new Runnable() { // from class: com.oplus.aiunit.vision.mta
                @Override // java.lang.Runnable
                public final void run() {
                    LanternBubbleView.AnonymousClass2.m4863onAnimationEnd$lambda0(lanternBubbleView);
                }
            }, 1800L);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@Nullable Animator animation) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@Nullable Animator animation) {
        }
    }

    /* JADX INFO: renamed from: com.heytap.store.business.component.widget.paging.LanternBubbleView$start$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\t"}, d2 = {"com/heytap/store/business/component/widget/paging/LanternBubbleView$start$1", "Landroid/animation/Animator$AnimatorListener;", ParserTag.TAG_ON_ANIMATION_CANCEL, "", "animation", "Landroid/animation/Animator;", ParserTag.TAG_ON_ANIMATION_END, ParserTag.TAG_ON_ANIMATION_REPEAT, ParserTag.TAG_ON_ANIMATION_START, "widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class AnonymousClass1 implements Animator.AnimatorListener {
        public AnonymousClass1() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: onAnimationEnd$lambda-0, reason: not valid java name */
        public static final void m4864onAnimationEnd$lambda0(LanternBubbleView this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.startWipes();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@Nullable Animator animation) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@Nullable Animator animation) {
            final LanternBubbleView lanternBubbleView = LanternBubbleView.this;
            lanternBubbleView.postDelayed(new Runnable() { // from class: com.oplus.aiunit.vision.nta
                @Override // java.lang.Runnable
                public final void run() {
                    LanternBubbleView.AnonymousClass1.m4864onAnimationEnd$lambda0(lanternBubbleView);
                }
            }, 600L);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@Nullable Animator animation) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@Nullable Animator animation) {
        }
    }

    /* JADX INFO: renamed from: com.heytap.store.business.component.widget.paging.LanternBubbleView$startWipes$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\t"}, d2 = {"com/heytap/store/business/component/widget/paging/LanternBubbleView$startWipes$1", "Landroid/animation/Animator$AnimatorListener;", ParserTag.TAG_ON_ANIMATION_CANCEL, "", "animation", "Landroid/animation/Animator;", ParserTag.TAG_ON_ANIMATION_END, ParserTag.TAG_ON_ANIMATION_REPEAT, ParserTag.TAG_ON_ANIMATION_START, "widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class C16351 implements Animator.AnimatorListener {
        public C16351() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: onAnimationEnd$lambda-0, reason: not valid java name */
        public static final void m4865onAnimationEnd$lambda0(LanternBubbleView this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.lastAnimation();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@Nullable Animator animation) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@Nullable Animator animation) {
            final LanternBubbleView lanternBubbleView = LanternBubbleView.this;
            lanternBubbleView.postDelayed(new Runnable() { // from class: com.oplus.aiunit.vision.ota
                @Override // java.lang.Runnable
                public final void run() {
                    LanternBubbleView.C16351.m4865onAnimationEnd$lambda0(lanternBubbleView);
                }
            }, LanternBubbleView.this.isMoreText ? 2800L : 2900L);
            LanternBubbleView.this.mBinding.imgWipes.setVisibility(4);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@Nullable Animator animation) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@Nullable Animator animation) {
            LanternBubbleView.this.mBinding.imgWipes.setVisibility(0);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LanternBubbleView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void lastAnimation() {
        this.mBinding.tvItemBubble.setPivotX(0.0f);
        TextView textView = this.mBinding.tvItemBubble;
        textView.setPivotY(textView.getHeight());
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.mBinding.tvItemBubble, "scaleX", 1.0f, 1.14f, 1.14f, 0.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.mBinding.tvItemBubble, "scaleY", 1.0f, 1.14f, 1.14f, 0.0f);
        final ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.mBinding.tvItemBubble, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat3.setDuration(150L);
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        animatorSet.setDuration(400L);
        animatorSet.start();
        postDelayed(new Runnable() { // from class: com.oplus.aiunit.vision.lta
            @Override // java.lang.Runnable
            public final void run() {
                objectAnimatorOfFloat3.start();
            }
        }, 200L);
        animatorSet.addListener(new AnonymousClass2());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void start() {
        this.mBinding.tvItemBubble.setVisibility(0);
        this.mBinding.tvItemBubble.setPivotX(0.0f);
        TextView textView = this.mBinding.tvItemBubble;
        textView.setPivotY(textView.getHeight());
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.mBinding.tvItemBubble, "scaleX", 0.0f, 1.14f, 1.14f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.mBinding.tvItemBubble, "scaleY", 0.0f, 1.14f, 1.14f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.mBinding.tvItemBubble, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat3.setDuration(150L);
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3);
        animatorSet.setDuration(400L);
        animatorSet.start();
        animatorSet.addListener(new AnonymousClass1());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startWipes() {
        float width = this.mBinding.imgWipes.getWidth();
        LayoutLanternBubbleViewBinding layoutLanternBubbleViewBinding = this.mBinding;
        float f = width / 2;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(layoutLanternBubbleViewBinding.imgWipes, "translationX", 0.0f - f, layoutLanternBubbleViewBinding.tvItemBubble.getWidth() - f);
        objectAnimatorOfFloat.setDuration(this.isMoreText ? 400L : 300L);
        objectAnimatorOfFloat.addListener(new C16351());
        objectAnimatorOfFloat.start();
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Nullable
    public View _$_findCachedViewById(int i) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i);
        if (viewFindViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    public final void setData(@NotNull String text, boolean isNeedAnimation) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.mBinding.tvItemBubble.setText(text);
        this.isMoreText = text.length() > 2;
        this.mBinding.tvItemBubble.setVisibility(0);
        if (isNeedAnimation) {
            start();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LanternBubbleView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ LanternBubbleView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LanternBubbleView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutLanternBubbleViewBinding layoutLanternBubbleViewBindingInflate = LayoutLanternBubbleViewBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(layoutLanternBubbleViewBindingInflate, "inflate(\n            Lay…           this\n        )");
        this.mBinding = layoutLanternBubbleViewBindingInflate;
        setClipChildren(false);
        FrameLayout frameLayout = layoutLanternBubbleViewBindingInflate.flWipes;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "mBinding.flWipes");
        ViewKtKt.addOutlineProvider(frameLayout, DisplayUtil.dip2px(6.5f));
        this._$_findViewCache = new LinkedHashMap();
    }
}
