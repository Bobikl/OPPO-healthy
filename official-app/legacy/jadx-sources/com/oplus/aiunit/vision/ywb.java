package com.oplus.aiunit.vision;

import com.airbnb.lottie.model.content.MergePaths;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public class ywb {
    public static final JsonReader.a a = JsonReader.a.a("nm", "mm", "hd");

    public static MergePaths a(JsonReader jsonReader) throws IOException {
        String strT = null;
        boolean zN = false;
        MergePaths.MergePathsMode mergePathsModeForId = null;
        while (jsonReader.m()) {
            int iX = jsonReader.x(a);
            if (iX == 0) {
                strT = jsonReader.t();
            } else if (iX == 1) {
                mergePathsModeForId = MergePaths.MergePathsMode.forId(jsonReader.p());
            } else if (iX != 2) {
                jsonReader.y();
                jsonReader.z();
            } else {
                zN = jsonReader.n();
            }
        }
        return new MergePaths(strT, mergePathsModeForId, zN);
    }
}
