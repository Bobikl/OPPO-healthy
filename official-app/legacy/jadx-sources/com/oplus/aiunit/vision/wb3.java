package com.oplus.aiunit.vision;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.heytap.log.formatter.LogFieldKey;
import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public class wb3 {
    public static final JsonReader.a a = JsonReader.a.a("nm", LogFieldKey.PROCESS_NAME_KEY, "s", "hd", "d");

    public static ub3 a(JsonReader jsonReader, k9b k9bVar, int i) throws IOException {
        boolean z = i == 3;
        boolean zN = false;
        String strT = null;
        j50<PointF, PointF> j50VarB = null;
        p40 p40VarI = null;
        while (jsonReader.m()) {
            int iX = jsonReader.x(a);
            if (iX == 0) {
                strT = jsonReader.t();
            } else if (iX == 1) {
                j50VarB = n40.b(jsonReader, k9bVar);
            } else if (iX == 2) {
                p40VarI = l50.i(jsonReader, k9bVar);
            } else if (iX == 3) {
                zN = jsonReader.n();
            } else if (iX != 4) {
                jsonReader.y();
                jsonReader.z();
            } else {
                z = jsonReader.p() == 3;
            }
        }
        return new ub3(strT, j50VarB, p40VarI, z, zN);
    }
}
