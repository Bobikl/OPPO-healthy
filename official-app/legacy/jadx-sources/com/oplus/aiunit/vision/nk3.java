package com.oplus.aiunit.vision;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/* JADX INFO: loaded from: classes11.dex */
public class nk3 extends gj0 implements nzf {
    public static Map<String, lk3> Colors = new HashMap();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final lk3 f14539l;
    public final lk3 m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ozf f14540n;

    static {
        j();
    }

    public nk3(gj0 gj0Var, lk3 lk3Var, lk3 lk3Var2) {
        this.f14540n = new ozf(gj0Var);
        this.f14539l = lk3Var;
        this.m = lk3Var2;
    }

    public static lk3 f(float f, float f2, float f3, float f4) {
        float f5 = 1.0f - f4;
        return new lk3((1.0f - f) * f5, (1.0f - f2) * f5, f5 * (1.0f - f3));
    }

    public static lk3 i(String str) {
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.length() >= 1) {
                if (strTrim.charAt(0) == '#') {
                    return lk3.a(strTrim);
                }
                if (strTrim.indexOf(44) != -1 || strTrim.indexOf(59) != -1) {
                    StringTokenizer stringTokenizer = new StringTokenizer(strTrim, ";,");
                    int iCountTokens = stringTokenizer.countTokens();
                    if (iCountTokens == 3) {
                        try {
                            String strTrim2 = stringTokenizer.nextToken().trim();
                            String strTrim3 = stringTokenizer.nextToken().trim();
                            String strTrim4 = stringTokenizer.nextToken().trim();
                            float f = Float.parseFloat(strTrim2);
                            float f2 = Float.parseFloat(strTrim3);
                            float f3 = Float.parseFloat(strTrim4);
                            return (f == ((float) ((int) f)) && f2 == ((float) ((int) f2)) && f3 == ((float) ((int) f3)) && strTrim2.indexOf(46) == -1 && strTrim3.indexOf(46) == -1 && strTrim4.indexOf(46) == -1) ? new lk3((int) Math.min(255.0f, Math.max(0.0f, f)), (int) Math.min(255.0f, Math.max(0.0f, f2)), (int) Math.min(255.0f, Math.max(0.0f, f3))) : new lk3(Math.min(1.0f, Math.max(0.0f, f)), Math.min(1.0f, Math.max(0.0f, f2)), Math.min(1.0f, Math.max(0.0f, f3)));
                        } catch (NumberFormatException unused) {
                            return lk3.black;
                        }
                    }
                    if (iCountTokens == 4) {
                        try {
                            return f(Math.min(1.0f, Math.max(0.0f, Float.parseFloat(stringTokenizer.nextToken().trim()))), Math.min(1.0f, Math.max(0.0f, Float.parseFloat(stringTokenizer.nextToken().trim()))), Math.min(1.0f, Math.max(0.0f, Float.parseFloat(stringTokenizer.nextToken().trim()))), Math.min(1.0f, Math.max(0.0f, Float.parseFloat(stringTokenizer.nextToken().trim()))));
                        } catch (NumberFormatException unused2) {
                            return lk3.black;
                        }
                    }
                }
                lk3 lk3Var = Colors.get(strTrim.toLowerCase());
                if (lk3Var != null) {
                    return lk3Var;
                }
                if (strTrim.indexOf(46) != -1) {
                    try {
                        float fMin = Math.min(1.0f, Math.max(Float.parseFloat(strTrim), 0.0f));
                        return new lk3(fMin, fMin, fMin);
                    } catch (NumberFormatException unused3) {
                    }
                }
                return lk3.a("#" + strTrim);
            }
        }
        return lk3.black;
    }

    public static void j() {
        Colors.put("black", lk3.black);
        Colors.put("white", lk3.white);
        Colors.put("red", lk3.red);
        Colors.put("green", lk3.green);
        Colors.put("blue", lk3.blue);
        Colors.put("cyan", lk3.cyan);
        Colors.put("magenta", lk3.magenta);
        Colors.put("yellow", lk3.yellow);
        Colors.put("greenyellow", f(0.15f, 0.0f, 0.69f, 0.0f));
        Colors.put("goldenrod", f(0.0f, 0.1f, 0.84f, 0.0f));
        Colors.put("dandelion", f(0.0f, 0.29f, 0.84f, 0.0f));
        Colors.put("apricot", f(0.0f, 0.32f, 0.52f, 0.0f));
        Colors.put("peach", f(0.0f, 0.5f, 0.7f, 0.0f));
        Colors.put("melon", f(0.0f, 0.46f, 0.5f, 0.0f));
        Colors.put("yelloworange", f(0.0f, 0.42f, 1.0f, 0.0f));
        Colors.put("orange", f(0.0f, 0.61f, 0.87f, 0.0f));
        Colors.put("burntorange", f(0.0f, 0.51f, 1.0f, 0.0f));
        Colors.put("bittersweet", f(0.0f, 0.75f, 1.0f, 0.24f));
        Colors.put("redorange", f(0.0f, 0.77f, 0.87f, 0.0f));
        Colors.put("mahogany", f(0.0f, 0.85f, 0.87f, 0.35f));
        Colors.put("maroon", f(0.0f, 0.87f, 0.68f, 0.32f));
        Colors.put("brickred", f(0.0f, 0.89f, 0.94f, 0.28f));
        Colors.put("orangered", f(0.0f, 1.0f, 0.5f, 0.0f));
        Colors.put("rubinered", f(0.0f, 1.0f, 0.13f, 0.0f));
        Colors.put("wildstrawberry", f(0.0f, 0.96f, 0.39f, 0.0f));
        Colors.put("salmon", f(0.0f, 0.53f, 0.38f, 0.0f));
        Colors.put("carnationpink", f(0.0f, 0.63f, 0.0f, 0.0f));
        Colors.put("magenta", f(0.0f, 1.0f, 0.0f, 0.0f));
        Colors.put("violetred", f(0.0f, 0.81f, 0.0f, 0.0f));
        Colors.put("rhodamine", f(0.0f, 0.82f, 0.0f, 0.0f));
        Colors.put("mulberry", f(0.34f, 0.9f, 0.0f, 0.02f));
        Colors.put("redviolet", f(0.07f, 0.9f, 0.0f, 0.34f));
        Colors.put("fuchsia", f(0.47f, 0.91f, 0.0f, 0.08f));
        Colors.put("lavender", f(0.0f, 0.48f, 0.0f, 0.0f));
        Colors.put("thistle", f(0.12f, 0.59f, 0.0f, 0.0f));
        Colors.put("orchid", f(0.32f, 0.64f, 0.0f, 0.0f));
        Colors.put("darkorchid", f(0.4f, 0.8f, 0.2f, 0.0f));
        Colors.put("purple", f(0.45f, 0.86f, 0.0f, 0.0f));
        Colors.put("plum", f(0.5f, 1.0f, 0.0f, 0.0f));
        Colors.put("violet", f(0.79f, 0.88f, 0.0f, 0.0f));
        Colors.put("royalpurple", f(0.75f, 0.9f, 0.0f, 0.0f));
        Colors.put("blueviolet", f(0.86f, 0.91f, 0.0f, 0.04f));
        Colors.put("periwinkle", f(0.57f, 0.55f, 0.0f, 0.0f));
        Colors.put("cadetblue", f(0.62f, 0.57f, 0.23f, 0.0f));
        Colors.put("cornflowerblue", f(0.65f, 0.13f, 0.0f, 0.0f));
        Colors.put("midnightblue", f(0.98f, 0.13f, 0.0f, 0.43f));
        Colors.put("navyblue", f(0.94f, 0.54f, 0.0f, 0.0f));
        Colors.put("royalblue", f(1.0f, 0.5f, 0.0f, 0.0f));
        Colors.put("cerulean", f(0.94f, 0.11f, 0.0f, 0.0f));
        Colors.put("processblue", f(0.96f, 0.0f, 0.0f, 0.0f));
        Colors.put("skyblue", f(0.62f, 0.0f, 0.12f, 0.0f));
        Colors.put("turquoise", f(0.85f, 0.0f, 0.2f, 0.0f));
        Colors.put("tealblue", f(0.86f, 0.0f, 0.34f, 0.02f));
        Colors.put("aquamarine", f(0.82f, 0.0f, 0.3f, 0.0f));
        Colors.put("bluegreen", f(0.85f, 0.0f, 0.33f, 0.0f));
        Colors.put("emerald", f(1.0f, 0.0f, 0.5f, 0.0f));
        Colors.put("junglegreen", f(0.99f, 0.0f, 0.52f, 0.0f));
        Colors.put("seagreen", f(0.69f, 0.0f, 0.5f, 0.0f));
        Colors.put("forestgreen", f(0.91f, 0.0f, 0.88f, 0.12f));
        Colors.put("pinegreen", f(0.92f, 0.0f, 0.59f, 0.25f));
        Colors.put("limegreen", f(0.5f, 0.0f, 1.0f, 0.0f));
        Colors.put("yellowgreen", f(0.44f, 0.0f, 0.74f, 0.0f));
        Colors.put("springgreen", f(0.26f, 0.0f, 0.76f, 0.0f));
        Colors.put("olivegreen", f(0.64f, 0.0f, 0.95f, 0.4f));
        Colors.put("rawsienna", f(0.0f, 0.72f, 1.0f, 0.45f));
        Colors.put("sepia", f(0.0f, 0.83f, 1.0f, 0.7f));
        Colors.put("brown", f(0.0f, 0.81f, 1.0f, 0.6f));
        Colors.put("tan", f(0.14f, 0.42f, 0.56f, 0.0f));
        Colors.put("gray", f(0.0f, 0.0f, 0.0f, 0.5f));
    }

    @Override // com.oplus.aiunit.vision.nzf
    public void a(s66 s66Var) {
        this.f14540n.a(s66Var);
    }

    @Override // com.oplus.aiunit.vision.gj0
    public t22 c(rpj rpjVar) {
        rpjVar.f16300l = true;
        rpj rpjVarA = rpjVar.a();
        lk3 lk3Var = this.f14539l;
        if (lk3Var != null) {
            rpjVarA.t(lk3Var);
        }
        lk3 lk3Var2 = this.m;
        if (lk3Var2 != null) {
            rpjVarA.u(lk3Var2);
        }
        return this.f14540n.c(rpjVarA);
    }

    @Override // com.oplus.aiunit.vision.gj0
    public int d() {
        return this.f14540n.d();
    }

    @Override // com.oplus.aiunit.vision.gj0
    public int e() {
        return this.f14540n.e();
    }
}
