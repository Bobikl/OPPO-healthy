package com.oplus.omes.srp.sysintegrity;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.NonNull;
import com.heytap.mspsdk.MspSdk;
import com.oplus.aiunit.vision.hnm;
import com.oplus.aiunit.vision.jnm;
import com.oplus.aiunit.vision.knm;
import com.oplus.aiunit.vision.mnm;
import com.oplus.aiunit.vision.onm;
import com.oplus.omes.srp.sysintegrity.SrpException;
import com.oplus.omes.srp.sysintegrity.cmm.ClientInfoV1;
import com.oplus.omes.srp.sysintegrity.core.AttestInfo;
import com.oplus.omes.srp.sysintegrity.core.AttestResponse;
import com.oplus.omes.srp.sysintegrity.util.LogUtil;

/* JADX INFO: loaded from: classes8.dex */
public final class SrpClient {
    private static SrpClient mClient;
    private boolean mCompatMode = false;
    private Context mContext;

    private SrpClient(Context context) {
        this.mContext = null;
        this.mContext = context.getApplicationContext();
    }

    private void devAttestInternal(final AttestParam attestParam, final ISrpCallback<AttestInfo> iSrpCallback) {
        hnm hnmVarA = hnm.a(this.mContext);
        hnmVarA.b.execute(new Runnable() { // from class: com.oplus.aiunit.vision.eli
            @Override // java.lang.Runnable
            public final void run() throws SrpException {
                this.i.lambda$devAttestInternal$0(iSrpCallback, attestParam);
            }
        });
    }

    @NonNull
    private AttestInfo getEnvInfo(AttestParam attestParam) {
        LogUtil.d("needUpgrade...");
        AttestResponse attestResponse = new AttestResponse("", 0L, 0L);
        attestResponse.setNonce(onm.a(attestParam.getNonce()));
        attestResponse.setReserved(getRiskProbeInfo(this.mContext, ClientInfoV1.gather(this.mContext).getContent()));
        return AttestInfo.createFrom(attestResponse);
    }

    public static synchronized SrpClient getInstance(Context context) {
        if (mClient == null) {
            synchronized (SrpClient.class) {
                mClient = new SrpClient(context);
            }
        }
        return mClient;
    }

    private String getRiskProbeInfo(Context context, String str) {
        String string = context.getSharedPreferences("srpcfg", 0).getString("cliInfo1", null);
        String str2 = string != null ? new String(Base64.decode(string, 2)) : "";
        if (str2.length() == 0) {
            str2 = knm.b(context, str);
        } else {
            knm.a(context, str);
        }
        LogUtil.d("riskInfo:" + str2);
        return TextUtils.isEmpty(str2) ? "" : str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$devAttestInternal$0(ISrpCallback iSrpCallback, AttestParam attestParam) throws SrpException {
        AttestInfo attestInfoC = null;
        try {
            if (this.mCompatMode) {
                LogUtil.d("Run with compatible mode.");
                if (needUpgrade()) {
                    iSrpCallback.onFinish(getEnvInfo(attestParam));
                    return;
                }
                LogUtil.d("no needUpgrade...");
            }
            e = null;
            attestInfoC = jnm.c(this.mContext, attestParam);
        } catch (SrpException e2) {
            e = e2;
        }
        if (attestInfoC != null) {
            iSrpCallback.onFinish(attestInfoC);
        } else if (attestParam.isCompatMode()) {
            iSrpCallback.onFinish(getEnvInfo(attestParam));
        } else {
            iSrpCallback.onFailure(e);
        }
    }

    public boolean devAttest(byte[] bArr, String str, ISrpCallback<AttestInfo> iSrpCallback) throws SrpException {
        LogUtil.d("async commpatible:" + this.mCompatMode);
        if (iSrpCallback == null) {
            throw new RuntimeException("callback cannot be null");
        }
        devAttestInternal(new AttestParam.Builder().setNonce(bArr).setAppId(str).setCompatMode(this.mCompatMode).setConnectTimeout(5000L).build(), iSrpCallback);
        return true;
    }

    public AttestInfo devAttestForTerminal(AttestParam attestParam) throws SrpException {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new SrpException("DO NOT call in main thread");
        }
        jnm.g(attestParam);
        if (needUpgrade()) {
            LogUtil.e("sysintegrity is not supported");
            throw new SrpException("sysintegrity is not supported");
        }
        Context context = this.mContext;
        String strA = onm.a(attestParam.getNonce());
        mnm mnmVar = new mnm(context);
        AttestInfo attestInfoA = null;
        try {
            mnmVar.b.init();
            MspSdk.init(mnmVar.a);
            attestInfoA = mnmVar.a(context, strA, attestParam.getCustomDgst(), attestParam.isTeeCompat());
            jnm.e(mnmVar, context, attestParam);
            return attestInfoA;
        } catch (SrpException e2) {
            LogUtil.e(e2.getCode());
            throw new SrpException(e2.getCode());
        } catch (Exception e3) {
            LogUtil.w("" + e3.getMessage());
            return attestInfoA;
        }
    }

