package com.amap.api.col.p0003sl;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.oplus.aiunit.vision.grm;
import com.oplus.aiunit.vision.xsm;
import io.protostuff.runtime.RuntimeSchema;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class ek extends ScrollView {
    public static final String a = "ek";
    public Context i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public LinearLayout f698j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List<String> f699l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f700n;
    public Bitmap o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public Runnable w;
    public int x;
    public d y;

    public class a implements Runnable {

        /* JADX INFO: renamed from: com.amap.api.col.3sl.ek$a$a, reason: collision with other inner class name */
        public class RunnableC0159a implements Runnable {
            public final /* synthetic */ int i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public final /* synthetic */ int f701j;

            public RunnableC0159a(int i, int i2) {
                this.i = i;
                this.f701j = i2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ek ekVar = ek.this;
                ekVar.smoothScrollTo(0, (ekVar.v - this.i) + ek.this.k);
                ek ekVar2 = ek.this;
                ekVar2.u = this.f701j + ekVar2.s + 1;
                ek.this.w();
            }
        }

        public class b implements Runnable {
            public final /* synthetic */ int i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public final /* synthetic */ int f702j;

            public b(int i, int i2) {
                this.i = i;
                this.f702j = i2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ek ekVar = ek.this;
                ekVar.smoothScrollTo(0, ekVar.v - this.i);
                ek ekVar2 = ek.this;
                ekVar2.u = this.f702j + ekVar2.s;
                ek.this.w();
            }
        }

        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (ek.this.v - ek.this.getScrollY() != 0) {
                ek ekVar = ek.this;
                ekVar.v = ekVar.getScrollY();
                ek ekVar2 = ek.this;
                ekVar2.postDelayed(ekVar2.w, ek.this.x);
                return;
            }
            if (ek.this.k == 0) {
                return;
            }
            int i = ek.this.v % ek.this.k;
            int i2 = ek.this.v / ek.this.k;
            if (i == 0) {
                ek ekVar3 = ek.this;
                ekVar3.u = i2 + ekVar3.s;
                ek.this.w();
            } else if (i > ek.this.k / 2) {
                ek.this.post(new RunnableC0159a(i, i2));
            } else {
                ek.this.post(new b(i, i2));
            }
        }
    }

    public class b extends Drawable {
        public b() {
        }

        public final void a(Canvas canvas) {
            canvas.drawColor(ek.this.p);
        }

        public final void b(Canvas canvas) {
            Paint paint = new Paint();
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            rect.left = 0;
            rect.top = 0;
            rect.right = ek.this.o.getWidth() + 0;
            rect.bottom = ek.this.o.getHeight() + 0;
            rect2.left = 0;
            rect2.top = ek.this.u()[0];
            rect2.right = ek.this.f700n + 0;
            rect2.bottom = ek.this.u()[1];
            canvas.drawBitmap(ek.this.o, rect, rect2, paint);
        }

        public final void c(Canvas canvas) {
            Paint paint = new Paint();
            Rect clipBounds = canvas.getClipBounds();
            paint.setColor(ek.this.q);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(ek.this.r);
            canvas.drawRect(clipBounds, paint);
        }

        @Override // android.graphics.drawable.Drawable
        public final void draw(Canvas canvas) {
            try {
                a(canvas);
                b(canvas);
                c(canvas);
            } catch (Throwable unused) {
            }
        }

        @Override // android.graphics.drawable.Drawable
        public final int getOpacity() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable
        public final void setAlpha(int i) {
        }

        @Override // android.graphics.drawable.Drawable
        public final void setColorFilter(ColorFilter colorFilter) {
        }
    }

    public class c implements Runnable {
        public final /* synthetic */ int i;

        public c(int i) {
            this.i = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ek ekVar = ek.this;
            ekVar.smoothScrollTo(0, this.i * ekVar.k);
        }
    }

    public interface d {
        void a(int i);
    }

    public ek(Context context) {
        super(context);
        this.k = 0;
        this.m = -1;
        this.o = null;
        this.p = Color.parseColor("#eeffffff");
        this.q = Color.parseColor("#44383838");
        this.r = 4;
        this.s = 1;
        this.u = 1;
        this.x = 50;
        g(context);
    }

    public static int a(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int b(View view) {
        n(view);
        return view.getMeasuredHeight();
    }

    public static void n(View view) {
        view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(RuntimeSchema.MAX_TAG_VALUE, Integer.MIN_VALUE));
    }

    public final void e() {
        Bitmap bitmap = this.o;
        if (bitmap != null && !bitmap.isRecycled()) {
            xsm.C(this.o);
            this.o = null;
        }
        if (this.y != null) {
            this.y = null;
        }
    }

    public final void f(int i) {
        int i2 = this.k;
        if (i2 == 0) {
            return;
        }
        int i3 = this.s;
        int i4 = (i / i2) + i3;
        int i5 = i % i2;
        int i6 = i / i2;
        if (i5 == 0) {
            i4 = i6 + i3;
        } else if (i5 > i2 / 2) {
            i4 = i6 + i3 + 1;
        }
        int childCount = this.f698j.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            TextView textView = (TextView) this.f698j.getChildAt(i7);
            if (textView == null) {
                return;
            }
            if (i4 == i7) {
                textView.setTextColor(Color.parseColor("#0288ce"));
            } else {
                textView.setTextColor(Color.parseColor("#bbbbbb"));
            }
        }
    }

    @Override // android.widget.ScrollView
    public void fling(int i) {
        super.fling(i / 3);
    }

    public final void g(Context context) {
        this.i = context;
        setVerticalScrollBarEnabled(false);
        try {
            if (this.o == null) {
                InputStream inputStreamOpen = grm.b(context).open("map_indoor_select.png");
                this.o = BitmapFactory.decodeStream(inputStreamOpen);
                inputStreamOpen.close();
            }
        } catch (Throwable unused) {
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.f698j = linearLayout;
        linearLayout.setOrientation(1);
        addView(this.f698j);
        this.w = new a();
    }

    public final void h(d dVar) {
        this.y = dVar;
    }

    public final void i(String str) {
        List<String> list = this.f699l;
        if (list == null || list.size() == 0) {
            return;
        }
        int iIndexOf = this.f699l.indexOf(str);
        int size = this.f699l.size();
        int i = this.s;
        int i2 = ((size - i) - 1) - iIndexOf;
        this.u = i + i2;
        post(new c(i2));
    }

    public final void j(boolean z) {
        setVisibility(z ? 0 : 8);
    }

    public final void k(String[] strArr) {
        if (this.f699l == null) {
            this.f699l = new ArrayList();
        }
        this.f699l.clear();
        for (String str : strArr) {
            this.f699l.add(str);
        }
        for (int i = 0; i < this.s; i++) {
            this.f699l.add(0, "");
            this.f699l.add("");
        }
        r();
    }

    public final TextView m(String str) {
        TextView textView = new TextView(this.i);
        textView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        textView.setSingleLine(true);
        textView.setTextSize(2, 16.0f);
        textView.setText(str);
        textView.setGravity(17);
        textView.getPaint().setFakeBoldText(true);
        int iA = a(this.i, 8.0f);
        int iA2 = a(this.i, 6.0f);
        textView.setPadding(iA, iA2, iA, iA2);
        if (this.k == 0) {
            this.k = b(textView);
            this.f698j.setLayoutParams(new FrameLayout.LayoutParams(-2, this.k * this.t));
            setLayoutParams(new LinearLayout.LayoutParams(-2, this.k * this.t));
        }
        return textView;
    }

    public final boolean o() {
        return getVisibility() == 0;
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        f(i2);
        if (i2 > i4) {
            this.m = 1;
        } else {
            this.m = 0;
        }
    }

    @Override // android.widget.ScrollView, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f700n = i;
        try {
            setBackgroundDrawable(null);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // android.widget.ScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            q();
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void q() {
        this.v = getScrollY();
        postDelayed(this.w, this.x);
    }

    public final void r() {
        List<String> list = this.f699l;
        if (list == null || list.size() == 0) {
            return;
        }
        this.f698j.removeAllViews();
        this.t = (this.s * 2) + 1;
        for (int size = this.f699l.size() - 1; size >= 0; size--) {
            this.f698j.addView(m(this.f699l.get(size)));
        }
        f(0);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.p = i;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f700n == 0) {
            try {
                WindowManager windowManager = (WindowManager) this.i.getSystemService("window");
                if (windowManager != null) {
                    this.f700n = windowManager.getDefaultDisplay().getWidth();
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        super.setBackgroundDrawable(new b());
    }

    public final int[] u() {
        int i = this.k;
        int i2 = this.s;
        return new int[]{i * i2, i * (i2 + 1)};
    }

    public final void w() {
        d dVar = this.y;
        if (dVar != null) {
            try {
                dVar.a(x());
            } catch (Throwable unused) {
            }
        }
    }

    public final int x() {
        List<String> list = this.f699l;
        if (list == null || list.size() == 0) {
            return 0;
        }
        return Math.min(this.f699l.size() - (this.s * 2), Math.max(0, ((this.f699l.size() - 1) - this.u) - this.s));
    }
}
