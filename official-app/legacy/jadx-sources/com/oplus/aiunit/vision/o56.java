package com.oplus.aiunit.vision;

import androidx.annotation.Nullable;
import com.oplus.anim.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes19.dex */
public class o56 {
    public static final JsonReader.a f = JsonReader.a.a("ef");
    public static final JsonReader.a g = JsonReader.a.a("nm", "v");
    public c40 a;
    public e40 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e40 f14788c;
    public e40 d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e40 f14789e;

    public final void a(JsonReader jsonReader, wg6 wg6Var) throws IOException {
        jsonReader.h();
        String strT = "";
        while (jsonReader.m()) {
            int iX = jsonReader.x(g);
            if (iX != 0) {
                if (iX == 1) {
                    strT.hashCode();
                    switch (strT) {
                        case "Distance":
                            this.d = k50.e(jsonReader, wg6Var);
                            break;
                        case "Opacity":
                            this.b = k50.f(jsonReader, wg6Var, false);
                            break;
                        case "Direction":
                            this.f14788c = k50.f(jsonReader, wg6Var, false);
                            break;
                        case "Shadow Color":
                            this.a = k50.c(jsonReader, wg6Var);
                            break;
                        case "Softness":
                            this.f14789e = k50.e(jsonReader, wg6Var);
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
    public m56 b(JsonReader jsonReader, wg6 wg6Var) throws IOException {
        e40 e40Var;
        e40 e40Var2;
        e40 e40Var3;
        e40 e40Var4;
        while (jsonReader.m()) {
            if (jsonReader.x(f) != 0) {
                jsonReader.y();
                jsonReader.z();
            } else {
                jsonReader.g();
                while (jsonReader.m()) {
                    a(jsonReader, wg6Var);
                }
                jsonReader.i();
            }
        }
        c40 c40Var = this.a;
        if (c40Var == null || (e40Var = this.b) == null || (e40Var2 = this.f14788c) == null || (e40Var3 = this.d) == null || (e40Var4 = this.f14789e) == null) {
            return null;
        }
        return new m56(c40Var, e40Var, e40Var2, e40Var3, e40Var4);
    }
}
