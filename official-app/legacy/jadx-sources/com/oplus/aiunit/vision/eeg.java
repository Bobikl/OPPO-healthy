package com.oplus.aiunit.vision;

import com.oplus.anim.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes19.dex */
public class eeg implements guk<ceg> {
    public static final eeg INSTANCE = new eeg();

    @Override // com.oplus.aiunit.vision.guk
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ceg a(JsonReader jsonReader, float f) throws IOException {
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
        return new ceg((fO / 100.0f) * f, (fO2 / 100.0f) * f);
    }
}
