package com.oplus.aiunit.vision;

import android.content.Context;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class hgg extends vga {

    public static class b extends vga.a {
        public b(Context context) {
            super(context, 0);
        }

        public hgg q() {
            return new hgg(this);
        }

        public b r(yfa yfaVar) {
            super.m(yfaVar);
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

    @Override // com.oplus.aiunit.vision.vga
    public sga r(Context context) {
        return new h8g(context);
    }

    @Override // com.oplus.aiunit.vision.vga
    public xga s(Context context) {
        return new lgg(context);
    }

    public hgg(b bVar) {
        super(bVar);
    }
}
