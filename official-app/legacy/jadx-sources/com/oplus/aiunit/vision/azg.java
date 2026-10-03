package com.oplus.aiunit.vision;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public class azg {
    public static JsonReader.a a = JsonReader.a.a("nm", "ind", "ks", "hd");

    public static yyg a(JsonReader jsonReader, k9b k9bVar) throws IOException {
        String strT = null;
        int iP = 0;
        boolean zN = false;
        t40 t40VarK = null;
        while (jsonReader.m()) {
            int iX = jsonReader.x(a);
            if (iX == 0) {
                strT = jsonReader.t();
            } else if (iX == 1) {
                iP = jsonReader.p();
            } else if (iX == 2) {
                t40VarK = l50.k(jsonReader, k9bVar);
            } else if (iX != 3) {
                jsonReader.z();
            } else {
                zN = jsonReader.n();
            }
        }
        return new yyg(strT, iP, t40VarK, zN);
    }
}
