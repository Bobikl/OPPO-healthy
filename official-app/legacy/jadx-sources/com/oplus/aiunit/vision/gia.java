package com.oplus.aiunit.vision;

import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0005\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\n\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\bH\u0007¢\u0006\u0004\b\n\u0010\u000bJ?\u0010\u000e\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u00042\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b2\f\u0010\r\u001a\b\u0012\u0002\b\u0003\u0018\u00010\bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/oplus/aiunit/vision/gia;", "", ExifInterface.GPS_DIRECTION_TRUE, "obj", "", "a", "(Ljava/lang/Object;)Ljava/lang/String;", "str", "Ljava/lang/Class;", "clz", "b", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", "jsonStr", "genericsClass", "c", "(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;", "Lcom/fasterxml/jackson/databind/ObjectMapper;", "Lcom/fasterxml/jackson/databind/ObjectMapper;", "sObjectMapper", "<init>", "()V", "speechEngine_release"}, k = 1, mv = {1, 5, 1})
public final class gia {

    @NotNull
    public static final gia INSTANCE = new gia();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final ObjectMapper sObjectMapper;

    static {
        ObjectMapper objectMapper = new ObjectMapper();
        sObjectMapper = objectMapper;
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        objectMapper.configure(SerializationFeature.FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS, false);
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmStatic
    @Nullable
    public static final synchronized <T> String a(T obj) {
        try {
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
        return obj instanceof String ? (String) obj : sObjectMapper.writeValueAsString(obj);
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [T] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    @JvmStatic
    @Nullable
    public static final synchronized <T> T b(@Nullable String str, @Nullable Class<T> clz) {
        if (TextUtils.isEmpty(str) || clz == null) {
            return null;
        }
        try {
            return (T) (Intrinsics.areEqual(clz, String.class) ? str : (T) sObjectMapper.readValue(str, clz));
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    @JvmStatic
    @Nullable
    public static final synchronized <T> T c(@Nullable String jsonStr, @Nullable Class<T> clz, @Nullable Class<?> genericsClass) {
        if (TextUtils.isEmpty(jsonStr) || clz == null || genericsClass == null) {
            return null;
        }
        try {
            ObjectMapper objectMapper = sObjectMapper;
            JavaType javaTypeConstructParametricType = objectMapper.getTypeFactory().constructParametricType((Class<?>) clz, genericsClass);
            Intrinsics.checkNotNullExpressionValue(javaTypeConstructParametricType, "sObjectMapper.typeFactor…cType(clz, genericsClass)");
            return (T) objectMapper.readValue(jsonStr, javaTypeConstructParametricType);
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }
}
