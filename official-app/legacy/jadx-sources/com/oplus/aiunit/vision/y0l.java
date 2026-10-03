package com.oplus.aiunit.vision;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.Observer;
import com.heytap.health.base.R$id;
import com.heytap.health.base.base.BaseViewSizeControl;
import com.heytap.health.base.resposiveui.config.NearUIConfig;

/* JADX INFO: loaded from: classes15.dex */
public class y0l {
    public static final int a = R$id.lib_base_vsc_fill;
    public static final int b = R$id.lib_base_vsc_clip;

    public static final class a {
        public int a;
        public int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f18820c;
        public int d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f18821e;
        public int f;
        public boolean g;

        public a() {
        }

        public boolean a() {
            return this.g;
        }

        public int b() {
            return this.f;
        }

        public int c() {
            return this.f18821e;
        }

        public int d() {
            return this.d;
        }

        public int e() {
            return this.f18820c;
        }

        public int f() {
            return this.a;
        }

        public int g() {
            return this.b;
        }

        public void h(boolean z) {
            this.g = z;
        }

        public void i(int i) {
            this.f = i;
        }

        public void j(int i) {
            this.f18821e = i;
        }

        public void k(int i) {
            this.d = i;
        }

        public void l(int i) {
            this.f18820c = i;
        }

        public void m(int i) {
            this.a = i;
        }

        public void n(int i) {
            this.b = i;
        }
    }

    public static void d(BaseViewSizeControl baseViewSizeControl, final View view) {
        if (k()) {
            o(view, b);
            com.heytap.health.base.resposiveui.config.a.m(view.getContext()).q().observe(baseViewSizeControl, new Observer() { // from class: com.oplus.aiunit.vision.w0l
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    y0l.l(view, (NearUIConfig.Status) obj);
                }
            });
        }
    }

    public static void e(BaseViewSizeControl baseViewSizeControl, final View view) {
        if (k()) {
            o(view, b);
            o(view, a);
            com.heytap.health.base.resposiveui.config.a.m(view.getContext()).q().observe(baseViewSizeControl, new Observer() { // from class: com.oplus.aiunit.vision.u0l
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    y0l.m(view, (NearUIConfig.Status) obj);
                }
            });
        }
    }

    public static void f(BaseViewSizeControl baseViewSizeControl, final View view) {
        if (k()) {
            o(view, a);
            com.heytap.health.base.resposiveui.config.a.m(view.getContext()).q().observe(baseViewSizeControl, new Observer() { // from class: com.oplus.aiunit.vision.v0l
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    y0l.n(view, (NearUIConfig.Status) obj);
                }
            });
        }
    }

    public static void g(View view, NearUIConfig.Status status) {
        a aVarJ = j(view, b);
        if (status == NearUIConfig.Status.UNFOLD) {
            int i = i(view.getContext());
            view.setPaddingRelative(aVarJ.f() + i, aVarJ.g(), aVarJ.e() + i, aVarJ.d());
        } else if (status == NearUIConfig.Status.FOLD) {
            view.setPaddingRelative(aVarJ.f(), aVarJ.g(), aVarJ.e(), aVarJ.d());
        }
    }

    public static void h(View view, NearUIConfig.Status status) {
        a aVarJ = j(view, a);
        ViewParent parent = view.getParent();
        if (status == NearUIConfig.Status.UNFOLD) {
            int i = i(view.getContext());
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).setClipToPadding(false);
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            marginLayoutParams.setMarginStart(aVarJ.c() - i);
            marginLayoutParams.setMarginEnd(aVarJ.b() - i);
            view.setLayoutParams(marginLayoutParams);
            return;
        }
        if (status == NearUIConfig.Status.FOLD) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).setClipToPadding(aVarJ.a());
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            marginLayoutParams2.setMarginStart(aVarJ.c());
            marginLayoutParams2.setMarginEnd(aVarJ.b());
            view.setLayoutParams(marginLayoutParams2);
        }
    }

    public static int i(Context context) {
        return ejg.a(context, ((((context.getResources().getConfiguration().screenWidthDp - 48) - 56) * 1.0f) / 8.0f) + 8.0f + 8.0f);
    }

    public static a j(View view, int i) {
        return (a) view.getTag(i);
    }

    public static boolean k() {
        return true;
    }

    public static /* synthetic */ void l(View view, NearUIConfig.Status status) {
        a7b.f("ViewSizeControl", "autoClipContent.onChanged() called with: status = [" + status + "]");
        g(view, status);
    }

    public static /* synthetic */ void m(View view, NearUIConfig.Status status) {
        a7b.f("ViewSizeControl", "autoClipContent.onChanged() called with: status = [" + status + "]");
        g(view, status);
        h(view, status);
    }

    public static /* synthetic */ void n(View view, NearUIConfig.Status status) {
        a7b.f("ViewSizeControl", "autoFillScreenWidth.onChanged() called with: status = [" + status + "]");
        h(view, status);
    }

    public static void o(View view, int i) {
        if (j(view, i) != null) {
            a7b.f("ViewSizeControl", "saveViewDefault, has saved current key view");
            return;
        }
        a aVar = new a();
        if (i == b) {
            aVar.m(view.getPaddingStart());
            aVar.n(view.getPaddingTop());
            aVar.l(view.getPaddingEnd());
            aVar.k(view.getPaddingBottom());
        } else if (i == a) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                aVar.h(((ViewGroup) parent).getClipChildren());
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            aVar.j(marginLayoutParams.getMarginStart());
            aVar.i(marginLayoutParams.getMarginEnd());
        }
        view.setTag(i, aVar);
    }
}
