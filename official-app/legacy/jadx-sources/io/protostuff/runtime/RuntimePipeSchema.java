package io.protostuff.runtime;

import io.protostuff.Input;
import io.protostuff.Output;
import io.protostuff.Pipe;
import io.protostuff.Schema;
import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public final class RuntimePipeSchema<T> extends Pipe.Schema<T> {
    final FieldMap<T> fieldsMap;

    public RuntimePipeSchema(Schema<T> schema, FieldMap<T> fieldMap) {
        super(schema);
        this.fieldsMap = fieldMap;
    }

    @Override // io.protostuff.Pipe.Schema
    public void transfer(Pipe pipe, Input input, Output output) throws IOException {
        while (true) {
            int fieldNumber = input.readFieldNumber(this.wrappedSchema);
            if (fieldNumber == 0) {
                return;
            }
            Field<T> fieldByNumber = this.fieldsMap.getFieldByNumber(fieldNumber);
            if (fieldByNumber == null) {
                input.handleUnknownField(fieldNumber, this.wrappedSchema);
            } else {
                fieldByNumber.transfer(pipe, input, output, fieldByNumber.repeated);
            }
        }
    }
}
