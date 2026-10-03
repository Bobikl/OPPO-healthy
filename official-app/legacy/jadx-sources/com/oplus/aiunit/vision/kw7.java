package com.oplus.aiunit.vision;

import com.airbnb.lottie.parser.moshi.JsonReader;
import com.heytap.webview.extension.protocol.Const;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes12.dex */
public class kw7 {
    public static final JsonReader.a a = JsonReader.a.a(dj8.CHANNEL, "size", "w", Const.Arguments.Open.STYLE, "fFamily", "data");
    public static final JsonReader.a b = JsonReader.a.a("shapes");

    public static iw7 a(JsonReader jsonReader, k9b k9bVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.h();
        double dO = 0.0d;
        String strT = null;
        String strT2 = null;
        char cCharAt = 0;
        double dO2 = 0.0d;
        while (jsonReader.m()) {
            int iX = jsonReader.x(a);
            if (iX == 0) {
                cCharAt = jsonReader.t().charAt(0);
            } else if (iX == 1) {
                dO2 = jsonReader.o();
            } else if (iX == 2) {
                dO = jsonReader.o();
            } else if (iX == 3) {
                strT = jsonReader.t();
            } else if (iX == 4) {
                strT2 = jsonReader.t();
            } else if (iX != 5) {
                jsonReader.y();
                jsonReader.z();
            } else {
                jsonReader.h();
                while (jsonReader.m()) {
                    if (jsonReader.x(b) != 0) {
                        jsonReader.y();
                        jsonReader.z();
                    } else {
                        jsonReader.g();
                        while (jsonReader.m()) {
                            arrayList.add((nyg) n84.a(jsonReader, k9bVar));
                        }
                        jsonReader.i();
                    }
                }
                jsonReader.l();
            }
        }
        jsonReader.l();
        return new iw7(arrayList, cCharAt, dO2, dO, strT, strT2);
    }
}
