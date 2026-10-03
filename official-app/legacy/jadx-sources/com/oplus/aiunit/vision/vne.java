package com.oplus.aiunit.vision;

import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.coui.component.responsiveui.ResponsiveUIModel;
import com.coui.component.responsiveui.layoutgrid.MarginType;
import com.coui.component.responsiveui.window.WindowTotalSizeClass;
import com.support.poplist.R$dimen;
import java.util.Arrays;

/* JADX INFO: loaded from: classes13.dex */
public final class vne {
    public static final boolean U;
    public static final Rect V;
    public static final Rect W;
    public sne A;
    public int B;
    public int C;
    public int D;
    public int E;
    public ResponsiveUIModel F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public boolean S;
    public DisplayCutout T;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public rne f17915l;
    public rne m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public rne f17916n;
    public rne o;
    public rne p;
    public rne q;
    public rne r;
    public rne s;
    public rne t;
    public sne u;
    public sne v;
    public sne w;
    public sne x;
    public sne y;
    public sne z;
    public final Rect a = new Rect();
    public final Rect d = new Rect();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Rect f17913e = new Rect();
    public final Rect f = new Rect();
    public final Rect g = new Rect();
    public final Rect h = new Rect();
    public final int[] i = new int[2];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int[] f17914j = new int[2];
    public final int[] k = new int[2];
    public int M = 0;
    public int N = 0;
    public boolean O = false;
    public boolean P = false;
    public boolean Q = true;
    public boolean R = false;
    public final tne b = new tne();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xne f17912c = new xne();

    public class a implements sne {
        public a() {
        }

        @Override // com.oplus.aiunit.vision.sne
        public void a(@NonNull tne tneVar) {
            int iCenterX = tneVar.b.centerX() - (vne.this.B / 2);
            if (vne.this.f.right - vne.this.f.left >= vne.this.B) {
                iCenterX = Math.min(Math.max(iCenterX, vne.this.f.left), vne.this.f.right - vne.this.B);
            }
            Rect rect = tneVar.f17071c;
            rect.set(iCenterX, rect.top, vne.this.B + iCenterX, tneVar.f17071c.bottom);
        }
    }

    public class b implements sne {
        public b() {
        }

        @Override // com.oplus.aiunit.vision.sne
        public void a(@NonNull tne tneVar) {
            int iCenterY = tneVar.b.centerY() - (vne.this.C / 2);
            if (vne.this.f.bottom - vne.this.f.top >= vne.this.C) {
                iCenterY = Math.min(Math.max(iCenterY, vne.this.f.top), vne.this.f.bottom - vne.this.C);
            }
            Rect rect = tneVar.f17071c;
            rect.set(rect.left, iCenterY, rect.right, vne.this.C + iCenterY);
        }
    }

    public class c implements sne {
        public c() {
        }

        @Override // com.oplus.aiunit.vision.sne
        public void a(@NonNull tne tneVar) {
            int iB = b();
            Rect rect = tneVar.f17071c;
            rect.set(iB, rect.top, vne.this.B + iB, tneVar.f17071c.bottom);
        }

        public final int b() {
            int iCenterX = vne.this.b.b.centerX() - (vne.this.B / 2);
            if (iCenterX < vne.this.f.left) {
                iCenterX = vne.this.f.left;
            }
            if (vne.this.B + iCenterX > vne.this.f.right) {
                iCenterX = vne.this.f.right - vne.this.B;
            }
            if (iCenterX < vne.this.f.left) {
                iCenterX = vne.this.f.centerX() - (vne.this.B / 2);
            }
            if (vne.U) {
                Log.d("PopupMenuLocateHelper", "mMainMenuLocateXRule mAnchor [left " + vne.this.b.b.left + " top " + vne.this.b.b.top + " right " + vne.this.b.b.right + " bottom " + vne.this.b.b.bottom + "] mMainMenuWidth " + vne.this.B + " mAvailableBounds [left " + vne.this.f.left + " top " + vne.this.f.top + " right " + vne.this.f.right + " bottom " + vne.this.f.bottom + "] result x = " + iCenterX);
            }
            return iCenterX;
        }
    }

