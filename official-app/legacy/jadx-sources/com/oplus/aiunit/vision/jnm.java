package com.oplus.aiunit.vision;

import android.content.Context;
import com.heytap.mspsdk.MspSdk;
import com.oplus.omes.srp.sysintegrity.AttestParam;
import com.oplus.omes.srp.sysintegrity.SrpException;
import com.oplus.omes.srp.sysintegrity.core.AttestInfo;
import com.oplus.omes.srp.sysintegrity.core.AttestResponse;
import com.oplus.omes.srp.sysintegrity.util.LogUtil;

/* JADX INFO: loaded from: classes8.dex */
public class jnm {
    public static jnm c_b;
    public Context a;

    public jnm(Context context) {
        this.a = context;
    }

    public static synchronized jnm b(Context context) {
        if (c_b == null) {
            c_b = new jnm(context.getApplicationContext());
        }
        return c_b;
    }

    public static AttestInfo c(Context context, AttestParam attestParam) throws SrpException {
        g(attestParam);
        mnm mnmVar = new mnm(context);
        try {
            mnmVar.b.init();
            MspSdk.init(mnmVar.a);
            return mnmVar.b(attestParam);
        } catch (SrpException e2) {
            LogUtil.e(e2.getCode());
            throw new SrpException(e2.getCode());
        } catch (Exception e3) {
            LogUtil.w("" + e3.getMessage());
            throw new SrpException(SrpException.ERROR_DEV_ATTEST_OTHER_FAIL);
        }
    }

    public static void e(final mnm mnmVar, final Context context, final AttestParam attestParam) {
        hnm hnmVarA = hnm.a(context);
        hnmVarA.b.execute(new Runnable() { // from class: com.oplus.aiunit.vision.enm
            @Override // java.lang.Runnable
            public final void run() {
                jnm.f(mnmVar, attestParam, context);
            }
        });
    }

    public static /* synthetic */ void f(mnm mnmVar, AttestParam attestParam, Context context) {
        try {
            AttestResponse attestResponseC = mnmVar.c(attestParam);
            if (attestResponseC == null || attestResponseC.getoCerts() == null) {
                return;
            }
            inm.a(context, attestResponseC);
        } catch (SrpException e2) {
            LogUtil.e(e2.getCode());
        }
    }

    public static void g(AttestParam attestParam) throws SrpException {
        if (attestParam == null) {
            throw new SrpException("attest param is null");
        }
        byte[] nonce = attestParam.getNonce();
        if (nonce == null || nonce.length != 16) {
            throw new SrpException("nonce is err");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h() {
        try {
            MspSdk.init(this.a);
            MspSdk.preConnectToMspCore();
        } catch (Exception unused) {
        }
    }

    public void d() {
        hnm hnmVarA = hnm.a(this.a);
        hnmVarA.b.execute(new Runnable() { // from class: com.oplus.aiunit.vision.cnm
            @Override // java.lang.Runnable
            public final void run() {
                this.i.h();
            }
        });
    }
}
