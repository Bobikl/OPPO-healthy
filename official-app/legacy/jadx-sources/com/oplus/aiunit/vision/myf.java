package com.oplus.aiunit.vision;

import androidx.annotation.Nullable;
import com.oplus.anim.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes19.dex */
public class myf {
    public static final JsonReader.a a = JsonReader.a.a("nm", "r", "hd");

    @Nullable
    public static iyf a(JsonReader jsonReader, wg6 wg6Var) throws IOException {
        boolean zN = false;
        String strT = null;
        e40 e40VarF = null;
        while (jsonReader.m()) {
            int iX = jsonReader.x(a);
            if (iX == 0) {
                strT = jsonReader.t();
            } else if (iX == 1) {
                e40VarF = k50.f(jsonReader, wg6Var, true);
            } else if (iX != 2) {
                jsonReader.z();
            } else {
                zN = jsonReader.n();
            }
        }
        if (zN) {
            return null;
        }
        return new iyf(strT, e40VarF);
    }
}
