package com.heytap.store.base.core.util;

import android.net.Uri;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.heytap.store.base.core.util.deeplink.DeepLinkUrlPath;
import com.heytap.store.base.core.util.statistics.bean.SensorsBean;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsJVMKt;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001f\u0010\f\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0002\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0002\u0010\u0010J\u001c\u0010\u0013\u001a\u00020\u00042\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0015J2\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u00042\u0018\b\u0002\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0015J\u0017\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0002\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u0004H\u0002J\u000e\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u0004J\u000e\u0010 \u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u0004J\u000e\u0010!\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\u0004J\u0010\u0010#\u001a\u00020\n2\u0006\u0010$\u001a\u00020\u0004H\u0002J\u000e\u0010%\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u000b¨\u0006&"}, d2 = {"Lcom/heytap/store/base/core/util/TransformUtils;", "", "()V", "IS_QUICK", "", "QUICK_APP", "QUICK_GAME", "QUICK_LINK", "QUICK_VERSION", "isOPPOPhone", "", "()Z", "formatOriginalPriceStr", "originalPrice", "", "marketPrice", "(Ljava/lang/Double;Ljava/lang/String;)Ljava/lang/String;", "formatPriceStr", SensorsBean.PRICE, "getSearchPageDpUrl", "params", "", "getSplitUrl", "host", "path", "integerValueOrZero", "", TypedValues.Custom.S_INT, "(Ljava/lang/Integer;)I", "isNoSupportQuickLink", "link", "isNoSupportQuickProgram", "isSupportQuickLink", "isWXMiniProgram", "url", "startsWithQuickLink", "quickLink", "subLink", "Core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class TransformUtils {

    @NotNull
    public static final TransformUtils INSTANCE = new TransformUtils();

    @NotNull
    private static final String IS_QUICK = "is_quick=";

    @NotNull
    private static final String QUICK_APP = "hap://app";

    @NotNull
    private static final String QUICK_GAME = "hap://game";

    @NotNull
    private static final String QUICK_LINK = "&quick_link=";

    @NotNull
    private static final String QUICK_VERSION = "&quick_version=";

    private TransformUtils() {
    }

    private final String formatOriginalPriceStr(Double originalPrice, String marketPrice) {
        boolean zIsEmpty = TextUtils.isEmpty(marketPrice);
        String strPriceFormat = "";
        if (zIsEmpty) {
            strPriceFormat = originalPrice != null ? DecimalFormatUtils.priceFormat(originalPrice, false) : "";
            Intrinsics.checkNotNullExpressionValue(strPriceFormat, "{\n            if (origin… false) else \"\"\n        }");
        }
        return strPriceFormat;
    }

    private final String formatPriceStr(Double price, String marketPrice) {
        if (!TextUtils.isEmpty(marketPrice)) {
            return marketPrice;
        }
        String strPriceFormat = price != null ? DecimalFormatUtils.priceFormat(price, false) : "";
        Intrinsics.checkNotNullExpressionValue(strPriceFormat, "{\n            if (price … false) else \"\"\n        }");
        return strPriceFormat;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ String getSplitUrl$default(TransformUtils transformUtils, String str, String str2, Map map, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            map = null;
        }
        return transformUtils.getSplitUrl(str, str2, map);
    }

    private final int integerValueOrZero(Integer integer) {
        if (integer == null) {
            return 0;
        }
        return integer.intValue();
    }

    private final boolean isNoSupportQuickLink(String link) {
        if (TextUtils.isEmpty(link)) {
            return false;
        }
        try {
            if (StringsKt__StringsKt.contains$default((CharSequence) link, (CharSequence) IS_QUICK, false, 2, (Object) null) && StringsKt__StringsKt.contains$default((CharSequence) link, (CharSequence) QUICK_VERSION, false, 2, (Object) null) && StringsKt__StringsKt.contains$default((CharSequence) link, (CharSequence) QUICK_LINK, false, 2, (Object) null)) {
                int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) link, IS_QUICK, 0, false, 6, (Object) null) + 9;
                int iIndexOf$default2 = StringsKt__StringsKt.indexOf$default((CharSequence) link, QUICK_VERSION, 0, false, 6, (Object) null);
                String strSubstring = link.substring(iIndexOf$default, iIndexOf$default2);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                if (!Intrinsics.areEqual("1", strSubstring)) {
                    return false;
                }
                int i = iIndexOf$default2 + 15;
                int iIndexOf$default3 = StringsKt__StringsKt.indexOf$default((CharSequence) link, QUICK_LINK, 0, false, 6, (Object) null);
                if (!QuickAppProxy.getInstance().isInstantPlatformInstalled()) {
                    return true;
                }
                String strSubstring2 = link.substring(i, iIndexOf$default3);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                String instantVersion = QuickAppProxy.getInstance().getInstantVersion();
                Intrinsics.checkNotNullExpressionValue(instantVersion, "getInstance().instantVersion");
                Long lValueOf = Long.valueOf(strSubstring2);
                Intrinsics.checkNotNullExpressionValue(lValueOf, "valueOf(v)");
                long jLongValue = lValueOf.longValue();
                Long lValueOf2 = Long.valueOf(instantVersion);
                Intrinsics.checkNotNullExpressionValue(lValueOf2, "valueOf(platform_version)");
                if (jLongValue > lValueOf2.longValue()) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return true;
        }
    }

    private final boolean isOPPOPhone() {
        return DeviceInfoUtil.isOPPOBrand();
    }

    private final boolean startsWithQuickLink(String quickLink) {
        return TextUtils.isEmpty(quickLink) || StringsKt__StringsJVMKt.startsWith$default(quickLink, QUICK_APP, false, 2, null) || StringsKt__StringsJVMKt.startsWith$default(quickLink, QUICK_GAME, false, 2, null);
    }

    @NotNull
    public final String getSearchPageDpUrl(@NotNull Map<String, ? extends Object> params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return getSplitUrl("oppostore://www.opposhop.cn/app/store/", DeepLinkUrlPath.URL_SEARCH, params);
    }

    @NotNull
    public final String getSplitUrl(@NotNull String host, @NotNull String path, @Nullable Map<String, ? extends Object> params) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(path, "path");
        Uri.Builder builderBuildUpon = Uri.parse(Intrinsics.stringPlus(host, path)).buildUpon();
        if (params != null) {
            for (Map.Entry<String, ? extends Object> entry : params.entrySet()) {
                Object value = entry.getValue();
                if (value != null) {
                    builderBuildUpon.appendQueryParameter(entry.getKey(), value.toString());
                }
            }
        }
        String string = builderBuildUpon.build().toString();
        Intrinsics.checkNotNullExpressionValue(string, "build.build().toString()");
        return string;
    }

    public final boolean isNoSupportQuickProgram(@NotNull String link) {
        Intrinsics.checkNotNullParameter(link, "link");
        return isNoSupportQuickLink(link);
    }

    public final boolean isSupportQuickLink(@NotNull String link) {
        Intrinsics.checkNotNullParameter(link, "link");
        if (TextUtils.isEmpty(link)) {
            return false;
        }
        try {
            if (!StringsKt__StringsKt.contains$default((CharSequence) link, (CharSequence) IS_QUICK, false, 2, (Object) null) || !StringsKt__StringsKt.contains$default((CharSequence) link, (CharSequence) QUICK_VERSION, false, 2, (Object) null) || !StringsKt__StringsKt.contains$default((CharSequence) link, (CharSequence) QUICK_LINK, false, 2, (Object) null)) {
                return false;
            }
            int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) link, IS_QUICK, 0, false, 6, (Object) null) + 9;
            int iIndexOf$default2 = StringsKt__StringsKt.indexOf$default((CharSequence) link, QUICK_VERSION, 0, false, 6, (Object) null);
            String strSubstring = link.substring(iIndexOf$default, iIndexOf$default2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            if (!Intrinsics.areEqual("1", strSubstring)) {
                return false;
            }
            String strSubstring2 = link.substring(iIndexOf$default2 + 15, StringsKt__StringsKt.indexOf$default((CharSequence) link, QUICK_LINK, 0, false, 6, (Object) null));
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
            String instantVersion = QuickAppProxy.getInstance().getInstantVersion();
            Intrinsics.checkNotNullExpressionValue(instantVersion, "getInstance().instantVersion");
            Long lValueOf = Long.valueOf(strSubstring2);
            Intrinsics.checkNotNullExpressionValue(lValueOf, "valueOf(v)");
            long jLongValue = lValueOf.longValue();
            Long lValueOf2 = Long.valueOf(instantVersion);
            Intrinsics.checkNotNullExpressionValue(lValueOf2, "valueOf(platform_version)");
            return jLongValue <= lValueOf2.longValue();
        } catch (Exception unused) {
            return false;
        }
    }

    public final boolean isWXMiniProgram(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return !TextUtils.isEmpty(url) && StringsKt__StringsKt.contains$default((CharSequence) url, (CharSequence) "WXMiniProgramID", false, 2, (Object) null);
    }

    @NotNull
    public final String subLink(@NotNull String link) {
        Intrinsics.checkNotNullParameter(link, "link");
        try {
            if (!TextUtils.isEmpty(link) && StringsKt__StringsKt.contains$default((CharSequence) link, (CharSequence) QUICK_LINK, false, 2, (Object) null)) {
                String strSubstring = link.substring(StringsKt__StringsKt.indexOf$default((CharSequence) link, QUICK_LINK, 0, false, 6, (Object) null) + 12, link.length());
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                if (startsWithQuickLink(strSubstring)) {
                    return strSubstring;
                }
            }
            if (!TextUtils.isEmpty(link) && isWXMiniProgram(link) && StringsKt__StringsKt.contains$default((CharSequence) link, (CharSequence) "www.opposhop.cn/app/store", false, 2, (Object) null)) {
                String strSubstring2 = link.substring(StringsKt__StringsKt.indexOf$default((CharSequence) link, "www.opposhop.cn/app/store", 0, false, 6, (Object) null));
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
                return strSubstring2;
            }
        } catch (Exception unused) {
        }
        return link;
    }
}
