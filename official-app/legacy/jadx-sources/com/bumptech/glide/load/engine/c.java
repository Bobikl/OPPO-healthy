package com.bumptech.glide.load.engine;

import androidx.annotation.Nullable;
import com.bumptech.glide.load.DataSource;
import com.oplus.aiunit.vision.ft4;
import com.oplus.aiunit.vision.ona;

/* JADX INFO: loaded from: classes13.dex */
public interface c {

    public interface a {
        void b(ona onaVar, Exception exc, ft4<?> ft4Var, DataSource dataSource);

        void d(ona onaVar, @Nullable Object obj, ft4<?> ft4Var, DataSource dataSource, ona onaVar2);

        void g();
    }

    boolean a();

    void cancel();
}
