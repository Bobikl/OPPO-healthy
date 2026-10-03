package com.oplus.aiunit.vision;

import com.oplus.anim.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes19.dex */
public class a50 {
    public static final JsonReader.a a = JsonReader.a.a("a");
    public static final JsonReader.a b = JsonReader.a.a("fc", "sc", "sw", "t");

    public static y40 a(JsonReader jsonReader, wg6 wg6Var) throws IOException {
        jsonReader.h();
        y40 y40VarB = null;
        while (jsonReader.m()) {
            if (jsonReader.x(a) != 0) {
                jsonReader.y();
                jsonReader.z();
            } else {
                y40VarB = b(jsonReader, wg6Var);
            }
        }
        jsonReader.l();
        return y40VarB == null ? new y40(null, null, null, null) : y40VarB;
    }

    public static y40 b(JsonReader jsonReader, wg6 wg6Var) throws IOException {
        jsonReader.h();
        c40 c40VarC = null;
        c40 c40VarC2 = null;
        e40 e40VarE = null;
        e40 e40VarE2 = null;
        while (jsonReader.m()) {
            int iX = jsonReader.x(b);
            if (iX == 0) {
                c40VarC = k50.c(jsonReader, wg6Var);
            } else if (iX == 1) {
                c40VarC2 = k50.c(jsonReader, wg6Var);
            } else if (iX == 2) {
                e40VarE = k50.e(jsonReader, wg6Var);
            } else if (iX != 3) {
                jsonReader.y();
                jsonReader.z();
            } else {
                e40VarE2 = k50.e(jsonReader, wg6Var);
            }
        }
        jsonReader.l();
        return new y40(c40VarC, c40VarC2, e40VarE, e40VarE2);
    }
}
