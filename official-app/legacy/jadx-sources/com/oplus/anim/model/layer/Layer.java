package com.oplus.anim.model.layer;

import androidx.annotation.Nullable;
import com.oplus.aiunit.vision.e40;
import com.oplus.aiunit.vision.e50;
import com.oplus.aiunit.vision.k84;
import com.oplus.aiunit.vision.m56;
import com.oplus.aiunit.vision.uu1;
import com.oplus.aiunit.vision.w40;
import com.oplus.aiunit.vision.wg6;
import com.oplus.aiunit.vision.xoa;
import com.oplus.aiunit.vision.y40;
import com.oplus.anim.model.content.Mask;
import com.oplus.weatherservicesdk.data.Weather;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes19.dex */
public class Layer {
    public final List<k84> a;
    public final wg6 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f19635c;
    public final long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LayerType f19636e;
    public final long f;

    @Nullable
    public final String g;
    public final List<Mask> h;
    public final e50 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f19637j;
    public final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f19638l;
    public final float m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f19639n;
    public final float o;
    public final float p;

    @Nullable
    public final w40 q;

    @Nullable
    public final y40 r;

    @Nullable
    public final e40 s;
    public final List<xoa<Float>> t;
    public final MatteType u;
    public final boolean v;

    @Nullable
    public final uu1 w;

    @Nullable
    public final m56 x;

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

    public Layer(List<k84> list, wg6 wg6Var, String str, long j2, LayerType layerType, long j3, @Nullable String str2, List<Mask> list2, e50 e50Var, int i, int i2, int i3, float f, float f2, float f3, float f4, @Nullable w40 w40Var, @Nullable y40 y40Var, List<xoa<Float>> list3, MatteType matteType, @Nullable e40 e40Var, boolean z, @Nullable uu1 uu1Var, @Nullable m56 m56Var) {
        this.a = list;
        this.b = wg6Var;
        this.f19635c = str;
        this.d = j2;
        this.f19636e = layerType;
        this.f = j3;
        this.g = str2;
        this.h = list2;
        this.i = e50Var;
        this.f19637j = i;
        this.k = i2;
        this.f19638l = i3;
        this.m = f;
        this.f19639n = f2;
        this.o = f3;
        this.p = f4;
        this.q = w40Var;
        this.r = y40Var;
        this.t = list3;
        this.u = matteType;
        this.s = e40Var;
        this.v = z;
        this.w = uu1Var;
        this.x = m56Var;
    }

    @Nullable
    public uu1 a() {
        return this.w;
    }

    public wg6 b() {
        return this.b;
    }

    @Nullable
    public m56 c() {
        return this.x;
    }

    public long d() {
        return this.d;
    }

    public List<xoa<Float>> e() {
        return this.t;
    }

    public LayerType f() {
        return this.f19636e;
    }

    public List<Mask> g() {
        return this.h;
    }

    public MatteType h() {
        return this.u;
    }

    public String i() {
        return this.f19635c;
    }

    public long j() {
        return this.f;
    }

    public float k() {
        return this.p;
    }

    public float l() {
        return this.o;
    }

    @Nullable
    public String m() {
        return this.g;
    }

    public List<k84> n() {
        return this.a;
    }

    public int o() {
        return this.f19638l;
    }

    public int p() {
        return this.k;
    }

    public int q() {
        return this.f19637j;
    }

    public float r() {
        return this.f19639n / this.b.e();
    }

    @Nullable
    public w40 s() {
        return this.q;
    }

    @Nullable
    public y40 t() {
        return this.r;
    }

    public String toString() {
        return y("");
    }

    @Nullable
    public e40 u() {
        return this.s;
    }

    public float v() {
        return this.m;
    }

    public e50 w() {
        return this.i;
    }

    public boolean x() {
        return this.v;
    }

    public String y(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i());
        sb.append(Weather.SEPARATOR);
        Layer layerT = this.b.t(j());
        if (layerT != null) {
            sb.append("\t\tParents: ");
            sb.append(layerT.i());
            Layer layerT2 = this.b.t(layerT.j());
            while (layerT2 != null) {
                sb.append("->");
                sb.append(layerT2.i());
                layerT2 = this.b.t(layerT2.j());
            }
            sb.append(str);
            sb.append(Weather.SEPARATOR);
        }
        if (!g().isEmpty()) {
            sb.append(str);
            sb.append("\tMasks: ");
            sb.append(g().size());
            sb.append(Weather.SEPARATOR);
        }
        if (q() != 0 && p() != 0) {
            sb.append(str);
            sb.append("\tBackground: ");
            sb.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(q()), Integer.valueOf(p()), Integer.valueOf(o())));
        }
        if (!this.a.isEmpty()) {
            sb.append(str);
            sb.append("\tShapes:\n");
            for (k84 k84Var : this.a) {
                sb.append(str);
                sb.append("\t\t");
                sb.append(k84Var);
                sb.append(Weather.SEPARATOR);
            }
        }
        return sb.toString();
    }
}
