package com.fasterxml.jackson.core.filter;

import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;

/* JADX INFO: loaded from: classes13.dex */
public class TokenFilter {
    public static final TokenFilter INCLUDE_ALL = new TokenFilter();

    public enum Inclusion {
        ONLY_INCLUDE_ALL,
        INCLUDE_ALL_AND_PATH,
        INCLUDE_NON_NULL
    }

    public boolean a() {
        return true;
    }

    public void b() {
    }

    public TokenFilter c() {
        return this;
    }

    public TokenFilter d() {
        return this;
    }

    public TokenFilter e(int i) {
        return this;
    }

    public TokenFilter f(String str) {
        return this;
    }

    public TokenFilter g(int i) {
        return this;
    }

    public boolean h(JsonParser jsonParser) throws IOException {
        return a();
    }

    public String toString() {
        return this == INCLUDE_ALL ? "TokenFilter.INCLUDE_ALL" : super.toString();
    }
}
