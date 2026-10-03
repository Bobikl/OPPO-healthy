package com.heytap.health.oobe.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.animation.PathInterpolatorCompat;
import com.heytap.health.R;
import com.heytap.nearx.tangramconfig.stat.Const;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class AnimNumberView extends View {
    public static final int ANIMATION_DELAY = 66;
    public static final int ANIMATION_DURATION = 600;
    public static final int NEW_OPACITY_DELAY = 200;
    public static final int NEW_OPACITY_DURATION = 400;
    public static final int NUM_START_MARGIN = 10;
    public static final int OLD_OPACITY_DURATION = 333;
    public static final String TAG = "AnimTextView";
    public List<a> i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List<a> f5138j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f5139l;
    public Rect m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Rect f5140n;
    public b o;
    public b p;
    public Paint q;

    public static final class a {
        public char a;
        public Rect b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f5141c;

        public a(char c2, Rect rect) {
            this.a = c2;
            this.b = rect;
        }

        public boolean a() {
            return this.f5141c;
        }

        public void b(boolean z) {
            this.f5141c = z;
        }
    }

    public final class b implements Runnable {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Animator f5142j;
        public int k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f5143l;
        public int m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f5144n;
        public float i = 0.0f;
        public Interpolator o = PathInterpolatorCompat.create(0.21f, 0.0f, 0.36f, 1.0f);

        public class a extends LinearInterpolator {
            public final /* synthetic */ AnimNumberView a;

            public a(AnimNumberView animNumberView) {
                this.a = animNumberView;
            }

            @Override // android.view.animation.LinearInterpolator, android.animation.TimeInterpolator
            public float getInterpolation(float f) {
                b.this.i = super.getInterpolation(f);
                AnimNumberView.this.invalidate();
                return b.this.i;
            }
        }

        public b(int i, int i2, int i3) {
            this.k = i;
            this.f5143l = i2;
            this.m = i3;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f5142j = valueAnimatorOfFloat;
            int iD = d();
            this.f5144n = iD;
            valueAnimatorOfFloat.setDuration(iD);
            this.f5142j.setInterpolator(new a(AnimNumberView.this));
        }

        public final int d() {
            int i = this.f5143l;
            for (int i2 = 0; i2 < this.k; i2++) {
                i += this.m * i2;
            }
            return i;
        }

        public float e(int i) {
            return this.o.getInterpolation(((this.f5144n * this.i) - (this.m * i)) / this.f5143l);
        }

        public int f(int i) {
            int i2 = ((int) (this.f5144n * this.i)) - (this.m * i);
            int i3 = this.f5143l;
            return i2 > i3 ? i3 : i2;
        }

        public final boolean g(int i) {
            return ((float) this.f5144n) * this.i >= ((float) (this.m * i));
        }

        public void h() {
            if (this.f5142j.isRunning()) {
                this.f5142j.cancel();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            h();
            this.f5142j.start();
        }
    }

    public AnimNumberView(Context context) {
        super(context);
        this.i = null;
        this.f5138j = null;
        this.f5139l = 10.0f;
        this.m = new Rect();
        this.f5140n = new Rect();
        this.q = null;
    }

    public static int k(Context context, float f) {
        return (int) ((context.getResources().getDisplayMetrics().scaledDensity * f) + 0.5f);
    }

    public final void a(List<a> list, List<a> list2) {
        if (list == null || list.size() == 0 || list2 == null || list2.size() == 0 || list.size() != list2.size()) {
            return;
        }
        int iMin = Math.min(list.size(), list2.size());
        for (int i = 0; i < iMin; i++) {
            a aVar = list.get(i);
            a aVar2 = list2.get(i);
            if (aVar.a != aVar2.a) {
                return;
            }
            aVar.b(true);
            aVar2.b(true);
        }
    }

    public final void b(Canvas canvas) {
        List<a> list = this.f5138j;
        if (list == null || list.size() == 0) {
            return;
        }
        int size = this.f5138j.size();
        while (true) {
            size--;
            if (size <= -1) {
                return;
            }
            a aVar = this.f5138j.get(size);
            if (!this.p.g((this.f5138j.size() - 1) - size) || aVar.a()) {
                this.q.setAlpha(0);
                String strValueOf = String.valueOf(aVar.a);
                Rect rect = aVar.b;
                canvas.drawText(strValueOf, 0, 1, rect.left, rect.height() - aVar.b.bottom, this.q);
            } else {
                float fE = this.p.e((this.f5138j.size() - 1) - size) * this.f5140n.height();
                int iF = this.o.f((this.i.size() - 1) - size);
                this.q.setAlpha(iF >= 200 ? (int) ((((iF + Const.ERROR_CODE_NON_EXIST) * 1.0f) / 400.0f) * 255.0f) : 0);
                String strValueOf2 = String.valueOf(aVar.a);
                Rect rect2 = aVar.b;
                canvas.drawText(strValueOf2, 0, 1, rect2.left, ((rect2.height() - aVar.b.bottom) + this.f5140n.height()) - fE, this.q);
            }
        }
    }

    public final void c(Canvas canvas) {
        List<a> list = this.i;
        if (list == null || list.size() == 0) {
            return;
        }
        int size = this.i.size();
        while (true) {
            size--;
            if (size <= -1) {
                return;
            }
            a aVar = this.i.get(size);
            if (!this.o.g((this.i.size() - 1) - size) || aVar.a()) {
                this.q.setAlpha(255);
                String strValueOf = String.valueOf(aVar.a);
                Rect rect = aVar.b;
                canvas.drawText(strValueOf, 0, 1, rect.left, rect.height() - aVar.b.bottom, this.q);
            } else {
                float fE = this.o.e((this.i.size() - 1) - size) * this.m.height();
                int iF = 255 - ((int) (((this.o.f((this.i.size() - 1) - size) * 1.0f) / 333.0f) * 255.0f));
                if (iF < 0) {
                    iF = 0;
                }
                this.q.setAlpha(iF);
                String strValueOf2 = String.valueOf(aVar.a);
                Rect rect2 = aVar.b;
                canvas.drawText(strValueOf2, 0, 1, rect2.left, (rect2.height() - aVar.b.bottom) - fE, this.q);
            }
        }
    }

    public final int d(List<a> list) {
        if (list == null || list.size() == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            i += !list.get(i2).f5141c ? 1 : 0;
        }
        return i;
    }

    public final int e(List<a> list) {
        int i = 0;
        if (list == null) {
            return 0;
        }
        Iterator<a> it = list.iterator();
        while (it.hasNext()) {
            if (!it.next().f5141c) {
                i++;
            }
        }
        if (i <= 3) {
            return 66;
        }
        if (i <= 6) {
            return 44;
        }
        if (i <= 9) {
            return 22;
        }
        if (i <= 12) {
            return 11;
        }
        return i <= 15 ? 5 : 2;
    }

    public final float f(String str) {
        float f = (str.length() < 10 || str.length() >= 18) ? 53.33f : 43.33f;
        if (str.length() >= 16) {
            return 23.33f;
        }
        return f;
    }

    public final void g(String str, String str2) {
        h(f(str2));
        this.q.getTextBounds(str, 0, str.length(), this.m);
        this.q.getTextBounds(str2, 0, str2.length(), this.f5140n);
        this.i = i(str, this.m);
        this.f5138j = i(str2, this.f5140n);
        this.k = this.m.height();
        a(this.i, this.f5138j);
        this.o = new b(d(this.i), 600, e(this.i));
        this.p = new b(d(this.f5138j), 600, e(this.f5138j));
    }

    public final void h(float f) {
        Paint paint = new Paint();
        this.q = paint;
        paint.reset();
        this.q.setAntiAlias(true);
        this.q.setTypeface(ResourcesCompat.getFont(getContext(), R.font.opposans_en_os_medium));
        this.q.setColor(Color.parseColor("#ffffff"));
        this.q.setTextSize(k(getContext(), f));
    }

    public final List<a> i(String str, Rect rect) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Rect rect2 = new Rect();
        this.q.getTextBounds("4", 0, 1, rect2);
        int iWidth = rect2.width();
        int i = 0;
        int iWidth2 = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            Rect rect3 = new Rect();
            this.q.getTextBounds(String.valueOf(cCharAt), 0, 1, rect3);
            rect3.top = rect.top;
            rect3.bottom = rect.bottom;
            int iWidth3 = cCharAt == ',' ? rect3.width() : iWidth;
            int iWidth4 = (iWidth3 - rect3.width()) / 2;
            if (i2 == 0) {
                rect3.left = iWidth2;
                rect3.right = (iWidth3 + iWidth2) - iWidth4;
            } else {
                i = (int) (i + this.f5139l);
                int i3 = iWidth2 + i + iWidth4;
                rect3.left = i3;
                rect3.right = i3 + iWidth3;
            }
            arrayList.add(new a(cCharAt, rect3));
            iWidth2 += rect3.width();
        }
        return arrayList;
    }

    public final void j(String str, String str2) {
        g(str, str2);
        post(this.o);
        post(this.p);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(null);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        c(canvas);
        b(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        View.MeasureSpec.getSize(i);
        View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i2);
        View.MeasureSpec.getMode(i2);
        if (View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE) {
            size = this.k;
        }
        setMeasuredDimension(View.getDefaultSize(getSuggestedMinimumWidth(), i), size);
    }

    public AnimNumberView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = null;
        this.f5138j = null;
        this.f5139l = 10.0f;
        this.m = new Rect();
        this.f5140n = new Rect();
        this.q = null;
    }

    public AnimNumberView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = null;
        this.f5138j = null;
        this.f5139l = 10.0f;
        this.m = new Rect();
        this.f5140n = new Rect();
        this.q = null;
    }
}
