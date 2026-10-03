package com.oplus.pantanal.seedling.bean;

import com.oplus.pantanal.seedling.convertor.ConvertorFactory;
import com.oplus.pantanal.seedling.convertor.JsonToSeedlingCardOptionsConvertor;
import com.oplus.pantanal.seedling.convertor.WidgetCodeToSeedlingCardConvertor;
import com.oplus.pantanal.seedling.util.ExtsKt;
import com.oplus.pantanal.seedling.util.UtilsKt;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u0000 P2\u00020\u0001:\u0001PBY\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003¢\u0006\u0002\u0010\u0012J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0005HÆ\u0003J\t\u00109\u001a\u00020\u0005HÆ\u0003J\u000e\u0010:\u001a\u00020\u0005HÀ\u0003¢\u0006\u0002\b;J\t\u0010<\u001a\u00020\tHÆ\u0003J\t\u0010=\u001a\u00020\u000bHÆ\u0003J\t\u0010>\u001a\u00020\rHÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0010HÆ\u0003Jm\u0010A\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0003HÆ\u0001J\u0013\u0010B\u001a\u00020C2\b\u0010D\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u0017\u0010E\u001a\u00020\u00032\b\b\u0002\u0010F\u001a\u00020CH\u0000¢\u0006\u0002\b\u0017J\u0017\u0010G\u001a\u00020\u00032\b\b\u0002\u0010F\u001a\u00020CH\u0000¢\u0006\u0002\bHJ\u0006\u0010I\u001a\u00020\u0003J\b\u0010J\u001a\u00020\u0005H\u0016J\r\u0010K\u001a\u00020LH\u0000¢\u0006\u0002\bMJ\t\u0010N\u001a\u00020\u0003HÖ\u0001J$\u0010O\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u001a\u0010\u0016\u001a\u00020\u0003X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u0003X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR\u001a\u0010\u001e\u001a\u00020\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0014\u0010\u0007\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0014R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0018R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0018R\u001a\u0010\u0011\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0018\"\u0004\b*\u0010\u001aR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u001a\u0010/\u001a\u00020\u0003X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0018\"\u0004\b1\u0010\u001aR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0011\u00104\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\u0018¨\u0006Q"}, d2 = {"Lcom/oplus/pantanal/seedling/bean/SeedlingCard;", "", "serviceId", "", "cardId", "", "cardIndex", "hostId", "host", "Lcom/oplus/pantanal/seedling/bean/SeedlingHostEnum;", "subscribeType", "Lcom/oplus/pantanal/seedling/bean/SeedlingSubscribeTypeEnum;", "size", "Lcom/oplus/pantanal/seedling/bean/SeedlingCardSizeEnum;", JsonToSeedlingCardOptionsConvertor.KEY_PAGE_ID, "upkVersionCode", "", "serviceInstanceId", "(Ljava/lang/String;IIILcom/oplus/pantanal/seedling/bean/SeedlingHostEnum;Lcom/oplus/pantanal/seedling/bean/SeedlingSubscribeTypeEnum;Lcom/oplus/pantanal/seedling/bean/SeedlingCardSizeEnum;Ljava/lang/String;JLjava/lang/String;)V", "getCardId", "()I", "getCardIndex", "cardUniqueKey", "getCardUniqueKey$seedling_support_manualRelease", "()Ljava/lang/String;", "setCardUniqueKey$seedling_support_manualRelease", "(Ljava/lang/String;)V", "clientName", "getClientName$seedling_support_manualRelease", "setClientName$seedling_support_manualRelease", "extraData", "Lorg/json/JSONObject;", "getExtraData", "()Lorg/json/JSONObject;", "setExtraData", "(Lorg/json/JSONObject;)V", "getHost", "()Lcom/oplus/pantanal/seedling/bean/SeedlingHostEnum;", "getHostId$seedling_support_manualRelease", "getPageId", "getServiceId", "getServiceInstanceId", "setServiceInstanceId", "getSize", "()Lcom/oplus/pantanal/seedling/bean/SeedlingCardSizeEnum;", "getSubscribeType", "()Lcom/oplus/pantanal/seedling/bean/SeedlingSubscribeTypeEnum;", "updateRandomKey", "getUpdateRandomKey$seedling_support_manualRelease", "setUpdateRandomKey$seedling_support_manualRelease", "getUpkVersionCode", "()J", "widgetCode", "getWidgetCode", "component1", "component10", "component2", "component3", "component4", "component4$seedling_support_manualRelease", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "getCardUniqueKey", "isLifeCycle", "getPrintKey", "getPrintKey$seedling_support_manualRelease", "getSeedlingCardId", "hashCode", "initRandomKey", "", "initRandomKey$seedling_support_manualRelease", "toString", "update", "Companion", "seedling-support_manualRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SeedlingCard {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String FLAG_SK = "_sk=";
    private final int cardId;
    private final int cardIndex;

    @NotNull
    private String cardUniqueKey;

    @NotNull
    private String clientName;

    @NotNull
    private JSONObject extraData;

    @NotNull
    private final SeedlingHostEnum host;
    private final int hostId;

    @NotNull
    private final String pageId;

    @NotNull
    private final String serviceId;

    @NotNull
    private String serviceInstanceId;

    @NotNull
    private final SeedlingCardSizeEnum size;

    @NotNull
    private final SeedlingSubscribeTypeEnum subscribeType;

    @NotNull
    private String updateRandomKey;
    private final long upkVersionCode;

    @NotNull
    private final String widgetCode;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/oplus/pantanal/seedling/bean/SeedlingCard$Companion;", "", "()V", "FLAG_SK", "", "build", "Lcom/oplus/pantanal/seedling/bean/SeedlingCard;", "seedlingCardId", "seedling-support_manualRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final SeedlingCard build(@NotNull String seedlingCardId) {
            Intrinsics.checkNotNullParameter(seedlingCardId, "seedlingCardId");
            return (SeedlingCard) ConvertorFactory.INSTANCE.get(WidgetCodeToSeedlingCardConvertor.class).to(seedlingCardId);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SeedlingCard(@NotNull String str, int i, int i2, int i3, @NotNull SeedlingHostEnum seedlingHostEnum, @NotNull SeedlingSubscribeTypeEnum seedlingSubscribeTypeEnum, @NotNull SeedlingCardSizeEnum seedlingCardSizeEnum, @NotNull String str2, long j) {
        this(str, i, i2, i3, seedlingHostEnum, seedlingSubscribeTypeEnum, seedlingCardSizeEnum, str2, j, null, 512, null);
        Intrinsics.checkNotNullParameter(str, "serviceId");
        Intrinsics.checkNotNullParameter(seedlingHostEnum, "host");
        Intrinsics.checkNotNullParameter(seedlingSubscribeTypeEnum, "subscribeType");
        Intrinsics.checkNotNullParameter(seedlingCardSizeEnum, "size");
        Intrinsics.checkNotNullParameter(str2, JsonToSeedlingCardOptionsConvertor.KEY_PAGE_ID);
    }

    @JvmStatic
    @NotNull
    public static final SeedlingCard build(@NotNull String str) {
        return INSTANCE.build(str);
    }

    public static /* synthetic */ String getCardUniqueKey$seedling_support_manualRelease$default(SeedlingCard seedlingCard, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return seedlingCard.getCardUniqueKey$seedling_support_manualRelease(z);
    }

    public static /* synthetic */ String getPrintKey$seedling_support_manualRelease$default(SeedlingCard seedlingCard, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return seedlingCard.getPrintKey$seedling_support_manualRelease(z);
    }

    public static /* synthetic */ SeedlingCard update$default(SeedlingCard seedlingCard, SeedlingHostEnum seedlingHostEnum, String str, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            seedlingHostEnum = seedlingCard.host;
        }
        if ((i & 2) != 0) {
            str = seedlingCard.pageId;
        }
        if ((i & 4) != 0) {
            j = seedlingCard.upkVersionCode;
        }
        return seedlingCard.update(seedlingHostEnum, str, j);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getServiceId() {
        return this.serviceId;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getServiceInstanceId() {
        return this.serviceInstanceId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCardId() {
        return this.cardId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getCardIndex() {
        return this.cardIndex;
    }

    /* JADX INFO: renamed from: component4$seedling_support_manualRelease, reason: from getter */
    public final int getHostId() {
        return this.hostId;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final SeedlingHostEnum getHost() {
        return this.host;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final SeedlingSubscribeTypeEnum getSubscribeType() {
        return this.subscribeType;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final SeedlingCardSizeEnum getSize() {
        return this.size;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getPageId() {
        return this.pageId;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final long getUpkVersionCode() {
        return this.upkVersionCode;
    }

    @NotNull
    public final SeedlingCard copy(@NotNull String serviceId, int cardId, int cardIndex, int hostId, @NotNull SeedlingHostEnum host, @NotNull SeedlingSubscribeTypeEnum subscribeType, @NotNull SeedlingCardSizeEnum size, @NotNull String pageId, long upkVersionCode, @NotNull String serviceInstanceId) {
        Intrinsics.checkNotNullParameter(serviceId, "serviceId");
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(subscribeType, "subscribeType");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(pageId, JsonToSeedlingCardOptionsConvertor.KEY_PAGE_ID);
        Intrinsics.checkNotNullParameter(serviceInstanceId, "serviceInstanceId");
        return new SeedlingCard(serviceId, cardId, cardIndex, hostId, host, subscribeType, size, pageId, upkVersionCode, serviceInstanceId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(SeedlingCard.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.oplus.pantanal.seedling.bean.SeedlingCard");
        SeedlingCard seedlingCard = (SeedlingCard) other;
        return Intrinsics.areEqual(this.serviceId, seedlingCard.serviceId) && this.cardId == seedlingCard.cardId && this.cardIndex == seedlingCard.cardIndex && this.hostId == seedlingCard.hostId && this.host == seedlingCard.host && Intrinsics.areEqual(this.serviceInstanceId, seedlingCard.serviceInstanceId);
    }

    public final int getCardId() {
        return this.cardId;
    }

    public final int getCardIndex() {
        return this.cardIndex;
    }

    @NotNull
    /* JADX INFO: renamed from: getCardUniqueKey$seedling_support_manualRelease, reason: from getter */
    public final String getCardUniqueKey() {
        return this.cardUniqueKey;
    }

    @NotNull
    /* JADX INFO: renamed from: getClientName$seedling_support_manualRelease, reason: from getter */
    public final String getClientName() {
        return this.clientName;
    }

    @NotNull
    public final JSONObject getExtraData() {
        return this.extraData;
    }

    @NotNull
    public final SeedlingHostEnum getHost() {
        return this.host;
    }

    public final int getHostId$seedling_support_manualRelease() {
        return this.hostId;
    }

    @NotNull
    public final String getPageId() {
        return this.pageId;
    }

    @NotNull
    public final String getPrintKey$seedling_support_manualRelease(boolean isLifeCycle) {
        return "[" + getCardUniqueKey$seedling_support_manualRelease(isLifeCycle) + "]";
    }

    @NotNull
    public final String getSeedlingCardId() {
        return (String) ConvertorFactory.INSTANCE.get(WidgetCodeToSeedlingCardConvertor.class).from(this);
    }

    @NotNull
    public final String getServiceId() {
        return this.serviceId;
    }

    @NotNull
    public final String getServiceInstanceId() {
        return this.serviceInstanceId;
    }

    @NotNull
    public final SeedlingCardSizeEnum getSize() {
        return this.size;
    }

    @NotNull
    public final SeedlingSubscribeTypeEnum getSubscribeType() {
        return this.subscribeType;
    }

    @NotNull
    /* JADX INFO: renamed from: getUpdateRandomKey$seedling_support_manualRelease, reason: from getter */
    public final String getUpdateRandomKey() {
        return this.updateRandomKey;
    }

    public final long getUpkVersionCode() {
        return this.upkVersionCode;
    }

    @NotNull
    public final String getWidgetCode() {
        return this.widgetCode;
    }

    public int hashCode() {
        return (((((((((this.serviceId.hashCode() * 31) + this.cardId) * 31) + this.cardIndex) * 31) + this.hostId) * 31) + this.host.hashCode()) * 31) + this.serviceInstanceId.hashCode();
    }

    public final void initRandomKey$seedling_support_manualRelease() {
        this.updateRandomKey = UtilsKt.generateShortUUID();
    }

    public final void setCardUniqueKey$seedling_support_manualRelease(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.cardUniqueKey = str;
    }

    public final void setClientName$seedling_support_manualRelease(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.clientName = str;
    }

    public final void setExtraData(@NotNull JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "<set-?>");
        this.extraData = jSONObject;
    }

    public final void setServiceInstanceId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.serviceInstanceId = str;
    }

    public final void setUpdateRandomKey$seedling_support_manualRelease(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.updateRandomKey = str;
    }

    @NotNull
    public String toString() {
        return "SeedlingCard(serviceId=" + this.serviceId + ", cardId=" + this.cardId + ", cardIndex=" + this.cardIndex + ", hostId=" + this.hostId + ", host=" + this.host + ", subscribeType=" + this.subscribeType + ", size=" + this.size + ", pageId=" + this.pageId + ", upkVersionCode=" + this.upkVersionCode + ", serviceInstanceId=" + this.serviceInstanceId + ")";
    }

    @NotNull
    public final SeedlingCard update(@NotNull SeedlingHostEnum host, @NotNull String pageId, long upkVersionCode) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(pageId, JsonToSeedlingCardOptionsConvertor.KEY_PAGE_ID);
        SeedlingCard seedlingCard = new SeedlingCard(this.serviceId, this.cardId, this.cardIndex, this.hostId, host, this.subscribeType, this.size, pageId, upkVersionCode, this.serviceInstanceId);
        seedlingCard.cardUniqueKey = this.cardUniqueKey;
        seedlingCard.extraData = this.extraData;
        seedlingCard.clientName = this.clientName;
        return seedlingCard;
    }

    @JvmOverloads
    public SeedlingCard(@NotNull String str, int i, int i2, int i3, @NotNull SeedlingHostEnum seedlingHostEnum, @NotNull SeedlingSubscribeTypeEnum seedlingSubscribeTypeEnum, @NotNull SeedlingCardSizeEnum seedlingCardSizeEnum, @NotNull String str2, long j, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "serviceId");
        Intrinsics.checkNotNullParameter(seedlingHostEnum, "host");
        Intrinsics.checkNotNullParameter(seedlingSubscribeTypeEnum, "subscribeType");
        Intrinsics.checkNotNullParameter(seedlingCardSizeEnum, "size");
        Intrinsics.checkNotNullParameter(str2, JsonToSeedlingCardOptionsConvertor.KEY_PAGE_ID);
        Intrinsics.checkNotNullParameter(str3, "serviceInstanceId");
        this.serviceId = str;
        this.cardId = i;
        this.cardIndex = i2;
        this.hostId = i3;
        this.host = seedlingHostEnum;
        this.subscribeType = seedlingSubscribeTypeEnum;
        this.size = seedlingCardSizeEnum;
        this.pageId = str2;
        this.upkVersionCode = j;
        this.serviceInstanceId = str3;
        this.clientName = "";
        this.widgetCode = ExtsKt.formatSeedlingCard(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        this.extraData = new JSONObject();
        this.cardUniqueKey = "";
        this.updateRandomKey = "";
    }

    @NotNull
    public final String getCardUniqueKey$seedling_support_manualRelease(boolean isLifeCycle) {
        String strSubstring;
        String str;
        StringBuilder sb;
        if (this.cardUniqueKey.length() != 0) {
            if (isLifeCycle) {
                return this.cardUniqueKey;
            }
            int iIndexOf$default = StringsKt.indexOf$default(this.cardUniqueKey, FLAG_SK, 0, false, 6, (Object) null);
            if (iIndexOf$default != -1) {
                strSubstring = this.cardUniqueKey.substring(0, iIndexOf$default);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                str = this.updateRandomKey;
                sb = new StringBuilder();
            } else {
                strSubstring = this.cardUniqueKey;
                str = this.updateRandomKey;
                sb = new StringBuilder();
            }
            sb.append(strSubstring);
            sb.append(FLAG_SK);
            sb.append(str);
            return sb.toString();
        }
        return (this.cardId + WidgetCodeToSeedlingCardConvertor.CARD_SPLIT + this.cardIndex + WidgetCodeToSeedlingCardConvertor.CARD_SPLIT + this.hostId) + "_sid=" + this.serviceId + "_rk=_sk=" + this.updateRandomKey;
    }

    public /* synthetic */ SeedlingCard(String str, int i, int i2, int i3, SeedlingHostEnum seedlingHostEnum, SeedlingSubscribeTypeEnum seedlingSubscribeTypeEnum, SeedlingCardSizeEnum seedlingCardSizeEnum, String str2, long j, String str3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, i2, i3, seedlingHostEnum, seedlingSubscribeTypeEnum, seedlingCardSizeEnum, str2, j, (i4 & 512) != 0 ? "" : str3);
    }
}
