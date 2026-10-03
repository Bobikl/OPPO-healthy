package com.oplus.aiunit.vision;

import androidx.annotation.Nullable;
import com.oplus.anim.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes19.dex */
public class m84 {
    public static final JsonReader.a a = JsonReader.a.a(qam.s, "d");

    @Nullable
    public static k84 a(JsonReader jsonReader, wg6 wg6Var) throws IOException {
        k84 k84VarA;
        String strT;
        jsonReader.h();
        byte b = 2;
        int iP = 2;
        while (true) {
            k84VarA = null;
            if (!jsonReader.m()) {
                strT = null;
                break;
            }
            int iX = jsonReader.x(a);
            if (iX == 0) {
                strT = jsonReader.t();
                break;
            }
            if (iX != 1) {
                jsonReader.y();
                jsonReader.z();
            } else {
                iP = jsonReader.p();
            }
        }
        if (strT == null) {
            return null;
        }
        switch (strT.hashCode()) {
            case 3239:
                b = !strT.equals("el") ? (byte) -1 : (byte) 0;
                break;
            case 3270:
                b = !strT.equals("fl") ? (byte) -1 : (byte) 1;
                break;
            case 3295:
                if (!strT.equals("gf")) {
                    b = -1;
                }
                break;
            case 3307:
                b = !strT.equals("gr") ? (byte) -1 : (byte) 3;
                break;
            case 3308:
                b = !strT.equals("gs") ? (byte) -1 : (byte) 4;
                break;
            case 3488:
                b = !strT.equals("mm") ? (byte) -1 : (byte) 5;
                break;
            case 3633:
                b = !strT.equals("rc") ? (byte) -1 : (byte) 6;
                break;
            case 3634:
                b = !strT.equals("rd") ? (byte) -1 : (byte) 7;
                break;
            case 3646:
                b = !strT.equals("rp") ? (byte) -1 : (byte) 8;
                break;
            case 3669:
                b = !strT.equals("sh") ? (byte) -1 : (byte) 9;
                break;
            case 3679:
                b = !strT.equals("sr") ? (byte) -1 : (byte) 10;
                break;
            case 3681:
                b = !strT.equals("st") ? (byte) -1 : (byte) 11;
                break;
            case 3705:
                b = !strT.equals("tm") ? (byte) -1 : (byte) 12;
                break;
            case 3710:
                b = !strT.equals("tr") ? (byte) -1 : (byte) 13;
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                k84VarA = vb3.a(jsonReader, wg6Var, iP);
                break;
            case 1:
                k84VarA = kyg.a(jsonReader, wg6Var);
                break;
            case 2:
                k84VarA = bb8.a(jsonReader, wg6Var);
                break;
            case 3:
                k84VarA = oyg.a(jsonReader, wg6Var);
                break;
            case 4:
                k84VarA = ob8.a(jsonReader, wg6Var);
                break;
            case 5:
                k84VarA = xwb.a(jsonReader);
                wg6Var.a("Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove().");
                break;
            case 6:
                k84VarA = hjf.a(jsonReader, wg6Var);
                break;
            case 7:
                k84VarA = myf.a(jsonReader, wg6Var);
                break;
            case 8:
                k84VarA = tpf.a(jsonReader, wg6Var);
                break;
            case 9:
                k84VarA = zyg.a(jsonReader, wg6Var);
                break;
            case 10:
                k84VarA = kne.a(jsonReader, wg6Var, iP);
                break;
            case 11:
                k84VarA = bzg.a(jsonReader, wg6Var);
                break;
            case 12:
                k84VarA = dzg.a(jsonReader, wg6Var);
                break;
            case 13:
                k84VarA = g50.g(jsonReader, wg6Var);
                break;
            default:
                u7b.c("Unknown shape type " + strT);
                break;
        }
        while (jsonReader.m()) {
            jsonReader.z();
        }
        jsonReader.l();
        return k84VarA;
    }
}
