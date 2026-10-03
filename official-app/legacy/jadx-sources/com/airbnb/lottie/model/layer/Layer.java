package com.airbnb.lottie.model.layer;

import androidx.annotation.Nullable;
import com.airbnb.lottie.model.content.LBlendMode;
import com.airbnb.lottie.model.content.Mask;
import com.oplus.aiunit.vision.f40;
import com.oplus.aiunit.vision.f50;
import com.oplus.aiunit.vision.k9b;
import com.oplus.aiunit.vision.l84;
import com.oplus.aiunit.vision.n56;
import com.oplus.aiunit.vision.vu1;
import com.oplus.aiunit.vision.x40;
import com.oplus.aiunit.vision.yoa;
import com.oplus.aiunit.vision.z40;
import com.oplus.weatherservicesdk.data.Weather;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes12.dex */
public class Layer {
    public final List<l84> a;
    public final k9b b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f521c;
    public final long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LayerType f522e;
    public final long f;

    @Nullable
    public final String g;
    public final List<Mask> h;
    public final f50 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f523j;
    public final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f524l;
    public final float m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f525n;
    public final float o;
    public final float p;

    @Nullable
    public final x40 q;

    @Nullable
    public final z40 r;

    @Nullable
    public final f40 s;
    public final List<yoa<Float>> t;
    public final MatteType u;
    public final boolean v;

    @Nullable
    public final vu1 w;

    @Nullable
    public final n56 x;
    public final LBlendMode y;

    public enum LayerType {
        PRE_COMP,
        SOLID,
        IMAGE,
        NULL,
        SHAPE,
        TEXT,
        UNKNOWN
    }

    public enum MatteType {
        NONE,
        ADD,
        INVERT,
        LUMA,
        LUMA_INVERTED,
        UNKNOWN
    }

    public Layer(List<l84> list, k9b k9bVar, String str, long j2, LayerType layerType, long j3, @Nullable String str2, List<Mask> list2, f50 f50Var, int i, int i2, int i3, float f, float f2, float f3, float f4, @Nullable x40 x40Var, @Nullable z40 z40Var, List<yoa<Float>> list3, MatteType matteType, @Nullable f40 f40Var, boolean z, @Nullable vu1 vu1Var, @Nullable n56 n56Var, LBlendMode lBlendMode) {
        this.a = list;
        this.b = k9bVar;
        this.f521c = str;
        this.d = j2;
        this.f522e = layerType;
        this.f = j3;
        this.g = str2;
        this.h = list2;
        this.i = f50Var;
        this.f523j = i;
        this.k = i2;
        this.f524l = i3;
        this.m = f;
        this.f525n = f2;
        this.o = f3;
        this.p = f4;
        this.q = x40Var;
        this.r = z40Var;
        this.t = list3;
        this.u = matteType;
        this.s = f40Var;
        this.v = z;
        this.w = vu1Var;
        this.x = n56Var;
        this.y = lBlendMode;
    }

    @Nullable
    public LBlendMode a() {
        return this.y;
    }

    @Nullable
    public vu1 b() {
        return this.w;
    }

    public k9b c() {
        return this.b;
    }

    @Nullable
    public n56 d() {
        return this.x;
    }

    public long e() {
        return this.d;
    }

    public List<yoa<Float>> f() {
        return this.t;
    }

    public LayerType g() {
        return this.f522e;
    }

    public List<Mask> h() {
        return this.h;
    }

    public MatteType i() {
        return this.u;
    }

    public String j() {
        return this.f521c;
    }

    public long k() {
        return this.f;
    }

    public float l() {
        return this.p;
    }

    public float m() {
        return this.o;
    }

    @Nullable
    public String n() {
        return this.g;
    }

    public List<l84> o() {
        return this.a;
    }

    public int p() {
        return this.f524l;
    }

    public int q() {
        return this.k;
    }

    public int r() {
        return this.f523j;
    }

    public float s() {
        return this.f525n / this.b.e();
    }

    @Nullable
    public x40 t() {
        return this.q;
    }

    public String toString() {
        return z("");
    }

    @Nullable
    public z40 u() {
        return this.r;
    }

    @Nullable
    public f40 v() {
        return this.s;
    }

    public float w() {
        return this.m;
    }

    public f50 x() {
        return this.i;
    }

    public boolean y() {
        return this.v;
    }

    public String z(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(j());
        sb.append(Weather.SEPARATOR);
        Layer layerU = this.b.u(k());
        if (layerU != null) {
            sb.append("\t\tParents: ");
            sb.append(layerU.j());
            Layer layerU2 = this.b.u(layerU.k());
            while (layerU2 != null) {
                sb.append("->");
                sb.append(layerU2.j());
                layerU2 = this.b.u(layerU2.k());
            }
            sb.append(str);
            sb.append(Weather.SEPARATOR);
        }
        if (!h().isEmpty()) {
            sb.append(str);
            sb.append("\tMasks: ");
            sb.append(h().size());
            sb.append(Weather.SEPARATOR);
        }
        if (r() != 0 && q() != 0) {
            sb.append(str);
            sb.append("\tBackground: ");
            sb.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(r()), Integer.valueOf(q()), Integer.valueOf(p())));
        }
        if (!this.a.isEmpty()) {
            sb.append(str);
            sb.append("\tShapes:\n");
            for (l84 l84Var : this.a) {
                sb.append(str);
                sb.append("\t\t");
                sb.append(l84Var);
                sb.append(Weather.SEPARATOR);
            }
        }
        return sb.toString();
    }
}
