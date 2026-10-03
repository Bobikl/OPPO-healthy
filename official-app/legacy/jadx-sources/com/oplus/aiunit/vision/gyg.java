package com.oplus.aiunit.vision;

import android.graphics.PointF;
import com.oplus.anim.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class gyg implements guk<eyg> {
    public static final gyg INSTANCE = new gyg();
    public static final JsonReader.a a = JsonReader.a.a("c", "v", "i", "o");

    @Override // com.oplus.aiunit.vision.guk
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public eyg a(JsonReader jsonReader, float f) throws IOException {
        if (jsonReader.v() == JsonReader.Token.BEGIN_ARRAY) {
            jsonReader.g();
        }
        jsonReader.h();
        List<PointF> listF = null;
        List<PointF> listF2 = null;
        List<PointF> listF3 = null;
        boolean zN = false;
        while (jsonReader.m()) {
            int iX = jsonReader.x(a);
            if (iX == 0) {
                zN = jsonReader.n();
            } else if (iX == 1) {
                listF = kma.f(jsonReader, f);
            } else if (iX == 2) {
                listF2 = kma.f(jsonReader, f);
            } else if (iX != 3) {
                jsonReader.y();
                jsonReader.z();
            } else {
                listF3 = kma.f(jsonReader, f);
            }
        }
        jsonReader.l();
        if (jsonReader.v() == JsonReader.Token.END_ARRAY) {
            jsonReader.i();
        }
        if (listF == null || listF2 == null || listF3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        }
        if (listF.isEmpty()) {
            return new eyg(new PointF(), false, Collections.emptyList());
        }
        int size = listF.size();
        PointF pointF = listF.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i = 1; i < size; i++) {
            PointF pointF2 = listF.get(i);
            int i2 = i - 1;
            arrayList.add(new we4(l0c.a(listF.get(i2), listF3.get(i2)), l0c.a(pointF2, listF2.get(i)), pointF2));
        }
        if (zN) {
            PointF pointF3 = listF.get(0);
            int i3 = size - 1;
            arrayList.add(new we4(l0c.a(listF.get(i3), listF3.get(i3)), l0c.a(pointF3, listF2.get(0)), pointF3));
        }
        return new eyg(pointF, zN, arrayList);
    }
}
