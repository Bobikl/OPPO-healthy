package com.coui.appcompat.bottomfloatingtoolbar;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.ContentObserver;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RenderEffect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.util.AttributeSet;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.core.view.ViewCompat;
import com.coui.appcompat.bottomfloatingtoolbar.COUIBottomFloatingToolbar;
import com.coui.appcompat.grid.COUIResponsiveUtils;
import com.oplus.aiunit.vision.bj2;
import com.oplus.aiunit.vision.bn2;
import com.oplus.aiunit.vision.byf;
import com.oplus.aiunit.vision.ifk;
import com.oplus.aiunit.vision.sm9;
import com.oplus.aiunit.vision.uf2;
import com.oplus.graphics.OplusPathAdapter;
import com.oplus.os.OplusBuild;
import com.oplus.view.OplusViewBackgroundRenderEffect;
import com.support.appcompat.R$bool;
import com.support.bottomnavigation.R$attr;
import com.support.bottomnavigation.R$dimen;
import com.support.bottomnavigation.R$styleable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes13.dex */
public class COUIBottomFloatingToolbar extends ViewGroup {
    public static final int PACKED = 1;
    public static final int SDK_SUB_VERSION = 34;
    public static final int SPREAD = 0;
    public boolean A;
    public Consumer<Boolean> B;
    public WindowManager C;
    public boolean D;
    public Context E;
    public boolean F;
    public int G;
    public int H;
    public int I;
    public Map<Integer, COUIBottomFloatingToolbarMenuView> J;
    public int[] K;
    public int L;
    public List<com.coui.appcompat.bottomfloatingtoolbar.a> M;
    public int N;
    public Map<com.coui.appcompat.bottomfloatingtoolbar.a, Integer> O;
    public List<com.coui.appcompat.bottomfloatingtoolbar.a> P;
    public List<com.coui.appcompat.bottomfloatingtoolbar.a> Q;
    public boolean R;
    public ArrayList<COUIBottomFloatingToolbarMenuView> S;
    public int T;
    public float U;
    public int V;
    public boolean W;
    public d a0;
    public final ArrayList<COUIBottomFloatingToolbarMenuView> i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @SuppressLint({"RestrictedApi"})
    public final MenuBuilder f1552j;
    public final b k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f1553l;
    public final float m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f1554n;
    public final int o;
    public final Paint p;
    public final float q;
    public final Path r;
    public final RectF s;
    public final boolean t;
    public final ContentObserver u;
    public RenderEffect v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    public class a extends ContentObserver {
        public a(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            boolean zA = COUIBottomFloatingToolbar.this.A();
            if (COUIBottomFloatingToolbar.this.z != zA) {
                COUIBottomFloatingToolbar.this.z = zA;
                COUIBottomFloatingToolbar.this.m();
                COUIBottomFloatingToolbar.this.l();
            }
        }
    }

    public class b {
        public final AtomicInteger a = new AtomicInteger(0);
        public final AtomicInteger b = new AtomicInteger(0);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f1555c;

        public b() {
        }

        public final boolean b() {
            return this.b.get() == 0;
        }

        public final boolean c() {
            return this.a.get() == 0;
        }

        public final void d() {
            COUIBottomFloatingToolbar.this.u();
        }

        public final void e() {
            COUIBottomFloatingToolbar.this.P();
        }

        public final void f() {
            COUIBottomFloatingToolbar.this.P();
        }

        public void g(boolean z, String str) {
            int iDecrementAndGet = this.b.decrementAndGet();
            if (b()) {
                i(z);
                this.f1555c = false;
                Iterator it = COUIBottomFloatingToolbar.this.S.iterator();
                while (it.hasNext()) {
                    COUIBottomFloatingToolbar.this.t((COUIBottomFloatingToolbarMenuView) it.next());
                }
            }
            bj2.a("COUIBottomFloatingToolbar", "Anim Decrement result : " + iDecrementAndGet + ",msg : " + str);
        }

        public void h(boolean z, String str) {
            if (b()) {
                j();
            }
            if (z && !this.f1555c) {
                this.f1555c = true;
                e();
            }
            bj2.a("COUIBottomFloatingToolbar", "Anim Increment result : " + this.b.incrementAndGet() + ",msg : " + str);
        }

        public final void i(boolean z) {
            if (z) {
                f();
            }
            COUIBottomFloatingToolbar.j(COUIBottomFloatingToolbar.this);
        }

