package com.oplus.aiunit.vision;

import android.graphics.RectF;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nMaskRect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MaskRect.kt\ncom/oplus/aiunit/ocr/data/MaskRectList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,41:1\n1855#2,2:42\n*S KotlinDebug\n*F\n+ 1 MaskRect.kt\ncom/oplus/aiunit/ocr/data/MaskRectList\n*L\n24#1:42,2\n*E\n"})
public final class zgb {

    @NotNull
    public static final a Companion = new a(null);

    @NotNull
    public final List<RectF> a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public zgb(@NotNull List<? extends RectF> rectList) {
        Intrinsics.checkNotNullParameter(rectList, "rectList");
        this.a = rectList;
    }

    @Nullable
    public final String a() {
        if (this.a.isEmpty()) {
            i0.a("MaskRectList", "toJson rectList is empty");
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            for (RectF rectF : this.a) {
                JSONObject jSONObject2 = new JSONObject();
                JSONArray jSONArray2 = new JSONArray();
                jSONArray2.put(Float.valueOf(rectF.left));
                jSONArray2.put(Float.valueOf(rectF.top));
                jSONArray2.put(Float.valueOf(rectF.right));
                jSONArray2.put(Float.valueOf(rectF.bottom));
                jSONObject2.put("rect", jSONArray2);
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("maskrects", jSONArray);
        } catch (Exception e2) {
            i0.c("MaskRectList", "toJson error=" + e2.getMessage());
        }
        return jSONObject.toString(0);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zgb) && Intrinsics.areEqual(this.a, ((zgb) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @NotNull
    public String toString() {
        return "MaskRectList(rectList=" + this.a + ")";
    }
}
