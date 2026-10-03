package com.oplus.carlink.controlsdk;

import O0O.O00;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.oplus.aiunit.vision.e1d;

/* JADX INFO: loaded from: classes4.dex */
@Keep
public interface CarControlCallback<T> {
    default O00.O0O asCarControlCallback(e1d<T> e1dVar) {
        return new O00(this, e1dVar);
    }

    void onError(int i, @NonNull String str, @NonNull String str2);

    void onResult(@Nullable T t);
}
