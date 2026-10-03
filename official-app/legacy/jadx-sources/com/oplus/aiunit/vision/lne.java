package com.oplus.aiunit.vision;

import android.graphics.PointF;
import com.airbnb.lottie.model.content.PolystarShape;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.heytap.log.formatter.LogFieldKey;
import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public class lne {
    public static final JsonReader.a a = JsonReader.a.a("nm", "sy", "pt", LogFieldKey.PROCESS_NAME_KEY, "r", "or", "os", "ir", "is", "hd", "d");

    public static PolystarShape a(JsonReader jsonReader, k9b k9bVar, int i) throws IOException {
        boolean zN = false;
        boolean z = i == 3;
        String strT = null;
        PolystarShape.Type typeForValue = null;
        f40 f40VarF = null;
        j50<PointF, PointF> j50VarB = null;
        f40 f40VarF2 = null;
        f40 f40VarE = null;
        f40 f40VarE2 = null;
        f40 f40VarF3 = null;
        f40 f40VarF4 = null;
        while (jsonReader.m()) {
            switch (jsonReader.x(a)) {
                case 0:
                    strT = jsonReader.t();
                    break;
                case 1:
                    typeForValue = PolystarShape.Type.forValue(jsonReader.p());
                    break;
                case 2:
                    f40VarF = l50.f(jsonReader, k9bVar, false);
                    break;
                case 3:
                    j50VarB = n40.b(jsonReader, k9bVar);
                    break;
                case 4:
                    f40VarF2 = l50.f(jsonReader, k9bVar, false);
                    break;
                case 5:
                    f40VarE2 = l50.e(jsonReader, k9bVar);
                    break;
                case 6:
                    f40VarF4 = l50.f(jsonReader, k9bVar, false);
                    break;
                case 7:
                    f40VarE = l50.e(jsonReader, k9bVar);
                    break;
                case 8:
                    f40VarF3 = l50.f(jsonReader, k9bVar, false);
                    break;
                case 9:
                    zN = jsonReader.n();
                    break;
                case 10:
                    z = jsonReader.p() == 3;
                    break;
                default:
                    jsonReader.y();
                    jsonReader.z();
                    break;
            }
        }
        return new PolystarShape(strT, typeForValue, f40VarF, j50VarB, f40VarF2, f40VarE, f40VarE2, f40VarF3, f40VarF4, zN, z);
    }
}
