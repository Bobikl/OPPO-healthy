package com.coui.appcompat.animation.dynamicanimation;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.View;
import androidx.annotation.FloatRange;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import androidx.dynamicanimation.animation.FloatPropertyCompat;
import androidx.dynamicanimation.animation.FloatValueHolder;
import com.coui.appcompat.animation.dynamicanimation.COUIDynamicAnimation;
import com.oplus.aiunit.vision.cf2;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public abstract class COUIDynamicAnimation<T extends COUIDynamicAnimation<T>> implements com.coui.appcompat.animation.dynamicanimation.a.b {
    public static final float MIN_VISIBLE_CHANGE_ALPHA = 0.00390625f;
    public static final float MIN_VISIBLE_CHANGE_PIXELS = 1.0f;
    public static final float MIN_VISIBLE_CHANGE_ROTATION_DEGREES = 0.1f;
    public static final float MIN_VISIBLE_CHANGE_SCALE = 0.002f;
    public final cf2 a;
    public final ArrayList<s> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f1525c;
    public float d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1526e;
    public final Object f;
    public final FloatPropertyCompat g;
    public boolean h;
    public com.coui.appcompat.animation.dynamicanimation.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f1527j;
    public float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f1528l;
    public long m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f1529n;
    public final ArrayList<q> o;
    public final ArrayList<r> p;
    public long q;
    public boolean r;
    public static final ViewProperty TRANSLATION_X = new g("translationX");
    public static final ViewProperty TRANSLATION_Y = new h("translationY");
    public static final ViewProperty TRANSLATION_Z = new i("translationZ");
    public static final ViewProperty SCALE_X = new j("scaleX");
    public static final ViewProperty SCALE_Y = new k("scaleY");
    public static final ViewProperty ROTATION = new l("rotation");
    public static final ViewProperty ROTATION_X = new m("rotationX");
    public static final ViewProperty ROTATION_Y = new n("rotationY");
    public static final ViewProperty X = new o("x");
    public static final ViewProperty Y = new a("y");
    public static final ViewProperty Z = new b("z");
    public static final ViewProperty ALPHA = new c("alpha");
    public static final ViewProperty SCROLL_X = new d("scrollX");
    public static final ViewProperty SCROLL_Y = new e("scrollY");

    public static abstract class ViewProperty extends FloatPropertyCompat<View> {
        public /* synthetic */ ViewProperty(String str, g gVar) {
            this(str);
        }

        public ViewProperty(String str) {
            super(str);
        }
    }

    public class a extends ViewProperty {
        public a(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public float getValue(View view) {
            return view.getY();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public void setValue(View view, float f) {
            view.setY(f);
        }
    }

    public class b extends ViewProperty {
        public b(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public float getValue(View view) {
            return ViewCompat.getZ(view);
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public void setValue(View view, float f) {
            ViewCompat.setZ(view, f);
        }
    }

    public class c extends ViewProperty {
        public c(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public float getValue(View view) {
            return view.getAlpha();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public void setValue(View view, float f) {
            view.setAlpha(f);
        }
    }

    public class d extends ViewProperty {
        public d(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public float getValue(View view) {
            return view.getScrollX();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public void setValue(View view, float f) {
            view.setScrollX((int) f);
        }
    }

    public class e extends ViewProperty {
        public e(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public float getValue(View view) {
            return view.getScrollY();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public void setValue(View view, float f) {
            view.setScrollY((int) f);
        }
    }

    public class f extends FloatPropertyCompat {
        public final /* synthetic */ FloatValueHolder a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, FloatValueHolder floatValueHolder) {
            super(str);
            this.a = floatValueHolder;
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public float getValue(Object obj) {
            return this.a.getValue();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public void setValue(Object obj, float f) {
            this.a.setValue(f);
        }
    }

    public class g extends ViewProperty {
        public g(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public float getValue(View view) {
            return view.getTranslationX();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public void setValue(View view, float f) {
            view.setTranslationX(f);
        }
    }

    public class h extends ViewProperty {
        public h(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public float getValue(View view) {
            return view.getTranslationY();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public void setValue(View view, float f) {
            view.setTranslationY(f);
        }
    }

    public class i extends ViewProperty {
        public i(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public float getValue(View view) {
            return ViewCompat.getTranslationZ(view);
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public void setValue(View view, float f) {
            ViewCompat.setTranslationZ(view, f);
        }
    }

    public class j extends ViewProperty {
        public j(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public float getValue(View view) {
            return view.getScaleX();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public void setValue(View view, float f) {
            view.setScaleX(f);
        }
    }

    public class k extends ViewProperty {
        public k(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public float getValue(View view) {
            return view.getScaleY();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public void setValue(View view, float f) {
            view.setScaleY(f);
        }
    }

    public class l extends ViewProperty {
        public l(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public float getValue(View view) {
            return view.getRotation();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public void setValue(View view, float f) {
            view.setRotation(f);
        }
    }

    public class m extends ViewProperty {
        public m(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public float getValue(View view) {
            return view.getRotationX();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public void setValue(View view, float f) {
            view.setRotationX(f);
        }
    }

    public class n extends ViewProperty {
        public n(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public float getValue(View view) {
            return view.getRotationY();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public void setValue(View view, float f) {
            view.setRotationY(f);
        }
    }

    public class o extends ViewProperty {
        public o(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public float getValue(View view) {
            return view.getX();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public void setValue(View view, float f) {
            view.setX(f);
        }
    }

    public static class p {
        public float a;
        public float b;
    }

    public interface q {
        void onAnimationEnd(COUIDynamicAnimation cOUIDynamicAnimation, boolean z, float f, float f2);
    }

    public interface r {
        void onAnimationUpdate(COUIDynamicAnimation cOUIDynamicAnimation, float f, float f2);
    }

    public interface s {
        void a(COUIDynamicAnimation cOUIDynamicAnimation, boolean z, float f, float f2);
    }

    public COUIDynamicAnimation(FloatValueHolder floatValueHolder) {
        cf2 cf2Var = new cf2(null);
        this.a = cf2Var;
        this.b = new ArrayList<>();
        this.f1525c = 0.0f;
        this.d = Float.MAX_VALUE;
        this.f1526e = false;
        this.h = false;
        this.i = null;
        this.f1527j = false;
        this.k = Float.MAX_VALUE;
        this.f1528l = -Float.MAX_VALUE;
        this.m = 0L;
        this.o = new ArrayList<>();
        this.p = new ArrayList<>();
        this.q = 0L;
        this.r = false;
        this.f = null;
        this.g = new f("FloatValueHolder", floatValueHolder);
        this.f1529n = 1.0f;
        cf2Var.d();
    }

    public static <T> void l(ArrayList<T> arrayList, T t) {
        int iIndexOf = arrayList.indexOf(t);
        if (iIndexOf >= 0) {
            arrayList.set(iIndexOf, null);
        }
    }

    public static <T> void m(ArrayList<T> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public T a(q qVar) {
        if (!this.o.contains(qVar)) {
            this.o.add(qVar);
        }
        return this;
    }

    public T b(r rVar) {
        if (i()) {
            throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
        }
        if (!this.p.contains(rVar)) {
            this.p.add(rVar);
        }
        return this;
    }

    public void c() {
        if (!this.h && Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be canceled on the main thread");
        }
        if (this.f1527j) {
            d(true);
        }
    }

    public final void d(boolean z) {
        this.f1527j = false;
        e().g(this);
        this.a.e(hashCode());
        this.m = 0L;
        this.f1526e = false;
        k(z);
        for (int i2 = 0; i2 < this.o.size(); i2++) {
            if (this.o.get(i2) != null) {
                this.o.get(i2).onAnimationEnd(this, z, this.d, this.f1525c);
            }
        }
        m(this.o);
    }

    @Override // com.coui.appcompat.animation.dynamicanimation.a.b
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean doAnimationFrame(long j2) {
        long j3 = this.m;
        if (j3 == 0) {
            this.m = j2;
            q(this.d);
            return false;
        }
        long j4 = j2 - j3;
        j(j4);
        this.m = j2;
        boolean zW = w(j4);
        float fMin = Math.min(this.d, this.k);
        this.d = fMin;
        float fMax = Math.max(fMin, this.f1528l);
        this.d = fMax;
        q(fMax);
        this.a.a(j2);
        if (h(this.q)) {
            k(false);
        }
        if (zW) {
            d(false);
        }
        return zW;
    }

    public final com.coui.appcompat.animation.dynamicanimation.a e() {
        com.coui.appcompat.animation.dynamicanimation.a aVar = this.i;
        return aVar == null ? com.coui.appcompat.animation.dynamicanimation.a.d() : aVar;
    }

    public final float f() {
        return this.g.getValue(this.f);
    }

    public float g() {
        return this.f1529n * 0.75f;
    }

    public boolean h(long j2) {
        return false;
    }

    public boolean i() {
        return this.f1527j;
    }

    public void j(long j2) {
        this.q += j2;
    }

    public final void k(boolean z) {
        if (this.r) {
            return;
        }
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            if (this.b.get(i2) != null) {
                this.b.get(i2).a(this, z, this.d, this.f1525c);
            }
        }
        m(this.b);
        this.r = true;
    }

    public T n(float f2) {
        this.k = f2;
        return this;
    }

    public T o(float f2) {
        this.f1528l = f2;
        return this;
    }

    public T p(@FloatRange(from = 0.0d, fromInclusive = false) float f2) {
        if (f2 <= 0.0f) {
            throw new IllegalArgumentException("Minimum visible change must be positive.");
        }
        this.f1529n = f2;
        t(f2 * 0.75f);
        return this;
    }

    public void q(float f2) {
        this.g.setValue(this.f, f2);
        for (int i2 = 0; i2 < this.p.size(); i2++) {
            if (this.p.get(i2) != null) {
                this.p.get(i2).onAnimationUpdate(this, this.d, this.f1525c);
            }
        }
        m(this.p);
    }

    public T r(float f2) {
        this.d = f2;
        this.f1526e = true;
        return this;
    }

    public void removeEndListener(q qVar) {
        l(this.o, qVar);
    }

    public void removeLogicallyCompleteListener(s sVar) {
        l(this.b, sVar);
    }

    public void removeUpdateListener(r rVar) {
        l(this.p, rVar);
    }

    public T s(float f2) {
        this.f1525c = f2;
        return this;
    }

    public abstract void t(float f2);

    public void u() {
        if (!this.h && Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        if (this.f1527j) {
            return;
        }
        v();
    }

    public final void v() {
        if (this.f1527j) {
            return;
        }
        this.f1527j = true;
        if (!this.f1526e) {
            this.d = f();
        }
        float f2 = this.d;
        if (f2 > this.k || f2 < this.f1528l) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        e().a(this, 0L);
        this.a.f(hashCode());
        this.q = 0L;
        this.r = false;
    }

    public abstract boolean w(long j2);

    public <K> COUIDynamicAnimation(K k2, FloatPropertyCompat<K> floatPropertyCompat) {
        cf2 cf2Var = new cf2(null);
        this.a = cf2Var;
        this.b = new ArrayList<>();
        this.f1525c = 0.0f;
        this.d = Float.MAX_VALUE;
        this.f1526e = false;
        this.h = false;
        this.i = null;
        this.f1527j = false;
        this.k = Float.MAX_VALUE;
        this.f1528l = -Float.MAX_VALUE;
        this.m = 0L;
        this.o = new ArrayList<>();
        this.p = new ArrayList<>();
        this.q = 0L;
        this.r = false;
        this.f = k2;
        this.g = floatPropertyCompat;
        if (floatPropertyCompat != ROTATION && floatPropertyCompat != ROTATION_X && floatPropertyCompat != ROTATION_Y) {
            if (floatPropertyCompat != ALPHA && floatPropertyCompat != SCALE_X && floatPropertyCompat != SCALE_Y) {
                this.f1529n = 1.0f;
            } else {
                this.f1529n = 0.00390625f;
            }
        } else {
            this.f1529n = 0.1f;
        }
        cf2Var.d();
    }
}
