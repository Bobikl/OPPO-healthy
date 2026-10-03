package com.oplus.aiunit.vision;

import android.content.Context;
import android.text.TextUtils;
import com.oplus.weatherservicesdk.data.Weather;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.Random;
import java.util.regex.Pattern;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes12.dex */
public class uom {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static uom f17552j;
    public Context a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public tsm f17553c;
    public String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f17554e;
    public jam f;
    public jam g;
    public static final Object i = new Object();
    public static final String k = ".UTSystemConfig" + File.separator + "Global";
    public String b = null;
    public Pattern h = Pattern.compile("[^0-9a-zA-Z=/+]+");

    public uom(Context context) {
        this.a = null;
        this.f17553c = null;
        this.d = "xx_utdid_key";
        this.f17554e = "xx_utdid_domain";
        this.f = null;
        this.g = null;
        this.a = context;
        this.g = new jam(context, k, "Alvin2", false, true);
        this.f = new jam(context, ".DataStorage", "ContextData", false, true);
        this.f17553c = new tsm();
        this.d = String.format("K_%d", Integer.valueOf(gvm.a(this.d)));
        this.f17554e = String.format("D_%d", Integer.valueOf(gvm.a(this.f17554e)));
    }

    public static uom a(Context context) {
        if (context != null && f17552j == null) {
            synchronized (i) {
                if (f17552j == null) {
                    uom uomVar = new uom(context);
                    f17552j = uomVar;
                    uomVar.i();
                }
            }
        }
        return f17552j;
    }

    public static String c(byte[] bArr) throws Exception {
        Mac mac = Mac.getInstance("HmacSHA1");
        mac.init(new SecretKeySpec(rsm.b(new byte[]{69, 114, 116, -33, 125, -54, -31, 86, -11, 11, -78, -96, -17, -99, 64, 23, -95, -126, -82, -64, 113, 116, -16, -103, 49, -30, 9, -39, 33, -80, -68, -78, -117, 53, 30, -122, 64, -104, 74, -49, 106, 85, -38, -93}), mac.getAlgorithm()));
        return tgm.e(mac.doFinal(bArr), 2);
    }

    public synchronized String b() {
        String strG = g();
        this.b = strG;
        if (!TextUtils.isEmpty(strG)) {
            return this.b;
        }
        try {
            byte[] bArrJ = j();
            if (bArrJ != null) {
                String strE = tgm.e(bArrJ, 2);
                this.b = strE;
                f(strE);
                String strB = this.f17553c.b(bArrJ);
                if (strB != null) {
                    h(strB);
                }
                return this.b;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return null;
    }

    public final boolean d(String str) {
        if (str != null) {
            if (str.endsWith(Weather.SEPARATOR)) {
                str = str.substring(0, str.length() - 1);
            }
            if (24 == str.length() && !this.h.matcher(str).find()) {
                return true;
            }
        }
        return false;
    }

    public synchronized String e() {
        String str = this.b;
        if (str != null) {
            return str;
        }
        return b();
    }

    public final void f(String str) {
        jam jamVar;
        if (d(str)) {
            if (str.endsWith(Weather.SEPARATOR)) {
                str = str.substring(0, str.length() - 1);
            }
            if (str.length() != 24 || (jamVar = this.g) == null) {
                return;
            }
            jamVar.b("UTDID2", str);
            this.g.c();
        }
    }

    public synchronized String g() {
        String strK = k();
        if (d(strK)) {
            h(this.f17553c.a(strK));
            this.b = strK;
            return strK;
        }
        String strA = this.f.a(this.d);
        if (!gvm.b(strA)) {
            String strA2 = new hvm().a(strA);
            if (!d(strA2)) {
                strA2 = this.f17553c.c(strA);
            }
            if (d(strA2) && !gvm.b(strA2)) {
                this.b = strA2;
                f(strA2);
                return this.b;
            }
        }
        return null;
    }

    public final void h(String str) {
        jam jamVar;
        if (str == null || (jamVar = this.f) == null || str.equals(jamVar.a(this.d))) {
            return;
        }
        this.f.b(this.d, str);
        this.f.c();
    }

    public final void i() {
        boolean z;
        jam jamVar = this.g;
        if (jamVar != null) {
            if (gvm.b(jamVar.a("UTDID2"))) {
                String strA = this.g.a("UTDID");
                if (!gvm.b(strA)) {
                    f(strA);
                }
            }
            boolean z2 = true;
            if (gvm.b(this.g.a("DID"))) {
                z = false;
            } else {
                this.g.e("DID");
                z = true;
            }
            if (!gvm.b(this.g.a("EI"))) {
                this.g.e("EI");
                z = true;
            }
            if (gvm.b(this.g.a("SI"))) {
                z2 = z;
            } else {
                this.g.e("SI");
            }
            if (z2) {
                this.g.c();
            }
        }
    }

    public final byte[] j() throws Exception {
        String strB;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        int iNextInt = new Random().nextInt();
        byte[] bArrA = ukm.a(iCurrentTimeMillis);
        byte[] bArrA2 = ukm.a(iNextInt);
        byteArrayOutputStream.write(bArrA, 0, 4);
        byteArrayOutputStream.write(bArrA2, 0, 4);
        byteArrayOutputStream.write(3);
        byteArrayOutputStream.write(0);
        try {
            strB = som.b(this.a);
        } catch (Exception unused) {
            strB = "" + new Random().nextInt();
        }
        byteArrayOutputStream.write(ukm.a(gvm.a(strB)), 0, 4);
        byteArrayOutputStream.write(ukm.a(gvm.a(c(byteArrayOutputStream.toByteArray()))));
        return byteArrayOutputStream.toByteArray();
    }

    public final String k() {
        jam jamVar = this.g;
        if (jamVar == null) {
            return null;
        }
        String strA = jamVar.a("UTDID2");
        if (gvm.b(strA) || this.f17553c.a(strA) == null) {
            return null;
        }
        return strA;
    }
}
