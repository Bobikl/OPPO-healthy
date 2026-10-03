package com.oplus.aiunit.vision;

import android.graphics.PointF;
import com.oplus.anim.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes19.dex */
public class r9e implements guk<PointF> {
    public static final r9e INSTANCE = new r9e();

    @Override // com.oplus.aiunit.vision.guk
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public PointF a(JsonReader jsonReader, float f) throws IOException {
        return kma.e(jsonReader, f);
    }
}
