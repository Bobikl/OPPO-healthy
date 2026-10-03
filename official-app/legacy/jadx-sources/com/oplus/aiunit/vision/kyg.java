package com.oplus.aiunit.vision;

import android.graphics.Path;
import com.oplus.anim.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.Collections;

/* JADX INFO: loaded from: classes19.dex */
public class kyg {
    public static final JsonReader.a a = JsonReader.a.a("nm", "c", "o", "fillEnabled", "r", "hd");

    public static iyg a(JsonReader jsonReader, wg6 wg6Var) throws IOException {
        i40 i40Var = null;
        String strT = null;
        c40 c40VarC = null;
        boolean zN = false;
        boolean zN2 = false;
        int iP = 1;
        while (jsonReader.m()) {
            int iX = jsonReader.x(a);
            if (iX == 0) {
                strT = jsonReader.t();
            } else if (iX == 1) {
                c40VarC = k50.c(jsonReader, wg6Var);
            } else if (iX == 2) {
                i40Var = k50.h(jsonReader, wg6Var);
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
        if (i40Var == null) {
            i40Var = new i40(Collections.singletonList(new xoa(100)));
        }
        return new iyg(strT, zN, iP == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, c40VarC, i40Var, zN2);
    }
}
