package com.oplus.aiunit.vision;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.filter.TokenFilter;

/* JADX INFO: loaded from: classes13.dex */
public class l1k extends zla {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l1k f13484c;
    public l1k d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f13485e;
    public TokenFilter f;
    public boolean g;
    public boolean h;

    public l1k(int i, l1k l1kVar, TokenFilter tokenFilter, boolean z) {
        this.a = i;
        this.f13484c = l1kVar;
        this.f = tokenFilter;
        this.b = -1;
        this.g = z;
        this.h = false;
    }

    public static l1k o(TokenFilter tokenFilter) {
        return new l1k(0, null, tokenFilter, true);
    }

    @Override // com.oplus.aiunit.vision.zla
    public final String b() {
        return this.f13485e;
    }

    @Override // com.oplus.aiunit.vision.zla
    public Object c() {
        return null;
    }

    @Override // com.oplus.aiunit.vision.zla
    public void i(Object obj) {
    }

    public void k(StringBuilder sb) {
        l1k l1kVar = this.f13484c;
        if (l1kVar != null) {
            l1kVar.k(sb);
        }
        int i = this.a;
        if (i != 2) {
            if (i != 1) {
                sb.append("/");
                return;
            }
            sb.append('[');
            sb.append(a());
            sb.append(']');
            return;
        }
        sb.append('{');
        if (this.f13485e != null) {
            sb.append('\"');
            sb.append(this.f13485e);
            sb.append('\"');
        } else {
            sb.append('?');
        }
        sb.append('}');
    }

    public TokenFilter l(TokenFilter tokenFilter) {
        int i = this.a;
        if (i == 2) {
            return tokenFilter;
        }
        int i2 = this.b + 1;
        this.b = i2;
        return i == 1 ? tokenFilter.e(i2) : tokenFilter.g(i2);
    }

    public l1k m(TokenFilter tokenFilter, boolean z) {
        l1k l1kVar = this.d;
        if (l1kVar != null) {
            return l1kVar.u(1, tokenFilter, z);
        }
        l1k l1kVar2 = new l1k(1, this, tokenFilter, z);
        this.d = l1kVar2;
        return l1kVar2;
    }

    public l1k n(TokenFilter tokenFilter, boolean z) {
        l1k l1kVar = this.d;
        if (l1kVar != null) {
            return l1kVar.u(2, tokenFilter, z);
        }
        l1k l1kVar2 = new l1k(2, this, tokenFilter, z);
        this.d = l1kVar2;
        return l1kVar2;
    }

    public l1k p(l1k l1kVar) {
        l1k l1kVar2 = this.f13484c;
        if (l1kVar2 == l1kVar) {
            return this;
        }
        while (l1kVar2 != null) {
            l1k l1kVar3 = l1kVar2.f13484c;
            if (l1kVar3 == l1kVar) {
                return l1kVar2;
            }
            l1kVar2 = l1kVar3;
        }
        return null;
    }

    public TokenFilter q() {
        return this.f;
    }

    @Override // com.oplus.aiunit.vision.zla
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final l1k e() {
        return this.f13484c;
    }

    public boolean s() {
        return this.g;
    }

    public JsonToken t() {
        if (!this.g) {
            this.g = true;
            return this.a == 2 ? JsonToken.START_OBJECT : JsonToken.START_ARRAY;
        }
        if (!this.h || this.a != 2) {
            return null;
        }
        this.h = false;
        return JsonToken.FIELD_NAME;
    }

    @Override // com.oplus.aiunit.vision.zla
    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        k(sb);
        return sb.toString();
    }

    public l1k u(int i, TokenFilter tokenFilter, boolean z) {
        this.a = i;
        this.f = tokenFilter;
        this.b = -1;
        this.f13485e = null;
        this.g = z;
        this.h = false;
        return this;
    }

    public TokenFilter v(String str) throws JsonProcessingException {
        this.f13485e = str;
        this.h = true;
        return this.f;
    }
}
