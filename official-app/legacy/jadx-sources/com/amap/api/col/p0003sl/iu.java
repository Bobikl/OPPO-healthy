package com.amap.api.col.p0003sl;

import android.content.Context;
import android.util.Log;
import com.oplus.aiunit.vision.n0n;
import com.oplus.aiunit.vision.q3n;
import com.oplus.aiunit.vision.r2n;
import com.oplus.aiunit.vision.u4n;
import com.oplus.aiunit.vision.v0n;
import com.oplus.aiunit.vision.w0n;
import com.oplus.aiunit.vision.x2n;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class iu {
    public static volatile b a = b.Unknow;
    public static volatile d b = d.Unknow;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile String f743c = "";
    public static volatile String d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile long f744e = -1;
    public static volatile a f = a.Unknow;
    public static volatile long g = -1;
    public static volatile String h = "";
    public static volatile String i = "";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static volatile long f745j = 0;
    public static volatile long k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static volatile boolean f746l = false;
    public static volatile boolean m = true;

    public enum a {
        Unknow(-1),
        NotAgree(0),
        DidAgree(1);

        private int d;

        a(int i) {
            this.d = i;
        }

        public final int a() {
            return this.d;
        }

        public static a a(int i) {
            a aVar = NotAgree;
            if (i == aVar.a()) {
                return aVar;
            }
            a aVar2 = DidAgree;
            return i == aVar2.a() ? aVar2 : Unknow;
        }
    }

    public enum b {
        Unknow(-1),
        NotContain(0),
        DidContain(1);

        private int d;

        b(int i) {
            this.d = i;
        }

        public final int a() {
            return this.d;
        }

        public static b a(int i) {
            b bVar = NotContain;
            if (i == bVar.a()) {
                return bVar;
            }
            b bVar2 = DidContain;
            return i == bVar2.a() ? bVar2 : Unknow;
        }
    }

    public enum c {
        SuccessCode(0),
        ShowUnknowCode(555570),
        ShowNoShowCode(555571),
        InfoUnknowCode(555572),
        InfoNotContainCode(555573),
        AgreeUnknowCode(555574),
        AgreeNotAgreeCode(555575),
        InvaildUserKeyCode(10001),
        IllegalArgument(20001);


        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final int f753j;

        c(int i) {
            this.f753j = i;
        }

        public final int a() {
            return this.f753j;
        }
    }

    public enum d {
        Unknow(-1),
        NotShow(0),
        DidShow(1);

        private int d;

        d(int i) {
            this.d = i;
        }

        public final int a() {
            return this.d;
        }

        public static d a(int i) {
            d dVar = NotShow;
            if (i == dVar.a()) {
                return dVar;
            }
            d dVar2 = DidShow;
            return i == dVar2.a() ? dVar2 : Unknow;
        }
    }

    public class e extends u4n {
        public final /* synthetic */ Context i;

        public e(Context context) {
            this.i = context;
        }

        @Override // com.oplus.aiunit.vision.u4n
        public final void runTask() {
            Iterator it = iu.m(iu.t(this.i)).iterator();
            while (it.hasNext()) {
                iu.g(this.i, ((File) it.next()).getName());
            }
            iu.n(this.i);
        }
    }

    public class f extends u4n {
        public final /* synthetic */ boolean i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ Context f756j;
        public final /* synthetic */ long k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ JSONObject f757l;

        public f(boolean z, Context context, long j2, JSONObject jSONObject) {
            this.i = z;
            this.f756j = context;
            this.k = j2;
            this.f757l = jSONObject;
        }

        @Override // com.oplus.aiunit.vision.u4n
        public final void runTask() {
            if (this.i) {
                Iterator it = iu.m(iu.t(this.f756j)).iterator();
                while (it.hasNext()) {
                    iu.g(this.f756j, ((File) it.next()).getName());
                }
            }
            iu.r(this.f756j);
            iu.h(this.f756j, this.f757l, this.k);
            boolean zP = iu.p(this.f756j, this.f757l);
            if (zP) {
                iu.o(this.f756j, iu.l(this.k));
            }
            if (this.i) {
                iu.n(this.f756j);
            }
            if (zP) {
                return;
            }
            iu.g(this.f756j, iu.l(this.k));
        }
    }

    public static synchronized f0 a(Context context, v0n v0nVar) {
        boolean z;
        try {
            if (context == null || v0nVar == null) {
                return new f0(c.IllegalArgument, v0nVar);
            }
            if (!f746l) {
                s(context);
                f746l = true;
            }
            f0 f0Var = null;
            if (b != d.DidShow) {
                if (b == d.Unknow) {
                    f0Var = new f0(c.ShowUnknowCode, v0nVar);
                } else if (b == d.NotShow) {
                    f0Var = new f0(c.ShowNoShowCode, v0nVar);
                }
                z = false;
            } else {
                z = true;
            }
            if (z && a != b.DidContain) {
                if (a == b.Unknow) {
                    f0Var = new f0(c.InfoUnknowCode, v0nVar);
                } else if (a == b.NotContain) {
                    f0Var = new f0(c.InfoNotContainCode, v0nVar);
                }
                z = false;
            }
            if (z && f != a.DidAgree) {
                if (f == a.Unknow) {
                    f0Var = new f0(c.AgreeUnknowCode, v0nVar);
                } else if (f == a.NotAgree) {
                    f0Var = new f0(c.AgreeNotAgreeCode, v0nVar);
                }
                z = false;
            }
            if (k != f745j) {
                long j2 = f745j;
                k = f745j;
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("privacyInfo", a.a());
                    jSONObject.put("privacyShow", b.a());
                    jSONObject.put("showTime", f744e);
                    jSONObject.put("show2SDK", f743c);
                    jSONObject.put("show2SDKVer", d);
                    jSONObject.put("privacyAgree", f.a());
                    jSONObject.put("agreeTime", g);
                    jSONObject.put("agree2SDK", h);
                    jSONObject.put("agree2SDKVer", i);
                    q0.h().b(new f(m, context, j2, jSONObject));
                } catch (Throwable unused) {
                }
            } else if (m) {
                q0.h().b(new e(context));
            }
            m = false;
            String strJ = n0n.j(context);
            if (strJ == null || strJ.length() <= 0) {
                f0Var = new f0(c.InvaildUserKeyCode, v0nVar);
                Log.e(v0nVar.a(), String.format("获取apikey失败：\nerrorCode : %d\n原因：%s", Integer.valueOf(f0Var.a.a()), f0Var.b));
            }
            if (z) {
                f0Var = new f0(c.SuccessCode, v0nVar);
            } else {
                Log.e(v0nVar.a(), String.format("隐私合规校验失败：\nerrorCode : %d\n原因：%s", Integer.valueOf(f0Var.a.a()), f0Var.b));
            }
            return f0Var;
        } catch (Throwable th) {
            throw th;
        }
    }

    public static synchronized void e(Context context, a aVar, v0n v0nVar) {
        if (context == null || v0nVar == null) {
            return;
        }
        if (!f746l) {
            s(context);
            f746l = true;
        }
        if (aVar != f) {
            f = aVar;
            h = v0nVar.a();
            i = v0nVar.e();
            long jCurrentTimeMillis = System.currentTimeMillis();
            g = jCurrentTimeMillis;
            f745j = jCurrentTimeMillis;
            r(context);
        }
    }

    public static synchronized void f(Context context, d dVar, b bVar, v0n v0nVar) {
        if (context == null || v0nVar == null) {
            return;
        }
        if (!f746l) {
            s(context);
            f746l = true;
        }
        Boolean bool = Boolean.FALSE;
        if (dVar != b) {
            bool = Boolean.TRUE;
            b = dVar;
        }
        if (bVar != a) {
            bool = Boolean.TRUE;
            a = bVar;
        }
        if (bool.booleanValue()) {
            f743c = v0nVar.a();
            d = v0nVar.e();
            long jCurrentTimeMillis = System.currentTimeMillis();
            f744e = jCurrentTimeMillis;
            f745j = jCurrentTimeMillis;
            r(context);
        }
    }

    public static /* synthetic */ void g(Context context, String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        try {
            File file = new File(t(context) + "/" + str);
            if (file.exists()) {
                File file2 = new File(u(context) + "/" + str);
                if (!file2.getParentFile().exists()) {
                    file2.getParentFile().mkdirs();
                }
                file.renameTo(file2);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static /* synthetic */ void h(Context context, JSONObject jSONObject, long j2) {
        FileOutputStream fileOutputStream = null;
        try {
            byte[] bArrN = x2n.n(context, jSONObject.toString().getBytes());
            String strL = l(j2);
            File file = new File(t(context) + "/" + strL);
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                fileOutputStream2.write(bArrN);
                try {
                    fileOutputStream2.close();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            } catch (Throwable th2) {
                fileOutputStream = fileOutputStream2;
                th = th2;
                try {
                    th.printStackTrace();
                } finally {
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th3) {
                            th3.printStackTrace();
                        }
                    }
                }
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public static void i(Context context, boolean z, v0n v0nVar) {
        e(context, z ? a.DidAgree : a.NotAgree, v0nVar);
    }

    public static void j(Context context, boolean z, boolean z2, v0n v0nVar) {
        f(context, z2 ? d.DidShow : d.NotShow, z ? b.DidContain : b.NotContain, v0nVar);
    }

    public static String l(long j2) {
        return String.format("%d-%s", Long.valueOf(j2), "privacy.data");
    }

    public static ArrayList<File> m(String str) {
        ArrayList<File> arrayList = new ArrayList<>();
        if (str != null && str.length() != 0) {
            File file = new File(str);
            if (!file.exists()) {
                return arrayList;
            }
            File[] fileArrListFiles = file.listFiles();
            for (File file2 : fileArrListFiles) {
                if (file2.isFile()) {
                    arrayList.add(file2);
                }
            }
        }
        return arrayList;
    }

    public static /* synthetic */ void n(Context context) {
        try {
            for (File file : m(u(context))) {
                try {
                    String name = file.getName();
                    if (name.endsWith("-privacy.data")) {
                        String[] strArrSplit = name.split("-");
                        if (strArrSplit == null && strArrSplit.length != 2) {
                            file.delete();
                        } else if (Long.parseLong(strArrSplit[0]) <= 0) {
                            file.delete();
                        } else {
                            FileInputStream fileInputStream = new FileInputStream(file);
                            byte[] bArr = new byte[fileInputStream.available()];
                            fileInputStream.read(bArr);
                            if (p(context, new JSONObject(new String(x2n.q(context, bArr))))) {
                                file.delete();
                            }
                        }
                    } else {
                        file.delete();
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public static /* synthetic */ void o(Context context, String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        try {
            File file = new File(t(context) + "/" + str);
            if (file.exists()) {
                file.delete();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static boolean p(Context context, JSONObject jSONObject) {
        try {
            r2n r2nVar = new r2n();
            r2nVar.s = context;
            r2nVar.r = jSONObject;
            new i0();
            q3n q3nVarD = i0.d(r2nVar);
            if (q3nVarD == null) {
                return false;
            }
            JSONObject jSONObject2 = new JSONObject(w0n.g(q3nVarD.a));
            return jSONObject2.has("status") && jSONObject2.getInt("status") == 1;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public static synchronized void r(Context context) {
        if (context == null) {
            return;
        }
        if (!f746l) {
            s(context);
            f746l = true;
        }
        try {
            x2n.e(context, "AMap.privacy.data", "AMap.privacy.data", String.format("%d&%d&%d&%s&%s&%d&%d&%s&%s&%d&%d", Integer.valueOf(a.a()), Integer.valueOf(b.a()), Long.valueOf(f744e), f743c, d, Integer.valueOf(f.a()), Long.valueOf(g), h, i, Long.valueOf(f745j), Long.valueOf(k)));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void s(Context context) {
        String strD;
        if (context == null) {
            return;
        }
        try {
            strD = x2n.d(context, "AMap.privacy.data", "AMap.privacy.data");
        } catch (Throwable th) {
            th.printStackTrace();
            strD = null;
        }
        if (strD == null) {
            return;
        }
        String[] strArrSplit = strD.split("&");
        if (strArrSplit.length != 11) {
            return;
        }
        try {
            a = b.a(Integer.parseInt(strArrSplit[0]));
            b = d.a(Integer.parseInt(strArrSplit[1]));
            f744e = Long.parseLong(strArrSplit[2]);
            d = strArrSplit[3];
            d = strArrSplit[4];
            f = a.a(Integer.parseInt(strArrSplit[5]));
            g = Long.parseLong(strArrSplit[6]);
            h = strArrSplit[7];
            i = strArrSplit[8];
            f745j = Long.parseLong(strArrSplit[9]);
            k = Long.parseLong(strArrSplit[10]);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public static String t(Context context) {
        return context.getFilesDir().getAbsolutePath() + "/AMap/Privacy/Upload";
    }

    public static String u(Context context) {
        return context.getFilesDir().getAbsolutePath() + "/AMap/Privacy/Reload";
    }
}
