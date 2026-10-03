package com.oplus.aiunit.vision;

import android.content.Context;

/* JADX INFO: loaded from: classes12.dex */
public final class wem extends vem {

    public static abstract class a implements vem.a {
        @Override // com.oplus.aiunit.vision.vem.a
        public final void a(vem vemVar) {
            f((wem) vemVar);
        }

        @Override // com.oplus.aiunit.vision.vem.a
        public final boolean b(vem vemVar) {
            return d((wem) vemVar);
        }

        @Override // com.oplus.aiunit.vision.vem.a
        public final boolean c(vem vemVar) {
            return e((wem) vemVar);
        }

        public abstract boolean d(wem wemVar);

        public abstract boolean e(wem wemVar);

        public abstract void f(wem wemVar);
    }

    public wem(Context context, a aVar) {
        super(context, aVar);
    }

    public final float s() {
        return (float) (((Math.atan2(m(), l()) - Math.atan2(k(), j())) * 180.0d) / 3.141592653589793d);
    }
}
