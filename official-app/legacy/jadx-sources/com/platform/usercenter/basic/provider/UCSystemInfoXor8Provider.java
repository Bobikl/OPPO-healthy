package com.platform.usercenter.basic.provider;

import com.platform.usercenter.tools.os.UCOSVersionUtil;
import com.platform.usercenter.tools.os.Version;

/* JADX INFO: loaded from: classes9.dex */
public class UCSystemInfoXor8Provider {
    private static final String CLASS_NAME_COLOR_SYS_BUILD_XOR8 = "kge&kgdgz&g{&KgdgzJ}adl";
    private static final String EXP_SYSTEM_FEATURE_NAME_XOR8 = "gxxg&~mz{agf&mpx";
    private static final String METHOD_NAME_GET_OS_VERSION_XOR8 = "om|KgdgzG[^MZ[AGF";
    private static final String PROPERTY_DOUBLESIM_PREFERENCE_XOR8 = "gxxgWlg}jdm{aeWxzmnmzmfkm";
    private static final String PROPERTY_FEATURE_RED_XOR8 = "kge&gfmxd}{&egjadmx`gfm";
    private static final String PROPERTY_HEADER_X_AAID_XOR8 = "P%GXXG%IIAL";
    private static final String PROPERTY_HEADER_X_APID_XOR8 = "P%GXXG%IXAL";
    private static final String PROPERTY_HEADER_X_COUNTRY_XOR8 = "P%GXXG%Kg}f|zq";
    private static final String PROPERTY_HEADER_X_LOCALE_XOR8 = "P%GXXG%Dgkidm";
    private static final String PROPERTY_HEADER_X_OAID_XOR8 = "P%GXXG%]LAL";
    private static final String PROPERTY_HEADER_X_OSVERSION_XOR8 = "P%GXXG%KgdgzG[^mz{agf";
    private static final String PROPERTY_HEADER_X_TIME_ZONE_XOR8 = "P%GXXG%\\aemRgfm";
    private static final String PROPERTY_HEADER_X_UDID_XOR8 = "P%GXXG%]LAL";
    private static final String PROPERTY_HEADER_X_VAID_XOR8 = "P%GXXG%^IAL";
    private static final String PROPERTY_OPLUS_SYSTEM_ROM_VERSION_XOR8 = "zg&j}adl&~mz{agf&gxd}{zge";
    private static final String PROPERTY_OS_TELEPHONY_MANAGER_XOR8 = "iflzgal&|mdmx`gfq&KgdgzG[\\mdmx`gfqEifiomz";
    private static final String PROPERTY_QUALCOMM_GEMINI_SUPPORT_XOR8 = "gxxg&y}idkgee&omeafa&{}xxgz|";
    private static final String PROPERTY_SPECIALVERSION_SELLMODE_XOR8 = "gxxg&{xmkaid~mz{agf&mpx&{mddeglm";
    private static final String PROPERTY_SYSTEM_BUILD_OTA_VERSION_XOR8 = "zg&j}adl&~mz{agf&g|i";
    private static final String PROPERTY_SYSTEM_OPLUS_REGION_XOR8 = "xmz{a{|&{q{&gxd}{&zmoagf";
    private static final String PROPERTY_SYSTEM_PRODUCT_NAME_XOR8 = "zg&xzgl}k|&fiem";
    private static final String PROPERTY_SYSTEM_REGION_MARK_GREEN_OLD_XOR8 = "zg&gxxg&in|mz{idm&zmoagf";
    private static final String PROPERTY_SYSTEM_REGION_MARK_GREEN_XOR8 = "zg&gxxg&zmoagfeizc";
    private static final String PROPERTY_SYSTEM_REGION_XOR8 = "xmz{a{|&{q{&gxxg&zmoagf";
    private static final String PROPERTY_SYSTEM_ROM_VERSION_XOR8 = "zg&j}adl&~mz{agf&gxxgzge";
    private static final String PROPERTY_SYSTEM_RO_MARKET_NAME_OPLUS_XOR8 = "zg&~mflgz&gxd}{&eizcm|&fiem";
    private static final String PROPERTY_SYSTEM_RO_MARKET_NAME_XOR8 = "zg&gxxg&eizcm|&fiem";
    private static final String PROPERTY_SYSTEM_RO_VERSION_XOR8 = "zg&gxxg&~mz{agf";
    private static final String URL_CONN1_GENERATE_204_XOR8 = "`||x{2''kgff9&kgdgzg{&kge'omfmzi|mW:8<";
    private static final String URL_CONN2_GENERATE_204_XOR8 = "`||x{2''kgff:&kgdgzg{&kge'omfmzi|mW:8<";
    private static final String CLASS_NAME_COLOR_SYS_BUILD_ON_RED = UCCommonXor8Provider.getNormalStrByDecryptXOR8("kge&gxd}{&g{&Gxd}{J}adl");
    private static final String METHOD_NAME_GET_OS_VERSION_ON_RED = UCCommonXor8Provider.getNormalStrByDecryptXOR8("om|Gxd}{G[^MZ[AGF");
    private static final String PROPERTY_SYSTEM_REGION_MARK_GREEN_RED = UCCommonXor8Provider.getNormalStrByDecryptXOR8("zg&~mflgz&gxd}{&zmoagfeizc");
    private static final String PROPERTY_SYSTEM_REGION_MARK_12_1 = UCCommonXor8Provider.getNormalStrByDecryptXOR8("zg&gxd}{&xaxmdafm&zmoagf");
    private static final String PROPERTY_OS_TELEPHONY_MANAGER_ON_RED = UCCommonXor8Provider.getNormalStrByDecryptXOR8("iflzgal&|mdmx`gfq&Gxd}{G[\\mdmx`gfqEifiomz");

