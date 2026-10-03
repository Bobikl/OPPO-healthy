package com.oplus.aiunit.vision;

import com.fasterxml.jackson.core.JsonGenerator;
import java.io.IOException;

/* JADX INFO: loaded from: classes13.dex */
public interface wla {

    public static abstract class a implements wla {
        public boolean isEmpty(eug eugVar) {
            return false;
        }
    }

    void serialize(JsonGenerator jsonGenerator, eug eugVar) throws IOException;

    void serializeWithType(JsonGenerator jsonGenerator, eug eugVar, wdk wdkVar) throws IOException;
}
