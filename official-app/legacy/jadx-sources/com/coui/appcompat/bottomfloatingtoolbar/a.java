package com.coui.appcompat.bottomfloatingtoolbar;

import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: loaded from: classes13.dex */
public class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Drawable f1567c;
    public CharSequence d;
    public View h;
    public int a = -1;
    public int b = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f1568e = "";
    public boolean f = false;
    public boolean g = false;

    /* JADX INFO: renamed from: com.coui.appcompat.bottomfloatingtoolbar.a$a, reason: collision with other inner class name */
    public static class C0193a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Drawable f1569c;
        public CharSequence d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public CharSequence f1570e;
        public View h;
        public int a = -1;
        public int b = 0;
        public boolean f = false;
        public boolean g = true;

        public a i() {
            a aVar = new a();
            aVar.b(this);
            return aVar;
        }

        public C0193a j() {
            this.a = -1;
            this.b = 0;
            this.f1569c = null;
            this.d = "";
            this.f1570e = "";
            this.f = false;
            this.g = true;
            this.h = null;
            return this;
        }

        public C0193a k(CharSequence charSequence) {
            this.f1570e = charSequence;
            return this;
        }

        public C0193a l(boolean z) {
            this.g = z;
            return this;
        }

        public C0193a m(int i) {
            this.b = i;
            return this;
        }

        public C0193a n(Drawable drawable) {
            this.f1569c = drawable;
            return this;
        }

        public C0193a o(int i) {
            this.a = i;
            return this;
        }

        public C0193a p(String str) {
            this.d = str;
            return this;
        }
    }

    public final void b(C0193a c0193a) {
        this.a = c0193a.a;
        this.b = c0193a.b;
        this.f1567c = c0193a.f1569c;
        this.d = c0193a.d;
        this.f1568e = c0193a.f1570e;
        this.f = c0193a.f;
        this.g = c0193a.g;
        View view = c0193a.h;
        this.h = view;
        if (view != null) {
            view.setId(c0193a.a);
        }
    }

    public CharSequence c() {
        return this.f1568e;
    }

    public int d() {
        return this.b;
    }

    public Drawable e() {
        return this.f1567c;
    }

    public int f() {
        return this.a;
    }

    public CharSequence g() {
        return this.d;
    }

    public View h() {
        View view = this.h;
        if (view != null) {
            view.setId(this.a);
        }
        return this.h;
    }

    public boolean i() {
        return this.g;
    }

    public boolean j() {
        return this.f;
    }

    public String toString() {
        return "COUIBottomFloatingToolbarItem{mDescription=" + ((Object) this.f1568e) + ", mId=" + this.a + ", mGroupId=" + this.b + ", mIcon=" + this.f1567c + ", mTitle='" + ((Object) this.d) + "', mShowRedDot=" + this.f + ", mEnabled=" + this.g + ", mView=" + this.h + '}';
    }
}
