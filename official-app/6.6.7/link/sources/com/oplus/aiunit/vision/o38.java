package com.oplus.aiunit.vision;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0007R\"\u0010\u000b\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/oplus/aiunit/vision/o38;", "", "any", "", "a", "Lcom/google/gson/Gson;", "Lcom/google/gson/Gson;", "getGson", "()Lcom/google/gson/Gson;", "setGson", "(Lcom/google/gson/Gson;)V", "gson", "<init>", "()V", "paysdk_statistic_release"}, k = 1, mv = {1, 8, 0})
public final class o38 {

    @NotNull
    public static final o38 INSTANCE = new o38();

    @NotNull
    public static Gson a;

    static {
        Gson gsonCreate = new GsonBuilder().setLenient().create();
        Intrinsics.checkNotNullExpressionValue(gsonCreate, "GsonBuilder().setLenient().create()");
        a = gsonCreate;
    }

    @JvmStatic
    @NotNull
    public static final String a(@Nullable Object any) {
        try {
            String json = a.toJson(any);
            Intrinsics.checkNotNullExpressionValue(json, "{\n            gson.toJson(any)\n        }");
            return json;
        } catch (Throwable th) {
            pce.c(th.getMessage());
            return "";
        }
    }
}
