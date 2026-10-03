package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.esim.bean.TrustSupportBean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmField;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b8\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b=\u0010>J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J \u0010\n\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007R\u0014\u0010\u000b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000eR\u0014\u0010\u0014\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u000eR\u0014\u0010\u0015\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u000eR\u0014\u0010\u0016\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u000eR\u0014\u0010\u0017\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u000eR\u0014\u0010\u0018\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u000eR\u0014\u0010\u0019\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u000eR\u0014\u0010\u001a\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u000eR\u0014\u0010\u001b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u000eR\u0014\u0010\u001c\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u000eR\u0014\u0010\u001d\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u000eR\u0014\u0010\u001e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u000eR\u0014\u0010\u001f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u000eR\u0014\u0010 \u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b \u0010\u000eR\u0014\u0010!\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u000eR\u0014\u0010\"\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u000eR\u0014\u0010#\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b#\u0010\u000eR\u0014\u0010$\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\u000eR\u0014\u0010%\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010\u000eR\u0014\u0010&\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\u000eR\u0014\u0010'\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010\u000eR\u0014\u0010(\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010\u000eR\u0014\u0010)\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b)\u0010\u000eR\u0014\u0010*\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b*\u0010\u000eR\u0014\u0010+\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b+\u0010\u000eR\u0014\u0010,\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b,\u0010\fR\u0014\u0010-\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b-\u0010\fR\u0014\u0010.\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b.\u0010\fR\u0014\u0010/\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b/\u0010\fR\u0014\u00100\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b0\u0010\fR\u0014\u00101\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b1\u0010\fR\u0014\u00102\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b2\u0010\fR\u0014\u00103\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b3\u0010\u000eR\u0014\u00104\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b4\u0010\u000eR\u0014\u00105\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b5\u0010\u000eR\u0014\u00106\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b6\u0010\u000eR\u0014\u00107\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b7\u0010\u000eR\u0014\u00108\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b8\u0010\u000eR\u0014\u00109\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b9\u0010\u000eR\u0014\u0010:\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b:\u0010\u000eR\u0014\u0010;\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b;\u0010\u000eR\u0014\u0010<\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b<\u0010\u000e¨\u0006?"}, d2 = {"Lcom/oplus/aiunit/vision/gra;", "", "Lcom/heytap/health/esim/bean/TrustSupportBean;", "trustBean", "", "a", "operatorName", "", "openType", "terminalType", "b", "SERVICE_ID", "I", "ACTIVATE_CODE", "Ljava/lang/String;", "FINISH_TAG", "LPA_PACKAGENAME_OF_HEALTH", "LPA_PACKAGENAME_OF_MSP", "LPA_PACKAGENAME_OF_CMCC_V5", "LPA_SHA1_OF_CMCC_V5", "LPA_PACKAGENAME_OF_CMCC_MOBILE_APP", "LPA_SHA1_OF_CMCC_MOBILE", "LPA_PACKAGENAME_OF_UNICOM", "LPA_SHA1_OF_UNICOM", "LPA_PACKAGENAME_OF_CTCC", "LPA_SHA1_OF_CTCC", "URI_CMCC_INDEPENDENCE_NUMBER", "OPERATOR_NAME_CMCC", "OPERATOR_NAME_CUCC", "OPERATOR_NAME_CTCC", "OPERATOR_NAME_GYT", "ACTIVE_CODE_START_STR", "OPERATOR_H5_BASE_URL", "OPERATOR_H5_CMCC_OPEN_GUID", "OPERATOR_H5_CMCC_HEALTH_GUIDE", "OPERATOR_H5_CMCC_OPEN_GUID_FULL", "OPERATOR_H5_CMCC_OPEN_GUID_1T_APP", "OPERATOR_H5_CMCC_OPEN_GUID_1T_QRCODE", "OPERATOR_H5_CUCC_OPEN_GUID_1T_APP", "OPERATOR_H5_CUCC_OPEN_GUID_1T_STORE", "OPERATOR_H5_CUCC_OPEN_GUID_2T_APP", "OPERATOR_H5_CUCC_OPEN_GUID_2T_STORE", "OPERATOR_H5_CTCC_OPEN_GUID_1T_APP", "OPERATOR_H5_CTCC_OPEN_GUID_2T_APP", "OPERATOR_AIDL_CONNECTED", "OPERATOR_AIDL_DISCONNECTED", "OPERATOR_AIDL_REJECT", "OPERATOR_AIDL_DEVICE_DISCONNECTED", "OPERATOR_AIDL_UNSUPPORT", "LOW_BATTERY_LEVEL", "REQUEST_CODE_ACTIVITY", "DEFAULT_CUCC_ACTIVITY_CODE", "TAG_PREFIX", "SWITCH_ESIM_SUPPORT", "SWITCH_ESIM_FAQ_CMCC", "SWITCH_ESIM_FAQ_CUCC", "SWITCH_ESIM_FAQ_CTCC", "SWITCH_ESIM_AC_CODE_BLACKLIST", "WHITE_CARD_ICCID", "CMCC_API_VERSION", "CU_API_VERSION", "<init>", "()V", "esim_impl_release"}, k = 1, mv = {1, 8, 0})
public final class gra {
    public static final int $stable = 0;

