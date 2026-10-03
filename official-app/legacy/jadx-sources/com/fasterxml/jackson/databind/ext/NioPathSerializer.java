package com.fasterxml.jackson.databind.ext;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.ser.std.StdScalarSerializer;
import com.oplus.aiunit.vision.eug;
import com.oplus.aiunit.vision.wdk;
import java.io.IOException;
import java.nio.file.Path;

/* JADX INFO: loaded from: classes13.dex */
public class NioPathSerializer extends StdScalarSerializer<Path> {
    private static final long serialVersionUID = 1;

    public NioPathSerializer() {
        super(Path.class);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.oplus.aiunit.vision.yla
    public void serialize(Path path, JsonGenerator jsonGenerator, eug eugVar) throws IOException {
        jsonGenerator.t0(path.toUri().toString());
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.oplus.aiunit.vision.yla
    public void serializeWithType(Path path, JsonGenerator jsonGenerator, eug eugVar, wdk wdkVar) throws IOException {
        WritableTypeId writableTypeIdG = wdkVar.g(jsonGenerator, wdkVar.f(path, Path.class, JsonToken.VALUE_STRING));
        serialize(path, jsonGenerator, eugVar);
        wdkVar.h(jsonGenerator, writableTypeIdG);
    }
}
