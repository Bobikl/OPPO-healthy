package com.heytap.store.homemodule.data.coupon;

import com.heytap.health.watch.netnumber.callinterception.AbsCallInterceptionHandlerKt;
import com.heytap.store.home.R;
import com.heytap.store.homemodule.data.Meta;
import com.heytap.store.homemodule.data.protobuf.CouponsResult;
import com.heytap.store.homemodule.data.protobuf.CouponsResultForm;
import com.heytap.store.platform.tools.ContextGetterUtils;
import com.platform.usercenter.bizuws.executor.dialog.ShowDialogExecutor;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.TuplesKt;
import p010kotlin.collections.MapsKt__MapsKt;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b)\b\u0086\b\u0018\u0000 32\u00020\u0001:\u00013Bs\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000b¢\u0006\u0002\u0010\u0011J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u000bHÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0007HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u000bHÆ\u0003J\t\u0010+\u001a\u00020\u0007HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003Jw\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u000bHÆ\u0001J\u0013\u0010/\u001a\u00020\u00072\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u00020\u000bHÖ\u0001J\t\u00102\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0010\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013R\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!¨\u00064"}, d2 = {"Lcom/heytap/store/homemodule/data/coupon/HomeGetCouponResult;", "", "code", "", "couponActivityId", "", "success", "", "errorMessage", "errorType", "errorTypeLocal", "", ShowDialogExecutor.SHOW_DIALOG, "positiveText", "negativeText", "link", "drawCondition", "(Ljava/lang/String;JZLjava/lang/String;Ljava/lang/String;IZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getCode", "()Ljava/lang/String;", "getCouponActivityId", "()J", "getDrawCondition", "()I", "setDrawCondition", "(I)V", "getErrorMessage", "getErrorType", "getErrorTypeLocal", "getLink", "getNegativeText", "getPositiveText", "getShowDialog", "()Z", "getSuccess", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "Companion", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class HomeGetCouponResult {
    private static final int ERROR_TYPE_BLACK_CARD_NO = 7000006;
    private static final int ERROR_TYPE_BLACK_CARD_NO_ENOUGH_MONEY = 7000005;
    private static final int ERROR_TYPE_LACK_OF_CREDIT = 7000002;
    private static final int ERROR_TYPE_LEVEL_UNREACHED = 7000001;
    public static final int ERROR_TYPE_LOCAL_COUPON_BLACK_CARD_GIFT_NO_MONEY = 8;
    public static final int ERROR_TYPE_LOCAL_COUPON_NOT_EXIST = 7;
    public static final int ERROR_TYPE_LOCAL_COUPON_NO_BLACK_CARD = 9;
    public static final int ERROR_TYPE_LOCAL_LACK_OF_CREDIT = 4;
    public static final int ERROR_TYPE_LOCAL_MEMBER_TYPE = 3;
    public static final int ERROR_TYPE_LOCAL_NON_MEMBERS = 2;
    public static final int ERROR_TYPE_LOCAL_OTHER = 6;
    public static final int ERROR_TYPE_LOCAL_OUT_OF_STACK = 1;
    public static final int ERROR_TYPE_LOCAL_RECEIVED = 5;
    public static final int ERROR_TYPE_LOCAL_UNKNOWN = 0;
    private static final int ERROR_TYPE_OTHER = 1000005;

    @NotNull
    private final String code;
    private final long couponActivityId;
    private int drawCondition;

    @NotNull
    private final String errorMessage;

    @NotNull
    private final String errorType;
    private final int errorTypeLocal;

    @NotNull
    private final String link;

    @NotNull
    private final String negativeText;

    @NotNull
    private final String positiveText;
    private final boolean showDialog;
    private final boolean success;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Map<String, Integer> errorTypeLocalMap = MapsKt__MapsKt.mapOf(TuplesKt.to("coupons_not_count", 1), TuplesKt.to("coupons_draw_not_heytap", 2), TuplesKt.to("coupons_SecKill_user_not_grade", 3), TuplesKt.to("coupons_draw_not_credits", 4), TuplesKt.to("coupons_is_draw", 5), TuplesKt.to("coupons_draw_fail", 6), TuplesKt.to("coupons_not_exist", 7));

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001cH\u0007J\u0018\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u0004H\u0003J\u0018\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u0004H\u0003J\u0010\u0010 \u001a\u00020!2\u0006\u0010\u0018\u001a\u00020\u0019H\u0003J\u0018\u0010\"\u001a\u00020!2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u0004H\u0003R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00040\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/heytap/store/homemodule/data/coupon/HomeGetCouponResult$Companion;", "", "()V", "ERROR_TYPE_BLACK_CARD_NO", "", "ERROR_TYPE_BLACK_CARD_NO_ENOUGH_MONEY", "ERROR_TYPE_LACK_OF_CREDIT", "ERROR_TYPE_LEVEL_UNREACHED", "ERROR_TYPE_LOCAL_COUPON_BLACK_CARD_GIFT_NO_MONEY", "ERROR_TYPE_LOCAL_COUPON_NOT_EXIST", "ERROR_TYPE_LOCAL_COUPON_NO_BLACK_CARD", "ERROR_TYPE_LOCAL_LACK_OF_CREDIT", "ERROR_TYPE_LOCAL_MEMBER_TYPE", "ERROR_TYPE_LOCAL_NON_MEMBERS", "ERROR_TYPE_LOCAL_OTHER", "ERROR_TYPE_LOCAL_OUT_OF_STACK", "ERROR_TYPE_LOCAL_RECEIVED", "ERROR_TYPE_LOCAL_UNKNOWN", "ERROR_TYPE_OTHER", "errorTypeLocalMap", "", "", "fromGetCouponResponse", "Lcom/heytap/store/homemodule/data/coupon/HomeGetCouponResult;", AbsCallInterceptionHandlerKt.GSON_KEY_RESPONSE, "Lcom/heytap/store/homemodule/data/protobuf/CouponsResult;", "code", "couponActivityId", "", "getNegativeText", "errorTypeLocal", "getPositiveText", "isShowDialog", "", "needShowPositiveText", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final String getNegativeText(CouponsResult response, int errorTypeLocal) {
            if (!isShowDialog(response)) {
                return "";
            }
            String string = needShowPositiveText(response, errorTypeLocal) ? ContextGetterUtils.INSTANCE.getApp().getResources().getString(R.string.pf_home_coupon_cancel) : ContextGetterUtils.INSTANCE.getApp().getResources().getString(R.string.pf_home_coupon_understood);
            Intrinsics.checkNotNullExpressionValue(string, "{\n                if (ne…          }\n            }");
            return string;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final String getPositiveText(CouponsResult response, int errorTypeLocal) {
            CouponsResultForm couponsResultForm;
            String str;
            return (!needShowPositiveText(response, errorTypeLocal) || (couponsResultForm = response.couponResult) == null || (str = couponsResultForm.text) == null) ? "" : str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final boolean isShowDialog(CouponsResult response) {
            Boolean bool;
            CouponsResultForm couponsResultForm = response.couponResult;
            if (couponsResultForm == null || (bool = couponsResultForm.isShow) == null) {
                return false;
            }
            return bool.booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final boolean needShowPositiveText(CouponsResult response, int errorTypeLocal) {
            if (!isShowDialog(response)) {
                return false;
            }
            if (errorTypeLocal == 2) {
                CouponsResultForm couponsResultForm = response.couponResult;
                String str = couponsResultForm == null ? null : couponsResultForm.link;
                if (str == null || StringsKt__StringsJVMKt.isBlank(str)) {
                    return false;
                }
            }
            return true;
        }

        @JvmStatic
        @NotNull
        public final HomeGetCouponResult fromGetCouponResponse(@NotNull CouponsResult response, @NotNull String code, long couponActivityId) {
            Integer num;
            Integer num2;
            String str;
            String str2;
            String str3;
            Integer num3;
            Integer num4;
            String str4;
            String str5;
            String str6;
            String str7;
            Intrinsics.checkNotNullParameter(response, "response");
            Intrinsics.checkNotNullParameter(code, "code");
            Meta meta = response.meta;
            int iIntValue = HomeGetCouponResult.ERROR_TYPE_OTHER;
            if (((meta == null || (num = meta.code) == null) ? HomeGetCouponResult.ERROR_TYPE_OTHER : num.intValue()) == 200) {
                return new HomeGetCouponResult(code, couponActivityId, true, null, null, 0, false, null, null, null, 0, 2040, null);
            }
            Meta meta2 = response.meta;
            if (((meta2 == null || (num2 = meta2.code) == null) ? HomeGetCouponResult.ERROR_TYPE_OTHER : num2.intValue()) != HomeGetCouponResult.ERROR_TYPE_BLACK_CARD_NO_ENOUGH_MONEY) {
                Meta meta3 = response.meta;
                if (((meta3 == null || (num4 = meta3.code) == null) ? HomeGetCouponResult.ERROR_TYPE_OTHER : num4.intValue()) != HomeGetCouponResult.ERROR_TYPE_BLACK_CARD_NO) {
                    Map map = HomeGetCouponResult.errorTypeLocalMap;
                    Meta meta4 = response.meta;
                    if (meta4 == null || (str4 = meta4.errorType) == null) {
                        str4 = "";
                    }
                    Integer num5 = (Integer) map.get(str4);
                    int iIntValue2 = num5 == null ? 0 : num5.intValue();
                    boolean z = false;
                    Meta meta5 = response.meta;
                    String str8 = (meta5 == null || (str5 = meta5.errorMessage) == null) ? "" : str5;
                    String str9 = (meta5 == null || (str6 = meta5.errorType) == null) ? "" : str6;
                    boolean zIsShowDialog = isShowDialog(response);
                    String positiveText = getPositiveText(response, iIntValue2);
                    String negativeText = getNegativeText(response, iIntValue2);
                    CouponsResultForm couponsResultForm = response.couponResult;
                    return new HomeGetCouponResult(code, couponActivityId, z, str8, str9, iIntValue2, zIsShowDialog, positiveText, negativeText, (couponsResultForm == null || (str7 = couponsResultForm.link) == null) ? "" : str7, 0, 1024, null);
                }
            }
            Meta meta6 = response.meta;
            if (meta6 != null && (num3 = meta6.code) != null) {
                iIntValue = num3.intValue();
            }
            int i = iIntValue == HomeGetCouponResult.ERROR_TYPE_BLACK_CARD_NO_ENOUGH_MONEY ? 8 : 9;
            boolean z2 = false;
            Meta meta7 = response.meta;
            String str10 = (meta7 == null || (str = meta7.errorMessage) == null) ? "" : str;
            String str11 = (meta7 == null || (str2 = meta7.errorType) == null) ? "" : str2;
            boolean z3 = false;
            String str12 = "";
            String str13 = "";
            CouponsResultForm couponsResultForm2 = response.couponResult;
            return new HomeGetCouponResult(code, couponActivityId, z2, str10, str11, i, z3, str12, str13, (couponsResultForm2 == null || (str3 = couponsResultForm2.link) == null) ? "" : str3, 0, 1024, null);
        }
    }

    public HomeGetCouponResult() {
        this(null, 0L, false, null, null, 0, false, null, null, null, 0, 2047, null);
    }

    @JvmStatic
    @NotNull
    public static final HomeGetCouponResult fromGetCouponResponse(@NotNull CouponsResult couponsResult, @NotNull String str, long j2) {
        return INSTANCE.fromGetCouponResponse(couponsResult, str, j2);
    }

    @JvmStatic
    private static final String getNegativeText(CouponsResult couponsResult, int i) {
        return INSTANCE.getNegativeText(couponsResult, i);
    }

    @JvmStatic
    private static final String getPositiveText(CouponsResult couponsResult, int i) {
        return INSTANCE.getPositiveText(couponsResult, i);
    }

    @JvmStatic
    private static final boolean isShowDialog(CouponsResult couponsResult) {
        return INSTANCE.isShowDialog(couponsResult);
    }

    @JvmStatic
    private static final boolean needShowPositiveText(CouponsResult couponsResult, int i) {
        return INSTANCE.needShowPositiveText(couponsResult, i);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getLink() {
        return this.link;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getDrawCondition() {
        return this.drawCondition;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getCouponActivityId() {
        return this.couponActivityId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getErrorType() {
        return this.errorType;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getErrorTypeLocal() {
        return this.errorTypeLocal;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getShowDialog() {
        return this.showDialog;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getPositiveText() {
        return this.positiveText;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getNegativeText() {
        return this.negativeText;
    }

    @NotNull
    public final HomeGetCouponResult copy(@NotNull String code, long couponActivityId, boolean success, @NotNull String errorMessage, @NotNull String errorType, int errorTypeLocal, boolean showDialog, @NotNull String positiveText, @NotNull String negativeText, @NotNull String link, int drawCondition) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        Intrinsics.checkNotNullParameter(errorType, "errorType");
        Intrinsics.checkNotNullParameter(positiveText, "positiveText");
        Intrinsics.checkNotNullParameter(negativeText, "negativeText");
        Intrinsics.checkNotNullParameter(link, "link");
        return new HomeGetCouponResult(code, couponActivityId, success, errorMessage, errorType, errorTypeLocal, showDialog, positiveText, negativeText, link, drawCondition);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HomeGetCouponResult)) {
            return false;
        }
        HomeGetCouponResult homeGetCouponResult = (HomeGetCouponResult) other;
        return Intrinsics.areEqual(this.code, homeGetCouponResult.code) && this.couponActivityId == homeGetCouponResult.couponActivityId && this.success == homeGetCouponResult.success && Intrinsics.areEqual(this.errorMessage, homeGetCouponResult.errorMessage) && Intrinsics.areEqual(this.errorType, homeGetCouponResult.errorType) && this.errorTypeLocal == homeGetCouponResult.errorTypeLocal && this.showDialog == homeGetCouponResult.showDialog && Intrinsics.areEqual(this.positiveText, homeGetCouponResult.positiveText) && Intrinsics.areEqual(this.negativeText, homeGetCouponResult.negativeText) && Intrinsics.areEqual(this.link, homeGetCouponResult.link) && this.drawCondition == homeGetCouponResult.drawCondition;
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    public final long getCouponActivityId() {
        return this.couponActivityId;
    }

    public final int getDrawCondition() {
        return this.drawCondition;
    }

    @NotNull
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @NotNull
    public final String getErrorType() {
        return this.errorType;
    }

    public final int getErrorTypeLocal() {
        return this.errorTypeLocal;
    }

    @NotNull
    public final String getLink() {
        return this.link;
    }

    public final boolean getShowDialog() {
        return this.showDialog;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = ((this.code.hashCode() * 31) + Long.hashCode(this.couponActivityId)) * 31;
        boolean z = this.success;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int iHashCode2 = (((((((iHashCode + r1) * 31) + this.errorMessage.hashCode()) * 31) + this.errorType.hashCode()) * 31) + Integer.hashCode(this.errorTypeLocal)) * 31;
        boolean z2 = this.showDialog;
        return ((((((((iHashCode2 + (z2 ? 1 : z2)) * 31) + this.positiveText.hashCode()) * 31) + this.negativeText.hashCode()) * 31) + this.link.hashCode()) * 31) + Integer.hashCode(this.drawCondition);
    }

    public final void setDrawCondition(int i) {
        this.drawCondition = i;
    }

    @NotNull
    public String toString() {
        return "HomeGetCouponResult(code=" + this.code + ", couponActivityId=" + this.couponActivityId + ", success=" + this.success + ", errorMessage=" + this.errorMessage + ", errorType=" + this.errorType + ", errorTypeLocal=" + this.errorTypeLocal + ", showDialog=" + this.showDialog + ", positiveText=" + this.positiveText + ", negativeText=" + this.negativeText + ", link=" + this.link + ", drawCondition=" + this.drawCondition + ')';
    }

    public HomeGetCouponResult(@NotNull String code, long j2, boolean z, @NotNull String errorMessage, @NotNull String errorType, int i, boolean z2, @NotNull String positiveText, @NotNull String negativeText, @NotNull String link, int i2) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        Intrinsics.checkNotNullParameter(errorType, "errorType");
        Intrinsics.checkNotNullParameter(positiveText, "positiveText");
        Intrinsics.checkNotNullParameter(negativeText, "negativeText");
        Intrinsics.checkNotNullParameter(link, "link");
        this.code = code;
        this.couponActivityId = j2;
        this.success = z;
        this.errorMessage = errorMessage;
        this.errorType = errorType;
        this.errorTypeLocal = i;
        this.showDialog = z2;
        this.positiveText = positiveText;
        this.negativeText = negativeText;
        this.link = link;
        this.drawCondition = i2;
    }

    @NotNull
    public final String getNegativeText() {
        return this.negativeText;
    }

    @NotNull
    public final String getPositiveText() {
        return this.positiveText;
    }

    public /* synthetic */ HomeGetCouponResult(String str, long j2, boolean z, String str2, String str3, int i, boolean z2, String str4, String str5, String str6, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? 0L : j2, (i3 & 4) != 0 ? false : z, (i3 & 8) != 0 ? "" : str2, (i3 & 16) != 0 ? "" : str3, (i3 & 32) != 0 ? 0 : i, (i3 & 64) == 0 ? z2 : false, (i3 & 128) != 0 ? "" : str4, (i3 & 256) != 0 ? "" : str5, (i3 & 512) == 0 ? str6 : "", (i3 & 1024) != 0 ? -1 : i2);
    }
}
