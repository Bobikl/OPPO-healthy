package com.heytap.store.homemodule.data.coupon;

import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\bg\b\u0086\b\u0018\u0000 x2\u00020\u0001:\u0001xBÁ\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010#\u001a\u00020\u0003\u0012\b\b\u0002\u0010$\u001a\u00020\u0012¢\u0006\u0002\u0010%J\t\u0010T\u001a\u00020\u0003HÆ\u0003J\t\u0010U\u001a\u00020\u0003HÆ\u0003J\t\u0010V\u001a\u00020\u0003HÆ\u0003J\t\u0010W\u001a\u00020\u0012HÆ\u0003J\t\u0010X\u001a\u00020\u0012HÆ\u0003J\t\u0010Y\u001a\u00020\u0012HÆ\u0003J\t\u0010Z\u001a\u00020\u0012HÆ\u0003J\t\u0010[\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\\\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u00101J\t\u0010]\u001a\u00020\u0003HÆ\u0003J\t\u0010^\u001a\u00020\u0003HÆ\u0003J\t\u0010_\u001a\u00020\u0003HÆ\u0003J\t\u0010`\u001a\u00020\u0003HÆ\u0003J\t\u0010a\u001a\u00020\u0003HÆ\u0003J\u0010\u0010b\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u00101J\t\u0010c\u001a\u00020\u0012HÆ\u0003J\t\u0010d\u001a\u00020\u0012HÆ\u0003J\u0010\u0010e\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u00101J\u0010\u0010f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010PJ\u0010\u0010g\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010PJ\u0010\u0010h\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u00101J\t\u0010i\u001a\u00020\u0003HÆ\u0003J\t\u0010j\u001a\u00020\u0006HÆ\u0003J\t\u0010k\u001a\u00020\u0012HÆ\u0003J\t\u0010l\u001a\u00020\u0006HÆ\u0003J\t\u0010m\u001a\u00020\u0003HÆ\u0003J\t\u0010n\u001a\u00020\u0003HÆ\u0003J\t\u0010o\u001a\u00020\u0003HÆ\u0003J\u0010\u0010p\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010;J\u0010\u0010q\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u00101JÊ\u0002\u0010r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u001d\u001a\u00020\u00122\b\b\u0002\u0010\u001e\u001a\u00020\u00122\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010#\u001a\u00020\u00032\b\b\u0002\u0010$\u001a\u00020\u0012HÆ\u0001¢\u0006\u0002\u0010sJ\u0013\u0010t\u001a\u00020\u00122\b\u0010u\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010v\u001a\u00020\u000eHÖ\u0001J\t\u0010w\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0010\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001a\u0010\u0013\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001a\u0010\u000f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010'\"\u0004\b/\u0010)R\u0015\u0010\u001c\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u00102\u001a\u0004\b0\u00101R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010'R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b6\u0010'R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b7\u00105R\u001a\u0010\u001a\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010'\"\u0004\b9\u0010)R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010<\u001a\u0004\b:\u0010;R\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u00102\u001a\u0004\b=\u00101R\u0015\u0010\u001f\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u00102\u001a\u0004\b>\u00101R\u0011\u0010#\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b?\u0010'R\u001a\u0010\u0015\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010+\"\u0004\bA\u0010-R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010+\"\u0004\bB\u0010-R\u001a\u0010\u001e\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010+\"\u0004\bC\u0010-R\u0011\u0010$\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b$\u0010+R\u001a\u0010\u001d\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010+\"\u0004\bD\u0010-R\u001a\u0010\u0014\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010+\"\u0004\bE\u0010-R\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bF\u0010'R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bG\u0010'R\u0011\u0010\u0018\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bH\u0010'R\u001a\u0010\u0019\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010'\"\u0004\bJ\u0010)R\u0011\u0010\u001b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bK\u0010'R\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u00102\u001a\u0004\bL\u00101R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bM\u0010'R\u0015\u0010\"\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u00102\u001a\u0004\bN\u00101R\u0015\u0010!\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010Q\u001a\u0004\bO\u0010PR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bR\u0010'R\u0015\u0010 \u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010Q\u001a\u0004\bS\u0010P¨\u0006y"}, d2 = {"Lcom/heytap/store/homemodule/data/coupon/HomeCouponData;", "", "code", "", "couponMid", "couponActivityId", "", "credits", "memberType", "useCondition", "useScope", "discountFee", "", "discountType", "", "amount", "action", "isActionHidden", "", "actionDisable", "isGot", "goToLink", "link", "type", "pricePrefix", "priceSuffix", "currencyTag", "tagOnly", "cashGiftNum", "isCanGetBlackCardGif", "isBlackCardChangeSuccess", "drawCondition", "useStartTime", "useEndTime", "useDays", "effectUseTime", "isBlackCardCoupon", "(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZZZZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ZZLjava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Z)V", "getAction", "()Ljava/lang/String;", "setAction", "(Ljava/lang/String;)V", "getActionDisable", "()Z", "setActionDisable", "(Z)V", "getAmount", "setAmount", "getCashGiftNum", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCode", "getCouponActivityId", "()J", "getCouponMid", "getCredits", "getCurrencyTag", "setCurrencyTag", "getDiscountFee", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getDiscountType", "getDrawCondition", "getEffectUseTime", "getGoToLink", "setGoToLink", "setActionHidden", "setBlackCardChangeSuccess", "setCanGetBlackCardGif", "setGot", "getLink", "getMemberType", "getPricePrefix", "getPriceSuffix", "setPriceSuffix", "getTagOnly", "getType", "getUseCondition", "getUseDays", "getUseEndTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getUseScope", "getUseStartTime", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZZZZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ZZLjava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Z)Lcom/heytap/store/homemodule/data/coupon/HomeCouponData;", "equals", "other", "hashCode", "toString", "Companion", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class HomeCouponData {
    private static final int COUPON_STATE_AVAILABLE = 0;
    private static final int COUPON_STATE_BLACKCARD = 7;
    private static final int COUPON_STATE_COMING = 4;
    private static final int COUPON_STATE_EXPIRED = 3;
    private static final int COUPON_STATE_MISSED = 5;
    private static final int COUPON_STATE_OUT_OF_STOCK = 6;
    private static final int COUPON_STATE_RECEIVED = 1;
    private static final int COUPON_STATE_REMOVED = -1;
    private static final int COUPON_STATE_USED = 2;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private String action;
    private boolean actionDisable;

    @NotNull
    private String amount;

    @Nullable
    private final Integer cashGiftNum;

    @NotNull
    private final String code;
    private final long couponActivityId;

    @NotNull
    private final String couponMid;
    private final long credits;

    @NotNull
    private String currencyTag;

    @Nullable
    private final Double discountFee;

    @Nullable
    private final Integer discountType;

    @Nullable
    private final Integer drawCondition;

    @NotNull
    private final String effectUseTime;
    private boolean goToLink;
    private boolean isActionHidden;
    private boolean isBlackCardChangeSuccess;
    private final boolean isBlackCardCoupon;
    private boolean isCanGetBlackCardGif;
    private boolean isGot;

    @NotNull
    private final String link;

    @NotNull
    private final String memberType;

    @NotNull
    private final String pricePrefix;

    @NotNull
    private String priceSuffix;

    @NotNull
    private final String tagOnly;

    @Nullable
    private final Integer type;

    @NotNull
    private final String useCondition;

    @Nullable
    private final Integer useDays;

    @Nullable
    private final Long useEndTime;

    @NotNull
    private final String useScope;

    @Nullable
    private final Long useStartTime;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\u0010\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0003J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0013H\u0003J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0013H\u0003J\u0010\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0013H\u0003J\u0010\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0013H\u0003J\u0010\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0013H\u0003J\u0010\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0013H\u0003R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/heytap/store/homemodule/data/coupon/HomeCouponData$Companion;", "", "()V", "COUPON_STATE_AVAILABLE", "", "COUPON_STATE_BLACKCARD", "COUPON_STATE_COMING", "COUPON_STATE_EXPIRED", "COUPON_STATE_MISSED", "COUPON_STATE_OUT_OF_STOCK", "COUPON_STATE_RECEIVED", "COUPON_STATE_REMOVED", "COUPON_STATE_USED", "fromCouponInfo", "Lcom/heytap/store/homemodule/data/coupon/HomeCouponData;", "code", "", "tagOnly", UTraceSQLiteHelperKt.COL_INFO, "Lcom/heytap/store/homemodule/data/coupon/HomeGetCouponListResponse$CouponInfo;", "getBtnText", "isActionButtonHidden", "", "isActionDisable", "isBlackCardCoupon", "isCanGetBlackCardGif", "isGotCoupon", "isGotoLink", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final String getBtnText(HomeGetCouponListResponse.CouponInfo info) {
            String buttonText;
            return (info == null || (buttonText = info.getButtonText()) == null) ? "" : buttonText;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final boolean isActionButtonHidden(HomeGetCouponListResponse.CouponInfo info) {
            Integer status = info.getStatus();
            if ((status == null ? -1 : status.intValue()) == 1) {
                String link = info.getLink();
                if (link == null ? true : StringsKt__StringsJVMKt.isBlank(link)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final boolean isActionDisable(HomeGetCouponListResponse.CouponInfo info) {
            Integer status = info.getStatus();
            int iIntValue = status == null ? -1 : status.intValue();
            if (iIntValue != -1) {
                return 2 <= iIntValue && iIntValue < 7;
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final boolean isBlackCardCoupon(HomeGetCouponListResponse.CouponInfo info) {
            Integer drawCondition;
            return (info == null || (drawCondition = info.getDrawCondition()) == null || drawCondition.intValue() != 3) ? false : true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final boolean isCanGetBlackCardGif(HomeGetCouponListResponse.CouponInfo info) {
            return isBlackCardCoupon(info) && info.getExchangeStatus() == 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final boolean isGotCoupon(HomeGetCouponListResponse.CouponInfo info) {
            Integer status = info.getStatus();
            int iIntValue = status == null ? -1 : status.intValue();
            return 1 <= iIntValue && iIntValue < 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final boolean isGotoLink(HomeGetCouponListResponse.CouponInfo info) {
            return !isActionDisable(info) && isGotCoupon(info);
        }

        @JvmStatic
        @NotNull
        public final HomeCouponData fromCouponInfo(@NotNull String code, @NotNull String tagOnly, @NotNull HomeGetCouponListResponse.CouponInfo info) {
            Intrinsics.checkNotNullParameter(code, "code");
            Intrinsics.checkNotNullParameter(tagOnly, "tagOnly");
            Intrinsics.checkNotNullParameter(info, "info");
            String couponMid = info.getCouponMid();
            String str = couponMid == null ? "" : couponMid;
            Long couponsActivityId = info.getCouponsActivityId();
            long jLongValue = couponsActivityId == null ? 0L : couponsActivityId.longValue();
            Long credits = info.getCredits();
            long jLongValue2 = credits != null ? credits.longValue() : 0L;
            String seniority = info.getSeniority();
            if (seniority == null) {
                seniority = "";
            }
            String couponsName = info.getCouponsName();
            String str2 = couponsName == null ? "" : couponsName;
            String useBrief = info.getUseBrief();
            String str3 = useBrief == null ? "" : useBrief;
            Double discountFee = info.getDiscountFee();
            Integer discountType = info.getDiscountType();
            String discountFeeStr = info.getDiscountFeeStr();
            String str4 = discountFeeStr == null ? "" : discountFeeStr;
            String btnText = getBtnText(info);
            boolean zIsActionButtonHidden = isActionButtonHidden(info);
            boolean zIsActionDisable = isActionDisable(info);
            boolean zIsGotCoupon = isGotCoupon(info);
            boolean zIsGotoLink = isGotoLink(info);
            String link = info.getLink();
            String str5 = link == null ? "" : link;
            Integer type = info.getType();
            String pricePrefix = info.getPricePrefix();
            String str6 = pricePrefix == null ? "" : pricePrefix;
            String priceSuffix = info.getPriceSuffix();
            String str7 = priceSuffix == null ? "" : priceSuffix;
            String currencyTag = info.getCurrencyTag();
            return new HomeCouponData(code, str, jLongValue, jLongValue2, seniority, str2, str3, discountFee, discountType, str4, btnText, zIsActionButtonHidden, zIsActionDisable, zIsGotCoupon, zIsGotoLink, str5, type, str6, str7, currencyTag == null ? "" : currencyTag, tagOnly, info.getCashGiftNum(), isCanGetBlackCardGif(info), false, info.getDrawCondition(), info.getUseStartTime(), info.getUseEndTime(), info.getUseDays(), info.getEffectUseTime(), isBlackCardCoupon(info), 8388608, null);
        }
    }

    public HomeCouponData() {
        this(null, null, 0L, 0L, null, null, null, null, null, null, null, false, false, false, false, null, null, null, null, null, null, null, false, false, null, null, null, null, null, false, LockFreeTaskQueueCore.MAX_CAPACITY_MASK, null);
    }

    @JvmStatic
    @NotNull
    public static final HomeCouponData fromCouponInfo(@NotNull String str, @NotNull String str2, @NotNull HomeGetCouponListResponse.CouponInfo couponInfo) {
        return INSTANCE.fromCouponInfo(str, str2, couponInfo);
    }

    @JvmStatic
    private static final String getBtnText(HomeGetCouponListResponse.CouponInfo couponInfo) {
        return INSTANCE.getBtnText(couponInfo);
    }

    @JvmStatic
    private static final boolean isActionButtonHidden(HomeGetCouponListResponse.CouponInfo couponInfo) {
        return INSTANCE.isActionButtonHidden(couponInfo);
    }

    @JvmStatic
    private static final boolean isActionDisable(HomeGetCouponListResponse.CouponInfo couponInfo) {
        return INSTANCE.isActionDisable(couponInfo);
    }

    @JvmStatic
    private static final boolean isBlackCardCoupon(HomeGetCouponListResponse.CouponInfo couponInfo) {
        return INSTANCE.isBlackCardCoupon(couponInfo);
    }

    @JvmStatic
    private static final boolean isCanGetBlackCardGif(HomeGetCouponListResponse.CouponInfo couponInfo) {
        return INSTANCE.isCanGetBlackCardGif(couponInfo);
    }

    @JvmStatic
    private static final boolean isGotCoupon(HomeGetCouponListResponse.CouponInfo couponInfo) {
        return INSTANCE.isGotCoupon(couponInfo);
    }

    @JvmStatic
    private static final boolean isGotoLink(HomeGetCouponListResponse.CouponInfo couponInfo) {
        return INSTANCE.isGotoLink(couponInfo);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getAmount() {
        return this.amount;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final boolean getIsActionHidden() {
        return this.isActionHidden;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final boolean getActionDisable() {
        return this.actionDisable;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final boolean getIsGot() {
        return this.isGot;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final boolean getGoToLink() {
        return this.goToLink;
    }

    @NotNull
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getLink() {
        return this.link;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final Integer getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getPricePrefix() {
        return this.pricePrefix;
    }

    @NotNull
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getPriceSuffix() {
        return this.priceSuffix;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCouponMid() {
        return this.couponMid;
    }

    @NotNull
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getCurrencyTag() {
        return this.currencyTag;
    }

    @NotNull
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getTagOnly() {
        return this.tagOnly;
    }

    @Nullable
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final Integer getCashGiftNum() {
        return this.cashGiftNum;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final boolean getIsCanGetBlackCardGif() {
        return this.isCanGetBlackCardGif;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final boolean getIsBlackCardChangeSuccess() {
        return this.isBlackCardChangeSuccess;
    }

    @Nullable
    /* JADX INFO: renamed from: component25, reason: from getter */
    public final Integer getDrawCondition() {
        return this.drawCondition;
    }

    @Nullable
    /* JADX INFO: renamed from: component26, reason: from getter */
    public final Long getUseStartTime() {
        return this.useStartTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component27, reason: from getter */
    public final Long getUseEndTime() {
        return this.useEndTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component28, reason: from getter */
    public final Integer getUseDays() {
        return this.useDays;
    }

    @NotNull
    /* JADX INFO: renamed from: component29, reason: from getter */
    public final String getEffectUseTime() {
        return this.effectUseTime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getCouponActivityId() {
        return this.couponActivityId;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final boolean getIsBlackCardCoupon() {
        return this.isBlackCardCoupon;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getCredits() {
        return this.credits;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getMemberType() {
        return this.memberType;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getUseCondition() {
        return this.useCondition;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getUseScope() {
        return this.useScope;
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
    public final HomeCouponData copy(@NotNull String code, @NotNull String couponMid, long couponActivityId, long credits, @NotNull String memberType, @NotNull String useCondition, @NotNull String useScope, @Nullable Double discountFee, @Nullable Integer discountType, @NotNull String amount, @NotNull String action, boolean isActionHidden, boolean actionDisable, boolean isGot, boolean goToLink, @NotNull String link, @Nullable Integer type, @NotNull String pricePrefix, @NotNull String priceSuffix, @NotNull String currencyTag, @NotNull String tagOnly, @Nullable Integer cashGiftNum, boolean isCanGetBlackCardGif, boolean isBlackCardChangeSuccess, @Nullable Integer drawCondition, @Nullable Long useStartTime, @Nullable Long useEndTime, @Nullable Integer useDays, @NotNull String effectUseTime, boolean isBlackCardCoupon) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(couponMid, "couponMid");
        Intrinsics.checkNotNullParameter(memberType, "memberType");
        Intrinsics.checkNotNullParameter(useCondition, "useCondition");
        Intrinsics.checkNotNullParameter(useScope, "useScope");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(pricePrefix, "pricePrefix");
        Intrinsics.checkNotNullParameter(priceSuffix, "priceSuffix");
        Intrinsics.checkNotNullParameter(currencyTag, "currencyTag");
        Intrinsics.checkNotNullParameter(tagOnly, "tagOnly");
        Intrinsics.checkNotNullParameter(effectUseTime, "effectUseTime");
        return new HomeCouponData(code, couponMid, couponActivityId, credits, memberType, useCondition, useScope, discountFee, discountType, amount, action, isActionHidden, actionDisable, isGot, goToLink, link, type, pricePrefix, priceSuffix, currencyTag, tagOnly, cashGiftNum, isCanGetBlackCardGif, isBlackCardChangeSuccess, drawCondition, useStartTime, useEndTime, useDays, effectUseTime, isBlackCardCoupon);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HomeCouponData)) {
            return false;
        }
        HomeCouponData homeCouponData = (HomeCouponData) other;
        return Intrinsics.areEqual(this.code, homeCouponData.code) && Intrinsics.areEqual(this.couponMid, homeCouponData.couponMid) && this.couponActivityId == homeCouponData.couponActivityId && this.credits == homeCouponData.credits && Intrinsics.areEqual(this.memberType, homeCouponData.memberType) && Intrinsics.areEqual(this.useCondition, homeCouponData.useCondition) && Intrinsics.areEqual(this.useScope, homeCouponData.useScope) && Intrinsics.areEqual((Object) this.discountFee, (Object) homeCouponData.discountFee) && Intrinsics.areEqual(this.discountType, homeCouponData.discountType) && Intrinsics.areEqual(this.amount, homeCouponData.amount) && Intrinsics.areEqual(this.action, homeCouponData.action) && this.isActionHidden == homeCouponData.isActionHidden && this.actionDisable == homeCouponData.actionDisable && this.isGot == homeCouponData.isGot && this.goToLink == homeCouponData.goToLink && Intrinsics.areEqual(this.link, homeCouponData.link) && Intrinsics.areEqual(this.type, homeCouponData.type) && Intrinsics.areEqual(this.pricePrefix, homeCouponData.pricePrefix) && Intrinsics.areEqual(this.priceSuffix, homeCouponData.priceSuffix) && Intrinsics.areEqual(this.currencyTag, homeCouponData.currencyTag) && Intrinsics.areEqual(this.tagOnly, homeCouponData.tagOnly) && Intrinsics.areEqual(this.cashGiftNum, homeCouponData.cashGiftNum) && this.isCanGetBlackCardGif == homeCouponData.isCanGetBlackCardGif && this.isBlackCardChangeSuccess == homeCouponData.isBlackCardChangeSuccess && Intrinsics.areEqual(this.drawCondition, homeCouponData.drawCondition) && Intrinsics.areEqual(this.useStartTime, homeCouponData.useStartTime) && Intrinsics.areEqual(this.useEndTime, homeCouponData.useEndTime) && Intrinsics.areEqual(this.useDays, homeCouponData.useDays) && Intrinsics.areEqual(this.effectUseTime, homeCouponData.effectUseTime) && this.isBlackCardCoupon == homeCouponData.isBlackCardCoupon;
    }

    @NotNull
    public final String getAction() {
        return this.action;
    }

    public final boolean getActionDisable() {
        return this.actionDisable;
    }

    @NotNull
    public final String getAmount() {
        return this.amount;
    }

    @Nullable
    public final Integer getCashGiftNum() {
        return this.cashGiftNum;
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    public final long getCouponActivityId() {
        return this.couponActivityId;
    }

    @NotNull
    public final String getCouponMid() {
        return this.couponMid;
    }

    public final long getCredits() {
        return this.credits;
    }

    @NotNull
    public final String getCurrencyTag() {
        return this.currencyTag;
    }

    @Nullable
    public final Double getDiscountFee() {
        return this.discountFee;
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

    public final boolean getGoToLink() {
        return this.goToLink;
    }

    @NotNull
    public final String getLink() {
        return this.link;
    }

    @NotNull
    public final String getMemberType() {
        return this.memberType;
    }

    @NotNull
    public final String getPricePrefix() {
        return this.pricePrefix;
    }

    @NotNull
    public final String getPriceSuffix() {
        return this.priceSuffix;
    }

    @NotNull
    public final String getTagOnly() {
        return this.tagOnly;
    }

    @Nullable
    public final Integer getType() {
        return this.type;
    }

    @NotNull
    public final String getUseCondition() {
        return this.useCondition;
    }

    @Nullable
    public final Integer getUseDays() {
        return this.useDays;
    }

    @Nullable
    public final Long getUseEndTime() {
        return this.useEndTime;
    }

    @NotNull
    public final String getUseScope() {
        return this.useScope;
    }

    @Nullable
    public final Long getUseStartTime() {
        return this.useStartTime;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [int] */
    /* JADX WARN: Type inference failed for: r0v59, types: [int] */
    /* JADX WARN: Type inference failed for: r1v23, types: [int] */
    /* JADX WARN: Type inference failed for: r1v25, types: [int] */
    /* JADX WARN: Type inference failed for: r1v27, types: [int] */
    /* JADX WARN: Type inference failed for: r1v29, types: [int] */
    /* JADX WARN: Type inference failed for: r1v47, types: [int] */
    /* JADX WARN: Type inference failed for: r1v49, types: [int] */
    /* JADX WARN: Type inference failed for: r1v65 */
    /* JADX WARN: Type inference failed for: r1v66 */
    /* JADX WARN: Type inference failed for: r1v69 */
    /* JADX WARN: Type inference failed for: r1v70 */
    /* JADX WARN: Type inference failed for: r1v71 */
    /* JADX WARN: Type inference failed for: r1v72 */
    /* JADX WARN: Type inference failed for: r1v75 */
    /* JADX WARN: Type inference failed for: r1v76 */
    /* JADX WARN: Type inference failed for: r1v77 */
    /* JADX WARN: Type inference failed for: r1v78 */
    /* JADX WARN: Type inference failed for: r1v79 */
    /* JADX WARN: Type inference failed for: r1v80 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2 */
    public int hashCode() {
        int iHashCode = ((((((((((((this.code.hashCode() * 31) + this.couponMid.hashCode()) * 31) + Long.hashCode(this.couponActivityId)) * 31) + Long.hashCode(this.credits)) * 31) + this.memberType.hashCode()) * 31) + this.useCondition.hashCode()) * 31) + this.useScope.hashCode()) * 31;
        Double d = this.discountFee;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        Integer num = this.discountType;
        int iHashCode3 = (((((iHashCode2 + (num == null ? 0 : num.hashCode())) * 31) + this.amount.hashCode()) * 31) + this.action.hashCode()) * 31;
        boolean z = this.isActionHidden;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode3 + r1) * 31;
        boolean z2 = this.actionDisable;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int i2 = (i + r2) * 31;
        boolean z3 = this.isGot;
        ?? r3 = z3;
        if (z3) {
            r3 = 1;
        }
        int i3 = (i2 + r3) * 31;
        boolean z4 = this.goToLink;
        ?? r4 = z4;
        if (z4) {
            r4 = 1;
        }
        int iHashCode4 = (((i3 + r4) * 31) + this.link.hashCode()) * 31;
        Integer num2 = this.type;
        int iHashCode5 = (((((((((iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31) + this.pricePrefix.hashCode()) * 31) + this.priceSuffix.hashCode()) * 31) + this.currencyTag.hashCode()) * 31) + this.tagOnly.hashCode()) * 31;
        Integer num3 = this.cashGiftNum;
        int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        boolean z5 = this.isCanGetBlackCardGif;
        ?? r5 = z5;
        if (z5) {
            r5 = 1;
        }
        int i4 = (iHashCode6 + r5) * 31;
        boolean z6 = this.isBlackCardChangeSuccess;
        ?? r6 = z6;
        if (z6) {
            r6 = 1;
        }
        int i5 = (i4 + r6) * 31;
        Integer num4 = this.drawCondition;
        int iHashCode7 = (i5 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Long l2 = this.useStartTime;
        int iHashCode8 = (iHashCode7 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.useEndTime;
        int iHashCode9 = (iHashCode8 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Integer num5 = this.useDays;
        int iHashCode10 = (((iHashCode9 + (num5 != null ? num5.hashCode() : 0)) * 31) + this.effectUseTime.hashCode()) * 31;
        boolean z7 = this.isBlackCardCoupon;
        return iHashCode10 + (z7 ? 1 : z7);
    }

    public final boolean isActionHidden() {
        return this.isActionHidden;
    }

    public final boolean isBlackCardChangeSuccess() {
        return this.isBlackCardChangeSuccess;
    }

    public final boolean isGot() {
        return this.isGot;
    }

    public final void setAction(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.action = str;
    }

    public final void setActionDisable(boolean z) {
        this.actionDisable = z;
    }

    public final void setActionHidden(boolean z) {
        this.isActionHidden = z;
    }

    public final void setAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.amount = str;
    }

    public final void setBlackCardChangeSuccess(boolean z) {
        this.isBlackCardChangeSuccess = z;
    }

    public final void setCanGetBlackCardGif(boolean z) {
        this.isCanGetBlackCardGif = z;
    }

    public final void setCurrencyTag(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.currencyTag = str;
    }

    public final void setGoToLink(boolean z) {
        this.goToLink = z;
    }

    public final void setGot(boolean z) {
        this.isGot = z;
    }

    public final void setPriceSuffix(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.priceSuffix = str;
    }

    @NotNull
    public String toString() {
        return "HomeCouponData(code=" + this.code + ", couponMid=" + this.couponMid + ", couponActivityId=" + this.couponActivityId + ", credits=" + this.credits + ", memberType=" + this.memberType + ", useCondition=" + this.useCondition + ", useScope=" + this.useScope + ", discountFee=" + this.discountFee + ", discountType=" + this.discountType + ", amount=" + this.amount + ", action=" + this.action + ", isActionHidden=" + this.isActionHidden + ", actionDisable=" + this.actionDisable + ", isGot=" + this.isGot + ", goToLink=" + this.goToLink + ", link=" + this.link + ", type=" + this.type + ", pricePrefix=" + this.pricePrefix + ", priceSuffix=" + this.priceSuffix + ", currencyTag=" + this.currencyTag + ", tagOnly=" + this.tagOnly + ", cashGiftNum=" + this.cashGiftNum + ", isCanGetBlackCardGif=" + this.isCanGetBlackCardGif + ", isBlackCardChangeSuccess=" + this.isBlackCardChangeSuccess + ", drawCondition=" + this.drawCondition + ", useStartTime=" + this.useStartTime + ", useEndTime=" + this.useEndTime + ", useDays=" + this.useDays + ", effectUseTime=" + this.effectUseTime + ", isBlackCardCoupon=" + this.isBlackCardCoupon + ')';
    }

    public HomeCouponData(@NotNull String code, @NotNull String couponMid, long j2, long j3, @NotNull String memberType, @NotNull String useCondition, @NotNull String useScope, @Nullable Double d, @Nullable Integer num, @NotNull String amount, @NotNull String action, boolean z, boolean z2, boolean z3, boolean z4, @NotNull String link, @Nullable Integer num2, @NotNull String pricePrefix, @NotNull String priceSuffix, @NotNull String currencyTag, @NotNull String tagOnly, @Nullable Integer num3, boolean z5, boolean z6, @Nullable Integer num4, @Nullable Long l2, @Nullable Long l3, @Nullable Integer num5, @NotNull String effectUseTime, boolean z7) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(couponMid, "couponMid");
        Intrinsics.checkNotNullParameter(memberType, "memberType");
        Intrinsics.checkNotNullParameter(useCondition, "useCondition");
        Intrinsics.checkNotNullParameter(useScope, "useScope");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(pricePrefix, "pricePrefix");
        Intrinsics.checkNotNullParameter(priceSuffix, "priceSuffix");
        Intrinsics.checkNotNullParameter(currencyTag, "currencyTag");
        Intrinsics.checkNotNullParameter(tagOnly, "tagOnly");
        Intrinsics.checkNotNullParameter(effectUseTime, "effectUseTime");
        this.code = code;
        this.couponMid = couponMid;
        this.couponActivityId = j2;
        this.credits = j3;
        this.memberType = memberType;
        this.useCondition = useCondition;
        this.useScope = useScope;
        this.discountFee = d;
        this.discountType = num;
        this.amount = amount;
        this.action = action;
        this.isActionHidden = z;
        this.actionDisable = z2;
        this.isGot = z3;
        this.goToLink = z4;
        this.link = link;
        this.type = num2;
        this.pricePrefix = pricePrefix;
        this.priceSuffix = priceSuffix;
        this.currencyTag = currencyTag;
        this.tagOnly = tagOnly;
        this.cashGiftNum = num3;
        this.isCanGetBlackCardGif = z5;
        this.isBlackCardChangeSuccess = z6;
        this.drawCondition = num4;
        this.useStartTime = l2;
        this.useEndTime = l3;
        this.useDays = num5;
        this.effectUseTime = effectUseTime;
        this.isBlackCardCoupon = z7;
    }

    public final boolean isBlackCardCoupon() {
        return this.isBlackCardCoupon;
    }

    public final boolean isCanGetBlackCardGif() {
        return this.isCanGetBlackCardGif;
    }

    public /* synthetic */ HomeCouponData(String str, String str2, long j2, long j3, String str3, String str4, String str5, Double d, Integer num, String str6, String str7, boolean z, boolean z2, boolean z3, boolean z4, String str8, Integer num2, String str9, String str10, String str11, String str12, Integer num3, boolean z5, boolean z6, Integer num4, Long l2, Long l3, Integer num5, String str13, boolean z7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? 0L : j2, (i & 8) != 0 ? 0L : j3, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? "" : str5, (i & 128) != 0 ? null : d, (i & 256) != 0 ? 0 : num, (i & 512) != 0 ? "" : str6, (i & 1024) != 0 ? "" : str7, (i & 2048) != 0 ? false : z, (i & 4096) != 0 ? false : z2, (i & 8192) != 0 ? false : z3, (i & 16384) != 0 ? false : z4, (i & 32768) != 0 ? "" : str8, (i & 65536) != 0 ? 0 : num2, (i & 131072) != 0 ? "" : str9, (i & 262144) != 0 ? "" : str10, (i & 524288) != 0 ? "" : str11, (i & 1048576) != 0 ? "" : str12, (i & 2097152) != 0 ? 0 : num3, (i & 4194304) != 0 ? false : z5, (i & 8388608) != 0 ? false : z6, (i & 16777216) != 0 ? null : num4, (i & 33554432) != 0 ? 0L : l2, (i & 67108864) != 0 ? 0L : l3, (i & 134217728) != 0 ? 0 : num5, (i & 268435456) != 0 ? "" : str13, (i & 536870912) == 0 ? z7 : false);
    }
}
