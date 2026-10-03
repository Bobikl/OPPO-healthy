package O0O;

import O00.O0O;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.oplus.aiunit.vision.d1d;
import com.oplus.aiunit.vision.e1d;
import com.oplus.carlink.controlsdk.CarControlCallback;
import com.oplus.carlink.controlsdk.Constant;

/* JADX INFO: loaded from: classes.dex */
public final class O00<T> extends O0O.O00 {

    /* JADX INFO: renamed from: O00, reason: collision with root package name */
    public final CarControlCallback<T> f161O00;

    /* JADX INFO: renamed from: O0O, reason: collision with root package name */
    public final e1d<T> f162O0O;

    public O00(@NonNull CarControlCallback<T> carControlCallback, @NonNull e1d<T> e1dVar) {
        this.f161O00 = carControlCallback;
        this.f162O0O = e1dVar;
    }

    @Override // O00.O0O
    public final void O00(Bundle bundle) {
        try {
            d1d.d("CarControlCallbackImpl", "onResult");
            int i = bundle.getInt("code", -1);
            if (i == 0) {
                this.f161O00.onResult(this.f162O0O.g(bundle));
            } else {
                this.f161O00.onError(i, Constant.getErrorMessageByCode(i), bundle.getString("additionalInfo", ""));
            }
        } catch (Exception e2) {
            d1d.b("CarControlCallbackImpl", "onResult exception:", e2);
        }
    }
}
