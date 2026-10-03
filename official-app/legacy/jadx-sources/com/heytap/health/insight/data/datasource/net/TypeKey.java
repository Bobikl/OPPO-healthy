package com.heytap.health.insight.data.datasource.net;

import com.heytap.log.consts.LogSenderConst;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'SIGNS_FEVER_UNBASE' uses external variables
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
/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b-\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0081\u0001\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b¢\u0006\u0002\u0010\u0013R\u0011\u0010\u000e\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0010\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0011\u0010\u000f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0011\u0010\r\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u0011\u0010\u0011\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0015R\u0011\u0010\u0012\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001aR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001aj\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4¨\u00065"}, d2 = {"Lcom/heytap/health/insight/data/datasource/net/TypeKey;", "", "type", "", LogSenderConst.SUBTYPE, "element1Type", "element2Type", "element1Key", "", "element2Key", "element1BaseKey", "element2BaseKey", "element1BaseUp", "element2BaseUp", "element1BaseDown", "element2BaseDown", "element1YDesc", "element2YDesc", "extraData", "(Ljava/lang/String;IIIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getElement1BaseDown", "()Ljava/lang/String;", "getElement1BaseKey", "getElement1BaseUp", "getElement1Key", "getElement1Type", "()I", "getElement1YDesc", "getElement2BaseDown", "getElement2BaseKey", "getElement2BaseUp", "getElement2Key", "getElement2Type", "getElement2YDesc", "getExtraData", "getSubType", "getType", "SIGNS_FEVER_UNBASE", "SIGNS_FEVER_START", "SIGNS_FEVER_INCREMENT", "SIGNS_FEVER_DECREMENT", "SIGNS_FEVER_END", "SIGNS_FEVER_HEALTH", "SIGNS_INSLEEP_HR", "CROSS_INSLEEP_SCORE", "CROSS_STEP_SCORE", "CROSS_STEP_DEEP_RATE", "CROSS_STEP_WAKE_DURATION", "CROSS_STEP_WAKE_TIMES", "CROSS_SPORTS_SCORE", "CROSS_SPORTS_DEEP_RATE", "SIGNS_SLEEP_HR_WARN", "CROSS_SLEEP_HR_WARN_MORE", "health_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TypeKey {
    private static final /* synthetic */ TypeKey[] $VALUES;
    public static final TypeKey CROSS_INSLEEP_SCORE;
    public static final TypeKey CROSS_SLEEP_HR_WARN_MORE;
    public static final TypeKey CROSS_SPORTS_DEEP_RATE;
    public static final TypeKey CROSS_SPORTS_SCORE;
    public static final TypeKey CROSS_STEP_DEEP_RATE;
    public static final TypeKey CROSS_STEP_SCORE;
    public static final TypeKey CROSS_STEP_WAKE_DURATION;
    public static final TypeKey CROSS_STEP_WAKE_TIMES;
    public static final TypeKey SIGNS_FEVER_DECREMENT;
    public static final TypeKey SIGNS_FEVER_END;
    public static final TypeKey SIGNS_FEVER_HEALTH;
    public static final TypeKey SIGNS_FEVER_INCREMENT;
    public static final TypeKey SIGNS_FEVER_START;
    public static final TypeKey SIGNS_FEVER_UNBASE;
    public static final TypeKey SIGNS_INSLEEP_HR;
    public static final TypeKey SIGNS_SLEEP_HR_WARN;

    @NotNull
    private final String element1BaseDown;

    @NotNull
    private final String element1BaseKey;

    @NotNull
    private final String element1BaseUp;

    @NotNull
    private final String element1Key;
    private final int element1Type;

    @NotNull
    private final String element1YDesc;

    @NotNull
    private final String element2BaseDown;

    @NotNull
    private final String element2BaseKey;

    @NotNull
    private final String element2BaseUp;

    @NotNull
    private final String element2Key;
    private final int element2Type;

    @NotNull
    private final String element2YDesc;

    @NotNull
    private final String extraData;
    private final int subType;
    private final int type;

    private static final /* synthetic */ TypeKey[] $values() {
        return new TypeKey[]{SIGNS_FEVER_UNBASE, SIGNS_FEVER_START, SIGNS_FEVER_INCREMENT, SIGNS_FEVER_DECREMENT, SIGNS_FEVER_END, SIGNS_FEVER_HEALTH, SIGNS_INSLEEP_HR, CROSS_INSLEEP_SCORE, CROSS_STEP_SCORE, CROSS_STEP_DEEP_RATE, CROSS_STEP_WAKE_DURATION, CROSS_STEP_WAKE_TIMES, CROSS_SPORTS_SCORE, CROSS_SPORTS_DEEP_RATE, SIGNS_SLEEP_HR_WARN, CROSS_SLEEP_HR_WARN_MORE};
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        SignsNetType signsNetType = SignsNetType.FEVER;
        DataType dataType = DataType.SLEEP_HR;
        int type = dataType.getType();
        DataType dataType2 = DataType.WRIST_TEMPER;
        int type2 = dataType2.getType();
        InsightNetConstant insightNetConstant = InsightNetConstant.SIGNS_SLEEP_HR;
        String key = insightNetConstant.getKey();
        InsightNetConstant insightNetConstant2 = InsightNetConstant.SIGNS_WRIST_TEMPER;
        String key2 = insightNetConstant2.getKey();
        InsightNetConstant insightNetConstant3 = InsightNetConstant.SIGNS_SLEEP_HR_BASE;
        String key3 = insightNetConstant3.getKey();
        InsightNetConstant insightNetConstant4 = InsightNetConstant.SIGNS_WRIST_TEMPER_BASE;
        String key4 = insightNetConstant4.getKey();
        InsightNetConstant insightNetConstant5 = InsightNetConstant.SIGNS_SLEEP_HR_SAFE_UP;
        String key5 = insightNetConstant5.getKey();
        InsightNetConstant insightNetConstant6 = InsightNetConstant.SIGNS_WRIST_TEMPER_SAFE_UP;
        InsightNetConstant insightNetConstant7 = InsightNetConstant.SIGNS_SLEEP_HR_Y_DESC;
        String key6 = insightNetConstant7.getKey();
        InsightNetConstant insightNetConstant8 = InsightNetConstant.SIGNS_WRIST_TEMPER_Y_DESC;
        SIGNS_FEVER_UNBASE = new TypeKey("SIGNS_FEVER_UNBASE", 0, signsNetType.getType(), 0, type, type2, key, key2, key3, key4, key5, insightNetConstant6.getKey(), "", "", key6, insightNetConstant8.getKey(), null, 16384, null);
        String str = null;
        int i = 16384;
        DefaultConstructorMarker defaultConstructorMarker = null;
        SIGNS_FEVER_START = new TypeKey("SIGNS_FEVER_START", 1, signsNetType.getType(), 1, dataType.getType(), dataType2.getType(), insightNetConstant.getKey(), insightNetConstant2.getKey(), insightNetConstant3.getKey(), insightNetConstant4.getKey(), insightNetConstant5.getKey(), insightNetConstant6.getKey(), "", "", insightNetConstant7.getKey(), insightNetConstant8.getKey(), str, i, defaultConstructorMarker);
        String str2 = null;
        int i2 = 16384;
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        SIGNS_FEVER_INCREMENT = new TypeKey("SIGNS_FEVER_INCREMENT", 2, signsNetType.getType(), 2, dataType.getType(), dataType2.getType(), insightNetConstant.getKey(), insightNetConstant2.getKey(), insightNetConstant3.getKey(), insightNetConstant4.getKey(), insightNetConstant5.getKey(), insightNetConstant6.getKey(), "", "", insightNetConstant7.getKey(), insightNetConstant8.getKey(), str2, i2, defaultConstructorMarker2);
        SIGNS_FEVER_DECREMENT = new TypeKey("SIGNS_FEVER_DECREMENT", 3, signsNetType.getType(), 3, dataType.getType(), dataType2.getType(), insightNetConstant.getKey(), insightNetConstant2.getKey(), insightNetConstant3.getKey(), insightNetConstant4.getKey(), insightNetConstant5.getKey(), insightNetConstant6.getKey(), "", "", insightNetConstant7.getKey(), insightNetConstant8.getKey(), str, i, defaultConstructorMarker);
        SIGNS_FEVER_END = new TypeKey("SIGNS_FEVER_END", 4, signsNetType.getType(), 4, dataType.getType(), dataType2.getType(), insightNetConstant.getKey(), insightNetConstant2.getKey(), insightNetConstant3.getKey(), insightNetConstant4.getKey(), insightNetConstant5.getKey(), insightNetConstant6.getKey(), "", "", insightNetConstant7.getKey(), insightNetConstant8.getKey(), str2, i2, defaultConstructorMarker2);
        SIGNS_FEVER_HEALTH = new TypeKey("SIGNS_FEVER_HEALTH", 5, signsNetType.getType(), 5, dataType.getType(), dataType2.getType(), insightNetConstant.getKey(), insightNetConstant2.getKey(), insightNetConstant3.getKey(), insightNetConstant4.getKey(), insightNetConstant5.getKey(), insightNetConstant6.getKey(), "", "", insightNetConstant7.getKey(), insightNetConstant8.getKey(), str, i, defaultConstructorMarker);
        SignsNetType signsNetType2 = SignsNetType.SUDDEN_STAY_UP;
        int type3 = signsNetType2.getType();
        DataType dataType3 = DataType.INSLEEP;
        int type4 = dataType3.getType();
        int type5 = dataType.getType();
        InsightNetConstant insightNetConstant9 = InsightNetConstant.CROSS_SLEEP_IN_TS;
        String key7 = insightNetConstant9.getKey();
        String key8 = insightNetConstant.getKey();
        InsightNetConstant insightNetConstant10 = InsightNetConstant.CROSS_SLEEP_IN_TS_BASE;
        SIGNS_INSLEEP_HR = new TypeKey("SIGNS_INSLEEP_HR", 6, type3, 4, type4, type5, key7, key8, insightNetConstant10.getKey(), insightNetConstant3.getKey(), "", insightNetConstant5.getKey(), "", "", "", "", "");
        int type6 = CrossNetType.INSLEEP.getType();
        int type7 = dataType3.getType();
        DataType dataType4 = DataType.SCORE;
        int type8 = dataType4.getType();
        String key9 = insightNetConstant9.getKey();
        InsightNetConstant insightNetConstant11 = InsightNetConstant.CROSS_SLEEP_SCORE;
        CROSS_INSLEEP_SCORE = new TypeKey("CROSS_INSLEEP_SCORE", 7, type6, 1, type7, type8, key9, insightNetConstant11.getKey(), insightNetConstant10.getKey(), InsightNetConstant.CROSS_SLEEP_SCORE_BASE.getKey(), "", "", "", "", InsightNetConstant.CROSS_SLEEP_IN_TS_Y_DESC.getKey(), InsightNetConstant.CROSS_SLEEP_SCORE_Y_DESC.getKey(), InsightNetConstant.CROSS_SLEEP_IN_TS_DURATION.getKey());
        CrossNetType crossNetType = CrossNetType.STEP;
        DataType dataType5 = DataType.STEP;
        int type9 = dataType5.getType();
        int type10 = dataType4.getType();
        InsightNetConstant insightNetConstant12 = InsightNetConstant.CROSS_STEPS;
        CROSS_STEP_SCORE = new TypeKey("CROSS_STEP_SCORE", 8, crossNetType.getType(), 1, type9, type10, insightNetConstant12.getKey(), insightNetConstant11.getKey(), "", "", "", "", "", "", "", "", null, 16384, null);
        int type11 = dataType5.getType();
        DataType dataType6 = DataType.DEEP_SLEEP_RATE;
        int type12 = dataType6.getType();
        String key10 = insightNetConstant12.getKey();
        InsightNetConstant insightNetConstant13 = InsightNetConstant.CROSS_DEEP_SLEEP_RATE;
        CROSS_STEP_DEEP_RATE = new TypeKey("CROSS_STEP_DEEP_RATE", 9, crossNetType.getType(), 2, type11, type12, key10, insightNetConstant13.getKey(), "", "", "", "", "", "", "", "", null, 16384, null);
        String str3 = null;
        int i3 = 16384;
        DefaultConstructorMarker defaultConstructorMarker3 = null;
        CROSS_STEP_WAKE_DURATION = new TypeKey("CROSS_STEP_WAKE_DURATION", 10, crossNetType.getType(), 3, dataType5.getType(), DataType.WAKE_DURATION.getType(), insightNetConstant12.getKey(), InsightNetConstant.CROSS_WAKE_MINUTE.getKey(), "", "", "", "", "", "", "", "", str3, i3, defaultConstructorMarker3);
        int i4 = 16384;
        DefaultConstructorMarker defaultConstructorMarker4 = null;
        CROSS_STEP_WAKE_TIMES = new TypeKey("CROSS_STEP_WAKE_TIMES", 11, crossNetType.getType(), 4, dataType5.getType(), DataType.WAKE_TIMES.getType(), insightNetConstant12.getKey(), InsightNetConstant.CROSS_WAKE_COUNT.getKey(), "", "", "", "", "", "", "", "", 0 == true ? 1 : 0, i4, defaultConstructorMarker4);
        CrossNetType crossNetType2 = CrossNetType.SPORTS;
        int type13 = crossNetType2.getType();
        int i5 = 1;
        DataType dataType7 = DataType.SPORTS_HR;
        int type14 = dataType7.getType();
        int type15 = dataType4.getType();
        InsightNetConstant insightNetConstant14 = InsightNetConstant.CROSS_SPORT_HR;
        CROSS_SPORTS_SCORE = new TypeKey("CROSS_SPORTS_SCORE", 12, type13, i5, type14, type15, insightNetConstant14.getKey(), insightNetConstant11.getKey(), "", "", "", "", "", "", "", "", str3, i3, defaultConstructorMarker3);
        int i6 = 2;
        CROSS_SPORTS_DEEP_RATE = new TypeKey("CROSS_SPORTS_DEEP_RATE", 13, crossNetType2.getType(), i6, dataType7.getType(), dataType6.getType(), insightNetConstant14.getKey(), insightNetConstant13.getKey(), "", "", "", "", "", "", "", "", 0 == true ? 1 : 0, i4, defaultConstructorMarker4);
        int type16 = signsNetType2.getType();
        int type17 = dataType.getType();
        DataType dataType8 = DataType.INVALID;
        SIGNS_SLEEP_HR_WARN = new TypeKey("SIGNS_SLEEP_HR_WARN", 14, type16, i5, type17, dataType8.getType(), insightNetConstant.getKey(), "", insightNetConstant3.getKey(), "", insightNetConstant5.getKey(), "", "", "", insightNetConstant7.getKey(), "", str3, i3, defaultConstructorMarker3);
        CROSS_SLEEP_HR_WARN_MORE = new TypeKey("CROSS_SLEEP_HR_WARN_MORE", 15, signsNetType2.getType(), i6, dataType.getType(), dataType8.getType(), insightNetConstant.getKey(), "", insightNetConstant3.getKey(), "", insightNetConstant5.getKey(), "", "", "", insightNetConstant7.getKey(), "", 0 == true ? 1 : 0, i4, defaultConstructorMarker4);
        $VALUES = $values();
    }

    private TypeKey(String str, int i, int i2, int i3, int i4, int i5, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        super(str, i);
        this.type = i2;
        this.subType = i3;
        this.element1Type = i4;
        this.element2Type = i5;
        this.element1Key = str2;
        this.element2Key = str3;
        this.element1BaseKey = str4;
        this.element2BaseKey = str5;
        this.element1BaseUp = str6;
        this.element2BaseUp = str7;
        this.element1BaseDown = str8;
        this.element2BaseDown = str9;
        this.element1YDesc = str10;
        this.element2YDesc = str11;
        this.extraData = str12;
    }

    public static TypeKey valueOf(String str) {
        return (TypeKey) Enum.valueOf(TypeKey.class, str);
    }

    public static TypeKey[] values() {
        return (TypeKey[]) $VALUES.clone();
    }

    @NotNull
    public final String getElement1BaseDown() {
        return this.element1BaseDown;
    }

    @NotNull
    public final String getElement1BaseKey() {
        return this.element1BaseKey;
    }

    @NotNull
    public final String getElement1BaseUp() {
        return this.element1BaseUp;
    }

    @NotNull
    public final String getElement1Key() {
        return this.element1Key;
    }

    public final int getElement1Type() {
        return this.element1Type;
    }

    @NotNull
    public final String getElement1YDesc() {
        return this.element1YDesc;
    }

    @NotNull
    public final String getElement2BaseDown() {
        return this.element2BaseDown;
    }

    @NotNull
    public final String getElement2BaseKey() {
        return this.element2BaseKey;
    }

    @NotNull
    public final String getElement2BaseUp() {
        return this.element2BaseUp;
    }

    @NotNull
    public final String getElement2Key() {
        return this.element2Key;
    }

    public final int getElement2Type() {
        return this.element2Type;
    }

    @NotNull
    public final String getElement2YDesc() {
        return this.element2YDesc;
    }

    @NotNull
    public final String getExtraData() {
        return this.extraData;
    }

    public final int getSubType() {
        return this.subType;
    }

    public final int getType() {
        return this.type;
    }

    public /* synthetic */ TypeKey(String str, int i, int i2, int i3, int i4, int i5, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, i2, i3, i4, i5, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, (i6 & 16384) != 0 ? "" : str12);
    }
}
