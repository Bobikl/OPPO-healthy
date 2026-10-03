package com.pantanal.server.content.utils;

import android.text.TextUtils;
import android.util.ArrayMap;
import androidx.exifinterface.media.ExifInterface;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u0007\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\bJ0\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\f\"\u0004\b\u0000\u0010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\nH\u0007J\u0012\u0010\u000f\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0007R\u001b\u0010\u0014\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/pantanal/server/content/utils/GsonUtil;", "", ExifInterface.GPS_DIRECTION_TRUE, "", "jsonData", "Ljava/lang/reflect/Type;", "type", "c", "(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;", "gsonString", "Ljava/lang/Class;", "cls", "", "b", "obj", "d", "Lcom/google/gson/Gson;", "a", "Lkotlin/Lazy;", "()Lcom/google/gson/Gson;", "gson", "<init>", "()V", "staticmanagersdk_release"}, k = 1, mv = {1, 5, 1})
public final class GsonUtil {

    @NotNull
    public static final GsonUtil INSTANCE = new GsonUtil();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Lazy gson = LazyKt__LazyJVMKt.lazy(new Function0<Gson>() { // from class: com.pantanal.server.content.utils.GsonUtil$gson$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        public final Gson invoke() {
            GsonBuilder gsonBuilder = new GsonBuilder();
            gsonBuilder.registerTypeAdapter(ArrayMap.class, new ArrayMapDeserializer());
            return gsonBuilder.create();
        }
    });

    @JvmStatic
    @Nullable
    public static final <T> List<T> b(@Nullable String gsonString, @Nullable Class<T> cls) {
        return (List) INSTANCE.a().fromJson(gsonString, TypeToken.getParameterized(List.class, cls).getType());
    }

    @JvmStatic
    @Nullable
    public static final <T> T c(@Nullable String jsonData, @Nullable Type type) {
        try {
            if (TextUtils.isEmpty(jsonData)) {
                return null;
            }
            return (T) INSTANCE.a().fromJson(jsonData, type);
        } catch (JsonSyntaxException | Exception unused) {
            return null;
        }
    }

    @JvmStatic
    @NotNull
    public static final String d(@Nullable Object obj) {
        try {
            String json = INSTANCE.a().toJson(obj);
            Intrinsics.checkNotNullExpressionValue(json, "{\n            gson.toJson(obj)\n        }");
            return json;
        } catch (Exception unused) {
            return "";
        }
    }

    public final Gson a() {
        Object value = gson.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-gson>(...)");
        return (Gson) value;
    }
}
