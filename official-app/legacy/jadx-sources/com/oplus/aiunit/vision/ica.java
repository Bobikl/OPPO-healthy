package com.oplus.aiunit.vision;

import com.oplus.anim.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes19.dex */
public class ica implements guk<Integer> {
    public static final ica INSTANCE = new ica();

    @Override // com.oplus.aiunit.vision.guk
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Integer a(JsonReader jsonReader, float f) throws IOException {
        return Integer.valueOf(Math.round(kma.g(jsonReader) * f));
    }
}
