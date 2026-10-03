package com.heytap.health.cardiovascular.bean;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'SPORT_TIME' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001b\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, d2 = {"Lcom/heytap/health/cardiovascular/bean/TagFiledEndType;", "", "value", "", "themeColor", "", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Integer;)V", "getThemeColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getValue", "()Ljava/lang/String;", "ECG", "SPORT_TIME", "HIGH_SPORT_TIME", "SLEEP_REGULARITY", "SLEEP_TIME", "NOON_SLEEP_TIME", "SLEEP_SCORE", "SLEEP_OSA", "SLEEP_OSA_V2", "SLEEP_IN_TIME", "HRV", "cardiovascular_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TagFiledEndType {
    public static final TagFiledEndType HIGH_SPORT_TIME;
    public static final TagFiledEndType HRV;
    public static final TagFiledEndType NOON_SLEEP_TIME;
    public static final TagFiledEndType SLEEP_IN_TIME;
    public static final TagFiledEndType SLEEP_OSA;
    public static final TagFiledEndType SLEEP_OSA_V2;
    public static final TagFiledEndType SLEEP_REGULARITY;
    public static final TagFiledEndType SLEEP_SCORE;
    public static final TagFiledEndType SLEEP_TIME;
    public static final TagFiledEndType SPORT_TIME;

    @Nullable
    private final Integer themeColor;

    @NotNull
    private final String value;
    public static final TagFiledEndType ECG = new TagFiledEndType("ECG", 0, "cardiogram_30d_daily_sign", null, 2, null);
    private static final /* synthetic */ TagFiledEndType[] $VALUES = $values();

    private static final /* synthetic */ TagFiledEndType[] $values() {
        return new TagFiledEndType[]{ECG, SPORT_TIME, HIGH_SPORT_TIME, SLEEP_REGULARITY, SLEEP_TIME, NOON_SLEEP_TIME, SLEEP_SCORE, SLEEP_OSA, SLEEP_OSA_V2, SLEEP_IN_TIME, HRV};
    }

    static {
        Integer num = null;
        int i = 2;
        DefaultConstructorMarker defaultConstructorMarker = null;
        SPORT_TIME = new TagFiledEndType("SPORT_TIME", 1, "sports_duration_1w_total_value_1m_value", num, i, defaultConstructorMarker);
        Integer num2 = null;
        int i2 = 2;
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        HIGH_SPORT_TIME = new TagFiledEndType("HIGH_SPORT_TIME", 2, "sports_high_mid_intensity_1w_total_value_1m_value", num2, i2, defaultConstructorMarker2);
        SLEEP_REGULARITY = new TagFiledEndType("SLEEP_REGULARITY", 3, "sleep_regularity_1w_value_1m_value", num, i, defaultConstructorMarker);
        SLEEP_TIME = new TagFiledEndType("SLEEP_TIME", 4, "total_sleep_time_1m_daily_value", num2, i2, defaultConstructorMarker2);
        NOON_SLEEP_TIME = new TagFiledEndType("NOON_SLEEP_TIME", 5, "noonsleep_length_1m_daily_value", num, i, defaultConstructorMarker);
        SLEEP_SCORE = new TagFiledEndType("SLEEP_SCORE", 6, "sleep_score_1m_daily_value", num2, i2, defaultConstructorMarker2);
        SLEEP_OSA = new TagFiledEndType("SLEEP_OSA", 7, "osa_1m_daily_level_sign", num, i, defaultConstructorMarker);
        SLEEP_OSA_V2 = new TagFiledEndType("SLEEP_OSA_V2", 8, "sleep_apnea_1m_daily_level_sign", num2, i2, defaultConstructorMarker2);
        SLEEP_IN_TIME = new TagFiledEndType("SLEEP_IN_TIME", 9, "insleep_time_1m_daily_value", num, i, defaultConstructorMarker);
        HRV = new TagFiledEndType("HRV", 10, "physicalmental_1m_daily_value", num2, i2, defaultConstructorMarker2);
    }

    private TagFiledEndType(String str, int i, String str2, Integer num) {
        super(str, i);
        this.value = str2;
        this.themeColor = num;
    }

    public static TagFiledEndType valueOf(String str) {
        return (TagFiledEndType) Enum.valueOf(TagFiledEndType.class, str);
    }

    public static TagFiledEndType[] values() {
        return (TagFiledEndType[]) $VALUES.clone();
    }

    @Nullable
    public final Integer getThemeColor() {
        return this.themeColor;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    public /* synthetic */ TagFiledEndType(String str, int i, String str2, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, (i2 & 2) != 0 ? null : num);
    }
}
