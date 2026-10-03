package com.oplus.aiunit.vision;

import com.fasterxml.jackson.core.filter.TokenFilter;

/* JADX INFO: loaded from: classes13.dex */
public class nla extends TokenFilter {
    public final mla a;

    public nla(String str) {
        this(mla.e(str));
    }

    @Override // com.fasterxml.jackson.core.filter.TokenFilter
    public boolean a() {
        return this.a.j();
    }

    @Override // com.fasterxml.jackson.core.filter.TokenFilter
    public TokenFilter c() {
        return this;
    }

    @Override // com.fasterxml.jackson.core.filter.TokenFilter
    public TokenFilter d() {
        return this;
    }

    @Override // com.fasterxml.jackson.core.filter.TokenFilter
    public TokenFilter e(int i) {
        mla mlaVarH = this.a.h(i);
        if (mlaVarH == null) {
            return null;
        }
        return mlaVarH.j() ? TokenFilter.INCLUDE_ALL : new nla(mlaVarH);
    }

    @Override // com.fasterxml.jackson.core.filter.TokenFilter
    public TokenFilter f(String str) {
        mla mlaVarI = this.a.i(str);
        if (mlaVarI == null) {
            return null;
        }
        return mlaVarI.j() ? TokenFilter.INCLUDE_ALL : new nla(mlaVarI);
    }

    @Override // com.fasterxml.jackson.core.filter.TokenFilter
    public String toString() {
        return "[JsonPointerFilter at: " + this.a + "]";
    }

    public nla(mla mlaVar) {
        this.a = mlaVar;
    }
}
