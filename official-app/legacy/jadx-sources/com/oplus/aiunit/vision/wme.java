package com.oplus.aiunit.vision;

import android.graphics.PointF;
import com.oplus.anim.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes19.dex */
public class wme implements guk<PointF> {
    public static final wme INSTANCE = new wme();

    @Override // com.oplus.aiunit.vision.guk
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public PointF a(JsonReader jsonReader, float f) throws IOException {
        JsonReader.Token tokenV = jsonReader.v();
        if (tokenV != JsonReader.Token.BEGIN_ARRAY && tokenV != JsonReader.Token.BEGIN_OBJECT) {
            if (tokenV == JsonReader.Token.NUMBER) {
                PointF pointF = new PointF(((float) jsonReader.o()) * f, ((float) jsonReader.o()) * f);
                while (jsonReader.m()) {
                    jsonReader.z();
                }
                return pointF;
            }
            throw new IllegalArgumentException("Cannot convert json to point. Next token is " + tokenV);
        }
        return kma.e(jsonReader, f);
    }
}
