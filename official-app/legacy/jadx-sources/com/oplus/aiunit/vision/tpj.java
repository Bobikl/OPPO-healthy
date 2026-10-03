package com.oplus.aiunit.vision;

import java.io.InputStream;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.scilab.forge.jlatexmath.FormulaNotFoundException;
import org.scilab.forge.jlatexmath.ParseException;
import org.scilab.forge.jlatexmath.ResourceParseException;

/* JADX INFO: loaded from: classes11.dex */
public class tpj {
    public static final int BOLD = 2;
    public static float FONT_SCALE_FACTOR = 100.0f;
    public static final int ITALIC = 4;
    public static float PIXELS_PER_POINT = 1.0f;
    public static final int ROMAN = 8;
    public static final int SANSSERIF = 1;
    public static final int SERIF = 0;
    public static final int TYPEWRITER = 16;
    public static final String VERSION = "1.0.3";
    public List<rzb> a;
    public Map<String, String> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public wpj f17101c;
    public gj0 d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f17102e;
    public boolean f;
    public static Map<String, tpj> predefinedTeXFormulas = new HashMap(150);
    public static Map<String, String> predefinedTeXFormulasAsString = new HashMap(150);
    public static String[] symbolMappings = new String[65536];
    public static String[] symbolTextMappings = new String[65536];
    public static String[] symbolFormulaMappings = new String[65536];
    public static Map<Character.UnicodeBlock, a> externalFontMap = new HashMap();

    public static class a {
        public String a;
        public String b;

