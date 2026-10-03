package com.oplus.aiunit.vision;

import androidx.annotation.Nullable;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public class n84 {
    public static final JsonReader.a a = JsonReader.a.a(qam.s, "d");

    @Nullable
    public static l84 a(JsonReader jsonReader, k9b k9bVar) throws IOException {
        l84 l84VarA;
        String strT;
        jsonReader.h();
        byte b = 2;
        int iP = 2;
        while (true) {
            l84VarA = null;
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
                l84VarA = wb3.a(jsonReader, k9bVar, iP);
                break;
            case 1:
                l84VarA = lyg.a(jsonReader, k9bVar);
                break;
            case 2:
                l84VarA = cb8.a(jsonReader, k9bVar);
                break;
            case 3:
                l84VarA = pyg.a(jsonReader, k9bVar);
                break;
            case 4:
                l84VarA = pb8.a(jsonReader, k9bVar);
                break;
            case 5:
                l84VarA = ywb.a(jsonReader);
                k9bVar.a("Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove().");
                break;
            case 6:
                l84VarA = ijf.a(jsonReader, k9bVar);
                break;
            case 7:
                l84VarA = nyf.a(jsonReader, k9bVar);
                break;
            case 8:
                l84VarA = upf.a(jsonReader, k9bVar);
                break;
            case 9:
                l84VarA = azg.a(jsonReader, k9bVar);
                break;
            case 10:
                l84VarA = lne.a(jsonReader, k9bVar, iP);
                break;
            case 11:
                l84VarA = czg.a(jsonReader, k9bVar);
                break;
            case 12:
                l84VarA = ezg.a(jsonReader, k9bVar);
                break;
            case 13:
                l84VarA = h50.g(jsonReader, k9bVar);
                break;
            default:
                o7b.c("Unknown shape type " + strT);
                break;
        }
        while (jsonReader.m()) {
            jsonReader.z();
        }
        jsonReader.l();
        return l84VarA;
    }
}