    public class d implements sne {
        public int i = 0;

        public d() {
        }

        @Override // com.oplus.aiunit.vision.sne
        public void a(@NonNull tne tneVar) {
            Rect rect = new Rect();
            tneVar.b(rect);
            this.i = vne.this.f.top;
            b(rect);
            Rect rect2 = tneVar.f17071c;
            int i = rect2.left;
            int i2 = this.i;
            rect2.set(i, i2, rect2.right, vne.this.C + i2);
        }

        public final void b(Rect rect) {
            int iMax = Math.max(rect.bottom, vne.this.f.top);
            int iMin = Math.min(rect.top, vne.this.f.bottom);
            if (vne.this.O) {
                if (!c(iMin)) {
                    d(iMax);
                }
            } else if (!d(iMax)) {
                c(iMin);
            }
            if (vne.U) {
                Log.d("PopupMenuLocateHelper", "mMainMenuLocateYRule anchorBounds [left " + rect.left + " top " + rect.top + " right " + rect.right + " bottom " + rect.bottom + "] mMainMenuHeight " + vne.this.C + " mAvailableBounds [left " + vne.this.f.left + " top " + vne.this.f.top + " right " + vne.this.f.right + " bottom " + vne.this.f.bottom + "] result y = " + this.i);
            }
        }

        public final boolean c(int i) {
            if (i - vne.this.f.top < vne.this.C) {
                return false;
            }
            this.i = i - vne.this.C;
            return true;
        }

        public final boolean d(int i) {
            if (vne.this.f.bottom - i < vne.this.C) {
                return false;
            }
            this.i = i;
            return true;
        }
    }

    public class e implements sne {
        public e() {
        }

        @Override // com.oplus.aiunit.vision.sne
        public void a(@NonNull tne tneVar) {
            if (!vne.this.K()) {
                tneVar.d.set(tneVar.f17071c);
                return;
            }
            int iWidth = (int) ((vne.this.L / tneVar.f17071c.width()) * tneVar.f17071c.height());
            Rect rect = tneVar.d;
            Rect rect2 = tneVar.f17071c;
            rect.set(rect2.left, rect2.top, rect2.right - vne.this.L, tneVar.f17071c.bottom - iWidth);
            tneVar.d.offset(b(tneVar), c(tneVar));
        }

        public final int b(tne tneVar) {
            int iCenterX = tneVar.b.centerX();
            int iCenterX2 = tneVar.f17071c.centerX();
            if (iCenterX < iCenterX2 - 1) {
                return 0;
            }
            return iCenterX > iCenterX2 + 1 ? vne.this.L : vne.this.L / 2;
        }

        public final int c(tne tneVar) {
            if (tneVar.f17071c.top + vne.this.I + vne.this.E < vne.this.f.bottom) {
                return 0;
            }
            return ((vne.this.f.bottom - vne.this.E) - vne.this.I) - tneVar.f17071c.top;
        }
    }

    public class f implements sne {
        public f() {
        }

        @Override // com.oplus.aiunit.vision.sne
        public void a(@NonNull tne tneVar) {
            tneVar.f17072e.set(0, 0, vne.this.D, vne.this.E);
            tneVar.f17072e.offset(b(tneVar), c(tneVar));
        }

        public final int b(tne tneVar) {
            int i;
            int i2;
            if (vne.this.K()) {
                return tneVar.f17071c.left;
            }
            if (vne.this.P) {
                if ((tneVar.d.right - vne.this.J) + vne.this.D < vne.this.f.right) {
                    i = tneVar.d.right;
                    i2 = vne.this.J;
                } else {
                    i = tneVar.d.left + vne.this.J;
                    i2 = vne.this.D;
                }
            } else if ((tneVar.d.left + vne.this.J) - vne.this.D > vne.this.f.left) {
                i = tneVar.d.left + vne.this.J;
                i2 = vne.this.D;
            } else {
                i = tneVar.d.right;
                i2 = vne.this.J;
            }
            return i - i2;
        }

