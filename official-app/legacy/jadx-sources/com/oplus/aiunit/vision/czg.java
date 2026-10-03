package com.oplus.aiunit.vision;

import com.airbnb.lottie.model.content.ShapeStroke;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes12.dex */
public class czg {
    public static final JsonReader.a a = JsonReader.a.a("nm", "c", "w", "o", "lc", "lj", "ml", "hd", "d");
    public static final JsonReader.a b = JsonReader.a.a("n", "v");

    public static ShapeStroke a(JsonReader jsonReader, k9b k9bVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        float fO = 0.0f;
        boolean zN = false;
        String strT = null;
        f40 f40Var = null;
        d40 d40VarC = null;
        f40 f40VarE = null;
        j40 j40Var = null;
        ShapeStroke.LineCapType lineCapType = null;
        ShapeStroke.LineJoinType lineJoinType = null;
        while (jsonReader.m()) {
            switch (jsonReader.x(a)) {
                case 0:
                    strT = jsonReader.t();
                    break;
                case 1:
                    d40VarC = l50.c(jsonReader, k9bVar);
                    break;
                case 2:
                    f40VarE = l50.e(jsonReader, k9bVar);
                    break;
                case 3:
                    j40Var = l50.h(jsonReader, k9bVar);
                    break;
                case 4:
                    lineCapType = ShapeStroke.LineCapType.values()[jsonReader.p() - 1];
                    break;
                case 5:
                    lineJoinType = ShapeStroke.LineJoinType.values()[jsonReader.p() - 1];
                    break;
                case 6:
                    fO = (float) jsonReader.o();
                    break;
                case 7:
                    zN = jsonReader.n();
                    break;
                case 8:
                    jsonReader.g();
                    while (jsonReader.m()) {
                        jsonReader.h();
                        String strT2 = null;
                        f40 f40VarE2 = null;
                        while (jsonReader.m()) {
                            int iX = jsonReader.x(b);
                            if (iX == 0) {
                                strT2 = jsonReader.t();
                            } else if (iX != 1) {
                                jsonReader.y();
                                jsonReader.z();
                            } else {
                                f40VarE2 = l50.e(jsonReader, k9bVar);
                            }
                        }
                        jsonReader.l();
                        strT2.hashCode();
                        switch (strT2) {
                            case "d":
                            case "g":
                                k9bVar.v(true);
                                arrayList.add(f40VarE2);
                                break;
                            case "o":
                                f40Var = f40VarE2;
                                break;
                        }
                    }
                    jsonReader.i();
                    if (arrayList.size() == 1) {
                        arrayList.add((f40) arrayList.get(0));
                    }
                    break;
                default:
                    jsonReader.z();
                    break;
            }
        }
        if (j40Var == null) {
            j40Var = new j40(Collections.singletonList(new yoa(100)));
        }
        if (lineCapType == null) {
            lineCapType = ShapeStroke.LineCapType.BUTT;
        }
        if (lineJoinType == null) {
            lineJoinType = ShapeStroke.LineJoinType.MITER;
        }
        return new ShapeStroke(strT, f40Var, arrayList, d40VarC, j40Var, f40VarE, lineCapType, lineJoinType, fO, zN);
    }
}
