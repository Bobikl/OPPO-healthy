package com.badlogic.gdx.graphics;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.collision.BoundingBox;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.oplus.aiunit.vision.bv5;
import com.oplus.aiunit.vision.i6a;
import com.oplus.aiunit.vision.j6a;
import com.oplus.aiunit.vision.k6a;
import com.oplus.aiunit.vision.l6a;
import com.oplus.aiunit.vision.lvk;
import com.oplus.aiunit.vision.mvk;
import com.oplus.aiunit.vision.nvk;
import com.oplus.aiunit.vision.ovk;
import com.oplus.aiunit.vision.pvk;
import com.oplus.aiunit.vision.qvk;
import com.oplus.aiunit.vision.rvk;
import com.oplus.aiunit.vision.wg0;
import com.oplus.aiunit.vision.wxg;
import com.oplus.aiunit.vision.x38;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p010kotlin.UShort;

/* JADX INFO: loaded from: classes13.dex */
public class Mesh implements bv5 {
    public static final Map<Application, wg0<Mesh>> o = new HashMap();
    public final rvk i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final l6a f1209j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f1210l;
    public boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Vector3 f1211n;

    public enum VertexDataType {
        VertexArray,
        VertexBufferObject,
        VertexBufferObjectSubData,
        VertexBufferObjectWithVAO
    }

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[VertexDataType.values().length];
            a = iArr;
            try {
                iArr[VertexDataType.VertexBufferObject.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[VertexDataType.VertexBufferObjectSubData.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[VertexDataType.VertexBufferObjectWithVAO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[VertexDataType.VertexArray.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public Mesh(boolean z, int i, int i2, mvk... mvkVarArr) {
        this.k = true;
        this.m = false;
        this.f1211n = new Vector3();
        this.i = y(z, i, new nvk(mvkVarArr));
        this.f1209j = new j6a(z, i2);
        this.f1210l = false;
        b(x38.app, this);
    }

    public static void b(Application application, Mesh mesh) {
        Map<Application, wg0<Mesh>> map = o;
        wg0<Mesh> wg0Var = map.get(application);
        if (wg0Var == null) {
            wg0Var = new wg0<>();
        }
        wg0Var.a(mesh);
        map.put(application, wg0Var);
    }

    public static void p(Application application) {
        o.remove(application);
    }

    public static String t() {
        StringBuilder sb = new StringBuilder();
        sb.append("Managed meshes/app: { ");
        Iterator<Application> it = o.keySet().iterator();
        while (it.hasNext()) {
            sb.append(o.get(it.next()).f18241j);
            sb.append(" ");
        }
        sb.append("}");
        return sb.toString();
    }

    public static void x(Application application) {
        wg0<Mesh> wg0Var = o.get(application);
        if (wg0Var == null) {
            return;
        }
        for (int i = 0; i < wg0Var.f18241j; i++) {
            wg0Var.get(i).i.invalidate();
            wg0Var.get(i).f1209j.invalidate();
        }
    }

    public void A(wxg wxgVar, int i, int i2, int i3, boolean z) {
        if (i3 == 0) {
            return;
        }
        if (z) {
            i(wxgVar);
        }
        if (this.f1210l) {
            if (this.f1209j.k() > 0) {
                ShortBuffer shortBufferA = this.f1209j.a(false);
                int iPosition = shortBufferA.position();
                shortBufferA.limit();
                shortBufferA.position(i2);
                x38.gl20.k(i, i3, 5123, shortBufferA);
                shortBufferA.position(iPosition);
            } else {
                x38.gl20.S(i, i2, i3);
            }
        } else {
            if (this.m) {
                throw null;
            }
            if (this.f1209j.k() <= 0) {
                boolean z2 = this.m;
                x38.gl20.S(i, i2, i3);
            } else {
                if (i3 + i2 > this.f1209j.g()) {
                    throw new GdxRuntimeException("Mesh attempting to access memory outside of the index buffer (count: " + i3 + ", offset: " + i2 + ", max: " + this.f1209j.g() + ")");
                }
                boolean z3 = this.m;
                x38.gl20.O(i, i3, 5123, i2 * 2);
            }
        }
        if (z) {
            D(wxgVar);
        }
    }

    public Mesh B(short[] sArr) {
        this.f1209j.f(sArr, 0, sArr.length);
        return this;
    }

    public Mesh C(float[] fArr, int i, int i2) {
        this.i.m(fArr, i, i2);
        return this;
    }

    public void D(wxg wxgVar) {
        E(wxgVar, null, null);
    }

    public void E(wxg wxgVar, int[] iArr, int[] iArr2) {
        this.i.l(wxgVar, iArr);
        if (this.f1209j.k() > 0) {
            this.f1209j.unbind();
        }
    }

    public int d() {
        return this.i.d();
    }

    @Override // com.oplus.aiunit.vision.bv5
    public void dispose() {
        Map<Application, wg0<Mesh>> map = o;
        if (map.get(x38.app) != null) {
            map.get(x38.app).i(this, true);
        }
        this.i.dispose();
        this.f1209j.dispose();
    }

    public void i(wxg wxgVar) {
        n(wxgVar, null, null);
    }

    public int k() {
        return this.f1209j.k();
    }

    public void n(wxg wxgVar, int[] iArr, int[] iArr2) {
        this.i.e(wxgVar, iArr);
        if (this.f1209j.k() > 0) {
            this.f1209j.bind();
        }
    }

    public BoundingBox o(BoundingBox boundingBox, int i, int i2) {
        return q(boundingBox.inf(), i, i2);
    }

    public BoundingBox q(BoundingBox boundingBox, int i, int i2) {
        return r(boundingBox, i, i2, null);
    }

    public BoundingBox r(BoundingBox boundingBox, int i, int i2, Matrix4 matrix4) {
        int i3;
        int iK = k();
        int iD = d();
        if (iK != 0) {
            iD = iK;
        }
        if (i < 0 || i2 < 1 || (i3 = i + i2) > iD) {
            throw new GdxRuntimeException("Invalid part specified ( offset=" + i + ", count=" + i2 + ", max=" + iD + " )");
        }
        FloatBuffer floatBufferA = this.i.a(false);
        ShortBuffer shortBufferA = this.f1209j.a(false);
        mvk mvkVarU = u(1);
        int i4 = mvkVarU.f14250e / 4;
        int i5 = this.i.c().f14665j / 4;
        int i6 = mvkVarU.b;
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 == 3) {
                    if (iK > 0) {
                        while (i < i3) {
                            int i7 = ((shortBufferA.get(i) & UShort.MAX_VALUE) * i5) + i4;
                            this.f1211n.set(floatBufferA.get(i7), floatBufferA.get(i7 + 1), floatBufferA.get(i7 + 2));
                            if (matrix4 != null) {
                                this.f1211n.mul(matrix4);
                            }
                            boundingBox.ext(this.f1211n);
                            i++;
                        }
                    } else {
                        while (i < i3) {
                            int i8 = (i * i5) + i4;
                            this.f1211n.set(floatBufferA.get(i8), floatBufferA.get(i8 + 1), floatBufferA.get(i8 + 2));
                            if (matrix4 != null) {
                                this.f1211n.mul(matrix4);
                            }
                            boundingBox.ext(this.f1211n);
                            i++;
                        }
                    }
                }
            } else if (iK > 0) {
                while (i < i3) {
                    int i9 = ((shortBufferA.get(i) & UShort.MAX_VALUE) * i5) + i4;
                    this.f1211n.set(floatBufferA.get(i9), floatBufferA.get(i9 + 1), 0.0f);
                    if (matrix4 != null) {
                        this.f1211n.mul(matrix4);
                    }
                    boundingBox.ext(this.f1211n);
                    i++;
                }
            } else {
                while (i < i3) {
                    int i10 = (i * i5) + i4;
                    this.f1211n.set(floatBufferA.get(i10), floatBufferA.get(i10 + 1), 0.0f);
                    if (matrix4 != null) {
                        this.f1211n.mul(matrix4);
                    }
                    boundingBox.ext(this.f1211n);
                    i++;
                }
            }
        } else if (iK > 0) {
            while (i < i3) {
                this.f1211n.set(floatBufferA.get(((shortBufferA.get(i) & UShort.MAX_VALUE) * i5) + i4), 0.0f, 0.0f);
                if (matrix4 != null) {
                    this.f1211n.mul(matrix4);
                }
                boundingBox.ext(this.f1211n);
                i++;
            }
        } else {
            while (i < i3) {
                this.f1211n.set(floatBufferA.get((i * i5) + i4), 0.0f, 0.0f);
                if (matrix4 != null) {
                    this.f1211n.mul(matrix4);
                }
                boundingBox.ext(this.f1211n);
                i++;
            }
        }
        return boundingBox;
    }

    public ShortBuffer s(boolean z) {
        return this.f1209j.a(z);
    }

    public mvk u(int i) {
        nvk nvkVarC = this.i.c();
        int size = nvkVarC.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (nvkVarC.g(i2).a == i) {
                return nvkVarC.g(i2);
            }
        }
        return null;
    }

    public nvk v() {
        return this.i.c();
    }

    public FloatBuffer w(boolean z) {
        return this.i.a(z);
    }

    public final rvk y(boolean z, int i, nvk nvkVar) {
        return x38.gl30 != null ? new qvk(z, i, nvkVar) : new ovk(z, i, nvkVar);
    }

    public void z(wxg wxgVar, int i, int i2, int i3) {
        A(wxgVar, i, i2, i3, this.k);
    }

    public Mesh(boolean z, int i, int i2, nvk nvkVar) {
        this.k = true;
        this.m = false;
        this.f1211n = new Vector3();
        this.i = y(z, i, nvkVar);
        this.f1209j = new j6a(z, i2);
        this.f1210l = false;
        b(x38.app, this);
    }

    public Mesh(VertexDataType vertexDataType, boolean z, int i, int i2, mvk... mvkVarArr) {
        this(vertexDataType, z, i, i2, new nvk(mvkVarArr));
    }

    public Mesh(VertexDataType vertexDataType, boolean z, int i, int i2, nvk nvkVar) {
        this.k = true;
        this.m = false;
        this.f1211n = new Vector3();
        int i3 = a.a[vertexDataType.ordinal()];
        if (i3 == 1) {
            this.i = new ovk(z, i, nvkVar);
            this.f1209j = new j6a(z, i2);
            this.f1210l = false;
        } else if (i3 == 2) {
            this.i = new pvk(z, i, nvkVar);
            this.f1209j = new k6a(z, i2);
            this.f1210l = false;
        } else if (i3 != 3) {
            this.i = new lvk(i, nvkVar);
            this.f1209j = new i6a(i2);
            this.f1210l = true;
        } else {
            this.i = new qvk(z, i, nvkVar);
            this.f1209j = new k6a(z, i2);
            this.f1210l = false;
        }
        b(x38.app, this);
    }
}
