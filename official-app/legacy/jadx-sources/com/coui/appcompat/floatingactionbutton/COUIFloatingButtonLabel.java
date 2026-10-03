package com.coui.appcompat.floatingactionbutton;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.GravityCompat;
import com.coui.appcompat.grid.COUIResponsiveUtils;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.oplus.aiunit.vision.ai2;
import com.oplus.aiunit.vision.bi2;
import com.oplus.aiunit.vision.byg;
import com.oplus.aiunit.vision.im2;
import com.oplus.aiunit.vision.lh2;
import com.oplus.aiunit.vision.wh2;
import com.oplus.aiunit.vision.ze2;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import com.support.appcompat.R$attr;
import com.support.appcompat.R$dimen;
import com.support.floatingactionbutton.R$color;
import com.support.floatingactionbutton.R$id;
import com.support.floatingactionbutton.R$layout;
import com.support.floatingactionbutton.R$styleable;

/* JADX INFO: loaded from: classes13.dex */
public class COUIFloatingButtonLabel extends LinearLayout {
    public static final String w = "COUIFloatingButtonLabel";
    public final ai2 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f1779j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1780l;
    public float m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ValueAnimator f1781n;
    public TextView o;
    public ShapeableImageView p;
    public CardView q;
    public boolean r;

    @Nullable
    public COUIFloatingButtonItem s;

    @Nullable
    public COUIFloatingButton.l t;
    public float u;
    public int v;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        @SensorsDataInstrumented
        public void onClick(View view) {
            COUIFloatingButtonLabel.this.n();
            SensorsDataAutoTrackHelper.trackViewOnClick(view);
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        @SensorsDataInstrumented
        public void onClick(View view) {
            COUIFloatingButtonItem floatingButtonItem = COUIFloatingButtonLabel.this.getFloatingButtonItem();
            if (COUIFloatingButtonLabel.this.t != null && floatingButtonItem != null) {
                COUIFloatingButtonLabel.this.t.a(floatingButtonItem);
            }
            SensorsDataAutoTrackHelper.trackViewOnClick(view);
        }
    }

