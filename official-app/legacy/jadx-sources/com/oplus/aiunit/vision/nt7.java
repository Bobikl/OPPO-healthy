package com.oplus.aiunit.vision;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public class nt7 implements huk<Float> {
    public static final nt7 INSTANCE = new nt7();

    @Override // com.oplus.aiunit.vision.huk
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Float a(JsonReader jsonReader, float f) throws IOException {
        return Float.valueOf(jma.g(jsonReader) * f);
    }
}
