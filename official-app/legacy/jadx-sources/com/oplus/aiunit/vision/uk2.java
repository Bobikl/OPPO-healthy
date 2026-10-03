package com.oplus.aiunit.vision;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Interpolator;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AnimationUtils;
import android.widget.AbsListView;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import com.support.scrollbar.R$color;
import com.support.scrollbar.R$dimen;
import java.util.Locale;

/* JADX INFO: loaded from: classes13.dex */
public class uk2 {
    public static final long SCROLLER_FADE_TIMEOUT = 2000;
    public static final int[] m = {16842919};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f17489n = new int[0];
    public View a;
    public final float b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f17490c;
    public final Rect d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Drawable f17491e;
    public final c f;
    public int g;
    public final e h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f17492j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f17493l;

    public static class b {
        public final c a;
        public int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f17494c;
        public boolean d = true;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Drawable f17495e;
        public int f;
        public int g;
        public int h;
        public int i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f17496j;
        public int k;

        public b(c cVar) {
            this.a = cVar;
            this.b = cVar.getCOUIScrollableView().getContext().getResources().getDimensionPixelSize(R$dimen.coui_scrollbar_wight);
            this.f17494c = cVar.getCOUIScrollableView().getContext().getResources().getDimensionPixelSize(R$dimen.coui_scrollbar_min_height);
            this.h = cVar.getCOUIScrollableView().getContext().getResources().getDimensionPixelSize(R$dimen.coui_scrollbar_margin_top);
            this.i = cVar.getCOUIScrollableView().getContext().getResources().getDimensionPixelSize(R$dimen.coui_scrollbar_margin_bottom);
            this.f17496j = cVar.getCOUIScrollableView().getContext().getResources().getDimensionPixelSize(R$dimen.coui_scrollbar_drawable_default_inset);
            this.k = cVar.getCOUIScrollableView().getContext().getResources().getDimensionPixelSize(R$dimen.coui_scrollbar_drawable_pressed_inset);
            Context context = cVar.getCOUIScrollableView().getContext();
            int i = R$color.coui_scrollbar_color;
            this.f = ContextCompat.getColor(context, i);
            this.g = ContextCompat.getColor(cVar.getCOUIScrollableView().getContext(), i);
        }

        public uk2 a() {
            if (this.f17495e == null) {
                this.f17495e = b();
            }
            return new uk2(this.a, this.b, this.f17494c, this.f17495e, this.d);
        }

        public final Drawable b() {
            StateListDrawable stateListDrawable = new StateListDrawable();
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(this.g);
            float f = this.b / 2.0f;
            gradientDrawable.setCornerRadius(f);
            int[] iArr = uk2.m;
            int i = this.k;
            stateListDrawable.addState(iArr, new InsetDrawable((Drawable) gradientDrawable, i, this.h, i, this.i));
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setColor(this.f);
            gradientDrawable2.setCornerRadius(f);
            int[] iArr2 = uk2.f17489n;
            int i2 = this.f17496j;
            stateListDrawable.addState(iArr2, new InsetDrawable((Drawable) gradientDrawable2, i2, this.h, i2, this.i));
            return stateListDrawable;
        }

        public b c(int i) {
            this.i = i;
            return this;
        }

        public b d(int i) {
            this.h = i;
            return this;
        }
    }

    public interface c {
        View getCOUIScrollableView();

        int superComputeVerticalScrollExtent();

        int superComputeVerticalScrollOffset();

        int superComputeVerticalScrollRange();

        void superOnTouchEvent(MotionEvent motionEvent);
    }

    public interface d {
    }

    public static class e implements Runnable {
        public static final int FADING = 2;
        public static final int OFF = 0;
        public static final int ON = 1;
        public static final float[] q = {255.0f};
        public static final float[] r = {0.0f};

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public float[] f17498l;
        public View m;
        public long o;
        public final int k = 50;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final Interpolator f17499n = new Interpolator(1, 2);
        public int p = 0;
        public final int i = ViewConfiguration.getScrollDefaultDelay();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f17497j = ViewConfiguration.getScrollBarFadeDuration();

        public e(ViewConfiguration viewConfiguration, View view) {
            this.m = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            View view;
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            long j2 = this.o;
            if (jCurrentAnimationTimeMillis < j2) {
                if (Math.abs(jCurrentAnimationTimeMillis - j2) >= 50 || (view = this.m) == null) {
                    return;
                }
                view.post(this);
                return;
            }
            int i = (int) jCurrentAnimationTimeMillis;
            Interpolator interpolator = this.f17499n;
            interpolator.setKeyFrame(0, i, q);
            interpolator.setKeyFrame(1, i + this.f17497j, r);
            this.p = 2;
            this.m.invalidate();
        }
    }

