package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public interface ngb {

    public interface a {
        @NonNull
        <N extends ltc> a a(@NonNull Class<N> cls, @NonNull e5i e5iVar);

        @NonNull
        <N extends ltc> a b(@NonNull Class<N> cls, @Nullable e5i e5iVar);

        @NonNull
        ngb build();
    }

    @Nullable
    <N extends ltc> e5i get(@NonNull Class<N> cls);
}
