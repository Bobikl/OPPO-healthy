package com.oplus.aiunit.vision;

import com.oplus.anim.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes19.dex */
public class mw7 {
    public static final JsonReader.a a = JsonReader.a.a("fFamily", "fName", "fStyle", "ascent");

    public static aw7 a(JsonReader jsonReader) throws IOException {
        jsonReader.h();
        String strT = null;
        String strT2 = null;
        float fO = 0.0f;
        String strT3 = null;
        while (jsonReader.m()) {
            int iX = jsonReader.x(a);
            if (iX == 0) {
                strT = jsonReader.t();
            } else if (iX == 1) {
                strT3 = jsonReader.t();
            } else if (iX == 2) {
                strT2 = jsonReader.t();
            } else if (iX != 3) {
                jsonReader.y();
                jsonReader.z();
            } else {
                fO = (float) jsonReader.o();
            }
        }
        jsonReader.l();
        return new aw7(strT, strT3, strT2, fO);
    }
}
