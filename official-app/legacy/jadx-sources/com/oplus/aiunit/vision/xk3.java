package com.oplus.aiunit.vision;

import android.graphics.Color;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public class xk3 implements huk<Integer> {
    public static final xk3 INSTANCE = new xk3();

    @Override // com.oplus.aiunit.vision.huk
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Integer a(JsonReader jsonReader, float f) throws IOException {
        boolean z = jsonReader.v() == JsonReader.Token.BEGIN_ARRAY;
        if (z) {
            jsonReader.g();
        }
        double dO = jsonReader.o();
        double dO2 = jsonReader.o();
        double dO3 = jsonReader.o();
        double dO4 = jsonReader.v() == JsonReader.Token.NUMBER ? jsonReader.o() : 1.0d;
        if (z) {
            jsonReader.i();
        }
        if (dO <= 1.0d && dO2 <= 1.0d && dO3 <= 1.0d) {
            dO *= 255.0d;
            dO2 *= 255.0d;
            dO3 *= 255.0d;
            if (dO4 <= 1.0d) {
                dO4 *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) dO4, (int) dO, (int) dO2, (int) dO3));
    }
}