    @NotNull
    public static final String ACTIVATE_CODE = "activateCode";

    @NotNull
    public static final String ACTIVE_CODE_START_STR = "LPA:";

    @NotNull
    public static final String CMCC_API_VERSION = "107";

    @NotNull
    public static final String CU_API_VERSION = "1.0";

    @NotNull
    public static final String DEFAULT_CUCC_ACTIVITY_CODE = "1$esim.wo.com.cn$$1.3.6.1.4.1.47814.101.8";

    @NotNull
    public static final String FINISH_TAG = "finish_tag";

    @NotNull
    public static final gra INSTANCE = new gra();
    public static final int LOW_BATTERY_LEVEL = 10;

    @NotNull
    public static final String LPA_PACKAGENAME_OF_CMCC_MOBILE_APP = "com.greenpoint.android.mc10086.activity";

    @NotNull
    public static final String LPA_PACKAGENAME_OF_CMCC_V5 = "com.cmic.heduohao";

    @NotNull
    public static final String LPA_PACKAGENAME_OF_CTCC = "com.ct.client";

    @NotNull
    public static final String LPA_PACKAGENAME_OF_HEALTH = "com.heytap.health";

    @NotNull
    public static final String LPA_PACKAGENAME_OF_MSP = "com.heytap.htms";

    @NotNull
    public static final String LPA_PACKAGENAME_OF_UNICOM = "com.sinovatech.unicom.ui";

    @NotNull
    public static final String LPA_SHA1_OF_CMCC_MOBILE = "F4:AA:34:B8:95:13:F0:D0:87:CA:0E:F1:1A:32:77:46:9D:C7:49:05";

    @NotNull
    public static final String LPA_SHA1_OF_CMCC_V5 = "22:C9:BA:96:CA:6A:00:1E:CD:E3:35:96:A9:69:F8:37:FC:FB:CF:22";

    @NotNull
    public static final String LPA_SHA1_OF_CTCC = "74:D3:1D:37:9E:B8:0E:1D:8A:7E:C0:43:7D:87:5E:07:D5:8F:02:F6";

    @NotNull
    public static final String LPA_SHA1_OF_UNICOM = "A4:45:54:9E:3F:55:09:87:D5:3B:66:0D:8B:8F:B7:01:C9:4A:E9:BD";
    public static final int OPERATOR_AIDL_CONNECTED = 1;
    public static final int OPERATOR_AIDL_DEVICE_DISCONNECTED = -2;
    public static final int OPERATOR_AIDL_DISCONNECTED = 0;
    public static final int OPERATOR_AIDL_REJECT = -1;
    public static final int OPERATOR_AIDL_UNSUPPORT = -4;

    @JvmField
    @NotNull
    public static final String OPERATOR_H5_BASE_URL;

    @NotNull
    public static final String OPERATOR_H5_CMCC_HEALTH_GUIDE = "esim-guide/index.html?page=VideoGuide&telecom=yidong&type=yihaoshuang&way=heytaphealth";

    @NotNull
    public static final String OPERATOR_H5_CMCC_OPEN_GUID = "esim-guide/index.html?page=VideoGuide&telecom=heduohao&type=yihaoshuang&way=app";

    @NotNull
    public static final String OPERATOR_H5_CMCC_OPEN_GUID_1T_APP = "esim-guide/index.html?page=VideoGuide&telecom=yidong&type=dulihao&way=app";

    @NotNull
    public static final String OPERATOR_H5_CMCC_OPEN_GUID_1T_QRCODE = "esim-guide/index.html?page=VideoGuide&telecom=yidong&type=dulihao&way=saoma";

    @JvmField
    @NotNull
    public static final String OPERATOR_H5_CMCC_OPEN_GUID_FULL;

    @NotNull
    public static final String OPERATOR_H5_CTCC_OPEN_GUID_1T_APP = "esim-guide/index.html?page=VideoGuide&telecom=dianxin&type=dulihao&way=app";

    @NotNull
    public static final String OPERATOR_H5_CTCC_OPEN_GUID_2T_APP = "esim-guide/index.html?page=VideoGuide&telecom=dianxin&type=yihaoshuang&way=app";

    @NotNull
    public static final String OPERATOR_H5_CUCC_OPEN_GUID_1T_APP = "esim-guide/index.html?page=VideoGuide&telecom=liantong&type=dulihao&way=app";

