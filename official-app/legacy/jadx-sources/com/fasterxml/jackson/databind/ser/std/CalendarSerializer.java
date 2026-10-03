package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.oplus.aiunit.vision.eug;
import com.oplus.aiunit.vision.fia;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Calendar;

/* JADX INFO: loaded from: classes13.dex */
@fia
public class CalendarSerializer extends DateTimeSerializerBase<Calendar> {
    public static final CalendarSerializer instance = new CalendarSerializer();

    public CalendarSerializer() {
        this(null, null);
    }

    public CalendarSerializer(Boolean bool, DateFormat dateFormat) {
        super(Calendar.class, bool, dateFormat);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase
    public long _timestamp(Calendar calendar) {
        if (calendar == null) {
            return 0L;
        }
        return calendar.getTimeInMillis();
    }

    @Override // com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase, com.fasterxml.jackson.databind.ser.std.StdSerializer, com.oplus.aiunit.vision.yla
    public void serialize(Calendar calendar, JsonGenerator jsonGenerator, eug eugVar) throws IOException {
        if (_asTimestamp(eugVar)) {
            jsonGenerator.X(_timestamp(calendar));
        } else {
            _serializeAsString(calendar.getTime(), jsonGenerator, eugVar);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase
    /* JADX INFO: renamed from: withFormat */
    public DateTimeSerializerBase<Calendar> withFormat2(Boolean bool, DateFormat dateFormat) {
        return new CalendarSerializer(bool, dateFormat);
    }
}
