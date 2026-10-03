package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nOcrCompatResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OcrCompatResult.kt\ncom/oplus/aiunit/ocr/result/OcrCompatResult\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,49:1\n13309#2,2:50\n*S KotlinDebug\n*F\n+ 1 OcrCompatResult.kt\ncom/oplus/aiunit/ocr/result/OcrCompatResult\n*L\n40#1:50,2\n*E\n"})
public final class fed {

    @Nullable
    public p1d a;

    @NotNull
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public String f11316c;

    @NotNull
    public String d;

    public fed(@NotNull p1d ocrResult, @NotNull String text) {
        Intrinsics.checkNotNullParameter(ocrResult, "ocrResult");
        Intrinsics.checkNotNullParameter(text, "text");
        this.b = "";
        this.f11316c = "cloud";
        this.d = "OcrCompatResult";
        c(ocrResult);
        this.b = text;
    }

    @NotNull
    public final String a() {
        return this.b;
    }

    @Nullable
    public final p1d b() {
        return this.a;
    }

    public final void c(@Nullable p1d p1dVar) {
        this.a = p1dVar;
    }

    public final String d() {
        n1d[] n1dVarArr;
        StringBuilder sb = new StringBuilder();
        p1d p1dVarB = b();
        if (p1dVarB != null && (n1dVarArr = p1dVarB.b) != null) {
            for (n1d n1dVar : n1dVarArr) {
                sb.append(n1dVar.b);
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @NotNull
    public String toString() {
        p1d p1dVarB = b();
        return "OcrCompatResult[" + (p1dVarB != null ? p1dVarB.a() : null) + ", " + this.b + "]";
    }

    public fed(@NotNull p1d ocrResult) {
        Intrinsics.checkNotNullParameter(ocrResult, "ocrResult");
        this.b = "";
        this.f11316c = "cloud";
        this.d = "OcrCompatResult";
        c(ocrResult);
        this.b = d();
    }
}
