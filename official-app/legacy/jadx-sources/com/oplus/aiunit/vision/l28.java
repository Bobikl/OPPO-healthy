package com.oplus.aiunit.vision;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.commons.codec.language.bm.Languages;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0007R\"\u0010\u000b\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/oplus/aiunit/vision/l28;", "", Languages.ANY, "", "a", "Lcom/google/gson/Gson;", "Lcom/google/gson/Gson;", "getGson", "()Lcom/google/gson/Gson;", "setGson", "(Lcom/google/gson/Gson;)V", "gson", "<init>", "()V", "paysdk_statistic_release"}, k = 1, mv = {1, 8, 0})
public final class l28 {

    @NotNull
    public static final l28 INSTANCE = new l28();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static Gson gson;

    static {
        Gson gsonCreate = new GsonBuilder().setLenient().create();
        Intrinsics.checkNotNullExpressionValue(gsonCreate, "GsonBuilder().setLenient().create()");
        gson = gsonCreate;
    }

    @JvmStatic
    @NotNull
    public static final String a(@Nullable Object any) {
        try {
            String json = gson.toJson(any);
            Intrinsics.checkNotNullExpressionValue(json, "{\n            gson.toJson(any)\n        }");
            return json;
        } catch (Throwable th) {
            qae.c(th.getMessage());
            return "";
        }
    }
}
