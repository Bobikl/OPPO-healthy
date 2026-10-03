package com.coui.appcompat.poplist;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.AbsListView;
import androidx.annotation.NonNull;
import androidx.dynamicanimation.animation.FloatValueHolder;
import com.coui.appcompat.animation.dynamicanimation.COUIDynamicAnimation;
import com.coui.appcompat.list.COUIForegroundListView;
import com.oplus.aiunit.vision.bj2;
import com.oplus.aiunit.vision.ej2;
import com.oplus.aiunit.vision.o35;
import com.oplus.aiunit.vision.uk2;
import com.oplus.aiunit.vision.we2;
import com.support.poplist.R$dimen;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class COUITouchListView extends COUIForegroundListView implements uk2.c {
    public static final int ACTION_IS_FROM_TOUCH_LISTVIEW = -1;
    public static final boolean I;
    public View A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public b G;
    public boolean H;
    public int r;
    public Rect s;
    public Rect t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public List<Integer> y;
    public uk2 z;

    public class a implements AbsListView.OnScrollListener {
        public a() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            if (COUITouchListView.this.y != null) {
                int iIntValue = ((Integer) COUITouchListView.this.y.get(i)).intValue();
                View childAt = absListView.getChildAt(0);
                if (childAt != null) {
                    iIntValue = (iIntValue - childAt.getHeight()) - childAt.getTop();
                }
                COUITouchListView.this.C = iIntValue;
            }
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i) {
            COUITouchListView.this.G.i(i);
        }
    }

    static {
        I = bj2.LOG_DEBUG || bj2.e("COUITouchListView", 3);
    }

    public COUITouchListView(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public boolean awakenScrollBars() {
        uk2 uk2Var = this.z;
        return uk2Var != null ? uk2Var.d(2000L) : super.awakenScrollBars();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        uk2 uk2Var = this.z;
        if (uk2Var != null) {
            uk2Var.e(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.u) {
            return super.dispatchHoverEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        View childAt;
        if (!this.u) {
            return false;
        }
        if (!this.v && motionEvent.getActionMasked() == 2) {
            return true;
        }
        if (canScrollVertically(1) || canScrollVertically(-1)) {
            this.x = false;
        } else {
            this.x = true;
        }
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (I) {
            Log.d("COUITouchListView", "dispatchTouchEvent actionMasked:" + MotionEvent.actionToString(actionMasked) + ",actionIndex:" + actionIndex + ",getPointerCount:" + motionEvent.getPointerCount());
        }
        if (actionMasked == 0) {
            this.D = y;
            this.H = we2.c(getContext());
            int iPointToPosition = pointToPosition(x, y);
            this.r = iPointToPosition;
            View childAt2 = getChildAt(iPointToPosition - getFirstVisiblePosition());
            this.A = childAt2;
            if (k(childAt2)) {
                this.G.g();
                ((ej2) this.A.getBackground()).a();
            }
        } else if (actionMasked == 1) {
            int i = this.r;
            if ((i != -1 && !this.H) || this.E == 0) {
                View childAt3 = getChildAt(i - getFirstVisiblePosition());
                if (childAt3 != null) {
                    bj2.a("COUITouchListView", "target = " + childAt3 + " lastTouchTarget = " + this.r + " item id at position = " + this.r);
                    int i2 = this.r;
                    performItemClick(childAt3, i2, getItemIdAtPosition(i2));
                    n(childAt3, motionEvent, 1);
                }
                this.G.f(true, 0);
                this.r = -1;
                this.E = actionMasked;
                return false;
            }
            this.G.f(true, 0);
            this.r = -1;
        } else if (actionMasked == 2) {
            if (this.r != -1 && !this.x && Math.abs(y - this.D) > ViewConfiguration.get(getContext()).getScaledTouchSlop() && k(this.A)) {
                ((ej2) this.A.getBackground()).f();
                this.G.f(true, 0);
                this.r = -1;
            }
            int iPointToPosition2 = pointToPosition(x, y);
            if (iPointToPosition2 == -1 || motionEvent.getPointerCount() > 1 || this.H) {
                this.E = actionMasked;
                return l(motionEvent, 0);
            }
            if (iPointToPosition2 != this.r && o35.t(iPointToPosition2) && this.x && (childAt = getChildAt(iPointToPosition2 - getFirstVisiblePosition())) != null) {
                l(motionEvent, k(childAt) ? iPointToPosition2 - this.r : 0);
                if (k(childAt)) {
                    n(childAt, motionEvent, 0);
                    ((ej2) childAt.getBackground()).t();
                    o();
                    this.r = iPointToPosition2;
                    this.G.g();
                }
            }
        } else if (actionMasked == 3) {
            l(motionEvent, 0);
        } else if (actionMasked == 5) {
            this.E = actionMasked;
            return l(motionEvent, 0);
        }
        this.E = actionMasked;
        return super.dispatchTouchEvent(motionEvent);
    }

    public uk2 getCOUIScrollDelegate() {
        return this.z;
    }

    @Override // com.oplus.aiunit.vision.uk2.c
    public View getCOUIScrollableView() {
        return this;
    }

    public void i(boolean z) {
        this.u = z;
    }

    public void j(boolean z) {
        this.v = z;
    }

    public final boolean k(View view) {
        return view != null && (view.getBackground() instanceof ej2) && view.isEnabled();
    }

    public final boolean l(MotionEvent motionEvent, int i) {
        View childAt = getChildAt(this.r - getFirstVisiblePosition());
        if (k(childAt)) {
            n(childAt, motionEvent, 3);
            ((ej2) childAt.getBackground()).u();
            this.G.f(true, i);
        }
        this.r = -1;
        return true;
    }

    public final void m() {
        this.z = new uk2.b(this).d(this.F).c(this.F).a();
    }

    public final void n(View view, MotionEvent motionEvent, int i) {
        this.s = new Rect();
        this.t = new Rect();
        getChildVisibleRect(view, this.s, null);
        getLocalVisibleRect(this.t);
        Rect rect = this.s;
        int i2 = rect.left;
        Rect rect2 = this.t;
        int i3 = i2 - rect2.left;
        int i4 = rect.top - rect2.top;
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.setSource(-1);
        motionEventObtain.setLocation(x - i3, y - i4);
        motionEventObtain.setAction(i);
        view.dispatchTouchEvent(motionEventObtain);
    }

    public final void o() {
        if (this.w) {
            performHapticFeedback(302);
        }
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        uk2 uk2Var = this.z;
        if (uk2Var != null) {
            uk2Var.h();
        } else {
            m();
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        uk2 uk2Var = this.z;
        if (uk2Var != null) {
            uk2Var.q();
            this.z = null;
        }
        this.G.j();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        uk2 uk2Var = this.z;
        if (uk2Var != null && uk2Var.j(motionEvent)) {
            return true;
        }
        if (this.x) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        uk2 uk2Var = this.z;
        if (uk2Var == null || !uk2Var.l(motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NonNull View view, int i) {
        super.onVisibilityChanged(view, i);
        uk2 uk2Var = this.z;
        if (uk2Var != null) {
            uk2Var.n(view, i);
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        uk2 uk2Var = this.z;
        if (uk2Var != null) {
            uk2Var.o(i);
        }
    }

    public void p(List<Integer> list, int i) {
        this.y = list;
        this.B = i;
    }

    public void setForceStopDividerAnimation(boolean z) {
        this.G.d = z;
    }

    public void setIsNeedVibrate(boolean z) {
        this.w = z;
    }

    public void setNewCOUIScrollDelegate(uk2 uk2Var) {
        if (uk2Var == null) {
            throw new IllegalArgumentException("setNewFastScrollDelegate must NOT be NULL.");
        }
        this.z = uk2Var;
        uk2Var.h();
    }

    @Override // com.oplus.aiunit.vision.uk2.c
    public int superComputeVerticalScrollExtent() {
        return getHeight();
    }

    @Override // com.oplus.aiunit.vision.uk2.c
    public int superComputeVerticalScrollOffset() {
        return this.C;
    }

    @Override // com.oplus.aiunit.vision.uk2.c
    public int superComputeVerticalScrollRange() {
        return this.B;
    }

    @Override // com.oplus.aiunit.vision.uk2.c
    public void superOnTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
    }

    public COUITouchListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public COUITouchListView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public COUITouchListView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.u = true;
        this.v = true;
        this.w = true;
        this.x = true;
        this.B = 0;
        this.C = 0;
        this.E = -1;
        setVerticalFadingEdgeEnabled(true);
        setFadingEdgeLength(context.getResources().getDimensionPixelOffset(R$dimen.coui_popup_list_window_fade_edge_length));
        this.F = context.getResources().getDimensionPixelOffset(R$dimen.coui_popup_list_window_scrollbar_vertical_padding);
        this.G = new b(this, null);
        setOnScrollListener(new a());
        m();
        setDefaultFocusHighlightEnabled(false);
    }

    public class b {
        public int a;
        public Map<View, com.coui.appcompat.animation.dynamicanimation.b> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f1867c;
        public boolean d;

        public class a implements COUIDynamicAnimation.r {
            public final /* synthetic */ View a;

            public a(View view) {
                this.a = view;
            }

            @Override // com.coui.appcompat.animation.dynamicanimation.COUIDynamicAnimation.r
            public void onAnimationUpdate(COUIDynamicAnimation cOUIDynamicAnimation, float f, float f2) {
                this.a.setAlpha(f);
            }
        }

        public b() {
            this.a = 0;
            this.b = new HashMap();
            this.f1867c = false;
            this.d = false;
        }

        public final void f(boolean z, int i) {
            if (COUITouchListView.this.r == -1) {
                return;
            }
            COUITouchListView cOUITouchListView = COUITouchListView.this;
            if (COUITouchListView.this.k(cOUITouchListView.getChildAt(cOUITouchListView.r - COUITouchListView.this.getFirstVisiblePosition()))) {
                float f = z ? 1.0f : 0.0f;
                if (COUITouchListView.this.r > 0 && (!z || i != -2)) {
                    l((COUITouchListView.this.r - 1) - COUITouchListView.this.getFirstVisiblePosition(), f);
                }
                if (COUITouchListView.this.r < COUITouchListView.this.getCount() - 1) {
                    if (z && i == 2) {
                        return;
                    }
                    l((COUITouchListView.this.r + 1) - COUITouchListView.this.getFirstVisiblePosition(), f);
                }
            }
        }

        public final void g() {
            f(false, 0);
        }

        public final com.coui.appcompat.animation.dynamicanimation.b h(View view) {
            com.coui.appcompat.animation.dynamicanimation.b bVar = this.b.get(view);
            if (bVar != null) {
                return bVar;
            }
            com.coui.appcompat.animation.dynamicanimation.b bVar2 = new com.coui.appcompat.animation.dynamicanimation.b(new FloatValueHolder());
            com.coui.appcompat.animation.dynamicanimation.c cVar = new com.coui.appcompat.animation.dynamicanimation.c();
            cVar.i(0.0f);
            cVar.l(0.25f);
            bVar2.E(cVar);
            bVar2.p(0.002f);
            bVar2.b(new a(view));
            bVar2.r(1.0f);
            this.b.put(view, bVar2);
            return bVar2;
        }

        public final void i(int i) {
            if (this.a != i) {
                if ((i == 1 || i == 2) && !COUITouchListView.this.x) {
                    k();
                    this.f1867c = true;
                } else {
                    this.f1867c = false;
                }
                this.a = i;
            }
        }

        public final void j() {
            Iterator<Map.Entry<View, com.coui.appcompat.animation.dynamicanimation.b>> it = this.b.entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().c();
                it.remove();
            }
        }

        public final void k() {
            for (Map.Entry<View, com.coui.appcompat.animation.dynamicanimation.b> entry : this.b.entrySet()) {
                com.coui.appcompat.animation.dynamicanimation.b value = entry.getValue();
                if (value.i()) {
                    value.z();
                    entry.getKey().setAlpha(1.0f);
                }
            }
        }

        public final void l(int i, float f) {
            View childAt = COUITouchListView.this.getChildAt(i);
            if (childAt == null || this.f1867c || this.d || childAt.getAlpha() == f) {
                return;
            }
            int firstVisiblePosition = COUITouchListView.this.getFirstVisiblePosition() + i;
            if (firstVisiblePosition >= 0 && firstVisiblePosition < COUITouchListView.this.getAdapter().getCount()) {
                if (COUITouchListView.this.getAdapter().getItemViewType(firstVisiblePosition) == 2) {
                    return;
                }
                h(childAt).x(f);
                return;
            }
            Log.e("COUITouchListView", "startDividerAnimation adapterPosition in error range！,getAdapter().getCount():" + COUITouchListView.this.getAdapter().getCount() + ",position:" + i + ",getFirstVisiblePosition():" + COUITouchListView.this.getFirstVisiblePosition());
        }

        public /* synthetic */ b(COUITouchListView cOUITouchListView, a aVar) {
            this();
        }
    }
}
