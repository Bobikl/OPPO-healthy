package io.protostuff.runtime;

import io.protostuff.Input;
import io.protostuff.Output;
import io.protostuff.Pipe;
import io.protostuff.Tag;
import io.protostuff.WireFormat;
import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public abstract class Field<T> {
    public final int groupFilter;
    public final String name;
    public final int number;
    public final boolean repeated;
    public final WireFormat.FieldType type;

    public Field(WireFormat.FieldType fieldType, int i, String str, boolean z, Tag tag) {
        this.type = fieldType;
        this.number = i;
        this.name = str;
        this.repeated = z;
        this.groupFilter = tag == null ? 0 : tag.groupFilter();
    }

    public Field<T> copy(IdStrategy idStrategy) {
        return this;
    }

    public abstract void mergeFrom(Input input, T t) throws IOException;

    public abstract void transfer(Pipe pipe, Input input, Output output, boolean z) throws IOException;

    public abstract void writeTo(Output output, T t) throws IOException;

    public Field(WireFormat.FieldType fieldType, int i, String str, Tag tag) {
        this(fieldType, i, str, false, tag);
    }
}
