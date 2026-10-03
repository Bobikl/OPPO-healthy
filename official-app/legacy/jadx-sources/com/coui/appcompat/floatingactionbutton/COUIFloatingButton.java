package com.coui.appcompat.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.PathInterpolator;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.recyclerview.widget.RecyclerView;
import com.coui.appcompat.grid.COUIResponsiveUtils;
import com.google.android.material.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.oplus.aiunit.vision.ai2;
import com.oplus.aiunit.vision.bn2;
import com.oplus.aiunit.vision.byg;
import com.oplus.aiunit.vision.ej2;
import com.oplus.aiunit.vision.g0l;
import com.oplus.aiunit.vision.hj2;
import com.oplus.aiunit.vision.hm2;
import com.oplus.aiunit.vision.lh2;
import com.oplus.aiunit.vision.mm2;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import com.support.appcompat.R$attr;
import com.support.floatingactionbutton.R$color;
import com.support.floatingactionbutton.R$dimen;
import com.support.floatingactionbutton.R$id;
import com.support.floatingactionbutton.R$styleable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class COUIFloatingButton extends LinearLayout {
    public static final int[] U = {-16842910};
    public static final PathInterpolator V = new hj2();
    public static final PathInterpolator W = new hj2();
    public int A;
    public int B;
    public Runnable C;
    public ValueAnimator D;
    public PathInterpolator E;
    public PathInterpolator F;
    public PathInterpolator G;
    public PathInterpolator H;
    public PathInterpolator I;
    public PathInterpolator J;
    public boolean K;
    public boolean L;
    public int M;
    public boolean N;
    public ValueAnimator O;

    @Nullable
    public l P;
    public l Q;
    public l R;
    public n S;
    public float T;
    public final RectF i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Rect f1766j;
    public final ai2 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ej2 f1767l;
    public mm2 m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public hm2 f1768n;
    public ShapeDrawable o;
    public int p;
    public int q;
    public float r;
    public final InstanceState s;
    public int t;
    public boolean u;
    public List<COUIFloatingButtonLabel> v;

    @Nullable
    public Drawable w;
    public AppCompatImageView x;
    public float y;
    public int z;

    public class a implements Animator.AnimatorListener {
        public final /* synthetic */ int i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ boolean f1771j;
        public final /* synthetic */ COUIFloatingButtonLabel k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ int f1772l;

        public a(int i, boolean z, COUIFloatingButtonLabel cOUIFloatingButtonLabel, int i2) {
            this.i = i;
            this.f1771j = z;
            this.k = cOUIFloatingButtonLabel;
            this.f1772l = i2;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.k.setTranslationY(COUIFloatingButton.this.O(this.i));
            this.k.getChildFloatingButton().setPivotX(this.k.getChildFloatingButton().getWidth() / 2.0f);
            this.k.getChildFloatingButton().setPivotY(this.k.getChildFloatingButton().getHeight() / 2.0f);
            COUIFloatingButtonLabel cOUIFloatingButtonLabel = this.k;
            cOUIFloatingButtonLabel.setPivotX(cOUIFloatingButtonLabel.getWidth());
            COUIFloatingButtonLabel cOUIFloatingButtonLabel2 = this.k;
            cOUIFloatingButtonLabel2.setPivotY(cOUIFloatingButtonLabel2.getHeight());
            if (COUIFloatingButton.this.W(this.i)) {
                COUIFloatingButton.this.s.mCOUIFloatingButtonAnimationIsRun = false;
            }
            COUIFloatingButton.this.j0(1);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (COUIFloatingButton.this.V(this.i)) {
                COUIFloatingButton.this.s.mCOUIFloatingButtonAnimationIsRun = true;
                COUIFloatingButton.this.setOnActionSelectedListener(null);
            }
            if (this.f1771j) {
                COUIFloatingButton.this.a0(this.k, this.i, this.f1772l, true);
            } else {
                COUIFloatingButton.this.a0(this.k, this.i, this.f1772l, false);
            }
            COUIFloatingButton.this.j0(4);
        }
    }

    public class b implements Animator.AnimatorListener {
        public final /* synthetic */ ObjectAnimator i;

        public b(ObjectAnimator objectAnimator) {
            this.i = objectAnimator;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.i.start();
        }
    }

    public class c implements l {
        public c() {
        }

        @Override // com.coui.appcompat.floatingactionbutton.COUIFloatingButton.l
        public boolean a(COUIFloatingButtonItem cOUIFloatingButtonItem) {
            if (COUIFloatingButton.this.P == null) {
                return false;
            }
            boolean zA = COUIFloatingButton.this.P.a(cOUIFloatingButtonItem);
            if (!zA) {
                COUIFloatingButton.this.G(false, 300);
            }
            return zA;
        }
    }

    public class d implements View.OnTouchListener {
        public d() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (COUIFloatingButton.this.isEnabled()) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    COUIFloatingButton.this.k.g(COUIFloatingButton.this.x);
                    COUIFloatingButton.this.y();
                    COUIFloatingButton.this.f1768n.i(true);
                } else if (action == 1 || action == 3) {
                    COUIFloatingButton.this.x(motionEvent);
                    COUIFloatingButton.this.f1768n.i(false);
                }
            }
            return false;
        }
    }

    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        @SensorsDataInstrumented
        public void onClick(View view) {
            if (COUIFloatingButton.this.S != null) {
                COUIFloatingButton.this.S.onClick();
            }
            COUIFloatingButton.this.P();
            SensorsDataAutoTrackHelper.trackViewOnClick(view);
        }
    }

    public class f extends ViewOutlineProvider {
        public f() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setOval(0, 0, view.getWidth(), view.getHeight());
        }
    }

    public class g implements Animator.AnimatorListener {
        public g() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            COUIFloatingButton cOUIFloatingButton = COUIFloatingButton.this;
            cOUIFloatingButton.removeCallbacks(cOUIFloatingButton.C);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            COUIFloatingButton.this.s.mCOUIFloatingButtonAnimationIsRun = false;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            COUIFloatingButton.this.s.mCOUIFloatingButtonAnimationIsRun = true;
            COUIFloatingButton cOUIFloatingButton = COUIFloatingButton.this;
            cOUIFloatingButton.removeCallbacks(cOUIFloatingButton.C);
        }
    }

    public class h implements ValueAnimator.AnimatorUpdateListener {
        public h() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue("alpha")).floatValue();
            float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue("scaleX")).floatValue();
            float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue("scaleY")).floatValue();
            COUIFloatingButton.this.x.setAlpha(fFloatValue);
            COUIFloatingButton.this.x.setScaleX(fFloatValue2);
            COUIFloatingButton.this.x.setScaleY(fFloatValue3);
        }
    }

    public class i implements Animator.AnimatorListener {
        public i() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            COUIFloatingButton cOUIFloatingButton = COUIFloatingButton.this;
            cOUIFloatingButton.removeCallbacks(cOUIFloatingButton.C);
            COUIFloatingButton.this.x.setVisibility(8);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            COUIFloatingButton.this.x.setVisibility(0);
            COUIFloatingButton.this.s.mCOUIFloatingButtonAnimationIsRun = false;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            COUIFloatingButton.this.s.mCOUIFloatingButtonAnimationIsRun = true;
            COUIFloatingButton cOUIFloatingButton = COUIFloatingButton.this;
            cOUIFloatingButton.postDelayed(cOUIFloatingButton.C, 5000L);
        }
    }

    public class j implements Animator.AnimatorListener {
        public final /* synthetic */ int i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ ObjectAnimator f1774j;
        public final /* synthetic */ SpringAnimation k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ COUIFloatingButtonLabel f1775l;
        public final /* synthetic */ int m;

        public j(int i, ObjectAnimator objectAnimator, SpringAnimation springAnimation, COUIFloatingButtonLabel cOUIFloatingButtonLabel, int i2) {
            this.i = i;
            this.f1774j = objectAnimator;
            this.k = springAnimation;
            this.f1775l = cOUIFloatingButtonLabel;
            this.m = i2;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (COUIFloatingButton.this.V(this.i)) {
                COUIFloatingButton.this.s.mCOUIFloatingButtonAnimationIsRun = false;
                COUIFloatingButton cOUIFloatingButton = COUIFloatingButton.this;
                cOUIFloatingButton.setOnActionSelectedListener(cOUIFloatingButton.Q);
            }
            COUIFloatingButton.this.j0(2);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (COUIFloatingButton.this.W(this.i)) {
                COUIFloatingButton.this.s.mCOUIFloatingButtonAnimationIsRun = true;
                COUIFloatingButton.this.setOnActionSelectedListener(null);
            }
            this.f1774j.start();
            this.k.animateToFinalPosition(0.0f);
            this.f1775l.setVisibility(this.m);
            COUIFloatingButton.this.j0(3);
        }
    }

    public class k implements Runnable {
        public k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            COUIFloatingButton.this.z();
        }

        public /* synthetic */ k(COUIFloatingButton cOUIFloatingButton, c cVar) {
            this();
        }
    }

    public interface l {
        boolean a(COUIFloatingButtonItem cOUIFloatingButtonItem);
    }

    public interface m {
    }

    public interface n {
        void onClick();
    }

    public COUIFloatingButton(Context context) {
        super(context);
        this.i = new RectF();
        this.f1766j = new Rect();
        this.k = new ai2();
        this.p = 0;
        this.q = 0;
        this.r = 1.0f;
        this.s = new InstanceState();
        this.v = new ArrayList();
        this.w = null;
        this.E = new PathInterpolator(0.25f, 0.1f, 0.25f, 1.0f);
        this.F = new hj2();
        this.G = new PathInterpolator(0.25f, 0.1f, 0.25f, 1.0f);
        this.H = new PathInterpolator(0.25f, 0.1f, 0.25f, 1.0f);
        this.I = new PathInterpolator(0.25f, 0.1f, 0.25f, 1.0f);
        this.J = new PathInterpolator(0.25f, 0.1f, 0.25f, 1.0f);
        this.K = true;
        this.L = true;
        this.N = true;
        this.O = null;
        this.R = new c();
        R(context, null);
    }

    public static int J(Context context, float f2) {
        return Math.round(TypedValue.applyDimension(1, f2, context.getResources().getDisplayMetrics()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Z(View view, boolean z) {
        if (z) {
            this.m.j();
        } else {
            this.m.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hide(@Nullable FloatingActionButton.OnVisibilityChangedListener onVisibilityChangedListener) {
        if (X()) {
            F();
            ViewCompat.animate(this.x).rotation(0.0f).setDuration(0L).start();
        }
    }

    public static boolean k0() {
        return bn2.b(37, 2);
    }

    public final void A(COUIFloatingButtonLabel cOUIFloatingButtonLabel, int i2, int i3, int i4, boolean z) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
        int iO = O(i3);
        if (z) {
            iO += marginLayoutParams.bottomMargin + this.x.getHeight();
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(cOUIFloatingButtonLabel, "translationY", iO);
        objectAnimatorOfFloat.setStartDelay(i2);
        objectAnimatorOfFloat.setDuration(i4);
        objectAnimatorOfFloat.setInterpolator(this.F);
        if (cOUIFloatingButtonLabel.getFloatingButtonLabelText().getText() != "") {
            if (Y()) {
                cOUIFloatingButtonLabel.getFloatingButtonLabelBackground().setPivotX(0.0f);
                cOUIFloatingButtonLabel.getFloatingButtonLabelBackground().setPivotY(cOUIFloatingButtonLabel.getFloatingButtonLabelBackground().getHeight());
            } else {
                cOUIFloatingButtonLabel.getFloatingButtonLabelBackground().setPivotX(cOUIFloatingButtonLabel.getFloatingButtonLabelBackground().getWidth());
                cOUIFloatingButtonLabel.getFloatingButtonLabelBackground().setPivotY(cOUIFloatingButtonLabel.getFloatingButtonLabelBackground().getHeight());
            }
        }
        objectAnimatorOfFloat.addListener(new a(i3, z, cOUIFloatingButtonLabel, i4));
        objectAnimatorOfFloat.start();
    }

    public final void B(COUIFloatingButtonLabel cOUIFloatingButtonLabel, int i2, int i3, int i4) {
        AnimatorSet animatorSet = new AnimatorSet();
        SpringAnimation springAnimation = new SpringAnimation(cOUIFloatingButtonLabel, DynamicAnimation.TRANSLATION_Y, 0.0f);
        springAnimation.getSpring().setStiffness(500.0f);
        springAnimation.getSpring().setDampingRatio(0.8f);
        springAnimation.setStartVelocity(0.0f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(cOUIFloatingButtonLabel.getChildFloatingButton(), "scaleX", 0.6f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(cOUIFloatingButtonLabel.getChildFloatingButton(), "scaleY", 0.6f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(cOUIFloatingButtonLabel.getFloatingButtonLabelBackground(), "scaleX", 0.6f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(cOUIFloatingButtonLabel.getFloatingButtonLabelBackground(), "scaleY", 0.6f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(cOUIFloatingButtonLabel.getChildFloatingButton(), "alpha", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(cOUIFloatingButtonLabel.getFloatingButtonLabelBackground(), "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat6.setInterpolator(this.E);
        objectAnimatorOfFloat6.setDuration(350L);
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat5, objectAnimatorOfFloat3, objectAnimatorOfFloat4);
        animatorSet.setInterpolator(this.E);
        animatorSet.setDuration(300L);
        animatorSet.setStartDelay(i2);
        if (cOUIFloatingButtonLabel.getFloatingButtonLabelText().getText() != "") {
            if (Y()) {
                cOUIFloatingButtonLabel.getFloatingButtonLabelBackground().setPivotX(0.0f);
                cOUIFloatingButtonLabel.getFloatingButtonLabelBackground().setPivotY(0.0f);
            } else {
                cOUIFloatingButtonLabel.getFloatingButtonLabelBackground().setPivotX(cOUIFloatingButtonLabel.getFloatingButtonLabelBackground().getWidth());
                cOUIFloatingButtonLabel.getFloatingButtonLabelBackground().setPivotY(0.0f);
            }
        }
        animatorSet.addListener(new j(i3, objectAnimatorOfFloat6, springAnimation, cOUIFloatingButtonLabel, i4));
        animatorSet.start();
    }

    public ValueAnimator C(Animator.AnimatorListener animatorListener) {
        ViewCompat.animate(this.x).cancel();
        ValueAnimator valueAnimatorOfPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(PropertyValuesHolder.ofFloat("alpha", this.x.getAlpha(), 0.0f), PropertyValuesHolder.ofFloat("scaleX", this.x.getScaleX(), 0.6f), PropertyValuesHolder.ofFloat("scaleY", this.x.getScaleY(), 0.6f));
        this.D = valueAnimatorOfPropertyValuesHolder;
        valueAnimatorOfPropertyValuesHolder.setInterpolator(V);
        this.D.setDuration(350L);
        this.D.addListener(animatorListener);
        this.D.addUpdateListener(new h());
        return this.D;
    }

    @Deprecated
    public ValueAnimator D() {
        return C(new i());
    }

    public final void E() {
        ValueAnimator valueAnimator = this.D;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return;
        }
        this.D.cancel();
    }

    public void F() {
        l0(false, true, 300, false);
    }

    public void G(boolean z, int i2) {
        l0(false, z, i2, false);
    }

    public void H(boolean z, int i2, boolean z2) {
        l0(false, z, i2, z2);
    }

    public final AppCompatImageView I() {
        AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
        int dimensionPixelSize = getResources().getDimensionPixelSize(R$dimen.coui_floating_button_item_stroke_width);
        int i2 = this.M;
        if (i2 > 0) {
            this.t = i2;
        } else {
            this.t = getResources().getDimensionPixelSize(R$dimen.coui_floating_button_size);
        }
        int i3 = this.t;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i3, i3);
        RectF rectF = this.i;
        int i4 = this.t;
        rectF.set(0.0f, 0.0f, i4, i4);
        layoutParams.gravity = GravityCompat.END;
        int iJ = J(getContext(), 0.0f);
        J(getContext(), 8.0f);
        layoutParams.setMargins(iJ, 0, iJ, 0);
        appCompatImageView.setId(R$id.coui_floating_button_main_fab);
        appCompatImageView.setLayoutParams(layoutParams);
        appCompatImageView.setPaddingRelative(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        appCompatImageView.setScaleType(ImageView.ScaleType.CENTER);
        appCompatImageView.setClickable(true);
        appCompatImageView.setFocusable(true);
        return appCompatImageView;
    }

    public final COUIFloatingButtonLabel K(int i2) {
        if (i2 < this.v.size()) {
            return this.v.get(i2);
        }
        return null;
    }

    @Nullable
    public final COUIFloatingButtonLabel L(int i2) {
        for (COUIFloatingButtonLabel cOUIFloatingButtonLabel : this.v) {
            if (cOUIFloatingButtonLabel.getId() == i2) {
                return cOUIFloatingButtonLabel;
            }
        }
        return null;
    }

    public final void M(View view) {
        view.getGlobalVisibleRect(this.f1766j);
        float fWidth = this.f1766j.width() / view.getScaleX();
        int iWidth = (int) ((fWidth - this.f1766j.width()) * (view.getPivotX() / fWidth));
        float fHeight = this.f1766j.height() / view.getScaleY();
        int iHeight = (int) ((fHeight - this.f1766j.height()) * (view.getPivotY() / fHeight));
        Rect rect = this.f1766j;
        rect.set(rect.left - iWidth, rect.top - iHeight, rect.right + iWidth, rect.bottom + iHeight);
    }

    public final int N(int i2) {
        return this.v.size() - i2;
    }

    public final int O(int i2) {
        if (i2 < 0 || i2 >= this.v.size()) {
            return 0;
        }
        return J(getContext(), (i2 * 72) + 88);
    }

    public final void P() {
        if (X()) {
            F();
        } else {
            b0();
        }
    }

    public boolean Q() {
        return this.v.size() > 0;
    }

    public final void R(Context context, @Nullable AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.COUIFloatingButton, 0, 0);
        this.K = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUIFloatingButton_fabNeedElevation, true);
        this.L = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUIFloatingButton_fabNeedVibrate, true);
        this.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.COUIFloatingButton_fabButtonSize, 0);
        this.N = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUIFloatingButton_fabScaleAnimation, true);
        this.T = typedArrayObtainStyledAttributes.getFloat(R$styleable.COUIFloatingButton_fabTranslateEnhancementRatio, 0.0f);
        this.x = I();
        f fVar = new f();
        if (this.K) {
            byg.c(this.x, getResources().getDimensionPixelOffset(com.support.appcompat.R$dimen.support_shadow_size_level_three), getResources().getColor(R$color.coui_floating_button_elevation_color));
        }
        this.x.setOutlineProvider(fVar);
        this.x.setClipToOutline(true);
        this.x.setDefaultFocusHighlightEnabled(false);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        this.o = shapeDrawable;
        shapeDrawable.getPaint().setColor(lh2.b(getContext(), R$attr.couiColorPrimary, 0));
        this.o.setBounds(0, 0, (int) this.i.width(), (int) this.i.height());
        ej2 ej2Var = new ej2(context, 0);
        this.f1767l = ej2Var;
        RectF rectF = this.i;
        ej2Var.E(rectF, rectF.width() / 2.0f, this.i.height() / 2.0f);
        mm2 mm2Var = new mm2(context);
        this.m = mm2Var;
        RectF rectF2 = this.i;
        mm2Var.x(rectF2, rectF2.width() / 2.0f, this.i.height() / 2.0f);
        View view = new View(getContext());
        int i2 = this.t;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, i2);
        view.setBackground(this.m);
        view.setFocusable(false);
        hm2 hm2Var = new hm2(new Drawable[]{this.o, this.f1767l});
        this.f1768n = hm2Var;
        hm2Var.c(this.x, 2);
        this.x.setBackground(this.f1768n);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = GravityCompat.END;
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setClipChildren(false);
        frameLayout.addView(this.x);
        frameLayout.addView(view, layoutParams);
        addView(frameLayout, layoutParams2);
        setClipChildren(false);
        setClipToPadding(false);
        setFocusable(false);
        this.x.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.oplus.aiunit.vision.zh2
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                this.i.Z(view2, z);
            }
        });
        this.C = new k(this, null);
        this.B = ResourcesCompat.getColor(context.getResources(), R$color.coui_floating_button_disabled_color, context.getTheme());
        try {
            try {
                this.u = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUIFloatingButton_fabExpandAnimationEnable, true);
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.COUIFloatingButton_mainFloatingButtonSrc, Integer.MIN_VALUE);
                if (resourceId != Integer.MIN_VALUE) {
                    setMainFabDrawable(AppCompatResources.getDrawable(getContext(), resourceId));
                }
                i0();
                setMainFloatingButtonBackgroundColor(typedArrayObtainStyledAttributes.getColorStateList(R$styleable.COUIFloatingButton_mainFloatingButtonBackgroundColor));
                setFloatingButtonExpandEnable(this.u);
                setEnabled(typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUIFloatingButton_android_enabled, isEnabled()));
            } catch (Exception e2) {
                Log.e("COUIFloatingButton", "Failure setting FabWithLabelView icon" + e2.getMessage());
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public boolean S(int i2) {
        if (i2 < 0 || i2 >= this.v.size()) {
            return false;
        }
        return (((float) O(i2)) + ((float) ((ViewGroup.MarginLayoutParams) getLayoutParams()).bottomMargin)) + ((float) this.x.getHeight()) <= ((float) (this.z + this.A));
    }

    public boolean T() {
        return this.s.mCOUIFloatingButtonAnimationIsRun;
    }

    public final boolean U(int i2, int i3) {
        M(this.x);
        return this.f1766j.contains(i2, i3);
    }

    public final boolean V(int i2) {
        COUIFloatingButtonLabel cOUIFloatingButtonLabelK = K(i2);
        return cOUIFloatingButtonLabelK != null && indexOfChild(cOUIFloatingButtonLabelK) == this.v.size() - 1;
    }

    public final boolean W(int i2) {
        COUIFloatingButtonLabel cOUIFloatingButtonLabelK = K(i2);
        return cOUIFloatingButtonLabelK != null && indexOfChild(cOUIFloatingButtonLabelK) == 0;
    }

    public boolean X() {
        return this.s.mCOUIFloatingButtonMenuIsOpen;
    }

    public final boolean Y() {
        return getLayoutDirection() == 1;
    }

    public final void a0(COUIFloatingButtonLabel cOUIFloatingButtonLabel, int i2, int i3, boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(cOUIFloatingButtonLabel.getChildFloatingButton(), "scaleX", 1.0f, 0.6f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(cOUIFloatingButtonLabel.getChildFloatingButton(), "scaleY", 1.0f, 0.6f);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(cOUIFloatingButtonLabel.getFloatingButtonLabelBackground(), "scaleX", 1.0f, 0.6f);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(cOUIFloatingButtonLabel.getFloatingButtonLabelBackground(), "scaleY", 1.0f, 0.6f);
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(cOUIFloatingButtonLabel.getChildFloatingButton(), "alpha", 1.0f, 0.0f);
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(cOUIFloatingButtonLabel.getFloatingButtonLabelBackground(), "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat6.setInterpolator(this.H);
        objectAnimatorOfFloat6.setDuration(200L);
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat5, objectAnimatorOfFloat4, objectAnimatorOfFloat3);
        animatorSet.setInterpolator(this.F);
        animatorSet.setDuration(i3);
        animatorSet.addListener(new b(objectAnimatorOfFloat6));
        animatorSet.start();
    }

    public void b0() {
        l0(true, true, 300, false);
    }

    public final void c0() {
        if (this.L) {
            performHapticFeedback(302);
        }
    }

    @Nullable
    public final COUIFloatingButtonItem d0(@Nullable COUIFloatingButtonLabel cOUIFloatingButtonLabel, @Nullable Iterator<COUIFloatingButtonLabel> it, boolean z) {
        if (cOUIFloatingButtonLabel == null) {
            return null;
        }
        COUIFloatingButtonItem floatingButtonItem = cOUIFloatingButtonLabel.getFloatingButtonItem();
        if (it != null) {
            it.remove();
        } else {
            this.v.remove(cOUIFloatingButtonLabel);
        }
        removeView(cOUIFloatingButtonLabel);
        return floatingButtonItem;
    }

    public void e0() {
        Iterator<COUIFloatingButtonLabel> it = this.v.iterator();
        while (it.hasNext()) {
            d0(it.next(), it, true);
        }
    }

    @Nullable
    public COUIFloatingButtonLabel f0(@Nullable COUIFloatingButtonItem cOUIFloatingButtonItem, COUIFloatingButtonItem cOUIFloatingButtonItem2) {
        COUIFloatingButtonLabel cOUIFloatingButtonLabelL;
        int iIndexOf;
        if (cOUIFloatingButtonItem == null || (cOUIFloatingButtonLabelL = L(cOUIFloatingButtonItem.getFloatingButtonItemLocation())) == null || (iIndexOf = this.v.indexOf(cOUIFloatingButtonLabelL)) < 0) {
            return null;
        }
        int visibility = cOUIFloatingButtonLabelL.getVisibility();
        d0(L(cOUIFloatingButtonItem2.getFloatingButtonItemLocation()), null, false);
        d0(L(cOUIFloatingButtonItem.getFloatingButtonItemLocation()), null, false);
        return v(cOUIFloatingButtonItem2, iIndexOf, false, visibility);
    }

    public ObjectAnimator g0(boolean z) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.x, "rotation", this.y, 0.0f);
        objectAnimatorOfFloat.setInterpolator(this.J);
        objectAnimatorOfFloat.setDuration(z ? 250L : 300L);
        return objectAnimatorOfFloat;
    }

    @NonNull
    public ArrayList<COUIFloatingButtonItem> getActionItems() {
        ArrayList<COUIFloatingButtonItem> arrayList = new ArrayList<>(this.v.size());
        Iterator<COUIFloatingButtonLabel> it = this.v.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getFloatingButtonItem());
        }
        return arrayList;
    }

    public AppCompatImageView getMainFloatingButton() {
        return this.x;
    }

    public ColorStateList getMainFloatingButtonBackgroundColor() {
        return this.s.mMainCOUIFloatingButtonBackgroundColor;
    }

    public Bundle getSeamlessViewBundle() {
        return this.k.f();
    }

    public void h0(View view, float f2, boolean z) {
        this.y = f2;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.x, "rotation", 0.0f, f2);
        objectAnimatorOfFloat.setInterpolator(this.I);
        objectAnimatorOfFloat.setDuration(z ? 250L : 300L);
        objectAnimatorOfFloat.start();
    }

    public final void i0() {
        setOrientation(1);
        Iterator<COUIFloatingButtonLabel> it = this.v.iterator();
        while (it.hasNext()) {
            it.next().setOrientation(0);
        }
        G(false, 300);
        ArrayList<COUIFloatingButtonItem> actionItems = getActionItems();
        e0();
        w(actionItems);
    }

    public final boolean j0(int i2) {
        int i3 = this.p;
        if (i3 != -1) {
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            if (i3 == 4 && i2 == 1) {
                                this.p = i2;
                            }
                        } else if (i2 == 2) {
                            this.p = i2;
                        }
                    } else if (i2 == 4 || i2 == -1) {
                        this.p = i2;
                    }
                } else if (i2 == 3 || i2 == -1 || i2 == 0) {
                    this.p = i2;
                }
            } else if (i2 == -1 || i2 == 1) {
                this.p = i2;
            }
        } else if (i2 == 0 || i2 == 1) {
            this.p = i2;
        }
        return i2 == this.p;
    }

    public final void l0(boolean z, boolean z2, int i2, boolean z3) {
        if (this.K) {
            if (z && this.v.isEmpty()) {
                z = false;
            }
            if (X() == z || T()) {
                return;
            }
            o0(z, z2, i2, z3);
            m0(z2, z3);
        }
    }

    public final void m0(boolean z, boolean z2) {
        if (X()) {
            h0(this.x, 45.0f, z2);
            return;
        }
        g0(z2).start();
        Drawable drawable = this.w;
        if (drawable != null) {
            this.x.setImageDrawable(drawable);
        }
    }

    public final void n0() {
        ColorStateList mainFloatingButtonBackgroundColor = getMainFloatingButtonBackgroundColor();
        if (mainFloatingButtonBackgroundColor == null || mainFloatingButtonBackgroundColor == ColorStateList.valueOf(Integer.MIN_VALUE)) {
            this.o.getPaint().setColor(isEnabled() ? lh2.b(getContext(), R$attr.couiColorPrimary, 0) : this.B);
        } else {
            this.o.getPaint().setColor(isEnabled() ? mainFloatingButtonBackgroundColor.getDefaultColor() : mainFloatingButtonBackgroundColor.getColorForState(U, this.B));
        }
    }

    public final void o0(boolean z, boolean z2, int i2, boolean z3) {
        int size = this.v.size();
        if (!z) {
            for (int i3 = 0; i3 < size; i3++) {
                COUIFloatingButtonLabel cOUIFloatingButtonLabel = this.v.get(i3);
                if (z2) {
                    A(cOUIFloatingButtonLabel, i3 * 50, i3, i2, z3);
                }
            }
            this.f1767l.I(false, false, true);
            this.s.mCOUIFloatingButtonMenuIsOpen = false;
            return;
        }
        for (int i4 = 0; i4 < size; i4++) {
            int i5 = (size - 1) - i4;
            COUIFloatingButtonLabel cOUIFloatingButtonLabel2 = this.v.get(i5);
            if (this.z != 0) {
                if (S(i5)) {
                    cOUIFloatingButtonLabel2.setVisibility(0);
                    if (z2) {
                        B(cOUIFloatingButtonLabel2, i4 * 50, i5, 0);
                    }
                } else {
                    cOUIFloatingButtonLabel2.setVisibility(8);
                    if (z2) {
                        B(cOUIFloatingButtonLabel2, i4 * 50, i5, 8);
                    }
                }
            } else if (z2) {
                B(cOUIFloatingButtonLabel2, i4 * 50, i5, 0);
            }
        }
        this.s.mCOUIFloatingButtonMenuIsOpen = true;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.M <= 0) {
            Context contextCreateConfigurationContext = getContext().createConfigurationContext(configuration);
            if (COUIResponsiveUtils.isSmallScreenDp(configuration.screenWidthDp)) {
                this.t = contextCreateConfigurationContext.getResources().getDimensionPixelOffset(R$dimen.coui_floating_button_normal_size);
            } else {
                this.t = contextCreateConfigurationContext.getResources().getDimensionPixelOffset(R$dimen.coui_floating_button_large_size);
            }
            ViewGroup.LayoutParams layoutParams = this.x.getLayoutParams();
            int i2 = this.t;
            layoutParams.width = i2;
            layoutParams.height = i2;
            this.x.setLayoutParams(layoutParams);
            RectF rectF = this.i;
            int i3 = this.t;
            rectF.set(0.0f, 0.0f, i3, i3);
            ej2 ej2Var = this.f1767l;
            RectF rectF2 = this.i;
            ej2Var.E(rectF2, rectF2.width() / 2.0f, this.i.height() / 2.0f);
            mm2 mm2Var = this.m;
            RectF rectF3 = this.i;
            mm2Var.x(rectF3, rectF3.width() / 2.0f, this.i.height() / 2.0f);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ai2 ai2Var = this.k;
        if (ai2Var != null) {
            ai2Var.e();
        }
    }

    @Nullable
    public COUIFloatingButtonLabel s(COUIFloatingButtonItem cOUIFloatingButtonItem) {
        return t(cOUIFloatingButtonItem, this.v.size());
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        getMainFloatingButton().setEnabled(z);
        if (z) {
            this.x.setAlpha(1.0f);
            j0(this.q);
        } else {
            this.x.setAlpha(0.3f);
            this.q = this.p;
            j0(-1);
        }
    }

    public void setFloatingButtonClickListener(n nVar) {
        this.S = nVar;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void setFloatingButtonExpandEnable(boolean z) {
        if (z) {
            this.x.setOnTouchListener(new d());
        }
        this.x.setOnClickListener(new e());
    }

    public void setIsFloatingButtonExpandEnable(boolean z) {
        this.u = z;
        if (z) {
            j0(1);
        } else {
            j0(0);
        }
    }

    public void setMainFabDrawable(@Nullable Drawable drawable) {
        this.w = drawable;
        m0(false, false);
    }

    public void setMainFloatingButtonBackgroundColor(ColorStateList colorStateList) {
        this.s.mMainCOUIFloatingButtonBackgroundColor = colorStateList;
        if (colorStateList != null) {
            this.s.mShadowColor = colorStateList.getDefaultColor();
            if (this.K) {
                byg.d(this.x, getResources().getDimensionPixelOffset(com.support.appcompat.R$dimen.support_shadow_size_level_three), getResources().getColor(R$color.coui_floating_button_elevation_color), this.s.mShadowColor);
            }
        }
        n0();
    }

    public void setOnActionSelectedListener(@Nullable l lVar) {
        this.P = lVar;
        if (lVar != null) {
            this.Q = lVar;
        }
        for (int i2 = 0; i2 < this.v.size(); i2++) {
            this.v.get(i2).setOnActionSelectedListener(this.R);
        }
    }

    public void setOnChangeListener(@Nullable m mVar) {
    }

    public void setScaleAnimation(boolean z) {
        this.N = z;
    }

    @Nullable
    public COUIFloatingButtonLabel t(COUIFloatingButtonItem cOUIFloatingButtonItem, int i2) {
        return u(cOUIFloatingButtonItem, i2, true);
    }

    public COUIFloatingButtonLabel u(COUIFloatingButtonItem cOUIFloatingButtonItem, int i2, boolean z) {
        return v(cOUIFloatingButtonItem, i2, z, 0);
    }

    @Nullable
    public COUIFloatingButtonLabel v(COUIFloatingButtonItem cOUIFloatingButtonItem, int i2, boolean z, int i3) {
        COUIFloatingButtonLabel cOUIFloatingButtonLabelL = L(cOUIFloatingButtonItem.getFloatingButtonItemLocation());
        if (cOUIFloatingButtonLabelL != null) {
            return f0(cOUIFloatingButtonLabelL.getFloatingButtonItem(), cOUIFloatingButtonItem);
        }
        COUIFloatingButtonLabel cOUIFloatingButtonLabelCreateFabWithLabelView = cOUIFloatingButtonItem.createFabWithLabelView(getContext());
        cOUIFloatingButtonLabelCreateFabWithLabelView.setMainButtonSize(this.M);
        cOUIFloatingButtonLabelCreateFabWithLabelView.setOrientation(getOrientation() == 1 ? 0 : 1);
        cOUIFloatingButtonLabelCreateFabWithLabelView.setOnActionSelectedListener(this.R);
        cOUIFloatingButtonLabelCreateFabWithLabelView.setVisibility(i3);
        int iN = N(i2);
        if (i2 == 0) {
            cOUIFloatingButtonLabelCreateFabWithLabelView.setPaddingRelative(getPaddingStart(), getPaddingTop(), getPaddingEnd(), getResources().getDimensionPixelSize(R$dimen.coui_floating_button_item_first_bottom_margin));
            addView(cOUIFloatingButtonLabelCreateFabWithLabelView, iN);
        } else {
            cOUIFloatingButtonLabelCreateFabWithLabelView.setPaddingRelative(getPaddingStart(), getPaddingTop(), getPaddingEnd(), getResources().getDimensionPixelSize(R$dimen.coui_floating_button_item_normal_bottom_margin));
            addView(cOUIFloatingButtonLabelCreateFabWithLabelView, iN);
        }
        this.v.add(i2, cOUIFloatingButtonLabelCreateFabWithLabelView);
        A(cOUIFloatingButtonLabelCreateFabWithLabelView, 0, i2, 300, false);
        return cOUIFloatingButtonLabelCreateFabWithLabelView;
    }

    public Collection<COUIFloatingButtonLabel> w(Collection<COUIFloatingButtonItem> collection) {
        ArrayList arrayList = new ArrayList();
        Iterator<COUIFloatingButtonItem> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(s(it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0047  */
    public final void x(MotionEvent motionEvent) {
        ValueAnimator valueAnimator = this.O;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.O.cancel();
        }
        int i2 = this.p;
        if (i2 == 0 || i2 == 1) {
            if (!U((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                this.f1767l.I(false, false, true);
            }
        } else if (i2 != 2) {
            if (i2 != 4) {
                return;
            }
            if (!U((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                this.f1767l.I(false, false, true);
            }
        } else if (U((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
            F();
            this.f1767l.I(false, false, true);
        }
        ValueAnimator valueAnimator2 = this.O;
        if (valueAnimator2 != null) {
            valueAnimator2.start();
        }
    }

    public final void y() {
        c0();
        ValueAnimator valueAnimator = this.O;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.O.cancel();
        }
        int i2 = this.p;
        if (i2 == 0 || i2 == 1) {
            if (Q()) {
                this.f1767l.I(true, true, true);
            }
        } else if (i2 != 2 && i2 != 3 && i2 != 4) {
            return;
        }
        ValueAnimator valueAnimator2 = this.O;
        if (valueAnimator2 != null) {
            valueAnimator2.start();
        }
    }

    public void z() {
        ViewCompat.animate(this.x).cancel();
        E();
        this.x.setVisibility(0);
        this.x.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setInterpolator(V).setDuration(350L).setListener(new g());
    }

    public static class COUIFloatingButtonBehavior extends CoordinatorLayout.Behavior<View> {

        @Nullable
        public Rect i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @Nullable
        public FloatingActionButton.OnVisibilityChangedListener f1769j;
        public boolean k;

        public COUIFloatingButtonBehavior() {
            this.k = true;
        }

        public static boolean isBottomSheet(@NonNull View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
                return ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior() instanceof BottomSheetBehavior;
            }
            return false;
        }

        public final int getMinimumHeightForVisibleOverlappingContent(AppBarLayout appBarLayout) {
            int minimumHeight = ViewCompat.getMinimumHeight(appBarLayout);
            if (minimumHeight != 0) {
                return minimumHeight * 2;
            }
            int childCount = appBarLayout.getChildCount();
            if (childCount >= 1) {
                return ViewCompat.getMinimumHeight(appBarLayout.getChildAt(childCount - 1)) * 2;
            }
            return 0;
        }

        public void hide(View view) {
            if (view instanceof FloatingActionButton) {
                ((FloatingActionButton) view).hide(this.f1769j);
            } else if (view instanceof COUIFloatingButton) {
                ((COUIFloatingButton) view).hide(this.f1769j);
            } else {
                view.setVisibility(4);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void onAttachedToLayoutParams(@NonNull CoordinatorLayout.LayoutParams layoutParams) {
            if (layoutParams.dodgeInsetEdges == 0) {
                layoutParams.dodgeInsetEdges = 80;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                updateFabVisibilityForAppBarLayout(coordinatorLayout, (AppBarLayout) view2, view);
                return false;
            }
            if (!isBottomSheet(view2)) {
                return false;
            }
            updateFabVisibilityForBottomSheet(view2, view);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
            List<View> dependencies = coordinatorLayout.getDependencies(view);
            int size = dependencies.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view2 = dependencies.get(i2);
                if (!(view2 instanceof AppBarLayout)) {
                    if (isBottomSheet(view2) && updateFabVisibilityForBottomSheet(view2, view)) {
                        break;
                    }
                } else {
                    if (updateFabVisibilityForAppBarLayout(coordinatorLayout, (AppBarLayout) view2, view)) {
                        break;
                    }
                }
            }
            coordinatorLayout.onLayoutChild(view, i);
            return true;
        }

        @VisibleForTesting
        public void setInternalAutoHideListener(@Nullable FloatingActionButton.OnVisibilityChangedListener onVisibilityChangedListener) {
            this.f1769j = onVisibilityChangedListener;
        }

        public final boolean shouldUpdateVisibility(View view, View view2) {
            return this.k && ((CoordinatorLayout.LayoutParams) view2.getLayoutParams()).getAnchorId() == view.getId() && view2.getVisibility() == 0;
        }

        public void show(View view) {
            if (view instanceof FloatingActionButton) {
                ((FloatingActionButton) view).show(this.f1769j);
            } else if (view instanceof COUIFloatingButton) {
                view.setVisibility(0);
            } else {
                view.setVisibility(0);
            }
        }

        public final boolean updateFabVisibilityForAppBarLayout(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view) {
            if (!shouldUpdateVisibility(appBarLayout, view)) {
                return false;
            }
            if (this.i == null) {
                this.i = new Rect();
            }
            Rect rect = this.i;
            g0l.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= getMinimumHeightForVisibleOverlappingContent(appBarLayout)) {
                view.setVisibility(8);
                return true;
            }
            view.setVisibility(0);
            return true;
        }

        public final boolean updateFabVisibilityForBottomSheet(View view, View view2) {
            if (!shouldUpdateVisibility(view, view2)) {
                return false;
            }
            if (view.getTop() < (view2.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.LayoutParams) view2.getLayoutParams())).topMargin) {
                hide(view2);
                return true;
            }
            show(view2);
            return true;
        }

        public COUIFloatingButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.FloatingActionButton_Behavior_Layout);
            this.k = typedArrayObtainStyledAttributes.getBoolean(R.styleable.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class ScrollViewBehavior extends COUIFloatingButtonBehavior {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public ValueAnimator f1770l;
        public boolean m;

        public class a extends RecyclerView.OnScrollListener {
            public final /* synthetic */ View a;

            public a(View view) {
                this.a = view;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
                super.onScrollStateChanged(recyclerView, i);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
                super.onScrolled(recyclerView, i, i2);
                View view = this.a;
                if (view instanceof COUIFloatingButton) {
                    ScrollViewBehavior.this.b((COUIFloatingButton) view, i2);
                }
            }
        }

        public ScrollViewBehavior() {
            this.f1770l = new ObjectAnimator();
            this.m = false;
        }

        public final void b(COUIFloatingButton cOUIFloatingButton, int i) {
            if (i <= 10 || cOUIFloatingButton.getVisibility() != 0) {
                if (i < -10) {
                    cOUIFloatingButton.z();
                    return;
                }
                return;
            }
            if (!cOUIFloatingButton.X() || this.f1770l.isRunning()) {
                if (this.f1770l.isRunning()) {
                    return;
                }
                ValueAnimator valueAnimatorD = cOUIFloatingButton.D();
                this.f1770l = valueAnimatorD;
                valueAnimatorD.start();
                return;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            ValueAnimator valueAnimatorD2 = cOUIFloatingButton.D();
            this.f1770l = valueAnimatorD2;
            animatorSet.playTogether(valueAnimatorD2, cOUIFloatingButton.g0(true));
            animatorSet.setDuration(150L);
            cOUIFloatingButton.H(true, 250, true);
            animatorSet.start();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void onNestedPreScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2, int i, int i2, @NonNull int[] iArr, int i3) {
            super.onNestedPreScroll(coordinatorLayout, view, view2, i, i2, iArr, i3);
            if (view instanceof COUIFloatingButton) {
                b((COUIFloatingButton) view, i2);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2, @NonNull View view3, int i, int i2) {
            if (view3 instanceof RecyclerView) {
                RecyclerView recyclerView = (RecyclerView) view3;
                int itemCount = recyclerView.getAdapter().getItemCount();
                if (recyclerView.getChildCount() != 0 && itemCount != 0 && !this.m) {
                    recyclerView.addOnScrollListener(new a(view));
                    this.m = true;
                }
                return false;
            }
            if (view3 instanceof AbsListView) {
                AbsListView absListView = (AbsListView) view3;
                int count = absListView.getCount();
                int childCount = absListView.getChildCount();
                View childAt = absListView.getChildAt(0);
                int top = view3.getTop() - view3.getPaddingTop();
                int bottom = view3.getBottom() - view3.getPaddingBottom();
                AbsListView absListView2 = (AbsListView) view3;
                View childAt2 = absListView2.getChildAt(childCount - 1);
                if (childCount > 0 && count > 0) {
                    if (absListView2.getFirstVisiblePosition() == 0 && childAt.getTop() >= (-top)) {
                        return false;
                    }
                    if (childAt2 != null && absListView2.getLastVisiblePosition() == count - 1 && childAt2.getBottom() <= bottom) {
                        return false;
                    }
                }
            }
            return true;
        }

        public ScrollViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1770l = new ObjectAnimator();
            this.m = false;
        }
    }

    public static class InstanceState implements Parcelable {
        public static final Parcelable.Creator<InstanceState> CREATOR = new a();
        private boolean mCOUIFloatingButtonAnimationIsRun;
        private ArrayList<COUIFloatingButtonItem> mCOUIFloatingButtonItems;
        private boolean mCOUIFloatingButtonMenuIsOpen;
        private ColorStateList mMainCOUIFloatingButtonBackgroundColor;
        private int mShadowColor;
        private boolean mUseReverseAnimationOnClose;

        public class a implements Parcelable.Creator<InstanceState> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public InstanceState createFromParcel(Parcel parcel) {
                return new InstanceState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public InstanceState[] newArray(int i) {
                return new InstanceState[i];
            }
        }

        public InstanceState() {
            this.mCOUIFloatingButtonMenuIsOpen = false;
            this.mCOUIFloatingButtonAnimationIsRun = false;
            this.mMainCOUIFloatingButtonBackgroundColor = ColorStateList.valueOf(Integer.MIN_VALUE);
            this.mUseReverseAnimationOnClose = false;
            this.mCOUIFloatingButtonItems = new ArrayList<>();
            this.mShadowColor = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeByte(this.mCOUIFloatingButtonMenuIsOpen ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.mCOUIFloatingButtonAnimationIsRun ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.mUseReverseAnimationOnClose ? (byte) 1 : (byte) 0);
            parcel.writeInt(this.mShadowColor);
            parcel.writeTypedList(this.mCOUIFloatingButtonItems);
        }

        public InstanceState(Parcel parcel) {
            this.mCOUIFloatingButtonMenuIsOpen = false;
            this.mCOUIFloatingButtonAnimationIsRun = false;
            this.mMainCOUIFloatingButtonBackgroundColor = ColorStateList.valueOf(Integer.MIN_VALUE);
            this.mUseReverseAnimationOnClose = false;
            this.mCOUIFloatingButtonItems = new ArrayList<>();
            this.mShadowColor = -1;
            this.mCOUIFloatingButtonMenuIsOpen = parcel.readByte() != 0;
            this.mCOUIFloatingButtonAnimationIsRun = parcel.readByte() != 0;
            this.mUseReverseAnimationOnClose = parcel.readByte() != 0;
            this.mShadowColor = parcel.readInt();
            this.mCOUIFloatingButtonItems = parcel.createTypedArrayList(COUIFloatingButtonItem.CREATOR);
        }
    }

    public COUIFloatingButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = new RectF();
        this.f1766j = new Rect();
        this.k = new ai2();
        this.p = 0;
        this.q = 0;
        this.r = 1.0f;
        this.s = new InstanceState();
        this.v = new ArrayList();
        this.w = null;
        this.E = new PathInterpolator(0.25f, 0.1f, 0.25f, 1.0f);
        this.F = new hj2();
        this.G = new PathInterpolator(0.25f, 0.1f, 0.25f, 1.0f);
        this.H = new PathInterpolator(0.25f, 0.1f, 0.25f, 1.0f);
        this.I = new PathInterpolator(0.25f, 0.1f, 0.25f, 1.0f);
        this.J = new PathInterpolator(0.25f, 0.1f, 0.25f, 1.0f);
        this.K = true;
        this.L = true;
        this.N = true;
        this.O = null;
        this.R = new c();
        R(context, attributeSet);
    }

    public COUIFloatingButton(Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.i = new RectF();
        this.f1766j = new Rect();
        this.k = new ai2();
        this.p = 0;
        this.q = 0;
        this.r = 1.0f;
        this.s = new InstanceState();
        this.v = new ArrayList();
        this.w = null;
        this.E = new PathInterpolator(0.25f, 0.1f, 0.25f, 1.0f);
        this.F = new hj2();
        this.G = new PathInterpolator(0.25f, 0.1f, 0.25f, 1.0f);
        this.H = new PathInterpolator(0.25f, 0.1f, 0.25f, 1.0f);
        this.I = new PathInterpolator(0.25f, 0.1f, 0.25f, 1.0f);
        this.J = new PathInterpolator(0.25f, 0.1f, 0.25f, 1.0f);
        this.K = true;
        this.L = true;
        this.N = true;
        this.O = null;
        this.R = new c();
        R(context, attributeSet);
    }
}
