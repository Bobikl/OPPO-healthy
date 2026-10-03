package com.oplus.aiunit.vision;

import com.airbnb.lottie.parser.moshi.JsonReader;
import io.protostuff.MapSchema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class epa {
    public static JsonReader.a a = JsonReader.a.a(MapSchema.FIELD_NAME_KEY);

    public static <T> List<yoa<T>> a(JsonReader jsonReader, k9b k9bVar, float f, huk<T> hukVar, boolean z) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.v() == JsonReader.Token.STRING) {
            k9bVar.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        jsonReader.h();
        while (jsonReader.m()) {
            if (jsonReader.x(a) != 0) {
                jsonReader.z();
            } else if (jsonReader.v() == JsonReader.Token.BEGIN_ARRAY) {
                jsonReader.g();
                if (jsonReader.v() == JsonReader.Token.NUMBER) {
                    arrayList.add(cpa.c(jsonReader, k9bVar, f, hukVar, false, z));
                } else {
                    while (jsonReader.m()) {
                        arrayList.add(cpa.c(jsonReader, k9bVar, f, hukVar, true, z));
                    }
                }
                jsonReader.i();
            } else {
                arrayList.add(cpa.c(jsonReader, k9bVar, f, hukVar, false, z));
            }
        }
        jsonReader.l();
        b(arrayList);
        return arrayList;
    }

    public static <T> void b(List<? extends yoa<T>> list) {
        int i;
        T t;
        int size = list.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            yoa<T> yoaVar = list.get(i2);
            i2++;
            yoa<T> yoaVar2 = list.get(i2);
            yoaVar.h = Float.valueOf(yoaVar2.g);
            if (yoaVar.f19086c == null && (t = yoaVar2.b) != null) {
                yoaVar.f19086c = t;
                if (yoaVar instanceof m9e) {
                    ((m9e) yoaVar).j();
                }
            }
        }
        yoa<T> yoaVar3 = list.get(i);
        if ((yoaVar3.b == null || yoaVar3.f19086c == null) && list.size() > 1) {
            list.remove(yoaVar3);
        }
    }
}
