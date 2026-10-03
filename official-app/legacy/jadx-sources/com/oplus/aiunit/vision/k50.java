package com.oplus.aiunit.vision;

import com.oplus.anim.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class k50 {
    public static <T> List<xoa<T>> a(JsonReader jsonReader, float f, wg6 wg6Var, guk<T> gukVar) throws IOException {
        return dpa.a(jsonReader, wg6Var, f, gukVar, false);
    }

    public static <T> List<xoa<T>> b(JsonReader jsonReader, wg6 wg6Var, guk<T> gukVar) throws IOException {
        return dpa.a(jsonReader, wg6Var, 1.0f, gukVar, false);
    }

    public static c40 c(JsonReader jsonReader, wg6 wg6Var) throws IOException {
        return new c40(b(jsonReader, wg6Var, wk3.INSTANCE));
    }

    public static w40 d(JsonReader jsonReader, wg6 wg6Var) throws IOException {
        return new w40(a(jsonReader, prk.e(), wg6Var, my5.INSTANCE));
    }

    public static e40 e(JsonReader jsonReader, wg6 wg6Var) throws IOException {
        return f(jsonReader, wg6Var, true);
    }

    public static e40 f(JsonReader jsonReader, wg6 wg6Var, boolean z) throws IOException {
        return new e40(a(jsonReader, z ? prk.e() : 1.0f, wg6Var, mt7.INSTANCE));
    }

    public static g40 g(JsonReader jsonReader, wg6 wg6Var, int i) throws IOException {
        return new g40(b(jsonReader, wg6Var, new va8(i)));
    }

    public static i40 h(JsonReader jsonReader, wg6 wg6Var) throws IOException {
        return new i40(b(jsonReader, wg6Var, ica.INSTANCE));
    }

    public static o40 i(JsonReader jsonReader, wg6 wg6Var) throws IOException {
        return new o40(dpa.a(jsonReader, wg6Var, prk.e(), wme.INSTANCE, true));
    }

    public static q40 j(JsonReader jsonReader, wg6 wg6Var) throws IOException {
        return new q40(b(jsonReader, wg6Var, eeg.INSTANCE));
    }

    public static s40 k(JsonReader jsonReader, wg6 wg6Var) throws IOException {
        return new s40(a(jsonReader, prk.e(), wg6Var, gyg.INSTANCE));
    }
}
