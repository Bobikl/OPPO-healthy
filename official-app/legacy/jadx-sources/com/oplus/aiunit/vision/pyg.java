package com.oplus.aiunit.vision;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes12.dex */
public class pyg {
    public static final JsonReader.a a = JsonReader.a.a("nm", "hd", "it");

    public static nyg a(JsonReader jsonReader, k9b k9bVar) throws IOException {
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
                    l84 l84VarA = n84.a(jsonReader, k9bVar);
                    if (l84VarA != null) {
                        arrayList.add(l84VarA);
                    }
                }
                jsonReader.i();
            }
        }
        return new nyg(strT, arrayList, zN);
    }
}
