package com.oplus.pantanal.seedling.bean;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u000b\u001a\u00020\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, d2 = {"Lcom/oplus/pantanal/seedling/bean/SeedlingSubscribeTypeEnum;", "", "typeCode", "", "desc", "", "(Ljava/lang/String;IILjava/lang/String;)V", "getDesc", "()Ljava/lang/String;", "getTypeCode", "()I", "isSupportSubscribeType", "", "Unknown", "User", "Recommend", "Companion", "seedling-support_manualRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public enum SeedlingSubscribeTypeEnum {
    Unknown(-1, "未知订阅"),
    User(1, "用户订阅"),
    Recommend(2, "智慧大脑推荐");


    @NotNull
    private final String desc;
    private final int typeCode;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/oplus/pantanal/seedling/bean/SeedlingSubscribeTypeEnum$Companion;", "", "()V", "create", "Lcom/oplus/pantanal/seedling/bean/SeedlingSubscribeTypeEnum;", "typeCode", "", "seedling-support_manualRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final SeedlingSubscribeTypeEnum create(int typeCode) {
            SeedlingSubscribeTypeEnum seedlingSubscribeTypeEnum = SeedlingSubscribeTypeEnum.User;
            if (typeCode == seedlingSubscribeTypeEnum.getTypeCode()) {
                return seedlingSubscribeTypeEnum;
            }
            SeedlingSubscribeTypeEnum seedlingSubscribeTypeEnum2 = SeedlingSubscribeTypeEnum.Recommend;
            return typeCode == seedlingSubscribeTypeEnum2.getTypeCode() ? seedlingSubscribeTypeEnum2 : SeedlingSubscribeTypeEnum.Unknown;
        }
    }

    SeedlingSubscribeTypeEnum(int i, String str) {
        this.typeCode = i;
        this.desc = str;
    }

    @JvmStatic
    @NotNull
    public static final SeedlingSubscribeTypeEnum create(int i) {
        return INSTANCE.create(i);
    }

    @NotNull
    public static EnumEntries<SeedlingSubscribeTypeEnum> getEntries() {
        return $ENTRIES;
    }

    @NotNull
    public final String getDesc() {
        return this.desc;
    }

    public final int getTypeCode() {
        return this.typeCode;
    }

    public final boolean isSupportSubscribeType() {
        return Unknown != this;
    }
}
