package com.oplus.aiunit.vision;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public class q9e {
    public static m9e a(JsonReader jsonReader, k9b k9bVar) throws IOException {
        return new m9e(k9bVar, cpa.c(jsonReader, k9bVar, frk.e(), s9e.INSTANCE, jsonReader.v() == JsonReader.Token.BEGIN_OBJECT, false));
    }
}
