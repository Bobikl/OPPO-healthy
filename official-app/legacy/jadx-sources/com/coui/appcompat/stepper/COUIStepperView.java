package com.coui.appcompat.stepper;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.coui.appcompat.stepper.COUIStepperView;
import com.oplus.aiunit.vision.c9b;
import com.oplus.aiunit.vision.cjd;
import com.oplus.aiunit.vision.ej2;
import com.oplus.aiunit.vision.hm2;
import com.oplus.aiunit.vision.ldd;
import com.oplus.aiunit.vision.lh2;
import com.oplus.aiunit.vision.mm2;
import com.oplus.aiunit.vision.sy9;
import com.support.appcompat.R$attr;
import com.support.stepper.R$dimen;
import com.support.stepper.R$id;
import com.support.stepper.R$layout;
import com.support.stepper.R$style;
import com.support.stepper.R$styleable;
import java.util.Observable;
import java.util.Observer;

/* JADX INFO: loaded from: classes13.dex */
public class COUIStepperView extends ConstraintLayout implements sy9, Observer {
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Context f2098j;
    public ldd k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ImageView f2099l;
    public ImageView m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public TextView f2100n;
    public cjd o;
    public int p;
    public final Runnable q;
    public final Runnable r;
    public c9b s;
    public c9b t;
    public int u;

    public COUIStepperView(@NonNull Context context) {
        this(context, null);
    }

    private int getNumForMaxWidth() {
        int i = 1;
        float f = 0.0f;
        for (int i2 = 0; i2 < 10; i2++) {
            float fMeasureText = this.f2100n.getPaint().measureText(String.valueOf(i2));
            if (fMeasureText > f) {
                i = i2;
                f = fMeasureText;
            }
        }
        return i;
    }

