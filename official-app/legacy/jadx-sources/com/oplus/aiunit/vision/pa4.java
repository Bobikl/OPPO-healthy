package com.oplus.aiunit.vision;

import com.heytap.health.bandface.watchface.worldclock.cities.CityBean;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.JvmName;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.Regex;
import p010kotlin.text.StringsKt__StringsJVMKt;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0013\u0018\u0000 &2\u00020\u0001:\u0001\fBQ\b\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0007\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001a\u001a\u00020\u0007\u0012\u0006\u0010\u001b\u001a\u00020\u0007\u0012\u0006\u0010\u001d\u001a\u00020\u0003\u0012\u0006\u0010\u001f\u001a\u00020\u0003\u0012\u0006\u0010!\u001a\u00020\u0003\u0012\u0006\u0010#\u001a\u00020\u0003¢\u0006\u0004\b$\u0010%J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0017J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0010\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0013\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000fR\u0017\u0010\u0017\u001a\u00020\u00148\u0007¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001a\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b\u0019\u0010\r\u001a\u0004\b\u001a\u0010\u000fR\u0017\u0010\u001b\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\u001b\u0010\u000fR\u0017\u0010\u001d\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u001f\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0012\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u0017\u0010!\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\u001eR\u0017\u0010#\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\u001e¨\u0006'"}, d2 = {"Lcom/oplus/aiunit/vision/pa4;", "", "other", "", "equals", "", "hashCode", "", "toString", "forObsoleteRfc2965", "f", "(Z)Ljava/lang/String;", "a", "Ljava/lang/String;", MapSchema.FIELD_NAME_ENTRY, "()Ljava/lang/String;", "name", "b", b2n.f, "value", "", "c", "J", "expiresAt", "()J", "d", "domain", "path", "Z", "secure", "()Z", "httpOnly", b2n.g, "persistent", "i", "hostOnly", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ZZZZ)V", "Companion", "okhttp4_extension_release"}, k = 1, mv = {1, 4, 0})
public final class pa4 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Pattern f15283j = Pattern.compile("(\\d{2,4})[^\\d]*");
    public static final Pattern k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Pattern f15284l = Pattern.compile("(\\d{1,2})[^\\d]*");
    public static final Pattern m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String value;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final long expiresAt;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final String domain;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String path;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final boolean secure;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final boolean httpOnly;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public final boolean persistent;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final boolean hostOnly;

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.pa4$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b%\u0010&J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J)\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0007J\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0002J \u0010\u0018\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0002J(\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0012H\u0002J\u0010\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0004H\u0002J\u0010\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0004H\u0002R\u001c\u0010 \u001a\n \u001f*\u0004\u0018\u00010\u001e0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001c\u0010\"\u001a\n \u001f*\u0004\u0018\u00010\u001e0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010!R\u001c\u0010#\u001a\n \u001f*\u0004\u0018\u00010\u001e0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010!R\u001c\u0010$\u001a\n \u001f*\u0004\u0018\u00010\u001e0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010!¨\u0006'"}, d2 = {"Lcom/oplus/aiunit/vision/pa4$a;", "", "Lcom/oplus/aiunit/vision/uk9;", "url", "", "setCookie", "Lcom/oplus/aiunit/vision/pa4;", "c", "", "currentTimeMillis", "d", "(JLcom/oplus/aiunit/vision/uk9;Ljava/lang/String;)Lcom/oplus/aiunit/vision/pa4;", "Lcom/oplus/aiunit/vision/gj8;", "headers", "", MapSchema.FIELD_NAME_ENTRY, "urlHost", "domain", "", "b", "s", "", CityBean.POS, "limit", b2n.f, "input", "invert", "a", b2n.g, "f", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "DAY_OF_MONTH_PATTERN", "Ljava/util/regex/Pattern;", "MONTH_PATTERN", "TIME_PATTERN", "YEAR_PATTERN", "<init>", "()V", "okhttp4_extension_release"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a(String input, int pos, int limit, boolean invert) {
            while (pos < limit) {
                char cCharAt = input.charAt(pos);
                if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && '9' >= cCharAt) || (('a' <= cCharAt && 'z' >= cCharAt) || (('A' <= cCharAt && 'Z' >= cCharAt) || cCharAt == ':'))) == (!invert)) {
                    return pos;
                }
                pos++;
            }
            return limit;
        }

        public final boolean b(String urlHost, String domain) {
            if (Intrinsics.areEqual(urlHost, domain)) {
                return true;
            }
            return StringsKt__StringsJVMKt.endsWith$default(urlHost, domain, false, 2, null) && urlHost.charAt((urlHost.length() - domain.length()) - 1) == '.' && !sqk.f(urlHost);
        }

        @JvmStatic
        @Nullable
        public final pa4 c(@NotNull uk9 url, @NotNull String setCookie) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(setCookie, "setCookie");
            return d(System.currentTimeMillis(), url, setCookie);
        }

        /* JADX WARN: Code duplicated, block: B:46:0x00dc A[PHI: r1
  0x00dc: PHI (r1v23 long) = (r1v7 long), (r1v11 long) binds: [B:45:0x00da, B:56:0x0102] A[DONT_GENERATE, DONT_INLINE]] */
        @Nullable
        public final pa4 d(long currentTimeMillis, @NotNull uk9 url, @NotNull String setCookie) {
            long j2;
            long j3;
            pa4 pa4Var;
            String str;
            String str2;
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(setCookie, "setCookie");
            int iP = sqk.p(setCookie, ';', 0, 0, 6, null);
            int iP2 = sqk.p(setCookie, kam.h, 0, iP, 2, null);
            if (iP2 == iP) {
                return null;
            }
            String strY = sqk.Y(setCookie, 0, iP2, 1, null);
            if ((strY.length() == 0) || sqk.w(strY) != -1) {
                return null;
            }
            String strX = sqk.X(setCookie, iP2 + 1, iP);
            if (sqk.w(strX) != -1) {
                return null;
            }
            int i = iP + 1;
            int length = setCookie.length();
            String strF = null;
            String str3 = null;
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = true;
            long jH = -1;
            long jG = y05.MAX_DATE;
            while (i < length) {
                int iN = sqk.n(setCookie, ';', i, length);
                int iN2 = sqk.n(setCookie, kam.h, i, iN);
                String strX2 = sqk.X(setCookie, i, iN2);
                String strX3 = iN2 < iN ? sqk.X(setCookie, iN2 + 1, iN) : "";
                if (StringsKt__StringsJVMKt.equals(strX2, "expires", true)) {
                    try {
                        jG = g(strX3, 0, strX3.length());
                        z3 = true;
                    } catch (NumberFormatException | IllegalArgumentException unused) {
                    }
                } else if (StringsKt__StringsJVMKt.equals(strX2, "max-age", true)) {
                    jH = h(strX3);
                    z3 = true;
                } else if (StringsKt__StringsJVMKt.equals(strX2, "domain", true)) {
                    strF = f(strX3);
                    z4 = false;
                } else if (StringsKt__StringsJVMKt.equals(strX2, "path", true)) {
                    str3 = strX3;
                } else if (StringsKt__StringsJVMKt.equals(strX2, "secure", true)) {
                    z = true;
                } else if (StringsKt__StringsJVMKt.equals(strX2, "httponly", true)) {
                    z2 = true;
                }
                i = iN + 1;
            }
            long j4 = Long.MIN_VALUE;
            if (jH == Long.MIN_VALUE) {
                j2 = j4;
            } else if (jH != -1) {
                j4 = currentTimeMillis + (jH <= 9223372036854775L ? jH * ((long) 1000) : Long.MAX_VALUE);
                if (j4 >= currentTimeMillis) {
                    j3 = y05.MAX_DATE;
                    if (j4 <= y05.MAX_DATE) {
                        j2 = j4;
                    }
                } else {
                    j3 = y05.MAX_DATE;
                }
                j2 = j3;
            } else {
                j2 = jG;
            }
            String host = url.getHost();
            if (strF == null) {
                str = host;
                pa4Var = null;
            } else {
                if (!b(host, strF)) {
                    return null;
                }
                pa4Var = null;
                str = strF;
            }
            if (host.length() != str.length() && PublicSuffixDatabase.INSTANCE.c().e(str) == null) {
                return pa4Var;
            }
            String strSubstring = "/";
            String str4 = str3;
            if (str4 == null || !StringsKt__StringsJVMKt.startsWith$default(str4, "/", false, 2, pa4Var)) {
                String strD = url.d();
                int iLastIndexOf$default = StringsKt__StringsKt.lastIndexOf$default((CharSequence) strD, mla.SEPARATOR, 0, false, 6, (Object) null);
                if (iLastIndexOf$default != 0) {
                    if (strD == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    strSubstring = strD.substring(0, iLastIndexOf$default);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                }
                str2 = strSubstring;
            } else {
                str2 = str4;
            }
            return new pa4(strY, strX, j2, str, str2, z, z2, z3, z4, null);
        }

        @JvmStatic
        @NotNull
        public final List<pa4> e(@NotNull uk9 url, @NotNull gj8 headers) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(headers, "headers");
            List<String> listI = headers.i("Set-Cookie");
            int size = listI.size();
            ArrayList arrayList = null;
            for (int i = 0; i < size; i++) {
                pa4 pa4VarC = c(url, listI.get(i));
                if (pa4VarC != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(pa4VarC);
                }
            }
            if (arrayList == null) {
                return CollectionsKt__CollectionsKt.emptyList();
            }
            List<pa4> listUnmodifiableList = Collections.unmodifiableList(arrayList);
            Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "Collections.unmodifiableList(cookies)");
            return listUnmodifiableList;
        }

        public final String f(String s) {
            if (!(!StringsKt__StringsJVMKt.endsWith$default(s, ".", false, 2, null))) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            String strE = hf9.e(StringsKt__StringsKt.removePrefix(s, (CharSequence) "."));
            if (strE != null) {
                return strE;
            }
            throw new IllegalArgumentException();
        }

        public final long g(String s, int pos, int limit) {
            int iA = a(s, pos, limit, false);
            Matcher matcher = pa4.m.matcher(s);
            int i = -1;
            int i2 = -1;
            int i3 = -1;
            int iIndexOf$default = -1;
            int i4 = -1;
            int i5 = -1;
            while (iA < limit) {
                int iA2 = a(s, iA + 1, limit, true);
                matcher.region(iA, iA2);
                if (i2 == -1 && matcher.usePattern(pa4.m).matches()) {
                    String strGroup = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(strGroup, "matcher.group(1)");
                    i2 = Integer.parseInt(strGroup);
                    String strGroup2 = matcher.group(2);
                    Intrinsics.checkNotNullExpressionValue(strGroup2, "matcher.group(2)");
                    i4 = Integer.parseInt(strGroup2);
                    String strGroup3 = matcher.group(3);
                    Intrinsics.checkNotNullExpressionValue(strGroup3, "matcher.group(3)");
                    i5 = Integer.parseInt(strGroup3);
                } else if (i3 == -1 && matcher.usePattern(pa4.f15284l).matches()) {
                    String strGroup4 = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(strGroup4, "matcher.group(1)");
                    i3 = Integer.parseInt(strGroup4);
                } else if (iIndexOf$default == -1 && matcher.usePattern(pa4.k).matches()) {
                    String strGroup5 = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(strGroup5, "matcher.group(1)");
                    Locale locale = Locale.US;
                    Intrinsics.checkNotNullExpressionValue(locale, "Locale.US");
                    if (strGroup5 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    String lowerCase = strGroup5.toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                    String strPattern = pa4.k.pattern();
                    Intrinsics.checkNotNullExpressionValue(strPattern, "MONTH_PATTERN.pattern()");
                    iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) strPattern, lowerCase, 0, false, 6, (Object) null) / 4;
                } else if (i == -1 && matcher.usePattern(pa4.f15283j).matches()) {
                    String strGroup6 = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(strGroup6, "matcher.group(1)");
                    i = Integer.parseInt(strGroup6);
                }
                iA = a(s, iA2 + 1, limit, false);
            }
            if (70 <= i && 99 >= i) {
                i += 1900;
            }
            if (i >= 0 && 69 >= i) {
                i += 2000;
            }
            if (!(i >= 1601)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(iIndexOf$default != -1)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(1 <= i3 && 31 >= i3)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(i2 >= 0 && 23 >= i2)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(i4 >= 0 && 59 >= i4)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(i5 >= 0 && 59 >= i5)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(sqk.UTC);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i);
            gregorianCalendar.set(2, iIndexOf$default - 1);
            gregorianCalendar.set(5, i3);
            gregorianCalendar.set(11, i2);
            gregorianCalendar.set(12, i4);
            gregorianCalendar.set(13, i5);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }

        public final long h(String s) {
            try {
                long j2 = Long.parseLong(s);
                if (j2 <= 0) {
                    return Long.MIN_VALUE;
                }
                return j2;
            } catch (NumberFormatException e2) {
                if (new Regex("-?\\d+").matches(s)) {
                    return StringsKt__StringsJVMKt.startsWith$default(s, "-", false, 2, null) ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
                throw e2;
            }
        }
    }

    public pa4(String str, String str2, long j2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.name = str;
        this.value = str2;
        this.expiresAt = j2;
        this.domain = str3;
        this.path = str4;
        this.secure = z;
        this.httpOnly = z2;
        this.persistent = z3;
        this.hostOnly = z4;
    }

    @JvmName(name = "name")
    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public boolean equals(@Nullable Object other) {
        if (other instanceof pa4) {
            pa4 pa4Var = (pa4) other;
            if (Intrinsics.areEqual(pa4Var.name, this.name) && Intrinsics.areEqual(pa4Var.value, this.value) && pa4Var.expiresAt == this.expiresAt && Intrinsics.areEqual(pa4Var.domain, this.domain) && Intrinsics.areEqual(pa4Var.path, this.path) && pa4Var.secure == this.secure && pa4Var.httpOnly == this.httpOnly && pa4Var.persistent == this.persistent && pa4Var.hostOnly == this.hostOnly) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final String f(boolean forObsoleteRfc2965) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name);
        sb.append(kam.h);
        sb.append(this.value);
        if (this.persistent) {
            if (this.expiresAt == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(y05.b(new Date(this.expiresAt)));
            }
        }
        if (!this.hostOnly) {
            sb.append("; domain=");
            if (forObsoleteRfc2965) {
                sb.append(".");
            }
            sb.append(this.domain);
        }
        sb.append("; path=");
        sb.append(this.path);
        if (this.secure) {
            sb.append("; secure");
        }
        if (this.httpOnly) {
            sb.append("; httponly");
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString()");
        return string;
    }

    @JvmName(name = "value")
    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @IgnoreJRERequirement
    public int hashCode() {
        return ((((((((((((((((527 + this.name.hashCode()) * 31) + this.value.hashCode()) * 31) + Long.hashCode(this.expiresAt)) * 31) + this.domain.hashCode()) * 31) + this.path.hashCode()) * 31) + Boolean.hashCode(this.secure)) * 31) + Boolean.hashCode(this.httpOnly)) * 31) + Boolean.hashCode(this.persistent)) * 31) + Boolean.hashCode(this.hostOnly);
    }

    @NotNull
    public String toString() {
        return f(false);
    }

    public /* synthetic */ pa4(String str, String str2, long j2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j2, str3, str4, z, z2, z3, z4);
    }
}
