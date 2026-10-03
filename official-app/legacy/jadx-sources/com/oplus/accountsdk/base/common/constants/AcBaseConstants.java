package com.oplus.accountsdk.base.common.constants;

import android.os.Build;
import androidx.annotation.Keep;
import com.heytap.usercenter.accountsdk.helper.AccountHelper;
import com.oplus.aiunit.vision.ml;
import com.oplus.aiunit.vision.pb;

/* JADX INFO: loaded from: classes6.dex */
@Keep
public class AcBaseConstants {
    public static final long TIMEOUT_REQ = 10000;

    public enum RequestApiType {
        AC_LOGIN("login"),
        AC_GET_ACCOUNT_TOKEN("getAccountToken"),
        AC_GET_ACCOUNT_INFO("getAccountInfo"),
        AC_REFRESH("refresh"),
        AC_GET_V1_TOKEN("getV1Token"),
        AC_BACKUP_REQ_EYPID("requestEncryptSsoid"),
        AC_BACKUP_SILENT_LOGIN("silentlyLogin");

        public final String apiName;

        RequestApiType(String str) {
            this.apiName = str;
        }
    }

    public static class a {
        public static final String HEADER_APP_AC_PACKAGE = "X-App-AcPackage";
        public static final String HEADER_APP_AC_VERSION = "X-App-AcVersion";
        public static final String HEADER_APP_OVERSEA_CLIENT = "X-App-OverseaClient";
        public static final String HEADER_APP_TRACE_ID = "X-App-TraceId";
        public static final String HEADER_BIZ_PACKAGE = "X-Biz-Package";
        public static final String HEADER_BIZ_TRACE_ID = "X-Biz-TraceId";
        public static final String HEADER_BIZ_VERSION = "X-Biz-Version";
        public static final String HEADER_BIZ_VERSION_CODE = "X-Biz-Version-Code";
        public static final String HEADER_FROM_SOURCE = "X-From-Source";
        public static final String HEADER_X_AC_PRIMARY_TOKEN = "X-AcPrimaryToken";
        public static final String HEADER_X_AC_REFRESH_TICKET = "X-AcRefreshTicket";
        public static final String HEADER_X_AC_REFRESH_TOKEN = "X-AcRefreshToken";
        public static final String HEADER_X_CONTEXT_COUNTRY = "X-Context-Country";
        public static final String HEADER_X_CONTEXT_MASK_REGION = "X-Context-MaskRegion";
        public static final String HEADER_X_DEVICE_BRAND = "X-Device-Brand";
        public static final String HEADER_X_TOKEN = "X-Token";
        public static final String ID_SDK_TYPE_VALUE = "ID_SDK";
        public static final String OPEN_SDK_TYPE_VALUE = "OPEN_SDK";
        public static final String X_SDK_DEVICE_ID = "X-App-DeviceId";
        public static final String X_SDK_TYPE = "X-SDK-TYPE";
        public static final String X_SDK_VERSION = "X-SDK-VERSION";
        public static final String X_SYS_DUID = "X-Sys-DUID";
        public static final String HEADER_BIZ_APPK = ml.a("P%Jar%IxxCmq");
        public static final String HEADER_BIZ_APPI = ml.a("P%Jar%IxxAl");
    }

    public static final class b {
        public static final int DEFAULT_HASH_VALUE = 0;
        public static final String DEFAULT_HASH_VALUE_STR = "0";
        public static String SETTINGS_HASH_FILE = "ac_settings_hash_file";
        public static String SETTINGS_INFO_HASH_MOCK_FILE = "ac_settings_info_hash_mock_file";
        public static String SETTINGS_INFO_HASH_VALUE = "ac_settings_info_hash_value";
        public static String SETTINGS_LOGIN_STATE_VALUE = "ac_settings_login_state_value";
        public static String SETTINGS_TOKEN_HASH_MOCK_FILE = "ac_settings_token_hash_mock_file";
        public static String SETTINGS_TOKEN_HASH_VALUE = "ac_settings_token_hash_value";
    }

    public static class c {
        public static final String a = ml.b("kge&gxd}{&g{&Gxd}{J}adl", 8);
        public static final String b = ml.b("om|Gxd}{G[^MZ[AGF", 8);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f9109c = ml.a("zg&gxd}{&xaxmdafm&zmoagf");
        public static final String d = ml.a("zg&~mflgz&gxd}{&zmoagfeizc");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f9110e = ml.a("zg&gxxg&zmoagfeizc");
        public static final String PROPERTY_SYSTEM_REGION_MARK_GREEN_OLD = ml.a("zg&gxxg&in|mz{idm&zmoagf");
        public static final String SELL_MODE_FEATURE_AFTER_R = ml.a("gxd}{&{gn|\u007fizm&xe{W{mddeglm");
        public static final String SELL_MODE_FEATURE_BEFORE_R = ml.a("gxxg&{xmkaid~mz{agf&mpx&{mddeglm");
        public static final String EXP_SYSTEM_FEATURE_NAME_XOR8 = ml.a("gxxg&~mz{agf&mpx");
        public static final String PROPERTY_SYSTEM_RO_VERSION_XOR8 = ml.a("zg&gxxg&~mz{agf");
        public static final String PROPERTY_FEATURE_RED_XOR8 = ml.a("kge&gfmxd}{&egjadmx`gfm");
        public static final String BRAND_RED = ml.a("gfmxd}{");
        public static final String PKGNAME_OP_XOR_8 = ml.a(AccountHelper.OP_ACCOUNT_PACKAGE_NAME_XOR8);

        public static String a() {
            return Build.VERSION.SDK_INT >= 30 ? a : ml.a("kge&kgdgz&g{&KgdgzJ}adl");
        }

        public static String b() {
            return Build.VERSION.SDK_INT >= 30 ? b : ml.a("om|KgdgzG[^MZ[AGF");
        }

        public static String c() {
            if (pb.a() >= 24) {
                return f9109c;
            }
            return Build.VERSION.SDK_INT >= 30 ? d : f9110e;
        }
    }
}
