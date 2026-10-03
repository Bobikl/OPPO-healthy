package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.cert.CertificateException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

/* JADX INFO: loaded from: classes12.dex */
public final class o0n {

    public static class a {
        public String A;
        public String a;
        public String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f14724c;
        public String d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f14725e;
        public String f;
        public String g;
        public String h;
        public String i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public String f14726j;
        public String k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public String f14727l;
        public String m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public String f14728n;
        public String o;
        public String p;
        public String q;
        public String r;
        public String s;
        public String t;
        public String u;
        public String v;
        public String w;
        public String x;
        public String y;
        public String z;

        public a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    public static String a() {
        try {
            String strValueOf = String.valueOf(System.currentTimeMillis());
            String str = n0n.d() ? "1" : "0";
            int length = strValueOf.length();
            return strValueOf.substring(0, length - 2) + str + strValueOf.substring(length - 1);
        } catch (Throwable th) {
            a2n.e(th, "CI", "TS");
            return null;
        }
    }

    public static String b(Context context) {
        try {
            a aVar = new a((byte) 0);
            aVar.d = n0n.f(context);
            aVar.i = n0n.h(context);
            return d(aVar);
        } catch (Throwable th) {
            a2n.e(th, "CI", "IX");
            return null;
        }
    }

    public static String c(Context context, String str, String str2) {
        try {
            return t0n.d(n0n.i(context) + ":" + str.substring(0, str.length() - 3) + ":" + str2);
        } catch (Throwable th) {
            a2n.e(th, "CI", "Sco");
            return null;
        }
    }

    public static String d(a aVar) {
        return q0n.f(j(aVar));
    }

    public static void e(ByteArrayOutputStream byteArrayOutputStream, String str) {
        if (TextUtils.isEmpty(str)) {
            w0n.j(byteArrayOutputStream, (byte) 0, new byte[0]);
        } else {
            w0n.j(byteArrayOutputStream, str.getBytes().length > 255 ? (byte) -1 : (byte) str.getBytes().length, w0n.n(str));
        }
    }

    public static byte[] f(Context context, boolean z, boolean z2) {
        try {
            return j(h(context, z, z2));
        } catch (Throwable th) {
            a2n.e(th, "CI", "gz");
            return null;
        }
    }

    public static byte[] g(byte[] bArr) throws BadPaddingException, InvalidKeySpecException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, IOException, InvalidKeyException, CertificateException, NullPointerException {
        return q0n.b(bArr);
    }

    public static a h(Context context, boolean z, boolean z2) {
        a aVar = new a((byte) 0);
        aVar.a = p0n.N();
        aVar.b = p0n.G();
        String strD = p0n.D(context);
        if (strD == null) {
            strD = "";
        }
        aVar.f14724c = strD;
        aVar.d = n0n.f(context);
        aVar.f14725e = Build.MODEL;
        aVar.f = Build.MANUFACTURER;
        aVar.g = Build.DEVICE;
        aVar.h = n0n.e(context);
        aVar.i = n0n.h(context);
        aVar.f14726j = String.valueOf(Build.VERSION.SDK_INT);
        aVar.k = p0n.R();
        aVar.f14727l = p0n.Q(context);
        StringBuilder sb = new StringBuilder();
        sb.append(p0n.K(context));
        aVar.m = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(p0n.I(context));
        aVar.f14728n = sb2.toString();
        aVar.o = p0n.b0(context);
        aVar.p = p0n.H(context);
        aVar.q = "";
        aVar.r = "";
        if (z) {
            aVar.s = "";
            aVar.t = "";
        } else {
            String[] strArrJ = p0n.J();
            aVar.s = strArrJ[0];
            aVar.t = strArrJ[1];
        }
        aVar.w = p0n.m();
        String strN = p0n.n(context);
        if (TextUtils.isEmpty(strN)) {
            aVar.x = "";
        } else {
            aVar.x = strN;
        }
        aVar.y = "aid=" + p0n.E();
        if ((z2 && p1n.d) || p1n.f15155e) {
            String strB = p0n.B(context);
            if (!TextUtils.isEmpty(strB)) {
                aVar.y += "|oaid=" + strB;
            }
        }
        String strL = p0n.L();
        if (!TextUtils.isEmpty(strL)) {
            aVar.y += "|multiImeis=" + strL;
        }
        String strP = p0n.P();
        if (!TextUtils.isEmpty(strP)) {
            aVar.y += "|meid=" + strP;
        }
        aVar.y += "|serial=" + p0n.C();
        String strT = p0n.t();
        if (!TextUtils.isEmpty(strT)) {
            aVar.y += "|adiuExtras=" + strT;
        }
        aVar.y += "|storage=" + p0n.T() + "|ram=" + p0n.Z(context) + "|arch=" + p0n.V();
        String strB2 = z1n.a().b();
        if (TextUtils.isEmpty(strB2)) {
            aVar.z = "";
        } else {
            aVar.z = strB2;
        }
        if (z) {
            i1n.a(context);
            String strB3 = i1n.b();
            if (!TextUtils.isEmpty(strB3)) {
                aVar.A = strB3;
            }
        }
        return aVar;
    }

