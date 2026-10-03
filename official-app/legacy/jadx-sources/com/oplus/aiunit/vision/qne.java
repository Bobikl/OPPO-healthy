package com.oplus.aiunit.vision;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class qne {
    public static final int MENU_GROUP_ITEM_ACTIVATED_IN_MAIN = 1;
    public static final int MENU_GROUP_ITEM_ACTIVATED_IN_SUB = 2;
    public static final int MENU_GROUP_ITEM_INACTIVE = 0;
    public static final int MENU_HINT_TYPE_CUSTOM = 1;
    public static final int MENU_HINT_TYPE_NONE = -1;
    public static final int MENU_HINT_TYPE_RED_DOT = 0;
    public static final int MENU_ITEM_FORCE_TINT_ALL = 7;
    public static final int MENU_ITEM_FORCE_TINT_ICON = 1;
    public static final int MENU_ITEM_FORCE_TINT_NONE = 0;
    public static final int MENU_ITEM_FORCE_TINT_STATE_ICON = 4;
    public static final int MENU_ITEM_FORCE_TINT_TITLE = 2;
    public static final int MENU_ITEM_TYPE_ALERT = 1;
    public static final int MENU_ITEM_TYPE_CUSTOM = 2;
    public static final int MENU_ITEM_TYPE_DEFAULT = 0;
    public static final int MENU_ITEM_TYPE_HEADER = 3;
    public int a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15866c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15867e;
    public int f;
    public View g;
    public View h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f15868j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Drawable f15869l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Drawable f15870n;
    public String o;
    public String p;
    public String q;
    public ColorStateList r;
    public String s;
    public boolean t;
    public boolean u;
    public ArrayList<qne> v;

    public static class a {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public String f15875n;
        public String o;
        public String p;
        public String q;
        public String r;
        public int a = -1;
        public int b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f15871c = 0;
        public int d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f15872e = -1;
        public int f = 7;
        public int g = 0;
        public int h = -1;
        public boolean i = true;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f15873j = false;
        public Drawable k = null;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Drawable f15874l = null;
        public ColorStateList m = null;
        public ArrayList<qne> s = null;
        public View t = null;
        public View u = null;

        public a A(int i) {
            this.f15871c = i;
            return this;
        }

        public a B(int i) {
            this.h = i;
            return this;
        }

        public a C(Drawable drawable) {
            this.k = drawable;
            return this;
        }

        public a D(int i) {
            this.a = i;
            return this;
        }

        public a E(boolean z) {
            this.f15873j = z;
            return this;
        }

        public a F(boolean z) {
            this.i = z;
            return this;
        }

        public a G(int i) {
            this.f15872e = i;
            return this;
        }

        public a H(ArrayList<qne> arrayList) {
            this.s = arrayList;
            return this;
        }

        public a I(String str) {
            this.f15875n = str;
            return this;
        }

        public qne x() {
            qne qneVar = new qne();
            qneVar.b(this);
            return qneVar;
        }

        public a y() {
            this.a = -1;
            this.b = 0;
            this.k = null;
            this.i = true;
            this.f15875n = null;
            this.q = null;
            this.g = 0;
            this.m = null;
            this.f15873j = false;
            this.d = 0;
            this.f15874l = null;
            this.h = -1;
            this.r = null;
            this.f15872e = -1;
            this.f = 7;
            this.t = null;
            this.f15871c = 0;
            this.s = null;
            this.u = null;
            return this;
        }

        public a z(String str) {
            this.q = str;
            return this;
        }
    }

    public qne() {
        this.a = -1;
        this.b = 0;
        this.f15866c = 0;
        this.d = -1;
        this.f15867e = 0;
        this.f = 7;
        this.i = -1;
        this.k = 0;
        this.m = 0;
    }

    public void A(int i) {
        this.f15867e = i;
    }

    public void B(int i) {
        this.f15866c = i;
    }

    public void C(int i) {
        this.i = i;
    }

    public final void b(a aVar) {
        this.a = aVar.a;
        this.k = aVar.b;
        this.f15869l = aVar.k;
        this.u = aVar.i;
        this.o = aVar.f15875n;
        this.p = aVar.o;
        this.q = aVar.p;
        this.s = aVar.q;
        this.f15866c = aVar.g;
        this.t = aVar.f15873j;
        this.m = aVar.d;
        this.f15870n = aVar.f15874l;
        this.d = aVar.h;
        this.f15868j = aVar.r;
        this.i = aVar.f15872e;
        this.f = aVar.f;
        ColorStateList colorStateList = aVar.m;
        this.r = colorStateList;
        if (colorStateList != null) {
            this.f &= -3;
        }
        if (this.d == 1) {
            this.h = aVar.t;
            aVar.t = null;
        }
        this.b = aVar.f15871c;
        if (aVar.s != null) {
            this.v = aVar.s;
            aVar.s = null;
        }
        this.g = aVar.u;
    }

    public View c() {
        return this.h;
    }

    public View d() {
        return this.g;
    }

    public String e() {
        return this.s;
    }

    public String f() {
        return this.q;
    }

    public int g() {
        return this.f;
    }

    public int h() {
        return this.b;
    }

    public int i() {
        return this.f15867e;
    }

    public int j() {
        return this.d;
    }

    public Drawable k() {
        return this.f15869l;
    }

    public int l() {
        return this.k;
    }

    public int m() {
        return this.f15866c;
    }

    public int n() {
        return this.i;
    }

    public String o() {
        return this.f15868j;
    }

    public Drawable p() {
        return this.f15870n;
    }

    public int q() {
        return this.m;
    }

    public ArrayList<qne> r() {
        return this.v;
    }

    public String s() {
        return this.o;
    }

    public ColorStateList t() {
        return this.r;
    }

    public String u() {
        return this.p;
    }

    @Deprecated
    public boolean v() {
        return w();
    }

    public boolean w() {
        ArrayList<qne> arrayList = this.v;
        return (arrayList == null || arrayList.isEmpty()) ? false : true;
    }

    public boolean x() {
        return this.t;
    }

    public boolean y() {
        return this.u;
    }

    public void z(boolean z) {
        this.t = z;
    }

    @Deprecated
    public qne(String str, boolean z) {
        this(null, str, z);
    }

    @Deprecated
    public qne(Drawable drawable, String str, boolean z) {
        this(drawable, str, z, -1);
    }

    @Deprecated
    public qne(Drawable drawable, String str, boolean z, int i) {
        this(drawable, str, false, false, i, z);
    }

    @Deprecated
    public qne(Drawable drawable, String str, boolean z, boolean z2) {
        this(drawable, str, z, false, z2);
    }

    @Deprecated
    public qne(Drawable drawable, String str, boolean z, boolean z2, boolean z3) {
        this(drawable, str, z, z2, -1, z3);
    }

    @Deprecated
    public qne(Drawable drawable, String str, boolean z, boolean z2, int i, boolean z3) {
        this(drawable, str, z, z2, i, z3, null);
    }

    @Deprecated
    public qne(Drawable drawable, String str, boolean z, boolean z2, int i, boolean z3, ArrayList<qne> arrayList) {
        this(drawable, str, z, z2, i, z3, arrayList, null);
    }

    @Deprecated
    public qne(Drawable drawable, String str, boolean z, boolean z2, int i, boolean z3, ArrayList<qne> arrayList, String str2) {
        this(drawable, str, z, z2, i, z3, arrayList, str2, null);
    }

    @Deprecated
    public qne(Drawable drawable, String str, boolean z, boolean z2, int i, boolean z3, ArrayList<qne> arrayList, String str2, Drawable drawable2) {
        this(drawable, str, z, z2, i, z3, arrayList, str2, drawable2, -1);
    }

    @Deprecated
    public qne(Drawable drawable, String str, boolean z, boolean z2, int i, boolean z3, ArrayList<qne> arrayList, String str2, Drawable drawable2, int i2) {
        this(drawable, str, z, z2, i, z3, arrayList, str2, drawable2, i2, -1);
    }

    @Deprecated
    public qne(Drawable drawable, String str, boolean z, boolean z2, int i, boolean z3, ArrayList<qne> arrayList, String str2, Drawable drawable2, int i2, int i3) {
        this.a = -1;
        this.f15866c = 0;
        this.d = -1;
        this.f15867e = 0;
        this.f = 7;
        this.k = 0;
        this.m = 0;
        this.f15869l = drawable;
        this.o = str;
        this.t = z2;
        this.u = z3;
        this.i = i;
        this.v = arrayList;
        this.f15868j = str2;
        this.f15870n = drawable2;
        this.b = i3;
    }
}
