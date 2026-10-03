package com.fasterxml.jackson.core;

import com.oplus.aiunit.vision.dia;

/* JADX INFO: loaded from: classes13.dex */
public enum StreamReadCapability implements dia {
    DUPLICATE_PROPERTIES(false),
    SCALARS_AS_OBJECTS(false),
    UNTYPED_SCALARS(false);

    private final boolean _defaultState;
    private final int _mask = 1 << ordinal();

    StreamReadCapability(boolean z) {
        this._defaultState = z;
    }

    @Override // com.oplus.aiunit.vision.dia
    public boolean enabledByDefault() {
        return this._defaultState;
    }

    public boolean enabledIn(int i) {
        return (this._mask & i) != 0;
    }

    @Override // com.oplus.aiunit.vision.dia
    public int getMask() {
        return this._mask;
    }
}
