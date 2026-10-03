package com.heytap.store.platform.tools;

import androidx.exifinterface.media.ExifInterface;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.Reader;
import java.lang.reflect.Type;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\u0004J+\u0010\n\u001a\u0002H\u000b\"\u0004\b\u0000\u0010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u0002H\u000b\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010J%\u0010\n\u001a\u0002H\u000b\"\u0004\b\u0000\u0010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012J+\u0010\n\u001a\u0002H\u000b\"\u0004\b\u0000\u0010\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u0002H\u000b\u0018\u00010\u000f¢\u0006\u0002\u0010\u0015J%\u0010\n\u001a\u0002H\u000b\"\u0004\b\u0000\u0010\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u000e\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/heytap/store/platform/tools/GsonUtils;", "", "()V", "gson", "Lcom/google/gson/Gson;", "getGson", "()Lcom/google/gson/Gson;", "setGson", "(Lcom/google/gson/Gson;)V", "createGson", "fromJson", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "reader", "Ljava/io/Reader;", "type", "Ljava/lang/Class;", "(Ljava/io/Reader;Ljava/lang/Class;)Ljava/lang/Object;", "Ljava/lang/reflect/Type;", "(Ljava/io/Reader;Ljava/lang/reflect/Type;)Ljava/lang/Object;", "json", "", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", "(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;", "toJson", "object", "utils_release"}, k = 1, mv = {1, 4, 0})
public final class GsonUtils {
    public static final GsonUtils INSTANCE;

    @NotNull
    private static Gson gson;

    static {
        GsonUtils gsonUtils = new GsonUtils();
        INSTANCE = gsonUtils;
        gson = gsonUtils.createGson();
    }

    private GsonUtils() {
    }

    @NotNull
    public final Gson createGson() {
        Gson gsonCreate = new GsonBuilder().serializeNulls().disableHtmlEscaping().create();
        Intrinsics.checkNotNullExpressionValue(gsonCreate, "GsonBuilder().serializeN…leHtmlEscaping().create()");
        return gsonCreate;
    }

    public final <V> V fromJson(@Nullable String json, @Nullable Class<V> type) {
        return (V) gson.fromJson(json, (Class) type);
    }

    @NotNull
    public final Gson getGson() {
        return gson;
    }

    public final void setGson(@NotNull Gson gson2) {
        Intrinsics.checkNotNullParameter(gson2, "<set-?>");
        gson = gson2;
    }

    @NotNull
    public final String toJson(@Nullable Object object) {
        String json = gson.toJson(object);
        Intrinsics.checkNotNullExpressionValue(json, "gson.toJson(`object`)");
        return json;
    }

    public final <V> V fromJson(@Nullable String json, @Nullable Type type) {
        return (V) gson.fromJson(json, type);
    }

    public final <V> V fromJson(@Nullable Reader reader, @Nullable Class<V> type) {
        return (V) gson.fromJson(reader, (Class) type);
    }

    public final <V> V fromJson(@Nullable Reader reader, @Nullable Type type) {
        return (V) gson.fromJson(reader, type);
    }
}