    public boolean c() {
        return d(2000L);
    }

    public boolean d(long j2) {
        ViewCompat.postInvalidateOnAnimation(this.a);
        if (this.f17492j) {
            return false;
        }
        if (this.h.p == 0) {
            j2 = Math.max(750L, j2);
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis() + j2;
        e eVar = this.h;
        eVar.o = jCurrentAnimationTimeMillis;
        eVar.p = 1;
        this.a.removeCallbacks(eVar);
        this.a.postDelayed(this.h, jCurrentAnimationTimeMillis - AnimationUtils.currentAnimationTimeMillis());
        return false;
    }

    public void e(Canvas canvas) {
        i(canvas);
    }

    public final void f(StateListDrawable stateListDrawable, int i, int i2) {
        Drawable stateDrawable = stateListDrawable.getStateDrawable(i);
        if (stateDrawable instanceof InsetDrawable) {
            Drawable drawable = ((InsetDrawable) stateDrawable).getDrawable();
            if (drawable instanceof GradientDrawable) {
                ((GradientDrawable) drawable).setColor(i2);
            }
        }
    }

    public final boolean g() {
        return d(((long) this.h.i) * 4);
    }

    public void h() {
        if (this.f17493l) {
            g();
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0047  */
    /* JADX WARN: Code duplicated, block: B:23:0x006d  */
    /* JADX WARN: Code duplicated, block: B:25:? A[RETURN, SYNTHETIC] */
    public final void i(Canvas canvas) {
        boolean z;
        if (!this.f17492j) {
            e eVar = this.h;
            int i = eVar.p;
            if (i == 0) {
                return;
            }
            if (i == 2) {
                z = true;
                if (eVar.f17498l == null) {
                    eVar.f17498l = new float[1];
                }
                float[] fArr = eVar.f17498l;
                if (eVar.f17499n.timeToValues(fArr) == Interpolator.Result.FREEZE_END) {
                    eVar.p = 0;
                } else {
                    this.f17491e.setAlpha(Math.round(fArr[0]));
                }
            } else {
                this.f17491e.setAlpha(255);
            }
            if (u(0)) {
                int scrollY = this.a.getScrollY();
                int scrollX = this.a.getScrollX();
                Drawable drawable = this.f17491e;
                Rect rect = this.d;
                drawable.setBounds(rect.left + scrollX, rect.top + scrollY, rect.right + scrollX, rect.bottom + scrollY);
                this.f17491e.draw(canvas);
            }
            if (z) {
                this.a.invalidate();
            }
        }
        this.f17491e.setAlpha(255);
        z = false;
        if (u(0)) {
            int scrollY2 = this.a.getScrollY();
            int scrollX2 = this.a.getScrollX();
            Drawable drawable2 = this.f17491e;
            Rect rect2 = this.d;
            drawable2.setBounds(rect2.left + scrollX2, rect2.top + scrollY2, rect2.right + scrollX2, rect2.bottom + scrollY2);
            this.f17491e.draw(canvas);
        }
        if (z) {
            this.a.invalidate();
        }
    }

    public boolean j(MotionEvent motionEvent) {
        return k(motionEvent);
    }

    public final boolean k(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            return m(motionEvent);
        }
        return false;
    }

    public boolean l(MotionEvent motionEvent) {
        return m(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002a  */
    /* JADX WARN: Code duplicated, block: B:16:0x002e  */
    public final boolean m(MotionEvent motionEvent) {
        int iRound;
        int actionMasked = motionEvent.getActionMasked();
        float y = motionEvent.getY();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                if (this.f17492j) {
                    r(false);
                    this.f17492j = false;
                    c();
                }
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                    if (this.f17492j) {
                        r(false);
                        this.f17492j = false;
                        c();
                    }
                }
            } else if (this.f17492j && (iRound = Math.round(y - this.f17490c)) != 0) {
                u(iRound);
                this.f17490c = y;
            }
        } else {
            if (this.h.p == 0) {
                this.f17492j = false;
                return false;
            }
            if (!this.f17492j) {
                u(0);
                float x = motionEvent.getX();
                Rect rect = this.d;
                if (y >= rect.top && y <= rect.bottom && x >= rect.left && x <= rect.right) {
                    this.f17492j = true;
                    this.f17490c = y;
                    this.f.superOnTouchEvent(motionEvent);
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.setAction(3);
                    this.f.superOnTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    r(true);
                    v(0, true);
                    this.a.removeCallbacks(this.h);
                }
            }
        }
        if (!this.f17492j) {
            return false;
        }
        this.a.invalidate();
        this.a.getParent().requestDisallowInterceptTouchEvent(true);
        return true;
    }

    public void n(View view, int i) {
        if (this.f17493l && i == 0 && ViewCompat.isAttachedToWindow(this.a)) {
            g();
        }
    }

    public void o(int i) {
        if (this.f17493l && i == 0) {
            g();
        }
    }

    public void p() {
        Drawable drawable = this.f17491e;
        if (drawable instanceof StateListDrawable) {
            StateListDrawable stateListDrawable = (StateListDrawable) drawable;
            if (stateListDrawable.getStateCount() < 1) {
                return;
            }
            Context context = this.a.getContext();
            int i = R$color.coui_scrollbar_color;
            f(stateListDrawable, 0, ContextCompat.getColor(context, i));
            f(stateListDrawable, 1, ContextCompat.getColor(this.a.getContext(), i));
        }
    }

    public void q() {
        this.a = null;
    }

    public final void r(boolean z) {
        this.f17491e.setState(z ? m : f17489n);
        this.a.invalidate();
    }

    public void s(Drawable drawable) {
        if (drawable == null) {
            throw new IllegalArgumentException("setThumbDrawable must NOT be NULL");
        }
        this.f17491e = drawable;
        u(0);
    }

    public void setOnCOUIScrollListener(d dVar) {
    }

    public void t(int i) {
        Rect rect = this.d;
        rect.left = rect.right - i;
        u(0);
    }

    public final boolean u(int i) {
        return v(i, false);
    }

    public final boolean v(int i, boolean z) {
        int iWidth = this.d.width();
        this.d.right = this.k ? iWidth : this.a.getWidth();
        Rect rect = this.d;
        rect.left = this.k ? 0 : rect.right - iWidth;
        int iSuperComputeVerticalScrollRange = this.f.superComputeVerticalScrollRange();
        if (iSuperComputeVerticalScrollRange <= 0) {
            return false;
        }
        int iSuperComputeVerticalScrollOffset = this.f.superComputeVerticalScrollOffset();
        int iSuperComputeVerticalScrollExtent = this.f.superComputeVerticalScrollExtent();
        int i2 = iSuperComputeVerticalScrollRange - iSuperComputeVerticalScrollExtent;
        if (i2 <= 0) {
            return false;
        }
        float f = i2;
        float f2 = (iSuperComputeVerticalScrollOffset * 1.0f) / f;
        float f3 = (iSuperComputeVerticalScrollExtent * 1.0f) / iSuperComputeVerticalScrollRange;
        int height = this.a.getHeight();
        int iMax = this.i ? Math.max(this.g, Math.round(f3 * height)) : this.g;
        Rect rect2 = this.d;
        rect2.bottom = rect2.top + iMax;
        int i3 = height - iMax;
        float f4 = i3;
        int iRound = Math.round(f2 * f4);
        Rect rect3 = this.d;
        rect3.offsetTo(rect3.left, iRound);
        if (i == 0) {
            return true;
        }
        int i4 = iRound + i;
        if (i4 <= i3) {
            i3 = i4 < 0 ? 0 : i4;
        }
        int iRound2 = Math.round(f * ((i3 * 1.0f) / f4)) - iSuperComputeVerticalScrollOffset;
        View view = this.a;
        if (view instanceof AbsListView) {
            ((AbsListView) view).smoothScrollBy(iRound2, 0);
            return true;
        }
        view.scrollBy(0, iRound2);
        return true;
    }

    public uk2(c cVar, int i, int i2, Drawable drawable, boolean z) {
        this.f17492j = false;
        this.k = false;
        this.f17493l = true;
        View cOUIScrollableView = cVar.getCOUIScrollableView();
        this.a = cOUIScrollableView;
        cOUIScrollableView.setVerticalScrollBarEnabled(false);
        ph2.c(this.a, false);
        Context context = this.a.getContext();
        this.k = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
        this.b = context.getResources().getDisplayMetrics().density;
        this.g = this.a.getContext().getResources().getDimensionPixelSize(R$dimen.coui_scrollbar_min_height);
        this.d = new Rect(0, 0, i, i2);
        this.f17491e = drawable;
        this.f = cVar;
        this.h = new e(ViewConfiguration.get(context), this.a);
        this.i = z;
    }
}