    public static String buildOtaVersionSystemName() {
        return UCCommonXor8Provider.getNormalStrByDecryptXOR8(PROPERTY_SYSTEM_BUILD_OTA_VERSION_XOR8);
    }

    public static String clazzColorSysBuild() {
        return Version.hasR() ? CLASS_NAME_COLOR_SYS_BUILD_ON_RED : UCCommonXor8Provider.getNormalStrByDecryptXOR8(CLASS_NAME_COLOR_SYS_BUILD_XOR8);
    }

    public static String expPropertySystemNameXor8() {
        return UCCommonXor8Provider.getNormalStrByDecryptXOR8(PROPERTY_SYSTEM_RO_VERSION_XOR8);
    }

    public static String getExpSystemFeatureNameXor8() {
        return UCCommonXor8Provider.getNormalStrByDecryptXOR8(EXP_SYSTEM_FEATURE_NAME_XOR8);
    }

    public static String getPropertyDoublesimPreferenceXor8() {
        return UCCommonXor8Provider.getNormalStrByDecryptXOR8(PROPERTY_DOUBLESIM_PREFERENCE_XOR8);
    }

    public static String getPropertyFeatureRedXor8() {
        return UCCommonXor8Provider.getNormalStrByDecryptXOR8(PROPERTY_FEATURE_RED_XOR8);
    }

    public static String getPropertyHeaderXAaidXor8() {
        return UCCommonXor8Provider.getNormalStrByDecryptXOR8(PROPERTY_HEADER_X_AAID_XOR8);
    }

    public static String getPropertyHeaderXApidXor8() {
        return UCCommonXor8Provider.getNormalStrByDecryptXOR8(PROPERTY_HEADER_X_APID_XOR8);
    }

    public static String getPropertyHeaderXCountryXor8() {
        return UCCommonXor8Provider.getNormalStrByDecryptXOR8(PROPERTY_HEADER_X_COUNTRY_XOR8);
    }

    public static String getPropertyHeaderXLocaleXor8() {
        return UCCommonXor8Provider.getNormalStrByDecryptXOR8(PROPERTY_HEADER_X_LOCALE_XOR8);
    }

    public static String getPropertyHeaderXOaidXor8() {
        return UCCommonXor8Provider.getNormalStrByDecryptXOR8("P%GXXG%]LAL");
    }

    public static String getPropertyHeaderXOsversionXor8() {
        return UCCommonXor8Provider.getNormalStrByDecryptXOR8(PROPERTY_HEADER_X_OSVERSION_XOR8);
    }

