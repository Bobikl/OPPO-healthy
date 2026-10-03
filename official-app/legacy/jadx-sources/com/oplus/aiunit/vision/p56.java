package com.oplus.aiunit.vision;

import androidx.annotation.Nullable;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public class p56 {
    public static final JsonReader.a f = JsonReader.a.a("ef");
    public static final JsonReader.a g = JsonReader.a.a("nm", "v");
    public d40 a;
    public f40 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f40 f15201c;
    public f40 d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public f40 f15202e;

    public final void a(JsonReader jsonReader, k9b k9bVar) throws IOException {
        jsonReader.h();
        String strT = "";
        while (jsonReader.m()) {
            int iX = jsonReader.x(g);
            if (iX != 0) {
                if (iX == 1) {
                    strT.hashCode();
                    switch (strT) {
                        case "Distance":
                            this.d = l50.e(jsonReader, k9bVar);
                            break;
                        case "Opacity":
                            this.b = l50.f(jsonReader, k9bVar, false);
                            break;
                        case "Direction":
                            this.f15201c = l50.f(jsonReader, k9bVar, false);
                            break;
                        case "Shadow Color":
                            this.a = l50.c(jsonReader, k9bVar);
                            break;
                        case "Softness":
                            this.f15202e = l50.e(jsonReader, k9bVar);
                            break;
                        default:
                            jsonReader.z();
                            break;
                    }
                } else {
                    jsonReader.y();
                    jsonReader.z();
                }
            } else {
                strT = jsonReader.t();
            }
        }
        jsonReader.l();
    }

    @Nullable
    public n56 b(JsonReader jsonReader, k9b k9bVar) throws IOException {
        f40 f40Var;
        f40 f40Var2;
        f40 f40Var3;
        f40 f40Var4;
        while (jsonReader.m()) {
            if (jsonReader.x(f) != 0) {
                jsonReader.y();
                jsonReader.z();
            } else {
                jsonReader.g();
                while (jsonReader.m()) {
                    a(jsonReader, k9bVar);
                }
                jsonReader.i();
            }
        }
        d40 d40Var = this.a;
        if (d40Var == null || (f40Var = this.b) == null || (f40Var2 = this.f15201c) == null || (f40Var3 = this.d) == null || (f40Var4 = this.f15202e) == null) {
            return null;
        }
        return new n56(d40Var, f40Var, f40Var2, f40Var3, f40Var4);
    }
}