        public final int c(tne tneVar) {
            int iD;
            int i;
            if (vne.this.K()) {
                iD = d(tneVar);
                if ((iD - vne.this.K) + vne.this.E < vne.this.f.bottom) {
                    i = vne.this.K;
                } else {
                    iD = vne.this.f.bottom;
                    i = vne.this.E;
                }
            } else {
                if (vne.this.g.top + vne.this.E < vne.this.f.bottom) {
                    return vne.this.g.top;
                }
                iD = vne.this.f.bottom;
                i = vne.this.E;
            }
            return iD - i;
        }

        public final int d(tne tneVar) {
            int i = vne.this.g.top;
            Rect rect = tneVar.f17071c;
            return (int) (tneVar.d.top + ((rect.height() > 0 ? tneVar.d.height() / tneVar.f17071c.height() : 1.0f) * (i - rect.top)));
        }
    }

    public class g extends p {
        public g() {
            super(null);
        }

        @Override // com.oplus.aiunit.vision.rne
        public int getBarrierDirection() {
            return -1;
        }

        @Override // com.oplus.aiunit.vision.rne
        @NonNull
        public Rect getDisplayFrame() {
            return vne.this.a;
        }

        @Override // com.oplus.aiunit.vision.rne
        @NonNull
        public Rect getOutsets() {
            return vne.V;
        }

        @Override // com.oplus.aiunit.vision.rne
        public int getType() {
            return 0;
        }
    }

    public class h extends p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Rect f17919j;

        public h() {
            super(null);
            this.f17919j = new Rect();
        }

        @Override // com.oplus.aiunit.vision.rne
        public int getBarrierDirection() {
            return 0;
        }

        @Override // com.oplus.aiunit.vision.rne
        @NonNull
        public Rect getDisplayFrame() {
            this.f17919j.set(0, 0, Math.max(vne.this.F.margin(), vne.this.d.left), Math.abs(vne.this.a.height()));
            return this.f17919j;
        }

        @Override // com.oplus.aiunit.vision.rne
        @NonNull
        public Rect getOutsets() {
            return vne.V;
        }

