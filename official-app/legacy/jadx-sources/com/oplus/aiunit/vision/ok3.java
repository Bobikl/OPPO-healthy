package com.oplus.aiunit.vision;

import com.badlogic.gdx.utils.GdxRuntimeException;

/* JADX INFO: loaded from: classes13.dex */
public class ok3 extends vj0 {
    public static final long Ambient;
    public static final String AmbientAlias = "ambientColor";
    public static final long AmbientLight;
    public static final String AmbientLightAlias = "ambientLightColor";
    public static final long Diffuse;
    public static final String DiffuseAlias = "diffuseColor";
    public static final long Emissive;
    public static final String EmissiveAlias = "emissiveColor";
    public static final long Fog;
    public static final String FogAlias = "fogColor";
    public static final long Reflection;
    public static final String ReflectionAlias = "reflectionColor";
    public static final long Specular;
    public static final String SpecularAlias = "specularColor";
    public static long m;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final mk3 f14971l;

    static {
        long jG = vj0.g(DiffuseAlias);
        Diffuse = jG;
        long jG2 = vj0.g(SpecularAlias);
        Specular = jG2;
        long jG3 = vj0.g(AmbientAlias);
        Ambient = jG3;
        long jG4 = vj0.g(EmissiveAlias);
        Emissive = jG4;
        long jG5 = vj0.g(ReflectionAlias);
        Reflection = jG5;
        long jG6 = vj0.g(AmbientLightAlias);
        AmbientLight = jG6;
        long jG7 = vj0.g(FogAlias);
        Fog = jG7;
        m = jG | jG3 | jG2 | jG4 | jG5 | jG6 | jG7;
    }

    public ok3(long j2) {
        super(j2);
        this.f14971l = new mk3();
        if (!i(j2)) {
            throw new GdxRuntimeException("Invalid type specified");
        }
    }

    public static final boolean i(long j2) {
        return (j2 & m) != 0;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public int compareTo(vj0 vj0Var) {
        long j2 = this.i;
        long j3 = vj0Var.i;
        return j2 != j3 ? (int) (j2 - j3) : ((ok3) vj0Var).f14971l.g() - this.f14971l.g();
    }

    @Override // com.oplus.aiunit.vision.vj0
    public int hashCode() {
        return (super.hashCode() * 953) + this.f14971l.g();
    }

    public ok3(long j2, mk3 mk3Var) {
        this(j2);
        if (mk3Var != null) {
            this.f14971l.e(mk3Var);
        }
    }
}
