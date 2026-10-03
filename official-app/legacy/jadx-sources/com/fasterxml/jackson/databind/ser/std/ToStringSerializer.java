package com.fasterxml.jackson.databind.ser.std;

import com.oplus.aiunit.vision.fia;

/* JADX INFO: loaded from: classes13.dex */
@fia
public class ToStringSerializer extends ToStringSerializerBase {
    public static final ToStringSerializer instance = new ToStringSerializer();

    public ToStringSerializer() {
        super(Object.class);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.ToStringSerializerBase
    public final String valueToString(Object obj) {
        return obj.toString();
    }

    public ToStringSerializer(Class<?> cls) {
        super(cls);
    }
}
