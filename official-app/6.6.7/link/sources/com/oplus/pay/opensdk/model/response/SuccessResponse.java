package com.oplus.pay.opensdk.model.response;

import androidx.annotation.Keep;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
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
