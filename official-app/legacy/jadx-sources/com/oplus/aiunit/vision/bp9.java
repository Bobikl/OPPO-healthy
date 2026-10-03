package com.oplus.aiunit.vision;

import io.protostuff.MapSchema;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H&¢\u0006\u0004\b\u0006\u0010\u0005J!\u0010\n\u001a\u00020\t2\u0010\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0002H&¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u0007H&J\"\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u0007H&¨\u0006\u0015"}, d2 = {"Lcom/oplus/aiunit/vision/bp9;", "", "", "", "f", "()[Ljava/lang/String;", "d", "Ljava/lang/Class;", "dbEntityClasses", "", "a", "([Ljava/lang/Class;)V", "", "oldVersion", "b", "(I)[Ljava/lang/String;", "clazz", MapSchema.FIELD_NAME_ENTRY, "", "Lcom/oplus/aiunit/vision/o15;", "c", "TapDatabase"}, k = 1, mv = {1, 4, 0})
public interface bp9 {
    void a(@NotNull Class<?>[] dbEntityClasses);

    @Nullable
    String[] b(int oldVersion);

    @Nullable
    Map<String, o15> c(@NotNull Class<?> clazz);

    @Nullable
    String[] d();

    @Nullable
    String e(@NotNull Class<?> clazz);

    @Nullable
    String[] f();
}
