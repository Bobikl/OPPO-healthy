package com.oplus.aiunit.vision;

import android.content.Context;
import com.oplus.weatherservicesdk.data.Weather;
import java.util.zip.Adler32;

/* JADX INFO: loaded from: classes12.dex */
public class wkm {
    public static xgm a;
    public static final Object b = new Object();

    public static long a(xgm xgmVar) {
        if (xgmVar == null) {
            return 0L;
        }
        String str = String.format("%s%s%s%s%s", xgmVar.g(), xgmVar.i(), Long.valueOf(xgmVar.a()), xgmVar.k(), xgmVar.d());
        if (gvm.b(str)) {
            return 0L;
        }
        Adler32 adler32 = new Adler32();
        adler32.reset();
        adler32.update(str.getBytes());
        return adler32.getValue();
    }

    public static xgm b(Context context) {
        if (context == null) {
            return null;
        }
        synchronized (b) {
            String strE = uom.a(context).e();
            if (gvm.b(strE)) {
                return null;
            }
            if (strE.endsWith(Weather.SEPARATOR)) {
                strE = strE.substring(0, strE.length() - 1);
            }
            xgm xgmVar = new xgm();
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strB = som.b(context);
            String strD = som.d(context);
            xgmVar.h(strB);
            xgmVar.c(strB);
            xgmVar.e(jCurrentTimeMillis);
            xgmVar.f(strD);
            xgmVar.j(strE);
            xgmVar.b(a(xgmVar));
            return xgmVar;
        }
    }

    public static synchronized xgm c(Context context) {
        xgm xgmVar = a;
        if (xgmVar != null) {
            return xgmVar;
        }
        if (context == null) {
            return null;
        }
        xgm xgmVarB = b(context);
        a = xgmVarB;
        return xgmVarB;
    }
}
