package com.oplus.aiunit.vision;

import com.oplus.anim.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes19.dex */
public class oyg {
    public static final JsonReader.a a = JsonReader.a.a("nm", "hd", "it");

    public static myg a(JsonReader jsonReader, wg6 wg6Var) throws IOException {
        ArrayList arrayList = new ArrayList();
        String strT = null;
        boolean zN = false;
        while (jsonReader.m()) {
            int iX = jsonReader.x(a);
            if (iX == 0) {
                strT = jsonReader.t();
            } else if (iX == 1) {
                zN = jsonReader.n();
            } else if (iX != 2) {
                jsonReader.z();
            } else {
                jsonReader.g();
                while (jsonReader.m()) {
                    k84 k84VarA = m84.a(jsonReader, wg6Var);
                    if (k84VarA != null) {
                        arrayList.add(k84VarA);
                    }
                }
                jsonReader.i();
            }
        }
        return new myg(strT, arrayList, zN);
    }
}
