package com.oplus.aiunit.vision;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public class s9e implements huk<PointF> {
    public static final s9e INSTANCE = new s9e();

    @Override // com.oplus.aiunit.vision.huk
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public PointF a(JsonReader jsonReader, float f) throws IOException {
        return jma.e(jsonReader, f);
    }
}
