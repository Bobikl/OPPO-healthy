package io.protostuff.runtime;

import io.protostuff.Input;
import io.protostuff.Output;
import io.protostuff.Pipe;
import io.protostuff.WireFormat;
import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public interface Delegate<V> {
    WireFormat.FieldType getFieldType();

    V readFrom(Input input) throws IOException;

    void transfer(Pipe pipe, Input input, Output output, int i, boolean z) throws IOException;

    Class<?> typeClass();

    void writeTo(Output output, int i, V v, boolean z) throws IOException;
}
