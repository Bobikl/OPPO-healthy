package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public interface qgb extends v1l {

    public interface a {
        void a(@NonNull qgb qgbVar, @NonNull ltc ltcVar);

        void b(@NonNull qgb qgbVar, @NonNull ltc ltcVar);
    }

    public interface b {
        @NonNull
        <N extends ltc> b a(@NonNull Class<N> cls, @Nullable c<? super N> cVar);

        @NonNull
        qgb b(@NonNull hgb hgbVar, @NonNull kpf kpfVar);
    }

    public interface c<N extends ltc> {
        void a(@NonNull qgb qgbVar, @NonNull N n2);
    }

    void A(@NonNull ltc ltcVar);

    void B();

    boolean C(@NonNull ltc ltcVar);

    void F(@NonNull ltc ltcVar);

    void a(int i, @Nullable Object obj);

    @NonNull
    i5i builder();

    void d(@NonNull ltc ltcVar);

    @NonNull
    kpf g();

    int length();

    @NonNull
    hgb m();

    void n();

    <N extends ltc> void o(@NonNull N n2, int i);
}
