package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.oplus.aiunit.vision.eug;
import com.oplus.aiunit.vision.wdk;
import java.io.IOException;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes13.dex */
public class TimeZoneSerializer extends StdScalarSerializer<TimeZone> {
    public TimeZoneSerializer() {
        super(TimeZone.class);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.oplus.aiunit.vision.yla
    public void serialize(TimeZone timeZone, JsonGenerator jsonGenerator, eug eugVar) throws IOException {
        jsonGenerator.t0(timeZone.getID());
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.oplus.aiunit.vision.yla
    public void serializeWithType(TimeZone timeZone, JsonGenerator jsonGenerator, eug eugVar, wdk wdkVar) throws IOException {
        WritableTypeId writableTypeIdG = wdkVar.g(jsonGenerator, wdkVar.f(timeZone, TimeZone.class, JsonToken.VALUE_STRING));
        serialize(timeZone, jsonGenerator, eugVar);
        wdkVar.h(jsonGenerator, writableTypeIdG);
    }
}
