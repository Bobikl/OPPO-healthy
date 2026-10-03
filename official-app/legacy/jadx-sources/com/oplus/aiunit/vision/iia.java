package com.oplus.aiunit.vision;

import com.fasterxml.jackson.databind.ext.NioPathDeserializer;
import com.fasterxml.jackson.databind.ext.NioPathSerializer;
import java.nio.file.Path;

/* JADX INFO: loaded from: classes13.dex */
public class iia extends hia {
    public final Class<?> b = Path.class;

    @Override // com.oplus.aiunit.vision.hia
    public lka<?> a(Class<?> cls) {
        if (cls == this.b) {
            return new NioPathDeserializer();
        }
        return null;
    }

    @Override // com.oplus.aiunit.vision.hia
    public yla<?> b(Class<?> cls) {
        if (this.b.isAssignableFrom(cls)) {
            return new NioPathSerializer();
        }
        return null;
    }
}
