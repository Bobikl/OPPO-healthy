package com.oplus.aiunit.vision;

import com.airbnb.lottie.model.content.Mask;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public class ygb {
    public static Mask a(JsonReader jsonReader, k9b k9bVar) throws IOException {
        jsonReader.h();
        Mask.MaskMode maskMode = null;
        t40 t40VarK = null;
        j40 j40VarH = null;
        boolean zN = false;
        while (jsonReader.m()) {
            String strS = jsonReader.s();
            strS.hashCode();
            switch (strS) {
                case "o":
                    j40VarH = l50.h(jsonReader, k9bVar);
                    break;
                case "pt":
                    t40VarK = l50.k(jsonReader, k9bVar);
                    break;
                case "inv":
                    zN = jsonReader.n();
                    break;
                case "mode":
                    String strT = jsonReader.t();
                    strT.hashCode();
                    switch (strT) {
                        case "a":
                            maskMode = Mask.MaskMode.MASK_MODE_ADD;
                            break;
                        case "i":
                            k9bVar.a("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                            maskMode = Mask.MaskMode.MASK_MODE_INTERSECT;
                            break;
                        case "n":
                            maskMode = Mask.MaskMode.MASK_MODE_NONE;
                            break;
                        case "s":
                            maskMode = Mask.MaskMode.MASK_MODE_SUBTRACT;
                            break;
                        default:
                            o7b.c("Unknown mask mode " + strS + ". Defaulting to Add.");
                            maskMode = Mask.MaskMode.MASK_MODE_ADD;
                            break;
                    }
                    break;
                default:
                    jsonReader.z();
                    break;
            }
        }
        jsonReader.l();
        return new Mask(maskMode, t40VarK, j40VarH, zN);
    }
}