    public static String getPropertyHeaderXTimeZoneXor8() {
        return UCCommonXor8Provider.getNormalStrByDecryptXOR8(PROPERTY_HEADER_X_TIME_ZONE_XOR8);
    }

    public static String getPropertyHeaderXUdidXor8() {
        return UCCommonXor8Provider.getNormalStrByDecryptXOR8("P%GXXG%]LAL");
    }

    public static String getPropertyHeaderXVaidXor8() {
        return UCCommonXor8Provider.getNormalStrByDecryptXOR8(PROPERTY_HEADER_X_VAID_XOR8);
    }

    public static String getPropertyOsTelephonyManagerXor8() {
        return Version.hasR() ? PROPERTY_OS_TELEPHONY_MANAGER_ON_RED : UCCommonXor8Provider.getNormalStrByDecryptXOR8(PROPERTY_OS_TELEPHONY_MANAGER_XOR8);
    }

    public static String getPropertyQualcommGeminiSupportXor8() {
        return UCCommonXor8Provider.getNormalStrByDecryptXOR8(PROPERTY_QUALCOMM_GEMINI_SUPPORT_XOR8);
    }

    public static String getPropertySpecialversionSellmodeXor8() {
        return UCCommonXor8Provider.getNormalStrByDecryptXOR8(PROPERTY_SPECIALVERSION_SELLMODE_XOR8);
    }

    public static String getUrlConn1Generate204Xor8() {
        return UCCommonXor8Provider.getNormalStrByDecryptXOR8(URL_CONN1_GENERATE_204_XOR8);
    }

    public static String getUrlConn2Generate204Xor8() {
        return UCCommonXor8Provider.getNormalStrByDecryptXOR8(URL_CONN2_GENERATE_204_XOR8);
    }

    public static String marketNameAfterOplusSystemName() {
        return UCCommonXor8Provider.getNormalStrByDecryptXOR8(PROPERTY_SYSTEM_RO_MARKET_NAME_OPLUS_XOR8);
    }

    public static String marketNameBeforOplusSystemName() {
        return UCCommonXor8Provider.getNormalStrByDecryptXOR8(PROPERTY_SYSTEM_RO_MARKET_NAME_XOR8);
    }

    public static String methodColorSysVersion() {
        return Version.hasR() ? METHOD_NAME_GET_OS_VERSION_ON_RED : UCCommonXor8Provider.getNormalStrByDecryptXOR8(METHOD_NAME_GET_OS_VERSION_XOR8);
    }

    public static String productNameSystemName() {
        return UCCommonXor8Provider.getNormalStrByDecryptXOR8(PROPERTY_SYSTEM_PRODUCT_NAME_XOR8);
    }

    public static String regionMarkGreenOldSystemName() {
        return UCCommonXor8Provider.getNormalStrByDecryptXOR8(PROPERTY_SYSTEM_REGION_MARK_GREEN_OLD_XOR8);
    }

    public static String regionMarkGreenSystemName() {
        if (UCOSVersionUtil.getOSVersionCode() >= 24) {
            return PROPERTY_SYSTEM_REGION_MARK_12_1;
        }
        return Version.hasR() ? PROPERTY_SYSTEM_REGION_MARK_GREEN_RED : UCCommonXor8Provider.getNormalStrByDecryptXOR8(PROPERTY_SYSTEM_REGION_MARK_GREEN_XOR8);
    }

    public static String regionOPlusPropertySystemName() {
        return UCCommonXor8Provider.getNormalStrByDecryptXOR8(PROPERTY_SYSTEM_OPLUS_REGION_XOR8);
    }

    public static String regionPropertySystemName() {
        return UCCommonXor8Provider.getNormalStrByDecryptXOR8(PROPERTY_SYSTEM_REGION_XOR8);
    }

    public static String romVersionPropertyOPlusSystemName() {
        return UCCommonXor8Provider.getNormalStrByDecryptXOR8(PROPERTY_OPLUS_SYSTEM_ROM_VERSION_XOR8);
    }

    public static String romVersionPropertySystemName() {
        return UCCommonXor8Provider.getNormalStrByDecryptXOR8(PROPERTY_SYSTEM_ROM_VERSION_XOR8);
    }
}
