package com.oplus.aiunit.vision;

import java.io.File;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class t3n {
    public static int a(s3n s3nVar) {
        f3n f3nVar = null;
        try {
            if (s3nVar.f.e()) {
                s3nVar.f.c(true);
                f3n f3nVarG = f3n.g(new File(s3nVar.a), s3nVar.b);
                try {
                    ArrayList arrayList = new ArrayList();
                    byte[] bArrE = e(f3nVarG, s3nVar, arrayList);
                    if (bArrE != null && bArrE.length != 0) {
                        com.amap.api.col.p0003sl.g0 g0Var = new com.amap.api.col.p0003sl.g0(bArrE, s3nVar.f16461c);
                        com.amap.api.col.p0003sl.i0.b();
                        JSONObject jSONObject = new JSONObject(new String(com.amap.api.col.p0003sl.i0.d(g0Var).a));
                        if (jSONObject.has("code") && jSONObject.getInt("code") == 1) {
                            m4n m4nVar = s3nVar.f;
                            if (m4nVar != null) {
                                m4nVar.b(bArrE.length);
                            }
                            if (s3nVar.f.a() < Integer.MAX_VALUE) {
                                b(f3nVarG, arrayList);
                            } else {
                                try {
                                    f3nVarG.B();
                                } catch (Throwable th) {
                                    c2n.r(th, "ofm", "dlo");
                                }
                            }
                            return bArrE.length;
                        }
                        f3nVar = f3nVarG;
                    }
                    try {
                        f3nVarG.close();
                    } catch (Throwable th2) {
                        th2.printStackTrace();
                    }
                    return -1;
                } catch (Throwable th3) {
                    th = th3;
                    f3nVar = f3nVarG;
                    try {
                        c2n.r(th, "leg", "uts");
                        if (f3nVar != null) {
                            f3nVar.close();
                        }
                        return -1;
                    } catch (Throwable th4) {
                        if (f3nVar != null) {
                            try {
                                f3nVar.close();
                            } catch (Throwable th5) {
                                th5.printStackTrace();
                            }
                        }
                        throw th4;
                    }
                }
            }
            if (f3nVar != null) {
                f3nVar.close();
            }
        } catch (Throwable th6) {
            th6.printStackTrace();
        }
        return -1;
    }

    public static void b(f3n f3nVar, List<String> list) {
        if (f3nVar != null) {
            try {
                Iterator<String> it = list.iterator();
                while (it.hasNext()) {
                    f3nVar.z(it.next());
                }
                f3nVar.close();
            } catch (Throwable th) {
                c2n.r(th, "ofm", "dlo");
            }
        }
    }

    public static void c(String str, byte[] bArr, s3n s3nVar) throws Throwable {
        f3n f3nVarG;
        OutputStream outputStreamB = null;
        try {
            if (d(s3nVar.a, str)) {
                return;
            }
            File file = new File(s3nVar.a);
            if (!file.exists()) {
                file.mkdirs();
            }
            f3nVarG = f3n.g(file, s3nVar.b);
            try {
                f3nVarG.l(s3nVar.d);
                byte[] bArrB = s3nVar.f16462e.b(bArr);
                f3n.d dVarT = f3nVarG.t(str);
                outputStreamB = dVarT.b();
                outputStreamB.write(bArrB);
                dVarT.c();
                f3nVarG.x();
                try {
                    outputStreamB.close();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                try {
                    f3nVarG.close();
                    return;
                } catch (Throwable th2) {
                    th2.printStackTrace();
                    return;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            f3nVarG = null;
        }
        if (outputStreamB != null) {
            try {
                outputStreamB.close();
            } catch (Throwable th5) {
                th5.printStackTrace();
            }
        }
        if (f3nVarG == null) {
            throw th;
        }
        try {
            f3nVarG.close();
            throw th;
        } catch (Throwable th6) {
            th6.printStackTrace();
            throw th;
        }
    }

    public static boolean d(String str, String str2) {
        try {
            return new File(str, str2 + ".0").exists();
        } catch (Throwable th) {
            c2n.r(th, "leg", "fet");
            return false;
        }
    }

    public static byte[] e(f3n f3nVar, s3n s3nVar, List<String> list) {
        try {
            File fileU = f3nVar.u();
            if (fileU != null && fileU.exists()) {
                int length = 0;
                for (String str : fileU.list()) {
                    if (str.contains(".0")) {
                        String str2 = str.split("\\.")[0];
                        byte[] bArrG = z3n.g(f3nVar, str2);
                        length += bArrG.length;
                        list.add(str2);
                        if (length > s3nVar.f.a()) {
                            break;
                        }
                        s3nVar.g.c(bArrG);
                    }
                }
                if (length <= 0) {
                    return null;
                }
                return s3nVar.g.a();
            }
        } catch (Throwable th) {
            c2n.r(th, "leg", "gCo");
        }
        return new byte[0];
    }
}
