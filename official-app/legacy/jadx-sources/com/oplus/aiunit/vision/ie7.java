package com.oplus.aiunit.vision;

import androidx.exifinterface.media.ExifInterface;
import com.heytap.health.wallet.network.CommonResponse;
import com.heytap.health.watch.netnumber.callinterception.AbsCallInterceptionHandlerKt;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0016\u0010\t\u001a\u00020\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\u0006H\u0016J\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00028\u0000H&¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H&¨\u0006\u0017"}, d2 = {"Lcom/oplus/aiunit/vision/ie7;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/oplus/aiunit/vision/aed;", "Lcom/heytap/health/wallet/network/CommonResponse;", "Lio/reactivex/rxjava3/disposables/a;", "d", "", "onSubscribe", AbsCallInterceptionHandlerKt.GSON_KEY_RESPONSE, "b", "", MapSchema.FIELD_NAME_ENTRY, "onError", "onComplete", "result", "c", "(Ljava/lang/Object;)V", "", "errCode", "errMsg", "a", "<init>", "()V", "commonlib_release"}, k = 1, mv = {1, 8, 0})
public abstract class ie7<T> implements aed<CommonResponse<T>> {
    public abstract void a(@NotNull String errCode, @NotNull String errMsg);

    @Override // com.oplus.aiunit.vision.aed
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onNext(@NotNull CommonResponse<T> response) {
        Intrinsics.checkNotNullParameter(response, "response");
        try {
            if (response.isSuccess()) {
                T t = response.data;
                if (t == null) {
                    a("0", "data null");
                } else {
                    c(t);
                }
            } else {
                String code = response.getCode();
                if (code == null) {
                    code = "0";
                }
                String message = response.getMessage();
                if (message == null) {
                    message = "";
                }
                a(code, message);
            }
        } catch (Exception e2) {
            a7b.b("FinObserver", "onNext Error!!!:" + e2.getMessage());
            String code2 = response.getCode();
            String str = code2 != null ? code2 : "0";
            String message2 = response.getMessage();
            a(str, message2 != null ? message2 : "");
        }
    }

    public abstract void c(T result);

    @Override // com.oplus.aiunit.vision.aed
    public void onComplete() {
        t6b.b("FinObserver", "onComplete");
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onError(@NotNull Throwable e2) {
        Intrinsics.checkNotNullParameter(e2, "e");
        String strValueOf = String.valueOf(e2.getCause());
        String message = e2.getMessage();
        if (message == null) {
            message = "";
        }
        a(strValueOf, message);
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onSubscribe(@NotNull io.reactivex.rxjava3.disposables.a d) {
        Intrinsics.checkNotNullParameter(d, "d");
    }
}
