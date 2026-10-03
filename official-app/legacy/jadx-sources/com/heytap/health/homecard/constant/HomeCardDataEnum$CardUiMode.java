package com.heytap.health.homecard.constant;

import com.google.gson.annotations.SerializedName;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'NOT_VALID_DATA' uses external variables
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
public final class HomeCardDataEnum$CardUiMode {
    private static final /* synthetic */ HomeCardDataEnum$CardUiMode[] $VALUES;

    @SerializedName("HALF_LINE2")
    public static final HomeCardDataEnum$CardUiMode CARD_HALF_LINE_FOLLOWED;

    @SerializedName("HALF_LINE1")
    public static final HomeCardDataEnum$CardUiMode CARD_HALF_LINE_NOT_FOLLOWED;

    @SerializedName("ONE_LINE")
    public static final HomeCardDataEnum$CardUiMode CARD_ONE_LINE_FOLLOWED;

    @SerializedName("CARD_ONE_LINE_NOT_FOLLOWED")
    public static final HomeCardDataEnum$CardUiMode CARD_ONE_LINE_NOT_FOLLOWED;

    @SerializedName("NOT_VALID_DATA")
    public static final HomeCardDataEnum$CardUiMode NOT_VALID_DATA;

    @SerializedName("TEXT_ONE_LINE")
    public static final HomeCardDataEnum$CardUiMode TEXT_ONE_LINE;
    public boolean draggable;
    public boolean followed;
    public HomeCardDataEnum$SpanNum span;

    private static /* synthetic */ HomeCardDataEnum$CardUiMode[] $values() {
        return new HomeCardDataEnum$CardUiMode[]{NOT_VALID_DATA, TEXT_ONE_LINE, CARD_ONE_LINE_NOT_FOLLOWED, CARD_HALF_LINE_NOT_FOLLOWED, CARD_ONE_LINE_FOLLOWED, CARD_HALF_LINE_FOLLOWED};
    }

    static {
        HomeCardDataEnum$SpanNum homeCardDataEnum$SpanNum = HomeCardDataEnum$SpanNum.ONE_LINE;
        NOT_VALID_DATA = new HomeCardDataEnum$CardUiMode("NOT_VALID_DATA", 0, homeCardDataEnum$SpanNum, false, false);
        TEXT_ONE_LINE = new HomeCardDataEnum$CardUiMode("TEXT_ONE_LINE", 1, homeCardDataEnum$SpanNum, false, false);
        CARD_ONE_LINE_NOT_FOLLOWED = new HomeCardDataEnum$CardUiMode("CARD_ONE_LINE_NOT_FOLLOWED", 2, homeCardDataEnum$SpanNum, false, true);
        HomeCardDataEnum$SpanNum homeCardDataEnum$SpanNum2 = HomeCardDataEnum$SpanNum.HALF_LINE;
        CARD_HALF_LINE_NOT_FOLLOWED = new HomeCardDataEnum$CardUiMode("CARD_HALF_LINE_NOT_FOLLOWED", 3, homeCardDataEnum$SpanNum2, false, true);
        CARD_ONE_LINE_FOLLOWED = new HomeCardDataEnum$CardUiMode("CARD_ONE_LINE_FOLLOWED", 4, homeCardDataEnum$SpanNum, true, true);
        CARD_HALF_LINE_FOLLOWED = new HomeCardDataEnum$CardUiMode("CARD_HALF_LINE_FOLLOWED", 5, homeCardDataEnum$SpanNum2, true, true);
        $VALUES = $values();
    }

    private HomeCardDataEnum$CardUiMode(String str, int i, HomeCardDataEnum$SpanNum homeCardDataEnum$SpanNum, boolean z, boolean z2) {
        super(str, i);
        this.span = homeCardDataEnum$SpanNum;
        this.followed = z;
        this.draggable = z2;
    }

    public static HomeCardDataEnum$CardUiMode valueOf(String str) {
        return (HomeCardDataEnum$CardUiMode) Enum.valueOf(HomeCardDataEnum$CardUiMode.class, str);
    }

    public static HomeCardDataEnum$CardUiMode[] values() {
        return (HomeCardDataEnum$CardUiMode[]) $VALUES.clone();
    }

    public int getSpan() {
        return this.span.span;
    }
}
