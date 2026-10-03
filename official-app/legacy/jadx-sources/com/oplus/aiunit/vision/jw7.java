package com.oplus.aiunit.vision;

import com.heytap.webview.extension.protocol.Const;
import com.oplus.anim.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes19.dex */
public class jw7 {
    public static final JsonReader.a a = JsonReader.a.a(dj8.CHANNEL, "size", "w", Const.Arguments.Open.STYLE, "fFamily", "data");
    public static final JsonReader.a b = JsonReader.a.a("shapes");

    public static hw7 a(JsonReader jsonReader, wg6 wg6Var) throws IOException {
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
                            arrayList.add((myg) m84.a(jsonReader, wg6Var));
                        }
                        jsonReader.i();
                    }
                }
                jsonReader.l();
            }
        }
        jsonReader.l();
        return new hw7(arrayList, cCharAt, dO2, dO, strT, strT2);
    }
}
