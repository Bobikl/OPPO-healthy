package com.oplus.aiunit.vision;

import android.graphics.PointF;
import com.oplus.anim.parser.moshi.JsonReader;
import io.protostuff.MapSchema;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes19.dex */
public class m40 {
    public static final JsonReader.a a = JsonReader.a.a(MapSchema.FIELD_NAME_KEY, "x", "y");

    public static k40 a(JsonReader jsonReader, wg6 wg6Var) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.v() == JsonReader.Token.BEGIN_ARRAY) {
            jsonReader.g();
            while (jsonReader.m()) {
                arrayList.add(p9e.a(jsonReader, wg6Var));
            }
            jsonReader.i();
            dpa.b(arrayList);
        } else {
            arrayList.add(new xoa(kma.e(jsonReader, prk.e())));
        }
        return new k40(arrayList);
    }

    public static i50<PointF, PointF> b(JsonReader jsonReader, wg6 wg6Var) throws IOException {
        jsonReader.h();
        k40 k40VarA = null;
        e40 e40VarE = null;
        boolean z = false;
        e40 e40VarE2 = null;
        while (jsonReader.v() != JsonReader.Token.END_OBJECT) {
            int iX = jsonReader.x(a);
            if (iX == 0) {
                k40VarA = a(jsonReader, wg6Var);
            } else if (iX != 1) {
                if (iX != 2) {
                    jsonReader.y();
                    jsonReader.z();
                } else if (jsonReader.v() == JsonReader.Token.STRING) {
                    jsonReader.z();
                    z = true;
                } else {
                    e40VarE = k50.e(jsonReader, wg6Var);
                }
            } else if (jsonReader.v() == JsonReader.Token.STRING) {
                jsonReader.z();
                z = true;
            } else {
                e40VarE2 = k50.e(jsonReader, wg6Var);
            }
        }
        jsonReader.l();
        if (z) {
            wg6Var.a("EffectiveAnimation doesn't support expressions.");
        }
        return k40VarA != null ? k40VarA : new u40(e40VarE2, e40VarE);
    }
}
