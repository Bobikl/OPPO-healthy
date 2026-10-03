package com.oplus.aiunit.vision;

import android.graphics.PointF;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.anim.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes19.dex */
public class vb3 {
    public static final JsonReader.a a = JsonReader.a.a("nm", LogFieldKey.PROCESS_NAME_KEY, "s", "hd", "d");

    public static tb3 a(JsonReader jsonReader, wg6 wg6Var, int i) throws IOException {
        boolean z = i == 3;
        boolean zN = false;
        String strT = null;
        i50<PointF, PointF> i50VarB = null;
        o40 o40VarI = null;
        while (jsonReader.m()) {
            int iX = jsonReader.x(a);
            if (iX == 0) {
                strT = jsonReader.t();
            } else if (iX == 1) {
                i50VarB = m40.b(jsonReader, wg6Var);
            } else if (iX == 2) {
                o40VarI = k50.i(jsonReader, wg6Var);
            } else if (iX == 3) {
                zN = jsonReader.n();
            } else if (iX != 4) {
                jsonReader.y();
                jsonReader.z();
            } else {
                z = jsonReader.p() == 3;
            }
        }
        return new tb3(strT, i50VarB, o40VarI, z, zN);
    }
}
