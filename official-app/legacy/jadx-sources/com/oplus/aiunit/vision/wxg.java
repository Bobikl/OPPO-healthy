package com.oplus.aiunit.vision;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.utils.BufferUtils;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

/* JADX INFO: loaded from: classes13.dex */
public class wxg implements bv5 {
    public static final String BINORMAL_ATTRIBUTE = "a_binormal";
    public static final String BONEWEIGHT_ATTRIBUTE = "a_boneWeight";
    public static final String COLOR_ATTRIBUTE = "a_color";
    public static final String NORMAL_ATTRIBUTE = "a_normal";
    public static final String POSITION_ATTRIBUTE = "a_position";
    public static final String TANGENT_ATTRIBUTE = "a_tangent";
    public static final String TEXCOORD_ATTRIBUTE = "a_texCoord";
    public static boolean pedantic = true;
    public static String prependFragmentCode = "";
    public static String prependVertexCode = "";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f18436j;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String[] f18438n;
    public String[] r;
    public int s;
    public int t;
    public int u;
    public final FloatBuffer v;
    public final String w;
    public final String x;
    public boolean y;
    public static final com.badlogic.gdx.utils.i<Application, wg0<wxg>> C = new com.badlogic.gdx.utils.i<>();
    public static final IntBuffer D = BufferUtils.e(1);
    public String i = "";
    public final com.badlogic.gdx.utils.h<String> k = new com.badlogic.gdx.utils.h<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final com.badlogic.gdx.utils.h<String> f18437l = new com.badlogic.gdx.utils.h<>();
    public final com.badlogic.gdx.utils.h<String> m = new com.badlogic.gdx.utils.h<>();
    public final com.badlogic.gdx.utils.h<String> o = new com.badlogic.gdx.utils.h<>();
    public final com.badlogic.gdx.utils.h<String> p = new com.badlogic.gdx.utils.h<>();
    public final com.badlogic.gdx.utils.h<String> q = new com.badlogic.gdx.utils.h<>();
    public int z = 0;
    public IntBuffer A = BufferUtils.e(1);
    public IntBuffer B = BufferUtils.e(1);

