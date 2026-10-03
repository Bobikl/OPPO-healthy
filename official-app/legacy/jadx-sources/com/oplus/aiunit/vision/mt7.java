package com.oplus.aiunit.vision;

import com.oplus.anim.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes19.dex */
public class mt7 implements guk<Float> {
    public static final mt7 INSTANCE = new mt7();

    @Override // com.oplus.aiunit.vision.guk
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Float a(JsonReader jsonReader, float f) throws IOException {
        return Float.valueOf(kma.g(jsonReader) * f);
    }
}
