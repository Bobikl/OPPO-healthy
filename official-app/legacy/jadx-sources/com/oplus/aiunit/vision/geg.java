package com.oplus.aiunit.vision;

import com.badlogic.gdx.math.Vector2;

/* JADX INFO: loaded from: classes13.dex */
public abstract class geg {
    public static final Vector2 a = new Vector2();
    public static final geg fit = new a();
    public static final geg contain = new b();
    public static final geg fill = new c();
    public static final geg fillX = new d();
    public static final geg fillY = new e();
    public static final geg stretch = new f();
    public static final geg stretchX = new g();
    public static final geg stretchY = new h();
    public static final geg none = new i();

    public class a extends geg {
        @Override // com.oplus.aiunit.vision.geg
        public Vector2 a(float f, float f2, float f3, float f4) {
            float f5 = f4 / f3 > f2 / f ? f3 / f : f4 / f2;
            Vector2 vector2 = geg.a;
            vector2.x = f * f5;
            vector2.y = f2 * f5;
            return vector2;
        }
    }

    public class b extends geg {
        @Override // com.oplus.aiunit.vision.geg
        public Vector2 a(float f, float f2, float f3, float f4) {
            float f5 = f4 / f3 > f2 / f ? f3 / f : f4 / f2;
            if (f5 > 1.0f) {
                f5 = 1.0f;
            }
            Vector2 vector2 = geg.a;
            vector2.x = f * f5;
            vector2.y = f2 * f5;
            return vector2;
        }
    }

    public class c extends geg {
        @Override // com.oplus.aiunit.vision.geg
        public Vector2 a(float f, float f2, float f3, float f4) {
            float f5 = f4 / f3 < f2 / f ? f3 / f : f4 / f2;
            Vector2 vector2 = geg.a;
            vector2.x = f * f5;
            vector2.y = f2 * f5;
            return vector2;
        }
    }

    public class d extends geg {
        @Override // com.oplus.aiunit.vision.geg
        public Vector2 a(float f, float f2, float f3, float f4) {
            float f5 = f3 / f;
            Vector2 vector2 = geg.a;
            vector2.x = f * f5;
            vector2.y = f2 * f5;
            return vector2;
        }
    }

    public class e extends geg {
        @Override // com.oplus.aiunit.vision.geg
        public Vector2 a(float f, float f2, float f3, float f4) {
            float f5 = f4 / f2;
            Vector2 vector2 = geg.a;
            vector2.x = f * f5;
            vector2.y = f2 * f5;
            return vector2;
        }
    }

    public class f extends geg {
        @Override // com.oplus.aiunit.vision.geg
        public Vector2 a(float f, float f2, float f3, float f4) {
            Vector2 vector2 = geg.a;
            vector2.x = f3;
            vector2.y = f4;
            return vector2;
        }
    }

    public class g extends geg {
        @Override // com.oplus.aiunit.vision.geg
        public Vector2 a(float f, float f2, float f3, float f4) {
            Vector2 vector2 = geg.a;
            vector2.x = f3;
            vector2.y = f2;
            return vector2;
        }
    }

    public class h extends geg {
        @Override // com.oplus.aiunit.vision.geg
        public Vector2 a(float f, float f2, float f3, float f4) {
            Vector2 vector2 = geg.a;
            vector2.x = f;
            vector2.y = f4;
            return vector2;
        }
    }

    public class i extends geg {
        @Override // com.oplus.aiunit.vision.geg
        public Vector2 a(float f, float f2, float f3, float f4) {
            Vector2 vector2 = geg.a;
            vector2.x = f;
            vector2.y = f2;
            return vector2;
        }
    }

    public abstract Vector2 a(float f2, float f3, float f4, float f5);
}
