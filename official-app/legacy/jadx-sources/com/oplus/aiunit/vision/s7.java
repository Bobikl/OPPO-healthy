package com.oplus.aiunit.vision;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.oplus.accountsdk.base.common.net.data.AcSdkNetResponse;
import com.oplus.accountsdk.base.common.util.AcLogUtil;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLHandshakeException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class s7 {
    private static final String TAG = "AcBaseNetManager";
    public static nl9 netAvailable;
    private nb mNetRequestMgr;

    public class a implements pl9 {
        public a() {
        }

        @Override // com.oplus.aiunit.vision.pl9
        public void e(String str, String str2) {
            if (AcLogUtil.enableDebug()) {
                AcLogUtil.e(s7.TAG + str, str2);
                return;
            }
            AcLogUtil.e(s7.TAG + str, str2, false);
        }

        @Override // com.oplus.aiunit.vision.pl9
        public void i(String str, String str2) {
            if (AcLogUtil.enableDebug()) {
                AcLogUtil.i(s7.TAG + str, str2);
                return;
            }
            AcLogUtil.i(s7.TAG + str, str2, false);
        }
    }

    public s7(Context context, String str) {
        AcLogUtil.d(TAG, "init AcSdkNetManager");
        lb lbVar = new lb();
        lbVar.a = getAppK();
        lbVar.b = getAppSecret();
        lbVar.f13613c = str;
        lbVar.d = 20;
        lbVar.f = 20;
        lbVar.f13614e = 20;
        this.mNetRequestMgr = new nb(context, lbVar, getInterceptors(context), new a());
    }

    private String getMessageByCode(int i) {
        switch (i) {
            case -417006:
                return "Device network is not available";
            case -417005:
                return "Unknown error";
            case -417004:
                return "Network response error";
            case -417003:
                return "Network request failed";
            case -417002:
                return "SSL certificate error";
            case -417001:
                return "Connection failed. Check your network settings or try again later.";
            default:
                return "unKnown";
        }
    }

    @NonNull
    private static <T, E> String getNetMessage(ztf<AcSdkNetResponse<T, E>> ztfVar) {
        String strH = ztfVar.h();
        StringBuilder sb = new StringBuilder();
        sb.append(ztfVar.b());
        if (strH == null) {
            strH = "";
        }
        sb.append(strH);
        return sb.toString();
    }

    private <T, E> AcSdkNetResponse<T, E> handleRetrofitError(Throwable th) {
        int i;
        if (!(th instanceof IOException)) {
            i = -417005;
        } else if ((th instanceof SSLHandshakeException) && !TextUtils.isEmpty(th.getMessage()) && (th.getMessage().contains("CertificateExpiredException") || th.getMessage().contains("CertificateNotYetValidException"))) {
            i = -417002;
        } else {
            i = th instanceof UnknownHostException ? -417006 : -417001;
        }
        String message = th.getMessage() != null ? th.getMessage() : "";
        AcLogUtil.e(TAG, "RetrofitCall onFailure code=" + i + " msg=" + message + ", t = " + th);
        return AcSdkNetResponse.createError(i, getMessageByCode(i), message);
    }

    private static <T, E> boolean isResponseSuccessful(ztf<AcSdkNetResponse<T, E>> ztfVar) {
        return ztfVar != null && ztfVar.b() == 200;
    }

    public <T> T getAcNetRequestService(Class<T> cls) {
        return (T) this.mNetRequestMgr.a(cls);
    }

    public abstract String getAppK();

    public abstract String getAppSecret();

    public List<jea> getInterceptors(Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new jb());
        return arrayList;
    }

    public abstract String getRegion();

    @WorkerThread
    public <T, E> AcSdkNetResponse<T, E> retrofitCallSync(xr2<AcSdkNetResponse<T, E>> xr2Var) {
        try {
            ztf<AcSdkNetResponse<T, E>> ztfVarExecute = xr2Var.execute();
            if (!isResponseSuccessful(ztfVarExecute)) {
                return AcSdkNetResponse.createError(-417003, getMessageByCode(-417003), getNetMessage(ztfVarExecute));
            }
            AcSdkNetResponse<T, E> acSdkNetResponseA = ztfVarExecute.a();
            StringBuilder sb = new StringBuilder();
            sb.append("RetrofitCall onResponse httpCode: code=");
            sb.append(ztfVarExecute.b());
            sb.append(", bizCode: ");
            sb.append(acSdkNetResponseA == null ? "null" : Integer.valueOf(acSdkNetResponseA.getCode()));
            AcLogUtil.i(TAG, sb.toString());
            return acSdkNetResponseA == null ? AcSdkNetResponse.createError(-417004, getMessageByCode(-417004), getNetMessage(ztfVarExecute)) : acSdkNetResponseA;
        } catch (Throwable th) {
            return handleRetrofitError(th);
        }
    }
}
