package com.heytap.connect.api.message;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003J\u0017\u0010\u0006\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\b\u0010\u0007J'\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00028\u00012\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H&¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00028\u00012\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0011\u001a\u00028\u00012\u0006\u0010\t\u001a\u00028\u00012\u0006\u0010\n\u001a\u00020\u0004H&¢\u0006\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/heytap/connect/api/message/JsonSerializer;", "Array", "Object", "", "", "content", "parseObject", "(Ljava/lang/String;)Ljava/lang/Object;", "parseArray", "obj", "key", "defaultValue", "optValue", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "array", "", "i", "getObject", "(Ljava/lang/Object;I)Ljava/lang/Object;", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", "connect_release"}, k = 1, mv = {1, 5, 1})
public interface JsonSerializer<Array, Object> {
    Object getObject(Array array, int i);

    Object getObject(Object obj, @NotNull String key);

    @NotNull
    String optValue(Object obj, @NotNull String key, @NotNull String defaultValue);

    Array parseArray(@NotNull String content);

    Object parseObject(@NotNull String content);
}