    public static /* synthetic */ boolean l(hm2 hm2Var, View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            hm2Var.i(true);
        }
        if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
            hm2Var.i(false);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0() {
        performHapticFeedback(308, 0);
        o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m() {
        performHapticFeedback(308, 0);
        n();
    }

    public int getCurStep() {
        return this.k.c();
    }

    public int getMaximum() {
        return this.k.a();
    }

    public int getMinimum() {
        return this.k.b();
    }

    public int getUnit() {
        return this.p;
    }

    public final void h() {
        i(this.m, this.t);
        i(this.f2099l, this.s);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void i(ImageView imageView, c9b c9bVar) {
        float dimension = getContext().getResources().getDimension(R$dimen.stepper_button_size);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        RectF rectF = new RectF(0.0f, 0.0f, dimension, dimension);
        shapeDrawable.getPaint().setColor(lh2.a(getContext(), R$attr.couiColorPressBackground));
        int i = (int) dimension;
        shapeDrawable.setBounds(0, 0, i, i);
        ej2 ej2Var = new ej2(getContext(), 0);
        float f = dimension / 2.0f;
        ej2Var.E(rectF, f, f);
        mm2 mm2Var = new mm2(getContext());
        mm2Var.x(rectF, f, f);
        final hm2 hm2Var = new hm2(new Drawable[]{shapeDrawable, ej2Var, mm2Var});
        hm2Var.c(imageView, 2);
        imageView.setBackground(hm2Var);
        c9bVar.setOnTouchListener(new View.OnTouchListener() { // from class: com.oplus.aiunit.vision.lm2
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return COUIStepperView.l(hm2Var, view, motionEvent);
            }
        });
    }

    public void j(@Nullable AttributeSet attributeSet, int i) {
        int i2 = R$style.COUIStepperViewDefStyle;
        this.u = i2;
        LayoutInflater.from(getContext()).inflate(R$layout.coui_stepper_view, this);
        this.f2099l = (ImageView) findViewById(R$id.plus);
        this.m = (ImageView) findViewById(R$id.minus);
        this.f2100n = (TextView) findViewById(R$id.indicator);
        this.s = new c9b(this.f2099l, this.q);
        this.t = new c9b(this.m, this.r);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.COUIStepperView, i, i2);
        int i3 = typedArrayObtainStyledAttributes.getInt(R$styleable.COUIStepperView_couiMaximum, 9999);
        int i4 = typedArrayObtainStyledAttributes.getInt(R$styleable.COUIStepperView_couiMinimum, -999);
        int i5 = typedArrayObtainStyledAttributes.getInt(R$styleable.COUIStepperView_couiDefStep, 0);
        this.p = typedArrayObtainStyledAttributes.getInt(R$styleable.COUIStepperView_couiUnit, 1);
        k(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        ldd lddVar = new ldd();
        this.k = lddVar;
        lddVar.addObserver(this);
        setMaximum(i3);
        setMinimum(i4);
        setCurStep(i5);
    }

    public final void k(TypedArray typedArray) {
        try {
            int resourceId = typedArray.getResourceId(R$styleable.COUIStepperView_couiStepperTextStyle, 0);
            int resourceId2 = typedArray.getResourceId(R$styleable.COUIStepperView_couiStepperPlusImage, 0);
            int resourceId3 = typedArray.getResourceId(R$styleable.COUIStepperView_couiStepperMinusImage, 0);
            if (resourceId != 0) {
                this.f2100n.setTextAppearance(resourceId);
            }
            if (resourceId2 != 0) {
                this.f2099l.setImageDrawable(ContextCompat.getDrawable(getContext(), resourceId2));
            }
            if (resourceId3 != 0) {
                this.m.setImageDrawable(ContextCompat.getDrawable(getContext(), resourceId3));
            }
            h();
        } catch (Resources.NotFoundException e2) {
            Log.e("COUIStepperView", e2.getMessage());
        }
    }

    public void n() {
        ldd lddVar = this.k;
        lddVar.f(lddVar.c() - getUnit());
    }

    public void o() {
        ldd lddVar = this.k;
        lddVar.f(lddVar.c() + getUnit());
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int numForMaxWidth = getNumForMaxWidth();
        String[] strArrSplit = String.valueOf(getMaximum()).split("");
        StringBuilder sb = new StringBuilder();
        for (int i3 = 0; i3 < strArrSplit.length; i3++) {
            sb.append(numForMaxWidth);
        }
        this.f2100n.setWidth(Math.round(this.f2100n.getPaint().measureText(sb.toString())));
        super.onMeasure(i, i2);
    }

    public void release() {
        this.s.g();
        this.t.g();
        this.k.deleteObservers();
        this.o = null;
    }

    public void setCurStep(int i) {
        this.k.f(i);
    }

    public void setMaximum(int i) {
        this.k.d(i);
    }

    public void setMinimum(int i) {
        this.k.e(i);
    }

    @Override // com.oplus.aiunit.vision.sy9
    public void setOnStepChangeListener(cjd cjdVar) {
        this.o = cjdVar;
    }

    public void setUnit(int i) {
        this.p = i;
    }

    @Override // java.util.Observer
    public void update(Observable observable, Object obj) {
        int iC = ((ldd) observable).c();
        int iIntValue = ((Integer) obj).intValue();
        this.f2099l.setEnabled(iC < getMaximum() && isEnabled());
        this.m.setEnabled(iC > getMinimum() && isEnabled());
        this.f2100n.setText(String.valueOf(iC));
        cjd cjdVar = this.o;
        if (cjdVar != null) {
            cjdVar.b(iC, iIntValue);
        }
    }

    public COUIStepperView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, com.support.stepper.R$attr.couiStepperViewStyle);
    }

    public COUIStepperView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = "COUIStepperView";
        this.q = new Runnable() { // from class: com.oplus.aiunit.vision.jm2
            @Override // java.lang.Runnable
            public final void run() {
                this.i.lambda$new$0();
            }
        };
        this.r = new Runnable() { // from class: com.oplus.aiunit.vision.km2
            @Override // java.lang.Runnable
            public final void run() {
                this.i.m();
            }
        };
        this.f2098j = context;
        j(attributeSet, i);
    }
}
