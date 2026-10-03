package com.coui.appcompat.poplist;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.coui.appcompat.grid.COUIResponsiveUtils;
import com.oplus.aiunit.vision.bj2;
import com.oplus.aiunit.vision.tne;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;

/* JADX INFO: loaded from: classes13.dex */
public class COUIPopupMenuRootView extends FrameLayout {
    public static final boolean A;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Runnable f1862j;
    public Runnable k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public View.OnClickListener f1863l;
    public final com.coui.appcompat.poplist.a.InterfaceC0204a m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ViewGroup f1864n;
    public ViewGroup o;
    public int p;
    public int q;
    public int r;
    public int s;
    public com.coui.appcompat.poplist.a t;
    public com.coui.appcompat.poplist.a u;
    public com.coui.appcompat.poplist.a v;
    public b w;
    public final Paint x;
    public tne y;
    public final Rect z;

    public class a implements com.coui.appcompat.poplist.a.InterfaceC0204a {
        public final View.OnClickListener a = new View.OnClickListener() { // from class: com.oplus.aiunit.vision.zj2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.i.m(view);
            }
        };
        public final View.OnClickListener b = new View.OnClickListener() { // from class: com.oplus.aiunit.vision.ak2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.i.n(view);
            }
        };

        public a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @SensorsDataInstrumented
        public /* synthetic */ void m(View view) {
            COUIPopupMenuRootView.this.o(true);
            COUIPopupMenuRootView.this.f1864n.setOnClickListener(null);
            SensorsDataAutoTrackHelper.trackViewOnClick(view);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @SensorsDataInstrumented
        public /* synthetic */ void n(View view) {
            COUIPopupMenuRootView.this.x();
            SensorsDataAutoTrackHelper.trackViewOnClick(view);
        }

        @Override // com.coui.appcompat.poplist.a.InterfaceC0204a
        public void a() {
            if (COUIPopupMenuRootView.this.w != null) {
                COUIPopupMenuRootView.this.w.a();
            }
            if (COUIPopupMenuRootView.this.o instanceof RoundFrameLayout) {
                ((RoundFrameLayout) COUIPopupMenuRootView.this.o).m();
            }
        }

        @Override // com.coui.appcompat.poplist.a.InterfaceC0204a
        public void b() {
            if (COUIPopupMenuRootView.this.w != null) {
                COUIPopupMenuRootView.this.w.b();
            }
        }

        @Override // com.coui.appcompat.poplist.a.InterfaceC0204a
        public void c() {
            COUIPopupMenuRootView.this.i = true;
            if (COUIPopupMenuRootView.this.o instanceof RoundFrameLayout) {
                ((RoundFrameLayout) COUIPopupMenuRootView.this.o).setAllowDispatchEvent(false);
            }
            if (COUIPopupMenuRootView.this.w != null) {
                COUIPopupMenuRootView.this.w.c();
            }
            if (COUIPopupMenuRootView.this.f1864n != null) {
                COUIPopupMenuRootView.this.f1864n.setFocusable(false);
                COUIPopupMenuRootView.this.f1864n.setClickable(false);
                COUIPopupMenuRootView.this.f1864n.setOnClickListener(null);
                COUIPopupMenuRootView cOUIPopupMenuRootView = COUIPopupMenuRootView.this;
                cOUIPopupMenuRootView.l(cOUIPopupMenuRootView.f1864n, true);
                COUIPopupMenuRootView cOUIPopupMenuRootView2 = COUIPopupMenuRootView.this;
                cOUIPopupMenuRootView2.m(cOUIPopupMenuRootView2.o, false);
                COUIPopupMenuRootView.this.configSubMenuHeaderOnClick(this.b);
            }
        }

        @Override // com.coui.appcompat.poplist.a.InterfaceC0204a
        public void d() {
            if (COUIPopupMenuRootView.this.w != null) {
                COUIPopupMenuRootView.this.w.d();
            }
        }

        @Override // com.coui.appcompat.poplist.a.InterfaceC0204a
        public void e() {
            COUIPopupMenuRootView.this.i = false;
            if (COUIPopupMenuRootView.this.o instanceof RoundFrameLayout) {
                ((RoundFrameLayout) COUIPopupMenuRootView.this.o).setAllowDispatchEvent(true);
            }
            if (COUIPopupMenuRootView.this.w != null) {
                COUIPopupMenuRootView.this.w.e();
            }
            if (COUIPopupMenuRootView.this.f1864n != null) {
                COUIPopupMenuRootView cOUIPopupMenuRootView = COUIPopupMenuRootView.this;
                cOUIPopupMenuRootView.l(cOUIPopupMenuRootView.f1864n, false);
                COUIPopupMenuRootView cOUIPopupMenuRootView2 = COUIPopupMenuRootView.this;
                cOUIPopupMenuRootView2.m(cOUIPopupMenuRootView2.f1864n, false);
                COUIPopupMenuRootView cOUIPopupMenuRootView3 = COUIPopupMenuRootView.this;
                cOUIPopupMenuRootView3.m(cOUIPopupMenuRootView3.o, true);
                COUIPopupMenuRootView.this.configSubMenuHeaderOnClick(this.a);
                COUIPopupMenuRootView.this.f1864n.setOnClickListener(this.a);
            }
        }

        @Override // com.coui.appcompat.poplist.a.InterfaceC0204a
        public void f() {
            if (COUIPopupMenuRootView.this.w != null) {
                COUIPopupMenuRootView.this.w.f();
            }
        }

        @Override // com.coui.appcompat.poplist.a.InterfaceC0204a
        public void g() {
            if (COUIPopupMenuRootView.this.w != null) {
                COUIPopupMenuRootView.this.w.g();
            }
        }

        @Override // com.coui.appcompat.poplist.a.InterfaceC0204a
        public void h() {
            if (COUIPopupMenuRootView.this.w != null) {
                COUIPopupMenuRootView.this.w.h();
            }
        }

        @Override // com.coui.appcompat.poplist.a.InterfaceC0204a
        public void i() {
            COUIPopupMenuRootView.this.i = false;
            if (COUIPopupMenuRootView.this.o instanceof RoundFrameLayout) {
                ((RoundFrameLayout) COUIPopupMenuRootView.this.o).setAllowDispatchEvent(true);
            }
            if (COUIPopupMenuRootView.this.w != null) {
                COUIPopupMenuRootView.this.w.i();
            }
            COUIPopupMenuRootView cOUIPopupMenuRootView = COUIPopupMenuRootView.this;
            cOUIPopupMenuRootView.m(cOUIPopupMenuRootView.f1864n, true);
            COUIPopupMenuRootView.this.configSubMenuHeaderOnClick(null);
            COUIPopupMenuRootView.this.t();
            if (COUIPopupMenuRootView.this.f1862j != null) {
                Runnable runnable = COUIPopupMenuRootView.this.f1862j;
                COUIPopupMenuRootView.this.f1862j = null;
                runnable.run();
            }
        }

        @Override // com.coui.appcompat.poplist.a.InterfaceC0204a
        public void j() {
            if (COUIPopupMenuRootView.this.w != null) {
                COUIPopupMenuRootView.this.w.j();
            }
        }
    }

    public interface b {
        default void a() {
        }

        default void b() {
        }

        default void c() {
        }

        default void d() {
        }

        default void e() {
        }

        default void f() {
        }

        default void g() {
        }

        default void h() {
        }

        default void i() {
        }

        default void j() {
        }
    }

    static {
        A = bj2.LOG_DEBUG || bj2.e("COUIPopupMenuRootView", 3);
    }

    public COUIPopupMenuRootView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void configSubMenuHeaderOnClick(View.OnClickListener onClickListener) {
        this.f1863l = onClickListener;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.i) {
            this.i = false;
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            motionEventObtain.setAction(3);
            super.dispatchTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
            if (motionEvent.getActionMasked() == 0) {
                return super.dispatchTouchEvent(motionEvent);
            }
            MotionEvent motionEventObtain2 = MotionEvent.obtain(motionEvent);
            motionEventObtain2.setAction(0);
            super.dispatchTouchEvent(motionEventObtain2);
            motionEventObtain2.recycle();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void j(ViewGroup viewGroup) {
        ViewGroup viewGroup2 = this.f1864n;
        if (viewGroup2 != null) {
            removeView(viewGroup2);
        }
        if (this.o != null) {
            o(false);
        }
        this.f1864n = viewGroup;
        addView(viewGroup, new ViewGroup.LayoutParams(-2, -2));
        m(this.f1864n, true);
        this.t.c(this.f1864n);
        this.t.d(this);
        this.t.setOnSubMenuStateChangedListener(this.m);
    }

    public void k(ViewGroup viewGroup) {
        ViewGroup viewGroup2 = this.o;
        if (viewGroup2 != null) {
            removeView(viewGroup2);
        }
        this.o = viewGroup;
        viewGroup.setTranslationZ(1.0f);
        addView(this.o, new ViewGroup.LayoutParams(-2, -2));
        m(this.o, true);
        this.t.e(this.o);
        x();
    }

    public final void l(ViewGroup viewGroup, boolean z) {
        if (viewGroup != null) {
            View childAt = viewGroup.getChildAt(0);
            if (childAt instanceof COUITouchListView) {
                ((COUITouchListView) childAt).i(z);
            }
        }
    }

    public final void m(ViewGroup viewGroup, boolean z) {
        if (viewGroup != null) {
            View childAt = viewGroup.getChildAt(0);
            if (childAt instanceof COUITouchListView) {
                ((COUITouchListView) childAt).j(z);
            }
        }
    }

    public void n(boolean z) {
        com.coui.appcompat.poplist.a aVar = this.t;
        if (aVar == null) {
            return;
        }
        if (z) {
            aVar.h();
        } else {
            aVar.i(false);
        }
    }

    public void o(boolean z) {
        ViewGroup viewGroup = this.o;
        if (viewGroup != null) {
            if (!z) {
                this.t.m(false);
                return;
            }
            View childAt = viewGroup.getChildAt(0);
            if (childAt instanceof COUITouchListView) {
                ((COUITouchListView) childAt).smoothScrollToPosition(0);
            }
            this.t.l();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setVisibility(0);
        ViewGroup viewGroup = this.f1864n;
        if (viewGroup == null || this.y == null) {
            return;
        }
        viewGroup.setVisibility(8);
        this.t.f();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        s();
        this.t.n();
        this.f1864n.setFocusable(false);
        this.f1864n.setClickable(false);
        this.f1864n.setOnClickListener(null);
        l(this.f1864n, true);
        m(this.o, false);
        configSubMenuHeaderOnClick(null);
        t();
        this.f1862j = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (A) {
            ViewGroup viewGroup = this.f1864n;
            if (viewGroup != null) {
                viewGroup.setAlpha(0.5f);
            }
            ViewGroup viewGroup2 = this.o;
            if (viewGroup2 != null) {
                viewGroup2.setAlpha(0.5f);
            }
            this.x.setColor(Color.parseColor("#33FF0000"));
            canvas.save();
            this.y.c(this.z);
            canvas.clipOutRect(this.z);
            canvas.drawRect(this.y.a, this.x);
            canvas.restore();
            this.x.setColor(Color.parseColor("#330000FF"));
            canvas.save();
            this.z.set(this.y.b);
            canvas.clipOutRect(this.z);
            this.y.b(this.z);
            canvas.drawRect(this.z, this.x);
            canvas.restore();
            this.x.setColor(Color.parseColor("#3300FF00"));
            this.z.set(this.y.b);
            canvas.drawRect(this.z, this.x);
            this.x.setColor(Color.parseColor("#33FF00FF"));
            this.z.set(this.y.f17071c);
            canvas.drawRect(this.z, this.x);
            this.x.setColor(Color.parseColor("#33FFFF00"));
            this.z.set(this.y.g);
            canvas.drawRect(this.z, this.x);
            this.x.setColor(Color.parseColor("#3300FFFF"));
            this.z.set(this.y.d);
            canvas.drawRect(this.z, this.x);
            this.x.setColor(Color.parseColor("#33000000"));
            this.z.set(this.y.f17072e);
            canvas.drawRect(this.z, this.x);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ViewGroup viewGroup = this.f1864n;
        if (viewGroup != null) {
            Rect rect = this.y.f17071c;
            viewGroup.layout(rect.left, rect.top, rect.right, rect.bottom);
        }
        ViewGroup viewGroup2 = this.o;
        if (viewGroup2 != null) {
            Rect rect2 = this.y.f17072e;
            viewGroup2.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        ViewGroup viewGroup = this.f1864n;
        if (viewGroup != null) {
            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(this.p, 1073741824), View.MeasureSpec.makeMeasureSpec(this.q, 1073741824));
        }
        ViewGroup viewGroup2 = this.o;
        if (viewGroup2 != null) {
            viewGroup2.measure(View.MeasureSpec.makeMeasureSpec(this.r, 1073741824), View.MeasureSpec.makeMeasureSpec(this.s, 1073741824));
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
    }

    public void p(View view) {
        View.OnClickListener onClickListener = this.f1863l;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    public void q(Runnable runnable, long j2) {
        s();
        this.k = runnable;
        if (runnable != null) {
            postDelayed(runnable, j2);
        }
    }

    public void r(Runnable runnable) {
        this.f1862j = runnable;
    }

    public void s() {
        Runnable runnable = this.k;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.k = null;
        }
    }

    public void setDomain(tne tneVar) {
        this.y = tneVar;
        if (COUIResponsiveUtils.isSmallScreen(getContext(), this.y.a.width())) {
            if (this.u == null) {
                this.u = new d(getContext());
            }
            this.t = this.u;
        } else {
            if (this.v == null) {
                this.v = new c();
            }
            this.t = this.v;
        }
        this.t.b(this.y);
        invalidate();
    }

    public void setOnSubMenuStateChangedListener(b bVar) {
        this.w = bVar;
    }

    public void t() {
        ViewGroup viewGroup = this.o;
        if (viewGroup != null) {
            removeView(viewGroup);
            this.o = null;
            this.t.a();
            this.t.e(null);
            this.i = true;
        }
    }

    public void u(int i, int i2) {
        this.p = i;
        this.q = i2;
    }

    public void v(int i, int i2) {
        this.r = i;
        this.s = i2;
    }

    public void w() {
        com.coui.appcompat.poplist.a aVar = this.t;
        if (aVar == null) {
            return;
        }
        aVar.f();
        if (this.o != null) {
            o(true);
        }
    }

    public void x() {
        this.t.j();
    }

    public COUIPopupMenuRootView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public COUIPopupMenuRootView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public COUIPopupMenuRootView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.i = false;
        this.f1862j = null;
        this.k = null;
        this.f1863l = null;
        this.m = new a();
        this.f1864n = null;
        this.o = null;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.x = new Paint(1);
        this.z = new Rect();
        if (A) {
            setWillNotDraw(false);
        }
        setFocusable(false);
        setLayerType(2, null);
    }
}
