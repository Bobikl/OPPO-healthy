package com.pantanal.server.content.utils;

import android.util.ArrayMap;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ,\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e"}, d2 = {"Lcom/pantanal/server/content/utils/ArrayMapDeserializer;", "Lcom/google/gson/JsonDeserializer;", "Landroid/util/ArrayMap;", "", "", "Lcom/google/gson/JsonElement;", "json", "Ljava/lang/reflect/Type;", "typeOfT", "Lcom/google/gson/JsonDeserializationContext;", "context", "a", "<init>", "()V", "staticmanagersdk_release"}, k = 1, mv = {1, 5, 1})
public final class ArrayMapDeserializer implements JsonDeserializer<ArrayMap<String, Object>> {
    @Override // com.google.gson.JsonDeserializer
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ArrayMap<String, Object> deserialize(@NotNull JsonElement json, @NotNull Type typeOfT, @NotNull JsonDeserializationContext context) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(typeOfT, "typeOfT");
        Intrinsics.checkNotNullParameter(context, "context");
        ArrayMap<String, Object> arrayMap = new ArrayMap<>();
        for (Map.Entry<String, JsonElement> entry : json.getAsJsonObject().entrySet()) {
            Intrinsics.checkNotNullExpressionValue(entry, "jsonObject.entrySet()");
            arrayMap.put(entry.getKey(), context.deserialize(entry.getValue(), Object.class));
        }
        return arrayMap;
    }
}
