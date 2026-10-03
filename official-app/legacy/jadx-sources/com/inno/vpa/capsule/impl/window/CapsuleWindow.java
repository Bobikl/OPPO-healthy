package com.inno.vpa.capsule.impl.window;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import com.heytap.udeviceui.R$anim;
import com.oplus.aiunit.vision.c7b;
import com.oplus.aiunit.vision.nx2;
import com.oplus.aiunit.vision.ox2;
import com.oplus.smartenginehelper.ParserTag;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \"2\u00020\u0001:\u0001#B\u000f\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0002J\b\u0010\u000b\u001a\u00020\u0004H\u0002J\b\u0010\f\u001a\u00020\u0004H\u0002R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\"\u0010\u0017\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006$"}, d2 = {"Lcom/inno/vpa/capsule/impl/window/CapsuleWindow;", "Landroid/widget/FrameLayout;", "Lcom/oplus/aiunit/vision/ox2;", "capsuleDismissCallBack", "", "setCapsuleDismissCallBack", "Landroid/view/KeyEvent;", "event", "", "dispatchKeyEvent", "b", "c", "d", "Landroid/view/View;", "i", "Landroid/view/View;", "mCapsuleView", "j", "Z", "getMAnimationRunning", "()Z", "setMAnimationRunning", "(Z)V", "mAnimationRunning", "mCapsuleDismissCallBack", "Lcom/oplus/aiunit/vision/ox2;", "getMCapsuleDismissCallBack", "()Lcom/oplus/aiunit/vision/ox2;", "setMCapsuleDismissCallBack", "(Lcom/oplus/aiunit/vision/ox2;)V", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Companion", "a", "udeviceui_release"}, k = 1, mv = {1, 4, 2})
public final class CapsuleWindow extends FrameLayout {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public View mCapsuleView;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public boolean mAnimationRunning;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/inno/vpa/capsule/impl/window/CapsuleWindow$b", "Lcom/oplus/aiunit/vision/nx2;", "Landroid/view/animation/Animation;", "animation", "", ParserTag.TAG_ON_ANIMATION_END, "udeviceui_release"}, k = 1, mv = {1, 4, 2})
    public static final class b extends nx2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Animation f8575n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Animation animation, String str, Animation animation2) {
            super(str, animation2);
            this.f8575n = animation;
        }

        @Override // com.oplus.aiunit.vision.nx2, android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(@NotNull Animation animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            super.onAnimationEnd(animation);
            c7b.INSTANCE.a(" CapsuleWindow", "playHideCapsuleAnimation onAnimationEnd");
            CapsuleWindow.this.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CapsuleWindow(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        b();
    }

    public final void b() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        setLayoutParams(layoutParams);
        c7b.INSTANCE.a(" CapsuleWindow", "CapsuleWindow init");
    }

    public final void c() {
        if (this.mAnimationRunning) {
            c7b.INSTANCE.a(" CapsuleWindow", "playHideCapsuleAnimation isAnimationRunning return");
            return;
        }
        c7b c7bVar = c7b.INSTANCE;
        c7bVar.a(" CapsuleWindow", "playHideCapsuleAnimation");
        if (this.mCapsuleView == null) {
            c7bVar.a(" CapsuleWindow", "playHideCapsuleAnimation view is null");
            return;
        }
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(getContext(), R$anim.anim_full_hide_capsule_fast);
        if (animationLoadAnimation != null) {
            animationLoadAnimation.setAnimationListener(new b(animationLoadAnimation, "hideCapsule", animationLoadAnimation));
            this.mAnimationRunning = true;
            View view = this.mCapsuleView;
            Intrinsics.checkNotNull(view);
            view.startAnimation(animationLoadAnimation);
        }
    }

    public final void d() {
        this.mAnimationRunning = false;
        this.mCapsuleView = null;
        removeAllViews();
        Intrinsics.checkNotNull(null);
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(@NotNull KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        c7b.INSTANCE.a(" CapsuleWindow", "onKeyDown keyCode=" + event.getKeyCode());
        if (event.getKeyCode() != 4 || event.getAction() != 1) {
            return super.dispatchKeyEvent(event);
        }
        c();
        return true;
    }

    public final boolean getMAnimationRunning() {
        return this.mAnimationRunning;
    }

    @Nullable
    public final ox2 getMCapsuleDismissCallBack() {
        return null;
    }

    public final void setCapsuleDismissCallBack(@Nullable ox2 capsuleDismissCallBack) {
    }

    public final void setMAnimationRunning(boolean z) {
        this.mAnimationRunning = z;
    }

    public final void setMCapsuleDismissCallBack(@Nullable ox2 ox2Var) {
    }
}
