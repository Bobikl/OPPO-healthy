package com.oplus.aiunit.vision;

import com.oplus.anim.parser.moshi.JsonReader;
import io.protostuff.MapSchema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class dpa {
    public static JsonReader.a a = JsonReader.a.a(MapSchema.FIELD_NAME_KEY);

    public static <T> List<xoa<T>> a(JsonReader jsonReader, wg6 wg6Var, float f, guk<T> gukVar, boolean z) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.v() == JsonReader.Token.STRING) {
            wg6Var.a("Effective doesn't support expressions.");
            return arrayList;
        }
        jsonReader.h();
        while (jsonReader.m()) {
            if (jsonReader.x(a) != 0) {
                jsonReader.z();
            } else if (jsonReader.v() == JsonReader.Token.BEGIN_ARRAY) {
                jsonReader.g();
                if (jsonReader.v() == JsonReader.Token.NUMBER) {
                    arrayList.add(bpa.c(jsonReader, wg6Var, f, gukVar, false, z));
                } else {
                    while (jsonReader.m()) {
                        arrayList.add(bpa.c(jsonReader, wg6Var, f, gukVar, true, z));
                    }
                }
                jsonReader.i();
            } else {
                arrayList.add(bpa.c(jsonReader, wg6Var, f, gukVar, false, z));
            }
        }
        jsonReader.l();
        b(arrayList);
        return arrayList;
    }

    public static <T> void b(List<? extends xoa<T>> list) {
        int i;
        T t;
        int size = list.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            xoa<T> xoaVar = list.get(i2);
            i2++;
            xoa<T> xoaVar2 = list.get(i2);
            xoaVar.h = Float.valueOf(xoaVar2.g);
            if (xoaVar.f18704c == null && (t = xoaVar2.b) != null) {
                xoaVar.f18704c = t;
                if (xoaVar instanceof l9e) {
                    ((l9e) xoaVar).j();
                }
            }
        }
        xoa<T> xoaVar3 = list.get(i);
        if ((xoaVar3.b == null || xoaVar3.f18704c == null) && list.size() > 1) {
            list.remove(xoaVar3);
        }
    }
}
