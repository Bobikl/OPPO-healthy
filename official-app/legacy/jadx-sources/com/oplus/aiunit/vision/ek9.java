package com.oplus.aiunit.vision;

import com.oppo.bluetooth.btnet.bluetoothproxyserver.constants.RequestMethod;
import com.oppo.bluetooth.btnet.bluetoothproxyserver.httpMessage.exception.BuildHttpMessageError;
import java.io.InputStream;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class ek9 extends vj9 {

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

    public ek9(InputStream inputStream) throws BuildHttpMessageError {
        super(inputStream);
    }

    @Override // com.oplus.aiunit.vision.vj9
    public zli e(String str) {
        return new brf(str);
    }

    @Override // com.oplus.aiunit.vision.vj9
    public vj9 g() {
        zli zliVarJ = j();
        if (zliVarJ instanceof brf) {
            brf brfVar = (brf) zliVarJ;
            brfVar.h(brfVar.f());
            super.n(brfVar);
        }
        if (!super.k()) {
            for (Map.Entry<String, String> entry : super.i().entrySet()) {
                super.a(entry.getKey(), entry.getValue());
            }
        }
        return this;
    }

    @Override // com.oplus.aiunit.vision.vj9
    public boolean l() {
        int i = a.a[((brf) super.j()).e().ordinal()];
        return i == 1 || i == 2;
    }
}
