package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public interface n2c<Model, Data> {

    public static class a<Data> {
        public final ona a;
        public final List<ona> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ft4<Data> f14315c;

        public a(@NonNull ona onaVar, @NonNull ft4<Data> ft4Var) {
            this(onaVar, Collections.emptyList(), ft4Var);
        }

        public a(@NonNull ona onaVar, @NonNull List<ona> list, @NonNull ft4<Data> ft4Var) {
            this.a = (ona) cpe.d(onaVar);
            this.b = (List) cpe.d(list);
            this.f14315c = (ft4) cpe.d(ft4Var);
        }
    }

    @Nullable
    a<Data> a(@NonNull Model model, int i, int i2, @NonNull erd erdVar);

    boolean b(@NonNull Model model);
}
