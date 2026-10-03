package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes10.dex */
public abstract class rgb {

    public class a extends rgb {
        public final /* synthetic */ qgb.b a;
        public final /* synthetic */ hgb b;

        public a(qgb.b bVar, hgb hgbVar) {
            this.a = bVar;
            this.b = hgbVar;
        }

        @Override // com.oplus.aiunit.vision.rgb
        @NonNull
        public qgb a() {
            return this.a.b(this.b, new lpf());
        }
    }

    @NonNull
    public static rgb b(@NonNull qgb.b bVar, @NonNull hgb hgbVar) {
        return new a(bVar, hgbVar);
    }

    @NonNull
    public abstract qgb a();
}
