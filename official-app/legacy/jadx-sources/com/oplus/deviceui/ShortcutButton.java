package com.oplus.deviceui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.heytap.udeviceui.R$id;
import com.heytap.udeviceui.R$layout;
import com.heytap.wearable.support.watchface.common.utils.ResourcesUtil;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015B\u0019\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0014\u0010\u0018J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0019"}, d2 = {"Lcom/oplus/deviceui/ShortcutButton;", "Landroid/widget/FrameLayout;", "Landroid/view/MotionEvent;", "event", "", "onTouchEvent", "Landroid/graphics/drawable/Drawable;", ResourcesUtil.ResourceType.DRAWABLE, "", "setIcon", "Landroid/view/View;", "target", "b", "c", "Landroid/view/animation/Interpolator;", "i", "Landroid/view/animation/Interpolator;", "mShortcutInterpolator", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attributes", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "udeviceui_release"}, k = 1, mv = {1, 4, 2})
@SuppressLint({"ClickableViewAccessibility"})
public final class ShortcutButton extends FrameLayout {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final Interpolator mShortcutInterpolator;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public HashMap f19692j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShortcutButton(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mShortcutInterpolator = new PathInterpolator(0.3f, 0.0f, 0.1f, 1.0f);
        View.inflate(getContext(), R$layout.shortcut_image_button, this);
    }

    public View a(int i) {
        if (this.f19692j == null) {
            this.f19692j = new HashMap();
        }
        View view = (View) this.f19692j.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i);
        this.f19692j.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    public final void b(View target) {
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(target, "scaleX", 1.0f, 0.92f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(target, "scaleY", 1.0f, 0.92f);
        animatorSet.setInterpolator(this.mShortcutInterpolator);
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        animatorSet.setDuration(200L);
        animatorSet.start();
    }

    public final void c(View target) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(target, "scaleX", 0.92f, 1.0f), ObjectAnimator.ofFloat(target, "scaleY", 0.92f, 1.0f));
        animatorSet.setInterpolator(this.mShortcutInterpolator);
        animatorSet.setDuration(340L);
        animatorSet.start();
    }

    @Override // android.view.View
    public boolean onTouchEvent(@Nullable MotionEvent event) {
        Integer numValueOf = event != null ? Integer.valueOf(event.getAction()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            ImageView mShortcutButton = (ImageView) a(R$id.mShortcutButton);
            Intrinsics.checkNotNullExpressionValue(mShortcutButton, "mShortcutButton");
            b(mShortcutButton);
        } else if ((numValueOf != null && numValueOf.intValue() == 1) || (numValueOf != null && numValueOf.intValue() == 3)) {
            ImageView mShortcutButton2 = (ImageView) a(R$id.mShortcutButton);
            Intrinsics.checkNotNullExpressionValue(mShortcutButton2, "mShortcutButton");
            c(mShortcutButton2);
        }
        return super.onTouchEvent(event);
    }

    public final void setIcon(@NotNull Drawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        ImageView mShortcutButton = (ImageView) a(R$id.mShortcutButton);
        Intrinsics.checkNotNullExpressionValue(mShortcutButton, "mShortcutButton");
        mShortcutButton.setForeground(drawable);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShortcutButton(@NotNull Context context, @NotNull AttributeSet attributes) {
        super(context, attributes);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        this.mShortcutInterpolator = new PathInterpolator(0.3f, 0.0f, 0.1f, 1.0f);
        View.inflate(getContext(), R$layout.shortcut_image_button, this);
    }
}
