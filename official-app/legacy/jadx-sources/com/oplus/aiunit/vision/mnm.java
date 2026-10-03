package com.oplus.aiunit.vision;

import android.content.Context;
import com.oplus.omes.srp.sysintegrity.AttestParam;
import com.oplus.omes.srp.sysintegrity.SrpConstant;
import com.oplus.omes.srp.sysintegrity.SrpException;
import com.oplus.omes.srp.sysintegrity.cmm.ClientInfoV1;
import com.oplus.omes.srp.sysintegrity.cmm.CmmHelper;
import com.oplus.omes.srp.sysintegrity.cmm.TokenRequestParamV1;
import com.oplus.omes.srp.sysintegrity.core.AttestInfo;
import com.oplus.omes.srp.sysintegrity.core.AttestResponse;
import com.oplus.omes.srp.sysintegrity.util.LogUtil;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

/* JADX INFO: loaded from: classes8.dex */
public class mnm {
    public Context a;
    public CmmHelper b;

    public mnm(Context context) {
        this.b = null;
        this.a = context;
        this.b = new CmmHelper(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AttestInfo a(Context context, String str, String str2, boolean z) throws SrpException {
        AttestResponse attestResponse;
        boolean z2;
        AttestResponse attestResponse2;
        Throwable th;
        Context context2 = this.a;
        String strBuild = TokenRequestParamV1.build(context2, str, str2, hnm.a(context2).a, z);
        Context context3 = null;
        String strRequest = this.b.request(strBuild, null);
        LogUtil.d(SrpConstant.DEBUG_PROXY_TOKEN_TEE, strRequest);
        if (strRequest == null) {
            LogUtil.e(SrpException.ERROR_PROXY_SERVICE_RESP_NULL);
            throw new SrpException(SrpException.ERROR_PROXY_SERVICE_RESP_NULL);
        }
        AttestResponse attestResponse3 = (AttestResponse) lnm.c_a.fromJson(strRequest, AttestResponse.class);
        if (attestResponse3.getCode() != 0) {
            LogUtil.e(attestResponse3.getCode(), attestResponse3.getMessage());
            throw new SrpException(attestResponse3.getCode(), attestResponse3.getMessage());
        }
        synchronized (inm.c_a) {
            try {
                try {
                    FileInputStream fileInputStreamOpenFileInput = context.openFileInput("srpsdk-cache");
                    try {
                        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStreamOpenFileInput);
                        try {
                            AttestResponse attestResponse4 = (AttestResponse) objectInputStream.readObject();
                            try {
                                objectInputStream.close();
                                attestResponse = attestResponse4;
                                if (fileInputStreamOpenFileInput != null) {
                                    fileInputStreamOpenFileInput.close();
                                    attestResponse = attestResponse4;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                if (fileInputStreamOpenFileInput != null) {
                                    try {
                                        fileInputStreamOpenFileInput.close();
                                    } catch (Throwable th3) {
                                        th.addSuppressed(th3);
                                    }
                                }
                                throw th;
                            }
                        } catch (Throwable th4) {
                            try {
                                objectInputStream.close();
                            } catch (Throwable th5) {
                                th4.addSuppressed(th5);
                            }
                            throw th4;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                    }
                } catch (Exception unused) {
                    LogUtil.e(SrpException.ERROR_FILE_INPUT_EXP);
                    attestResponse = context3;
                }
            } catch (Exception unused2) {
                context3 = context2;
                LogUtil.e(SrpException.ERROR_FILE_INPUT_EXP);
                attestResponse = context3;
            }
        }
        if (attestResponse == 0 || attestResponse.getoCerts() == null) {
            z2 = false;
            attestResponse2 = new AttestResponse(null, 0L, 0L);
        } else {
            z2 = true;
            attestResponse2 = attestResponse;
        }
        attestResponse2.setTeeCerts(attestResponse3.getTeeCerts());
        attestResponse2.setgCerts(attestResponse3.getgCerts());
        attestResponse2.setgDgst(attestResponse3.getgDgst());
        return AttestInfo.createFrom(attestResponse2, z2);
    }

    public AttestInfo b(AttestParam attestParam) throws SrpException {
        LogUtil.d("Run with safe mode.");
        AttestResponse attestResponseC = c(attestParam);
        if (attestResponseC.getCode() != 0) {
            LogUtil.e(attestResponseC.getCode(), attestResponseC.getMessage());
            throw new SrpException(attestResponseC.getCode(), attestResponseC.getMessage());
        }
        LogUtil.d("set state " + attestResponseC.isSysIntegrity());
        ClientInfoV1.setsState(attestResponseC.isSysIntegrity());
        return AttestInfo.createFrom(attestResponseC);
    }

    public AttestResponse c(AttestParam attestParam) throws SrpException {
        String strBuild = TokenRequestParamV1.build(this.a, onm.a(attestParam.getNonce()), attestParam.getAppId(), attestParam.getConnectTimeout(), attestParam.isRetry(), hnm.a(this.a).a, attestParam.isForceToken(), attestParam.isCertsHash());
        LogUtil.d("jsonReq:" + strBuild);
        ClientInfoV1 clientInfoV1Gather = ClientInfoV1.gather(this.a);
        String content = clientInfoV1Gather != null ? clientInfoV1Gather.getContent() : null;
        LogUtil.d("jsonCli:" + content);
        String strRequest = this.b.request(strBuild, content);
        if (strRequest != null) {
            LogUtil.i(SrpConstant.DEBUG_PROXY_TOKEN_SERVICE_RESP, strRequest);
            return (AttestResponse) lnm.c_a.fromJson(strRequest, AttestResponse.class);
        }
        LogUtil.e(SrpException.ERROR_PROXY_SERVICE_RESP_NULL);
        throw new SrpException(SrpException.ERROR_PROXY_SERVICE_RESP_NULL);
    }
}
