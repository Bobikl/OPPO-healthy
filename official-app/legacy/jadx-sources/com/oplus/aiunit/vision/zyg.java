package com.oplus.aiunit.vision;

import com.oplus.anim.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes19.dex */
public class zyg {
    public static JsonReader.a a = JsonReader.a.a("nm", "ind", "ks", "hd");

    public static xyg a(JsonReader jsonReader, wg6 wg6Var) throws IOException {
        String strT = null;
        int iP = 0;
        boolean zN = false;
        s40 s40VarK = null;
        while (jsonReader.m()) {
            int iX = jsonReader.x(a);
            if (iX == 0) {
                strT = jsonReader.t();
            } else if (iX == 1) {
                iP = jsonReader.p();
            } else if (iX == 2) {
                s40VarK = k50.k(jsonReader, wg6Var);
            } else if (iX != 3) {
                jsonReader.z();
            } else {
                zN = jsonReader.n();
            }
        }
        return new xyg(strT, iP, s40VarK, zN);
    }
}
