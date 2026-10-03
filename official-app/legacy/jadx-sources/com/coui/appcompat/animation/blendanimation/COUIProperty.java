package com.coui.appcompat.animation.blendanimation;

import android.view.View;
import androidx.dynamicanimation.animation.FloatPropertyCompat;
import com.heytap.nearx.tangramconfig.strategy.Fields;

/* JADX INFO: loaded from: classes13.dex */
public abstract class COUIProperty<T> extends FloatPropertyCompat<T> {
    public static final float ALPHA_MIN_VISIBLE_CHANGE = 0.00390625f;
    public static final float BLUR_MIN_VISIBLE_CHANGE = 1.0f;
    public static final float COLOR_MIN_VISIBLE_CHANGE = 1.0f;
    public static final float DEFAULT_MIN_VISIBLE_CHANGE = 0.001f;
    public static final float HEIGHT_MIN_VISIBLE_CHANGE = 0.5f;
    public static final float POSITION_MIN_VISIBLE_CHANGE = 0.5f;
    public static final float RADIUS_MIN_VISIBLE_CHANGE = 0.001f;
    public static final float ROTATION_MIN_VISIBLE_CHANGE = 3.2552084E-4f;
    public static final float SCALE_MIN_VISIBLE_CHANGE = 3.2552084E-4f;
    public static final float SCROLL_MIN_VISIBLE_CHANGE = 1.0f;
    public static final float TRANSLATION_MIN_VISIBLE_CHANGE = 0.5f;
    public static final float WIDTH_MIN_VISIBLE_CHANGE = 0.5f;
    public float a;
    public static final COUIViewProperty TRANSLATION_X = new g("translationX");
    public static final COUIViewProperty TRANSLATION_Y = new h("translationY");
    public static final COUIViewProperty TRANSLATION_Z = new i("translationZ");
    public static final COUIViewProperty SCALE_X = new j("scaleX");
    public static final COUIViewProperty SCALE = new k("scale");
    public static final COUIViewProperty SCALE_Y = new l("scaleY");
    public static final COUIViewProperty ROTATION = new m("rotation");
    public static final COUIViewProperty ROTATION_X = new n("rotationX");
    public static final COUIViewProperty ROTATION_Y = new o("rotationY");
    public static final COUIViewProperty X = new a("x");
    public static final COUIViewProperty Y = new b("y");
    public static final COUIViewProperty Z = new c("z");
    public static final COUIViewProperty ALPHA = new d("alpha");
    public static final COUIViewProperty SCROLL_X = new e("scrollX");
    public static final COUIViewProperty SCROLL_Y = new f("scrollY");

    public static abstract class COUIBlurProperty<T> extends COUIProperty<T> {
        public COUIBlurProperty() {
            super("blur");
        }

        public abstract int b(T t);

        public abstract void c(T t, int i);

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public float getValue(T t) {
            return b(t);
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public void setValue(T t, float f) {
            c(t, (int) f);
        }
    }

    public static abstract class COUIColorProperty<T> extends COUIProperty<T> {
        public COUIColorProperty() {
            super("color");
        }

        public abstract int b(T t);

        public abstract void c(T t, int i);

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public float getValue(T t) {
            return b(t);
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public void setValue(T t, float f) {
            c(t, (int) f);
        }
    }

    public static abstract class COUIDefaultProperty<T> extends COUIProperty<T> {
        public COUIDefaultProperty() {
            super("default");
        }
    }

    public static abstract class COUIHeightProperty<T> extends COUIProperty<T> {
        public COUIHeightProperty() {
            super(Fields.HEIGHT_FIELD);
        }

        public abstract float b(T t);

        public abstract void c(T t, float f);

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public float getValue(T t) {
            return b(t);
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public void setValue(T t, float f) {
            c(t, f);
        }
    }

    public static abstract class COUIRadiusProperty<T> extends COUIProperty<T> {
        public COUIRadiusProperty() {
            super("radius");
        }

        public abstract float b(T t);

        public abstract void c(T t, float f);

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public float getValue(T t) {
            return b(t);
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public void setValue(T t, float f) {
            c(t, f);
        }
    }

    public static abstract class COUIViewProperty extends COUIProperty<View> {
        public /* synthetic */ COUIViewProperty(String str, g gVar) {
            this(str);
        }

        public COUIViewProperty(String str) {
            super(str);
        }
    }

    public static abstract class COUIWidthProperty<T> extends COUIProperty<T> {
        public COUIWidthProperty() {
            super(Fields.WIDTH_FIELD);
        }

        public abstract float b(T t);

        public abstract void c(T t, float f);

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public float getValue(T t) {
            return b(t);
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public void setValue(T t, float f) {
            c(t, f);
        }
    }

    public class a extends COUIViewProperty {
        public a(String str) {
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

    public class b extends COUIViewProperty {
        public b(String str) {
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

    public class c extends COUIViewProperty {
        public c(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public float getValue(View view) {
            return view.getZ();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public void setValue(View view, float f) {
            view.setZ(f);
        }
    }

    public class d extends COUIViewProperty {
        public d(String str) {
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

    public class e extends COUIViewProperty {
        public e(String str) {
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

    public class f extends COUIViewProperty {
        public f(String str) {
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

    public class g extends COUIViewProperty {
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

    public class h extends COUIViewProperty {
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

    public class i extends COUIViewProperty {
        public i(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public float getValue(View view) {
            return view.getTranslationZ();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public void setValue(View view, float f) {
            view.setTranslationZ(f);
        }
    }

    public class j extends COUIViewProperty {
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

    public class k extends COUIViewProperty {
        public k(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public float getValue(View view) {
            return view.getScaleX();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public void setValue(View view, float f) {
            view.setScaleX(f);
            view.setScaleY(f);
        }
    }

    public class l extends COUIViewProperty {
        public l(String str) {
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

    public class m extends COUIViewProperty {
        public m(String str) {
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

    public class n extends COUIViewProperty {
        public n(String str) {
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

    public class o extends COUIViewProperty {
        public o(String str) {
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

    public COUIProperty(String str) {
        super(str);
        this.a = 0.0f;
        this.a = a(str);
    }

    public static float a(String str) {
        str.hashCode();
        switch (str) {
            case "rotationX":
            case "rotationY":
            case "rotation":
                return 3.2552084E-4f;
            case "translationX":
            case "translationY":
            case "translationZ":
            case "height":
                return 0.5f;
            case "scaleX":
            case "scaleY":
            case "scale":
                return 3.2552084E-4f;
            case "x":
            case "y":
            case "z":
                return 0.5f;
            case "blur":
                return 1.0f;
            case "alpha":
                return 0.00390625f;
            case "color":
                return 1.0f;
            case "width":
                return 0.5f;
            case "scrollX":
            case "scrollY":
                return 1.0f;
            default:
                return 0.001f;
        }
    }
}
