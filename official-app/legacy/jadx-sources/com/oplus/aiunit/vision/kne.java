package com.oplus.aiunit.vision;

import android.graphics.PointF;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.anim.model.content.PolystarShape;
import com.oplus.anim.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes19.dex */
public class kne {
    public static final JsonReader.a a = JsonReader.a.a("nm", "sy", "pt", LogFieldKey.PROCESS_NAME_KEY, "r", "or", "os", "ir", "is", "hd", "d");

    public static PolystarShape a(JsonReader jsonReader, wg6 wg6Var, int i) throws IOException {
        boolean zN = false;
        boolean z = i == 3;
        String strT = null;
        PolystarShape.Type typeForValue = null;
        e40 e40VarF = null;
        i50<PointF, PointF> i50VarB = null;
        e40 e40VarF2 = null;
        e40 e40VarE = null;
        e40 e40VarE2 = null;
        e40 e40VarF3 = null;
        e40 e40VarF4 = null;
        while (jsonReader.m()) {
            switch (jsonReader.x(a)) {
                case 0:
                    strT = jsonReader.t();
                    break;
                case 1:
                    typeForValue = PolystarShape.Type.forValue(jsonReader.p());
                    break;
                case 2:
                    e40VarF = k50.f(jsonReader, wg6Var, false);
                    break;
                case 3:
                    i50VarB = m40.b(jsonReader, wg6Var);
                    break;
                case 4:
                    e40VarF2 = k50.f(jsonReader, wg6Var, false);
                    break;
                case 5:
                    e40VarE2 = k50.e(jsonReader, wg6Var);
                    break;
                case 6:
                    e40VarF4 = k50.f(jsonReader, wg6Var, false);
                    break;
                case 7:
                    e40VarE = k50.e(jsonReader, wg6Var);
                    break;
                case 8:
                    e40VarF3 = k50.f(jsonReader, wg6Var, false);
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
        return new PolystarShape(strT, typeForValue, e40VarF, i50VarB, e40VarF2, e40VarE, e40VarE2, e40VarF3, e40VarF4, zN, z);
    }
}
