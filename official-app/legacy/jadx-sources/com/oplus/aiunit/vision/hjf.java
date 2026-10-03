package com.oplus.aiunit.vision;

import android.graphics.PointF;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.anim.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes19.dex */
public class hjf {
    public static final JsonReader.a a = JsonReader.a.a("nm", LogFieldKey.PROCESS_NAME_KEY, "s", "r", "hd");

    public static fjf a(JsonReader jsonReader, wg6 wg6Var) throws IOException {
        String strT = null;
        i50<PointF, PointF> i50VarB = null;
        o40 o40VarI = null;
        e40 e40VarE = null;
        boolean zN = false;
        while (jsonReader.m()) {
            int iX = jsonReader.x(a);
            if (iX == 0) {
                strT = jsonReader.t();
            } else if (iX == 1) {
                i50VarB = m40.b(jsonReader, wg6Var);
            } else if (iX == 2) {
                o40VarI = k50.i(jsonReader, wg6Var);
            } else if (iX == 3) {
                e40VarE = k50.e(jsonReader, wg6Var);
            } else if (iX != 4) {
                jsonReader.z();
            } else {
                zN = jsonReader.n();
            }
        }
        return new fjf(strT, i50VarB, o40VarI, e40VarE, zN);
    }
}
