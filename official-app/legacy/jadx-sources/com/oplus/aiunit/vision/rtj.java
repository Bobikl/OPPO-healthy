package com.oplus.aiunit.vision;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.GdxRuntimeException;

/* JADX INFO: loaded from: classes13.dex */
public class rtj extends vj0 {
    public static final long Ambient;
    public static final String AmbientAlias = "ambientTexture";
    public static final long Bump;
    public static final String BumpAlias = "bumpTexture";
    public static final long Diffuse;
    public static final String DiffuseAlias = "diffuseTexture";
    public static final long Emissive;
    public static final String EmissiveAlias = "emissiveTexture";
    public static final long Normal;
    public static final String NormalAlias = "normalTexture";
    public static final long Reflection;
    public static final String ReflectionAlias = "reflectionTexture";
    public static final long Specular;
    public static final String SpecularAlias = "specularTexture";
    public static long r;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ttj<Texture> f16352l;
    public float m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f16353n;
    public float o;
    public float p;
    public int q;

    static {
        long jG = vj0.g(DiffuseAlias);
        Diffuse = jG;
        long jG2 = vj0.g(SpecularAlias);
        Specular = jG2;
        long jG3 = vj0.g(BumpAlias);
        Bump = jG3;
        long jG4 = vj0.g(NormalAlias);
        Normal = jG4;
        long jG5 = vj0.g(AmbientAlias);
        Ambient = jG5;
        long jG6 = vj0.g(EmissiveAlias);
        Emissive = jG6;
        long jG7 = vj0.g(ReflectionAlias);
        Reflection = jG7;
        r = jG | jG2 | jG3 | jG4 | jG5 | jG6 | jG7;
    }

    public rtj(long j2) {
        super(j2);
        this.m = 0.0f;
        this.f16353n = 0.0f;
        this.o = 1.0f;
        this.p = 1.0f;
        this.q = 0;
        if (!i(j2)) {
            throw new GdxRuntimeException("Invalid type specified");
        }
        this.f16352l = new ttj<>();
    }

    public static final boolean i(long j2) {
        return (j2 & r) != 0;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public int compareTo(vj0 vj0Var) {
        long j2 = this.i;
        long j3 = vj0Var.i;
        if (j2 != j3) {
            return j2 < j3 ? -1 : 1;
        }
        rtj rtjVar = (rtj) vj0Var;
        int iCompareTo = this.f16352l.compareTo(rtjVar.f16352l);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int i = this.q;
        int i2 = rtjVar.q;
        if (i != i2) {
            return i - i2;
        }
        if (!onb.g(this.o, rtjVar.o)) {
            return this.o > rtjVar.o ? 1 : -1;
        }
        if (!onb.g(this.p, rtjVar.p)) {
            return this.p > rtjVar.p ? 1 : -1;
        }
        if (!onb.g(this.m, rtjVar.m)) {
            return this.m > rtjVar.m ? 1 : -1;
        }
        if (onb.g(this.f16353n, rtjVar.f16353n)) {
            return 0;
        }
        return this.f16353n > rtjVar.f16353n ? 1 : -1;
    }

    @Override // com.oplus.aiunit.vision.vj0
    public int hashCode() {
        return (((((((((((super.hashCode() * 991) + this.f16352l.hashCode()) * 991) + rzc.b(this.m)) * 991) + rzc.b(this.f16353n)) * 991) + rzc.b(this.o)) * 991) + rzc.b(this.p)) * 991) + this.q;
    }

    public <T extends Texture> rtj(long j2, ttj<T> ttjVar) {
        this(j2);
        this.f16352l.e(ttjVar);
    }

    public <T extends Texture> rtj(long j2, ttj<T> ttjVar, float f, float f2, float f3, float f4, int i) {
        this(j2, ttjVar);
        this.m = f;
        this.f16353n = f2;
        this.o = f3;
        this.p = f4;
        this.q = i;
    }

    public <T extends Texture> rtj(long j2, ttj<T> ttjVar, float f, float f2, float f3, float f4) {
        this(j2, ttjVar, f, f2, f3, f4, 0);
    }
}
