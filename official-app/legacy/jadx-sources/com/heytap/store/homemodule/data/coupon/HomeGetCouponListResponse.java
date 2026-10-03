package com.heytap.store.homemodule.data.coupon;

import androidx.annotation.Keep;
import com.heytap.store.base.core.util.deeplink.DeepLinkInterpreter;
import com.heytap.store.base.widget.state.data.StateConstantsKt;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0017B#\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J,\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/heytap/store/homemodule/data/coupon/HomeGetCouponListResponse;", "", "code", "", "data", "", "Lcom/heytap/store/homemodule/data/coupon/HomeGetCouponListResponse$CouponInfo;", "(Ljava/lang/Integer;Ljava/util/List;)V", "getCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getData", "()Ljava/util/List;", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/util/List;)Lcom/heytap/store/homemodule/data/coupon/HomeGetCouponListResponse;", "equals", "", "other", "hashCode", "toString", "", "CouponInfo", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class HomeGetCouponListResponse {

    @Nullable
    private final Integer code;

    @Nullable
    private final List<CouponInfo> data;

    @Keep
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\bP\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u00ad\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u000e¢\u0006\u0002\u0010\u001fJ\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010G\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010$J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010I\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010$J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010M\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010$J\u000b\u0010N\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010O\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010$J\u0010\u0010P\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010)J\u0010\u0010Q\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010)J\t\u0010R\u001a\u00020\u0003HÆ\u0003J\u0010\u0010S\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010$J\t\u0010T\u001a\u00020\u000eHÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010W\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010)J\u000b\u0010X\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010Y\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010)J\u0010\u0010Z\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010/J\u0010\u0010[\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010$J¶\u0002\u0010\\\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u001c\u001a\u00020\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u001e\u001a\u00020\u000eHÆ\u0001¢\u0006\u0002\u0010]J\u0013\u0010^\u001a\u00020_2\b\u0010`\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010a\u001a\u00020\u000eHÖ\u0001J\t\u0010b\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010%\u001a\u0004\b#\u0010$R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010!R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010!R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010*\u001a\u0004\b(\u0010)R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010!R\u0015\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010*\u001a\u0004\b,\u0010)R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010!R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u00100\u001a\u0004\b.\u0010/R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010!R\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010%\u001a\u0004\b2\u0010$R\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010%\u001a\u0004\b3\u0010$R\u0011\u0010\u001c\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u0010!R\u0011\u0010\u001e\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u0010!R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u0010!R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u0010!R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b:\u0010!R\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0010\n\u0002\u0010%\u001a\u0004\b;\u0010$\"\u0004\b<\u0010=R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010%\u001a\u0004\b>\u0010$R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b?\u0010!R\u0015\u0010\u001d\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010%\u001a\u0004\b@\u0010$R\u0015\u0010\u001b\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010*\u001a\u0004\bA\u0010)R\u0015\u0010\u001a\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010*\u001a\u0004\bB\u0010)¨\u0006c"}, d2 = {"Lcom/heytap/store/homemodule/data/coupon/HomeGetCouponListResponse$CouponInfo;", "", "code", "", DeepLinkInterpreter.KEY_ACTIVITY_NAME, StateConstantsKt.STATE_ACTION_BTN_CLICK, "couponMid", DeepLinkInterpreter.KEY_COUPON_ACTIVITY_ID, "", "couponsName", "credits", "discountFee", "", "discountType", "", "discountFeeStr", "link", "seniority", "status", "useBrief", "type", "pricePrefix", "priceSuffix", "currencyTag", "cashGiftNum", "drawCondition", "useStartTime", "useEndTime", "effectUseTime", "useDays", "exchangeStatus", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;I)V", "getActivityName", "()Ljava/lang/String;", "getButtonText", "getCashGiftNum", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCode", "getCouponMid", "getCouponsActivityId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCouponsName", "getCredits", "getCurrencyTag", "getDiscountFee", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getDiscountFeeStr", "getDiscountType", "getDrawCondition", "getEffectUseTime", "getExchangeStatus", "()I", "getLink", "getPricePrefix", "getPriceSuffix", "getSeniority", "getStatus", "setStatus", "(Ljava/lang/Integer;)V", "getType", "getUseBrief", "getUseDays", "getUseEndTime", "getUseStartTime", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;I)Lcom/heytap/store/homemodule/data/coupon/HomeGetCouponListResponse$CouponInfo;", "equals", "", "other", "hashCode", "toString", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class CouponInfo {

        @Nullable
        private final String activityName;

        @Nullable
        private final String buttonText;

        @Nullable
        private final Integer cashGiftNum;

        @Nullable
        private final String code;

        @Nullable
        private final String couponMid;

        @Nullable
        private final Long couponsActivityId;

        @Nullable
        private final String couponsName;

        @Nullable
        private final Long credits;

        @Nullable
        private final String currencyTag;

        @Nullable
        private final Double discountFee;

        @Nullable
        private final String discountFeeStr;

        @Nullable
        private final Integer discountType;

        @Nullable
        private final Integer drawCondition;

        @NotNull
        private final String effectUseTime;
        private final int exchangeStatus;

        @Nullable
        private final String link;

        @Nullable
        private final String pricePrefix;

        @Nullable
        private final String priceSuffix;

        @Nullable
        private final String seniority;

        @Nullable
        private Integer status;

        @Nullable
        private final Integer type;

        @Nullable
        private final String useBrief;

        @Nullable
        private final Integer useDays;

        @Nullable
        private final Long useEndTime;

        @Nullable
        private final Long useStartTime;

        public CouponInfo() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 33554431, null);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getCode() {
            return this.code;
        }

        @Nullable
        /* JADX INFO: renamed from: component10, reason: from getter */
        public final String getDiscountFeeStr() {
            return this.discountFeeStr;
        }

        @Nullable
        /* JADX INFO: renamed from: component11, reason: from getter */
        public final String getLink() {
            return this.link;
        }

        @Nullable
        /* JADX INFO: renamed from: component12, reason: from getter */
        public final String getSeniority() {
            return this.seniority;
        }

        @Nullable
        /* JADX INFO: renamed from: component13, reason: from getter */
        public final Integer getStatus() {
            return this.status;
        }

        @Nullable
        /* JADX INFO: renamed from: component14, reason: from getter */
        public final String getUseBrief() {
            return this.useBrief;
        }

        @Nullable
        /* JADX INFO: renamed from: component15, reason: from getter */
        public final Integer getType() {
            return this.type;
        }

        @Nullable
        /* JADX INFO: renamed from: component16, reason: from getter */
        public final String getPricePrefix() {
            return this.pricePrefix;
        }

        @Nullable
        /* JADX INFO: renamed from: component17, reason: from getter */
        public final String getPriceSuffix() {
            return this.priceSuffix;
        }

        @Nullable
        /* JADX INFO: renamed from: component18, reason: from getter */
        public final String getCurrencyTag() {
            return this.currencyTag;
        }

        @Nullable
        /* JADX INFO: renamed from: component19, reason: from getter */
        public final Integer getCashGiftNum() {
            return this.cashGiftNum;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getActivityName() {
            return this.activityName;
        }

        @Nullable
        /* JADX INFO: renamed from: component20, reason: from getter */
        public final Integer getDrawCondition() {
            return this.drawCondition;
        }

        @Nullable
        /* JADX INFO: renamed from: component21, reason: from getter */
        public final Long getUseStartTime() {
            return this.useStartTime;
        }

        @Nullable
        /* JADX INFO: renamed from: component22, reason: from getter */
        public final Long getUseEndTime() {
            return this.useEndTime;
        }

        @NotNull
        /* JADX INFO: renamed from: component23, reason: from getter */
        public final String getEffectUseTime() {
            return this.effectUseTime;
        }

        @Nullable
        /* JADX INFO: renamed from: component24, reason: from getter */
        public final Integer getUseDays() {
            return this.useDays;
        }

        /* JADX INFO: renamed from: component25, reason: from getter */
        public final int getExchangeStatus() {
            return this.exchangeStatus;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getButtonText() {
            return this.buttonText;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getCouponMid() {
            return this.couponMid;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final Long getCouponsActivityId() {
            return this.couponsActivityId;
        }

        @Nullable
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getCouponsName() {
            return this.couponsName;
        }

        @Nullable
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final Long getCredits() {
            return this.credits;
        }

        @Nullable
        /* JADX INFO: renamed from: component8, reason: from getter */
        public final Double getDiscountFee() {
            return this.discountFee;
        }

        @Nullable
        /* JADX INFO: renamed from: component9, reason: from getter */
        public final Integer getDiscountType() {
            return this.discountType;
        }

        @NotNull
        public final CouponInfo copy(@Nullable String code, @Nullable String activityName, @Nullable String buttonText, @Nullable String couponMid, @Nullable Long couponsActivityId, @Nullable String couponsName, @Nullable Long credits, @Nullable Double discountFee, @Nullable Integer discountType, @Nullable String discountFeeStr, @Nullable String link, @Nullable String seniority, @Nullable Integer status, @Nullable String useBrief, @Nullable Integer type, @Nullable String pricePrefix, @Nullable String priceSuffix, @Nullable String currencyTag, @Nullable Integer cashGiftNum, @Nullable Integer drawCondition, @Nullable Long useStartTime, @Nullable Long useEndTime, @NotNull String effectUseTime, @Nullable Integer useDays, int exchangeStatus) {
            Intrinsics.checkNotNullParameter(effectUseTime, "effectUseTime");
            return new CouponInfo(code, activityName, buttonText, couponMid, couponsActivityId, couponsName, credits, discountFee, discountType, discountFeeStr, link, seniority, status, useBrief, type, pricePrefix, priceSuffix, currencyTag, cashGiftNum, drawCondition, useStartTime, useEndTime, effectUseTime, useDays, exchangeStatus);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CouponInfo)) {
                return false;
            }
            CouponInfo couponInfo = (CouponInfo) other;
            return Intrinsics.areEqual(this.code, couponInfo.code) && Intrinsics.areEqual(this.activityName, couponInfo.activityName) && Intrinsics.areEqual(this.buttonText, couponInfo.buttonText) && Intrinsics.areEqual(this.couponMid, couponInfo.couponMid) && Intrinsics.areEqual(this.couponsActivityId, couponInfo.couponsActivityId) && Intrinsics.areEqual(this.couponsName, couponInfo.couponsName) && Intrinsics.areEqual(this.credits, couponInfo.credits) && Intrinsics.areEqual((Object) this.discountFee, (Object) couponInfo.discountFee) && Intrinsics.areEqual(this.discountType, couponInfo.discountType) && Intrinsics.areEqual(this.discountFeeStr, couponInfo.discountFeeStr) && Intrinsics.areEqual(this.link, couponInfo.link) && Intrinsics.areEqual(this.seniority, couponInfo.seniority) && Intrinsics.areEqual(this.status, couponInfo.status) && Intrinsics.areEqual(this.useBrief, couponInfo.useBrief) && Intrinsics.areEqual(this.type, couponInfo.type) && Intrinsics.areEqual(this.pricePrefix, couponInfo.pricePrefix) && Intrinsics.areEqual(this.priceSuffix, couponInfo.priceSuffix) && Intrinsics.areEqual(this.currencyTag, couponInfo.currencyTag) && Intrinsics.areEqual(this.cashGiftNum, couponInfo.cashGiftNum) && Intrinsics.areEqual(this.drawCondition, couponInfo.drawCondition) && Intrinsics.areEqual(this.useStartTime, couponInfo.useStartTime) && Intrinsics.areEqual(this.useEndTime, couponInfo.useEndTime) && Intrinsics.areEqual(this.effectUseTime, couponInfo.effectUseTime) && Intrinsics.areEqual(this.useDays, couponInfo.useDays) && this.exchangeStatus == couponInfo.exchangeStatus;
        }

        @Nullable
        public final String getActivityName() {
            return this.activityName;
        }

        @Nullable
        public final String getButtonText() {
            return this.buttonText;
        }

        @Nullable
        public final Integer getCashGiftNum() {
            return this.cashGiftNum;
        }

        @Nullable
        public final String getCode() {
            return this.code;
        }

        @Nullable
        public final String getCouponMid() {
            return this.couponMid;
        }

        @Nullable
        public final Long getCouponsActivityId() {
            return this.couponsActivityId;
        }

        @Nullable
        public final String getCouponsName() {
            return this.couponsName;
        }

        @Nullable
        public final Long getCredits() {
            return this.credits;
        }

        @Nullable
        public final String getCurrencyTag() {
            return this.currencyTag;
        }

        @Nullable
        public final Double getDiscountFee() {
            return this.discountFee;
        }

        @Nullable
        public final String getDiscountFeeStr() {
            return this.discountFeeStr;
        }

        @Nullable
        public final Integer getDiscountType() {
            return this.discountType;
        }

        @Nullable
        public final Integer getDrawCondition() {
            return this.drawCondition;
        }

        @NotNull
        public final String getEffectUseTime() {
            return this.effectUseTime;
        }

        public final int getExchangeStatus() {
            return this.exchangeStatus;
        }

        @Nullable
        public final String getLink() {
            return this.link;
        }

        @Nullable
        public final String getPricePrefix() {
            return this.pricePrefix;
        }

        @Nullable
        public final String getPriceSuffix() {
            return this.priceSuffix;
        }

        @Nullable
        public final String getSeniority() {
            return this.seniority;
        }

        @Nullable
        public final Integer getStatus() {
            return this.status;
        }

        @Nullable
        public final Integer getType() {
            return this.type;
        }

        @Nullable
        public final String getUseBrief() {
            return this.useBrief;
        }

        @Nullable
        public final Integer getUseDays() {
            return this.useDays;
        }

        @Nullable
        public final Long getUseEndTime() {
            return this.useEndTime;
        }

        @Nullable
        public final Long getUseStartTime() {
            return this.useStartTime;
        }

        public int hashCode() {
            String str = this.code;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.activityName;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.buttonText;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.couponMid;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Long l2 = this.couponsActivityId;
            int iHashCode5 = (iHashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
            String str5 = this.couponsName;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Long l3 = this.credits;
            int iHashCode7 = (iHashCode6 + (l3 == null ? 0 : l3.hashCode())) * 31;
            Double d = this.discountFee;
            int iHashCode8 = (iHashCode7 + (d == null ? 0 : d.hashCode())) * 31;
            Integer num = this.discountType;
            int iHashCode9 = (iHashCode8 + (num == null ? 0 : num.hashCode())) * 31;
            String str6 = this.discountFeeStr;
            int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.link;
            int iHashCode11 = (iHashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.seniority;
            int iHashCode12 = (iHashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
            Integer num2 = this.status;
            int iHashCode13 = (iHashCode12 + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str9 = this.useBrief;
            int iHashCode14 = (iHashCode13 + (str9 == null ? 0 : str9.hashCode())) * 31;
            Integer num3 = this.type;
            int iHashCode15 = (iHashCode14 + (num3 == null ? 0 : num3.hashCode())) * 31;
            String str10 = this.pricePrefix;
            int iHashCode16 = (iHashCode15 + (str10 == null ? 0 : str10.hashCode())) * 31;
            String str11 = this.priceSuffix;
            int iHashCode17 = (iHashCode16 + (str11 == null ? 0 : str11.hashCode())) * 31;
            String str12 = this.currencyTag;
            int iHashCode18 = (iHashCode17 + (str12 == null ? 0 : str12.hashCode())) * 31;
            Integer num4 = this.cashGiftNum;
            int iHashCode19 = (iHashCode18 + (num4 == null ? 0 : num4.hashCode())) * 31;
            Integer num5 = this.drawCondition;
            int iHashCode20 = (iHashCode19 + (num5 == null ? 0 : num5.hashCode())) * 31;
            Long l4 = this.useStartTime;
            int iHashCode21 = (iHashCode20 + (l4 == null ? 0 : l4.hashCode())) * 31;
            Long l5 = this.useEndTime;
            int iHashCode22 = (((iHashCode21 + (l5 == null ? 0 : l5.hashCode())) * 31) + this.effectUseTime.hashCode()) * 31;
            Integer num6 = this.useDays;
            return ((iHashCode22 + (num6 != null ? num6.hashCode() : 0)) * 31) + Integer.hashCode(this.exchangeStatus);
        }

        public final void setStatus(@Nullable Integer num) {
            this.status = num;
        }

        @NotNull
        public String toString() {
            return "CouponInfo(code=" + ((Object) this.code) + ", activityName=" + ((Object) this.activityName) + ", buttonText=" + ((Object) this.buttonText) + ", couponMid=" + ((Object) this.couponMid) + ", couponsActivityId=" + this.couponsActivityId + ", couponsName=" + ((Object) this.couponsName) + ", credits=" + this.credits + ", discountFee=" + this.discountFee + ", discountType=" + this.discountType + ", discountFeeStr=" + ((Object) this.discountFeeStr) + ", link=" + ((Object) this.link) + ", seniority=" + ((Object) this.seniority) + ", status=" + this.status + ", useBrief=" + ((Object) this.useBrief) + ", type=" + this.type + ", pricePrefix=" + ((Object) this.pricePrefix) + ", priceSuffix=" + ((Object) this.priceSuffix) + ", currencyTag=" + ((Object) this.currencyTag) + ", cashGiftNum=" + this.cashGiftNum + ", drawCondition=" + this.drawCondition + ", useStartTime=" + this.useStartTime + ", useEndTime=" + this.useEndTime + ", effectUseTime=" + this.effectUseTime + ", useDays=" + this.useDays + ", exchangeStatus=" + this.exchangeStatus + ')';
        }

        public CouponInfo(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Long l2, @Nullable String str5, @Nullable Long l3, @Nullable Double d, @Nullable Integer num, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable Integer num2, @Nullable String str9, @Nullable Integer num3, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable Integer num4, @Nullable Integer num5, @Nullable Long l4, @Nullable Long l5, @NotNull String effectUseTime, @Nullable Integer num6, int i) {
            Intrinsics.checkNotNullParameter(effectUseTime, "effectUseTime");
            this.code = str;
            this.activityName = str2;
            this.buttonText = str3;
            this.couponMid = str4;
            this.couponsActivityId = l2;
            this.couponsName = str5;
            this.credits = l3;
            this.discountFee = d;
            this.discountType = num;
            this.discountFeeStr = str6;
            this.link = str7;
            this.seniority = str8;
            this.status = num2;
            this.useBrief = str9;
            this.type = num3;
            this.pricePrefix = str10;
            this.priceSuffix = str11;
            this.currencyTag = str12;
            this.cashGiftNum = num4;
            this.drawCondition = num5;
            this.useStartTime = l4;
            this.useEndTime = l5;
            this.effectUseTime = effectUseTime;
            this.useDays = num6;
            this.exchangeStatus = i;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ CouponInfo(String str, String str2, String str3, String str4, Long l2, String str5, Long l3, Double d, Integer num, String str6, String str7, String str8, Integer num2, String str9, Integer num3, String str10, String str11, String str12, Integer num4, Integer num5, Long l4, Long l5, String str13, Integer num6, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            long j2;
            Long l6;
            int i3;
            Integer num7;
            String str14 = (i2 & 1) != 0 ? "" : str;
            String str15 = (i2 & 2) != 0 ? "" : str2;
            String str16 = (i2 & 4) != 0 ? "" : str3;
            String str17 = (i2 & 8) != 0 ? "" : str4;
            Long l7 = (i2 & 16) != 0 ? 0L : l2;
            String str18 = (i2 & 32) != 0 ? "" : str5;
            Long l8 = (i2 & 64) != 0 ? 0L : l3;
            Double d2 = (i2 & 128) != 0 ? null : d;
            Integer num8 = (i2 & 256) != 0 ? 0 : num;
            String str19 = (i2 & 512) != 0 ? "" : str6;
            String str20 = (i2 & 1024) != 0 ? "" : str7;
            String str21 = (i2 & 2048) != 0 ? "" : str8;
            Integer num9 = (i2 & 4096) != 0 ? 0 : num2;
            String str22 = (i2 & 8192) != 0 ? "" : str9;
            Integer num10 = (i2 & 16384) != 0 ? 0 : num3;
            String str23 = (32768 & i2) != 0 ? "" : str10;
            String str24 = (i2 & 65536) != 0 ? "" : str11;
            String str25 = (i2 & 131072) != 0 ? "" : str12;
            Integer num11 = (i2 & 262144) != 0 ? null : num4;
            Integer num12 = (i2 & 524288) != 0 ? null : num5;
            if ((i2 & 1048576) != 0) {
                j2 = 0;
                l6 = 0L;
            } else {
                j2 = 0;
                l6 = l4;
            }
            Long lValueOf = (i2 & 2097152) != 0 ? Long.valueOf(j2) : l5;
            String str26 = (i2 & 4194304) != 0 ? "" : str13;
            if ((i2 & 8388608) != 0) {
                i3 = 0;
                num7 = 0;
            } else {
                i3 = 0;
                num7 = num6;
            }
            this(str14, str15, str16, str17, l7, str18, l8, d2, num8, str19, str20, str21, num9, str22, num10, str23, str24, str25, num11, num12, l6, lValueOf, str26, num7, (i2 & 16777216) == 0 ? i : i3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HomeGetCouponListResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HomeGetCouponListResponse copy$default(HomeGetCouponListResponse homeGetCouponListResponse, Integer num, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            num = homeGetCouponListResponse.code;
        }
        if ((i & 2) != 0) {
            list = homeGetCouponListResponse.data;
        }
        return homeGetCouponListResponse.copy(num, list);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getCode() {
        return this.code;
    }

    @Nullable
    public final List<CouponInfo> component2() {
        return this.data;
    }

    @NotNull
    public final HomeGetCouponListResponse copy(@Nullable Integer code, @Nullable List<CouponInfo> data) {
        return new HomeGetCouponListResponse(code, data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HomeGetCouponListResponse)) {
            return false;
        }
        HomeGetCouponListResponse homeGetCouponListResponse = (HomeGetCouponListResponse) other;
        return Intrinsics.areEqual(this.code, homeGetCouponListResponse.code) && Intrinsics.areEqual(this.data, homeGetCouponListResponse.data);
    }

    @Nullable
    public final Integer getCode() {
        return this.code;
    }

    @Nullable
    public final List<CouponInfo> getData() {
        return this.data;
    }

    public int hashCode() {
        Integer num = this.code;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<CouponInfo> list = this.data;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "HomeGetCouponListResponse(code=" + this.code + ", data=" + this.data + ')';
    }

    public HomeGetCouponListResponse(@Nullable Integer num, @Nullable List<CouponInfo> list) {
        this.code = num;
        this.data = list;
    }

    public /* synthetic */ HomeGetCouponListResponse(Integer num, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0 : num, (i & 2) != 0 ? null : list);
    }
}
