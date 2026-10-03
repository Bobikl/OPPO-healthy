package com.coui.appcompat.poplist;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.ViewCompat;
import com.coui.appcompat.uiutil.AnimLevel;
import com.oplus.aiunit.vision.bj2;
import com.oplus.aiunit.vision.c56;
import com.oplus.aiunit.vision.gza;
import com.oplus.aiunit.vision.hm2;
import com.oplus.aiunit.vision.o35;
import com.oplus.aiunit.vision.qne;
import com.oplus.aiunit.vision.vne;
import com.oplus.aiunit.vision.xr9;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import com.support.poplist.R$attr;
import com.support.poplist.R$dimen;
import com.support.poplist.R$drawable;
import com.support.poplist.R$id;
import com.support.poplist.R$layout;
import com.support.poplist.R$style;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class b extends COUIPopupWindow {
    public static final int GROUP_MIN_ITEMS = 3;
    public static final boolean U;
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public PopupWindow.OnDismissListener Q;
    public boolean R;
    public boolean S;
    public boolean T;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final View.OnLayoutChangeListener f1875e;
    public final AdapterView.OnItemClickListener f;
    public final AdapterView.OnItemClickListener g;
    public final Runnable h;
    public Context i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public o35 f1876j;
    public o35 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List<qne> f1877l;
    public View m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public View f1878n;
    public View o;
    public RoundFrameLayout p;
    public RoundFrameLayout q;
    public ListView r;
    public ListView s;
    public ListView t;
    public COUIPopupMenuRootView u;
    public vne v;
    public AdapterView.OnItemClickListener w;
    public AdapterView.OnItemClickListener x;
    public int y;
    public int z;

    public class a implements View.OnLayoutChangeListener {
        public a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            boolean z = (i == i5 && i2 == i6 && i3 == i7 && i4 == i8) ? false : true;
            bj2.a("COUIPopupListWindow", "PopupWindow anchor layout changed! left:" + i + ",top:" + i2 + ",right:" + i3 + ",bottom:" + i4 + ",oldLeft:" + i5 + ",oldTop:" + i6 + ",oldRight:" + i7 + ",oldBottom:" + i8 + ",layoutChange:" + z);
            if (z) {
                if (b.this.J || (b.this.K && b.this.v.x(b.this.m, b.this.G, b.this.H, b.this.f1878n))) {
                    b.this.dismiss();
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.coui.appcompat.poplist.b$b, reason: collision with other inner class name */
    public class C0205b implements AdapterView.OnItemClickListener {
        public C0205b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(View view, int i) {
            b.this.C0(view, i);
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        @SensorsDataInstrumented
        public void onItemClick(AdapterView<?> adapterView, final View view, int i, long j2) {
            if (!o35.t(i)) {
                SensorsDataAutoTrackHelper.trackListView(adapterView, view, i);
                return;
            }
            final int iZ = o35.z(i);
            if (b.this.w != null) {
                b.this.w.onItemClick(adapterView, view, iZ, j2);
            }
            if (b.this.q.getParent() == null || b.this.I == iZ) {
                b.this.C0(view, iZ);
            } else {
                b.this.u.o(false);
                b.this.u.r(new Runnable() { // from class: com.oplus.aiunit.vision.yj2
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.i.b(view, iZ);
                    }
                });
            }
            SensorsDataAutoTrackHelper.trackListView(adapterView, view, i);
        }
    }

    public class c implements AdapterView.OnItemClickListener {
        public c() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        @SensorsDataInstrumented
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j2) {
            int iZ = o35.z(i);
            if (b.this.v.K()) {
                iZ--;
            }
            int i2 = iZ;
            if (i2 < 0) {
                b.this.u.p(view);
                SensorsDataAutoTrackHelper.trackListView(adapterView, view, i);
            } else {
                if (b.this.x != null) {
                    b.this.x.onItemClick(adapterView, view, i2, j2);
                }
                SensorsDataAutoTrackHelper.trackListView(adapterView, view, i);
            }
        }
    }

    public class d implements COUIPopupMenuRootView.b {
        public d() {
        }

        @Override // com.coui.appcompat.poplist.COUIPopupMenuRootView.b
        public void a() {
            k(b.this.s);
        }

        @Override // com.coui.appcompat.poplist.COUIPopupMenuRootView.b
        public void b() {
            b.this.O = false;
            b.this.o = null;
            try {
                b.super.dismiss();
            } catch (IllegalArgumentException e2) {
                bj2.g("COUIPopupListWindow", "Failed to dismiss popup window, view may be detached: " + e2.getMessage());
            }
        }

        @Override // com.coui.appcompat.poplist.COUIPopupMenuRootView.b
        public void c() {
            b.this.s0(false);
            l(b.this.r, true);
        }

        @Override // com.coui.appcompat.poplist.COUIPopupMenuRootView.b
        public void d() {
            b.this.O = false;
            b.this.o = null;
            b bVar = b.this;
            bVar.h0(false, bVar.m);
            b.this.y = 0;
            b.this.z = 0;
            try {
                b.super.dismiss();
            } catch (IllegalArgumentException e2) {
                bj2.g("COUIPopupListWindow", "Failed to dismiss popup window, view may be detached: " + e2.getMessage());
            }
        }

        @Override // com.coui.appcompat.poplist.COUIPopupMenuRootView.b
        public void e() {
            b.this.s0(true);
            l(b.this.r, false);
        }

        @Override // com.coui.appcompat.poplist.COUIPopupMenuRootView.b
        public void f() {
            b.this.O = true;
        }

        @Override // com.coui.appcompat.poplist.COUIPopupMenuRootView.b
        public void g() {
            k(b.this.r);
        }

        @Override // com.coui.appcompat.poplist.COUIPopupMenuRootView.b
        public void h() {
            b.this.s0(false);
        }

        @Override // com.coui.appcompat.poplist.COUIPopupMenuRootView.b
        public void i() {
            if (b.this.o != null) {
                if (b.this.s != null && b.this.s.getChildAt(0) != null) {
                    b.this.s.getChildAt(0).setBackground(null);
                }
                b.this.o = null;
            }
        }

        @Override // com.coui.appcompat.poplist.COUIPopupMenuRootView.b
        public void j() {
            boolean z;
            b.this.O = false;
            boolean z2 = true;
            if (b.this.R) {
                b.this.setTouchable(true);
                b.this.R = false;
                z = true;
            } else {
                z = false;
            }
            if (b.this.S) {
                b.this.setFocusable(true);
                b.this.R = false;
            } else {
                z2 = z;
            }
            if (z2) {
                b.this.update();
            }
        }

        public final void k(ViewGroup viewGroup) {
            View childAt = viewGroup.getChildAt(0);
            if (childAt != null) {
                childAt.performAccessibilityAction(64, null);
            }
        }

        public final void l(ListView listView, boolean z) {
            if (listView != null) {
                listView.setFocusable(false);
                for (int i = 0; i < listView.getChildCount(); i++) {
                    listView.getChildAt(i).setFocusable(z);
                }
            }
        }
    }

    public final class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.S();
        }

        public /* synthetic */ e(b bVar, a aVar) {
            this();
        }
    }

    static {
        U = bj2.LOG_DEBUG || bj2.e("COUIPopupListWindow", 3);
    }

    public b(Context context) {
        super(context);
        this.f1875e = new a();
        this.f = new C0205b();
        this.g = new c();
        this.h = new e(this, null);
        this.f1878n = null;
        this.o = null;
        this.C = 0;
        this.D = 0;
        this.E = -1;
        this.F = -1;
        this.G = Integer.MIN_VALUE;
        this.H = Integer.MIN_VALUE;
        this.I = -1;
        this.J = false;
        this.K = true;
        this.L = false;
        this.M = false;
        this.N = false;
        this.O = false;
        this.P = true;
        this.R = false;
        this.S = false;
        this.T = false;
        this.i = context;
        setClippingEnabled(false);
        setTouchModal(false);
        setFocusable(true);
        setOutsideTouchable(true);
        i(true);
        setExitTransition(null);
        setEnterTransition(null);
        setAnimationStyle(R$style.Animation_COUI_PopupListWindow);
        ListView listView = new ListView(context);
        this.t = listView;
        listView.setDivider(null);
        this.t.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f1877l = new ArrayList();
        COUIPopupMenuRootView cOUIPopupMenuRootViewR = R();
        this.u = cOUIPopupMenuRootViewR;
        setContentView(cOUIPopupMenuRootViewR);
        this.v = new vne(this.i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SensorsDataInstrumented
    public /* synthetic */ void X(View view) {
        dismiss();
        SensorsDataAutoTrackHelper.trackViewOnClick(view);
    }

    public static /* synthetic */ int Y(qne qneVar, qne qneVar2) {
        return qneVar.h() - qneVar2.h();
    }

    public final void A0() {
        int iF = this.v.F();
        int iE = this.v.E();
        if (iF == this.y && iE == this.z) {
            return;
        }
        this.y = iF;
        this.z = iE;
        this.u.u(iF, iE);
    }

    public final void B0() {
        int iJ = this.v.J();
        int I = this.v.I();
        if (iJ == this.A && I == this.B) {
            return;
        }
        this.A = iJ;
        this.B = I;
        this.u.v(iJ, I);
    }

    public final void C0(View view, int i) {
        qne qneVar;
        this.I = i;
        if (this.f1877l.isEmpty() || this.f1877l.size() <= i || (qneVar = this.f1877l.get(i)) == null || !qneVar.y() || !O(qneVar.r()) || !N(qneVar.r())) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (this.v.K()) {
            arrayList.add(qneVar);
        }
        this.v.Q(i == 0);
        arrayList.addAll(qneVar.r());
        if (this.k == null) {
            this.k = new o35(this.i, null);
        }
        p0(arrayList, this.k, false);
        if (view.getBackground() instanceof gza) {
            this.k.K((gza) view.getBackground());
        }
        this.o = view;
        y0(view, i);
    }

    public final void M() {
        COUIPopupMenuRootView cOUIPopupMenuRootView = this.u;
        if (cOUIPopupMenuRootView != null) {
            cOUIPopupMenuRootView.s();
        }
    }

    public final boolean N(List<?> list) {
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                return false;
            }
        }
        return true;
    }

    public final boolean O(List<?> list) {
        return (list == null || list.isEmpty()) ? false : true;
    }

    public final void P() {
        this.I = -1;
        this.r.setAdapter((ListAdapter) this.f1876j);
        if (this.w != null) {
            this.r.setOnItemClickListener(this.f);
        }
    }

    public final void Q() {
        this.s.setAdapter((ListAdapter) this.k);
        this.s.setOnItemClickListener(this.g);
    }

    public final COUIPopupMenuRootView R() {
        COUIPopupMenuRootView cOUIPopupMenuRootView = new COUIPopupMenuRootView(this.i);
        cOUIPopupMenuRootView.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.wj2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.i.X(view);
            }
        });
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.i);
        int i = R$layout.coui_popup_list_window_layout;
        this.p = (RoundFrameLayout) layoutInflaterFrom.inflate(i, (ViewGroup) cOUIPopupMenuRootView, false);
        this.q = (RoundFrameLayout) LayoutInflater.from(this.i).inflate(i, (ViewGroup) cOUIPopupMenuRootView, false);
        RoundFrameLayout roundFrameLayout = this.p;
        int i2 = R$id.coui_popup_list_view;
        this.r = (ListView) roundFrameLayout.findViewById(i2);
        this.s = (ListView) this.q.findViewById(i2);
        TypedArray typedArrayObtainStyledAttributes = this.i.getTheme().obtainStyledAttributes(new int[]{R$attr.couiPopupWindowBackground});
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        if (drawable == null) {
            drawable = ResourcesCompat.getDrawable(this.i.getResources(), R$drawable.coui_popup_window_background, this.i.getTheme());
        }
        if (drawable != null) {
            this.p.setBackground(drawable.getConstantState().newDrawable());
            this.q.setBackground(drawable.getConstantState().newDrawable());
        }
        typedArrayObtainStyledAttributes.recycle();
        cOUIPopupMenuRootView.setOnSubMenuStateChangedListener(new d());
        return cOUIPopupMenuRootView;
    }

    public void S() {
        if (super.isShowing()) {
            M();
            View view = this.m;
            if (view != null && view.getRootView() != null) {
                this.m.getRootView().removeOnLayoutChangeListener(this.f1875e);
            }
            if (this.I != -1 && this.f1876j != null) {
                bj2.a("COUIPopupListWindow", "LastClickedMainMenuItemPosition = " + this.I);
                Object item = this.f1876j.getItem(o35.d(this.I));
                if (item instanceof qne) {
                    ((qne) item).A(0);
                }
            }
            this.o = null;
            h0(false, this.m);
            this.O = false;
            this.y = 0;
            this.z = 0;
            super.dismiss();
            PopupWindow.OnDismissListener onDismissListener = this.Q;
            if (onDismissListener != null && !this.T) {
                onDismissListener.onDismiss();
            }
            this.T = false;
        }
    }

    public List<qne> T() {
        return this.f1877l;
    }

    public final int U() {
        if (this.E >= 0) {
            if (U) {
                Log.i("COUIPopupListWindow", "Use custom menu width = " + this.E);
            }
            return this.E;
        }
        if (this.F >= V()) {
            return this.F;
        }
        Log.w("COUIPopupListWindow", "Illegal max width! Custom menu max width smaller than min width!");
        o35 o35Var = this.f1876j;
        if (o35Var == null) {
            Log.w("COUIPopupListWindow", "Get main menu max width fail! Adapter is NULL!");
            return 0;
        }
        if (o35Var.s() && !this.f1876j.r()) {
            return this.i.getResources().getDimensionPixelOffset(R$dimen.coui_popup_list_window_width_with_icon);
        }
        return this.i.getResources().getDimensionPixelOffset(R$dimen.coui_popup_list_window_max_width);
    }

    public final int V() {
        int i = this.E;
        if (i >= 0) {
            return i;
        }
        o35 o35Var = this.f1876j;
        if (o35Var == null) {
            Log.w("COUIPopupListWindow", "Get main menu min width fail! Adapter is NULL!");
            return 0;
        }
        if (o35Var.s()) {
            return this.f1876j.r() ? this.i.getResources().getDimensionPixelOffset(R$dimen.coui_popup_list_window_max_width) : this.i.getResources().getDimensionPixelOffset(R$dimen.coui_popup_list_window_width_with_icon);
        }
        return this.i.getResources().getDimensionPixelOffset(R$dimen.coui_popup_list_window_min_width);
    }

    public final boolean W(View view) {
        return ViewCompat.getLayoutDirection(view) == 1;
    }

    public void Z() {
        a0(this.f1876j);
    }

    public void a0(o35 o35Var) {
        View view;
        int i;
        boolean z = o35Var == this.f1876j;
        vne vneVar = this.v;
        int iG = z ? vneVar.G() : vneVar.H();
        ArrayList arrayList = new ArrayList();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(U(), Integer.MIN_VALUE);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = o35Var.getCount();
        View view2 = null;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int iJ = 0;
        View view3 = null;
        boolean z2 = true;
        while (i2 < count) {
            if (o35.t(i2)) {
                if (o35Var.getItemViewType(i2) == 3) {
                    view = o35Var.getView(i2, view2, this.t);
                } else {
                    view3 = o35Var.getView(i2, view3, this.t);
                    view = view3;
                }
                if (view != null) {
                    if ((view.getLayoutParams() instanceof AbsListView.LayoutParams) && (i = ((AbsListView.LayoutParams) view.getLayoutParams()).height) != -2) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i, 1073741824);
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    if (measuredWidth > i4) {
                        i4 = measuredWidth;
                    }
                    if (z2 && i3 + measuredHeight > iG) {
                        i3 -= iJ;
                        z2 = false;
                    }
                    if (z2) {
                        i3 += measuredHeight;
                    }
                    i5 += measuredHeight;
                    if (i2 == 0 || arrayList.isEmpty()) {
                        arrayList.add(Integer.valueOf(measuredHeight));
                    } else {
                        arrayList.add(Integer.valueOf(measuredHeight + ((Integer) arrayList.get(i2 - 1)).intValue()));
                    }
                }
            } else {
                iJ = o35Var.u(i2) ? o35Var.j(2) : o35Var.j(1);
                if (z2) {
                    i3 += iJ;
                }
                i5 += iJ;
                if (i2 == 0 || arrayList.isEmpty()) {
                    arrayList.add(Integer.valueOf(iJ));
                } else {
                    arrayList.add(Integer.valueOf(iJ + ((Integer) arrayList.get(i2 - 1)).intValue()));
                }
            }
            i2++;
            view2 = null;
        }
        if (i3 != 0) {
            iG = i3;
        }
        if (z) {
            this.y = Math.max(i4, V());
            this.z = iG;
            ListView listView = this.r;
            if (listView instanceof COUITouchListView) {
                ((COUITouchListView) listView).p(arrayList, i5);
                return;
            }
            return;
        }
        this.A = this.y;
        this.B = iG;
        ListView listView2 = this.s;
        if (listView2 instanceof COUITouchListView) {
            ((COUITouchListView) listView2).p(arrayList, i5);
        }
    }

    public void b0(View view, int i, int i2, boolean z) {
        P();
        this.v.O(view, i, i2, this.f1878n);
        this.u.setDomain(this.v.C());
        this.u.j(this.p);
        if (this.y == 0 || this.z == 0) {
            Z();
        }
        this.u.u(this.y, this.z);
        this.v.M(this.y, this.z, z, this.C, this.D);
        A0();
    }

    public void c0() {
        TypedArray typedArrayObtainStyledAttributes = this.i.getTheme().obtainStyledAttributes(new int[]{R$attr.couiPopupWindowBackground});
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        typedArrayObtainStyledAttributes.recycle();
        if (drawable == null) {
            drawable = ResourcesCompat.getDrawable(this.i.getResources(), R$drawable.coui_popup_window_background, this.i.getTheme());
        }
        if (drawable != null) {
            this.p.setBackground(drawable.getConstantState().newDrawable());
            this.q.setBackground(drawable.getConstantState().newDrawable());
        }
    }

    @Override // com.coui.appcompat.poplist.COUIPopupWindow
    public void d() {
        setBackgroundDrawable(null);
    }

    public final void d0(List<qne> list, o35 o35Var) {
        o35Var.A(this.L);
        o35Var.I(this.M);
        o35Var.J(list);
    }

    @Override // android.widget.PopupWindow
    public void dismiss() {
        boolean z;
        COUIPopupMenuRootView cOUIPopupMenuRootView = this.u;
        if (cOUIPopupMenuRootView != null && !cOUIPopupMenuRootView.isAttachedToWindow()) {
            S();
        }
        if (isTouchable()) {
            setTouchable(false);
            this.R = true;
            z = true;
        } else {
            z = false;
        }
        if (isFocusable()) {
            setFocusable(false);
            this.S = true;
            z = true;
        }
        if (z) {
            update();
        }
        if (!isShowing() || this.O) {
            return;
        }
        M();
        if (this.T) {
            this.O = true;
            COUIPopupMenuRootView cOUIPopupMenuRootView2 = this.u;
            if (cOUIPopupMenuRootView2 != null) {
                cOUIPopupMenuRootView2.q(this.h, 350L);
            }
        } else {
            View view = this.m;
            if (view != null && view.getRootView() != null) {
                this.m.getRootView().removeOnLayoutChangeListener(this.f1875e);
            }
            if (this.I != -1 && this.f1876j != null) {
                bj2.a("COUIPopupListWindow", "LastClickedMainMenuItemPosition = " + this.I);
                Object item = this.f1876j.getItem(o35.d(this.I));
                if (item instanceof qne) {
                    ((qne) item).A(0);
                }
            }
            COUIPopupMenuRootView cOUIPopupMenuRootView3 = this.u;
            if (cOUIPopupMenuRootView3 != null) {
                cOUIPopupMenuRootView3.n(true);
            }
            h0(false, this.m);
        }
        PopupWindow.OnDismissListener onDismissListener = this.Q;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // com.coui.appcompat.poplist.COUIPopupWindow
    public void e() {
    }

    public void e0() {
        l0(0, 0);
    }

    public final void f0(boolean z) {
        this.u.u(this.y, this.z);
        this.v.M(this.y, this.z, z, this.C, this.D);
        A0();
    }

    public void g0(boolean z) {
        this.P = z;
    }

    public final void h0(boolean z, View view) {
        if (view != null && (view instanceof xr9)) {
            if (view.getBackground() instanceof c56) {
                ((c56) view.getBackground()).d(16843623, z, z, true);
            }
            if (view.getBackground() instanceof hm2) {
                ((hm2) view.getBackground()).f(16843623, z, z, true);
            }
        }
    }

    public void i0(View view) {
        this.m = view;
    }

    @Override // android.widget.PopupWindow
    public boolean isShowing() {
        return super.isShowing() && !this.O;
    }

    public void j0(boolean z) {
        this.T = z;
    }

    @Deprecated
    public void k0(boolean z) {
    }

    public void l0(int i, int i2) {
        this.C = i;
        this.D = i2;
    }

    public void m0(boolean z) {
        this.M = z;
        o35 o35Var = this.f1876j;
        if (o35Var != null) {
            o35Var.I(z);
        }
        o35 o35Var2 = this.k;
        if (o35Var2 != null) {
            o35Var2.I(this.M);
        }
    }

    public void n0(List<qne> list) {
        o0(list, false);
    }

    public void o0(List<qne> list, boolean z) {
        if (!O(list) || !N(list)) {
            Log.e("COUIPopupListWindow", "Error! Item list must not be empty or null!");
            return;
        }
        this.f1877l = list;
        if (this.f1876j == null) {
            this.f1876j = new o35(this.i, null);
        }
        p0(this.f1877l, this.f1876j, z);
    }

    public final void p0(List<qne> list, o35 o35Var, boolean z) {
        HashSet hashSet;
        if (list.size() >= 3) {
            if (z) {
                Collections.sort(list, new Comparator() { // from class: com.oplus.aiunit.vision.xj2
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return com.coui.appcompat.poplist.b.Y((qne) obj, (qne) obj2);
                    }
                });
            }
            hashSet = new HashSet();
            int iH = list.get(0).h();
            for (int i = 1; i < list.size(); i++) {
                int iH2 = list.get(i).h();
                if (iH2 != iH) {
                    hashSet.add(Integer.valueOf(i));
                    iH = iH2;
                }
            }
        } else {
            hashSet = null;
        }
        if (hashSet != null) {
            o35Var.D(hashSet);
        }
        d0(list, o35Var);
    }

    @Deprecated
    public void q0(int i) {
    }

    @Deprecated
    public void r0(int i) {
    }

    public final void s0(boolean z) {
        if (this.k == null) {
            return;
        }
        if (this.v.K()) {
            int i = z ? 2 : 0;
            Object item = this.k.getItem(0);
            if (item instanceof qne) {
                ((qne) item).A(i);
                this.k.notifyDataSetChanged();
                return;
            }
            return;
        }
        int i2 = this.I;
        if (i2 != -1) {
            Object item2 = this.f1876j.getItem(o35.d(i2));
            if (item2 instanceof qne) {
                ((qne) item2).A(z ? 1 : 0);
                this.f1876j.notifyDataSetChanged();
            }
        }
        View view = this.o;
        if (view == null || !(view.getBackground() instanceof gza)) {
            return;
        }
        ((gza) this.o.getBackground()).B(z, z, true);
    }

    @Override // android.widget.PopupWindow
    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.Q = onDismissListener;
    }

    public void setOnItemClickListener(AdapterView.OnItemClickListener onItemClickListener) {
        if (onItemClickListener == null) {
            bj2.g("COUIPopupListWindow", "set main menu item click listener = null. caller = " + Log.getStackTraceString(new Throwable()));
        }
        this.w = onItemClickListener;
    }

    public void setSubMenuClickListener(AdapterView.OnItemClickListener onItemClickListener) {
        if (onItemClickListener == null) {
            bj2.g("COUIPopupListWindow", "set sub menu item click listener = null. caller = " + Log.getStackTraceString(new Throwable()));
        }
        this.x = onItemClickListener;
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2, int i3) {
    }

    public void t0(boolean z, AnimLevel animLevel) {
        this.q.r(z, animLevel);
        this.p.r(z, animLevel);
    }

    public void u0(View view) {
        w0(view, false);
    }

    public void v0(View view, int i, int i2) {
        x0(view, false, i, i2);
    }

    public void w0(View view, boolean z) {
        x0(view, z, Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public void x0(View view, boolean z, int i, int i2) {
        int i3;
        WindowInsets rootWindowInsets;
        Context context = this.i;
        if (context == null) {
            Log.e("COUIPopupListWindow", " The context of COUIPopupListWindow is null ");
            return;
        }
        if ((context instanceof Activity) && ((Activity) context).isFinishing()) {
            Log.e("COUIPopupListWindow", " The context of COUIPopupListWindow is Finish ");
            return;
        }
        if (view == null || view.getContext() == null || view.getWindowToken() == null) {
            Log.e("COUIPopupListWindow", " COUIPopupListWindow's anchor state is wrong ");
            return;
        }
        if (this.f1876j == null) {
            Log.e("COUIPopupListWindow", "The MainMenuAdapter is null");
            return;
        }
        boolean z2 = this.O && this.m == view;
        this.m = view;
        if (this.N && (rootWindowInsets = view.getRootWindowInsets()) != null) {
            getContentView().setTranslationX(-rootWindowInsets.getSystemWindowInsetLeft());
            bj2.g("COUIPopupListWindow", "mNeedOffsetWhenSetWindowType is true , offset the root view.");
        }
        int i4 = this.y;
        if (i4 != 0 && (i3 = this.z) != 0) {
            Z();
            z2 &= i4 == this.y && i3 == this.z;
        }
        if ((z2 & (this.P || (this.G == i && this.H == i2))) && (!this.T)) {
            o35 o35Var = this.f1876j;
            if (o35Var != null) {
                o35Var.notifyDataSetChanged();
            }
            o35 o35Var2 = this.k;
            if (o35Var2 != null) {
                o35Var2.notifyDataSetChanged();
            }
            f0(z);
            setWidth(this.v.a.width());
            setHeight(this.v.a.height());
            this.u.w();
        } else {
            if (super.isShowing()) {
                S();
            }
            this.G = i;
            this.H = i2;
            b0(view, i, i2, z);
            setWidth(this.v.a.width());
            setHeight(this.v.a.height());
            super.showAtLocation(view.getRootView(), 0, 0, 0);
        }
        view.getRootView().addOnLayoutChangeListener(this.f1875e);
        h0(true, view);
    }

    public final void y0(View view, int i) {
        if (this.q.getParent() != null && i == this.I) {
            this.u.x();
            return;
        }
        Q();
        a0(this.k);
        this.u.v(this.A, this.B);
        this.v.N(view, this.A, this.B, W(view));
        B0();
        this.u.k(this.q);
    }

    @Deprecated
    public void z0() {
        super.dismiss();
    }
}
