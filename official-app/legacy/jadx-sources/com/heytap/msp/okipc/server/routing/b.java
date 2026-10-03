package com.heytap.msp.okipc.server.routing;

import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class b extends d {
    public final List<String> a;
    public final RouterSelectorEvaluation b;

    public b(String str) {
        this.b = RouterSelectorEvaluation.Success;
        this.a = Route.b(str);
    }

    @Override // com.heytap.msp.okipc.server.routing.d
    public RouterSelectorEvaluation a(c cVar, int i) {
        if (i != 0) {
            throw new IllegalStateException("Root selector should be evaluated first.");
        }
        if (this.a.isEmpty()) {
            return this.b;
        }
        List<String> list = cVar.f7345c;
        if (list.size() != this.a.size()) {
            return RouterSelectorEvaluation.Fail;
        }
        for (int i2 = 0; i2 < this.a.size(); i2++) {
            if (!list.get(i2).equals(this.a.get(i2))) {
                return RouterSelectorEvaluation.Fail;
            }
        }
        return this.b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.a.size(); i++) {
            if (i > 0) {
                sb.append("/");
            }
            sb.append(this.a.get(i));
        }
        return sb.toString();
    }

    public b() {
        this("");
    }
}
