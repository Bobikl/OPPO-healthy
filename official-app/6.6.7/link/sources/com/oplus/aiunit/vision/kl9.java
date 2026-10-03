package com.oplus.aiunit.vision;

import com.oppo.bluetooth.btnet.bluetoothproxyserver.constants.RequestMethod;
import com.oppo.bluetooth.btnet.bluetoothproxyserver.httpMessage.exception.BuildHttpMessageError;
import java.io.InputStream;
import java.util.Map;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class kl9 extends bl9 {

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[RequestMethod.values().length];
            a = iArr;
            try {
                iArr[RequestMethod.POST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[RequestMethod.PUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public kl9(InputStream inputStream) throws BuildHttpMessageError {
        super(inputStream);
    }

    @Override // com.oplus.aiunit.vision.bl9
    public rpi e(String str) {
        return new duf(str);
    }

    @Override // com.oplus.aiunit.vision.bl9
    public bl9 g() {
        rpi rpiVarJ = j();
        if (rpiVarJ instanceof duf) {
            duf dufVar = (duf) rpiVarJ;
            dufVar.h(dufVar.f());
            super.n(dufVar);
        }
        if (!super.k()) {
            for (Map.Entry<String, String> entry : super.i().entrySet()) {
                super.a(entry.getKey(), entry.getValue());
            }
        }
        return this;
    }

    @Override // com.oplus.aiunit.vision.bl9
    public boolean l() {
        int i = a.a[((duf) super.j()).e().ordinal()];
        return i == 1 || i == 2;
    }
}
