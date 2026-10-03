package com.oplus.aiunit.vision;

import androidx.exifinterface.media.ExifInterface;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ(\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005J0\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¨\u0006\u000e"}, d2 = {"Lcom/oplus/aiunit/vision/jsf;", "", ExifInterface.GPS_DIRECTION_TRUE, "", "timeTemplate", "Ljava/lang/Class;", "clazz", "", "b", "Lcom/google/gson/Gson;", "gson", "a", "<init>", "()V", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
public final class jsf {

    @NotNull
    public static final jsf INSTANCE = new jsf();

    @NotNull
    public final <T> List<T> a(@NotNull Gson gson, @NotNull String timeTemplate, @NotNull Class<T> clazz) throws JsonSyntaxException {
        Intrinsics.checkNotNullParameter(gson, "gson");
        Intrinsics.checkNotNullParameter(timeTemplate, "timeTemplate");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Object objFromJson = gson.fromJson(timeTemplate, TypeToken.getParameterized(List.class, clazz).getType());
        Intrinsics.checkNotNullExpressionValue(objFromJson, "gson.fromJson(\n         …va, clazz).type\n        )");
        return (List) objFromJson;
    }

    @NotNull
    public final <T> List<T> b(@NotNull String timeTemplate, @NotNull Class<T> clazz) throws JsonSyntaxException {
        Intrinsics.checkNotNullParameter(timeTemplate, "timeTemplate");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        return a(new Gson(), timeTemplate, clazz);
    }
}
