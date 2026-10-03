package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.oplus.aiunit.vision.eug;
import com.oplus.aiunit.vision.fia;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;

/* JADX INFO: loaded from: classes13.dex */
@fia
public class SqlDateSerializer extends DateTimeSerializerBase<Date> {
    public SqlDateSerializer() {
        this(null, null);
    }

    public SqlDateSerializer(Boolean bool, DateFormat dateFormat) {
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
        } else if (this._customFormat == null) {
            jsonGenerator.t0(date.toString());
        } else {
            _serializeAsString(date, jsonGenerator, eugVar);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase
    /* JADX INFO: renamed from: withFormat, reason: avoid collision after fix types in other method */
    public DateTimeSerializerBase<Date> withFormat2(Boolean bool, DateFormat dateFormat) {
        return new SqlDateSerializer(bool, dateFormat);
    }
}
