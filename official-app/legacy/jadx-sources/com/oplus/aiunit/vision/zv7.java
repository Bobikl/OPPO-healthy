package com.oplus.aiunit.vision;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;

/* JADX INFO: loaded from: classes13.dex */
public class zv7 {
    public static final String a = "zv7";
    public static Rect b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Rect f19561c;
    public static Rect g;
    public static int[] d = new int[2];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int[] f19562e = new int[2];
    public static Point f = new Point();
    public static Rect h = new Rect();
    public static Rect i = new Rect();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int[] f19563j = new int[2];

    public static Point a(Context context, int i2, int i3, boolean z) {
        int i4;
        if (f19561c == null) {
            Log.e(a, "The AnchorRectInWindow is null");
            return null;
        }
        Point point = new Point();
        int i5 = f.x - (i2 / 2);
        int i6 = j() ? f.y : f19561c.bottom;
        int i7 = j() ? f.y : f19561c.top;
        int iB = b() - i6;
        Rect rect = i;
        int i8 = rect.top;
        int i9 = rect.bottom;
        if (iB < i3 + i8 + i9) {
            i6 = (i7 - i3) - i9;
        } else if (i8 + i6 + i3 < b()) {
            i6 += i.top;
        }
        int iMax = Math.max(c() + i.left, Math.min(i5, (d() - i.right) - i2));
        if (z && k(context) && (i4 = d[0]) > 0) {
            iMax += i4;
        }
        point.set(iMax, Math.max(e() + i.top, i6));
        return point;
    }

    public static int b() {
        Rect rect = b;
        if (rect == null) {
            bj2.c(a, "The sDecorViewRectInWindow is null, must calling init() first");
            return 0;
        }
        Rect rect2 = g;
        return (rect2 != null ? rect2.bottom : rect.bottom) - h.bottom;
    }

    public static int c() {
        Rect rect = b;
        if (rect == null) {
            bj2.c(a, "The sDecorViewRectInWindow is null, must calling init() first");
            return 0;
        }
        Rect rect2 = g;
        return (rect2 != null ? rect2.left : rect.left) + h.left;
    }

    public static int d() {
        Rect rect = b;
        if (rect == null) {
            bj2.c(a, "The sDecorViewRectInWindow is null, must calling init() first");
            return 0;
        }
        Rect rect2 = g;
        return (rect2 != null ? rect2.right : rect.right) - h.right;
    }

    public static int e() {
        Rect rect = b;
        if (rect == null) {
            bj2.c(a, "The sDecorViewRectInWindow is null, must calling init() first");
            return 0;
        }
        Rect rect2 = g;
        return (rect2 != null ? rect2.top : rect.top) + h.top;
    }

    public static int f() {
        if (j()) {
            return f19562e[0] + f19563j[0];
        }
        Rect rect = f19561c;
        if (rect != null) {
            return rect.centerX();
        }
        bj2.c(a, "The AnchorRectInWindow is null, must calling init() first");
        return 0;
    }

    public static int g() {
        if (j()) {
            return f19562e[1] + f19563j[1];
        }
        Rect rect = f19561c;
        if (rect != null) {
            return rect.centerY();
        }
        bj2.c(a, "The AnchorRectInWindow is null, must calling init() first");
        return 0;
    }

    public static Rect h() {
        return b;
    }

    public static int[] i() {
        return d;
    }

    public static boolean j() {
        int[] iArr = f19562e;
        return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
    }

    public static boolean k(Context context) {
        double d2 = context.getResources().getConfiguration().screenWidthDp;
        double dN = ifk.n(context) / context.getResources().getDisplayMetrics().density;
        return d2 == Math.floor(dN) || d2 == Math.ceil(dN);
    }

    public static void l(View view) {
        m(view, 0, 0);
    }

    public static void m(View view, int i2, int i3) {
        DisplayCutout displayCutout;
        n();
        if (i2 != 0 || i3 != 0) {
            p(i2, i3);
        }
        int[] iArr = new int[2];
        b = new Rect();
        f19561c = new Rect();
        view.getWindowVisibleDisplayFrame(b);
        view.getGlobalVisibleRect(f19561c);
        Rect rect = new Rect();
        view.getRootView().getGlobalVisibleRect(rect);
        view.getRootView().getLocationOnScreen(iArr);
        rect.offset(iArr[0], iArr[1]);
        Rect rect2 = b;
        rect2.left = Math.max(rect2.left, rect.left);
        Rect rect3 = b;
        rect3.top = Math.max(rect3.top, rect.top);
        Rect rect4 = b;
        rect4.right = Math.min(rect4.right, rect.right);
        Rect rect5 = b;
        rect5.bottom = Math.min(rect5.bottom, rect.bottom);
        view.getRootView().getLocationOnScreen(iArr);
        int i4 = iArr[0];
        int i5 = iArr[1];
        view.getRootView().getLocationInWindow(iArr);
        int i6 = iArr[0];
        int i7 = iArr[1];
        int[] iArr2 = d;
        int i8 = i4 - i6;
        iArr2[0] = i8;
        int i9 = i5 - i7;
        iArr2[1] = i9;
        b.offset(-i8, -i9);
        view.getLocationInWindow(f19563j);
        f.x = f();
        f.y = g();
        if (view.getRootWindowInsets() == null || (displayCutout = view.getRootWindowInsets().getDisplayCutout()) == null) {
            return;
        }
        for (Rect rect6 : displayCutout.getBoundingRects()) {
            int i10 = rect6.top;
            if (i10 == 0) {
                Rect rect7 = b;
                rect7.top = Math.max(rect7.top, rect6.bottom);
            } else {
                int i11 = rect6.bottom;
                Rect rect8 = b;
                int i12 = rect8.bottom;
                if (i11 == i12) {
                    rect8.bottom = Math.min(i12, i10);
                } else {
                    int i13 = rect6.left;
                    if (i13 == 0) {
                        rect8.left = Math.max(rect8.left, rect6.right);
                    } else {
                        int i14 = rect6.right;
                        int i15 = rect8.right;
                        if (i14 == i15) {
                            rect8.right = Math.min(i15, i13);
                        }
                    }
                }
            }
        }
    }

    public static void n() {
        p(0, 0);
        o(null);
        h.set(0, 0, 0, 0);
        i.set(0, 0, 0, 0);
    }

    public static void o(Rect rect) {
        g = rect;
    }

    public static void p(int i2, int i3) {
        int[] iArr = f19562e;
        iArr[0] = i2;
        iArr[1] = i3;
    }
}
