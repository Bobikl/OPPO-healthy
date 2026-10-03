package com.heytap.store.base.core.util;

import android.text.TextUtils;
import com.oplus.aiunit.vision.qqk;

/* JADX INFO: loaded from: classes3.dex */
public class OSUtils {
    private static final String KEY_ANDROID_OS_VERSION = "ro.build.version.release]";
    private static final String KEY_EMUI_API_LEVEL = "ro.build.hw_emui_api_level";
    private static final String KEY_EMUI_CONFIG_HW_SYS_VERSION = "ro.confg.hw_systemversion";
    private static final String KEY_EMUI_VERSION_CODE = "ro.build.version.emui";
    private static final String KEY_FLYME_ICON_FALG = "persist.sys.use.flyme.icon";
    private static final String KEY_FLYME_ID_FALG_KEY = "ro.build.display.id";
    private static final String KEY_FLYME_ID_FALG_VALUE_KEYWORD = "Flyme";
    private static final String KEY_FLYME_PUBLISH_FALG = "ro.flyme.published";
    private static final String KEY_FLYME_SETUP_FALG = "ro.meizu.setupwizard.flyme";
    private static final String KEY_MIUI_INTERNAL_STORAGE = "ro.miui.internal.storage";
    private static final String KEY_MIUI_VERSION_CODE = "ro.miui.ui.version.code";
    private static final String KEY_MIUI_VERSION_NAME = "ro.miui.ui.version.name";
    public static final String KEY_ONEPLUS_OS_VERSION = "ro.rom.version";
    private static final String KEY_VIVO_OS_NAME = "ro.vivo.os.name";
    private static final String KEY_VIVO_OS_VERSION = "ro.vivo.os.version";
    private static final String KEY_VIVO_ROM_VERSION = "ro.vivo.rom.version";
    public static final String ONEPLUS_BRAN = "oneplus";
    private static final String REALME = "realme";
    private static final String ROM_DEFAULT = "ROM";
    private static final String ROM_VERSION = "V0.0";
    private static final String SAMSUNG = "samsung";

    /* JADX INFO: renamed from: com.heytap.store.base.core.util.OSUtils$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$heytap$store$base$core$util$OSUtils$ROM_TYPE;

        static {
            int[] iArr = new int[ROM_TYPE.values().length];
            $SwitchMap$com$heytap$store$base$core$util$OSUtils$ROM_TYPE = iArr;
            try {
                iArr[ROM_TYPE.OPPO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$heytap$store$base$core$util$OSUtils$ROM_TYPE[ROM_TYPE.ONE_PLUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$heytap$store$base$core$util$OSUtils$ROM_TYPE[ROM_TYPE.REALME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$heytap$store$base$core$util$OSUtils$ROM_TYPE[ROM_TYPE.MIUI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$heytap$store$base$core$util$OSUtils$ROM_TYPE[ROM_TYPE.EMUI.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$heytap$store$base$core$util$OSUtils$ROM_TYPE[ROM_TYPE.FLYME.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$heytap$store$base$core$util$OSUtils$ROM_TYPE[ROM_TYPE.VIVO.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$heytap$store$base$core$util$OSUtils$ROM_TYPE[ROM_TYPE.SAMSUNG.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$heytap$store$base$core$util$OSUtils$ROM_TYPE[ROM_TYPE.OTHER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public enum ROM_TYPE {
        OPPO,
        MIUI,
        FLYME,
        EMUI,
        VIVO,
        ONE_PLUS,
        REALME,
        SAMSUNG,
        OTHER
    }

    private static ROM_TYPE getRom() {
        ROM_TYPE rom_type = ROM_TYPE.OTHER;
        if ("OPPO".equals(DeviceInfoUtil.getBrand()) || !TextUtils.isEmpty(DeviceInfoUtil.getColorOsVersion())) {
            return ROM_TYPE.OPPO;
        }
        if (DeviceInfoUtil.getBrand().toLowerCase().equals("oneplus")) {
            return ROM_TYPE.ONE_PLUS;
        }
        if (DeviceInfoUtil.getBrand().toLowerCase().equals("realme")) {
            return ROM_TYPE.REALME;
        }
        if (DeviceInfoUtil.getBrand().toLowerCase().equals(SAMSUNG)) {
            return ROM_TYPE.SAMSUNG;
        }
        if (!TextUtils.isEmpty(SystemPropertyUtils.get(KEY_MIUI_VERSION_CODE, "")) || !TextUtils.isEmpty(SystemPropertyUtils.get(KEY_MIUI_VERSION_NAME, "")) || !TextUtils.isEmpty(SystemPropertyUtils.get(KEY_MIUI_INTERNAL_STORAGE, ""))) {
            return ROM_TYPE.MIUI;
        }
        if (!TextUtils.isEmpty(SystemPropertyUtils.get(KEY_EMUI_API_LEVEL, "")) || !TextUtils.isEmpty(SystemPropertyUtils.get("ro.build.version.emui", "")) || !TextUtils.isEmpty(SystemPropertyUtils.get(KEY_EMUI_CONFIG_HW_SYS_VERSION, ""))) {
            return ROM_TYPE.EMUI;
        }
        if (TextUtils.isEmpty(SystemPropertyUtils.get("ro.build.display.id", ""))) {
            if (!TextUtils.isEmpty(SystemPropertyUtils.get(KEY_VIVO_OS_VERSION, "")) || !TextUtils.isEmpty(SystemPropertyUtils.get(KEY_VIVO_OS_NAME, "")) || !TextUtils.isEmpty(SystemPropertyUtils.get(KEY_VIVO_ROM_VERSION, ""))) {
                return ROM_TYPE.VIVO;
            }
        } else if (SystemPropertyUtils.get("ro.build.display.id", "").contains(KEY_FLYME_ID_FALG_VALUE_KEYWORD)) {
            return ROM_TYPE.FLYME;
        }
        return rom_type;
    }

    public static String getRomType() {
        switch (AnonymousClass1.$SwitchMap$com$heytap$store$base$core$util$OSUtils$ROM_TYPE[getRom().ordinal()]) {
            case 1:
                return "ColorOS";
            case 2:
                return "Hydrogen OS";
            case 3:
                return "ColorOS";
            case 4:
                return qqk.b.ROM_MIUI;
            case 5:
                return qqk.b.ROM_EMUI;
            case 6:
                return qqk.b.ROM_FLYME;
            case 7:
                return qqk.b.ROM_VIVO;
            case 8:
                return SAMSUNG;
            default:
                return ROM_DEFAULT;
        }
    }

    public static String getRomVersion() {
        switch (AnonymousClass1.$SwitchMap$com$heytap$store$base$core$util$OSUtils$ROM_TYPE[getRom().ordinal()]) {
            case 1:
                return DeviceInfoUtil.getColorOsVersion();
            case 2:
                return DeviceInfoUtil.getProperty(KEY_ONEPLUS_OS_VERSION, "");
            case 3:
                return "ColorOS " + DeviceInfoUtil.getColorOsVersion();
            case 4:
                return DeviceInfoUtil.getProperty(KEY_MIUI_VERSION_NAME, "");
            case 5:
                return DeviceInfoUtil.getProperty("ro.build.version.emui", "");
            case 6:
                return DeviceInfoUtil.getProperty("ro.build.display.id", "");
            case 7:
                return DeviceInfoUtil.getProperty(KEY_VIVO_OS_VERSION, "");
            case 8:
                return DeviceInfoUtil.getProperty(KEY_ANDROID_OS_VERSION, "");
            default:
                return ROM_VERSION;
        }
    }
}
