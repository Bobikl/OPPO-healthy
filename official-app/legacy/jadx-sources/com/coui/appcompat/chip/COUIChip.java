package com.coui.appcompat.chip;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.widget.ExploreByTouchHelper;
import androidx.dynamicanimation.animation.FloatPropertyCompat;
import com.coui.appcompat.animation.dynamicanimation.COUIDynamicAnimation;
import com.google.android.material.R;
import com.google.android.material.resources.TextAppearance;
import com.oplus.aiunit.vision.bj2;
import com.oplus.aiunit.vision.dk2;
import com.oplus.aiunit.vision.gg2;
import com.oplus.aiunit.vision.ph2;
import com.oplus.smartenginehelper.ParserTag;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import com.support.appcompat.R$string;
import com.support.chip.R$attr;
import com.support.chip.R$style;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class COUIChip extends AppCompatCheckBox implements c.a, com.coui.appcompat.chip.a<COUIChip>, COUIChipGroup.d {
    public static final boolean B;
    public static final int C;
    public static final Rect D;
    public static final int[] E;
    public static final int[] F;
    public COUIChipGroup.d A;
    public final RectF i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Rect f1657j;
    public final dk2 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b f1658l;

    @Nullable
    public CharSequence m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f1659n;
    public float o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;

    @Nullable
    public c v;
    public int w;

    @Nullable
    public View.OnClickListener x;

    @Nullable
    public CompoundButton.OnCheckedChangeListener y;

    @Nullable
    public com.coui.appcompat.chip.a.InterfaceC0198a<COUIChip> z;

    public class a implements COUIChipGroup.d {
        public final COUIChip i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final RectF f1660j = new RectF();
        public final RectF k = new RectF();

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public float f1661l = 0.8f;
        public COUIChipGroup m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public com.coui.appcompat.animation.dynamicanimation.b f1662n;
        public com.coui.appcompat.animation.dynamicanimation.b o;
        public com.coui.appcompat.animation.dynamicanimation.b p;
        public com.coui.appcompat.animation.dynamicanimation.b q;

        /* JADX INFO: renamed from: com.coui.appcompat.chip.COUIChip$a$a, reason: collision with other inner class name */
        public class C0196a extends FloatPropertyCompat<a> {
            public C0196a(String str) {
                super(str);
            }

            @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public float getValue(a aVar) {
                return aVar.j();
            }

            @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void setValue(a aVar, float f) {
                aVar.q(f);
            }
        }

        public class b extends FloatPropertyCompat<a> {
            public b(String str) {
                super(str);
            }

            @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public float getValue(a aVar) {
                return aVar.k();
            }

            @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void setValue(a aVar, float f) {
                aVar.r(f);
            }
        }

        public class c extends FloatPropertyCompat<a> {
            public c(String str) {
                super(str);
            }

            @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public float getValue(a aVar) {
                return aVar.f();
            }

            @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void setValue(a aVar, float f) {
                aVar.o(f);
            }
        }

        public class d extends FloatPropertyCompat<a> {
            public d(String str) {
                super(str);
            }

            @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public float getValue(a aVar) {
                return aVar.g();
            }

            @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void setValue(a aVar, float f) {
                aVar.p(f);
            }
        }

        public a(COUIChip cOUIChip) {
            this.i = cOUIChip;
            l();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void n(COUIDynamicAnimation cOUIDynamicAnimation, boolean z, float f, float f2) {
            COUIChipGroup cOUIChipGroup;
            if (f == 0.0f) {
                COUIChipGroup cOUIChipGroup2 = this.m;
                if (cOUIChipGroup2 != null) {
                    cOUIChipGroup2.M(this.i);
                    return;
                }
                return;
            }
            if (f != 10000.0f || (cOUIChipGroup = this.m) == null) {
                return;
            }
            cOUIChipGroup.N(this.i);
        }

        @Override // com.coui.appcompat.chip.COUIChipGroup.d
        public void a(boolean z, boolean z2) {
            if (COUIChip.this.t != z) {
                COUIChip.this.t = z;
                if (!z2) {
                    this.i.setAlpha(COUIChip.this.t ? 1.0f : 0.0f);
                    this.i.setScaleX(1.0f);
                    this.i.setScaleY(1.0f);
                    return;
                }
                this.i.setAlpha(COUIChip.this.t ? 0.0f : 1.0f);
                this.p.x(COUIChip.this.t ? 10000.0f : 0.0f);
                if (COUIChip.this.t && this.k.isEmpty()) {
                    COUIChip cOUIChip = this.i;
                    cOUIChip.setPivotX(cOUIChip.getWidth() / 2.0f);
                    COUIChip cOUIChip2 = this.i;
                    cOUIChip2.setPivotY(cOUIChip2.getHeight() / 2.0f);
                    this.i.setScaleX(0.8f);
                    this.i.setScaleY(0.8f);
                    this.q.x(10000.0f);
                }
            }
        }

        @Override // com.coui.appcompat.chip.COUIChipGroup.d
        public void b() {
            this.o.c();
            this.f1662n.c();
            this.p.c();
            this.i.setTranslationX(0.0f);
            this.i.setTranslationY(0.0f);
            this.i.setAlpha(1.0f);
            this.f1661l = 0.8f;
            this.k.setEmpty();
            this.f1660j.setEmpty();
            this.m = null;
        }

        @Override // com.coui.appcompat.chip.COUIChipGroup.d
        public boolean c() {
            return this.o.i() || this.f1662n.i() || this.p.i();
        }

        @Override // com.coui.appcompat.chip.COUIChipGroup.d
        public void e(COUIChipGroup cOUIChipGroup) {
            if (this.m == null) {
                this.m = cOUIChipGroup;
            }
        }

        public float f() {
            return this.i.getAlpha() * 10000.0f;
        }

        public float g() {
            return this.f1661l * 10000.0f;
        }

        @Override // com.coui.appcompat.chip.COUIChipGroup.d
        public void h() {
            if (this.f1662n.y()) {
                this.f1662n.F();
            }
            if (this.o.y()) {
                this.o.F();
            }
            if (this.p.y()) {
                this.p.F();
            }
        }

        @Override // com.coui.appcompat.chip.COUIChipGroup.d
        public void i(int i, int i2, int i3, int i4, boolean z) {
            s(i, i2, i3, i4, z);
        }

        public float j() {
            return this.f1660j.left;
        }

        public float k() {
            return this.f1660j.top;
        }

        public final void l() {
            C0196a c0196a = new C0196a("ChipGroupAnimatorImpl");
            com.coui.appcompat.animation.dynamicanimation.c cVar = new com.coui.appcompat.animation.dynamicanimation.c();
            cVar.l(0.3f);
            cVar.i(0.0f);
            com.coui.appcompat.animation.dynamicanimation.b bVar = new com.coui.appcompat.animation.dynamicanimation.b(this, c0196a);
            this.o = bVar;
            bVar.E(cVar);
            b bVar2 = new b("ChipGroupAnimatorImpl");
            com.coui.appcompat.animation.dynamicanimation.c cVar2 = new com.coui.appcompat.animation.dynamicanimation.c();
            cVar2.l(0.3f);
            cVar2.i(0.0f);
            com.coui.appcompat.animation.dynamicanimation.b bVar3 = new com.coui.appcompat.animation.dynamicanimation.b(this, bVar2);
            this.f1662n = bVar3;
            bVar3.E(cVar2);
            c cVar3 = new c("ChipGroupAnimatorImpl");
            com.coui.appcompat.animation.dynamicanimation.c cVar4 = new com.coui.appcompat.animation.dynamicanimation.c();
            cVar4.l(0.2f);
            cVar4.i(0.0f);
            com.coui.appcompat.animation.dynamicanimation.b bVar4 = new com.coui.appcompat.animation.dynamicanimation.b(this, cVar3);
            this.p = bVar4;
            bVar4.E(cVar4);
            this.p.a(new COUIDynamicAnimation.q() { // from class: com.oplus.aiunit.vision.ng2
                @Override // com.coui.appcompat.animation.dynamicanimation.COUIDynamicAnimation.q
                public final void onAnimationEnd(COUIDynamicAnimation cOUIDynamicAnimation, boolean z, float f, float f2) {
                    this.a.n(cOUIDynamicAnimation, z, f, f2);
                }
            });
            d dVar = new d("ChipGroupAnimatorImpl");
            com.coui.appcompat.animation.dynamicanimation.c cVar5 = new com.coui.appcompat.animation.dynamicanimation.c();
            cVar5.l(0.2f);
            cVar5.i(0.0f);
            com.coui.appcompat.animation.dynamicanimation.b bVar5 = new com.coui.appcompat.animation.dynamicanimation.b(this, dVar);
            this.q = bVar5;
            bVar5.E(cVar5);
        }

        public final boolean m() {
            return ViewCompat.getLayoutDirection(this.i) == 1;
        }

        public void o(float f) {
            COUIChipGroup cOUIChipGroup;
            this.i.setAlpha(f / 10000.0f);
            if (this.i.getParent() != null || (cOUIChipGroup = this.m) == null) {
                return;
            }
            cOUIChipGroup.invalidate();
        }

        public void p(float f) {
            COUIChipGroup cOUIChipGroup;
            this.f1661l = f / 10000.0f;
            COUIChip cOUIChip = this.i;
            cOUIChip.setPivotX(cOUIChip.getWidth() / 2.0f);
            COUIChip cOUIChip2 = this.i;
            cOUIChip2.setPivotY(cOUIChip2.getHeight() / 2.0f);
            this.i.setScaleX(this.f1661l);
            this.i.setScaleY(this.f1661l);
            if (this.i.getParent() != null || (cOUIChipGroup = this.m) == null) {
                return;
            }
            cOUIChipGroup.invalidate();
        }

        public void q(float f) {
            RectF rectF = this.f1660j;
            rectF.offsetTo(f, rectF.top);
            this.i.setX(this.f1660j.left);
        }

        public void r(float f) {
            RectF rectF = this.f1660j;
            rectF.offsetTo(rectF.left, f);
            this.i.setY(this.f1660j.top);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0050  */
        /* JADX WARN: Code duplicated, block: B:25:0x0056  */
        /* JADX WARN: Code duplicated, block: B:27:0x005f  */
        /* JADX WARN: Code duplicated, block: B:29:0x0067  */
        public final void s(int i, int i2, int i3, int i4, boolean z) {
            float f;
            float f2;
            RectF rectF = this.k;
            float f3 = i;
            if (rectF.left == f3 && rectF.top == i2 && rectF.right == i3 && rectF.bottom == i4) {
                return;
            }
            if (z) {
                if (rectF.isEmpty() || !COUIChip.this.t) {
                    this.f1660j.set(f3, i2, i3, i4);
                    this.i.setX(this.f1660j.left);
                    this.i.setY(this.f1660j.top);
                } else {
                    if (!m() && this.k.left != f3) {
                        float f4 = this.f1660j.left;
                        if (f4 != f3) {
                            this.i.setX(f4);
                            this.o.x(f3);
                        } else if (m()) {
                            f = i3;
                            if (this.k.right != f) {
                                f2 = this.f1660j.right;
                                if (f2 != f) {
                                    float f5 = i3 - i;
                                    this.o.r(f2 - f5);
                                    this.i.setX(this.f1660j.right - f5);
                                    this.o.x(f3);
                                }
                            }
                        }
                    } else if (m()) {
                        f = i3;
                        if (this.k.right != f) {
                            f2 = this.f1660j.right;
                            if (f2 != f) {
                                float f6 = i3 - i;
                                this.o.r(f2 - f6);
                                this.i.setX(this.f1660j.right - f6);
                                this.o.x(f3);
                            }
                        }
                    }
                    float f7 = i2;
                    if (this.k.top != f7 && this.f1660j.top != f7) {
                        this.f1662n.x(f7);
                        this.i.setY(this.f1660j.top);
                    }
                }
                if (m()) {
                    RectF rectF2 = this.f1660j;
                    rectF2.left = rectF2.right - (i3 - i);
                } else {
                    RectF rectF3 = this.f1660j;
                    rectF3.right = rectF3.left + (i3 - i);
                }
            } else {
                this.f1660j.set(f3, i2, i3, i4);
            }
            this.k.set(f3, i2, i3, i4);
        }
    }

    public class b extends ExploreByTouchHelper {
        public b(COUIChip cOUIChip) {
            super(cOUIChip);
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public int getVirtualViewAt(float f, float f2) {
            return (COUIChip.this.hasCloseIcon() && COUIChip.this.getCloseIconTouchBounds().contains(f, f2)) ? 1 : 0;
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public void getVisibleVirtualViews(@NonNull List<Integer> list) {
            list.add(0);
            if (COUIChip.this.hasCloseIcon() && COUIChip.this.isCloseIconVisible() && COUIChip.this.x != null) {
                list.add(1);
            }
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public boolean onPerformActionForVirtualView(int i, int i2, Bundle bundle) {
            if (i2 != 16) {
                return false;
            }
            if (i == 0) {
                return COUIChip.this.performClick();
            }
            if (i == 1) {
                return COUIChip.this.performCloseIconClick();
            }
            return false;
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public void onPopulateNodeForHost(@NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            accessibilityNodeInfoCompat.setCheckable(COUIChip.this.isCheckable());
            accessibilityNodeInfoCompat.setClickable(COUIChip.this.isClickable());
            CharSequence text = COUIChip.this.getText();
            accessibilityNodeInfoCompat.setClassName(COUIChip.this.getAccessibilityClassName());
            accessibilityNodeInfoCompat.setText(text);
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        @SuppressLint({"PrivateResource"})
        public void onPopulateNodeForVirtualView(int i, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            if (i != 1) {
                accessibilityNodeInfoCompat.setContentDescription("");
                accessibilityNodeInfoCompat.setBoundsInParent(COUIChip.D);
                return;
            }
            CharSequence closeIconContentDescription = COUIChip.this.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                accessibilityNodeInfoCompat.setContentDescription(closeIconContentDescription);
            } else {
                CharSequence text = COUIChip.this.getText();
                Context context = COUIChip.this.getContext();
                int i2 = R.string.mtrl_chip_close_icon_content_description;
                Object[] objArr = new Object[1];
                objArr[0] = TextUtils.isEmpty(text) ? "" : text;
                accessibilityNodeInfoCompat.setContentDescription(context.getString(i2, objArr).trim());
            }
            accessibilityNodeInfoCompat.setBoundsInParent(COUIChip.this.getCloseIconTouchBoundsInt());
            accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK);
            accessibilityNodeInfoCompat.setEnabled(COUIChip.this.isEnabled());
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public void onVirtualViewKeyboardFocusChanged(int i, boolean z) {
            if (i == 1) {
                COUIChip.this.s = z;
                COUIChip.this.refreshDrawableState();
            }
        }
    }

    static {
        B = bj2.LOG_DEBUG || bj2.e("COUIChip", 3);
        C = R$style.Widget_COUI_Chip;
        D = new Rect();
        E = new int[]{16842913};
        F = new int[]{android.R.attr.state_checkable};
    }

    public COUIChip(@NonNull Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public RectF getCloseIconTouchBounds() {
        c cVar;
        this.i.setEmpty();
        if (hasCloseIcon() && this.x != null && (cVar = this.v) != null) {
            cVar.n0(this.i);
        }
        return this.i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.f1657j.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.f1657j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SensorsDataInstrumented
    public /* synthetic */ void lambda$new$0(CompoundButton compoundButton, boolean z) {
        com.coui.appcompat.chip.a.InterfaceC0198a<COUIChip> interfaceC0198a = this.z;
        if (interfaceC0198a != null) {
            interfaceC0198a.onCheckedChanged(this, z);
        }
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.y;
        if (onCheckedChangeListener != null) {
            onCheckedChangeListener.onCheckedChanged(compoundButton, z);
        }
        SensorsDataAutoTrackHelper.trackViewOnClick(compoundButton);
    }

    private void setCloseIconHovered(boolean z) {
        if (this.r != z) {
            this.r = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.q != z) {
            this.q = z;
            refreshDrawableState();
        }
    }

    @Override // com.coui.appcompat.chip.COUIChipGroup.d
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void a(boolean z, boolean z2) {
        COUIChipGroup.d dVar = this.A;
        if (dVar != null) {
            dVar.a(z, z2);
        } else {
            this.t = z;
        }
    }

    @Override // com.coui.appcompat.chip.COUIChipGroup.d
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void b() {
        COUIChipGroup.d dVar = this.A;
        if (dVar != null) {
            dVar.b();
        }
    }

    @Override // com.coui.appcompat.chip.COUIChipGroup.d
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean c() {
        COUIChipGroup.d dVar = this.A;
        if (dVar != null) {
            return dVar.c();
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    @NonNull
    public final int[] createCloseIconDrawableState() {
        ?? IsEnabled = isEnabled();
        int i = IsEnabled;
        if (this.s) {
            i = IsEnabled + 1;
        }
        int i2 = i;
        if (this.r) {
            i2 = i + 1;
        }
        int i3 = i2;
        if (this.q) {
            i3 = i2 + 1;
        }
        int i4 = i3;
        if (isChecked()) {
            i4 = i3 + 1;
        }
        int[] iArr = new int[i4];
        int i5 = 0;
        if (isEnabled()) {
            iArr[0] = 16842910;
            i5 = 1;
        }
        if (this.s) {
            iArr[i5] = 16842908;
            i5++;
        }
        if (this.r) {
            iArr[i5] = 16843623;
            i5++;
        }
        if (this.q) {
            iArr[i5] = 16842919;
            i5++;
        }
        if (isChecked()) {
            iArr[i5] = 16842913;
        }
        return iArr;
    }

    @Override // com.coui.appcompat.chip.c.a
    public void d(Typeface typeface) {
        setTypeface(typeface);
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(@NonNull MotionEvent motionEvent) {
        if (this.u) {
            return this.f1658l.dispatchHoverEvent(motionEvent) || super.dispatchHoverEvent(motionEvent);
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.u) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (!this.f1658l.dispatchKeyEvent(keyEvent) || this.f1658l.getKeyboardFocusedVirtualViewId() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        c cVar = this.v;
        if ((cVar == null || !cVar.J0()) ? false : this.v.q1(createCloseIconDrawableState())) {
            invalidate();
        }
    }

    @Override // com.coui.appcompat.chip.COUIChipGroup.d
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void e(COUIChipGroup cOUIChipGroup) {
        if (this.A == null) {
            this.A = new a(this);
        }
        this.A.e(cOUIChipGroup);
    }

    @Override // com.coui.appcompat.chip.c.a
    public void f(float f, float f2) {
        this.f1659n = f;
        this.o = f2;
    }

    @Override // com.coui.appcompat.chip.c.a
    public void g(int i) {
        setTextColor(i);
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    @NonNull
    public CharSequence getAccessibilityClassName() {
        if (TextUtils.isEmpty(this.m)) {
            return (isCheckable() || isClickable()) ? "android.widget.Button" : AndroidComposeViewAccessibilityDelegateCompat.ClassName;
        }
        return this.m;
    }

    public Drawable getBackgroundDrawable() {
        return this.v;
    }

    @ColorInt
    public int getCheckedBackgroundColor() {
        c cVar = this.v;
        if (cVar != null) {
            return cVar.T();
        }
        return 0;
    }

    @ColorInt
    public int getCheckedChipIconTint() {
        c cVar = this.v;
        if (cVar != null) {
            return cVar.U();
        }
        return 0;
    }

    @ColorInt
    public int getCheckedDisabledBackgroundColor() {
        c cVar = this.v;
        if (cVar != null) {
            return cVar.V();
        }
        return 0;
    }

    @ColorInt
    public int getCheckedDisabledChipIconTint() {
        c cVar = this.v;
        if (cVar != null) {
            return cVar.W();
        }
        return 0;
    }

    @ColorInt
    public int getCheckedDisabledTextColor() {
        c cVar = this.v;
        if (cVar != null) {
            return cVar.X();
        }
        return 0;
    }

    @Nullable
    @SuppressLint({"RestrictedApi"})
    public TextAppearance getCheckedTextAppearance() {
        c cVar = this.v;
        if (cVar != null) {
            return cVar.Y();
        }
        return null;
    }

    @ColorInt
    public int getCheckedTextColor() {
        c cVar = this.v;
        if (cVar != null) {
            return cVar.Z();
        }
        return 0;
    }

    public float getChipCornerRadius() {
        c cVar = this.v;
        if (cVar != null) {
            return cVar.a0();
        }
        return -1.0f;
    }

    public c getChipDrawable() {
        return this.v;
    }

    public float getChipEndPadding() {
        c cVar = this.v;
        if (cVar != null) {
            return cVar.g0();
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        c cVar = this.v;
        if (cVar != null) {
            return cVar.b0();
        }
        return null;
    }

    public float getChipIconEndPadding() {
        c cVar = this.v;
        if (cVar != null) {
            return cVar.c0();
        }
        return 0.0f;
    }

    public float getChipIconSize() {
        c cVar = this.v;
        if (cVar != null) {
            return cVar.d0();
        }
        return 0.0f;
    }

    public float getChipIconStartPadding() {
        c cVar = this.v;
        if (cVar != null) {
            return cVar.e0();
        }
        return 0.0f;
    }

    public float getChipMinHeight() {
        c cVar = this.v;
        if (cVar != null) {
            return cVar.f0();
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        c cVar = this.v;
        if (cVar != null) {
            return cVar.g0();
        }
        return 0.0f;
    }

    public Drawable getCloseIcon() {
        c cVar = this.v;
        if (cVar != null) {
            return cVar.h0();
        }
        return null;
    }

    @Nullable
    public CharSequence getCloseIconContentDescription() {
        c cVar = this.v;
        if (cVar != null) {
            return cVar.i0();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        c cVar = this.v;
        if (cVar != null) {
            return cVar.j0();
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        c cVar = this.v;
        if (cVar != null) {
            return cVar.k0();
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        c cVar = this.v;
        if (cVar != null) {
            return cVar.l0();
        }
        return 0.0f;
    }

    @Override // android.widget.TextView
    @Nullable
    public TextUtils.TruncateAt getEllipsize() {
        c cVar = this.v;
        if (cVar != null) {
            return cVar.r0();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(@NonNull Rect rect) {
        if (this.u && (this.f1658l.getKeyboardFocusedVirtualViewId() == 1 || this.f1658l.getAccessibilityFocusedVirtualViewId() == 1)) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    @Nullable
    @SuppressLint({"RestrictedApi"})
    public TextAppearance getTextAppearance() {
        c cVar = this.v;
        if (cVar != null) {
            return cVar.x0();
        }
        return null;
    }

    public float getTextEndPadding() {
        c cVar = this.v;
        if (cVar != null) {
            return cVar.y0();
        }
        return 0.0f;
    }

    @Px
    public int getTextMaxWidth() {
        c cVar = this.v;
        if (cVar != null) {
            return cVar.z0();
        }
        Log.w("COUIChip", "Chip drawable not set!");
        return 0;
    }

    public float getTextStartPadding() {
        c cVar = this.v;
        if (cVar != null) {
            return cVar.A0();
        }
        return 0.0f;
    }

    @ColorInt
    public int getUncheckedBackgroundColor() {
        c cVar = this.v;
        if (cVar != null) {
            return cVar.C0();
        }
        return 0;
    }

    @ColorInt
    public int getUncheckedChipIconTint() {
        c cVar = this.v;
        if (cVar != null) {
            return cVar.D0();
        }
        return 0;
    }

    @ColorInt
    public int getUncheckedDisabledBackgroundColor() {
        c cVar = this.v;
        if (cVar != null) {
            return cVar.E0();
        }
        return 0;
    }

    @ColorInt
    public int getUncheckedDisabledChipIconTint() {
        c cVar = this.v;
        if (cVar != null) {
            return cVar.F0();
        }
        return 0;
    }

    @ColorInt
    public int getUncheckedDisabledTextColor() {
        c cVar = this.v;
        if (cVar != null) {
            return cVar.G0();
        }
        return 0;
    }

    @ColorInt
    public int getUncheckedTextColor() {
        c cVar = this.v;
        if (cVar != null) {
            return cVar.H0();
        }
        return 0;
    }

    @Override // com.coui.appcompat.chip.COUIChipGroup.d
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void h() {
        COUIChipGroup.d dVar = this.A;
        if (dVar != null) {
            dVar.h();
        }
    }

    public final boolean hasCloseIcon() {
        c cVar = this.v;
        return (cVar == null || cVar.h0() == null) ? false : true;
    }

    @Override // com.coui.appcompat.chip.COUIChipGroup.d
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void i(int i, int i2, int i3, int i4, boolean z) {
        COUIChipGroup.d dVar = this.A;
        if (dVar != null) {
            dVar.i(i, i2, i3, i4, z);
        }
    }

    public boolean isCheckable() {
        c cVar = this.v;
        return cVar != null && cVar.I0();
    }

    public boolean isCloseIconVisible() {
        c cVar = this.v;
        return cVar != null && cVar.K0();
    }

    @Override // com.coui.appcompat.chip.c.a
    public void onChipDrawableSizeChange() {
        updatePaddingInternal();
        requestLayout();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, E);
        }
        if (isCheckable()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, F);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        canvas.translate(this.f1659n, this.o);
        super.onDraw(canvas);
        canvas.translate(-this.f1659n, -this.o);
    }

    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (this.u) {
            this.f1658l.onFocusChanged(z, i, rect);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(@NonNull MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(isCheckable());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof COUIChipGroup) {
            COUIChipGroup cOUIChipGroup = (COUIChipGroup) getParent();
            AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo).setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(cOUIChipGroup.v(this), 1, cOUIChipGroup.E() ? cOUIChipGroup.y(this) : -1, 1, false, isChecked()));
            if (cOUIChipGroup.F() && isChecked()) {
                accessibilityNodeInfo.setClickable(false);
                accessibilityNodeInfo.removeAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK);
            }
            if (Build.VERSION.SDK_INT >= 30) {
                if (cOUIChipGroup.F()) {
                    accessibilityNodeInfo.setStateDescription(isChecked() ? getContext().getResources().getString(R$string.coui_accessibility_chosen) : getContext().getResources().getString(R$string.coui_accessibility_unchosen));
                } else {
                    accessibilityNodeInfo.setStateDescription(isChecked() ? getContext().getResources().getString(R$string.coui_accessibility_selected) : getContext().getResources().getString(R$string.coui_accessibility_unselected));
                }
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        c cVar = this.v;
        if (cVar != null) {
            i = View.MeasureSpec.makeMeasureSpec(cVar.getIntrinsicWidth(), 1073741824);
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    @Nullable
    @TargetApi(24)
    public PointerIcon onResolvePointerIcon(@NonNull MotionEvent motionEvent, int i) {
        if (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            return PointerIcon.getSystemIcon(getContext(), 1002);
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.w != i) {
            this.w = i;
            updatePaddingInternal();
        }
    }

    @Override // android.widget.TextView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zU;
        if (!isEnabled()) {
            return super.onTouchEvent(motionEvent);
        }
        boolean zContains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        int action = motionEvent.getAction();
        if (action == 0) {
            zU = u(zContains);
        } else if (action == 1) {
            zU = w();
        } else if (action != 2) {
            if (action == 3) {
                t();
            }
            zU = false;
        } else {
            zU = v(zContains);
        }
        return zU || super.onTouchEvent(motionEvent);
    }

    @CallSuper
    public boolean performCloseIconClick() {
        boolean z = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.x;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z = true;
        }
        if (this.u) {
            this.f1658l.sendEventForVirtualView(1, 1);
        }
        return z;
    }

    public final void s(@NonNull c cVar) {
        cVar.u1(this);
    }

    public void setAccessibilityClassName(@Nullable CharSequence charSequence) {
        this.m = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable != getBackgroundDrawable()) {
            Log.w("COUIChip", "Do not set the background; COUIChip manages its own background drawable.");
        } else {
            super.setBackground(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.w("COUIChip", "Do not set the background color; COUIChip manages its own background drawable.");
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != getBackgroundDrawable()) {
            Log.w("COUIChip", "Do not set the background drawable; COUIChip manages its own background drawable.");
        } else {
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundResource(int i) {
        Log.w("COUIChip", "Do not set the background resource; COUIChip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
        Log.w("COUIChip", "Do not set the background tint list; COUIChip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        Log.w("COUIChip", "Do not set the background tint mode; COUIChip manages its own background drawable.");
    }

    public void setCheckable(boolean z) {
        c cVar = this.v;
        if (cVar != null) {
            cVar.U0(z);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void setChecked(boolean z) {
        c cVar = this.v;
        if (cVar == null) {
            this.p = z;
        } else if (cVar.I0()) {
            super.setChecked(z);
        }
    }

    public void setCheckedBackgroundColor(@ColorInt int i) {
        c cVar = this.v;
        if (cVar != null) {
            cVar.V0(i);
        }
    }

    public void setCheckedChipIconTint(@ColorInt int i) {
        c cVar = this.v;
        if (cVar != null) {
            cVar.W0(i);
        }
    }

    public void setCheckedDisabledBackgroundColor(@ColorInt int i) {
        c cVar = this.v;
        if (cVar != null) {
            cVar.X0(i);
        }
    }

    public void setCheckedDisabledChipIconTint(@ColorInt int i) {
        c cVar = this.v;
        if (cVar != null) {
            cVar.Y0(i);
        }
    }

    public void setCheckedDisabledTextColor(@ColorInt int i) {
        c cVar = this.v;
        if (cVar != null) {
            cVar.Z0(i);
        }
    }

    @SuppressLint({"RestrictedApi"})
    public void setCheckedTextAppearance(@Nullable TextAppearance textAppearance) {
        c cVar = this.v;
        if (cVar != null) {
            cVar.a1(textAppearance);
        }
    }

    public void setCheckedTextColor(@ColorInt int i) {
        c cVar = this.v;
        if (cVar != null) {
            cVar.b1(i);
        }
    }

    public void setChipCornerRadius(float f) {
        c cVar = this.v;
        if (cVar != null) {
            cVar.c1(f);
        }
    }

    public final void setChipDrawable(@NonNull c cVar) {
        c cVar2 = this.v;
        if (cVar2 != cVar) {
            x(cVar2);
            this.v = cVar;
            cVar.x1(false);
            s(this.v);
            updateBackgroundDrawable();
        }
    }

    public void setChipEndPadding(float f) {
        c cVar = this.v;
        if (cVar != null) {
            cVar.d1(f);
        }
    }

    public void setChipIcon(@Nullable Drawable drawable) {
        c cVar = this.v;
        if (cVar != null) {
            cVar.e1(drawable);
        }
    }

    public void setChipIconEndPadding(float f) {
        c cVar = this.v;
        if (cVar != null) {
            cVar.f1(f);
        }
    }

    public void setChipIconSize(float f) {
        c cVar = this.v;
        if (cVar != null) {
            cVar.g1(f);
        }
    }

    public void setChipIconStartPadding(float f) {
        c cVar = this.v;
        if (cVar != null) {
            cVar.h1(f);
        }
    }

    public void setChipIconVisible(boolean z) {
        c cVar = this.v;
        if (cVar != null) {
            cVar.i1(z);
        }
    }

    public void setChipMinHeight(float f) {
        c cVar = this.v;
        if (cVar != null) {
            cVar.j1(f);
        }
        setMinimumHeight((int) f);
    }

    public void setChipStartPadding(float f) {
        c cVar = this.v;
        if (cVar != null) {
            cVar.k1(f);
        }
    }

    public void setCloseIcon(@Nullable Drawable drawable) {
        c cVar = this.v;
        if (cVar != null) {
            cVar.l1(drawable);
        }
        updateAccessibilityDelegate();
    }

    public void setCloseIconContentDescription(@Nullable CharSequence charSequence) {
        c cVar = this.v;
        if (cVar != null) {
            cVar.m1(charSequence);
        }
    }

    public void setCloseIconEndPadding(float f) {
        c cVar = this.v;
        if (cVar != null) {
            cVar.n1(f);
        }
    }

    public void setCloseIconSize(float f) {
        c cVar = this.v;
        if (cVar != null) {
            cVar.o1(f);
        }
    }

    public void setCloseIconStartPadding(float f) {
        c cVar = this.v;
        if (cVar != null) {
            cVar.p1(f);
        }
    }

    public void setCloseIconVisible(boolean z) {
        c cVar = this.v;
        if (cVar != null) {
            cVar.s1(z);
        }
        updateAccessibilityDelegate();
        requestLayout();
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public void setCompoundDrawables(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public void setCompoundDrawablesRelative(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public final void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.v == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        c cVar = this.v;
        if (cVar != null) {
            cVar.v1(truncateAt);
        }
    }

    @Override // android.widget.TextView
    public final void setGravity(int i) {
        if (i != 8388627) {
            Log.w("COUIChip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    @Override // com.coui.appcompat.chip.a
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setInternalOnCheckedChangeListener(@Nullable com.coui.appcompat.chip.a.InterfaceC0198a<COUIChip> interfaceC0198a) {
        this.z = interfaceC0198a;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.v == null) {
            return;
        }
        super.setLayoutDirection(i);
    }

    @Override // android.widget.TextView
    public final void setLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("COUIChip does not support multi-line text");
        }
        super.setLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("COUIChip does not support multi-line text");
        }
        super.setMaxLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(@Px int i) {
        super.setMaxWidth(i);
        c cVar = this.v;
        if (cVar != null) {
            cVar.w1(i);
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("COUIChip does not support multi-line text");
        }
        super.setMinLines(i);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(@Nullable CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.y = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.x = onClickListener;
        updateAccessibilityDelegate();
    }

    public void setShowRedDot(boolean z) {
        c cVar = this.v;
        if (cVar != null) {
            cVar.y1(z);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
        if (!z) {
            throw new UnsupportedOperationException("COUIChip does not support multi-line text");
        }
        super.setSingleLine(z);
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        c cVar = this.v;
        if (cVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(cVar.M1() ? null : charSequence, bufferType);
        c cVar2 = this.v;
        if (cVar2 != null) {
            cVar2.z1(charSequence);
        }
    }

    @SuppressLint({"RestrictedApi"})
    public void setTextAppearance(@Nullable TextAppearance textAppearance) {
        c cVar = this.v;
        if (cVar != null) {
            cVar.A1(textAppearance);
        }
    }

    public void setTextEndPadding(float f) {
        c cVar = this.v;
        if (cVar != null) {
            cVar.B1(f);
        }
    }

    public void setTextMaxWidth(@Px int i) {
        c cVar = this.v;
        if (cVar != null) {
            cVar.C1(i);
        } else {
            Log.w("COUIChip", "Chip drawable not set!");
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        c cVar = this.v;
        if (cVar != null) {
            cVar.D1(getTextSize());
        }
    }

    public void setTextStartPadding(float f) {
        c cVar = this.v;
        if (cVar != null) {
            cVar.E1(f);
        }
    }

    public void setUncheckedBackgroundColor(@ColorInt int i) {
        c cVar = this.v;
        if (cVar != null) {
            cVar.G1(i);
        }
    }

    public void setUncheckedChipIconTint(@ColorInt int i) {
        c cVar = this.v;
        if (cVar != null) {
            cVar.H1(i);
        }
    }

    public void setUncheckedDisabledBackgroundColor(@ColorInt int i) {
        c cVar = this.v;
        if (cVar != null) {
            cVar.I1(i);
        }
    }

    public void setUncheckedDisabledChipIconTint(@ColorInt int i) {
        c cVar = this.v;
        if (cVar != null) {
            cVar.J1(i);
        }
    }

    public void setUncheckedDisabledTextColor(@ColorInt int i) {
        c cVar = this.v;
        if (cVar != null) {
            cVar.K1(i);
        }
    }

    public void setUncheckedTextColor(@ColorInt int i) {
        c cVar = this.v;
        if (cVar != null) {
            cVar.L1(i);
        }
    }

    public final void t() {
        if (this.q) {
            setCloseIconPressed(false);
            c cVar = this.v;
            if (cVar != null) {
                cVar.r1(false);
                return;
            }
            return;
        }
        this.k.e(false);
        c cVar2 = this.v;
        if (cVar2 != null) {
            cVar2.F1(false);
        }
    }

    public final boolean u(boolean z) {
        if (z) {
            setCloseIconPressed(true);
            c cVar = this.v;
            if (cVar != null) {
                cVar.r1(true);
            }
            return true;
        }
        this.k.e(true);
        c cVar2 = this.v;
        if (cVar2 == null) {
            return false;
        }
        cVar2.F1(true);
        return false;
    }

    public final void updateAccessibilityDelegate() {
        if (hasCloseIcon() && isCloseIconVisible() && this.x != null) {
            ViewCompat.setAccessibilityDelegate(this, this.f1658l);
            this.u = true;
        } else {
            ViewCompat.setAccessibilityDelegate(this, null);
            this.u = false;
        }
    }

    public final void updateBackgroundDrawable() {
        ViewCompat.setBackground(this, getBackgroundDrawable());
        updatePaddingInternal();
    }

    public final void updatePaddingInternal() {
        int iV0;
        int iT0;
        if (this.v != null) {
            if (!TextUtils.isEmpty(getText()) || this.v.O1()) {
                this.v.getIntrinsicWidth();
                iV0 = (int) ((this.v.O1() || this.v.H()) ? this.v.v0() : this.v.u0());
                iT0 = (int) ((this.v.O1() || this.v.H()) ? this.v.t0() : this.v.s0());
            } else {
                iV0 = 0;
                iT0 = 0;
            }
            ViewCompat.setPaddingRelative(this, iV0, getPaddingTop(), iT0, getPaddingBottom());
        }
    }

    public final boolean v(boolean z) {
        if (!this.q) {
            return false;
        }
        if (z) {
            return true;
        }
        setCloseIconPressed(false);
        c cVar = this.v;
        if (cVar == null) {
            return true;
        }
        cVar.r1(false);
        return true;
    }

    public final void validateAttributes(@Nullable AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
            Log.w("COUIChip", "Do not set the background; Chip manages its own background drawable.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", ParserTag.TAG_DRAWABLE_START) != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", ParserTag.TAG_DRAWABLE_END) != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", ParserTag.TAG_SINGLE_LINE, true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", ParserTag.TAG_MIN_LINES, 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", ParserTag.TAG_MAX_LINES, 1) != 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
            Log.w("COUIChip", "Chip text must be vertically center and start aligned");
        }
    }

    public final boolean w() {
        if (!this.q) {
            this.k.e(false);
            c cVar = this.v;
            if (cVar != null) {
                cVar.F1(false);
            }
            return false;
        }
        performCloseIconClick();
        setCloseIconPressed(false);
        c cVar2 = this.v;
        if (cVar2 == null) {
            return true;
        }
        cVar2.r1(false);
        return true;
    }

    public final void x(@Nullable c cVar) {
        if (cVar != null) {
            cVar.u1(null);
        }
    }

    public COUIChip(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.couiChipStyle);
    }

    public COUIChip(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, C);
    }

    public COUIChip(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.i = new RectF();
        this.f1657j = new Rect();
        this.f1659n = 0.0f;
        this.o = 0.0f;
        this.t = false;
        this.u = true;
        this.A = null;
        validateAttributes(attributeSet);
        c cVarI = c.I(context, attributeSet, i, i2);
        setChipDrawable(cVarI);
        this.f1658l = new b(this);
        updateAccessibilityDelegate();
        this.k = new dk2(this);
        setDefaultFocusHighlightEnabled(false);
        ph2.c(this, false);
        setChecked(this.p);
        setText(cVarI.w0());
        setEllipsize(cVarI.r0());
        c cVar = this.v;
        if (cVar != null && !cVar.M1()) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        updatePaddingInternal();
        this.w = ViewCompat.getLayoutDirection(this);
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.oplus.aiunit.vision.mg2
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.i.lambda$new$0(compoundButton, z);
            }
        });
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setTextSize(float f) {
        super.setTextSize(f);
        gg2.c(this, 4);
        c cVar = this.v;
        if (cVar != null) {
            cVar.D1(getTextSize());
        }
    }
}
