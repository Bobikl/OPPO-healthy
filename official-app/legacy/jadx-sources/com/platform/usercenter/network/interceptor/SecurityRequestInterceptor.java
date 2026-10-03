package com.platform.usercenter.network.interceptor;

import androidx.annotation.NonNull;
import com.oplus.aiunit.vision.cuf;
import com.oplus.aiunit.vision.f04;
import com.oplus.aiunit.vision.gj8;
import com.oplus.aiunit.vision.gqf;
import com.oplus.aiunit.vision.jea;
import com.oplus.aiunit.vision.ytf;
import com.platform.usercenter.BaseApp;
import com.platform.usercenter.basic.provider.UCCommonXor8Provider;
import com.platform.usercenter.network.NetworkModule;
import com.platform.usercenter.network.data.HeaderOpenIdBean;
import com.platform.usercenter.network.header.DeviceSecurityHeader;
import com.platform.usercenter.network.header.HeaderConstant;
import com.platform.usercenter.network.header.IBizHeaderManager;
import com.platform.usercenter.network.header.UCHeaderHelperV1;
import com.platform.usercenter.network.header.UCHeaderHelperV2;
import com.platform.usercenter.network.provider.INetConfigProvider;
import com.platform.usercenter.tools.algorithm.MD5Util;
import com.platform.usercenter.tools.datastructure.StringUtil;
import com.platform.usercenter.tools.log.UCLogUtil;
import com.platform.usercenter.tools.security.AESUtilTest;
import com.platform.usercenter.tools.security.RsaCoder;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.URLEncoder;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;
import okhttp3.MediaType;
import okhttp3.Request;
import okio.Buffer;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class SecurityRequestInterceptor implements jea {
    private static final String FORMAT_CONTENT_TYPE = "%s; charset=%s";
    private static final String HEADER_PROTOCOL_VERSION = "3.0";
    private static final int RETRY_NUM = 2;
    private static final int STATUS_CODE_DECRYPT_FAIL = 222;
    private static final String TAG = "SecurityRequestInterceptor";
    private static final String UTF_8 = "UTF-8";
    private static final String X_R_K = UCCommonXor8Provider.getProviderKeyXor8();
    private final IBizHeaderManager mBizHeaderManager;
    private volatile SecurityKey mSecurityKey;

    public static class Header {
        private static final String CHAR = "\\/";
        private static final String CHAR_L = "/";
        private static final String HEADER_PROTOCOL_VERSION = "3.0";
        public static final String HEADER_X_SESSION_TICKET = "X-Session-Ticket";
        private static final String X_PROTOCOL = "X-Protocol";

        /* JADX INFO: Access modifiers changed from: private */
        public Map<String, String> newHeader(SecurityKey securityKey, String str) {
            HashMap map = new HashMap(4);
            map.put(HeaderConstant.HEADER_X_PROTOCOL_VERSION, HEADER_PROTOCOL_VERSION);
            map.put(UCHeaderHelperV2.X_PROTOCOL_VERSION, HEADER_PROTOCOL_VERSION);
            String strEncrypt = SecurityKey.encrypt(securityKey, str);
            if (strEncrypt == null) {
                map.put(HeaderConstant.HEAD_K_ACCEPT, "application/json");
                return map;
            }
            securityKey.setHeaderSignatureV1(strEncrypt);
            map.put(HeaderConstant.HEAD_K_ACCEPT, HeaderConstant.HEADER_SECURITY_CONTENT_TYPE);
            map.put("X-Security", strEncrypt);
            map.put(UCHeaderHelperV1.HEADER_X_KEY, securityKey.mRsa);
            map.put(UCHeaderHelperV1.HEADER_X_I_V, securityKey.mIvStr);
            if (securityKey.mSecurityTicket != null && !"".equals(securityKey.mSecurityTicket)) {
                map.put(HEADER_X_SESSION_TICKET, securityKey.mSecurityTicket);
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(SecurityRequestInterceptor.X_R_K, securityKey.mRsa);
                jSONObject.put("iv", securityKey.mIvStr);
                jSONObject.put("sessionTicket", securityKey.mSecurityTicket);
                String string = jSONObject.toString();
                if (string.contains(CHAR)) {
                    string = string.replace(CHAR, "/");
                }
                String strEncode = URLEncoder.encode(string, "UTF-8");
                String strEncode2 = URLEncoder.encode(strEncrypt, "UTF-8");
                securityKey.setHeaderSignatureV2(strEncode2);
                map.put(UCHeaderHelperV2.X_SAFETY, strEncode2);
                map.put("X-Protocol", strEncode);
            } catch (Exception e2) {
                map.put(UCHeaderHelperV2.X_SAFETY, "");
                map.put("X-Protocol", "");
                UCLogUtil.e(SecurityRequestInterceptor.TAG, "v2 header is error = " + e2);
            }
            return map;
        }
    }

    public static class RequestWrapper {
        static final int REQUEST_ENCRYPT_BODY_FAIL = 11095220;
        static final int REQUEST_ENCRYPT_HEAD_FAIL = 11095221;
        static final int REQUEST_SUCCESS = 11095219;
        final int code;
        final String message;
        final Request request;

        private RequestWrapper(int i, String str, Request request) {
            this.code = i;
            this.message = str;
            this.request = request;
        }

        public static RequestWrapper create(int i, String str, Request request) {
            return new RequestWrapper(i, str, request);
        }
    }

    public static class ResponseWrapper {
        static final int BODY_IS_NULL = 10095221;
        static final int FAIL_DECRYPT = 10095224;
        static final int FAIL_SIGNATURE_NOT_FOUND = 10095222;
        static final int FAIL_SIGNATURE_VERIFY = 10095223;
        static final int HTTP_FAIL = 10095220;
        static final int SUCCESS = 10095219;
        final int code;
        final String message;
        final ytf response;

        private ResponseWrapper(int i, String str, ytf ytfVar) {
            this.code = i;
            this.message = str;
            this.response = ytfVar;
        }

        public static ResponseWrapper create(int i, String str, ytf ytfVar) {
            return new ResponseWrapper(i, str, ytfVar);
        }
    }

    public static class SecurityKey {
        private static final String TAG = "SecurityKey";
        private final String mAes;
        private String mHeaderSignatureV1;
        private String mHeaderSignatureV2;
        private final byte[] mIv;
        private final String mIvStr;
        private final String mRsa;
        private String mSecurityTicket;

        /* JADX INFO: Access modifiers changed from: private */
        public static String decrypt(SecurityKey securityKey, String str) {
            try {
                return AESUtilTest.aesDecryptWithPassKey(str, securityKey.mAes, securityKey.mIv);
            } catch (Exception e2) {
                UCLogUtil.e(TAG, "decrypt = " + e2);
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static String encrypt(SecurityKey securityKey, String str) {
            try {
                return AESUtilTest.aesEncryptWithPassKey(str, securityKey.mAes, securityKey.mIv);
            } catch (Exception e2) {
                UCLogUtil.e(TAG, f04.JSON_KEY_RKE_IS_ENCRYPT + e2);
                return null;
            }
        }

        private byte[] generateRandom16byte() {
            byte[] bArr = new byte[16];
            new SecureRandom().nextBytes(bArr);
            return bArr;
        }

        public void setHeaderSignatureV1(String str) {
            this.mHeaderSignatureV1 = str;
        }

        public void setHeaderSignatureV2(String str) {
            this.mHeaderSignatureV2 = str;
        }

        public void setSecurityTicket(String str) {
            this.mSecurityTicket = str;
        }

        private SecurityKey() {
            this.mSecurityTicket = "";
            this.mHeaderSignatureV1 = "";
            this.mHeaderSignatureV2 = "";
            byte[] bArrGenerateRandom16byte = generateRandom16byte();
            this.mIv = bArrGenerateRandom16byte;
            this.mIvStr = AESUtilTest.base64EncodeSafe(bArrGenerateRandom16byte);
            String strBase64EncodeSafe = AESUtilTest.base64EncodeSafe(generateRandom16byte());
            this.mAes = strBase64EncodeSafe;
            this.mRsa = RsaCoder.encrypt(strBase64EncodeSafe, RsaCoder.Key);
        }
    }

    public SecurityRequestInterceptor(IBizHeaderManager iBizHeaderManager) {
        this.mBizHeaderManager = iBizHeaderManager;
    }

    private static String bodyToString(@NonNull gqf gqfVar) {
        try {
            Buffer buffer = new Buffer();
            gqfVar.writeTo(buffer);
            return buffer.readUtf8();
        } catch (Exception e2) {
            UCLogUtil.e(TAG, "body is parse error = " + e2.getMessage());
            return null;
        }
    }

    private RequestWrapper buildRequest(@NonNull Request request, @NonNull SecurityKey securityKey, @NonNull String str) {
        String strEncrypt;
        String str2;
        if ("".equals(str)) {
            strEncrypt = null;
            str2 = "request body is empty";
        } else {
            strEncrypt = SecurityKey.encrypt(securityKey, str);
            str2 = strEncrypt == null ? "encrypt body fail" : "encrypt body success";
        }
        Map mapNewHeader = new Header().newHeader(securityKey, DeviceSecurityHeader.getDeviceSecurityHeader(BaseApp.mContext, this.mBizHeaderManager));
        if ("application/json".equals(mapNewHeader.get(HeaderConstant.HEAD_K_ACCEPT))) {
            return RequestWrapper.create(11095221, "head is encrypt fail", plainTextRequest(request));
        }
        gj8.a aVarD = request.getHeaders().d();
        for (Map.Entry entry : mapNewHeader.entrySet()) {
            aVarD.k((String) entry.getKey(), (String) entry.getValue());
        }
        Request.Builder builderHeaders = request.n().headers(aVarD.g());
        if (strEncrypt != null) {
            builderHeaders.post(gqf.create(MediaType.parse(formatContentType(true)), strEncrypt));
        }
        return RequestWrapper.create(11095219, str2, builderHeaders.build());
    }

    private String formatContentType(boolean z) {
        return String.format(FORMAT_CONTENT_TYPE, z ? HeaderConstant.HEADER_SECURITY_CONTENT_TYPE : "application/json", "UTF-8");
    }

    private ResponseWrapper handlerResponse(ytf ytfVar, SecurityKey securityKey) {
        String strS;
        cuf body = ytfVar.getBody();
        if (body == null) {
            return ResponseWrapper.create(10095221, "responseBody is null", ytfVar);
        }
        int code = ytfVar.getCode();
        if (!ytfVar.b()) {
            return ResponseWrapper.create(10095220, "response code is " + code, ytfVar);
        }
        if (code != 222) {
            try {
                strS = body.s();
            } catch (IOException e2) {
                UCLogUtil.e(TAG, "responseBody.string error = " + e2.getMessage());
                strS = null;
            }
            String strDecrypt = SecurityKey.decrypt(securityKey, strS);
            if (strDecrypt == null) {
                return ResponseWrapper.create(10095224, "decrypt is null", ytfVar);
            }
            String strA = ytfVar.getHeaders().a(Header.HEADER_X_SESSION_TICKET);
            securityKey.setSecurityTicket(strA != null ? strA : "");
            return ResponseWrapper.create(10095219, "decrypt is success", ytfVar.x().b(cuf.o(body.getK(), strDecrypt)).c());
        }
        String strA2 = ytfVar.getHeaders().a("X-Signature");
        if (strA2 == null || "".equals(strA2)) {
            return ResponseWrapper.create(10095222, "signature is null", ytfVar);
        }
        boolean z = true;
        boolean z2 = !StringUtil.isEmpty(securityKey.mHeaderSignatureV1);
        boolean z3 = !StringUtil.isEmpty(securityKey.mHeaderSignatureV2);
        if (z2 && z3) {
            String strMd5Hex = MD5Util.md5Hex(securityKey.mHeaderSignatureV1);
            String strMd5Hex2 = MD5Util.md5Hex(securityKey.mHeaderSignatureV2);
            String str = RsaCoder.Key;
            if (!RsaCoder.doCheck(strMd5Hex, strA2, str) && !RsaCoder.doCheck(strMd5Hex2, strA2, str)) {
                z = false;
            }
            if (!z) {
                return ResponseWrapper.create(10095223, "v1 v2 decryptResponse code is signature is" + strA2, ytfVar);
            }
        } else if (z2 && !RsaCoder.doCheck(MD5Util.md5Hex(securityKey.mHeaderSignatureV1), strA2, RsaCoder.Key)) {
            return ResponseWrapper.create(10095223, "v1 decryptResponse code is signature is" + strA2, ytfVar);
        }
        return ResponseWrapper.create(code, "response decrypt downgrade", ytfVar);
    }

    private Request plainTextRequest(@NonNull Request request) {
        this.mSecurityKey = null;
        return request.n().addHeader(HeaderConstant.HEAD_K_ACCEPT, "application/json").addHeader(UCHeaderHelperV2.X_PROTOCOL_VERSION, HEADER_PROTOCOL_VERSION).build();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x007c A[PHI: r5
  0x007c: PHI (r5v1 java.lang.String) = (r5v0 java.lang.String), (r5v3 java.lang.String) binds: [B:22:0x0065, B:24:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.oplus.aiunit.vision.jea
    @NonNull
    public ytf intercept(jea.a aVar) throws IOException {
        String guid;
        Request request = aVar.request();
        gqf body = request.getBody();
        String str = "SecurityRequestInterceptor:" + request.getUrl().d();
        if (body == null) {
            UCLogUtil.w(str, "srcBody is null");
            return aVar.c(request);
        }
        String strBodyToString = bodyToString(body);
        if (strBodyToString == null) {
            UCLogUtil.w(str, "body to str is null");
            return aVar.c(request);
        }
        WeakReference<INetConfigProvider> weakReference = NetworkModule.Builder.configProvider;
        String imei = null;
        Object[] objArr = 0;
        if (weakReference != null && weakReference.get() != null) {
            INetConfigProvider iNetConfigProvider = weakReference.get();
            if ((iNetConfigProvider.isDebug() && !iNetConfigProvider.isEncryption()) != false) {
                IBizHeaderManager iBizHeaderManager = this.mBizHeaderManager;
                if (iBizHeaderManager != null) {
                    imei = iBizHeaderManager.getImei(BaseApp.mContext);
                    HeaderOpenIdBean headerOpenId = this.mBizHeaderManager.getHeaderOpenId(BaseApp.mContext);
                    if (headerOpenId != null) {
                        guid = headerOpenId.getGuid();
                    } else {
                        guid = "";
                    }
                } else {
                    guid = "";
                }
                Request.Builder builderHeader = request.n().header(HeaderConstant.HEAD_K_ACCEPT, "application/json").header(HeaderConstant.HEADER_X_PROTOCOL_VERSION, HEADER_PROTOCOL_VERSION);
                if (guid == null) {
                    guid = "";
                }
                return aVar.c(builderHeader.header("X-Client-GUID", guid).header("imei", imei != null ? imei : "").post(gqf.create(MediaType.parse(formatContentType(false)), strBodyToString)).build());
            }
        }
        SecurityKey securityKey = this.mSecurityKey;
        if (securityKey == null) {
            securityKey = new SecurityKey();
            this.mSecurityKey = securityKey;
        }
        RequestWrapper requestWrapperBuildRequest = buildRequest(request, securityKey, strBodyToString);
        if (requestWrapperBuildRequest.code != 11095219) {
            UCLogUtil.w(str, requestWrapperBuildRequest.message);
            return aVar.c(requestWrapperBuildRequest.request);
        }
        ResponseWrapper responseWrapperHandlerResponse = handlerResponse(aVar.c(requestWrapperBuildRequest.request), securityKey);
        for (int i = 1; i <= 2; i++) {
            int i2 = responseWrapperHandlerResponse.code;
            if (i2 == 10095219 || i2 == 10095220) {
                return responseWrapperHandlerResponse.response;
            }
            if (i2 == 10095221 || i2 == 10095222 || i2 == 10095223) {
                UCLogUtil.w(str, responseWrapperHandlerResponse.message);
                this.mSecurityKey = null;
                return responseWrapperHandlerResponse.response;
            }
            if (i2 == 10095224 || i2 == 222) {
                responseWrapperHandlerResponse.response.close();
                if (i == 2) {
                    break;
                }
                UCLogUtil.w(str, "start second request = " + responseWrapperHandlerResponse.message);
                responseWrapperHandlerResponse = handlerResponse(aVar.c(requestWrapperBuildRequest.request), securityKey);
            }
        }
        UCLogUtil.w(str, "second request fail, retry request to plant text");
        return aVar.c(plainTextRequest(request));
    }
}
