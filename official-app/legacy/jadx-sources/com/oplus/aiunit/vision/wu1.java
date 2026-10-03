package com.oplus.aiunit.vision;

import androidx.annotation.Nullable;
import com.oplus.anim.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes19.dex */
public class wu1 {
    public static final JsonReader.a a = JsonReader.a.a("ef");
    public static final JsonReader.a b = JsonReader.a.a(qam.s, "v");

    @Nullable
    public static uu1 a(JsonReader jsonReader, wg6 wg6Var) throws IOException {
        jsonReader.h();
        uu1 uu1Var = null;
        while (true) {
            boolean z = false;
            while (true) {
                if (!jsonReader.m()) {
                    jsonReader.l();
                    return uu1Var;
                }
                int iX = jsonReader.x(b);
                if (iX != 0) {
                    if (iX != 1) {
                        jsonReader.y();
                        jsonReader.z();
                    } else if (z) {
                        uu1Var = new uu1(k50.e(jsonReader, wg6Var));
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
    public static uu1 b(JsonReader jsonReader, wg6 wg6Var) throws IOException {
        uu1 uu1Var = null;
        while (jsonReader.m()) {
            if (jsonReader.x(a) != 0) {
                jsonReader.y();
                jsonReader.z();
            } else {
                jsonReader.g();
                while (jsonReader.m()) {
                    uu1 uu1VarA = a(jsonReader, wg6Var);
                    if (uu1VarA != null) {
                        uu1Var = uu1VarA;
                    }
                }
                jsonReader.i();
            }
        }
        return uu1Var;
    }
}
