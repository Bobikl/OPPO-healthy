package com.oplus.aiunit.vision;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public abstract class h3n extends s0n {
    protected Context a;
    protected v0n b;
    protected byte[] g;

    public h3n(Context context, v0n v0nVar) {
        if (context != null) {
            this.a = context.getApplicationContext();
        }
        this.b = v0nVar;
        setBinary(true);
    }

    public static byte[] a(byte[] bArr) {
        return w0n.m(bArr.length);
    }

    private static byte[] i() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(w0n.n("PANDORA$"));
            byteArrayOutputStream.write(new byte[]{1});
            byteArrayOutputStream.write(new byte[]{0});
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th) {
                a2n.e(th, "bre", "gbh");
            }
            return byteArray;
        } catch (Throwable th2) {
            try {
                a2n.e(th2, "bre", "gbh");
                try {
                    return null;
                } catch (Throwable th3) {
                    return null;
                }
            } finally {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th4) {
                    a2n.e(th4, "bre", "gbh");
                }
            }
        }
    }

    private byte[] j() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(new byte[]{3});
            if (f()) {
                Context context = this.a;
                boolean zH = h();
                v0n v0nVar = this.b;
                byte[] bArrF = o0n.f(context, zH, v0nVar != null && "navi".equals(v0nVar.a()));
                byteArrayOutputStream.write(a(bArrF));
                byteArrayOutputStream.write(bArrF);
            } else {
                byteArrayOutputStream.write(new byte[]{0, 0});
            }
            byte[] bArrN = w0n.n(e());
            if (bArrN == null || bArrN.length <= 0) {
                byteArrayOutputStream.write(new byte[]{0, 0});
            } else {
                byteArrayOutputStream.write(a(bArrN));
                byteArrayOutputStream.write(bArrN);
            }
            byte[] bArrN2 = w0n.n(g());
            if (bArrN2 == null || bArrN2.length <= 0) {
                byteArrayOutputStream.write(new byte[]{0, 0});
            } else {
                byteArrayOutputStream.write(a(bArrN2));
                byteArrayOutputStream.write(bArrN2);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th) {
                a2n.e(th, "bre", "gred");
            }
            return byteArray;
        } catch (Throwable th2) {
            try {
                a2n.e(th2, "bre", "gpd");
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th3) {
                    a2n.e(th3, "bre", "gred");
                }
                return new byte[]{0};
            } catch (Throwable th4) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th5) {
                    a2n.e(th5, "bre", "gred");
                }
                throw th4;
            }
        }
    }

    private byte[] k() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArrC = c();
            if (bArrC != null && bArrC.length != 0) {
                byteArrayOutputStream.write(new byte[]{1});
                byteArrayOutputStream.write(a(bArrC));
                byteArrayOutputStream.write(bArrC);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th) {
                    a2n.e(th, "bre", "grrd");
                }
                return byteArray;
            }
            byteArrayOutputStream.write(new byte[]{0});
            byte[] byteArray2 = byteArrayOutputStream.toByteArray();
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                a2n.e(th2, "bre", "grrd");
            }
            return byteArray2;
        } catch (Throwable th3) {
            try {
                a2n.e(th3, "bre", "grrd");
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th4) {
                    a2n.e(th4, "bre", "grrd");
                }
                return new byte[]{0};
            } catch (Throwable th5) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th6) {
                    a2n.e(th6, "bre", "grrd");
                }
                throw th5;
            }
        }
    }

    private byte[] l() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArrD = d();
            if (bArrD != null && bArrD.length != 0) {
                byteArrayOutputStream.write(new byte[]{1});
                byte[] bArrG = o0n.g(bArrD);
                byteArrayOutputStream.write(a(bArrG));
                byteArrayOutputStream.write(bArrG);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th) {
                    a2n.e(th, "bre", "gred");
                }
                return byteArray;
            }
            byteArrayOutputStream.write(new byte[]{0});
            byte[] byteArray2 = byteArrayOutputStream.toByteArray();
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                a2n.e(th2, "bre", "gred");
            }
            return byteArray2;
        } catch (Throwable th3) {
            try {
                a2n.e(th3, "bre", "gred");
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th4) {
                    a2n.e(th4, "bre", "gred");
                }
                return new byte[]{0};
            } catch (Throwable th5) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th6) {
                    a2n.e(th6, "bre", "gred");
                }
                throw th5;
            }
        }
    }

    public abstract byte[] c();

    public abstract byte[] d();

    public String e() {
        return "2.1";
    }

    public boolean f() {
        return true;
    }

    public String g() {
        return String.format("platform=Android&sdkversion=%s&product=%s", this.b.f(), this.b.a());
    }

    @Override // com.amap.api.col.p0003sl.la
    public final byte[] getEntityBytes() {
        byte[] bArr = this.g;
        if (bArr != null) {
            return bArr;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(i());
            byteArrayOutputStream.write(j());
            byteArrayOutputStream.write(k());
            byteArrayOutputStream.write(l());
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            this.g = byteArray;
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th) {
                a2n.e(th, "bre", "geb");
            }
            return byteArray;
        } catch (Throwable th2) {
            try {
                a2n.e(th2, "bre", "geb");
                try {
                    return null;
                } catch (Throwable th3) {
                    return null;
                }
            } finally {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th4) {
                    a2n.e(th4, "bre", "geb");
                }
            }
        }
    }

    @Override // com.amap.api.col.p0003sl.la
    public Map<String, String> getParams() {
        String strJ = n0n.j(this.a);
        String strA = o0n.a();
        String strC = o0n.c(this.a, strA, "key=".concat(String.valueOf(strJ)));
        HashMap map = new HashMap();
        map.put("ts", strA);
        map.put("key", strJ);
        map.put("scode", strC);
        return map;
    }

    public boolean h() {
        return false;
    }
}