        public a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }
    }

    public class b {
        public Integer a;
        public Float b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f17103c;
        public lk3 d;
        public Integer f;
        public Float g;
        public Integer h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Integer f17105j;
        public Float k;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f17104e = false;
        public boolean i = false;

        public b() {
        }

        public vpj a() {
            vpj vpjVar;
            af9 af9Var;
            if (this.a == null) {
                throw new IllegalStateException("A style is required. Use setStyle()");
            }
            Float f = this.b;
            if (f == null) {
                throw new IllegalStateException("A size is required. Use setStyle()");
            }
            w65 w65Var = this.f17103c == null ? new w65(this.b.floatValue()) : tpj.this.j(f.floatValue(), this.f17103c.intValue());
            rpj rpjVar = this.f != null ? new rpj(this.a.intValue(), w65Var, this.f.intValue(), this.g.floatValue()) : new rpj(this.a.intValue(), w65Var);
            Integer num = this.f17105j;
            if (num != null) {
                rpjVar.v(num.intValue(), this.k.floatValue());
            }
            t22 t22VarI = tpj.this.i(rpjVar);
            if (this.f != null) {
                if (this.f17105j != null) {
                    t22 t22VarC = p52.c(t22VarI, rpjVar.p(), this.k.floatValue() * d4i.i(this.f17105j.intValue(), rpjVar));
                    af9Var = new af9(t22VarC, this.i ? t22VarC.k() : rpjVar.p(), this.h.intValue());
                } else {
                    af9Var = new af9(t22VarI, this.i ? t22VarI.k() : rpjVar.p(), this.h.intValue());
                }
                vpjVar = new vpj(af9Var, this.b.floatValue(), this.f17104e);
            } else {
                vpjVar = new vpj(t22VarI, this.b.floatValue(), this.f17104e);
            }
            lk3 lk3Var = this.d;
            if (lk3Var != null) {
                vpjVar.d(lk3Var);
            }
            vpjVar.f17953e = rpjVar.f16300l;
            return vpjVar;
        }

        public b b(lk3 lk3Var) {
            this.d = lk3Var;
            return this;
        }

        public b c(float f) {
            this.b = Float.valueOf(f);
            return this;
        }

        public b d(int i) {
            this.a = Integer.valueOf(i);
            return this;
        }
    }

    static {
        upj upjVar = new upj();
        upjVar.c(symbolMappings, symbolTextMappings);
        new fpe();
        new gpe();
        new epe();
        upjVar.d(symbolFormulaMappings, symbolTextMappings);
        try {
            w65.W((z00) yi4.class.newInstance());
            w65.W((z00) zb8.class.newInstance());
        } catch (Exception unused) {
        }
    }

    public tpj() {
        this.a = new LinkedList();
        this.d = null;
        this.f17102e = null;
        this.f = false;
        this.f17101c = new wpj("", this, false);
    }

    public static void g(InputStream inputStream, String str) throws ResourceParseException {
        upj upjVar = new upj(inputStream, str);
        upjVar.c(symbolMappings, symbolTextMappings);
        upjVar.d(symbolFormulaMappings, symbolTextMappings);
    }

    public static tpj k(String str) throws FormulaNotFoundException {
        tpj tpjVar = predefinedTeXFormulas.get(str);
        if (tpjVar != null) {
            return new tpj(tpjVar);
        }
        String str2 = predefinedTeXFormulasAsString.get(str);
        if (str2 == null) {
            throw new FormulaNotFoundException(str);
        }
        tpj tpjVar2 = new tpj(str2);
        if (!(tpjVar2.d instanceof ozf)) {
            predefinedTeXFormulas.put(str, tpjVar2);
        }
        return tpjVar2;
    }

    public static a l(Character.UnicodeBlock unicodeBlock) {
        a aVar = externalFontMap.get(unicodeBlock);
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a("SansSerif", "Serif");
        externalFontMap.put(unicodeBlock, aVar2);
        return aVar2;
    }

    public static boolean m(Character.UnicodeBlock unicodeBlock) {
        return externalFontMap.get(unicodeBlock) != null;
    }

    public tpj c(gj0 gj0Var) {
        int iE;
        if (gj0Var != null) {
            if (gj0Var instanceof rzb) {
                this.a.add((rzb) gj0Var);
            }
            gj0 gj0Var2 = this.d;
            if (gj0Var2 == null) {
                this.d = gj0Var;
            } else {
                if (!(gj0Var2 instanceof ozf)) {
                    this.d = new ozf(this.d);
                }
                ((ozf) this.d).f(gj0Var);
                if ((gj0Var instanceof aek) && ((iE = ((aek) gj0Var).e()) == 2 || iE == 3)) {
                    ((ozf) this.d).f(new q52());
                }
            }
        }
        return this;
    }

    public tpj d(tpj tpjVar) {
        f(tpjVar);
        return this;
    }

    public tpj e(String str) throws ParseException {
        if (str != null && str.length() != 0) {
            this.f17102e = null;
            d(new tpj(str));
        }
        return this;
    }

    public final void f(tpj tpjVar) {
        gj0 gj0Var = tpjVar.d;
        if (gj0Var != null) {
            if (gj0Var instanceof ozf) {
                c(new ozf(tpjVar.d));
            } else {
                c(gj0Var);
            }
        }
    }

    public tpj h(boolean z, String str) throws ParseException {
        if (str != null && str.length() != 0) {
            new wpj(z, str, this).F();
        }
        return this;
    }

    public final t22 i(rpj rpjVar) {
        gj0 gj0Var = this.d;
        return gj0Var == null ? new s1j(0.0f, 0.0f, 0.0f, 0.0f) : gj0Var.c(rpjVar);
    }

    public final w65 j(float f, int i) {
        w65 w65Var = new w65(f);
        if (i == 0) {
            w65Var.k(false);
        }
        if ((i & 8) != 0) {
            w65Var.n(true);
        }
        if ((i & 16) != 0) {
            w65Var.a(true);
        }
        if ((i & 1) != 0) {
            w65Var.k(true);
        }
        if ((i & 4) != 0) {
            w65Var.b(true);
        }
        if ((i & 2) != 0) {
            w65Var.H(true);
        }
        return w65Var;
    }

    public tpj(String str) throws ParseException {
        this(str, (String) null);
    }

    public tpj(String str, boolean z) throws ParseException {
        this.a = new LinkedList();
        this.d = null;
        this.f = false;
        this.f17102e = null;
        wpj wpjVar = new wpj(str, this, z);
        this.f17101c = wpjVar;
        wpjVar.F();
    }

    public tpj(String str, String str2) throws ParseException {
        this.a = new LinkedList();
        this.d = null;
        this.f = false;
        this.f17102e = str2;
        wpj wpjVar = new wpj(str, this);
        this.f17101c = wpjVar;
        wpjVar.F();
    }

    public tpj(tpj tpjVar) {
        this.a = new LinkedList();
        this.d = null;
        this.f17102e = null;
        this.f = false;
        if (tpjVar != null) {
            f(tpjVar);
        }
    }

    public tpj(wpj wpjVar, String str) throws ParseException {
        this(wpjVar, str, (String) null);
    }

    public tpj(wpj wpjVar, String str, boolean z) throws ParseException {
        this.a = new LinkedList();
        this.d = null;
        this.f = false;
        this.f17102e = null;
        this.b = wpjVar.a.b;
        boolean zO = wpjVar.o();
        wpj wpjVar2 = new wpj(zO, str, this, z);
        this.f17101c = wpjVar2;
        if (zO) {
            try {
                wpjVar2.F();
            } catch (Exception unused) {
            }
        } else {
            wpjVar2.F();
        }
    }

    public tpj(wpj wpjVar, String str, String str2) throws ParseException {
        this.a = new LinkedList();
        this.d = null;
        this.f = false;
        this.f17102e = str2;
        this.b = wpjVar.a.b;
        boolean zO = wpjVar.o();
        wpj wpjVar2 = new wpj(zO, str, this);
        this.f17101c = wpjVar2;
        if (zO) {
            try {
                wpjVar2.F();
                return;
            } catch (Exception unused) {
                if (this.d == null) {
                    this.d = new sl6();
                    return;
                }
                return;
            }
        }
        wpjVar2.F();
    }

    public tpj(wpj wpjVar, String str, String str2, boolean z, boolean z2) throws ParseException {
        this.a = new LinkedList();
        this.d = null;
        this.f = false;
        this.f17102e = str2;
        this.b = wpjVar.a.b;
        boolean zO = wpjVar.o();
        wpj wpjVar2 = new wpj(zO, str, this, z, z2);
        this.f17101c = wpjVar2;
        if (zO) {
            try {
                wpjVar2.F();
                return;
            } catch (Exception unused) {
                if (this.d == null) {
                    this.d = new sl6();
                    return;
                }
                return;
            }
        }
        wpjVar2.F();
    }
}
