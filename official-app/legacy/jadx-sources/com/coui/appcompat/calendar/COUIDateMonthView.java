package com.coui.appcompat.calendar;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.format.DateFormat;
import android.text.format.DateUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.PathInterpolator;
import androidx.annotation.NonNull;
import androidx.appcompat.R;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.widget.ExploreByTouchHelper;
import com.oplus.aiunit.vision.alf;
import com.oplus.aiunit.vision.gg2;
import com.oplus.aiunit.vision.hj2;
import com.oplus.aiunit.vision.lh2;
import com.oplus.aiunit.vision.lnb;
import com.oplus.aiunit.vision.sh2;
import com.oplus.aiunit.vision.vj2;
import com.support.appcompat.R$attr;
import com.support.calendar.R$dimen;
import java.math.BigInteger;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes13.dex */
public class COUIDateMonthView extends View implements View.OnFocusChangeListener {
    public static final int MAX_YEAR = 2100;
    public static final int MIN_YEAR = 1900;
    public static final PathInterpolator q0 = new hj2();
    public static final PathInterpolator r0 = new sh2();
    public final int A;
    public final int B;
    public String C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public float K;
    public float L;
    public float M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;
    public int a0;
    public int b0;
    public int c0;
    public d d0;
    public ColorStateList e0;
    public int f0;
    public int g0;
    public boolean h0;
    public final TextPaint i;
    public Context i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextPaint f1631j;
    public int j0;
    public final TextPaint k;
    public boolean k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Paint f1632l;
    public boolean l0;
    public final Paint m;
    public ValueAnimator m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Paint f1633n;
    public ValueAnimator n0;
    public final Paint o;
    public boolean o0;
    public final String[] p;
    public Paint p0;
    public final Calendar q;
    public final Locale r;
    public final c s;
    public final NumberFormat t;
    public final int u;
    public final int v;
    public final int w;
    public final int x;
    public final int y;
    public final int z;

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float animatedFraction = valueAnimator.getAnimatedFraction();
            COUIDateMonthView.this.f1632l.setAlpha((int) (255.0f * animatedFraction));
            COUIDateMonthView cOUIDateMonthView = COUIDateMonthView.this;
            cOUIDateMonthView.M = (cOUIDateMonthView.K * 0.8f) + (0.2f * animatedFraction * COUIDateMonthView.this.K);
            COUIDateMonthView.this.invalidate();
            if (animatedFraction == 1.0f) {
                COUIDateMonthView.this.l0 = false;
            }
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            COUIDateMonthView.this.m.setAlpha((int) ((1.0f - valueAnimator.getAnimatedFraction()) * 255.0f));
        }
    }

    public class c extends ExploreByTouchHelper {
        public final Rect i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Calendar f1634j;

        public c(View view) {
            super(view);
            this.i = new Rect();
            this.f1634j = Calendar.getInstance();
        }

        public final CharSequence getDayDescription(int i) {
            if (!COUIDateMonthView.this.F(i)) {
                return "";
            }
            this.f1634j.set(COUIDateMonthView.this.E, COUIDateMonthView.this.D, i);
            return DateFormat.format(isChinese() ? "MMMM dd 日 EE" : "EE dd MMMM", this.f1634j.getTimeInMillis());
        }

        public final CharSequence getDayText(int i) {
            if (COUIDateMonthView.this.F(i)) {
                return COUIDateMonthView.this.t.format(i);
            }
            return null;
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public int getVirtualViewAt(float f, float f2) {
            int iZ = COUIDateMonthView.this.z((int) (f + 0.5f), (int) (f2 + 0.5f));
            if (iZ != Integer.MIN_VALUE) {
                return iZ;
            }
            return Integer.MIN_VALUE;
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public void getVisibleVirtualViews(List<Integer> list) {
            for (int i = 1; i <= COUIDateMonthView.this.W; i++) {
                list.add(Integer.valueOf(i));
            }
        }

        public final boolean isChinese() {
            String country = COUIDateMonthView.this.i0.getResources().getConfiguration().locale.getCountry();
            if (country != null) {
                return country.equalsIgnoreCase("CN") || country.equalsIgnoreCase(alf.TW) || country.equalsIgnoreCase("HK");
            }
            return false;
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public boolean onPerformActionForVirtualView(int i, int i2, Bundle bundle) {
            if (i2 != 16) {
                return false;
            }
            return COUIDateMonthView.this.J(i);
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public void onPopulateEventForVirtualView(int i, AccessibilityEvent accessibilityEvent) {
            accessibilityEvent.setContentDescription(getDayDescription(i));
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public void onPopulateNodeForVirtualView(int i, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            if (!COUIDateMonthView.this.y(i, this.i)) {
                this.i.setEmpty();
                accessibilityNodeInfoCompat.setContentDescription("");
                accessibilityNodeInfoCompat.setBoundsInParent(this.i);
                accessibilityNodeInfoCompat.setVisibleToUser(false);
                return;
            }
            accessibilityNodeInfoCompat.setText(getDayText(i));
            accessibilityNodeInfoCompat.setContentDescription(getDayDescription(i));
            accessibilityNodeInfoCompat.setBoundsInParent(this.i);
            boolean zC = COUIDateMonthView.this.C(i);
            if (zC) {
                accessibilityNodeInfoCompat.addAction(16);
            }
            accessibilityNodeInfoCompat.setEnabled(zC);
            if (i == COUIDateMonthView.this.Q) {
                accessibilityNodeInfoCompat.setChecked(true);
            }
        }
    }

    public interface d {
        void a(COUIDateMonthView cOUIDateMonthView, Calendar calendar);
    }

    public COUIDateMonthView(Context context) {
        this(context, null);
    }

    public static int A(int i, int i2) {
        switch (i) {
            case 0:
            case 2:
            case 4:
            case 6:
            case 7:
            case 9:
            case 11:
                return 31;
            case 1:
                return i2 % 4 == 0 ? 29 : 28;
            case 3:
            case 5:
            case 8:
            case 10:
                return 30;
            default:
                throw new IllegalArgumentException("Invalid Month");
        }
    }

    public static boolean G(int i) {
        return i >= 1 && i <= 7;
    }

    public static boolean H(int i) {
        return i >= 0 && i <= 11;
    }

    @SuppressLint({"WrongConstant"})
    public final void B(Resources resources) {
        int dimensionPixelSize = resources.getDimensionPixelSize(R$dimen.calendar_picker_month_text_size);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R$dimen.calendar_picker_day_of_week_text_size);
        int dimensionPixelSize3 = resources.getDimensionPixelSize(R$dimen.calendar_picker_day_text_size);
        int iF = (int) gg2.f(dimensionPixelSize, getContext().getResources().getConfiguration().fontScale);
        int iF2 = (int) gg2.f(dimensionPixelSize2, getContext().getResources().getConfiguration().fontScale);
        int iF3 = (int) gg2.f(dimensionPixelSize3, getContext().getResources().getConfiguration().fontScale);
        this.i.setAntiAlias(true);
        this.i.setTextSize(iF);
        this.i.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
        this.i.setTextAlign(Paint.Align.CENTER);
        this.i.setStyle(Paint.Style.FILL);
        this.f1631j.setAntiAlias(true);
        this.f1631j.setTextSize(iF2);
        this.f1631j.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
        this.f1631j.setTextAlign(Paint.Align.CENTER);
        this.f1631j.setStyle(Paint.Style.FILL);
        this.f1632l.setAntiAlias(true);
        this.f1632l.setStyle(Paint.Style.FILL);
        this.m.setAntiAlias(true);
        this.m.setStyle(Paint.Style.FILL);
        this.f1633n.setAntiAlias(true);
        this.f1633n.setStyle(Paint.Style.FILL);
        this.o.setAntiAlias(true);
        this.o.setStyle(Paint.Style.FILL);
        this.k.setAntiAlias(true);
        this.k.setTextSize(iF3);
        this.k.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
        this.k.setTextAlign(Paint.Align.CENTER);
        this.k.setStyle(Paint.Style.FILL);
        Paint paint = new Paint();
        this.p0 = paint;
        paint.setAntiAlias(true);
        this.p0.setStyle(Paint.Style.STROKE);
        this.p0.setStrokeWidth(this.L);
        q();
    }

    public final boolean C(int i) {
        return i >= this.b0 && i <= this.c0;
    }

    public final boolean D(int i) {
        return ((w() + i) - 1) % 7 == 0;
    }

    public final boolean E(int i) {
        return (w() + i) % 7 == 0;
    }

    public final boolean F(int i) {
        return i >= 1 && i <= this.W;
    }

    public final boolean I(boolean z) {
        int i;
        int i2;
        t();
        if (z) {
            if (!E(this.f0) && (i2 = this.f0) < this.W) {
                this.f0 = i2 + 1;
                return true;
            }
        } else if (!D(this.f0) && (i = this.f0) > 1) {
            this.f0 = i - 1;
            return true;
        }
        return false;
    }

    public final boolean J(int i) {
        if (i == this.Q) {
            return false;
        }
        this.l0 = true;
        if (this.d0 != null) {
            Calendar calendar = Calendar.getInstance();
            if (i <= 0) {
                int i2 = this.D;
                if (i2 > 0) {
                    int i3 = this.E;
                    calendar.set(i3, i2 - 1, A(i2 - 1, i3) + i);
                } else {
                    int i4 = this.E;
                    calendar.set(i4 - 1, 11, A(i2, i4 - 1) + i);
                }
            } else if (i > A(this.D, this.E)) {
                int i5 = this.D;
                if (i5 < 11) {
                    int i6 = this.E;
                    calendar.set(i6, i5 + 1, i - A(i5, i6));
                } else {
                    int i7 = this.E;
                    calendar.set(i7 + 1, 0, i - A(i5, i7));
                }
            } else {
                calendar.set(this.E, this.D, i);
            }
            if (calendar.get(1) < 1900 || calendar.get(1) > 2100) {
                return false;
            }
            this.d0.a(this, calendar);
        }
        this.s.sendEventForVirtualView(i, 1);
        return true;
    }

    public final boolean K(int i, Calendar calendar) {
        return this.E == calendar.get(1) && this.D == calendar.get(2) && i == calendar.get(5);
    }

    public void L(int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        this.Q = i;
        if (H(i2)) {
            this.D = i2;
        }
        this.E = i3;
        this.k0 = z;
        this.q.set(2, this.D);
        this.q.set(1, this.E);
        this.q.set(5, 1);
        this.a0 = this.q.get(7);
        if (G(i4)) {
            this.V = i4;
        } else {
            this.V = this.q.getFirstDayOfWeek();
        }
        Calendar calendar = Calendar.getInstance();
        this.U = Integer.MIN_VALUE;
        this.W = A(this.D, this.E);
        int i7 = 0;
        while (true) {
            int i8 = this.W;
            if (i7 >= i8) {
                int iA = vj2.a(i5, 1, i8);
                this.b0 = iA;
                this.c0 = vj2.a(i6, iA, this.W);
                P();
                O();
                this.s.invalidateRoot();
                invalidate();
                return;
            }
            i7++;
            if (K(i7, calendar)) {
                this.U = i7;
            }
        }
    }

    public void M(int i, int i2) {
        int i3 = this.Q;
        if (i3 == Integer.MIN_VALUE || i3 == i) {
            return;
        }
        this.S = i;
        this.T = i2;
    }

    public void N(int i, int i2, int i3) {
        this.Q = i;
        this.R = i2;
        this.k0 = this.E == i3;
        this.s.invalidateRoot();
        this.m0.start();
        this.n0.start();
    }

    public final void O() {
        ArrayList arrayList = new ArrayList();
        for (int i = 1; i < 8; i++) {
            arrayList.add(DateUtils.getDayOfWeekString(i, 50));
        }
        for (int i2 = 0; i2 < 7; i2++) {
            this.p[i2] = (String) arrayList.get(((this.V + i2) - 1) % 7);
        }
    }

    public final void P() {
        this.C = new SimpleDateFormat(DateFormat.getBestDateTimePattern(this.r, "MMMMy"), this.r).format(this.q.getTime());
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return this.s.dispatchHoverEvent(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    public int getCellWidth() {
        return this.J;
    }

    @Override // android.view.View
    public void getFocusedRect(Rect rect) {
        int i = this.f0;
        if (i > 0) {
            y(i, rect);
        } else {
            super.getFocusedRect(rect);
        }
    }

    public int getMonthHeight() {
        return this.F;
    }

    public int getMonthWidth() {
        return this.G;
    }

    public String getMonthYearLabel() {
        return this.C;
    }

    public long getTimeMillis() {
        return this.q.getTimeInMillis();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        canvas.translate(paddingLeft, paddingTop);
        s(canvas);
        r(canvas);
        canvas.translate(-paddingLeft, -paddingTop);
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z) {
        if (z || this.h0) {
            return;
        }
        this.g0 = this.f0;
        this.f0 = Integer.MIN_VALUE;
        invalidate();
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        if (z) {
            int iW = w();
            if (i == 17) {
                this.f0 = Math.min(this.W, ((v(rect) + 1) * 7) - iW);
            } else if (i == 33) {
                int iU = u(rect);
                int i2 = this.W;
                int i3 = (iU - iW) + (((iW + i2) / 7) * 7) + 1;
                if (i3 > i2) {
                    i3 -= 7;
                }
                this.f0 = i3;
            } else if (i == 66) {
                int iV = v(rect);
                this.f0 = iV != 0 ? 1 + ((iV * 7) - iW) : 1;
            } else if (i == 130) {
                int iU2 = (u(rect) - iW) + 1;
                if (iU2 < 1) {
                    iU2 += 7;
                }
                this.f0 = iU2;
            }
            t();
            invalidate();
        }
        super.onFocusChanged(z, i, rect);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:26:0x005a  */
    /* JADX WARN: Code duplicated, block: B:28:0x0060  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        int i2;
        int keyCode = keyEvent.getKeyCode();
        boolean zI = false;
        if (keyCode == 61) {
            int i3 = keyEvent.hasNoModifiers() ? 2 : keyEvent.hasModifiers(1) ? 1 : 0;
            if (i3 != 0) {
                ViewParent parent = getParent();
                View viewFocusSearch = this;
                do {
                    viewFocusSearch = viewFocusSearch.focusSearch(i3);
                    if (viewFocusSearch == null || viewFocusSearch == this) {
                        break;
                    }
                } while (viewFocusSearch.getParent() == parent);
                if (viewFocusSearch != null) {
                    viewFocusSearch.requestFocus();
                    return true;
                }
            }
        } else if (keyCode != 66) {
            switch (keyCode) {
                case 19:
                    if (keyEvent.hasNoModifiers()) {
                        t();
                        int i4 = this.f0;
                        if (i4 > 7) {
                            this.f0 = i4 - 7;
                            zI = true;
                        }
                    }
                    break;
                case 20:
                    if (keyEvent.hasNoModifiers()) {
                        t();
                        int i5 = this.f0;
                        if (i5 <= this.W - 7) {
                            this.f0 = i5 + 7;
                            zI = true;
                        }
                    }
                    break;
                case 21:
                    if (keyEvent.hasNoModifiers()) {
                        zI = I(vj2.d(this));
                    }
                    break;
                case 22:
                    if (keyEvent.hasNoModifiers()) {
                        zI = I(!vj2.d(this));
                    }
                    break;
                case 23:
                    i2 = this.f0;
                    if (i2 != Integer.MIN_VALUE) {
                        J(i2);
                        return true;
                    }
                    break;
            }
        } else {
            i2 = this.f0;
            if (i2 != Integer.MIN_VALUE) {
                J(i2);
                return true;
            }
        }
        if (!zI) {
            return super.onKeyDown(i, keyEvent);
        }
        invalidate();
        return true;
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (z) {
            int i5 = i3 - i;
            int i6 = i4 - i2;
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int paddingRight = getPaddingRight();
            int paddingBottom = getPaddingBottom();
            int i7 = (i5 - paddingRight) - paddingLeft;
            int i8 = (i6 - paddingBottom) - paddingTop;
            if (i7 == this.N || i8 == this.O || i7 < 0 || i8 < 0) {
                return;
            }
            this.N = i7;
            this.O = i8;
            float measuredHeight = i8 / ((getMeasuredHeight() - paddingTop) - paddingBottom);
            this.F = 0;
            this.G = (int) this.i.measureText(this.C);
            this.H = (int) (this.v * measuredHeight);
            this.I = (int) (this.w * measuredHeight);
            this.s.invalidateRoot();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int paddingTop = (this.w * 6) + this.v + this.u + getPaddingTop() + getPaddingBottom();
        int iResolveSize = View.resolveSize((this.x * 7) + getPaddingStart() + getPaddingEnd(), i);
        int iResolveSize2 = View.resolveSize(paddingTop, i2);
        this.J = ((iResolveSize - getPaddingRight()) - getPaddingLeft()) / 7;
        setMeasuredDimension(iResolveSize, iResolveSize2);
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        requestLayout();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0032  */
    /* JADX WARN: Code duplicated, block: B:16:0x003c  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int iZ;
        int x = (int) (motionEvent.getX() + 0.5f);
        int y = (int) (motionEvent.getY() + 0.5f);
        int action = motionEvent.getAction();
        if (action == 0) {
            iZ = z(x, y);
            this.h0 = true;
            if (this.f0 != iZ) {
                this.f0 = iZ;
                this.g0 = iZ;
                invalidate();
            }
            if (action != 0 && iZ == Integer.MIN_VALUE) {
                return false;
            }
        } else {
            if (action == 1) {
                int iZ2 = z(x, y);
                if (iZ2 != Integer.MIN_VALUE) {
                    J(iZ2);
                }
            } else if (action == 2) {
                iZ = z(x, y);
                this.h0 = true;
                if (this.f0 != iZ) {
                    this.f0 = iZ;
                    this.g0 = iZ;
                    invalidate();
                }
                if (action != 0) {
                }
            } else if (action == 3) {
            }
            this.f0 = Integer.MIN_VALUE;
            this.h0 = false;
            invalidate();
        }
        return true;
    }

    @SuppressLint({"WrongConstant"})
    public final ColorStateList p(Paint paint, int i) {
        TypedArray typedArrayObtainStyledAttributes = this.i0.obtainStyledAttributes(null, R.styleable.TextAppearance, 0, i);
        String string = typedArrayObtainStyledAttributes.getString(R.styleable.TextAppearance_android_fontFamily);
        if (string != null) {
            paint.setTypeface(Typeface.create(string, 0));
        }
        paint.setTextSize((int) gg2.f(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.TextAppearance_android_textSize, (int) paint.getTextSize()), getContext().getResources().getConfiguration().fontScale));
        ColorStateList colorStateListA = lnb.a(getContext(), typedArrayObtainStyledAttributes, R.styleable.TextAppearance_android_textColor);
        if (colorStateListA != null) {
            paint.setColor(colorStateListA.getColorForState(View.ENABLED_STATE_SET, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
        return colorStateListA;
    }

    public final void q() {
        ValueAnimator valueAnimator = new ValueAnimator();
        this.m0 = valueAnimator;
        valueAnimator.setFloatValues(0.0f, 1.0f);
        this.m0.setDuration(280L);
        this.m0.setInterpolator(q0);
        this.m0.addUpdateListener(new a());
        ValueAnimator valueAnimator2 = new ValueAnimator();
        this.n0 = valueAnimator2;
        valueAnimator2.setFloatValues(0.0f, 1.0f);
        this.n0.setDuration(150L);
        this.n0.setInterpolator(r0);
        this.n0.addUpdateListener(new b());
    }

    public final void r(Canvas canvas) {
        int colorForState;
        TextPaint textPaint = this.k;
        int i = this.F + this.H;
        int iW = w();
        boolean z = false;
        int i2 = 1;
        boolean z2 = A(this.D, this.E) + iW > 35;
        this.o0 = z2;
        int i3 = this.I + (z2 ? 0 : this.y);
        int i4 = this.J;
        float fAscent = (textPaint.ascent() + textPaint.descent()) / 2.0f;
        int i5 = i + (i3 / 2);
        int i6 = 7;
        if (iW >= 1) {
            int i7 = 1;
            while (i7 <= iW) {
                int i8 = (i4 / 2) + ((i7 - 1) * i4);
                if (vj2.d(this)) {
                    i8 = (this.J * 7) - i8;
                }
                textPaint.setFakeBoldText(z);
                textPaint.setColor(this.z);
                int i9 = this.D;
                canvas.drawText(this.t.format(((i9 == 0 ? A(11, this.E - i2) : A(i9 - 1, this.E)) - iW) + i7), i8, i5 - fAscent, textPaint);
                i7++;
                z = false;
                i2 = 1;
            }
        }
        int iA = (((this.o0 ? 6 : 5) * 7) - A(this.D, this.E)) - iW;
        int i10 = (i3 * 4) + i5;
        boolean z3 = this.o0;
        int i11 = i10 + (z3 ? i3 : 0);
        int iX = x(z3);
        int i12 = 1;
        while (i12 <= iA) {
            int i13 = (i4 / 2) + (i4 * iX);
            if (vj2.d(this)) {
                i13 = (this.J * i6) - i13;
            }
            textPaint.setColor(this.z);
            canvas.drawText(this.t.format(i12), i13, i11 - fAscent, textPaint);
            iX++;
            if (iX == 7) {
                i11 += i3;
                iX = 0;
            }
            i12++;
            i6 = 7;
        }
        int i14 = 1;
        while (i14 <= this.W) {
            int i15 = (i4 * iW) + (i4 / 2);
            if (vj2.d(this)) {
                i15 = (this.J * 7) - i15;
            }
            boolean zC = C(i14);
            int i16 = zC ? 8 : 0;
            boolean z4 = this.Q == i14 && this.k0;
            boolean z5 = this.S == i14 && this.R == this.T && this.l0;
            boolean z6 = this.f0 == i14;
            if (z4) {
                i16 |= 32;
                canvas.drawCircle(i15, i5, this.M / 2.0f, z6 ? this.o : this.f1632l);
            } else if (z6) {
                i16 |= 16;
                if (zC) {
                    canvas.drawCircle(i15, i5, this.K / 2.0f, this.f1633n);
                }
            } else if (z5 && zC) {
                canvas.drawCircle(i15, i5, this.K / 2.0f, this.m);
            }
            if (!(this.U == i14) || z4) {
                colorForState = this.e0.getColorForState(vj2.c(i16), 0);
            } else {
                colorForState = this.A;
                this.p0.setColor(colorForState);
                canvas.drawCircle(i15, i5, this.K / 2.0f, this.p0);
            }
            textPaint.setColor(colorForState);
            canvas.drawText(this.t.format(i14), i15, i5 - fAscent, textPaint);
            iW++;
            if (iW == 7) {
                i5 += i3;
                iW = 0;
            }
            i14++;
        }
    }

    public final void s(Canvas canvas) {
        TextPaint textPaint = this.f1631j;
        int i = this.F;
        int i2 = this.H;
        int i3 = this.J;
        float fAscent = (textPaint.ascent() + textPaint.descent()) / 2.0f;
        int i4 = i + (i2 / 2);
        for (int i5 = 0; i5 < 7; i5++) {
            int i6 = (i3 * i5) + (i3 / 2);
            if (vj2.d(this)) {
                i6 = (this.J * 7) - i6;
            }
            canvas.drawText(this.p[i5], i6, i4 - fAscent, textPaint);
        }
    }

    public void setDayHighlightColor(ColorStateList colorStateList) {
        this.f1633n.setColor(colorStateList.getColorForState(vj2.c(24), 0));
        invalidate();
    }

    public void setDayOfWeekTextAppearance(int i) {
        p(this.f1631j, i);
        invalidate();
    }

    public void setDayOfWeekTextColor(ColorStateList colorStateList) {
        this.f1631j.setColor(colorStateList.getColorForState(View.ENABLED_STATE_SET, 0));
        invalidate();
    }

    public void setDaySelectorColor(int i) {
        this.f1632l.setColor(i);
        this.m.setColor(i);
        this.o.setColor(i);
        this.o.setAlpha(176);
        invalidate();
    }

    public void setDayTextAppearance(int i) {
        ColorStateList colorStateListP = p(this.k, i);
        if (colorStateListP != null) {
            this.e0 = colorStateListP;
        }
        invalidate();
    }

    public void setDayTextColor(ColorStateList colorStateList) {
        this.e0 = colorStateList;
        invalidate();
    }

    public void setFirstDayOfWeek(int i) {
        if (G(i)) {
            this.V = i;
        } else {
            this.V = this.q.getFirstDayOfWeek();
        }
        O();
        this.s.invalidateRoot();
        invalidate();
    }

    public void setMonthTextAlpha(int i) {
        int i2 = this.j0;
        if (Integer.toHexString(i2).length() > 2) {
            this.i.setColor(new ColorStateList(new int[][]{new int[]{16842910}, new int[0]}, new int[]{new BigInteger(Integer.toHexString((i * new BigInteger(Integer.toHexString(i2).substring(0, 2), 16).intValue()) / 255) + Integer.toHexString(i2).substring(2), 16).intValue(), i2}).getColorForState(View.ENABLED_STATE_SET, 0));
            invalidate();
        }
    }

    public void setMonthTextAppearance(int i) {
        p(this.i, i);
        this.j0 = this.i.getColor();
        invalidate();
    }

    public void setMonthTextColor(ColorStateList colorStateList) {
        this.i.setColor(lh2.a(getContext(), R$attr.couiColorPrimary));
        invalidate();
    }

    public void setOnDayClickListener(d dVar) {
        this.d0 = dVar;
    }

    public final void t() {
        if (this.f0 != Integer.MIN_VALUE) {
            return;
        }
        int i = this.g0;
        if (i != Integer.MIN_VALUE) {
            this.f0 = i;
            return;
        }
        int i2 = this.Q;
        if (i2 != Integer.MIN_VALUE) {
            this.f0 = i2;
        } else {
            this.f0 = 1;
        }
    }

    public final int u(Rect rect) {
        if (rect == null) {
            return 3;
        }
        int iCenterX = rect.centerX() - getPaddingLeft();
        int i = this.J;
        if (i == 0) {
            return 3;
        }
        int iA = vj2.a(iCenterX / i, 0, 6);
        return vj2.d(this) ? (7 - iA) - 1 : iA;
    }

    public final int v(Rect rect) {
        if (rect == null) {
            return 3;
        }
        int iCenterY = rect.centerY();
        TextPaint textPaint = this.k;
        int i = this.F + this.H;
        int i2 = this.I;
        int iRound = Math.round(((int) (iCenterY - ((i + (i2 / 2)) - ((textPaint.ascent() + textPaint.descent()) / 2.0f)))) / i2);
        int iW = w() + this.W;
        return vj2.a(iRound, 0, (iW / 7) - (iW % 7 == 0 ? 1 : 0));
    }

    public final int w() {
        int i = this.a0;
        int i2 = this.V;
        int i3 = i - i2;
        return i < i2 ? i3 + 7 : i3;
    }

    public final int x(boolean z) {
        int iA = ((z ? 6 : 5) * 7) - (A(this.D, this.E) + w());
        return iA > 7 ? Math.abs(iA - 14) : Math.abs(iA - 7);
    }

    public boolean y(int i, Rect rect) {
        if (!F(i)) {
            return false;
        }
        int iW = (i - 1) + w();
        int i2 = iW % 7;
        int i3 = this.J;
        int width = vj2.d(this) ? (getWidth() - getPaddingRight()) - ((i2 + 1) * i3) : getPaddingLeft() + (i2 * i3);
        int i4 = iW / 7;
        int i5 = this.I + (this.o0 ? 0 : this.y);
        int paddingTop = getPaddingTop() + this.F + this.H + (i4 * i5);
        rect.set(width, paddingTop, i3 + width, i5 + paddingTop);
        return true;
    }

    public final int z(int i, int i2) {
        int i3;
        int paddingTop;
        int paddingLeft = i - getPaddingLeft();
        if (paddingLeft < 0 || paddingLeft >= this.J * 7 || (paddingTop = i2 - getPaddingTop()) < (i3 = this.F + this.H) || paddingTop >= this.O) {
            return Integer.MIN_VALUE;
        }
        if (vj2.d(this)) {
            paddingLeft = (this.J * 7) - paddingLeft;
        }
        return (((paddingLeft / this.J) + (((paddingTop - i3) / (this.I + (this.o0 ? 0 : this.y))) * 7)) + 1) - w();
    }

    public COUIDateMonthView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, android.R.attr.datePickerStyle);
    }

    public COUIDateMonthView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public COUIDateMonthView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.i = new TextPaint();
        this.f1631j = new TextPaint();
        this.k = new TextPaint();
        this.f1632l = new Paint();
        this.m = new Paint();
        this.f1633n = new Paint();
        this.o = new Paint();
        this.p = new String[7];
        this.Q = Integer.MIN_VALUE;
        this.R = Integer.MIN_VALUE;
        this.S = Integer.MIN_VALUE;
        this.T = Integer.MIN_VALUE;
        this.U = Integer.MIN_VALUE;
        this.V = 1;
        this.b0 = 1;
        this.c0 = 31;
        this.f0 = Integer.MIN_VALUE;
        this.g0 = Integer.MIN_VALUE;
        this.h0 = false;
        this.i0 = context;
        Resources resources = context.getResources();
        this.u = resources.getDimensionPixelSize(R$dimen.calendar_picker_month_height);
        this.P = resources.getDimensionPixelSize(R$dimen.calendar_picker_month_padding_start);
        this.v = resources.getDimensionPixelSize(R$dimen.calendar_picker_day_of_week_height);
        this.w = resources.getDimensionPixelSize(R$dimen.calendar_picker_day_height);
        this.y = resources.getDimensionPixelSize(R$dimen.calendar_picker_day_min_col_padding);
        this.x = resources.getDimensionPixelSize(R$dimen.calendar_picker_day_width);
        this.K = resources.getDimensionPixelSize(R$dimen.calendar_picker_current_day_radius);
        this.L = resources.getDimensionPixelSize(R$dimen.calendar_picker_current_day_stroke_radius);
        this.M = this.K;
        this.z = lh2.a(context, R$attr.couiColorDisabledNeutral);
        this.A = lh2.a(context, R$attr.couiColorPrimary);
        this.B = lh2.a(context, R$attr.couiColorBackground);
        c cVar = new c(this);
        this.s = cVar;
        ViewCompat.setAccessibilityDelegate(this, cVar);
        setImportantForAccessibility(1);
        Locale locale = resources.getConfiguration().locale;
        this.r = locale;
        this.q = Calendar.getInstance(locale);
        this.t = NumberFormat.getIntegerInstance(locale);
        P();
        O();
        B(resources);
    }
}
