package com.oplus.aiunit.vision;

import com.heytap.databaseengineservice.sync.network.DBBaseResponse;

/* JADX INFO: loaded from: classes15.dex */
public abstract class zi4<T> implements aed<DBBaseResponse<T>> {
    public void a(DBBaseResponse dBBaseResponse) {
    }

    public abstract void b(Throwable th, String str);

    @Override // com.oplus.aiunit.vision.aed
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onNext(DBBaseResponse<T> dBBaseResponse) {
        try {
            if (dBBaseResponse.getErrorCode() == 0) {
                d(dBBaseResponse.getBody());
            } else {
                b(new Exception(dBBaseResponse.getMessage()), dBBaseResponse.getErrorCode() + ":" + dBBaseResponse.getMessage());
                a(dBBaseResponse);
            }
        } catch (Exception e2) {
            cj4.b("BaseObserver", "onNext Error!!!:" + e2.getMessage());
        }
    }

    public abstract void d(T t);

    @Override // com.oplus.aiunit.vision.aed
    public void onComplete() {
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onError(Throwable th) {
        b(th, qa2.syncCloudEncrypt.p0(th));
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
    }
}
