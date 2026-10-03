package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes13.dex */
public abstract class sfa {
    public static final o bounce;
    public static final p bounceIn;
    public static final q bounceOut;
    public static final sfa circle;
    public static final sfa circleIn;
    public static final sfa circleOut;
    public static final r elastic;
    public static final s elasticIn;
    public static final t elasticOut;
    public static final u exp10;
    public static final v exp10In;
    public static final w exp10Out;
    public static final u exp5;
    public static final v exp5In;
    public static final w exp5Out;
    public static final sfa fade;
    public static final z fastSlow;
    public static final x pow2;
    public static final y pow2In;
    public static final sfa pow2InInverse;
    public static final z pow2Out;
    public static final sfa pow2OutInverse;
    public static final x pow3;
    public static final y pow3In;
    public static final sfa pow3InInverse;
    public static final z pow3Out;
    public static final sfa pow3OutInverse;
    public static final x pow4;
    public static final y pow4In;
    public static final z pow4Out;
    public static final x pow5;
    public static final y pow5In;
    public static final z pow5Out;
    public static final sfa sine;
    public static final sfa sineIn;
    public static final sfa sineOut;
    public static final y slowFast;
    public static final sfa smoother;
    public static final a0 swing;
    public static final b0 swingIn;
    public static final c0 swingOut;
    public static final sfa linear = new f();
    public static final sfa smooth = new g();
    public static final sfa smooth2 = new h();

    public class a extends sfa {
        @Override // com.oplus.aiunit.vision.sfa
        public float a(float f) {
            return 1.0f - onb.e(f * 1.5707964f);
        }
    }

    public static class a0 extends sfa {
        public final float a;

        public a0(float f) {
            this.a = f * 2.0f;
        }

        @Override // com.oplus.aiunit.vision.sfa
        public float a(float f) {
            if (f <= 0.5f) {
                float f2 = f * 2.0f;
                float f3 = this.a;
                return ((f2 * f2) * (((1.0f + f3) * f2) - f3)) / 2.0f;
            }
            float f4 = (f - 1.0f) * 2.0f;
            float f5 = this.a;
            return (((f4 * f4) * (((f5 + 1.0f) * f4) + f5)) / 2.0f) + 1.0f;
        }
    }

    public class b extends sfa {
        @Override // com.oplus.aiunit.vision.sfa
        public float a(float f) {
            return onb.p(f * 1.5707964f);
        }
    }

    public static class b0 extends sfa {
        public final float a;

        public b0(float f) {
            this.a = f;
        }

        @Override // com.oplus.aiunit.vision.sfa
        public float a(float f) {
            float f2 = this.a;
            return f * f * (((1.0f + f2) * f) - f2);
        }
    }

    public class c extends sfa {
        @Override // com.oplus.aiunit.vision.sfa
        public float a(float f) {
            if (f <= 0.5f) {
                float f2 = f * 2.0f;
                return (1.0f - ((float) Math.sqrt(1.0f - (f2 * f2)))) / 2.0f;
            }
            float f3 = (f - 1.0f) * 2.0f;
            return (((float) Math.sqrt(1.0f - (f3 * f3))) + 1.0f) / 2.0f;
        }
    }

    public static class c0 extends sfa {
        public final float a;

        public c0(float f) {
            this.a = f;
        }

        @Override // com.oplus.aiunit.vision.sfa
        public float a(float f) {
            float f2 = f - 1.0f;
            float f3 = this.a;
            return (f2 * f2 * (((f3 + 1.0f) * f2) + f3)) + 1.0f;
        }
    }

    public class d extends sfa {
        @Override // com.oplus.aiunit.vision.sfa
        public float a(float f) {
            return 1.0f - ((float) Math.sqrt(1.0f - (f * f)));
        }
    }

    public class e extends sfa {
        @Override // com.oplus.aiunit.vision.sfa
        public float a(float f) {
            float f2 = f - 1.0f;
            return (float) Math.sqrt(1.0f - (f2 * f2));
        }
    }

    public class f extends sfa {
        @Override // com.oplus.aiunit.vision.sfa
        public float a(float f) {
            return f;
        }
    }

    public class g extends sfa {
        @Override // com.oplus.aiunit.vision.sfa
        public float a(float f) {
            return f * f * (3.0f - (f * 2.0f));
        }
    }

    public class h extends sfa {
        @Override // com.oplus.aiunit.vision.sfa
        public float a(float f) {
            float f2 = f * f * (3.0f - (f * 2.0f));
            return f2 * f2 * (3.0f - (f2 * 2.0f));
        }
    }

    public class i extends sfa {
        @Override // com.oplus.aiunit.vision.sfa
        public float a(float f) {
            return f * f * f * ((f * ((6.0f * f) - 15.0f)) + 10.0f);
        }
    }

    public class j extends sfa {
        @Override // com.oplus.aiunit.vision.sfa
        public float a(float f) {
            if (f < 1.0E-6f) {
                return 0.0f;
            }
            return (float) Math.sqrt(f);
        }
    }

