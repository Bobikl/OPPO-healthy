package com.oplus.backup.sdk.common.utils;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import com.google.gson.Gson;
import java.lang.reflect.Type;
import org.apache.commons.codec.language.bm.Languages;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J%\u0010\t\u001a\u0002H\n\"\u0004\b\u0000\u0010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0001H\u0007R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/oplus/backup/sdk/common/utils/GsonUtil;", "", "()V", "gson", "Lcom/google/gson/Gson;", "getGson", "()Lcom/google/gson/Gson;", "gson$delegate", "Lkotlin/Lazy;", "fromJson", ExifInterface.GPS_DIRECTION_TRUE, TypedValues.Custom.S_STRING, "", "type", "Ljava/lang/reflect/Type;", "(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;", "toJson", Languages.ANY, "backup-sdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class GsonUtil {

    @NotNull
    public static final GsonUtil INSTANCE = new GsonUtil();

    /* JADX INFO: renamed from: gson$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy gson = LazyKt__LazyJVMKt.lazy(new Function0<Gson>() { // from class: com.oplus.backup.sdk.common.utils.GsonUtil$gson$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final Gson invoke() {
            return new Gson();
        }
    });

    private GsonUtil() {
    }

    @JvmStatic
    public static final <T> T fromJson(@Nullable String string, @NotNull Type type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return (T) INSTANCE.getGson().fromJson(string, type);
    }

    private final Gson getGson() {
        return (Gson) gson.getValue();
    }

    @JvmStatic
    @NotNull
    public static final String toJson(@NotNull Object any) {
        Intrinsics.checkNotNullParameter(any, "any");
        String json = INSTANCE.getGson().toJson(any);
        Intrinsics.checkNotNullExpressionValue(json, "gson.toJson(any)");
        return json;
    }
}
