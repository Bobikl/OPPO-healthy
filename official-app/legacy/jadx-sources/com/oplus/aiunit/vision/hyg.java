package com.oplus.aiunit.vision;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class hyg implements huk<fyg> {
    public static final hyg INSTANCE = new hyg();
    public static final JsonReader.a a = JsonReader.a.a("c", "v", "i", "o");

    @Override // com.oplus.aiunit.vision.huk
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public fyg a(JsonReader jsonReader, float f) throws IOException {
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
                listF = jma.f(jsonReader, f);
            } else if (iX == 2) {
                listF2 = jma.f(jsonReader, f);
            } else if (iX != 3) {
                jsonReader.y();
                jsonReader.z();
            } else {
                listF3 = jma.f(jsonReader, f);
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
            return new fyg(new PointF(), false, Collections.emptyList());
        }
        int size = listF.size();
        PointF pointF = listF.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i = 1; i < size; i++) {
            PointF pointF2 = listF.get(i);
            int i2 = i - 1;
            arrayList.add(new xe4(m0c.a(listF.get(i2), listF3.get(i2)), m0c.a(pointF2, listF2.get(i)), pointF2));
        }
        if (zN) {
            PointF pointF3 = listF.get(0);
            int i3 = size - 1;
            arrayList.add(new xe4(m0c.a(listF.get(i3), listF3.get(i3)), m0c.a(pointF3, listF2.get(0)), pointF3));
        }
        return new fyg(pointF, zN, arrayList);
    }
}
