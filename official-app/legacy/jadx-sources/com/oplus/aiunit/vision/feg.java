package com.oplus.aiunit.vision;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public class feg implements huk<deg> {
    public static final feg INSTANCE = new feg();

    @Override // com.oplus.aiunit.vision.huk
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public deg a(JsonReader jsonReader, float f) throws IOException {
        boolean z = jsonReader.v() == JsonReader.Token.BEGIN_ARRAY;
        if (z) {
            jsonReader.g();
        }
        float fO = (float) jsonReader.o();
        float fO2 = (float) jsonReader.o();
        while (jsonReader.m()) {
            jsonReader.z();
        }
        if (z) {
            jsonReader.i();
        }
        return new deg((fO / 100.0f) * f, (fO2 / 100.0f) * f);
    }
}
