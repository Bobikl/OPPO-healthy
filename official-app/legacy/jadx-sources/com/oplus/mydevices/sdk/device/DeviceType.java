package com.oplus.mydevices.sdk.device;

import androidx.annotation.Keep;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import com.oplus.mydevices.sdk.compat.DeviceInfoCompat;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'WATCH' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001b\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, d2 = {"Lcom/oplus/mydevices/sdk/device/DeviceType;", "", "typeName", "", Fields.PRODUCT_ID, "", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Integer;)V", "getProductId", "()Ljava/lang/Integer;", "setProductId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getTypeName", "()Ljava/lang/String;", "TV", "WATCH", "WRISTBAND", "HEADSET", "COMPUTER", "PAD", "CAR", "PENCIL", "PHONE", "KEYBOARD", "sdk_domesticRelease"}, k = 1, mv = {1, 4, 0})
public final class DeviceType {
    private static final /* synthetic */ DeviceType[] $VALUES;
    public static final DeviceType CAR;
    public static final DeviceType COMPUTER;
    public static final DeviceType HEADSET;
    public static final DeviceType KEYBOARD;
    public static final DeviceType PAD;
    public static final DeviceType PENCIL;
    public static final DeviceType PHONE;
    public static final DeviceType TV;
    public static final DeviceType WATCH;
    public static final DeviceType WRISTBAND;

    @Nullable
    private Integer productId;

    @NotNull
    private final String typeName;

    static {
        DeviceType deviceType = new DeviceType("TV", 0, DeviceInfoCompat.DeviceType.TV, null, 2, null);
        TV = deviceType;
        Integer num = null;
        int i = 2;
        DefaultConstructorMarker defaultConstructorMarker = null;
        DeviceType deviceType2 = new DeviceType("WATCH", 1, DeviceInfoCompat.DeviceType.WATCH, num, i, defaultConstructorMarker);
        WATCH = deviceType2;
        Integer num2 = null;
        int i2 = 2;
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        DeviceType deviceType3 = new DeviceType("WRISTBAND", 2, DeviceInfoCompat.DeviceType.WRISTBAND, num2, i2, defaultConstructorMarker2);
        WRISTBAND = deviceType3;
        DeviceType deviceType4 = new DeviceType("HEADSET", 3, DeviceInfoCompat.DeviceType.HEADSET, num, i, defaultConstructorMarker);
        HEADSET = deviceType4;
        DeviceType deviceType5 = new DeviceType("COMPUTER", 4, DeviceInfoCompat.DeviceType.COMPUTER, num2, i2, defaultConstructorMarker2);
        COMPUTER = deviceType5;
        DeviceType deviceType6 = new DeviceType("PAD", 5, DeviceInfoCompat.DeviceType.PAD, num, i, defaultConstructorMarker);
        PAD = deviceType6;
        DeviceType deviceType7 = new DeviceType("CAR", 6, "car", num2, i2, defaultConstructorMarker2);
        CAR = deviceType7;
        DeviceType deviceType8 = new DeviceType("PENCIL", 7, "pencil", num, i, defaultConstructorMarker);
        PENCIL = deviceType8;
        DeviceType deviceType9 = new DeviceType("PHONE", 8, "phone", null, 2, null);
        PHONE = deviceType9;
        DeviceType deviceType10 = new DeviceType("KEYBOARD", 9, "keyboard", null, 2, null);
        KEYBOARD = deviceType10;
        $VALUES = new DeviceType[]{deviceType, deviceType2, deviceType3, deviceType4, deviceType5, deviceType6, deviceType7, deviceType8, deviceType9, deviceType10};
    }

    private DeviceType(String str, int i, String str2, Integer num) {
        super(str, i);
        this.typeName = str2;
        this.productId = num;
    }

    public static DeviceType valueOf(String str) {
        return (DeviceType) Enum.valueOf(DeviceType.class, str);
    }

    public static DeviceType[] values() {
        return (DeviceType[]) $VALUES.clone();
    }

    @Nullable
    public final Integer getProductId() {
        return this.productId;
    }

    @NotNull
    public final String getTypeName() {
        return this.typeName;
    }

    public final void setProductId(@Nullable Integer num) {
        this.productId = num;
    }

    public /* synthetic */ DeviceType(String str, int i, String str2, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, (i2 & 2) != 0 ? null : num);
    }
}
