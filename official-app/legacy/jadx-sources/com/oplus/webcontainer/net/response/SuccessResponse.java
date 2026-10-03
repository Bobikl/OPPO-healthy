package com.oplus.webcontainer.net.response;

import androidx.annotation.Keep;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class SuccessResponse<T> {
    public T data;

    @Nullable
    public SuccessResponse<T>.a error;

    @Nullable
    public Boolean success;

    public class a {
    }

    public SuccessResponse(@Nullable Boolean bool, @Nullable SuccessResponse<T>.a aVar, T t) {
        this.success = bool;
        this.data = t;
    }
}
