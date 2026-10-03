package com.oplus.aiunit.vision;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import io.protostuff.MapSchema;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes12.dex */
public class n40 {
    public static final JsonReader.a a = JsonReader.a.a(MapSchema.FIELD_NAME_KEY, "x", "y");

    public static l40 a(JsonReader jsonReader, k9b k9bVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.v() == JsonReader.Token.BEGIN_ARRAY) {
            jsonReader.g();
            while (jsonReader.m()) {
                arrayList.add(q9e.a(jsonReader, k9bVar));
            }
            jsonReader.i();
            epa.b(arrayList);
        } else {
            arrayList.add(new yoa(jma.e(jsonReader, frk.e())));
        }
        return new l40(arrayList);
    }

    public static j50<PointF, PointF> b(JsonReader jsonReader, k9b k9bVar) throws IOException {
        jsonReader.h();
        l40 l40VarA = null;
        f40 f40VarE = null;
        boolean z = false;
        f40 f40VarE2 = null;
        while (jsonReader.v() != JsonReader.Token.END_OBJECT) {
            int iX = jsonReader.x(a);
            if (iX == 0) {
                l40VarA = a(jsonReader, k9bVar);
            } else if (iX != 1) {
                if (iX != 2) {
                    jsonReader.y();
                    jsonReader.z();
                } else if (jsonReader.v() == JsonReader.Token.STRING) {
                    jsonReader.z();
                    z = true;
                } else {
                    f40VarE = l50.e(jsonReader, k9bVar);
                }
            } else if (jsonReader.v() == JsonReader.Token.STRING) {
                jsonReader.z();
                z = true;
            } else {
                f40VarE2 = l50.e(jsonReader, k9bVar);
            }
        }
        jsonReader.l();
        if (z) {
            k9bVar.a("Lottie doesn't support expressions.");
        }
        return l40VarA != null ? l40VarA : new v40(f40VarE2, f40VarE);
    }
}
