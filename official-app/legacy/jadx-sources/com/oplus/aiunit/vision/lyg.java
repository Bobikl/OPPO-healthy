package com.oplus.aiunit.vision;

import android.graphics.Path;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.Collections;

/* JADX INFO: loaded from: classes12.dex */
public class lyg {
    public static final JsonReader.a a = JsonReader.a.a("nm", "c", "o", "fillEnabled", "r", "hd");

    public static jyg a(JsonReader jsonReader, k9b k9bVar) throws IOException {
        j40 j40Var = null;
        String strT = null;
        d40 d40VarC = null;
        boolean zN = false;
        boolean zN2 = false;
        int iP = 1;
        while (jsonReader.m()) {
            int iX = jsonReader.x(a);
            if (iX == 0) {
                strT = jsonReader.t();
            } else if (iX == 1) {
                d40VarC = l50.c(jsonReader, k9bVar);
            } else if (iX == 2) {
                j40Var = l50.h(jsonReader, k9bVar);
            } else if (iX == 3) {
                zN = jsonReader.n();
            } else if (iX == 4) {
                iP = jsonReader.p();
            } else if (iX != 5) {
                jsonReader.y();
                jsonReader.z();
            } else {
                zN2 = jsonReader.n();
            }
        }
        if (j40Var == null) {
            j40Var = new j40(Collections.singletonList(new yoa(100)));
        }
        return new jyg(strT, zN, iP == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, d40VarC, j40Var, zN2);
    }
}
