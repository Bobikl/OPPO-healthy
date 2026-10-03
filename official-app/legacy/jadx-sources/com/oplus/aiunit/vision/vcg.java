package com.oplus.aiunit.vision;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public class vcg extends nfa {

    public static class b extends nfa.a {
        public b(Context context) {
            super(context, 0);
        }

        public vcg q() {
            return new vcg(this);
        }

        public b r(qea qeaVar) {
            super.m(qeaVar);
            return this;
        }

        public b s(String str) {
            super.n(str);
            return this;
        }

        public b t(boolean z) {
            super.o(z);
            return this;
        }

        public b u(int i) {
            super.p(i);
            return this;
        }
    }

    @Override // com.oplus.aiunit.vision.nfa
    public kfa r(Context context) {
        return new e5g(context);
    }

    @Override // com.oplus.aiunit.vision.nfa
    public pfa s(Context context) {
        return new zcg(context);
    }

    public vcg(b bVar) {
        super(bVar);
    }
}