    public AttestInfo devAttestSync(AttestParam attestParam) throws SrpException {
        AttestInfo attestInfoC;
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new SrpException("DO NOT call in main thread");
        }
        jnm.g(attestParam);
        LogUtil.d("Enter devAttest...");
        if (this.mCompatMode) {
            LogUtil.d("Run with compatible mode.");
            if (needUpgrade()) {
                return getEnvInfo(attestParam);
            }
            LogUtil.d("no needUpgrade...");
        }
        try {
            attestInfoC = jnm.c(this.mContext, attestParam);
        } catch (SrpException e2) {
            if (!attestParam.isCompatMode()) {
                throw new SrpException(e2.getCode());
            }
            attestInfoC = null;
        }
        return (attestInfoC == null && attestParam.isCompatMode()) ? getEnvInfo(attestParam) : attestInfoC;
    }

    public boolean devAttestWithCertsHash(byte[] bArr, String str, ISrpCallback<AttestInfo> iSrpCallback) throws SrpException {
        devAttestInternal(new AttestParam.Builder().setNonce(bArr).setAppId(str).setCompatMode(this.mCompatMode).setCertsHash(true).build(), iSrpCallback);
        return true;
    }

    public boolean devAttestWithForceToken(byte[] bArr, String str, ISrpCallback<AttestInfo> iSrpCallback) throws SrpException {
        devAttestInternal(new AttestParam.Builder().setNonce(bArr).setAppId(str).setCompatMode(this.mCompatMode).setForceToken(true).build(), iSrpCallback);
        return true;
    }

    public void init() {
        try {
            jnm.b(this.mContext).d();
        } catch (Exception e2) {
            LogUtil.e(SrpException.ERROR_INIT_ERR, e2.getMessage());
        } catch (Throwable th) {
            LogUtil.e(SrpException.ERROR_INIT_ERR, th.getMessage());
        }
    }

    public boolean needUpgrade() {
        PackageManager packageManager = this.mContext.getPackageManager();
        try {
            ProviderInfo[] providerInfoArr = packageManager.getPackageInfo("com.heytap.htms", 8).providers;
            LogUtil.d("ProviderInfo length:" + providerInfoArr.length);
            int length = providerInfoArr.length;
            for (int i = 0; i < length; i++) {
                ProviderInfo providerInfo = providerInfoArr[i];
                LogUtil.d("authority:" + providerInfo.authority);
                if ("com.oplus.omes.srp.SAFETY_CHECK".equals(providerInfo.authority)) {
                    return false;
                }
            }
        } catch (Exception e2) {
            LogUtil.e(SrpException.ERROR_GET_KIT_INFO, "getPackageInfo failed:" + e2.getMessage());
        }
        try {
            ProviderInfo[] providerInfoArr2 = packageManager.getPackageInfo("com.heytap.mcs", 8).providers;
            LogUtil.d("ProviderInfo length:" + providerInfoArr2.length);
            int length2 = providerInfoArr2.length;
            for (int i2 = 0; i2 < length2; i2++) {
                ProviderInfo providerInfo2 = providerInfoArr2[i2];
                LogUtil.d("authority:" + providerInfo2.authority);
                if ("com.heytap.mcs.SrpProvider".equals(providerInfo2.authority)) {
                    return false;
                }
            }
        } catch (Exception e3) {
            LogUtil.e(SrpException.ERROR_GET_KIT_INFO, "getPackageInfo1 failed:" + e3.getMessage());
        }
        LogUtil.i(SrpConstant.DEBUG_NEED_UPDATE, "needUpgrade...");
        return true;
    }

    public void setCompatMode(boolean z) {
        this.mCompatMode = z;
    }
}
