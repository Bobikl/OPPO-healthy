package com.oplus.aiunit.vision;

import android.graphics.PointF;
import com.airbnb.lottie.model.DocumentData;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public class ny5 implements huk<DocumentData> {
    public static final ny5 INSTANCE = new ny5();
    public static final JsonReader.a a = JsonReader.a.a("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of", "ps", "sz");

    @Override // com.oplus.aiunit.vision.huk
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public DocumentData a(JsonReader jsonReader, float f) throws IOException {
        DocumentData.Justification justification = DocumentData.Justification.CENTER;
        jsonReader.h();
        DocumentData.Justification justification2 = justification;
        String strT = null;
        String strT2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        float fO = 0.0f;
        float fO2 = 0.0f;
        float fO3 = 0.0f;
        float fO4 = 0.0f;
        int iP = 0;
        int iD = 0;
        int iD2 = 0;
        boolean zN = true;
        while (jsonReader.m()) {
            switch (jsonReader.x(a)) {
                case 0:
                    strT = jsonReader.t();
                    break;
                case 1:
                    strT2 = jsonReader.t();
                    break;
                case 2:
                    fO = (float) jsonReader.o();
                    break;
                case 3:
                    int iP2 = jsonReader.p();
                    justification2 = DocumentData.Justification.CENTER;
                    if (iP2 <= justification2.ordinal() && iP2 >= 0) {
                        justification2 = DocumentData.Justification.values()[iP2];
                    }
                    break;
                case 4:
                    iP = jsonReader.p();
                    break;
                case 5:
                    fO2 = (float) jsonReader.o();
                    break;
                case 6:
                    fO3 = (float) jsonReader.o();
                    break;
                case 7:
                    iD = jma.d(jsonReader);
                    break;
                case 8:
                    iD2 = jma.d(jsonReader);
                    break;
                case 9:
                    fO4 = (float) jsonReader.o();
                    break;
                case 10:
                    zN = jsonReader.n();
                    break;
                case 11:
                    jsonReader.g();
                    PointF pointF3 = new PointF(((float) jsonReader.o()) * f, ((float) jsonReader.o()) * f);
                    jsonReader.i();
                    pointF = pointF3;
                    break;
                case 12:
                    jsonReader.g();
                    PointF pointF4 = new PointF(((float) jsonReader.o()) * f, ((float) jsonReader.o()) * f);
                    jsonReader.i();
                    pointF2 = pointF4;
                    break;
                default:
                    jsonReader.y();
                    jsonReader.z();
                    break;
            }
        }
        jsonReader.l();
        return new DocumentData(strT, strT2, fO, justification2, iP, fO2, fO3, iD, iD2, fO4, zN, pointF, pointF2);
    }
}
