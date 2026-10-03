package com.oplus.aiunit.vision;

import android.graphics.Color;
import android.graphics.PointF;
import androidx.annotation.ColorInt;
import com.oplus.anim.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class kma {
    public static final JsonReader.a a = JsonReader.a.a("x", "y");

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[JsonReader.Token.values().length];
            a = iArr;
            try {
                iArr[JsonReader.Token.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[JsonReader.Token.BEGIN_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[JsonReader.Token.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static PointF a(JsonReader jsonReader, float f) throws IOException {
        jsonReader.g();
        float fO = (float) jsonReader.o();
        float fO2 = (float) jsonReader.o();
        while (jsonReader.v() != JsonReader.Token.END_ARRAY) {
            jsonReader.z();
        }
        jsonReader.i();
        return new PointF(fO * f, fO2 * f);
    }

    public static PointF b(JsonReader jsonReader, float f) throws IOException {
        float fO = (float) jsonReader.o();
        float fO2 = (float) jsonReader.o();
        while (jsonReader.m()) {
            jsonReader.z();
        }
        return new PointF(fO * f, fO2 * f);
    }

    public static PointF c(JsonReader jsonReader, float f) throws IOException {
        jsonReader.h();
        float fG = 0.0f;
        float fG2 = 0.0f;
        while (jsonReader.m()) {
            int iX = jsonReader.x(a);
            if (iX == 0) {
                fG = g(jsonReader);
            } else if (iX != 1) {
                jsonReader.y();
                jsonReader.z();
            } else {
                fG2 = g(jsonReader);
            }
        }
        jsonReader.l();
        return new PointF(fG * f, fG2 * f);
    }

    @ColorInt
    public static int d(JsonReader jsonReader) throws IOException {
        jsonReader.g();
        int iO = (int) (jsonReader.o() * 255.0d);
        int iO2 = (int) (jsonReader.o() * 255.0d);
        int iO3 = (int) (jsonReader.o() * 255.0d);
        while (jsonReader.m()) {
            jsonReader.z();
        }
        jsonReader.i();
        return Color.argb(255, iO, iO2, iO3);
    }

    public static PointF e(JsonReader jsonReader, float f) throws IOException {
        int i = a.a[jsonReader.v().ordinal()];
        if (i == 1) {
            return b(jsonReader, f);
        }
        if (i == 2) {
            return a(jsonReader, f);
        }
        if (i == 3) {
            return c(jsonReader, f);
        }
        throw new IllegalArgumentException("Unknown point starts with " + jsonReader.v());
    }

    public static List<PointF> f(JsonReader jsonReader, float f) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.g();
        while (jsonReader.v() == JsonReader.Token.BEGIN_ARRAY) {
            jsonReader.g();
            arrayList.add(e(jsonReader, f));
            jsonReader.i();
        }
        jsonReader.i();
        return arrayList;
    }

    public static float g(JsonReader jsonReader) throws IOException {
        JsonReader.Token tokenV = jsonReader.v();
        int i = a.a[tokenV.ordinal()];
        if (i == 1) {
            return (float) jsonReader.o();
        }
        if (i != 2) {
            throw new IllegalArgumentException("Unknown value for token of type " + tokenV);
        }
        jsonReader.g();
        float fO = (float) jsonReader.o();
        while (jsonReader.m()) {
            jsonReader.z();
        }
        jsonReader.i();
        return fO;
    }
}
