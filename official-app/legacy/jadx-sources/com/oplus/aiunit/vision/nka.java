package com.oplus.aiunit.vision;

import com.fasterxml.jackson.core.JsonFactory;
import com.oplus.drs.rom.sdk.comm.log.TrackLogger;
import java.lang.reflect.Field;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u0005"}, d2 = {"", "Lorg/json/JSONObject;", "container", "", "a", "obus-sdk_release"}, k = 2, mv = {1, 7, 1})
public final class nka {
    public static final void a(@NotNull Object obj, @NotNull JSONObject container) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        Intrinsics.checkNotNullParameter(container, "container");
        try {
            Class<?> superclass = obj.getClass();
            do {
                Field[] declaredFields = superclass.getDeclaredFields();
                Intrinsics.checkNotNullExpressionValue(declaredFields, "currentClazz.declaredFields");
                for (Field field : declaredFields) {
                    l6k l6kVar = (l6k) field.getAnnotation(l6k.class);
                    if (l6kVar != null) {
                        Intrinsics.checkNotNullExpressionValue(l6kVar, "getAnnotation(TrackField::class.java)");
                        String strValue = l6kVar.value();
                        if (strValue.length() == 0) {
                            strValue = field.getName();
                        }
                        field.setAccessible(true);
                        container.put(strValue, field.get(obj));
                    }
                }
                superclass = superclass.getSuperclass();
                Intrinsics.checkNotNull(superclass, "null cannot be cast to non-null type java.lang.Class<*>");
            } while (!Intrinsics.areEqual(superclass, Object.class));
        } catch (Throwable th) {
            TrackLogger.n(JsonFactory.FORMAT_NAME_JSON, "convertToJsonByTrackField", th, new Object[0]);
        }
    }
}
