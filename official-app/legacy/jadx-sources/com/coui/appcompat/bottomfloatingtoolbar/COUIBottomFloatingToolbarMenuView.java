package com.coui.appcompat.bottomfloatingtoolbar;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import androidx.annotation.NonNull;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.view.ViewCompat;
import com.oplus.aiunit.vision.lh2;
import com.oplus.aiunit.vision.sm9;
import com.oplus.graphics.OplusPathAdapter;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import com.support.appcompat.R$attr;
import com.support.bottomnavigation.R$dimen;
import com.support.bottomnavigation.R$drawable;
import com.support.bottomnavigation.R$id;
import com.support.bottomnavigation.R$string;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes13.dex */
class COUIBottomFloatingToolbarMenuView extends ViewGroup implements sm9 {
    public boolean A;
    public boolean B;
    public List<com.coui.appcompat.bottomfloatingtoolbar.a> C;
    public ArrayList<View> D;
    public String E;
    public Context F;
    public Map<com.coui.appcompat.bottomfloatingtoolbar.a, Integer> G;
    public List<com.coui.appcompat.bottomfloatingtoolbar.a> H;
    public List<com.coui.appcompat.bottomfloatingtoolbar.a> I;
    public float J;
    public int K;
    public ArrayList<View> L;
    public boolean M;
    public boolean N;
    public boolean O;
    public final ArrayList<View> i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList<View> f1559j;
    public final ArrayList<View> k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Path f1560l;
    public final COUIBottomFloatingToolbar.d m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList<View> f1561n;
    public final ArrayList<View> o;
    public final RectF p;
    public final Rect q;
    public final g r;
    public final View.OnClickListener s;
    public h t;
    public c u;
    public int v;
    public int w;
    public COUIBottomFloatingToolbarItemView x;
    public boolean y;
    public boolean z;

