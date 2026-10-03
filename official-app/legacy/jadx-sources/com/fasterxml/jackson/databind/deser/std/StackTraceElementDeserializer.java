package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.heytap.log.consts.LogSenderConst;
import java.io.IOException;

/* JADX INFO: loaded from: classes13.dex */
public class StackTraceElementDeserializer extends StdScalarDeserializer<StackTraceElement> {
    private static final long serialVersionUID = 1;

    public StackTraceElementDeserializer() {
        super((Class<?>) StackTraceElement.class);
    }

    @Deprecated
    public StackTraceElement constructValue(DeserializationContext deserializationContext, String str, String str2, String str3, int i, String str4, String str5) {
        return constructValue(deserializationContext, str, str2, str3, i, str4, str5, null);
    }

    public StackTraceElement constructValue(DeserializationContext deserializationContext, String str, String str2, String str3, int i, String str4, String str5, String str6) {
        return new StackTraceElement(str, str2, str3, i);
    }

    @Override // com.oplus.aiunit.vision.lka
    public StackTraceElement deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JsonToken jsonTokenN = jsonParser.n();
        if (jsonTokenN != JsonToken.START_OBJECT) {
            if (jsonTokenN != JsonToken.START_ARRAY || !deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
                return (StackTraceElement) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
            }
            jsonParser.l0();
            StackTraceElement stackTraceElementDeserialize = deserialize(jsonParser, deserializationContext);
            if (jsonParser.l0() != JsonToken.END_ARRAY) {
                handleMissingEndArrayForSingle(jsonParser, deserializationContext);
            }
            return stackTraceElementDeserialize;
        }
        String strO = null;
        String strO2 = null;
        String strO3 = null;
        String strO4 = "";
        String strO5 = strO4;
        String strO6 = strO5;
        int iF = -1;
        while (true) {
            JsonToken jsonTokenM0 = jsonParser.m0();
            if (jsonTokenM0 == JsonToken.END_OBJECT) {
                return constructValue(deserializationContext, strO4, strO5, strO6, iF, strO, strO2, strO3);
            }
            String strM = jsonParser.m();
            if ("className".equals(strM)) {
                strO4 = jsonParser.O();
            } else if ("classLoaderName".equals(strM)) {
                strO3 = jsonParser.O();
            } else if (LogSenderConst.FILENAME.equals(strM)) {
                strO6 = jsonParser.O();
            } else if ("lineNumber".equals(strM)) {
                iF = jsonTokenM0.isNumeric() ? jsonParser.F() : _parseIntPrimitive(jsonParser, deserializationContext);
            } else if ("methodName".equals(strM)) {
                strO5 = jsonParser.O();
            } else if (!"nativeMethod".equals(strM)) {
                if ("moduleName".equals(strM)) {
                    strO = jsonParser.O();
                } else if ("moduleVersion".equals(strM)) {
                    strO2 = jsonParser.O();
                } else if (!"declaringClass".equals(strM) && !"format".equals(strM)) {
                    handleUnknownProperty(jsonParser, deserializationContext, this._valueClass, strM);
                }
            }
            jsonParser.u0();
        }
    }
}
