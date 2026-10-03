package com.oplus.aiunit.vision;

import com.heytap.log.formatter.LogFieldKey;
import com.oplus.anim.model.content.ShapeTrimPath;
import com.oplus.anim.parser.moshi.JsonReader;
import io.protostuff.MapSchema;
import java.io.IOException;

/* JADX INFO: loaded from: classes19.dex */
public class dzg {
    public static final JsonReader.a a = JsonReader.a.a("s", MapSchema.FIELD_NAME_ENTRY, "o", "nm", LogFieldKey.MESSAGE_KEY, "hd");

    public static ShapeTrimPath a(JsonReader jsonReader, wg6 wg6Var) throws IOException {
        String strT = null;
        ShapeTrimPath.Type typeForId = null;
        e40 e40VarF = null;
        e40 e40VarF2 = null;
        e40 e40VarF3 = null;
        boolean zN = false;
        while (jsonReader.m()) {
            int iX = jsonReader.x(a);
            if (iX == 0) {
                e40VarF = k50.f(jsonReader, wg6Var, false);
            } else if (iX == 1) {
                e40VarF2 = k50.f(jsonReader, wg6Var, false);
            } else if (iX == 2) {
                e40VarF3 = k50.f(jsonReader, wg6Var, false);
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
        return new ShapeTrimPath(strT, typeForId, e40VarF, e40VarF2, e40VarF3, zN);
    }
}
