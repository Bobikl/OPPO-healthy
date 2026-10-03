package com.oplus.aiunit.vision;

import com.heytap.health.network.core.BaseResponse;

/* JADX INFO: loaded from: classes17.dex */
public abstract class u61<T> implements aed<BaseResponse<T>> {
    public void a(BaseResponse baseResponse) {
    }

    public abstract void b(Throwable th, String str);

    @Override // com.oplus.aiunit.vision.aed
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onNext(BaseResponse<T> baseResponse) {
        try {
            if (baseResponse.getErrorCode() == 0) {
                d(baseResponse.getBody());
            } else {
                b(new Exception(baseResponse.getMessage()), baseResponse.getErrorCode() + ":" + baseResponse.getMessage());
                a(baseResponse);
            }
        } catch (Exception e2) {
            a7b.b("BaseObserver", "onNext Error!!!:" + e2.getMessage());
        }
    }

    public abstract void d(T t);

    @Override // com.oplus.aiunit.vision.aed
    public void onComplete() {
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onError(Throwable th) {
        b(th, gu6.b(th));
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
    }
}
