package com.oplus.aiunit.vision;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class l50 {
    public static <T> List<yoa<T>> a(JsonReader jsonReader, float f, k9b k9bVar, huk<T> hukVar) throws IOException {
        return epa.a(jsonReader, k9bVar, f, hukVar, false);
    }

    public static <T> List<yoa<T>> b(JsonReader jsonReader, k9b k9bVar, huk<T> hukVar) throws IOException {
        return epa.a(jsonReader, k9bVar, 1.0f, hukVar, false);
    }

    public static d40 c(JsonReader jsonReader, k9b k9bVar) throws IOException {
        return new d40(b(jsonReader, k9bVar, xk3.INSTANCE));
    }

    public static x40 d(JsonReader jsonReader, k9b k9bVar) throws IOException {
        return new x40(a(jsonReader, frk.e(), k9bVar, ny5.INSTANCE));
    }

    public static f40 e(JsonReader jsonReader, k9b k9bVar) throws IOException {
        return f(jsonReader, k9bVar, true);
    }

    public static f40 f(JsonReader jsonReader, k9b k9bVar, boolean z) throws IOException {
        return new f40(a(jsonReader, z ? frk.e() : 1.0f, k9bVar, nt7.INSTANCE));
    }

    public static h40 g(JsonReader jsonReader, k9b k9bVar, int i) throws IOException {
        return new h40(b(jsonReader, k9bVar, new wa8(i)));
    }

    public static j40 h(JsonReader jsonReader, k9b k9bVar) throws IOException {
        return new j40(b(jsonReader, k9bVar, jca.INSTANCE));
    }

    public static p40 i(JsonReader jsonReader, k9b k9bVar) throws IOException {
        return new p40(epa.a(jsonReader, k9bVar, frk.e(), xme.INSTANCE, true));
    }

    public static r40 j(JsonReader jsonReader, k9b k9bVar) throws IOException {
        return new r40(b(jsonReader, k9bVar, feg.INSTANCE));
    }

    public static t40 k(JsonReader jsonReader, k9b k9bVar) throws IOException {
        return new t40(a(jsonReader, frk.e(), k9bVar, hyg.INSTANCE));
    }
}