    public class k extends sfa {
        @Override // com.oplus.aiunit.vision.sfa
        public float a(float f) {
            if (f < 1.0E-6f) {
                return 0.0f;
            }
            if (f > 1.0f) {
                return 1.0f;
            }
            return 1.0f - ((float) Math.sqrt(-(f - 1.0f)));
        }
    }

    public class l extends sfa {
        @Override // com.oplus.aiunit.vision.sfa
        public float a(float f) {
            return (float) Math.cbrt(f);
        }
    }

    public class m extends sfa {
        @Override // com.oplus.aiunit.vision.sfa
        public float a(float f) {
            return 1.0f - ((float) Math.cbrt(-(f - 1.0f)));
        }
    }

    public class n extends sfa {
        @Override // com.oplus.aiunit.vision.sfa
        public float a(float f) {
            return (1.0f - onb.e(f * 3.1415927f)) / 2.0f;
        }
    }

    public static class o extends q {
        public o(int i) {
            super(i);
        }

        @Override // com.oplus.aiunit.vision.sfa.q, com.oplus.aiunit.vision.sfa
        public float a(float f) {
            return f <= 0.5f ? (1.0f - c(1.0f - (f * 2.0f))) / 2.0f : (c((f * 2.0f) - 1.0f) / 2.0f) + 0.5f;
        }

        public final float c(float f) {
            float f2 = this.a[0];
            float f3 = (f2 / 2.0f) + f;
            return f3 < f2 ? (f3 / (f2 / 2.0f)) - 1.0f : super.a(f);
        }
    }

    public static class p extends q {
        public p(int i) {
            super(i);
        }

        @Override // com.oplus.aiunit.vision.sfa.q, com.oplus.aiunit.vision.sfa
        public float a(float f) {
            return 1.0f - super.a(1.0f - f);
        }
    }

    public static class q extends sfa {
        public final float[] a;
        public final float[] b;

        public q(int i) {
            if (i < 2 || i > 5) {
                throw new IllegalArgumentException("bounces cannot be < 2 or > 5: " + i);
            }
            float[] fArr = new float[i];
            this.a = fArr;
            float[] fArr2 = new float[i];
            this.b = fArr2;
            fArr2[0] = 1.0f;
            if (i == 2) {
                fArr[0] = 0.6f;
                fArr[1] = 0.4f;
                fArr2[1] = 0.33f;
            } else if (i == 3) {
                fArr[0] = 0.4f;
                fArr[1] = 0.4f;
                fArr[2] = 0.2f;
                fArr2[1] = 0.33f;
                fArr2[2] = 0.1f;
            } else if (i == 4) {
                fArr[0] = 0.34f;
                fArr[1] = 0.34f;
                fArr[2] = 0.2f;
                fArr[3] = 0.15f;
                fArr2[1] = 0.26f;
                fArr2[2] = 0.11f;
                fArr2[3] = 0.03f;
            } else if (i == 5) {
                fArr[0] = 0.3f;
                fArr[1] = 0.3f;
                fArr[2] = 0.2f;
                fArr[3] = 0.1f;
                fArr[4] = 0.1f;
                fArr2[1] = 0.45f;
                fArr2[2] = 0.3f;
                fArr2[3] = 0.15f;
                fArr2[4] = 0.06f;
            }
            fArr[0] = fArr[0] * 2.0f;
        }

        @Override // com.oplus.aiunit.vision.sfa
        public float a(float f) {
            if (f == 1.0f) {
                return 1.0f;
            }
            float[] fArr = this.a;
            float f2 = f + (fArr[0] / 2.0f);
            int length = fArr.length;
            float f3 = 0.0f;
            float f4 = 0.0f;
            for (int i = 0; i < length; i++) {
                f4 = this.a[i];
                if (f2 <= f4) {
                    f3 = this.b[i];
                    break;
                }
                f2 -= f4;
            }
            float f5 = f2 / f4;
            float f6 = (4.0f / f4) * f3 * f5;
            return 1.0f - ((f6 - (f5 * f6)) * f4);
        }
    }

    public static class r extends sfa {
        public final float a;
        public final float b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f16566c;
        public final float d;

        public r(float f, float f2, int i, float f3) {
            this.a = f;
            this.b = f2;
            this.f16566c = f3;
            this.d = i * 3.1415927f * (i % 2 == 0 ? 1 : -1);
        }

        @Override // com.oplus.aiunit.vision.sfa
        public float a(float f) {
            if (f <= 0.5f) {
                float f2 = f * 2.0f;
                return ((((float) Math.pow(this.a, this.b * (f2 - 1.0f))) * onb.p(f2 * this.d)) * this.f16566c) / 2.0f;
            }
            float f3 = (1.0f - f) * 2.0f;
            return 1.0f - (((((float) Math.pow(this.a, this.b * (f3 - 1.0f))) * onb.p(f3 * this.d)) * this.f16566c) / 2.0f);
        }
    }

    public static class s extends r {
        public s(float f, float f2, int i, float f3) {
            super(f, f2, i, f3);
        }

