package io.protostuff;

import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public interface Schema<T> {
    String getFieldName(int i);

    int getFieldNumber(String str);

    boolean isInitialized(T t);

    void mergeFrom(Input input, T t) throws IOException;

    String messageFullName();

    String messageName();

    T newMessage();

    Class<? super T> typeClass();

    void writeTo(Output output, T t) throws IOException;
}
