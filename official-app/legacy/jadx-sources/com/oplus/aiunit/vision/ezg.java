package com.oplus.aiunit.vision;

import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.heytap.log.formatter.LogFieldKey;
import io.protostuff.MapSchema;
import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public class ezg {
    public static final JsonReader.a a = JsonReader.a.a("s", MapSchema.FIELD_NAME_ENTRY, "o", "nm", LogFieldKey.MESSAGE_KEY, "hd");

    public static ShapeTrimPath a(JsonReader jsonReader, k9b k9bVar) throws IOException {
        String strT = null;
        ShapeTrimPath.Type typeForId = null;
        f40 f40VarF = null;
        f40 f40VarF2 = null;
        f40 f40VarF3 = null;
        boolean zN = false;
        while (jsonReader.m()) {
            int iX = jsonReader.x(a);
            if (iX == 0) {
                f40VarF = l50.f(jsonReader, k9bVar, false);
            } else if (iX == 1) {
                f40VarF2 = l50.f(jsonReader, k9bVar, false);
            } else if (iX == 2) {
                f40VarF3 = l50.f(jsonReader, k9bVar, false);
            } else if (iX == 3) {
                strT = jsonReader.t();
            } else if (iX == 4) {
                typeForId = ShapeTrimPath.Type.forId(jsonReader.p());
            } else if (iX != 5) {
                jsonReader.z();
            } else {
                zN = jsonReader.n();
            }
        }
        return new ShapeTrimPath(strT, typeForId, f40VarF, f40VarF2, f40VarF3, zN);
    }
}
