package com.oplus.aiunit.vision;

import android.content.Context;
import android.text.TextUtils;
import com.google.i18n.phonenumbers.NumberParseException;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.Phonenumber;
import com.oplus.phonenoareainquire.PhoneNoInquireProvider;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b!\u0010\"J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0005\u001a\u00020\u0004H\u0003J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0007J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007J\u0010\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0007J$\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\tH\u0007J<\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\tH\u0007R\u0014\u0010\u0019\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u001eR\u0016\u0010 \u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u001a¨\u0006#"}, d2 = {"Lcom/oplus/aiunit/vision/cke;", "", "", "c", "", "e", "latestVersion", "b", rde.KEY_COUNTRY_CODE, "", "nationalNumber", "", "f", "", "rawNumber", "d", "Landroid/content/Context;", "context", "phoneNumber", "countryIso", "a", "carrierName", "location", "hasLocation", "g", "MIN_SHOW_INFORMATION_LEN", "I", "CARRIER_DATA_VERSION_FOR_ASSETS", "MAX_PARSE_NUMBER_LEN", "Ljava/util/regex/Pattern;", "Ljava/util/regex/Pattern;", "mobilePattern", "carrierDataVersionForAppData", "<init>", "()V", "contactnetnumber_impl_thirdRelease"}, k = 1, mv = {1, 8, 0})
public final class cke {
    public static final int CARRIER_DATA_VERSION_FOR_ASSETS = 2;
    public static final int MAX_PARSE_NUMBER_LEN = 17;
    public static final int MIN_SHOW_INFORMATION_LEN = 7;

    @Nullable
    public static Pattern a;

    @NotNull
    public static final cke INSTANCE = new cke();
    public static int b = -1;

    @JvmStatic
    public static final boolean a(@Nullable Context context, @NotNull String phoneNumber, @Nullable String countryIso) {
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        if (phoneNumber.length() > 17) {
            phoneNumber = phoneNumber.substring(0, 17);
            Intrinsics.checkNotNullExpressionValue(phoneNumber, "substring(...)");
        }
        try {
            if (TextUtils.isEmpty(countryIso)) {
                countryIso = lb4.b(context).a();
            }
            Phonenumber.PhoneNumber andKeepRawInput = PhoneNumberUtil.getInstance().parseAndKeepRawInput(phoneNumber, countryIso);
            return andKeepRawInput != null && String.valueOf(andKeepRawInput.getNationalNumber()).length() >= 7;
        } catch (NumberParseException e) {
            g3e.b("PhoneNumberCarrierUtil", "e=" + e);
        }
    }

    @JvmStatic
    public static final void b(int latestVersion) {
        a = null;
        b = latestVersion;
        eke.b().a();
    }

    @JvmStatic
    public static final int c() {
        if (b == -1) {
            b = pnk.d(pnk.e(PhoneNoInquireProvider.getDataFilePath() + "carrier_data"));
        }
        return b;
    }

    @JvmStatic
    @NotNull
    public static final String d(long rawNumber) {
        String strValueOf = String.valueOf(rawNumber);
        int length = 11 - strValueOf.length();
        if (strValueOf.length() < 7 || length <= 0) {
            if (length >= 0) {
                return strValueOf;
            }
            String strSubstring = strValueOf.substring(0, 11);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            return strSubstring;
        }
        StringBuilder sb = new StringBuilder(strValueOf);
        char[] cArr = new char[length];
        Arrays.fill(cArr, '0');
        sb.append(new String(cArr));
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "num.append(String(zeros)).toString()");
        return string;
    }

    @JvmStatic
    public static final void e() {
        if (a == null) {
            String strD = c() > 2 ? f3e.d() : null;
            if (strD == null || strD.length() == 0) {
                a = Pattern.compile("192\\d{8}");
            } else {
                a = Pattern.compile(strD);
            }
        }
    }

    @JvmStatic
    public static final boolean f(int countryCode, @Nullable String nationalNumber) {
        if (countryCode != 86) {
            return false;
        }
        if (!(nationalNumber != null ? !StringsKt.isBlank(nationalNumber) : false)) {
            return false;
        }
        e();
        Pattern pattern = a;
        Matcher matcher = pattern != null ? pattern.matcher(nationalNumber) : null;
        if (matcher != null) {
            return matcher.lookingAt();
        }
        return false;
    }

    @JvmStatic
    @NotNull
    public static final String g(@NotNull String carrierName, @NotNull String location, boolean hasLocation, @Nullable Context context, @NotNull String phoneNumber, @Nullable String countryIso) {
        Intrinsics.checkNotNullParameter(carrierName, "carrierName");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        if (hasLocation) {
            if (!TextUtils.isEmpty(carrierName)) {
                return location + " " + carrierName;
            }
        } else if (a(context, phoneNumber, countryIso)) {
            return carrierName;
        }
        return location;
    }
}
