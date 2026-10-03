package com.oplus.aiunit.vision;

import androidx.annotation.Nullable;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public class nyf {
    public static final JsonReader.a a = JsonReader.a.a("nm", "r", "hd");

    @Nullable
    public static jyf a(JsonReader jsonReader, k9b k9bVar) throws IOException {
        boolean zN = false;
        String strT = null;
        f40 f40VarF = null;
        while (jsonReader.m()) {
            int iX = jsonReader.x(a);
            if (iX == 0) {
                strT = jsonReader.t();
            } else if (iX == 1) {
                f40VarF = l50.f(jsonReader, k9bVar, true);
            } else if (iX != 2) {
                jsonReader.z();
            } else {
                zN = jsonReader.n();
            }
        }
        if (zN) {
            return null;
        }
        return new jyf(strT, f40VarF);
    }
}
