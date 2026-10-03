package com.oplus.aiunit.vision;

import androidx.annotation.Nullable;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public class xu1 {
    public static final JsonReader.a a = JsonReader.a.a("ef");
    public static final JsonReader.a b = JsonReader.a.a(qam.s, "v");

    @Nullable
    public static vu1 a(JsonReader jsonReader, k9b k9bVar) throws IOException {
        jsonReader.h();
        vu1 vu1Var = null;
        while (true) {
            boolean z = false;
            while (true) {
                if (!jsonReader.m()) {
                    jsonReader.l();
                    return vu1Var;
                }
                int iX = jsonReader.x(b);
                if (iX != 0) {
                    if (iX != 1) {
                        jsonReader.y();
                        jsonReader.z();
                    } else if (z) {
                        vu1Var = new vu1(l50.e(jsonReader, k9bVar));
                    } else {
                        jsonReader.z();
                    }
                } else if (jsonReader.p() == 0) {
                    z = true;
                }
            }
        }
    }

    @Nullable
    public static vu1 b(JsonReader jsonReader, k9b k9bVar) throws IOException {
        vu1 vu1Var = null;
        while (jsonReader.m()) {
            if (jsonReader.x(a) != 0) {
                jsonReader.y();
                jsonReader.z();
            } else {
                jsonReader.g();
                while (jsonReader.m()) {
                    vu1 vu1VarA = a(jsonReader, k9bVar);
                    if (vu1VarA != null) {
                        vu1Var = vu1VarA;
                    }
                }
                jsonReader.i();
            }
        }
        return vu1Var;
    }
}