    public class a extends ViewOutlineProvider {
        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (Build.VERSION.SDK_INT >= 33) {
                outline.setPath(COUIBottomFloatingToolbarMenuView.this.f1560l);
                return;
            }
            COUIBottomFloatingToolbarMenuView.this.q.left = (int) COUIBottomFloatingToolbarMenuView.this.p.left;
            COUIBottomFloatingToolbarMenuView.this.q.right = (int) COUIBottomFloatingToolbarMenuView.this.p.right;
            COUIBottomFloatingToolbarMenuView.this.q.top = (int) COUIBottomFloatingToolbarMenuView.this.p.top;
            COUIBottomFloatingToolbarMenuView.this.q.bottom = (int) COUIBottomFloatingToolbarMenuView.this.p.bottom;
            outline.setRoundRect(COUIBottomFloatingToolbarMenuView.this.q, COUIBottomFloatingToolbarMenuView.this.J);
        }
    }

    public COUIBottomFloatingToolbarMenuView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SensorsDataInstrumented
    public /* synthetic */ void x(View view) {
        boolean z = view instanceof COUIBottomFloatingToolbarItemView;
        SensorsDataAutoTrackHelper.trackViewOnClick(view);
    }

    public void A(int i, int i2) {
        c cVar = this.u;
        if (cVar != null) {
            cVar.M(i, i2);
        }
    }

    public void B(COUIBottomFloatingToolbar.c cVar) {
    }

    public void C(Runnable runnable) {
        c cVar = this.u;
        if (cVar != null) {
            cVar.U(runnable);
        } else {
            runnable.run();
        }
    }

    public void D(ArrayList<View> arrayList) {
        this.o.clear();
        this.o.addAll(arrayList);
        requestLayout();
    }

    public void E(List<com.coui.appcompat.bottomfloatingtoolbar.a> list) {
        Objects.requireNonNull(list);
        for (com.coui.appcompat.bottomfloatingtoolbar.a aVar : list) {
            View viewJ = j(aVar);
            if (viewJ == null) {
                return;
            }
            this.C.add(aVar);
            this.D.add(viewJ);
            this.v = aVar.d();
        }
        D(this.D);
        COUIBottomFloatingToolbarItemView cOUIBottomFloatingToolbarItemView = this.x;
        if (cOUIBottomFloatingToolbarItemView != null) {
            cOUIBottomFloatingToolbarItemView.setGroupId(this.v);
        }
    }

    public void F(Runnable runnable) {
        c cVar = this.u;
        if (cVar != null) {
            cVar.Y(runnable);
        } else {
            runnable.run();
        }
    }

    public final void G(boolean z) {
        this.N = z;
        i();
    }

    public void H(boolean z) {
        this.M = z;
    }

    public void I(boolean z) {
        this.O = z;
        invalidate();
    }

    public final void J(View view) {
        if (this.L == null) {
            this.L = new ArrayList<>();
        }
        if (this.L.contains(view)) {
            return;
        }
        this.L.add(view);
        startViewTransition(view);
    }

    public void K() {
        c cVar = this.u;
        if (cVar != null) {
            cVar.b0();
        }
    }

    public final void L() {
        this.p.setEmpty();
        List<View> listO = o();
        View childAt = v() ? getChildAt(getChildCount() - 1) : getChildAt(0);
        View childAt2 = v() ? getChildAt(0) : getChildAt(getChildCount() - 1);
        if (!listO.isEmpty()) {
            childAt = v() ? listO.get(listO.size() - 1) : listO.get(0);
            childAt2 = listO.get(v() ? 0 : listO.size() - 1);
        }
        if (childAt == null) {
            return;
        }
        this.p.top = getPaddingTop();
        this.p.bottom = getHeight() - getPaddingBottom();
        this.p.left = childAt.getX() + ((childAt.getMeasuredWidth() * Math.max(0.0f, 1.0f - childAt.getScaleX())) / 2.0f);
        float measuredWidth = (childAt2.getMeasuredWidth() * (1.0f - childAt2.getScaleX())) / 2.0f;
        if (childAt2.getScaleX() <= 0.0f) {
            this.p.right = childAt2.getX() + measuredWidth;
        } else {
            this.p.right = (childAt2.getX() + childAt2.getMeasuredWidth()) - measuredWidth;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup instanceof COUIBottomFloatingToolbar) {
            if ((t() || u()) && ((COUIBottomFloatingToolbar) viewGroup).U(this)) {
                this.t.v().right = viewGroup.getWidth() - viewGroup.getPaddingRight();
                this.t.v().left = this.t.v().right - this.p.right;
                setX(this.t.v().left);
            }
            if ((t() || u()) && ((COUIBottomFloatingToolbar) viewGroup).S(this)) {
                this.t.v().left = ((viewGroup.getWidth() / 2.0f) - (this.p.width() / 2.0f)) - this.p.left;
                this.t.v().right = this.t.v().left + this.t.y().width();
                setX(this.t.v().left);
            }
            if ((t() || u()) && ((COUIBottomFloatingToolbar) viewGroup).T(this)) {
                this.t.v().left = viewGroup.getPaddingLeft() - this.p.left;
                this.t.v().right = this.t.v().left + this.p.width();
                setX(this.t.v().left);
            }
        }
    }

    public final void M() {
        this.J = getHeight() / 2.0f;
        this.f1560l.reset();
        if (this.m.b() == 1) {
            OplusPathAdapter oplusPathAdapterA = this.m.a();
            RectF rectF = this.p;
            float f = this.J;
            oplusPathAdapterA.addSmoothRoundRect(rectF, f, f, Path.Direction.CCW);
        } else {
            Path path = this.f1560l;
            RectF rectF2 = this.p;
            float f2 = this.J;
            path.addRoundRect(rectF2, f2, f2, Path.Direction.CCW);
        }
        invalidateOutline();
    }

    @Override // com.oplus.aiunit.vision.sm9
    public void a(boolean z, boolean z2) {
        n();
        this.t.a(z, z2);
    }

    @Override // com.oplus.aiunit.vision.sm9
    public void b() {
        n();
        this.t.b();
    }

    @Override // com.oplus.aiunit.vision.sm9
    public void c(int i, int i2, int i3, int i4, boolean z) {
        n();
        this.t.c(i, i2, i3, i4, z);
    }

    public final void i() {
        if (this.N) {
            this.r.a(this);
        } else {
            setBackgroundColor(lh2.a(this.F, R$attr.couiColorBar));
        }
    }

    public final View j(com.coui.appcompat.bottomfloatingtoolbar.a aVar) {
        if (aVar.h() != null) {
            return aVar.h();
        }
        COUIBottomFloatingToolbarItemView cOUIBottomFloatingToolbarItemView = new COUIBottomFloatingToolbarItemView(this.F);
        cOUIBottomFloatingToolbarItemView.setOnClickListener(this.s);
        cOUIBottomFloatingToolbarItemView.a(aVar);
        return cOUIBottomFloatingToolbarItemView;
    }

    public final void k() {
        this.x = new COUIBottomFloatingToolbarItemView(this.F);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R$dimen.coui_floating_toolbar_item_height);
        this.x.setLayoutParams(new ViewGroup.LayoutParams(dimensionPixelSize, dimensionPixelSize));
        this.x.setId(R$id.floating_toolbar_group_more);
        this.x.setIcon(AppCompatResources.getDrawable(this.F, R$drawable.coui_floating_toolbar_more));
        this.x.setTitle(this.E);
        this.x.setOnClickListener(this.s);
    }

    public void l(View view) {
        if (this.L == null) {
            this.L = new ArrayList<>();
        }
        this.L.remove(view);
        endViewTransition(view);
    }

    public void m() {
        if (this.u == null) {
            this.u = new c(this);
        }
    }

    public final void n() {
        if (this.t == null) {
            this.t = new h(this);
        }
    }

    public List<View> o() {
        c cVar = this.u;
        if (cVar == null) {
            return this.k;
        }
        List<View> listC = cVar.C();
        return listC.isEmpty() ? this.k : listC;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        c cVar = this.u;
        if (cVar != null) {
            cVar.v();
        }
        h hVar = this.t;
        if (hVar != null) {
            hVar.r();
        }
        this.y = false;
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);
        K();
        L();
        M();
        if (this.N && this.O) {
            g gVar = this.r;
            RectF rectF = this.p;
            gVar.d(canvas, rectF, this.f1560l, rectF.left, getPaddingTop());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        if (this.z) {
            if (this.f1559j.size() == this.k.size()) {
                int i5 = 0;
                while (true) {
                    if (i5 < this.f1559j.size()) {
                        if (this.f1559j.get(i5) == this.k.get(i5)) {
                            i5++;
                        }
                    }
                }
            } else {
                z2 = !this.k.isEmpty();
            }
            this.B = true;
            if (r() || this.f1559j.size() != this.i.size()) {
                this.B = false;
            } else {
                for (int i6 = 0; i6 < this.f1559j.size(); i6++) {
                    if (this.f1559j.get(i6) != this.i.get(i6)) {
                        this.B = false;
                        break;
                    }
                }
            }
            this.A = (z2 | this.B) & this.M;
        }
        if (this.A) {
            for (int i7 = 0; i7 < this.f1561n.size(); i7++) {
                J(this.f1561n.get(i7));
            }
        }
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            if (!this.f1559j.contains(getChildAt(i8)) && this.A) {
                J(getChildAt(i8));
            }
        }
        if (this.f1559j.size() != 1 || (this.f1559j.get(0) instanceof COUIBottomFloatingToolbarItemView)) {
            removeAllViewsInLayout();
            for (int i9 = 0; i9 < this.f1559j.size(); i9++) {
                if (this.f1559j.get(i9).getParent() != null) {
                    ((ViewGroup) this.f1559j.get(i9).getParent()).removeView(this.f1559j.get(i9));
                }
                addView(this.f1559j.get(i9), getChildCount());
                this.f1559j.get(i9).setScaleY(1.0f);
                this.f1559j.get(i9).setScaleX(1.0f);
                this.f1559j.get(i9).setAlpha(1.0f);
                this.f1559j.get(i9).setTranslationX(0.0f);
            }
        } else if (getChildCount() == 0) {
            if (this.f1559j.get(0).getParent() != null) {
                ((ViewGroup) this.f1559j.get(0).getParent()).removeView(this.f1559j.get(0));
            }
            addView(this.f1559j.get(0), getChildCount());
        }
        if (this.A) {
            m();
            this.u.X(this.f1559j);
        } else {
            c cVar = this.u;
            if (cVar != null && cVar.H()) {
                this.u.a0();
            }
            this.k.clear();
            this.k.addAll(this.f1559j);
            this.i.clear();
            this.i.addAll(this.f1559j);
        }
        z(i, i2, i3, i4);
        A(this.K, getMeasuredWidth());
        this.K = getMeasuredWidth();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        View view;
        for (int size = this.L.size() - 1; size >= 0; size--) {
            l(this.L.get(size));
        }
        int size2 = (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight();
        this.f1559j.clear();
        this.f1561n.clear();
        measureChild(this.x, i, i2);
        int measuredWidth = this.x.getMeasuredWidth();
        int size3 = this.o.size() - 1;
        while (true) {
            if (size3 < 0) {
                view = null;
                break;
            }
            view = this.o.get(size3);
            if (view.getVisibility() != 8) {
                break;
            } else {
                size3--;
            }
        }
        boolean z = false;
        int iMax = 0;
        for (int i3 = 0; i3 < this.o.size(); i3++) {
            View view2 = this.o.get(i3);
            int i4 = this.f1559j.isEmpty() ? 0 : this.w;
            if (view2.getVisibility() != 8) {
                boolean z2 = view2 instanceof COUIBottomFloatingToolbarItemView;
                if (!z2) {
                    this.f1559j.clear();
                    this.f1561n.clear();
                }
                if (!z) {
                    if (view2.getLayoutParams() == null) {
                        view2.setLayoutParams(generateDefaultLayoutParams());
                    }
                    measureChild(view2, i, i2);
                    iMax = Math.max(iMax, view2.getMeasuredHeight());
                    if (view2 != view && view2.getMeasuredWidth() + this.w + i4 + measuredWidth <= size2 && this.f1559j.size() < 6) {
                        size2 -= view2.getMeasuredWidth() + i4;
                        this.f1559j.add(view2);
                        l(view2);
                    } else if (view2 != view || view2.getMeasuredWidth() + i4 > size2) {
                        measureChild(this.x, i, i2);
                        size2 -= this.x.getMeasuredWidth() + i4;
                        this.f1559j.add(this.x);
                        this.f1561n.add(view2);
                        z = true;
                    } else {
                        size2 -= view2.getMeasuredWidth() + i4;
                        this.f1559j.add(view2);
                        l(view2);
                    }
                    if (!z2) {
                        break;
                    }
                } else {
                    this.f1561n.add(view2);
                }
            }
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i) - size2, iMax);
    }

    public RectF p() {
        return this.p;
    }

    public List<View> q() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f1559j);
        arrayList.addAll(this.f1561n);
        return arrayList;
    }

    public final boolean r() {
        c cVar = this.u;
        return cVar == null || cVar.D() == 0;
    }

    public final boolean s() {
        c cVar = this.u;
        return cVar != null && cVar.D() == 1;
    }

    public final boolean t() {
        return this.t.x() && (s() || w());
    }

    public final boolean u() {
        return !this.t.x() && s();
    }

    public boolean v() {
        return ViewCompat.getLayoutDirection(this) == 1;
    }

    public final boolean w() {
        c cVar = this.u;
        return cVar != null && cVar.D() == 2;
    }

    public final int y(View view, int i, int i2, float f) {
        int iMax = Math.max(getPaddingTop(), getPaddingTop() + ((i2 - view.getMeasuredHeight()) / 2));
        view.layout(i, iMax, view.getMeasuredWidth() + i, view.getMeasuredHeight() + iMax);
        return (int) (i + view.getMeasuredWidth() + f);
    }

    public final void z(int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft();
        int i5 = v() ? -1 : 1;
        float f = this.w;
        for (int size = v() ? this.f1559j.size() - 1 : 0; size >= 0 && size < this.f1559j.size(); size += i5) {
            paddingLeft = y(this.f1559j.get(size), paddingLeft, ((i4 - i2) - getPaddingTop()) - getPaddingBottom(), f);
        }
    }

    public COUIBottomFloatingToolbarMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public COUIBottomFloatingToolbarMenuView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public COUIBottomFloatingToolbarMenuView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.i = new ArrayList<>();
        this.f1559j = new ArrayList<>();
        this.k = new ArrayList<>();
        Path path = new Path();
        this.f1560l = path;
        this.f1561n = new ArrayList<>();
        this.o = new ArrayList<>();
        this.p = new RectF();
        this.q = new Rect();
        this.s = new View.OnClickListener() { // from class: com.coui.appcompat.bottomfloatingtoolbar.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.i.x(view);
            }
        };
        this.t = null;
        this.u = null;
        this.v = -1;
        this.y = true;
        this.C = new ArrayList();
        this.D = new ArrayList<>();
        this.E = getResources().getString(R$string.floating_toolbar_item_more);
        this.G = new LinkedHashMap();
        this.H = new ArrayList();
        this.I = new ArrayList();
        this.K = 0;
        this.L = new ArrayList<>();
        this.O = true;
        this.F = context;
        this.r = new g(context);
        this.w = getResources().getDimensionPixelSize(R$dimen.coui_floating_toolbar_item_view_space);
        setOutlineProvider(new a());
        setClipToOutline(true);
        this.m = new COUIBottomFloatingToolbar.d(path);
        setWillNotDraw(false);
        setClipChildren(false);
        setClipToPadding(false);
        k();
    }

    public COUIBottomFloatingToolbarMenuView(Context context, boolean z) {
        this(context);
        G(z);
    }
}
