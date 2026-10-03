package com.oplus.pantaconnect.sdk;

import com.heytap.speech.engine.constant.EngineConstant;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u000f\u001a\u00020\u0001*\u00020\u0010H\u0000\u001a\f\u0010\u0011\u001a\u00020\u0010*\u00020\u0001H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"MAJOR_CLASS_ALL", "", "MAJOR_CLASS_APPLE_WATCH", "MAJOR_CLASS_BRACELET", "MAJOR_CLASS_COMPUTER", "MAJOR_CLASS_IMAC", "MAJOR_CLASS_IPHONE", "MAJOR_CLASS_MACBOOK", "MAJOR_CLASS_MOBILE_PHONE", "MAJOR_CLASS_NECK_MOUNTED_HEADPHONES", "MAJOR_CLASS_PAD", "MAJOR_CLASS_SMART_TV", "MAJOR_CLASS_SMART_WATCH", "MAJOR_CLASS_TWS_HEADPHONES", "MAJOR_CLASS_UNKNOWN", EngineConstant.WAKEUP_TYPE_MAJOR, "Lcom/oplus/pantaconnect/sdk/DeviceType;", "toDeviceType", "core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class DeviceTypeKt {
    private static final int MAJOR_CLASS_ALL = 0;
    private static final int MAJOR_CLASS_APPLE_WATCH = 14;
    private static final int MAJOR_CLASS_BRACELET = 7;
    private static final int MAJOR_CLASS_COMPUTER = 6;
    private static final int MAJOR_CLASS_IMAC = 12;
    private static final int MAJOR_CLASS_IPHONE = 13;
    private static final int MAJOR_CLASS_MACBOOK = 11;
    private static final int MAJOR_CLASS_MOBILE_PHONE = 8;
    private static final int MAJOR_CLASS_NECK_MOUNTED_HEADPHONES = 4;
    private static final int MAJOR_CLASS_PAD = 10;
    private static final int MAJOR_CLASS_SMART_TV = 5;
    private static final int MAJOR_CLASS_SMART_WATCH = 1;
    private static final int MAJOR_CLASS_TWS_HEADPHONES = 3;
    private static final int MAJOR_CLASS_UNKNOWN = -82;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DeviceType.values().length];
            try {
                iArr[DeviceType.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DeviceType.SMART_WATCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DeviceType.TWS_HEADPHONES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DeviceType.NECK_MOUNTED_HEADPHONES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DeviceType.TV.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DeviceType.PC.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[DeviceType.BRACELET.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[DeviceType.PHONE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[DeviceType.PAD.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[DeviceType.MACBOOK.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[DeviceType.IMAC.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[DeviceType.IPHONE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[DeviceType.APPLE_WATCH.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[DeviceType.UNSPECIFIED.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final int major(@NotNull DeviceType deviceType) {
        switch (WhenMappings.$EnumSwitchMapping$0[deviceType.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return MAJOR_CLASS_UNKNOWN;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @NotNull
    public static final DeviceType toDeviceType(int i) {
        switch (i) {
            case 0:
                return DeviceType.ALL;
            case 1:
                return DeviceType.SMART_WATCH;
            case 2:
            case 9:
            default:
                return DeviceType.UNSPECIFIED;
            case 3:
                return DeviceType.TWS_HEADPHONES;
            case 4:
                return DeviceType.NECK_MOUNTED_HEADPHONES;
            case 5:
                return DeviceType.TV;
            case 6:
                return DeviceType.PC;
            case 7:
                return DeviceType.BRACELET;
            case 8:
                return DeviceType.PHONE;
            case 10:
                return DeviceType.PAD;
            case 11:
                return DeviceType.MACBOOK;
            case 12:
                return DeviceType.IMAC;
            case 13:
                return DeviceType.IPHONE;
            case 14:
                return DeviceType.APPLE_WATCH;
        }
    }
}
