package com.oplus.aiunit.vision;

import android.util.Log;
import androidx.exifinterface.media.ExifInterface;
import com.google.gson.Gson;
import java.lang.reflect.Type;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000e\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0000\u001a#\u0010\u0006\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0003*\u0004\u0018\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "", "b", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/lang/reflect/Type;", "type", "a", "(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;", "com.oplus.deepthinker.sdk_release"}, k = 2, mv = {1, 6, 0})
public final class tc8 {
    @Nullable
    public static final <T> T a(@Nullable String str, @NotNull Type type) {
        Object objM5287constructorimpl;
        Intrinsics.checkNotNullParameter(type, "type");
        if (str == null || str.length() == 0) {
            return null;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(new Gson().fromJson(str, type));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
        if (thM5290exceptionOrNullimpl != null) {
            Log.e("GsonUtils", Intrinsics.stringPlus("fromJson exception: ", thM5290exceptionOrNullimpl), thM5290exceptionOrNullimpl);
        }
        if (Result.m5293isFailureimpl(objM5287constructorimpl)) {
            return null;
        }
        return (T) objM5287constructorimpl;
    }

    @Nullable
    public static final String b(@Nullable Object obj) {
        Object objM5287constructorimpl;
        if (obj == null) {
            return null;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(new Gson().toJson(obj));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
        if (thM5290exceptionOrNullimpl != null) {
            Log.e("GsonUtils", Intrinsics.stringPlus("toJson exception: ", thM5290exceptionOrNullimpl), thM5290exceptionOrNullimpl);
        }
        return (String) (Result.m5293isFailureimpl(objM5287constructorimpl) ? null : objM5287constructorimpl);
    }
}
