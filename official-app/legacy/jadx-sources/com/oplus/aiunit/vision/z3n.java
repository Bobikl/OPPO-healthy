package com.oplus.aiunit.vision;

import android.content.Context;
import java.io.InputStream;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes12.dex */
public final class z3n {
    public static s3n a(WeakReference<s3n> weakReference) {
        if (weakReference == null || weakReference.get() == null) {
            weakReference = new WeakReference<>(new s3n());
        }
        return weakReference.get();
    }

    public static String b() {
        return w0n.b(System.currentTimeMillis());
    }

    public static String c(Context context, v0n v0nVar) {
        StringBuilder sb = new StringBuilder();
        try {
            String strA = p0n.A();
            sb.append("\"sim\":\"");
            sb.append(strA);
            sb.append("\",\"sdkversion\":\"");
            sb.append(v0nVar.f());
            sb.append("\",\"product\":\"");
            sb.append(v0nVar.a());
            sb.append("\",\"ed\":\"");
            sb.append(v0nVar.g());
            sb.append("\",\"nt\":\"");
            sb.append(p0n.w(context));
            sb.append("\",\"np\":\"");
            sb.append(p0n.u(context));
            sb.append("\",\"mnc\":\"");
            sb.append(p0n.z());
            sb.append("\",\"ant\":\"");
            sb.append(p0n.y(context));
            sb.append("\"");
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return sb.toString();
    }

    public static String d(String str, String str2, int i, String str3, String str4) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        stringBuffer.append(",\"timestamp\":\"");
        stringBuffer.append(str2);
        stringBuffer.append("\",\"et\":\"");
        stringBuffer.append(i);
        stringBuffer.append("\",\"classname\":\"");
        stringBuffer.append(str3);
        stringBuffer.append("\",");
        stringBuffer.append("\"detail\":\"");
        stringBuffer.append(str4);
        stringBuffer.append("\"");
        return stringBuffer.toString();
    }

    public static String e(String str, String str2, String str3, String str4) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        stringBuffer.append(",\"timestamp\":\"");
        stringBuffer.append(str2);
        stringBuffer.append("\",\"et\":\"");
        stringBuffer.append(1);
        stringBuffer.append("\",\"classname\":\"");
        stringBuffer.append(str3);
        stringBuffer.append("\",");
        stringBuffer.append("\"detail\":\"");
        stringBuffer.append(str4);
        stringBuffer.append("\"");
        return stringBuffer.toString();
    }

    public static void f(Context context, s3n s3nVar, String str, int i, int i2, String str2) {
        s3nVar.a = b2n.i(context, str);
        s3nVar.d = i;
        s3nVar.b = i2;
        s3nVar.f16461c = str2;
    }

    public static byte[] g(f3n f3nVar, String str) {
        f3n.e eVarA;
        byte[] bArr = new byte[0];
        InputStream inputStream = null;
        try {
            eVarA = f3nVar.a(str);
            if (eVarA == null) {
                if (eVarA != null) {
                    try {
                        eVarA.close();
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
                return bArr;
            }
            try {
                InputStream inputStreamA = eVarA.a();
                if (inputStreamA == null) {
                    if (inputStreamA != null) {
                        try {
                            inputStreamA.close();
                        } catch (Throwable th2) {
                            th2.printStackTrace();
                        }
                    }
                    try {
                        eVarA.close();
                    } catch (Throwable th3) {
                        th3.printStackTrace();
                    }
                    return bArr;
                }
                bArr = new byte[inputStreamA.available()];
                inputStreamA.read(bArr);
                try {
                    inputStreamA.close();
                } catch (Throwable th4) {
                    th4.printStackTrace();
                }
                try {
                    eVarA.close();
                } catch (Throwable th5) {
                    th5.printStackTrace();
                }
                return bArr;
            } catch (Throwable th6) {
                th = th6;
                try {
                    c2n.r(th, "sui", "rdS");
                    return bArr;
                } finally {
                    if (0 != 0) {
                        try {
                            inputStream.close();
                        } catch (Throwable th7) {
                            th7.printStackTrace();
                        }
                    }
                    if (eVarA != null) {
                        try {
                            eVarA.close();
                        } catch (Throwable th8) {
                            th8.printStackTrace();
                        }
                    }
                }
            }
        } catch (Throwable th9) {
            th = th9;
            eVarA = null;
        }
    }
}
