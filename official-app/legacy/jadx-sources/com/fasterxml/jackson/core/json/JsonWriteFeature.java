package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.JsonGenerator;
import com.oplus.aiunit.vision.ex7;

/* JADX INFO: loaded from: classes13.dex */
public enum JsonWriteFeature implements ex7 {
    QUOTE_FIELD_NAMES(true, JsonGenerator.Feature.QUOTE_FIELD_NAMES),
    WRITE_NAN_AS_STRINGS(true, JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS),
    WRITE_NUMBERS_AS_STRINGS(false, JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS),
    ESCAPE_NON_ASCII(false, JsonGenerator.Feature.ESCAPE_NON_ASCII);

    private final boolean _defaultState;
    private final JsonGenerator.Feature _mappedFeature;
    private final int _mask = 1 << ordinal();

    JsonWriteFeature(boolean z, JsonGenerator.Feature feature) {
        this._defaultState = z;
        this._mappedFeature = feature;
    }

    public static int collectDefaults() {
        int mask = 0;
        for (JsonWriteFeature jsonWriteFeature : values()) {
            if (jsonWriteFeature.enabledByDefault()) {
                mask |= jsonWriteFeature.getMask();
            }
        }
        return mask;
    }

    @Override // com.oplus.aiunit.vision.dia
    public boolean enabledByDefault() {
        return this._defaultState;
    }

    public boolean enabledIn(int i) {
        return (this._mask & i) != 0;
    }

    @Override // com.oplus.aiunit.vision.ex7, com.oplus.aiunit.vision.dia
    public int getMask() {
        return this._mask;
    }

    public JsonGenerator.Feature mappedFeature() {
        return this._mappedFeature;
    }
}
