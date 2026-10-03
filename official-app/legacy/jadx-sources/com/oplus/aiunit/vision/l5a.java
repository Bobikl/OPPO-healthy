package com.oplus.aiunit.vision;

import com.badlogic.gdx.graphics.Mesh;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.utils.GdxRuntimeException;

/* JADX INFO: loaded from: classes13.dex */
public class l5a implements m5a {
    public final int a;
    public final Mesh b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public wxg f13528c;
    public boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f13529e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Matrix4 f13530j;
    public final float[] k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String[] f13531l;

    public l5a(int i, boolean z, boolean z2, int i2) {
        this(i, z, z2, i2, b(z, z2, i2));
        this.d = true;
    }

    public static wxg b(boolean z, boolean z2, int i) {
        wxg wxgVar = new wxg(d(z, z2, i), c(z, z2, i));
        if (wxgVar.C()) {
            return wxgVar;
        }
        throw new GdxRuntimeException("Error compiling shader: " + wxgVar.z());
    }

    public static String c(boolean z, boolean z2, int i) {
        String str = z2 ? "#ifdef GL_ES\nprecision mediump float;\n#endif\nvarying vec4 v_col;\n" : "#ifdef GL_ES\nprecision mediump float;\n#endif\n";
        for (int i2 = 0; i2 < i; i2++) {
            str = (str + "varying vec2 v_tex" + i2 + ";\n") + "uniform sampler2D u_sampler" + i2 + ";\n";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("void main() {\n   gl_FragColor = ");
        sb.append(z2 ? "v_col" : "vec4(1, 1, 1, 1)");
        String string = sb.toString();
        if (i > 0) {
            string = string + " * ";
        }
        for (int i3 = 0; i3 < i; i3++) {
            string = i3 == i - 1 ? string + " texture2D(u_sampler" + i3 + ",  v_tex" + i3 + ")" : string + " texture2D(u_sampler" + i3 + ",  v_tex" + i3 + ") *";
        }
        return string + ";\n}";
    }

    public static String d(boolean z, boolean z2, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("attribute vec4 a_position;\n");
        sb.append(z ? "attribute vec3 a_normal;\n" : "");
        sb.append(z2 ? "attribute vec4 a_color;\n" : "");
        String string = sb.toString();
        for (int i2 = 0; i2 < i; i2++) {
            string = string + "attribute vec2 a_texCoord" + i2 + ";\n";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(string);
        sb2.append("uniform mat4 u_projModelView;\n");
        sb2.append(z2 ? "varying vec4 v_col;\n" : "");
        String string2 = sb2.toString();
        for (int i3 = 0; i3 < i; i3++) {
            string2 = string2 + "varying vec2 v_tex" + i3 + ";\n";
        }
        String str = string2 + "void main() {\n   gl_Position = u_projModelView * a_position;\n";
        if (z2) {
            str = str + "   v_col = a_color;\n   v_col.a *= 255.0 / 254.0;\n";
        }
        for (int i4 = 0; i4 < i; i4++) {
            str = str + "   v_tex" + i4 + " = " + wxg.TEXCOORD_ATTRIBUTE + i4 + ";\n";
        }
        return str + "   gl_PointSize = 1.0;\n}\n";
    }

    public final mvk[] a(boolean z, boolean z2, int i) {
        wg0 wg0Var = new wg0();
        wg0Var.a(new mvk(1, 3, wxg.POSITION_ATTRIBUTE));
        if (z) {
            wg0Var.a(new mvk(8, 3, wxg.NORMAL_ATTRIBUTE));
        }
        if (z2) {
            wg0Var.a(new mvk(4, 4, wxg.COLOR_ATTRIBUTE));
        }
        for (int i2 = 0; i2 < i; i2++) {
            wg0Var.a(new mvk(16, 2, wxg.TEXCOORD_ATTRIBUTE + i2));
        }
        mvk[] mvkVarArr = new mvk[wg0Var.f18241j];
        for (int i3 = 0; i3 < wg0Var.f18241j; i3++) {
            mvkVarArr[i3] = (mvk) wg0Var.get(i3);
        }
        return mvkVarArr;
    }

    @Override // com.oplus.aiunit.vision.m5a
    public void dispose() {
        wxg wxgVar;
        if (this.d && (wxgVar = this.f13528c) != null) {
            wxgVar.dispose();
        }
        this.b.dispose();
    }

    public l5a(int i, boolean z, boolean z2, int i2, wxg wxgVar) {
        this.f13530j = new Matrix4();
        this.a = i;
        this.f13529e = i2;
        this.f13528c = wxgVar;
        Mesh mesh = new Mesh(false, i, 0, a(z, z2, i2));
        this.b = mesh;
        this.k = new float[i * (mesh.v().f14665j / 4)];
        this.f = mesh.v().f14665j / 4;
        this.g = mesh.u(8) != null ? mesh.u(8).f14250e / 4 : 0;
        this.h = mesh.u(4) != null ? mesh.u(4).f14250e / 4 : 0;
        this.i = mesh.u(16) != null ? mesh.u(16).f14250e / 4 : 0;
        this.f13531l = new String[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            this.f13531l[i3] = "u_sampler" + i3;
        }
    }
}
