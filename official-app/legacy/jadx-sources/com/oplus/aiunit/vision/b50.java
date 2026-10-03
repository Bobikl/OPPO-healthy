package com.oplus.aiunit.vision;

import com.airbnb.lottie.model.content.TextRangeUnits;
import com.airbnb.lottie.parser.moshi.JsonReader;
import io.protostuff.MapSchema;
import java.io.IOException;
import java.util.Collections;

/* JADX INFO: loaded from: classes12.dex */
public class b50 {
    public static final JsonReader.a a = JsonReader.a.a("s", "a");
    public static final JsonReader.a b = JsonReader.a.a("s", MapSchema.FIELD_NAME_ENTRY, "o", "r");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final JsonReader.a f9600c = JsonReader.a.a("fc", "sc", "sw", "t", "o");

    public static z40 a(JsonReader jsonReader, k9b k9bVar) throws IOException {
        jsonReader.h();
        d50 d50VarC = null;
        c50 c50VarB = null;
        while (jsonReader.m()) {
            int iX = jsonReader.x(a);
            if (iX == 0) {
                c50VarB = b(jsonReader, k9bVar);
            } else if (iX != 1) {
                jsonReader.y();
                jsonReader.z();
            } else {
                d50VarC = c(jsonReader, k9bVar);
            }
        }
        jsonReader.l();
        return new z40(d50VarC, c50VarB);
    }

    public static c50 b(JsonReader jsonReader, k9b k9bVar) throws IOException {
        jsonReader.h();
        j40 j40Var = null;
        j40 j40VarH = null;
        j40 j40VarH2 = null;
        TextRangeUnits textRangeUnits = null;
        while (jsonReader.m()) {
            int iX = jsonReader.x(b);
            if (iX == 0) {
                j40Var = l50.h(jsonReader, k9bVar);
            } else if (iX == 1) {
                j40VarH = l50.h(jsonReader, k9bVar);
            } else if (iX == 2) {
                j40VarH2 = l50.h(jsonReader, k9bVar);
            } else if (iX != 3) {
                jsonReader.y();
                jsonReader.z();
            } else {
                int iP = jsonReader.p();
                if (iP == 1 || iP == 2) {
                    textRangeUnits = iP == 1 ? TextRangeUnits.PERCENT : TextRangeUnits.INDEX;
                } else {
                    k9bVar.a("Unsupported text range units: " + iP);
                    textRangeUnits = TextRangeUnits.INDEX;
                }
            }
        }
        jsonReader.l();
        if (j40Var == null && j40VarH != null) {
            j40Var = new j40(Collections.singletonList(new yoa(0)));
        }
        return new c50(j40Var, j40VarH, j40VarH2, textRangeUnits);
    }

    public static d50 c(JsonReader jsonReader, k9b k9bVar) throws IOException {
        jsonReader.h();
        d40 d40VarC = null;
        d40 d40VarC2 = null;
        f40 f40VarE = null;
        f40 f40VarE2 = null;
        j40 j40VarH = null;
        while (jsonReader.m()) {
            int iX = jsonReader.x(f9600c);
            if (iX == 0) {
                d40VarC = l50.c(jsonReader, k9bVar);
            } else if (iX == 1) {
                d40VarC2 = l50.c(jsonReader, k9bVar);
            } else if (iX == 2) {
                f40VarE = l50.e(jsonReader, k9bVar);
            } else if (iX == 3) {
                f40VarE2 = l50.e(jsonReader, k9bVar);
            } else if (iX != 4) {
                jsonReader.y();
                jsonReader.z();
            } else {
                j40VarH = l50.h(jsonReader, k9bVar);
            }
        }
        jsonReader.l();
        return new d50(d40VarC, d40VarC2, f40VarE, f40VarE2, j40VarH);
    }
}
