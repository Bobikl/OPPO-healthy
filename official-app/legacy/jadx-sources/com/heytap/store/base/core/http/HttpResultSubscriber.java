package com.heytap.store.base.core.http;

import android.util.Log;
import com.heytap.store.base.core.state.UrlConfig;
import com.heytap.store.base.core.util.EmptyException;
import com.oplus.aiunit.vision.bed;
import com.oplus.aiunit.vision.cv5;

/* JADX INFO: loaded from: classes3.dex */
public abstract class HttpResultSubscriber<T> implements bed<T> {
    final String TAG = "HttpResultSubscriber";
    private Object tag;

    public HttpResultSubscriber() {
    }

    public boolean isPrintMsg() {
        return UrlConfig.DEBUG;
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onComplete() {
    }

    @Override // com.oplus.aiunit.vision.bed
    @Deprecated
    public void onError(Throwable th) {
        onFailure(th);
    }

    public void onFailure(Throwable th) {
        if (UrlConfig.DEBUG) {
            Log.d("HttpResultSubscriber", "request response onFailure:" + th);
        }
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onNext(T t) {
        if (UrlConfig.DEBUG) {
            Log.d("HttpResultSubscriber", "request response:" + t);
        }
        if (t == null) {
            onFailure(new EmptyException());
        } else {
            onSuccess(t);
        }
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onSubscribe(cv5 cv5Var) {
    }

    public abstract void onSuccess(T t);

    public HttpResultSubscriber(Object obj) {
        this.tag = obj;
    }
}
