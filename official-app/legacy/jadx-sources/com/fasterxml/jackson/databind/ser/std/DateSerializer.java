package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.oplus.aiunit.vision.eug;
import com.oplus.aiunit.vision.fia;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes13.dex */
@fia
public class DateSerializer extends DateTimeSerializerBase<Date> {
    public static final DateSerializer instance = new DateSerializer();

    public DateSerializer() {
        this(null, null);
    }

    public DateSerializer(Boolean bool, DateFormat dateFormat) {
        super(Date.class, bool, dateFormat);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase
    public long _timestamp(Date date) {
        if (date == null) {
            return 0L;
        }
        return date.getTime();
    }

    @Override // com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase, com.fasterxml.jackson.databind.ser.std.StdSerializer, com.oplus.aiunit.vision.yla
    public void serialize(Date date, JsonGenerator jsonGenerator, eug eugVar) throws IOException {
        if (_asTimestamp(eugVar)) {
            jsonGenerator.X(_timestamp(date));
        } else {
            _serializeAsString(date, jsonGenerator, eugVar);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase
    /* JADX INFO: renamed from: withFormat, reason: merged with bridge method [inline-methods] */
    public DateTimeSerializerBase<Date> withFormat2(Boolean bool, DateFormat dateFormat) {
        return new DateSerializer(bool, dateFormat);
    }
}