    public class c extends ViewOutlineProvider {
        public c() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setOval(0, 0, view.getWidth(), view.getHeight());
        }
    }

    public class d extends ViewOutlineProvider {
        public d() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), lh2.c(COUIFloatingButtonLabel.this.getContext(), R$attr.couiRoundCornerXS));
        }
    }

    public class e implements View.OnTouchListener {
        public e() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action == 0) {
                COUIFloatingButtonLabel.this.i.g(COUIFloatingButtonLabel.this.p);
                COUIFloatingButtonLabel.this.k();
                return false;
            }
            if (action != 1 && action != 3) {
                return false;
            }
            COUIFloatingButtonLabel.this.j();
            return false;
        }
    }

    public class f implements ValueAnimator.AnimatorUpdateListener {
        public f() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            COUIFloatingButtonLabel.this.m = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (COUIFloatingButtonLabel.this.m >= 0.98f) {
                COUIFloatingButtonLabel.this.m = 0.98f;
            }
        }
    }

    public class g extends ze2 {
        public g() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            COUIFloatingButtonLabel.this.f1781n.start();
        }
    }

    public COUIFloatingButtonLabel(Context context) {
        super(context);
        this.i = new ai2();
        this.f1779j = true;
        this.k = 0;
        this.v = -1;
        o(context, null);
    }

    private void setFabBackgroundColor(ColorStateList colorStateList) {
        this.p.setBackgroundTintList(colorStateList);
    }

    private void setFabIcon(@Nullable Drawable drawable) {
        this.p.setImageDrawable(drawable);
    }

    private void setLabel(@Nullable CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            setLabelEnabled(false);
        } else {
            this.o.setText(charSequence);
            setLabelEnabled(getOrientation() == 0);
        }
    }

    private void setLabelBackgroundColor(ColorStateList colorStateList) {
        if (colorStateList == ColorStateList.valueOf(Integer.MIN_VALUE)) {
            this.q.setCardBackgroundColor(0);
            this.u = this.q.getElevation();
            this.q.setElevation(0.0f);
        } else {
            this.q.setCardBackgroundColor(colorStateList);
            float f2 = this.u;
            if (f2 != 0.0f) {
                this.q.setElevation(f2);
                this.u = 0.0f;
            }
        }
    }

    private void setLabelEnabled(boolean z) {
        this.r = z;
        this.q.setVisibility(z ? 0 : 8);
    }

    private void setLabelTextColor(ColorStateList colorStateList) {
        this.o.setTextColor(colorStateList);
    }

    private void setShadowColor(int i) {
        this.v = i;
        ShapeableImageView shapeableImageView = this.p;
        Resources resources = getResources();
        int i2 = R$dimen.support_shadow_size_level_three;
        int dimensionPixelOffset = resources.getDimensionPixelOffset(i2);
        Resources resources2 = getResources();
        int i3 = R$color.coui_floating_button_elevation_color;
        byg.d(shapeableImageView, dimensionPixelOffset, resources2.getColor(i3), this.v);
        byg.d(this.q, getResources().getDimensionPixelOffset(i2), getResources().getColor(i3), this.v);
    }

    public ImageView getChildFloatingButton() {
        return this.p;
    }

    public COUIFloatingButtonItem getFloatingButtonItem() {
        COUIFloatingButtonItem cOUIFloatingButtonItem = this.s;
        if (cOUIFloatingButtonItem != null) {
            return cOUIFloatingButtonItem;
        }
        throw new IllegalStateException("SpeedDialActionItem not set yet!");
    }

    public COUIFloatingButtonItem.b getFloatingButtonItemBuilder() {
        return new COUIFloatingButtonItem.b(getFloatingButtonItem());
    }

    public CardView getFloatingButtonLabelBackground() {
        return this.q;
    }

    public TextView getFloatingButtonLabelText() {
        return this.o;
    }

    public Bundle getSeamlessViewBundle() {
        return this.i.f();
    }

    public final void j() {
        clearAnimation();
        l();
        ShapeableImageView shapeableImageView = this.p;
        shapeableImageView.startAnimation(wh2.c(shapeableImageView, this.m));
    }

    public final void k() {
        q();
        clearAnimation();
        l();
        bi2 bi2VarA = wh2.a(this.p);
        ValueAnimator valueAnimatorB = wh2.b();
        this.f1781n = valueAnimatorB;
        valueAnimatorB.addUpdateListener(new f());
        bi2VarA.setAnimationListener(new g());
        this.p.startAnimation(bi2VarA);
    }

    public final void l() {
        ValueAnimator valueAnimator = this.f1781n;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return;
        }
        this.f1781n.cancel();
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void m() {
        this.p.setOnTouchListener(new e());
    }

    public final void n() {
        COUIFloatingButtonItem floatingButtonItem = getFloatingButtonItem();
        COUIFloatingButton.l lVar = this.t;
        if (lVar == null || floatingButtonItem == null) {
            return;
        }
        lVar.a(floatingButtonItem);
    }

    public final void o(Context context, @Nullable AttributeSet attributeSet) {
        View viewInflate = View.inflate(context, R$layout.coui_floating_button_item_label, this);
        this.p = (ShapeableImageView) viewInflate.findViewById(R$id.coui_floating_button_child_fab);
        this.o = (TextView) viewInflate.findViewById(R$id.coui_floating_button_label);
        this.q = (CardView) viewInflate.findViewById(R$id.coui_floating_button_label_container);
        ShapeableImageView shapeableImageView = this.p;
        Resources resources = getResources();
        int i = R$dimen.support_shadow_size_level_three;
        int dimensionPixelOffset = resources.getDimensionPixelOffset(i);
        Resources resources2 = getResources();
        int i2 = R$color.coui_floating_button_elevation_color;
        byg.d(shapeableImageView, dimensionPixelOffset, resources2.getColor(i2), this.v);
        this.p.setOutlineProvider(new c());
        this.p.setShapeAppearanceModel(ShapeAppearanceModel.builder().setAllCornerSizes(ShapeAppearanceModel.PILL).build());
        byg.d(this.q, getResources().getDimensionPixelOffset(i), getResources().getColor(i2), this.v);
        this.q.setOutlineProvider(new d());
        setOrientation(0);
        setClipChildren(false);
        setClipToPadding(false);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.COUIFloatingButtonLabel, 0, 0);
        try {
            try {
                this.f1779j = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUIFloatingButtonLabel_fabLabelNeedVibrate, true);
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.COUIFloatingButtonLabel_srcCompat, Integer.MIN_VALUE);
                if (resourceId == Integer.MIN_VALUE) {
                    resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.COUIFloatingButtonLabel_android_src, Integer.MIN_VALUE);
                }
                COUIFloatingButtonItem.b bVar = new COUIFloatingButtonItem.b(getId(), resourceId);
                bVar.l(typedArrayObtainStyledAttributes.getString(R$styleable.COUIFloatingButtonLabel_fabLabel));
                bVar.k(ColorStateList.valueOf(typedArrayObtainStyledAttributes.getColor(R$styleable.COUIFloatingButtonLabel_fabBackgroundColor, lh2.b(getContext(), R$attr.couiColorPrimary, 0))));
                bVar.n(ColorStateList.valueOf(typedArrayObtainStyledAttributes.getColor(R$styleable.COUIFloatingButtonLabel_fabLabelColor, Integer.MIN_VALUE)));
                bVar.m(ColorStateList.valueOf(typedArrayObtainStyledAttributes.getColor(R$styleable.COUIFloatingButtonLabel_fabLabelBackgroundColor, Integer.MIN_VALUE)));
                setFloatingButtonItem(bVar.j());
            } catch (Exception e2) {
                Log.e(w, "Failure setting FabWithLabelView icon" + e2.getMessage());
            }
            typedArrayObtainStyledAttributes.recycle();
            setClipChildren(false);
            this.p.setImportantForAccessibility(2);
            this.o.setImportantForAccessibility(2);
            this.q.setImportantForAccessibility(2);
            setFocusable(true);
            setImportantForAccessibility(1);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.k <= 0) {
            Context contextCreateConfigurationContext = getContext().createConfigurationContext(configuration);
            if (COUIResponsiveUtils.isSmallScreenDp(configuration.screenWidthDp)) {
                this.f1780l = contextCreateConfigurationContext.getResources().getDimensionPixelOffset(com.support.floatingactionbutton.R$dimen.coui_floating_button_normal_size);
            } else {
                this.f1780l = contextCreateConfigurationContext.getResources().getDimensionPixelOffset(com.support.floatingactionbutton.R$dimen.coui_floating_button_large_size);
            }
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.p.getLayoutParams();
            int i = this.f1780l;
            layoutParams.width = i;
            layoutParams.height = i;
            this.p.setLayoutParams(layoutParams);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ai2 ai2Var = this.i;
        if (ai2Var != null) {
            ai2Var.e();
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK);
        accessibilityNodeInfo.setClassName(Button.class.getName());
        String string = this.o.getText().toString();
        CharSequence contentDescription = this.p.getContentDescription();
        if (TextUtils.isEmpty(string)) {
            string = !TextUtils.isEmpty(contentDescription) ? contentDescription.toString() : null;
        }
        accessibilityNodeInfo.setContentDescription(string);
    }

    public boolean p() {
        return this.r;
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i, @Nullable Bundle bundle) {
        if (i != 16) {
            return super.performAccessibilityAction(i, bundle);
        }
        n();
        return true;
    }

    public final void q() {
        if (this.f1779j) {
            performHapticFeedback(302);
        }
    }

    public final void r() {
        LinearLayout.LayoutParams layoutParams;
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(com.support.floatingactionbutton.R$dimen.coui_floating_button_fab_normal_size);
        getContext().getResources().getDimensionPixelSize(com.support.floatingactionbutton.R$dimen.coui_floating_button_fab_side_margin);
        getContext().getResources().getDimensionPixelSize(com.support.floatingactionbutton.R$dimen.coui_floating_button_item_normal_bottom_margin);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.p.getLayoutParams();
        if (getOrientation() == 0) {
            layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.gravity = GravityCompat.END;
        } else {
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(dimensionPixelSize, -2);
            layoutParams3.gravity = 16;
            layoutParams2.setMargins(0, 0, 0, 0);
            layoutParams = layoutParams3;
        }
        setLayoutParams(layoutParams);
        this.p.setLayoutParams(layoutParams2);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.o.setEnabled(z);
        this.p.setEnabled(z);
        this.q.setEnabled(z);
    }

    public void setFloatingButtonItem(COUIFloatingButtonItem cOUIFloatingButtonItem) {
        this.s = cOUIFloatingButtonItem;
        setId(cOUIFloatingButtonItem.getFloatingButtonItemLocation());
        setLabel(cOUIFloatingButtonItem.getLabel(getContext()));
        setFabIcon(cOUIFloatingButtonItem.getFabImageDrawable(getContext()));
        ColorStateList fabBackgroundColor = cOUIFloatingButtonItem.getFabBackgroundColor();
        int color = getContext().getResources().getColor(com.support.appcompat.R$color.couiGreenTintControlNormal);
        int iB = lh2.b(getContext(), R$attr.couiColorPrimary, color);
        if (fabBackgroundColor == ColorStateList.valueOf(Integer.MIN_VALUE)) {
            fabBackgroundColor = im2.a(iB, color);
        } else {
            setShadowColor(fabBackgroundColor.getDefaultColor());
        }
        setFabBackgroundColor(fabBackgroundColor);
        ColorStateList labelColor = cOUIFloatingButtonItem.getLabelColor();
        if (labelColor == ColorStateList.valueOf(Integer.MIN_VALUE)) {
            labelColor = ResourcesCompat.getColorStateList(getResources(), R$color.coui_floating_button_label_text_color, getContext().getTheme());
        }
        setLabelTextColor(labelColor);
        ColorStateList labelBackgroundColor = cOUIFloatingButtonItem.getLabelBackgroundColor();
        if (labelBackgroundColor == ColorStateList.valueOf(Integer.MIN_VALUE)) {
            labelBackgroundColor = im2.a(iB, color);
        }
        setLabelBackgroundColor(labelBackgroundColor);
        if (cOUIFloatingButtonItem.isCOUIFloatingButtonExpandEnable()) {
            m();
        }
        getChildFloatingButton().setOnClickListener(new a());
    }

    public void setMainButtonSize(int i) {
        this.k = i;
        if (i > 0) {
            this.f1780l = i;
        } else {
            this.f1780l = getResources().getDimensionPixelSize(com.support.floatingactionbutton.R$dimen.coui_floating_button_size);
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.p.getLayoutParams();
        int i2 = this.f1780l;
        layoutParams.width = i2;
        layoutParams.height = i2;
        this.p.setLayoutParams(layoutParams);
    }

    public void setOnActionSelectedListener(@Nullable COUIFloatingButton.l lVar) {
        this.t = lVar;
        if (lVar != null) {
            getFloatingButtonLabelBackground().setOnClickListener(new b());
        } else {
            getChildFloatingButton().setOnClickListener(null);
            getFloatingButtonLabelBackground().setOnClickListener(null);
        }
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        super.setOrientation(i);
        r();
        if (i == 1) {
            setLabelEnabled(false);
        } else {
            setLabel(this.o.getText().toString());
        }
    }

    @Override // android.view.View
    @SuppressLint({"RestrictedApi"})
    public void setVisibility(int i) {
        super.setVisibility(i);
        getChildFloatingButton().setVisibility(i);
        if (p()) {
            getFloatingButtonLabelBackground().setVisibility(i);
        }
    }

    public COUIFloatingButtonLabel(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = new ai2();
        this.f1779j = true;
        this.k = 0;
        this.v = -1;
        o(context, attributeSet);
    }

    public COUIFloatingButtonLabel(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = new ai2();
        this.f1779j = true;
        this.k = 0;
        this.v = -1;
        o(context, attributeSet);
    }
}
