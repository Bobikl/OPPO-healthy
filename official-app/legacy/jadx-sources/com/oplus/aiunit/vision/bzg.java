package com.oplus.aiunit.vision;

import com.oplus.anim.model.content.ShapeStroke;
import com.oplus.anim.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes19.dex */
public class bzg {
    public static final JsonReader.a a = JsonReader.a.a("nm", "c", "w", "o", "lc", "lj", "ml", "hd", "d");
    public static final JsonReader.a b = JsonReader.a.a("n", "v");

    public static ShapeStroke a(JsonReader jsonReader, wg6 wg6Var) throws IOException {
        ArrayList arrayList = new ArrayList();
        float fO = 0.0f;
        boolean zN = false;
        String strT = null;
        e40 e40Var = null;
        c40 c40VarC = null;
        e40 e40VarE = null;
        ShapeStroke.LineCapType lineCapType = null;
        ShapeStroke.LineJoinType lineJoinType = null;
        i40 i40Var = null;
        while (jsonReader.m()) {
            switch (jsonReader.x(a)) {
                case 0:
                    strT = jsonReader.t();
                    break;
                case 1:
                    c40VarC = k50.c(jsonReader, wg6Var);
                    break;
                case 2:
                    e40VarE = k50.e(jsonReader, wg6Var);
                    break;
                case 3:
                    i40Var = k50.h(jsonReader, wg6Var);
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
                        e40 e40VarE2 = null;
                        while (jsonReader.m()) {
                            int iX = jsonReader.x(b);
                            if (iX == 0) {
                                strT2 = jsonReader.t();
                            } else if (iX != 1) {
                                jsonReader.y();
                                jsonReader.z();
                            } else {
                                e40VarE2 = k50.e(jsonReader, wg6Var);
                            }
                        }
                        jsonReader.l();
                        strT2.hashCode();
                        switch (strT2) {
                            case "d":
                            case "g":
                                wg6Var.u(true);
                                arrayList.add(e40VarE2);
                                break;
                            case "o":
                                e40Var = e40VarE2;
                                break;
                        }
                    }
                    jsonReader.i();
                    if (arrayList.size() == 1) {
                        arrayList.add((e40) arrayList.get(0));
                    }
                    break;
                default:
                    jsonReader.z();
                    break;
            }
        }
        if (i40Var == null) {
            i40Var = new i40(Collections.singletonList(new xoa(100)));
        }
        return new ShapeStroke(strT, e40Var, arrayList, c40VarC, i40Var, e40VarE, lineCapType, lineJoinType, fO, zN);
    }
}
