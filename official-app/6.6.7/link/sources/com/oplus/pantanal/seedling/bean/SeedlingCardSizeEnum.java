package com.oplus.pantanal.seedling.bean;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0014B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u000b\u001a\u00020\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0015"}, d2 = {"Lcom/oplus/pantanal/seedling/bean/SeedlingCardSizeEnum;", "", "sizeCode", "", "desc", "", "(Ljava/lang/String;IILjava/lang/String;)V", "getDesc", "()Ljava/lang/String;", "getSizeCode", "()I", "isSupportSize", "", "Unknown", "TwoXTwo", "TwoXFour", "FourXFour", "OneXTwo", "WidgetOneXOne", "NXN", "Companion", "seedling-support_manualRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public enum SeedlingCardSizeEnum {
    Unknown(-1, "未知的，无效的卡片尺寸"),
    TwoXTwo(1, "2x2"),
    TwoXFour(2, "2x4"),
    FourXFour(3, "4x4"),
    OneXTwo(5, "1x2"),
    WidgetOneXOne(6, "widget_1x1"),
    NXN(1000, "自适应尺寸");


    @NotNull
    private final String desc;
    private final int sizeCode;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/oplus/pantanal/seedling/bean/SeedlingCardSizeEnum$Companion;", "", "()V", "create", "Lcom/oplus/pantanal/seedling/bean/SeedlingCardSizeEnum;", "sizeCode", "", "seedling-support_manualRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final SeedlingCardSizeEnum create(int sizeCode) {
            SeedlingCardSizeEnum seedlingCardSizeEnum = SeedlingCardSizeEnum.TwoXTwo;
            if (sizeCode == seedlingCardSizeEnum.getSizeCode()) {
                return seedlingCardSizeEnum;
            }
            SeedlingCardSizeEnum seedlingCardSizeEnum2 = SeedlingCardSizeEnum.TwoXFour;
            if (sizeCode == seedlingCardSizeEnum2.getSizeCode()) {
                return seedlingCardSizeEnum2;
            }
            SeedlingCardSizeEnum seedlingCardSizeEnum3 = SeedlingCardSizeEnum.FourXFour;
            if (sizeCode == seedlingCardSizeEnum3.getSizeCode()) {
                return seedlingCardSizeEnum3;
            }
            SeedlingCardSizeEnum seedlingCardSizeEnum4 = SeedlingCardSizeEnum.OneXTwo;
            if (sizeCode == seedlingCardSizeEnum4.getSizeCode()) {
                return seedlingCardSizeEnum4;
            }
            SeedlingCardSizeEnum seedlingCardSizeEnum5 = SeedlingCardSizeEnum.WidgetOneXOne;
            if (sizeCode == seedlingCardSizeEnum5.getSizeCode()) {
                return seedlingCardSizeEnum5;
            }
            SeedlingCardSizeEnum seedlingCardSizeEnum6 = SeedlingCardSizeEnum.NXN;
            return sizeCode == seedlingCardSizeEnum6.getSizeCode() ? seedlingCardSizeEnum6 : SeedlingCardSizeEnum.Unknown;
        }
    }

    SeedlingCardSizeEnum(int i, String str) {
        this.sizeCode = i;
        this.desc = str;
    }

    @JvmStatic
    @NotNull
    public static final SeedlingCardSizeEnum create(int i) {
        return INSTANCE.create(i);
    }

    @NotNull
    public static EnumEntries<SeedlingCardSizeEnum> getEntries() {
        return $ENTRIES;
    }

    @NotNull
    public final String getDesc() {
        return this.desc;
    }

    public final int getSizeCode() {
        return this.sizeCode;
    }

    public final boolean isSupportSize() {
        return Unknown != this;
    }
}