    @NotNull
    public static final String OPERATOR_H5_CUCC_OPEN_GUID_1T_STORE = "esim-guide/index.html?page=VideoGuide&telecom=liantong&type=dulihao&way=saoma";

    @NotNull
    public static final String OPERATOR_H5_CUCC_OPEN_GUID_2T_APP = "esim-guide/index.html?page=VideoGuide&telecom=liantong&type=yihaoshuang&way=app";

    @NotNull
    public static final String OPERATOR_H5_CUCC_OPEN_GUID_2T_STORE = "esim-guide/index.html?page=VideoGuide&telecom=liantong&type=yihaoshuang&way=saoma";

    @NotNull
    public static final String OPERATOR_NAME_CMCC = "CMCC";

    @NotNull
    public static final String OPERATOR_NAME_CTCC = "CTCC";

    @NotNull
    public static final String OPERATOR_NAME_CUCC = "CUCC";

    @NotNull
    public static final String OPERATOR_NAME_GYT = "GYT";
    public static final int REQUEST_CODE_ACTIVITY = 1001;
    public static final int SERVICE_ID = 14;

    @NotNull
    public static final String SWITCH_ESIM_AC_CODE_BLACKLIST = "50";

    @NotNull
    public static final String SWITCH_ESIM_FAQ_CMCC = "28";

    @NotNull
    public static final String SWITCH_ESIM_FAQ_CTCC = "24";

    @NotNull
    public static final String SWITCH_ESIM_FAQ_CUCC = "20";

    @NotNull
    public static final String SWITCH_ESIM_SUPPORT = "19";

    @NotNull
    public static final String TAG_PREFIX = "EsimHealth.";

    @NotNull
    public static final String URI_CMCC_INDEPENDENCE_NUMBER = "com.greenpoint://android.mc10086.activity?url=https://dev.coc.10086.cn/coc/web2/watchEsim/?pageId=1572763147509739520";

    @NotNull
    public static final String WHITE_CARD_ICCID = "89001010001234567890";

    static {
        String H5_PATH = zv8.H5_PATH;
        Intrinsics.checkNotNullExpressionValue(H5_PATH, "H5_PATH");
        OPERATOR_H5_BASE_URL = H5_PATH;
        OPERATOR_H5_CMCC_OPEN_GUID_FULL = H5_PATH + OPERATOR_H5_CMCC_OPEN_GUID;
    }

    @JvmStatic
    @NotNull
    public static final String a(@NotNull TrustSupportBean trustBean) {
        Intrinsics.checkNotNullParameter(trustBean, "trustBean");
        return "heduohao://action=GoToApplyEsim#oppo#" + trustBean.getImei() + "#" + trustBean.getEid() + "#" + trustBean.getCredible();
    }

    @NotNull
    public final String b(@Nullable String operatorName, int openType, int terminalType) {
        if (Intrinsics.areEqual(OPERATOR_NAME_CMCC, operatorName)) {
            if (terminalType == 1) {
                if (openType == 6) {
                    return OPERATOR_H5_BASE_URL + OPERATOR_H5_CMCC_OPEN_GUID_1T_QRCODE;
                }
                return OPERATOR_H5_BASE_URL + OPERATOR_H5_CMCC_OPEN_GUID_1T_APP;
            }
            if (openType == 7) {
                return OPERATOR_H5_BASE_URL + OPERATOR_H5_CMCC_HEALTH_GUIDE;
            }
            return OPERATOR_H5_BASE_URL + OPERATOR_H5_CMCC_OPEN_GUID;
        }
        if (Intrinsics.areEqual(OPERATOR_NAME_CUCC, operatorName)) {
            if (terminalType != 0) {
                if (terminalType == 1) {
                    if (openType == 3) {
                        return OPERATOR_H5_BASE_URL + OPERATOR_H5_CUCC_OPEN_GUID_1T_APP;
                    }
                    if (openType == 4) {
                        return OPERATOR_H5_BASE_URL + OPERATOR_H5_CUCC_OPEN_GUID_1T_STORE;
                    }
                }
            } else {
                if (openType == 3) {
                    return OPERATOR_H5_BASE_URL + OPERATOR_H5_CUCC_OPEN_GUID_2T_APP;
                }
                if (openType == 4) {
                    return OPERATOR_H5_BASE_URL + OPERATOR_H5_CUCC_OPEN_GUID_2T_STORE;
                }
            }
        } else if (Intrinsics.areEqual(OPERATOR_NAME_CTCC, operatorName)) {
            if (terminalType == 0) {
                return OPERATOR_H5_BASE_URL + OPERATOR_H5_CTCC_OPEN_GUID_2T_APP;
            }
            if (terminalType == 1) {
                return OPERATOR_H5_BASE_URL + OPERATOR_H5_CTCC_OPEN_GUID_1T_APP;
            }
        }
        return "";
    }
}