        @Override // com.oplus.aiunit.vision.rne
        public int getType() {
            return 2;
        }
    }

    public class i extends p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Rect f17920j;

        public i() {
            super(null);
            this.f17920j = new Rect();
        }

        @Override // com.oplus.aiunit.vision.rne
        public int getBarrierDirection() {
            return 2;
        }

        @Override // com.oplus.aiunit.vision.rne
        @NonNull
        public Rect getDisplayFrame() {
            int iMargin = vne.this.F.margin();
            vne vneVar = vne.this;
            int iMax = Math.max(iMargin, vneVar.a.right - vneVar.d.right);
            Rect rect = this.f17920j;
            Rect rect2 = vne.this.a;
            int i = rect2.right;
            rect.set(i - iMax, 0, i, Math.abs(rect2.height()));
            return this.f17920j;
        }

        @Override // com.oplus.aiunit.vision.rne
        @NonNull
        public Rect getOutsets() {
            return vne.V;
        }

        @Override // com.oplus.aiunit.vision.rne
        public int getType() {
            return 2;
        }
    }

    public class j extends p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Rect f17921j;

        public j() {
            super(null);
            this.f17921j = new Rect();
        }

        @Override // com.oplus.aiunit.vision.rne
        public int getBarrierDirection() {
            return 1;
        }

        @Override // com.oplus.aiunit.vision.rne
        @NonNull
        public Rect getDisplayFrame() {
            this.f17921j.set(0, 0, Math.abs(vne.this.a.width()), vne.this.d.top + vne.this.G);
            return this.f17921j;
        }

        @Override // com.oplus.aiunit.vision.rne
        @NonNull
        public Rect getOutsets() {
            return vne.V;
        }

        @Override // com.oplus.aiunit.vision.rne
        public int getType() {
            return 2;
        }
    }

    public class k extends p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Rect f17922j;

        public k() {
            super(null);
            this.f17922j = new Rect();
        }

        @Override // com.oplus.aiunit.vision.rne
        public int getBarrierDirection() {
            if (vne.this.T == null) {
                return -1;
            }
            if (!vne.this.T.getBoundingRectTop().isEmpty()) {
                return 1;
            }
            if (!vne.this.T.getBoundingRectBottom().isEmpty()) {
                return 3;
            }
            if (vne.this.T.getBoundingRectLeft().isEmpty()) {
                return !vne.this.T.getBoundingRectRight().isEmpty() ? 2 : -1;
            }
            return 0;
        }

        @Override // com.oplus.aiunit.vision.rne
        @NonNull
        public Rect getDisplayFrame() {
            if (vne.this.T == null) {
                return this.f17922j;
            }
            if (!vne.this.T.getBoundingRectTop().isEmpty()) {
                this.f17922j.set(0, 0, vne.this.a.width(), Math.max(vne.this.d.top, vne.this.T.getBoundingRectTop().bottom));
            } else if (!vne.this.T.getBoundingRectBottom().isEmpty()) {
                this.f17922j.set(0, vne.this.T.getBoundingRectBottom().top, Math.abs(vne.this.a.width()), vne.this.a.bottom);
            } else if (!vne.this.T.getBoundingRectLeft().isEmpty()) {
                this.f17922j.set(0, 0, vne.this.T.getBoundingRectLeft().right, Math.abs(vne.this.a.height()));
            } else if (!vne.this.T.getBoundingRectRight().isEmpty()) {
                Rect rect = this.f17922j;
                int i = vne.this.T.getBoundingRectRight().left;
                Rect rect2 = vne.this.a;
                rect.set(i, 0, rect2.right, Math.abs(rect2.height()));
            }
            return this.f17922j;
        }

        @Override // com.oplus.aiunit.vision.rne
        @NonNull
        public Rect getOutsets() {
            return vne.V;
        }

        @Override // com.oplus.aiunit.vision.rne
        public int getType() {
            return 2;
        }
    }

    public class l extends p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Rect f17923j;
        public final Rect k;

        public l() {
            super(null);
            this.f17923j = new Rect();
            this.k = new Rect(0, vne.this.H, 0, 0);
        }

        @Override // com.oplus.aiunit.vision.rne
        public int getBarrierDirection() {
            return 3;
        }

        @Override // com.oplus.aiunit.vision.rne
        @NonNull
        public Rect getDisplayFrame() {
            vne vneVar = vne.this;
            int i = vneVar.a.bottom - vneVar.d.bottom;
            Rect rect = this.f17923j;
            Rect rect2 = vne.this.a;
            rect.set(0, rect2.bottom - i, Math.abs(rect2.width()), vne.this.a.bottom);
            return this.f17923j;
        }

        @Override // com.oplus.aiunit.vision.rne
        @NonNull
        public Rect getOutsets() {
            return this.k;
        }

        @Override // com.oplus.aiunit.vision.rne
        public int getType() {
            return 2;
        }
    }

    public class m extends p {
        public m() {
            super(null);
        }

        @Override // com.oplus.aiunit.vision.rne
        public int getBarrierDirection() {
            return -1;
        }

        @Override // com.oplus.aiunit.vision.rne
        @NonNull
        public Rect getDisplayFrame() {
            return vne.this.f17913e;
        }

        @Override // com.oplus.aiunit.vision.rne
        @NonNull
        public Rect getOutsets() {
            return vne.V;
        }

        @Override // com.oplus.aiunit.vision.rne
        public int getType() {
            return 1;
        }
    }

    public class n extends p {
        public n() {
            super(null);
        }

        @Override // com.oplus.aiunit.vision.rne
        public int getBarrierDirection() {
            return -1;
        }

        @Override // com.oplus.aiunit.vision.rne
        @NonNull
        public Rect getDisplayFrame() {
            return vne.this.f17913e;
        }

        @Override // com.oplus.aiunit.vision.rne
        @NonNull
        public Rect getOutsets() {
            return vne.W;
        }

        @Override // com.oplus.aiunit.vision.rne
        public int getType() {
            return 1;
        }
    }

    public class o extends p {
        public o() {
            super(null);
        }

        @Override // com.oplus.aiunit.vision.rne
        public int getBarrierDirection() {
            return -1;
        }

        @Override // com.oplus.aiunit.vision.rne
        @NonNull
        public Rect getDisplayFrame() {
            return vne.this.g;
        }

        @Override // com.oplus.aiunit.vision.rne
        @NonNull
        public Rect getOutsets() {
            return vne.V;
        }

        @Override // com.oplus.aiunit.vision.rne
        public int getType() {
            return 3;
        }
    }

    static {
        U = bj2.LOG_DEBUG || bj2.e("PopupMenuLocateHelper", 3);
        V = new Rect();
        W = new Rect();
    }

    public vne(Context context) {
        this.G = 0;
        this.H = 0;
        this.I = 0;
        this.J = 0;
        this.K = 0;
        this.L = 0;
        this.G = context.getResources().getDimensionPixelOffset(R$dimen.coui_popup_list_window_top_status_bar_margin);
        this.H = context.getResources().getDimensionPixelOffset(R$dimen.coui_popup_list_window_bottom_navigation_bar_margin);
        this.I = context.getResources().getDimensionPixelOffset(R$dimen.coui_popup_list_window_min_gap_to_top);
        this.L = context.getResources().getDimensionPixelOffset(R$dimen.coui_popup_list_window_main_menu_shrink_width);
        this.J = context.getResources().getDimensionPixelOffset(R$dimen.coui_popup_list_window_horizontal_overlap_between_main_and_sub_menu);
        this.K = context.getResources().getDimensionPixelOffset(R$dimen.coui_popup_list_window_vertical_overlap_between_main_and_sub_menu);
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R$dimen.coui_popup_list_window_default_vertical_gap_to_anchor);
        W.set(0, dimensionPixelOffset, 0, dimensionPixelOffset);
        a0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L(tne tneVar) {
        int i2 = this.M;
        tneVar.f17073j = i2;
        tneVar.k = this.N;
        int iMin = Math.min(Math.max(this.f.left, tneVar.f17071c.left + i2), this.f.right - tneVar.f17071c.width());
        int iMin2 = Math.min(Math.max(this.f.top, tneVar.f17071c.top + this.N), this.f.bottom - tneVar.f17071c.height());
        Rect rect = tneVar.f17071c;
        rect.set(iMin, iMin2, rect.width() + iMin, tneVar.f17071c.height() + iMin2);
    }

    public final void A() {
        this.f17912c.a(this.t, this.b).a(this.z, this.b).a(this.A, this.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void B(View view) {
        if (view.getVisibility() != 0) {
            return;
        }
        if (view instanceof rne) {
            rne rneVar = (rne) view;
            if (rneVar.getType() == 2) {
                this.f17912c.a(rneVar, this.b);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                B(viewGroup.getChildAt(i2));
            }
        }
    }

    public tne C() {
        return this.b;
    }

    public final void D(View view, Rect rect) {
        view.getGlobalVisibleRect(rect);
        view.getLocationInWindow(this.k);
        int[] iArr = this.k;
        rect.offset(iArr[0] - rect.left, iArr[1] - rect.top);
        int iWidth = rect.left;
        int iHeight = rect.top;
        if (view.getWidth() != 0 && view.getScaleX() != 0.0f) {
            float pivotX = view.getPivotX() / view.getWidth();
            iWidth = (int) ((rect.left + (rect.width() * pivotX)) - ((rect.width() * pivotX) / view.getScaleX()));
        }
        if (view.getHeight() != 0 && view.getScaleY() != 0.0f) {
            float pivotY = view.getPivotY() / view.getHeight();
            iHeight = (int) ((rect.top + (rect.height() * pivotY)) - ((rect.height() * pivotY) / view.getScaleY()));
        }
        rect.set(iWidth, iHeight, view.getWidth() + iWidth, view.getHeight() + iHeight);
        if (U) {
            Log.d("PopupMenuLocateHelper", "bounds with scale transform = " + rect + ",mAnchorLocationInWindow:" + Arrays.toString(this.k) + " origin width = " + view.getWidth() + " origin height = " + view.getHeight() + " offset x = " + iWidth + " offset y = " + iHeight + " bounds = " + rect);
        }
    }

    public int E() {
        return this.C;
    }

    public int F() {
        return this.B;
    }

    public int G() {
        return this.b.d();
    }

    public int H() {
        return K() ? this.b.d() : this.b.d() - this.I;
    }

    public int I() {
        return this.E;
    }

    public int J() {
        return this.D;
    }

    public boolean K() {
        ResponsiveUIModel responsiveUIModel = this.F;
        return responsiveUIModel != null && responsiveUIModel.windowSizeClass().getWindowTotalSizeClass() == WindowTotalSizeClass.Compact;
    }

    public void M(int i2, int i3, boolean z, int i4, int i5) {
        this.O = z;
        this.M = i4;
        this.N = i5;
        this.b.c(this.f);
        this.B = Math.min(i2, Math.abs(this.f.width()));
        this.C = Math.min(i3, Math.abs(this.f.height()));
        z();
        this.b.a();
        this.f17912c.f();
    }

    public void N(View view, int i2, int i3, boolean z) {
        this.P = z;
        boolean zK = K();
        R(view);
        this.D = Math.min(i2, Math.abs(this.f.width()));
        this.E = Math.min(i3, Math.abs(this.f.height()) - (zK ? this.I : 0));
        A();
        this.b.a();
    }

    public void O(View view, int i2, int i3, View view2) {
        View rootView = view2 != null ? view2 : view.getRootView();
        rootView.getLocationOnScreen(this.i);
        rootView.getGlobalVisibleRect(this.a);
        rootView.getWindowVisibleDisplayFrame(this.d);
        if (U) {
            Log.d("PopupMenuLocateHelper", "limited window = " + rootView + " anchor = " + view + " window location = (" + this.i[0] + ", " + this.i[1] + ") anchor location = (" + this.f17914j[0] + ", " + this.f17914j[1] + ") final offset = (" + i2 + ", " + i3 + ") use window barrier = " + this.Q + " center align = " + this.R + " mApplicationWindow [left " + this.a.left + " top " + this.a.top + " right " + this.a.right + " bottom " + this.a.bottom + "]");
        }
        P(view, i2, i3, view2);
        if (view.getRootWindowInsets() != null) {
            this.T = view.getRootWindowInsets().getDisplayCutout();
        }
        this.f17912c.e();
        y(view, i2, i3);
        B(view.getRootView());
    }

    public final void P(View view, int i2, int i3, View view2) {
        D(view, this.f17913e);
        if (i2 != Integer.MIN_VALUE && i3 != Integer.MIN_VALUE) {
            Rect rect = this.f17913e;
            int i4 = rect.left;
            int i5 = rect.top;
            rect.set(i4 + i2, i5 + i3, i4 + i2, i5 + i3);
        }
        Rect rect2 = this.d;
        int[] iArr = this.i;
        rect2.offset(-iArr[0], -iArr[1]);
        Rect rect3 = this.d;
        rect3.bottom = Math.min(rect3.bottom, this.a.bottom);
        ResponsiveUIModel responsiveUIModel = this.F;
        if (responsiveUIModel == null) {
            ResponsiveUIModel responsiveUIModel2 = new ResponsiveUIModel(view.getContext(), Math.abs(this.a.width()), Math.abs(this.a.height()));
            this.F = responsiveUIModel2;
            responsiveUIModel2.chooseMargin(MarginType.MARGIN_SMALL);
        } else {
            responsiveUIModel.rebuild(Math.abs(this.a.width()), Math.abs(this.a.height()));
        }
        if (view.getRootView().isAttachedToWindow()) {
            return;
        }
        Log.d("PopupMenuLocateHelper", "Detected an unattached anchor, could be a dummy anchor");
        this.S = true;
    }

    public void Q(boolean z) {
        this.b.f17074l = z;
    }

    public final void R(View view) {
        view.getGlobalVisibleRect(this.g);
    }

    public final void S() {
        this.r = new m();
    }

    public final void T() {
        this.s = new n();
    }

    public final void U() {
        this.w = new a();
    }

    public final void V() {
        this.x = new b();
    }

    public final void W() {
        this.y = new sne() { // from class: com.oplus.aiunit.vision.une
            @Override // com.oplus.aiunit.vision.sne
            public final void a(tne tneVar) {
                this.i.L(tneVar);
            }
        };
    }

    public final void X() {
        this.u = new c();
    }

    public final void Y() {
        this.v = new d();
    }

    public final void Z() {
        this.z = new e();
    }

    public final void a0() {
        e0();
        g0();
        h0();
        i0();
        d0();
        f0();
        S();
        T();
        c0();
        X();
        Y();
        W();
        Z();
        b0();
        U();
        V();
    }

    public final void b0() {
        this.A = new f();
    }

    public final void c0() {
        this.t = new o();
    }

    public final void d0() {
        this.p = new l();
    }

    public final void e0() {
        this.f17915l = new g();
    }

    public final void f0() {
        this.q = new k();
    }

    public final void g0() {
        this.m = new h();
    }

    public final void h0() {
        this.f17916n = new i();
    }

    public final void i0() {
        this.o = new j();
    }

    public boolean x(View view, int i2, int i3, View view2) {
        boolean z = true;
        if (view == null) {
            bj2.c("PopupMenuLocateHelper", "Anchor is null!");
            return true;
        }
        if (view2 == null) {
            view2 = view.getRootView();
        }
        view2.getWindowVisibleDisplayFrame(this.h);
        if (this.h.width() == this.d.width() && this.h.height() == this.d.height()) {
            z = false;
        } else {
            bj2.g("PopupMenuLocateHelper", "Visible bounds changed!");
        }
        bj2.a("PopupMenuLocateHelper", " old content visible bounds = " + this.d + " new content visible bounds = " + this.h);
        this.d.set(this.h);
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void y(View view, int i2, int i3) {
        this.b.i();
        this.f17912c.a(this.f17915l, this.b);
        if (!this.S && this.Q) {
            this.f17912c.a(this.m, this.b).a(this.o, this.b).a(this.f17916n, this.b).a(this.p, this.b).a(this.q, this.b);
        }
        if (view instanceof rne) {
            rne rneVar = (rne) view;
            if (rneVar.getType() == 1) {
                this.f17912c.a(rneVar, this.b);
                return;
            }
        }
        if (i2 == Integer.MIN_VALUE || i3 == Integer.MIN_VALUE) {
            this.f17912c.a(this.s, this.b);
        } else {
            this.f17912c.a(this.r, this.b);
        }
    }

    public final void z() {
        if (this.R) {
            this.f17912c.a(this.w, this.b).a(this.x, this.b);
        } else {
            this.f17912c.a(this.u, this.b).a(this.v, this.b);
        }
        this.f17912c.a(this.y, this.b);
    }

    public static class p implements rne {
        public boolean i;

        public p() {
            this.i = true;
        }

        @Override // com.oplus.aiunit.vision.rne
        public boolean getPopupMenuRuleEnabled() {
            return this.i;
        }

        public /* synthetic */ p(g gVar) {
            this();
        }
    }
}