    public static String i(Context context) {
        return l(context);
    }

    public static byte[] j(a aVar) {
        ByteArrayOutputStream byteArrayOutputStream;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                e(byteArrayOutputStream, aVar.a);
                e(byteArrayOutputStream, aVar.b);
                e(byteArrayOutputStream, aVar.f14724c);
                e(byteArrayOutputStream, aVar.d);
                e(byteArrayOutputStream, aVar.f14725e);
                e(byteArrayOutputStream, aVar.f);
                e(byteArrayOutputStream, aVar.g);
                e(byteArrayOutputStream, aVar.h);
                e(byteArrayOutputStream, aVar.i);
                e(byteArrayOutputStream, aVar.f14726j);
                e(byteArrayOutputStream, aVar.k);
                e(byteArrayOutputStream, aVar.f14727l);
                e(byteArrayOutputStream, aVar.m);
                e(byteArrayOutputStream, aVar.f14728n);
                e(byteArrayOutputStream, aVar.o);
                e(byteArrayOutputStream, aVar.p);
                e(byteArrayOutputStream, aVar.q);
                e(byteArrayOutputStream, aVar.r);
                e(byteArrayOutputStream, aVar.s);
                e(byteArrayOutputStream, aVar.t);
                e(byteArrayOutputStream, aVar.u);
                e(byteArrayOutputStream, aVar.v);
                e(byteArrayOutputStream, aVar.w);
                e(byteArrayOutputStream, aVar.x);
                e(byteArrayOutputStream, aVar.y);
                e(byteArrayOutputStream, aVar.z);
                e(byteArrayOutputStream, aVar.A);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                new String(byteArray);
                byte[] bArrK = k(w0n.s(byteArray));
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                return bArrK;
            } catch (Throwable th2) {
                th = th2;
                try {
                    a2n.e(th, "CI", "gzx");
                    return null;
                } finally {
                    if (byteArrayOutputStream != null) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (Throwable th3) {
                            th3.printStackTrace();
                        }
                    }
                }
            }
        } catch (Throwable th4) {
            th = th4;
            byteArrayOutputStream = null;
        }
    }

    public static byte[] k(byte[] bArr) throws BadPaddingException, InvalidKeySpecException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, IOException, InvalidKeyException, CertificateException, NullPointerException {
        PublicKey publicKeyW = w0n.w();
        if (bArr.length <= 117) {
            return q0n.c(bArr, publicKeyW);
        }
        byte[] bArr2 = new byte[117];
        System.arraycopy(bArr, 0, bArr2, 0, 117);
        byte[] bArrC = q0n.c(bArr2, publicKeyW);
        byte[] bArr3 = new byte[(bArr.length + 128) - 117];
        System.arraycopy(bArrC, 0, bArr3, 0, 128);
        System.arraycopy(bArr, 117, bArr3, 128, bArr.length - 117);
        return bArr3;
    }

    public static String l(Context context) {
        try {
            return d(h(context, false, false));
        } catch (Throwable th) {
            a2n.e(th, "CI", "gCXi");
            return null;
        }
    }
}