        @Override // com.oplus.aiunit.vision.sfa.r, com.oplus.aiunit.vision.sfa
        public float a(float f) {
            if (f >= 0.99d) {
                return 1.0f;
            }
            return ((float) Math.pow(this.a, this.b * (f - 1.0f))) * onb.p(f * this.d) * this.f16566c;
        }
    }

    public static class t extends r {
        public t(float f, float f2, int i, float f3) {
            super(f, f2, i, f3);
        }

        @Override // com.oplus.aiunit.vision.sfa.r, com.oplus.aiunit.vision.sfa
        public float a(float f) {
            if (f == 0.0f) {
                return 0.0f;
            }
            float f2 = 1.0f - f;
            return 1.0f - ((((float) Math.pow(this.a, this.b * (f2 - 1.0f))) * onb.p(f2 * this.d)) * this.f16566c);
        }
    }

    public static class u extends sfa {
        public final float a;
        public final float b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f16567c;
        public final float d;

        public u(float f, float f2) {
            this.a = f;
            this.b = f2;
            float fPow = (float) Math.pow(f, -f2);
            this.f16567c = fPow;
            this.d = 1.0f / (1.0f - fPow);
        }

        @Override // com.oplus.aiunit.vision.sfa
        public float a(float f) {
            return f <= 0.5f ? ((((float) Math.pow(this.a, this.b * ((f * 2.0f) - 1.0f))) - this.f16567c) * this.d) / 2.0f : (2.0f - ((((float) Math.pow(this.a, (-this.b) * ((f * 2.0f) - 1.0f))) - this.f16567c) * this.d)) / 2.0f;
        }
    }

    public static class v extends u {
        public v(float f, float f2) {
            super(f, f2);
        }

        @Override // com.oplus.aiunit.vision.sfa.u, com.oplus.aiunit.vision.sfa
        public float a(float f) {
            return (((float) Math.pow(this.a, this.b * (f - 1.0f))) - this.f16567c) * this.d;
        }
    }

    public static class w extends u {
        public w(float f, float f2) {
            super(f, f2);
        }

        @Override // com.oplus.aiunit.vision.sfa.u, com.oplus.aiunit.vision.sfa
        public float a(float f) {
            return 1.0f - ((((float) Math.pow(this.a, (-this.b) * f)) - this.f16567c) * this.d);
        }
    }

    public static class x extends sfa {
        public final int a;

        public x(int i) {
            this.a = i;
        }

        @Override // com.oplus.aiunit.vision.sfa
        public float a(float f) {
            if (f <= 0.5f) {
                return ((float) Math.pow(f * 2.0f, this.a)) / 2.0f;
            }
            return (((float) Math.pow((f - 1.0f) * 2.0f, this.a)) / (this.a % 2 == 0 ? -2 : 2)) + 1.0f;
        }
    }

    public static class y extends x {
        public y(int i) {
            super(i);
        }

        @Override // com.oplus.aiunit.vision.sfa.x, com.oplus.aiunit.vision.sfa
        public float a(float f) {
            return (float) Math.pow(f, this.a);
        }
    }

    public static class z extends x {
        public z(int i) {
            super(i);
        }

        @Override // com.oplus.aiunit.vision.sfa.x, com.oplus.aiunit.vision.sfa
        public float a(float f) {
            return (((float) Math.pow(f - 1.0f, this.a)) * (this.a % 2 == 0 ? -1 : 1)) + 1.0f;
        }
    }

    static {
        i iVar = new i();
        smoother = iVar;
        fade = iVar;
        pow2 = new x(2);
        y yVar = new y(2);
        pow2In = yVar;
        slowFast = yVar;
        z zVar = new z(2);
        pow2Out = zVar;
        fastSlow = zVar;
        pow2InInverse = new j();
        pow2OutInverse = new k();
        pow3 = new x(3);
        pow3In = new y(3);
        pow3Out = new z(3);
        pow3InInverse = new l();
        pow3OutInverse = new m();
        pow4 = new x(4);
        pow4In = new y(4);
        pow4Out = new z(4);
        pow5 = new x(5);
        pow5In = new y(5);
        pow5Out = new z(5);
        sine = new n();
        sineIn = new a();
        sineOut = new b();
        exp10 = new u(2.0f, 10.0f);
        exp10In = new v(2.0f, 10.0f);
        exp10Out = new w(2.0f, 10.0f);
        exp5 = new u(2.0f, 5.0f);
        exp5In = new v(2.0f, 5.0f);
        exp5Out = new w(2.0f, 5.0f);
        circle = new c();
        circleIn = new d();
        circleOut = new e();
        elastic = new r(2.0f, 10.0f, 7, 1.0f);
        elasticIn = new s(2.0f, 10.0f, 6, 1.0f);
        elasticOut = new t(2.0f, 10.0f, 7, 1.0f);
        swing = new a0(1.5f);
        swingIn = new b0(2.0f);
        swingOut = new c0(2.0f);
        bounce = new o(4);
        bounceIn = new p(4);
        bounceOut = new q(4);
    }

    public abstract float a(float f2);

    public float b(float f2, float f3, float f4) {
        return f2 + ((f3 - f2) * a(f4));
    }
}
