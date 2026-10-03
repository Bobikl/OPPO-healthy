package com.oplus.aiunit.vision;

import java.io.IOException;
import okhttp3.Request;

/* JADX INFO: loaded from: classes11.dex */
public interface xr2<T> extends Cloneable {
    void cancel();

    /* JADX INFO: renamed from: clone */
    xr2<T> m5138clone();

    ztf<T> execute() throws IOException;

    void h(at2<T> at2Var);

    boolean isCanceled();

    Request request();
}
