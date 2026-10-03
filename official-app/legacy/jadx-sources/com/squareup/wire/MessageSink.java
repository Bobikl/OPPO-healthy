package com.squareup.wire;

import androidx.exifinterface.media.ExifInterface;
import java.io.Closeable;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u0000*\n\b\u0000\u0010\u0001 \u0000*\u00020\u00022\u00020\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/squareup/wire/MessageSink;", ExifInterface.GPS_DIRECTION_TRUE, "", "Ljava/io/Closeable;", "write", "", "message", "(Ljava/lang/Object;)V", "wire-runtime"}, k = 1, mv = {1, 1, 15})
public interface MessageSink<T> extends Closeable {
    void write(@NotNull T message) throws IOException;
}
