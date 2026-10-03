package com.oplus.aiunit.vision;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public class xme implements huk<PointF> {
    public static final xme INSTANCE = new xme();

    @Override // com.oplus.aiunit.vision.huk
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
        return jma.e(jsonReader, f);
    }
}
