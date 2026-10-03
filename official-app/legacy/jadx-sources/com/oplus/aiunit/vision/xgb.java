package com.oplus.aiunit.vision;

import com.oplus.anim.model.content.Mask;
import com.oplus.anim.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes19.dex */
public class xgb {
    public static Mask a(JsonReader jsonReader, wg6 wg6Var) throws IOException {
        jsonReader.h();
        Mask.MaskMode maskMode = null;
        s40 s40VarK = null;
        i40 i40VarH = null;
        boolean zN = false;
        while (jsonReader.m()) {
            String strS = jsonReader.s();
            strS.hashCode();
            switch (strS) {
                case "o":
                    i40VarH = k50.h(jsonReader, wg6Var);
                    break;
                case "pt":
                    s40VarK = k50.k(jsonReader, wg6Var);
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
                            wg6Var.a("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                            maskMode = Mask.MaskMode.MASK_MODE_INTERSECT;
                            break;
                        case "n":
                            maskMode = Mask.MaskMode.MASK_MODE_NONE;
                            break;
                        case "s":
                            maskMode = Mask.MaskMode.MASK_MODE_SUBTRACT;
                            break;
                        default:
                            u7b.c("Unknown mask mode " + strS + ". Defaulting to Add.");
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
        return new Mask(maskMode, s40VarK, i40VarH, zN);
    }
}
