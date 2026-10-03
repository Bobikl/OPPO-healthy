package com.oplus.aiunit.vision;

import java.util.HashMap;
import java.util.Map;
import org.scilab.forge.jlatexmath.InvalidUnitException;

/* JADX INFO: loaded from: classes11.dex */
public class d4i extends gj0 {
    public static Map<String, Integer> u;
    public static o[] v;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f10377l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f10378n;
    public float o;
    public float p;
    public int q;
    public int r;
    public int t;

    public class a implements o {
        @Override // com.oplus.aiunit.vision.d4i.o
        public float a(rpj rpjVar) {
            return (tpj.PIXELS_PER_POINT * 65536.0f) / rpjVar.j();
        }
    }

    public class b implements o {
        @Override // com.oplus.aiunit.vision.d4i.o
        public float a(rpj rpjVar) {
            return (tpj.PIXELS_PER_POINT * 0.996264f) / rpjVar.j();
        }
    }

    public class c implements o {
        @Override // com.oplus.aiunit.vision.d4i.o
        public float a(rpj rpjVar) {
            return (tpj.PIXELS_PER_POINT * 1.0660349f) / rpjVar.j();
        }
    }

    public class d implements o {
        @Override // com.oplus.aiunit.vision.d4i.o
        public float a(rpj rpjVar) {
            return (tpj.PIXELS_PER_POINT * 12.792419f) / rpjVar.j();
        }
    }

    public class e implements o {
        @Override // com.oplus.aiunit.vision.d4i.o
        public float a(rpj rpjVar) {
            return rpjVar.n().l(rpjVar.m());
        }
    }

    public class f implements o {
        @Override // com.oplus.aiunit.vision.d4i.o
        public float a(rpj rpjVar) {
            return rpjVar.n().t(rpjVar.m());
        }
    }

    public class g implements o {
        @Override // com.oplus.aiunit.vision.d4i.o
        public float a(rpj rpjVar) {
            return rpjVar.n().y(rpjVar.m(), rpjVar.h());
        }
    }

    public class h implements o {
        @Override // com.oplus.aiunit.vision.d4i.o
        public float a(rpj rpjVar) {
            return 1.0f / rpjVar.j();
        }
    }

    public class i implements o {
        @Override // com.oplus.aiunit.vision.d4i.o
        public float a(rpj rpjVar) {
            return tpj.PIXELS_PER_POINT / rpjVar.j();
        }
    }

    public class j implements o {
        @Override // com.oplus.aiunit.vision.d4i.o
        public float a(rpj rpjVar) {
            return (tpj.PIXELS_PER_POINT * 12.0f) / rpjVar.j();
        }
    }

    public class k implements o {
        @Override // com.oplus.aiunit.vision.d4i.o
        public float a(rpj rpjVar) {
            spj spjVarN = rpjVar.n();
            return spjVarN.m(rpjVar.m(), spjVarN.L()) / 18.0f;
        }
    }

    public class l implements o {
        @Override // com.oplus.aiunit.vision.d4i.o
        public float a(rpj rpjVar) {
            return (tpj.PIXELS_PER_POINT * 28.346457f) / rpjVar.j();
        }
    }

    public class m implements o {
        @Override // com.oplus.aiunit.vision.d4i.o
        public float a(rpj rpjVar) {
            return (tpj.PIXELS_PER_POINT * 2.8346457f) / rpjVar.j();
        }
    }

    public class n implements o {
        @Override // com.oplus.aiunit.vision.d4i.o
        public float a(rpj rpjVar) {
            return (tpj.PIXELS_PER_POINT * 72.0f) / rpjVar.j();
        }
    }

    public interface o {
        float a(rpj rpjVar);
    }

    static {
        HashMap map = new HashMap();
        u = map;
        map.put("em", 0);
        u.put("ex", 1);
        u.put("px", 2);
        u.put("pix", 2);
        u.put("pixel", 2);
        u.put("pt", 10);
        u.put("bp", 3);
        u.put("pica", 4);
        u.put("pc", 4);
        u.put("mu", 5);
        u.put("cm", 6);
        u.put("mm", 7);
        u.put("in", 8);
        u.put("sp", 9);
        u.put("dd", 11);
        u.put("cc", 12);
        v = new o[]{new f(), new g(), new h(), new i(), new j(), new k(), new l(), new m(), new n(), new a(), new b(), new c(), new d(), new e()};
    }

    public d4i() {
        this.f10377l = true;
    }

    public static void f(int i2) throws InvalidUnitException {
        if (i2 < 0 || i2 >= v.length) {
            throw new InvalidUnitException();
        }
    }

    public static float i(int i2, rpj rpjVar) {
        return v[i2].a(rpjVar);
    }

    public static float[] j(String str) {
        if (str == null) {
            return new float[]{2.0f, 0.0f};
        }
        int i2 = 0;
        while (i2 < str.length() && !Character.isLetter(str.charAt(i2))) {
            i2++;
        }
        try {
            return new float[]{i2 != str.length() ? k(str.substring(i2).toLowerCase()) : 2, Float.parseFloat(str.substring(0, i2))};
        } catch (NumberFormatException unused) {
            return new float[]{Float.NaN};
        }
    }

    public static int k(String str) {
        Integer num = u.get(str);
        if (num == null) {
            return 2;
        }
        return num.intValue();
    }

    @Override // com.oplus.aiunit.vision.gj0
    public t22 c(rpj rpjVar) {
        t22 t22VarB;
        if (!this.f10377l) {
            return new s1j(this.f10378n * i(this.q, rpjVar), this.o * i(this.r, rpjVar), this.p * i(this.t, rpjVar), 0.0f);
        }
        int i2 = this.m;
        if (i2 == 0) {
            return new s1j(rpjVar.l(), 0.0f, 0.0f, 0.0f);
        }
        if (i2 < 0) {
            i2 = -i2;
        }
        if (i2 == 1) {
            t22VarB = u78.b(7, 1, rpjVar);
        } else {
            t22VarB = i2 == 2 ? u78.b(2, 1, rpjVar) : u78.b(3, 1, rpjVar);
        }
        if (this.m < 0) {
            t22VarB.l();
        }
        return t22VarB;
    }

    public d4i(int i2) {
        this.f10377l = true;
        this.m = i2;
    }

    public d4i(int i2, float f2, float f3, float f4) throws InvalidUnitException {
        f(i2);
        this.q = i2;
        this.r = i2;
        this.t = i2;
        this.f10378n = f2;
        this.o = f3;
        this.p = f4;
    }
}
