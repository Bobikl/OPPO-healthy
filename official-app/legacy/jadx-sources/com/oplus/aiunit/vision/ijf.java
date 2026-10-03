package com.oplus.aiunit.vision;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.heytap.log.formatter.LogFieldKey;
import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public class ijf {
    public static final JsonReader.a a = JsonReader.a.a("nm", LogFieldKey.PROCESS_NAME_KEY, "s", "r", "hd");

    public static gjf a(JsonReader jsonReader, k9b k9bVar) throws IOException {
        String strT = null;
        j50<PointF, PointF> j50VarB = null;
        p40 p40VarI = null;
        f40 f40VarE = null;
        boolean zN = false;
        while (jsonReader.m()) {
            int iX = jsonReader.x(a);
            if (iX == 0) {
                strT = jsonReader.t();
            } else if (iX == 1) {
                j50VarB = n40.b(jsonReader, k9bVar);
            } else if (iX == 2) {
                p40VarI = l50.i(jsonReader, k9bVar);
            } else if (iX == 3) {
                f40VarE = l50.e(jsonReader, k9bVar);
            } else if (iX != 4) {
                jsonReader.z();
            } else {
                zN = jsonReader.n();
            }
        }
        return new gjf(strT, j50VarB, p40VarI, f40VarE, zN);
    }
}