        public final void j() {
            COUIBottomFloatingToolbar.j(COUIBottomFloatingToolbar.this);
        }

        public void k() {
            int iDecrementAndGet = this.a.decrementAndGet();
            if (c()) {
                d();
            }
            bj2.a("COUIBottomFloatingToolbar", "Pending Decrement result : " + iDecrementAndGet);
        }

        public void l() {
            bj2.a("COUIBottomFloatingToolbar", "Pending Increment result : " + this.a.incrementAndGet());
        }
    }

    public interface c {
    }

    public static class d {
        public final int a;
        public OplusPathAdapter b;

        public d(Path path) {
            this.b = null;
            int iA = byf.a();
            this.a = iA;
            if (iA == 1) {
                this.b = new OplusPathAdapter(path, iA);
            }
        }

        public OplusPathAdapter a() {
            return this.b;
        }

        public int b() {
            return this.a;
        }
    }

    public COUIBottomFloatingToolbar(Context context) {
        this(context, null);
    }

    public static /* synthetic */ int E(com.coui.appcompat.bottomfloatingtoolbar.a aVar, com.coui.appcompat.bottomfloatingtoolbar.a aVar2) {
        return aVar.d() - aVar2.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F(Boolean bool) {
        if (this.A != bool.booleanValue()) {
            this.A = bool.booleanValue();
            m();
            l();
        }
    }

    private MenuInflater getMenuInflater() {
        return new MenuInflater(this.E);
    }

    public static /* synthetic */ uf2 j(COUIBottomFloatingToolbar cOUIBottomFloatingToolbar) {
        cOUIBottomFloatingToolbar.getClass();
        return null;
    }

    private void setItemListInternal(List<com.coui.appcompat.bottomfloatingtoolbar.a> list) {
        bj2.a("COUIBottomFloatingToolbar", "setItemListInternal mainItemList: " + list);
        Map<Integer, List<com.coui.appcompat.bottomfloatingtoolbar.a>> mapX = x(list);
        removeAllViews();
        this.J.clear();
        this.R = false;
        for (Map.Entry<Integer, List<com.coui.appcompat.bottomfloatingtoolbar.a>> entry : mapX.entrySet()) {
            COUIBottomFloatingToolbarMenuView cOUIBottomFloatingToolbarMenuViewR = r(entry.getValue());
            addView(cOUIBottomFloatingToolbarMenuViewR);
            this.J.put(entry.getKey(), cOUIBottomFloatingToolbarMenuViewR);
        }
        this.K = v(this.J);
        this.H = this.J.size();
    }

    public final boolean A() {
        return Settings.System.getInt(this.E.getContentResolver(), "system_material_blur_enable", 0) == 1;
    }

    public final boolean B() {
        return this.x && this.z && this.A;
    }

    public final boolean C() {
        return ViewCompat.getLayoutDirection(this) == 1;
    }

    public final boolean D() {
        return this.w && this.z && this.A;
    }

    public final void G(View view, int i, int i2) {
        int paddingLeft = i - view.getPaddingLeft();
        int iMax = Math.max(getPaddingTop(), (((i2 - getPaddingTop()) - getPaddingBottom()) - view.getMeasuredHeight()) / 2);
        view.layout(paddingLeft, iMax, Math.max(view.getMeasuredWidth(), view.getWidth()) + paddingLeft, view.getMeasuredHeight() + iMax);
        H(view, paddingLeft, iMax, paddingLeft + view.getMeasuredWidth(), iMax + view.getMeasuredHeight());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void H(View view, int i, int i2, int i3, int i4) {
        if (view instanceof sm9) {
            ((sm9) view).c(i, i2, i3, i4, this.R);
        }
    }

    public final void I(int i, int i2, int i3, int i4) {
        COUIBottomFloatingToolbarMenuView cOUIBottomFloatingToolbarMenuView = this.J.get(Integer.valueOf(this.K[0]));
        G(cOUIBottomFloatingToolbarMenuView, Math.max(getPaddingLeft(), getPaddingLeft() + ((w(this) - w(cOUIBottomFloatingToolbarMenuView)) / 2)), i4 - i2);
    }

    public final void J(int i, int i2, int i3, int i4) {
        Map<Integer, COUIBottomFloatingToolbarMenuView> map;
        int i5;
        if (C()) {
            map = this.J;
            i5 = this.K[2];
        } else {
            map = this.J;
            i5 = this.K[0];
        }
        COUIBottomFloatingToolbarMenuView cOUIBottomFloatingToolbarMenuView = map.get(Integer.valueOf(i5));
        COUIBottomFloatingToolbarMenuView cOUIBottomFloatingToolbarMenuView2 = this.J.get(Integer.valueOf(this.K[1]));
        COUIBottomFloatingToolbarMenuView cOUIBottomFloatingToolbarMenuView3 = C() ? this.J.get(Integer.valueOf(this.K[0])) : this.J.get(Integer.valueOf(this.K[2]));
        if (this.F) {
            int iW = ((w(this) - (((w(cOUIBottomFloatingToolbarMenuView) + w(cOUIBottomFloatingToolbarMenuView2)) + w(cOUIBottomFloatingToolbarMenuView3)) + (this.G * 2))) / 2) + getPaddingLeft();
            int i6 = i4 - i2;
            G(cOUIBottomFloatingToolbarMenuView, iW, i6);
            int measuredWidth = iW + ((cOUIBottomFloatingToolbarMenuView.getMeasuredWidth() - cOUIBottomFloatingToolbarMenuView.getPaddingRight()) - cOUIBottomFloatingToolbarMenuView2.getPaddingLeft()) + this.G;
            G(cOUIBottomFloatingToolbarMenuView2, measuredWidth, i6);
            G(cOUIBottomFloatingToolbarMenuView3, measuredWidth + ((cOUIBottomFloatingToolbarMenuView2.getMeasuredWidth() - cOUIBottomFloatingToolbarMenuView2.getPaddingRight()) - cOUIBottomFloatingToolbarMenuView3.getPaddingLeft()) + this.G, i6);
            return;
        }
        int i7 = i4 - i2;
        G(cOUIBottomFloatingToolbarMenuView, getPaddingLeft(), i7);
        G(cOUIBottomFloatingToolbarMenuView3, ((i3 - i) - getPaddingRight()) - w(cOUIBottomFloatingToolbarMenuView3), i7);
        int right = (cOUIBottomFloatingToolbarMenuView.getRight() - cOUIBottomFloatingToolbarMenuView.getPaddingRight()) + this.G;
        int left = (cOUIBottomFloatingToolbarMenuView3.getLeft() + cOUIBottomFloatingToolbarMenuView3.getPaddingLeft()) - this.G;
        int iW2 = w(this);
        int iW3 = ((iW2 - w(cOUIBottomFloatingToolbarMenuView2)) / 2) + getPaddingLeft();
        int iW4 = ((iW2 + w(cOUIBottomFloatingToolbarMenuView2)) / 2) + getPaddingLeft();
        if (iW3 >= right && iW4 <= left) {
            right = iW3;
        } else if (iW3 >= right) {
            right = left - w(cOUIBottomFloatingToolbarMenuView2);
        }
        G(cOUIBottomFloatingToolbarMenuView2, right, i7);
    }

    public final void K(int i, int i2, int i3, int i4) {
        Map<Integer, COUIBottomFloatingToolbarMenuView> map;
        int i5;
        if (C()) {
            map = this.J;
            i5 = this.K[1];
        } else {
            map = this.J;
            i5 = this.K[0];
        }
        COUIBottomFloatingToolbarMenuView cOUIBottomFloatingToolbarMenuView = map.get(Integer.valueOf(i5));
        COUIBottomFloatingToolbarMenuView cOUIBottomFloatingToolbarMenuView2 = C() ? this.J.get(Integer.valueOf(this.K[0])) : this.J.get(Integer.valueOf(this.K[1]));
        if (!this.F) {
            int i6 = i4 - i2;
            G(cOUIBottomFloatingToolbarMenuView, getPaddingLeft(), i6);
            G(cOUIBottomFloatingToolbarMenuView2, ((i3 - i) - getPaddingRight()) - w(cOUIBottomFloatingToolbarMenuView2), i6);
        } else {
            int iMax = Math.max(getPaddingLeft(), getPaddingLeft() + ((w(this) - ((w(cOUIBottomFloatingToolbarMenuView) + w(cOUIBottomFloatingToolbarMenuView2)) + this.G)) / 2));
            int i7 = i4 - i2;
            G(cOUIBottomFloatingToolbarMenuView, iMax, i7);
            G(cOUIBottomFloatingToolbarMenuView2, iMax + ((cOUIBottomFloatingToolbarMenuView.getMeasuredWidth() - cOUIBottomFloatingToolbarMenuView.getPaddingRight()) - cOUIBottomFloatingToolbarMenuView2.getPaddingLeft()) + this.G, i7);
        }
    }

    public final void L(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i + view.getPaddingLeft() + view.getPaddingRight(), Integer.MIN_VALUE), ViewGroup.getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom(), view.getLayoutParams().height));
    }

    public final void M(int i, int i2) {
        COUIBottomFloatingToolbarMenuView cOUIBottomFloatingToolbarMenuView = this.J.get(Integer.valueOf(this.K[1]));
        L(cOUIBottomFloatingToolbarMenuView, i - ((this.G + this.L) * 2), i2);
        N(this.J.get(Integer.valueOf(this.K[0])), this.J.get(Integer.valueOf(this.K[2])), (((i - cOUIBottomFloatingToolbarMenuView.getMeasuredWidth()) + cOUIBottomFloatingToolbarMenuView.getPaddingLeft()) + cOUIBottomFloatingToolbarMenuView.getPaddingRight()) - (this.G * 2), i2, false);
    }

    public final void N(View view, View view2, int i, int i2, boolean z) {
        L(view, i, i2);
        L(view2, i, i2);
        int i3 = i / 2;
        int iMin = Math.min((view.getMeasuredWidth() - view.getPaddingLeft()) - view.getPaddingRight(), (view2.getMeasuredWidth() - view2.getPaddingLeft()) - view2.getPaddingRight());
        if (iMin > i3) {
            L(view, i3, i2);
            L(view2, i3, i2);
            return;
        }
        if ((iMin == (view.getMeasuredWidth() - view.getPaddingLeft()) - view.getPaddingRight() ? view : view2) == view) {
            view = view2;
        }
        if ((view.getMeasuredWidth() - view.getPaddingLeft()) - view.getPaddingRight() > i3) {
            if (z) {
                i3 = i - iMin;
            }
            L(view, i3, i2);
        }
    }

    public final void O() {
        WindowManager windowManager;
        if (this.D) {
            return;
        }
        this.z = A();
        this.E.getContentResolver().registerContentObserver(Settings.System.getUriFor("system_material_blur_enable"), false, this.u);
        if (this.B == null) {
            this.B = new Consumer() { // from class: com.oplus.aiunit.vision.tf2
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    this.i.F((Boolean) obj);
                }
            };
        }
        if (this.C == null) {
            this.C = (WindowManager) this.E.getSystemService("window");
        }
        if (Build.VERSION.SDK_INT >= 31 && (windowManager = this.C) != null) {
            windowManager.addCrossWindowBlurEnabledListener(this.B);
            this.A = this.C.isCrossWindowBlurEnabled();
        }
        this.D = true;
    }

    public final void P() {
        this.i.clear();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof COUIBottomFloatingToolbarMenuView) {
                this.i.add((COUIBottomFloatingToolbarMenuView) childAt);
            }
        }
    }

    public final void Q(COUIBottomFloatingToolbarMenuView cOUIBottomFloatingToolbarMenuView) {
        com.coui.appcompat.bottomfloatingtoolbar.c cVar = cOUIBottomFloatingToolbarMenuView.u;
        if (cVar != null) {
            cVar.B();
        }
    }

    public final void R(COUIBottomFloatingToolbarMenuView cOUIBottomFloatingToolbarMenuView) {
        com.coui.appcompat.bottomfloatingtoolbar.c cVar = cOUIBottomFloatingToolbarMenuView.u;
        if (cVar != null) {
            cVar.y();
        }
    }

    public boolean S(COUIBottomFloatingToolbarMenuView cOUIBottomFloatingToolbarMenuView) {
        if (this.F) {
            return false;
        }
        return (this.i.size() == 1 && this.i.get(0) == cOUIBottomFloatingToolbarMenuView) || (this.i.size() == 3 && this.i.get(1) == cOUIBottomFloatingToolbarMenuView);
    }

    public boolean T(COUIBottomFloatingToolbarMenuView cOUIBottomFloatingToolbarMenuView) {
        boolean z = false;
        if (this.F) {
            return false;
        }
        boolean z2 = this.i.size() > 1 && this.i.get(0) == cOUIBottomFloatingToolbarMenuView;
        if (!C()) {
            return z2;
        }
        if (this.i.size() > 1) {
            ArrayList<COUIBottomFloatingToolbarMenuView> arrayList = this.i;
            if (arrayList.get(arrayList.size() - 1) == cOUIBottomFloatingToolbarMenuView) {
                z = true;
            }
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001e  */
    public boolean U(COUIBottomFloatingToolbarMenuView cOUIBottomFloatingToolbarMenuView) {
        boolean z;
        boolean z2 = false;
        if (this.F) {
            return false;
        }
        if (this.i.size() > 1) {
            ArrayList<COUIBottomFloatingToolbarMenuView> arrayList = this.i;
            if (arrayList.get(arrayList.size() - 1) == cOUIBottomFloatingToolbarMenuView) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (!C()) {
            return z;
        }
        if (this.i.size() > 1 && this.i.get(0) == cOUIBottomFloatingToolbarMenuView) {
            z2 = true;
        }
        return z2;
    }

    public final void V() {
        WindowManager windowManager;
        if (this.D) {
            this.E.getContentResolver().unregisterContentObserver(this.u);
            this.D = false;
            if (Build.VERSION.SDK_INT < 31 || (windowManager = this.C) == null) {
                return;
            }
            windowManager.removeCrossWindowBlurEnabledListener(this.B);
        }
    }

    public final void W() {
        this.r.reset();
        if (this.a0.b() == 1) {
            OplusPathAdapter oplusPathAdapterA = this.a0.a();
            RectF rectF = this.s;
            float f = this.U;
            oplusPathAdapterA.addSmoothRoundRect(rectF, f, f, Path.Direction.CCW);
            return;
        }
        Path path = this.r;
        RectF rectF2 = this.s;
        float f2 = this.U;
        path.addRoundRect(rectF2, f2, f2, Path.Direction.CCW);
    }

    public final void X(COUIBottomFloatingToolbarMenuView cOUIBottomFloatingToolbarMenuView, Canvas canvas) {
        float x = cOUIBottomFloatingToolbarMenuView.getX();
        float y = cOUIBottomFloatingToolbarMenuView.getY();
        float f = cOUIBottomFloatingToolbarMenuView.p().right - cOUIBottomFloatingToolbarMenuView.p().left;
        float f2 = cOUIBottomFloatingToolbarMenuView.p().bottom - cOUIBottomFloatingToolbarMenuView.p().top;
        this.s.left = cOUIBottomFloatingToolbarMenuView.p().left + (((1.0f - cOUIBottomFloatingToolbarMenuView.getScaleX()) * f) / 2.0f) + x;
        this.s.right = (cOUIBottomFloatingToolbarMenuView.p().right - ((f * (1.0f - cOUIBottomFloatingToolbarMenuView.getScaleX())) / 2.0f)) + x;
        this.s.top = cOUIBottomFloatingToolbarMenuView.p().top + (((1.0f - cOUIBottomFloatingToolbarMenuView.getScaleY()) * f2) / 2.0f) + y;
        this.s.bottom = (cOUIBottomFloatingToolbarMenuView.p().bottom - ((f2 * (1.0f - cOUIBottomFloatingToolbarMenuView.getScaleY())) / 2.0f)) + y;
        RectF rectF = this.s;
        this.U = (rectF.bottom - rectF.top) / 2.0f;
        this.p.setStrokeWidth(cOUIBottomFloatingToolbarMenuView.getScaleX() * 20.0f);
        W();
        s(canvas);
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
        Iterator<Map.Entry<Integer, COUIBottomFloatingToolbarMenuView>> it = this.J.entrySet().iterator();
        while (it.hasNext()) {
            X(it.next().getValue(), canvas);
        }
        Iterator<COUIBottomFloatingToolbarMenuView> it2 = this.S.iterator();
        while (it2.hasNext()) {
            X(it2.next(), canvas);
        }
    }

    public ArrayList<View> getAllItemViews() {
        ArrayList<View> arrayList = new ArrayList<>();
        for (int i : this.K) {
            arrayList.addAll(this.J.get(Integer.valueOf(i)).q());
        }
        return arrayList;
    }

    @NonNull
    public final b getAnimationCounter() {
        return this.k;
    }

    public int getGroupAlignStyle() {
        return this.F ? 1 : 0;
    }

    public final void l() {
        if (this.x) {
            O();
        }
        Iterator<Map.Entry<Integer, COUIBottomFloatingToolbarMenuView>> it = this.J.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().G(B());
        }
    }

    public final void m() {
        if (this.w) {
            O();
        }
        if (g.b()) {
            OplusViewBackgroundRenderEffect.setBackgroundRenderEffect(D() ? this.v : null, this);
        }
    }

    @Override // android.view.ViewGroup
    public void measureChild(View view, int i, int i2) {
    }

    @Override // android.view.ViewGroup
    public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.ViewGroup
    public void measureChildren(int i, int i2) {
    }

    public final void n() {
        int dimensionPixelOffset;
        if (COUIResponsiveUtils.isSmallScreen(getContext(), getMeasuredWidth())) {
            dimensionPixelOffset = getContext().getResources().getDimensionPixelOffset(R$dimen.coui_floating_toolbar_group_margin_small_screen);
        } else if (COUIResponsiveUtils.isMediumScreen(getContext(), getMeasuredWidth(), ifk.j(getContext()))) {
            dimensionPixelOffset = getContext().getResources().getDimensionPixelOffset(R$dimen.coui_floating_toolbar_group_margin_medium_screen);
        } else {
            dimensionPixelOffset = COUIResponsiveUtils.isLargeScreen(getContext(), getMeasuredWidth(), ifk.j(getContext())) ? getContext().getResources().getDimensionPixelOffset(R$dimen.coui_floating_toolbar_group_margin_large_screen) : 0;
        }
        if (dimensionPixelOffset == getPaddingLeft() && dimensionPixelOffset == getPaddingRight()) {
            return;
        }
        setPadding(dimensionPixelOffset, getPaddingTop(), dimensionPixelOffset, getPaddingBottom());
    }

    public final boolean o(int i) {
        if (Build.VERSION.SDK_INT <= 31) {
            return false;
        }
        if (bn2.c() > 33) {
            return true;
        }
        return bn2.c() >= 30 && OplusBuild.VERSION.SDK_SUB_VERSION >= i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Iterator<Map.Entry<Integer, COUIBottomFloatingToolbarMenuView>> it = this.J.entrySet().iterator();
        while (it.hasNext()) {
            COUIBottomFloatingToolbarMenuView value = it.next().getValue();
            h hVar = value.t;
            if (hVar != null) {
                hVar.q();
                value.t.s();
            }
            com.coui.appcompat.bottomfloatingtoolbar.c cVar = value.u;
            if (cVar != null) {
                cVar.w();
                value.u.u();
            }
        }
        V();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Iterator<Map.Entry<Integer, COUIBottomFloatingToolbarMenuView>> it = this.J.entrySet().iterator();
        while (true) {
            boolean z2 = false;
            if (!it.hasNext()) {
                break;
            }
            COUIBottomFloatingToolbarMenuView value = it.next().getValue();
            if (this.T == getMeasuredWidth()) {
                z2 = true;
            }
            value.H(z2);
        }
        this.T = getMeasuredWidth();
        int i5 = this.H;
        if (i5 != 0) {
            if (i5 == 1) {
                I(i, i2, i3, i4);
            } else if (i5 == 2) {
                K(i, i2, i3, i4);
            } else {
                if (i5 != 3) {
                    throw new RuntimeException();
                }
                J(i, i2, i3, i4);
            }
        }
        if (!this.R || this.W) {
            this.W = false;
            P();
        }
        if (this.k.c()) {
            u();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (1073741824 != View.MeasureSpec.getMode(i2)) {
            size2 = this.I + getPaddingTop() + getPaddingBottom();
        } else {
            int i3 = this.I;
            if (size2 < i3) {
                size2 = i3;
            }
        }
        setMeasuredDimension(size, size2);
        n();
        int iMax = Math.max(0, (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        int i4 = this.H;
        if (i4 != 0) {
            if (i4 == 1) {
                L(this.J.get(Integer.valueOf(this.K[0])), iMax, i2);
            } else if (i4 == 2) {
                N(this.J.get(Integer.valueOf(this.K[0])), this.J.get(Integer.valueOf(this.K[1])), iMax - this.G, i2, true);
            } else {
                if (i4 != 3) {
                    throw new RuntimeException();
                }
                M(iMax, i2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof sm9) {
            ((sm9) view).a(true, this.R);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof sm9) {
            sm9 sm9Var = (sm9) view;
            sm9Var.b();
            sm9Var.a(false, this.R);
        }
    }

    public final boolean p(List<?> list) {
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                return false;
            }
        }
        return true;
    }

    public final boolean q(List<?> list) {
        return (list == null || list.isEmpty()) ? false : true;
    }

    public final COUIBottomFloatingToolbarMenuView r(List<com.coui.appcompat.bottomfloatingtoolbar.a> list) {
        COUIBottomFloatingToolbarMenuView cOUIBottomFloatingToolbarMenuView = new COUIBottomFloatingToolbarMenuView(this.E, B());
        cOUIBottomFloatingToolbarMenuView.I(this.y);
        cOUIBottomFloatingToolbarMenuView.setPadding(this.V, cOUIBottomFloatingToolbarMenuView.getPaddingTop(), this.V, cOUIBottomFloatingToolbarMenuView.getPaddingBottom());
        cOUIBottomFloatingToolbarMenuView.B(null);
        cOUIBottomFloatingToolbarMenuView.E(list);
        cOUIBottomFloatingToolbarMenuView.setScaleX(0.0f);
        cOUIBottomFloatingToolbarMenuView.setScaleX(0.0f);
        return cOUIBottomFloatingToolbarMenuView;
    }

    public final void s(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.r, Region.Op.DIFFERENCE);
        canvas.drawPath(this.r, this.p);
        canvas.restore();
    }

    public void setBackgroundBlurEffect(RenderEffect renderEffect) {
        this.v = renderEffect;
        m();
    }

    public void setGroupAlignStyle(int i) {
        this.F = i == 1;
    }

    public void setItemList(List<com.coui.appcompat.bottomfloatingtoolbar.a> list) {
        if (q(list) && p(list)) {
            setItemListInternal(new ArrayList(list));
        } else {
            bj2.c("COUIBottomFloatingToolbar", "Error! Item list must not be empty or null!");
        }
    }

    public final void setMenuViewBlur(boolean z) {
        if (z != this.x) {
            boolean z2 = this.E.getResources().getBoolean(R$bool.coui_blur_enable);
            if (ifk.b(ifk.ANIM_LEVEL_SUPPORT_BLUR_MIN) && z2) {
                this.x = z;
            } else {
                bj2.c("COUIBottomFloatingToolbar", "do not support setting blurred backgrounds or current animLevel is too low or is in third party theme");
                this.x = false;
            }
            l();
        }
    }

    public void setStrokeAndInnerShadowEnabled(boolean z) {
        if (z != this.y) {
            this.y = z;
            Iterator<Map.Entry<Integer, COUIBottomFloatingToolbarMenuView>> it = this.J.entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().I(z);
            }
        }
    }

    public final void setToolbarBackgroundBlur(boolean z) {
        if (z != this.w) {
            boolean z2 = this.E.getResources().getBoolean(R$bool.coui_blur_enable);
            if (this.t && ifk.b(ifk.ANIM_LEVEL_SUPPORT_BLUR_MIN) && z2) {
                this.w = z;
            } else {
                bj2.c("COUIBottomFloatingToolbar", "do not support setting blurred backgrounds or current animLevel is too low or is in third party theme");
                this.w = false;
            }
            m();
        }
    }

    public void t(COUIBottomFloatingToolbarMenuView cOUIBottomFloatingToolbarMenuView) {
        if (this.S == null) {
            this.S = new ArrayList<>();
        }
        this.S.remove(cOUIBottomFloatingToolbarMenuView);
        endViewTransition(cOUIBottomFloatingToolbarMenuView);
    }

    public final void u() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof COUIBottomFloatingToolbarMenuView) {
                COUIBottomFloatingToolbarMenuView cOUIBottomFloatingToolbarMenuView = (COUIBottomFloatingToolbarMenuView) childAt;
                Q(cOUIBottomFloatingToolbarMenuView);
                R(cOUIBottomFloatingToolbarMenuView);
            }
        }
        for (int i2 = 0; i2 < this.S.size(); i2++) {
            R(this.S.get(i2));
        }
    }

    public final int[] v(Map<Integer, COUIBottomFloatingToolbarMenuView> map) {
        int[] iArr = new int[map.size()];
        Iterator<Integer> it = map.keySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = it.next().intValue();
            i++;
        }
        return iArr;
    }

    public final int w(View view) {
        return (view.getMeasuredWidth() - view.getPaddingLeft()) - view.getPaddingRight();
    }

    public final Map<Integer, List<com.coui.appcompat.bottomfloatingtoolbar.a>> x(List<com.coui.appcompat.bottomfloatingtoolbar.a> list) {
        Collections.sort(list, new Comparator() { // from class: com.oplus.aiunit.vision.sf2
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return COUIBottomFloatingToolbar.E((com.coui.appcompat.bottomfloatingtoolbar.a) obj, (com.coui.appcompat.bottomfloatingtoolbar.a) obj2);
            }
        });
        TreeMap treeMap = new TreeMap();
        int i = 0;
        int iD = list.get(0).d();
        ArrayList arrayList = new ArrayList();
        for (com.coui.appcompat.bottomfloatingtoolbar.a aVar : list) {
            int iD2 = aVar.d();
            if (iD2 != iD) {
                treeMap.put(Integer.valueOf(iD), arrayList);
                i++;
                if (i >= 3) {
                    break;
                }
                arrayList = new ArrayList();
                iD = iD2;
            }
            arrayList.add(aVar);
        }
        if (i < 3 && !arrayList.isEmpty()) {
            treeMap.put(Integer.valueOf(iD), arrayList);
        }
        return treeMap;
    }

    @SuppressLint({"RestrictedApi"})
    public final void y(int i) {
        this.f1552j.clear();
        getMenuInflater().inflate(i, this.f1552j);
        if (this.f1552j.getNonActionItems().isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        com.coui.appcompat.bottomfloatingtoolbar.a.C0193a c0193a = new com.coui.appcompat.bottomfloatingtoolbar.a.C0193a();
        for (MenuItemImpl menuItemImpl : this.f1552j.getNonActionItems()) {
            c0193a.j().o(menuItemImpl.getItemId()).k(menuItemImpl.getContentDescription()).m(menuItemImpl.getGroupId()).p(menuItemImpl.getTitle() == null ? "" : menuItemImpl.getTitle().toString()).n(menuItemImpl.getIcon()).l(menuItemImpl.isEnabled());
            arrayList.add(c0193a.i());
        }
        setItemList(arrayList);
    }

    public final void z() {
        this.p.setColor(0);
        this.p.setStyle(Paint.Style.STROKE);
        this.p.setStrokeWidth(20.0f);
        this.p.setShadowLayer(40.0f, 0.0f, 9.0f, this.o);
        this.a0 = new d(this.r);
    }

    public COUIBottomFloatingToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.couiFloatingToolbarStyle);
    }

    public COUIBottomFloatingToolbar(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    @SuppressLint({"RestrictedApi"})
    public COUIBottomFloatingToolbar(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.i = new ArrayList<>();
        this.k = new b();
        this.f1553l = 40.0f;
        this.m = 0.0f;
        this.f1554n = 9.0f;
        this.o = Color.argb(27, 0, 0, 0);
        this.p = new Paint();
        this.q = 20.0f;
        this.r = new Path();
        this.s = new RectF();
        this.u = new a(new Handler(Looper.getMainLooper()));
        this.y = true;
        this.z = false;
        this.A = false;
        this.J = new TreeMap();
        this.M = new ArrayList();
        this.N = -1;
        this.O = new LinkedHashMap();
        this.P = new ArrayList();
        this.Q = new ArrayList();
        this.S = new ArrayList<>();
        this.T = 0;
        this.U = 0.0f;
        this.V = 0;
        this.W = false;
        this.t = o(34);
        this.E = context;
        this.f1552j = new MenuBuilder(this.E);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.COUIFloatingToolbar, i, i2);
        setToolbarBackgroundBlur(typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUIFloatingToolbar_couiFloatingToolbarBackgroundBlur, false));
        setMenuViewBlur(typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUIFloatingToolbar_couiFloatingToolbarMenuViewMaterial, false));
        this.G = getResources().getDimensionPixelSize(R$dimen.coui_floating_toolbar_min_group_space);
        this.I = getResources().getDimensionPixelSize(R$dimen.coui_floating_toolbar_min_height);
        this.L = getResources().getDimensionPixelSize(R$dimen.coui_floating_toolbar_item_min_width);
        this.V = getResources().getDimensionPixelSize(R$dimen.coui_floating_toolbar_menu_view_padding);
        int i3 = R$styleable.COUIFloatingToolbar_couiFloatingToolbarMenu;
        if (typedArrayObtainStyledAttributes.hasValue(i3)) {
            y(typedArrayObtainStyledAttributes.getResourceId(i3, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
        z();
        setClipChildren(false);
        setClipToPadding(false);
        setWillNotDraw(false);
        setClipToOutline(false);
    }
}
