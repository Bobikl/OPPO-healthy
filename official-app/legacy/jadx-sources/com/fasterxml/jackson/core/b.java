package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.oplus.aiunit.vision.wtg;

/* JADX INFO: loaded from: classes13.dex */
public class b extends c<JsonFactory, b> {
    public CharacterEscapes i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public wtg f2237j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public char f2238l;

    public b() {
        this.f2238l = '\"';
        this.f2237j = JsonFactory.DEFAULT_ROOT_VALUE_SEPARATOR;
        this.k = 0;
    }

    public b(JsonFactory jsonFactory) {
        super(jsonFactory);
        this.f2238l = '\"';
        this.i = jsonFactory.getCharacterEscapes();
        this.f2237j = jsonFactory._rootValueSeparator;
        this.k = jsonFactory._maximumNonEscapedChar;
    }
}