    public wxg(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("vertex shader must not be null");
        }
        if (str2 == null) {
            throw new IllegalArgumentException("fragment shader must not be null");
        }
        String str3 = prependVertexCode;
        if (str3 != null && str3.length() > 0) {
            str = prependVertexCode + str;
        }
        String str4 = prependFragmentCode;
        if (str4 != null && str4.length() > 0) {
            str2 = prependFragmentCode + str2;
        }
        this.w = str;
        this.x = str2;
        this.v = BufferUtils.d(16);
        o(str, str2);
        if (C()) {
            u();
            x();
            b(x38.app, this);
        }
    }

    public static String A() {
        StringBuilder sb = new StringBuilder();
        sb.append("Managed shaders/app: { ");
        com.badlogic.gdx.utils.i.c<Application> it = C.e().iterator();
        while (it.hasNext()) {
            sb.append(C.get(it.next()).f18241j);
            sb.append(" ");
        }
        sb.append("}");
        return sb.toString();
    }

    public static void B(Application application) {
        wg0<wxg> wg0Var;
        if (x38.gl20 == null || (wg0Var = C.get(application)) == null) {
            return;
        }
        for (int i = 0; i < wg0Var.f18241j; i++) {
            wg0Var.get(i).y = true;
            wg0Var.get(i).i();
        }
    }

    public static void n(Application application) {
        C.j(application);
    }

    public boolean C() {
        return this.f18436j;
    }

    public final int D(int i) {
        k18 k18Var = x38.gl20;
        if (i == -1) {
            return -1;
        }
        k18Var.V(i, this.t);
        k18Var.V(i, this.u);
        k18Var.M(i);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(4);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        IntBuffer intBufferAsIntBuffer = byteBufferAllocateDirect.asIntBuffer();
        k18Var.o(i, k18.GL_LINK_STATUS, intBufferAsIntBuffer);
        if (intBufferAsIntBuffer.get(0) != 0) {
            return i;
        }
        this.i = x38.gl20.T(i);
        return -1;
    }

    public final int E(int i, String str) {
        k18 k18Var = x38.gl20;
        IntBuffer intBufferE = BufferUtils.e(1);
        int iF0 = k18Var.f0(i);
        if (iF0 == 0) {
            return -1;
        }
        k18Var.D(iF0, str);
        k18Var.v(iF0);
        k18Var.R(iF0, k18.GL_COMPILE_STATUS, intBufferE);
        if (intBufferE.get(0) != 0) {
            return iF0;
        }
        String strB = k18Var.B(iF0);
        StringBuilder sb = new StringBuilder();
        sb.append(this.i);
        sb.append(i == 35633 ? "Vertex shader\n" : "Fragment shader:\n");
        this.i = sb.toString();
        this.i += strB;
        return -1;
    }

    public void F(int i, Matrix4 matrix4, boolean z) {
        k18 k18Var = x38.gl20;
        i();
        k18Var.C(i, 1, z, matrix4.val, 0);
    }

    public void G(String str, Matrix4 matrix4) {
        H(str, matrix4, false);
    }

    public void H(String str, Matrix4 matrix4, boolean z) {
        F(v(str), matrix4, z);
    }

    public void I(String str, int i) {
        k18 k18Var = x38.gl20;
        i();
        k18Var.J(v(str), i);
    }

    public void J(int i, int i2, int i3, boolean z, int i4, int i5) {
        k18 k18Var = x38.gl20;
        i();
        k18Var.G(i, i2, i3, z, i4, i5);
    }

    public void K(int i, int i2, int i3, boolean z, int i4, Buffer buffer) {
        k18 k18Var = x38.gl20;
        i();
        k18Var.a0(i, i2, i3, z, i4, buffer);
    }

    public final void b(Application application, wxg wxgVar) {
        com.badlogic.gdx.utils.i<Application, wg0<wxg>> iVar = C;
        wg0<wxg> wg0Var = iVar.get(application);
        if (wg0Var == null) {
            wg0Var = new wg0<>();
        }
        wg0Var.a(wxgVar);
        iVar.h(application, wg0Var);
    }

    public void bind() {
        k18 k18Var = x38.gl20;
        i();
        k18Var.d(this.s);
    }

    @Override // com.oplus.aiunit.vision.bv5
    public void dispose() {
        k18 k18Var = x38.gl20;
        k18Var.d(0);
        k18Var.U(this.t);
        k18Var.U(this.u);
        k18Var.Q(this.s);
        com.badlogic.gdx.utils.i<Application, wg0<wxg>> iVar = C;
        if (iVar.get(x38.app) != null) {
            iVar.get(x38.app).i(this, true);
        }
    }

    public final void i() {
        if (this.y) {
            o(this.w, this.x);
            this.y = false;
        }
    }

    public final void o(String str, String str2) {
        this.t = E(k18.GL_VERTEX_SHADER, str);
        int iE = E(k18.GL_FRAGMENT_SHADER, str2);
        this.u = iE;
        if (this.t == -1 || iE == -1) {
            this.f18436j = false;
            return;
        }
        int iD = D(p());
        this.s = iD;
        if (iD == -1) {
            this.f18436j = false;
        } else {
            this.f18436j = true;
        }
    }

    public int p() {
        int iX = x38.gl20.X();
        if (iX != 0) {
            return iX;
        }
        return -1;
    }

    public void q(int i) {
        k18 k18Var = x38.gl20;
        i();
        k18Var.N(i);
    }

    public void r(String str) {
        k18 k18Var = x38.gl20;
        i();
        int iT = t(str);
        if (iT == -1) {
            return;
        }
        k18Var.N(iT);
    }

    public void s(int i) {
        k18 k18Var = x38.gl20;
        i();
        k18Var.m(i);
    }

    public final int t(String str) {
        k18 k18Var = x38.gl20;
        int iD = this.o.d(str, -2);
        if (iD != -2) {
            return iD;
        }
        int iD0 = k18Var.d0(this.s, str);
        this.o.i(str, iD0);
        return iD0;
    }

    public final void u() {
        this.A.clear();
        x38.gl20.o(this.s, k18.GL_ACTIVE_ATTRIBUTES, this.A);
        int i = this.A.get(0);
        this.r = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.A.clear();
            this.A.put(0, 1);
            this.B.clear();
            String strI = x38.gl20.I(this.s, i2, this.A, this.B);
            this.o.i(strI, x38.gl20.d0(this.s, strI));
            this.p.i(strI, this.B.get(0));
            this.q.i(strI, this.A.get(0));
            this.r[i2] = strI;
        }
    }

    public final int v(String str) {
        return w(str, pedantic);
    }

    public int w(String str, boolean z) {
        int iD = this.k.d(str, -2);
        if (iD == -2) {
            iD = x38.gl20.z(this.s, str);
            if (iD == -1 && z) {
                if (!this.f18436j) {
                    throw new IllegalStateException("An attempted fetch uniform from uncompiled shader \n" + z());
                }
                throw new IllegalArgumentException("No uniform with name '" + str + "' in shader");
            }
            this.k.i(str, iD);
        }
        return iD;
    }

    public final void x() {
        this.A.clear();
        x38.gl20.o(this.s, k18.GL_ACTIVE_UNIFORMS, this.A);
        int i = this.A.get(0);
        this.f18438n = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.A.clear();
            this.A.put(0, 1);
            this.B.clear();
            String strE = x38.gl20.E(this.s, i2, this.A, this.B);
            this.k.i(strE, x38.gl20.z(this.s, strE));
            this.f18437l.i(strE, this.B.get(0));
            this.m.i(strE, this.A.get(0));
            this.f18438n[i2] = strE;
        }
    }

    public int y(String str) {
        return this.o.d(str, -1);
    }

    public String z() {
        if (!this.f18436j) {
            return this.i;
        }
        String strT = x38.gl20.T(this.s);
        this.i = strT;
        return strT;
    }
}
