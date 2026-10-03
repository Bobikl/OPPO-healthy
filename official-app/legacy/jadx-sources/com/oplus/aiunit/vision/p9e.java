package com.oplus.aiunit.vision;

import com.oplus.anim.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes19.dex */
public class p9e {
    public static l9e a(JsonReader jsonReader, wg6 wg6Var) throws IOException {
        return new l9e(wg6Var, bpa.c(jsonReader, wg6Var, prk.e(), r9e.INSTANCE, jsonReader.v() == JsonReader.Token.BEGIN_OBJECT, false));
    }
}
