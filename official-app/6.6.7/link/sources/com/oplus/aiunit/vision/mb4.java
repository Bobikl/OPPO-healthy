package com.oplus.aiunit.vision;

import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import com.oplus.phonenoareainquire.PhoneNoInquireProvider;
import com.oplus.phonenoareainquire.c;
import com.oplus.phonenoareainquire.utils.SelfHealUtil;
import com.oplus.wearable.linkservice.sdk.Node;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u001aB\t\b\u0002¢\u0006\u0004\b7\u00108J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J \u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0003J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\nH\u0003J(\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0003J(\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0003J \u0010\u0016\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\nH\u0003J\u0010\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0003R\u0014\u0010\u001b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u001cR\u001c\u0010#\u001a\n !*\u0004\u0018\u00010 0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\"R\u001c\u0010$\u001a\n !*\u0004\u0018\u00010 0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\"R\u001c\u0010%\u001a\n !*\u0004\u0018\u00010 0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\"R\u001c\u0010'\u001a\n !*\u0004\u0018\u00010 0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\"R2\u0010+\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0(j\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n`)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010*R2\u0010,\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0(j\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n`)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010*R2\u0010-\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0(j\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n`)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010*R*\u00101\u001a\u0016\u0012\u0004\u0012\u00020\n\u0018\u00010.j\n\u0012\u0004\u0012\u00020\n\u0018\u0001`/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u00100R$\u00106\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u00102\u001a\u0004\b&\u00103\"\u0004\b4\u00105¨\u00069"}, d2 = {"Lcom/oplus/aiunit/vision/mb4;", "", "Landroid/content/Context;", "context", "", "versionCN", "Ljava/util/concurrent/CountDownLatch;", "countDownLatch", "", "i", "", "language", "Landroid/database/Cursor;", "b", "country", "Lcom/oplus/aiunit/vision/mb4$a;", "c", "name", "countryIso", "currentSysLanguage", "e", "g", "h", "f", "Ljava/io/InputStream;", "input", "a", "COL_COUNTRY_ISO", "Ljava/lang/String;", "COL_DISPLAY_NAME", "COL_COUNTRY_CODE", "TW_ISO", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "Ljava/util/regex/Pattern;", "mGetIsoPattern", "mIsoPattern", "mCodePattern", "d", "mAllLanguageKeyPattern", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "mPhoneNoAreaInquireNameMapping", "mAllLanguageNameMapping", "mSpecialNameMapping", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "mSupportCountryList", "Landroid/database/Cursor;", "()Landroid/database/Cursor;", "setMCountryListCursor", "(Landroid/database/Cursor;)V", "mCountryListCursor", "<init>", "()V", "contactnetnumber_impl_thirdRelease"}, k = 1, mv = {1, 8, 0})
public final class mb4 {

    @NotNull
    public static final String COL_COUNTRY_CODE = "country_code";

    @NotNull
    public static final String COL_COUNTRY_ISO = "country_iso";

    @NotNull
    public static final String COL_DISPLAY_NAME = "country_name";

    @NotNull
    public static final String TW_ISO = "TW";

    @Nullable
    public static ArrayList<String> h;

    @Nullable
    public static Cursor i;

    @NotNull
    public static final mb4 INSTANCE = new mb4();
    public static final Pattern a = Pattern.compile("country_([A-Z]){2}");
    public static final Pattern b = Pattern.compile("\\W*([A-Z]{2})\\W*");
    public static final Pattern c = Pattern.compile("[\\d\\/]+");
    public static final Pattern d = Pattern.compile("^country_[A-Z]{2}_in_([a-z]{2,4}_[A-Z]{2})(_CN)?");

    @NotNull
    public static HashMap<String, String> e = new HashMap<>();

    @NotNull
    public static HashMap<String, String> f = new HashMap<>();

    @NotNull
    public static HashMap<String, String> g = new HashMap<>();

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.mb4$a, reason: from toString */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\t\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/oplus/aiunit/vision/mb4$a;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "mCountryName", "b", "mCountryIso", dde.COUNTRY_CODE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "contactnetnumber_impl_thirdRelease"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class CountryInfo {

        /* JADX INFO: renamed from: a, reason: from toString */
        @NotNull
        public final String mCountryName;

        /* JADX INFO: renamed from: b, reason: from toString */
        @NotNull
        public final String mCountryIso;

        /* JADX INFO: renamed from: c, reason: from toString */
        @NotNull
        public final String mCountryCode;

        public CountryInfo(@NotNull String str, @NotNull String str2, @NotNull String str3) {
            Intrinsics.checkNotNullParameter(str, "mCountryName");
            Intrinsics.checkNotNullParameter(str2, "mCountryIso");
            Intrinsics.checkNotNullParameter(str3, dde.COUNTRY_CODE);
            this.mCountryName = str;
            this.mCountryIso = str2;
            this.mCountryCode = str3;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getMCountryCode() {
            return this.mCountryCode;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getMCountryIso() {
            return this.mCountryIso;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getMCountryName() {
            return this.mCountryName;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CountryInfo)) {
                return false;
            }
            CountryInfo countryInfo = (CountryInfo) other;
            return Intrinsics.areEqual(this.mCountryName, countryInfo.mCountryName) && Intrinsics.areEqual(this.mCountryIso, countryInfo.mCountryIso) && Intrinsics.areEqual(this.mCountryCode, countryInfo.mCountryCode);
        }

        public int hashCode() {
            return (((this.mCountryName.hashCode() * 31) + this.mCountryIso.hashCode()) * 31) + this.mCountryCode.hashCode();
        }

        @NotNull
        public String toString() {
            return "CountryInfo(mCountryName=" + this.mCountryName + ", mCountryIso=" + this.mCountryIso + ", mCountryCode=" + this.mCountryCode + ")";
        }
    }

    @JvmStatic
    public static final void a(InputStream input) {
        try {
            g3e.a("CountryListUtil", "start to copy the mapping file to dir");
            File file = new File(PhoneNoInquireProvider.sNameMappingFile);
            if (!file.exists()) {
                String str = PhoneNoInquireProvider.sNameMappingFile;
                Intrinsics.checkNotNullExpressionValue(str, "sNameMappingFile");
                h5f.a("CountryNameMappingFile.dat", str);
                return;
            }
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                DataInputStream dataInputStream2 = new DataInputStream(input);
                try {
                    int i2 = dataInputStream2.readInt();
                    int i3 = dataInputStream.readInt();
                    g3e.a("CountryListUtil", "the current version is : " + i3 + " ,the file version in assets is " + i2);
                    boolean z = i3 < i2;
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(dataInputStream2, (Throwable) null);
                    CloseableKt.closeFinally(dataInputStream, (Throwable) null);
                    if (z) {
                        String str2 = PhoneNoInquireProvider.sNameMappingFile;
                        Intrinsics.checkNotNullExpressionValue(str2, "sNameMappingFile");
                        h5f.a("CountryNameMappingFile.dat", str2);
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        CloseableKt.closeFinally(dataInputStream2, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    CloseableKt.closeFinally(dataInputStream, th3);
                    throw th4;
                }
            }
        } catch (IOException e2) {
            g3e.b("CountryListUtil", "Exception when copy file to data file directory : " + e2);
        }
    }

    @JvmStatic
    public static final Cursor b(Context context, boolean versionCN, String language) {
        String string;
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{COL_COUNTRY_ISO, COL_DISPLAY_NAME, COL_COUNTRY_CODE});
        ArrayList<String> arrayList = h;
        if (arrayList != null) {
            for (String str : arrayList) {
                Intrinsics.checkNotNullExpressionValue(str, "isoAndCode");
                List listSplit$default = StringsKt.split$default(str, new String[]{"|"}, false, 0, 6, (Object) null);
                if (listSplit$default.size() != 2) {
                    g3e.a("CountryListUtil", "the iso and code may error,skip");
                } else {
                    String str2 = (String) listSplit$default.get(0);
                    int identifier = (Intrinsics.areEqual(TW_ISO, str2) && versionCN) ? context.getResources().getIdentifier("country_" + str2 + "_CN", "string", context.getPackageName()) : context.getResources().getIdentifier("country_" + str2, "string", context.getPackageName());
                    g3e.a("CountryListUtil", "the countryIso is : " + str2 + " the resourceId is : " + identifier);
                    if (identifier == 0) {
                        string = "";
                    } else {
                        string = context.getResources().getString(identifier);
                        Intrinsics.checkNotNullExpressionValue(string, "context.resources.getString(resourceId)");
                    }
                    CountryInfo countryInfoC = c(string);
                    g3e.a("CountryListUtil", "the countryInfo is : " + countryInfoC);
                    String mCountryName = countryInfoC.getMCountryName();
                    String mCountryCode = countryInfoC.getMCountryCode();
                    String strG = g(mCountryName, str2, language, versionCN);
                    if (Intrinsics.areEqual(strG, "") || Intrinsics.areEqual(str2, "") || Intrinsics.areEqual(mCountryCode, "")) {
                        g3e.a("CountryListUtil", "one of displayName,countryIso,countryCode is empty ,we will not add to the cursor");
                    } else {
                        Matcher matcher = b.matcher(countryInfoC.getMCountryIso());
                        if (!matcher.matches()) {
                            g3e.a("CountryListUtil", "the country " + countryInfoC.getMCountryIso() + " not equal " + str2);
                        } else if (Intrinsics.areEqual(str2, matcher.group(1))) {
                            List<String> listSplit$default2 = StringsKt.split$default(mCountryCode, new String[]{"/"}, false, 0, 6, (Object) null);
                            StringBuilder sb = new StringBuilder();
                            sb.append("the " + str2 + " has " + listSplit$default2.size() + " s code ,so we will add " + listSplit$default2.size() + " time the country -> " + strG + " ");
                            for (String str3 : listSplit$default2) {
                                sb.append(" " + str3 + " \n");
                                if (!Intrinsics.areEqual(str3, "")) {
                                    matrixCursor.addRow(new String[]{str2, strG, str3});
                                }
                            }
                            String string2 = sb.toString();
                            Intrinsics.checkNotNullExpressionValue(string2, "log.toString()");
                            g3e.a("CountryListUtil", string2);
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("country iso " + str2 + " not equal the info's iso :");
                            String strGroup = matcher.group(1);
                            Intrinsics.checkNotNullExpressionValue(strGroup, "isoMatch.group(1)");
                            int length = strGroup.length();
                            for (int i2 = 0; i2 < length; i2++) {
                                sb2.append(strGroup.charAt(i2) + " \n");
                            }
                            String string3 = sb2.toString();
                            Intrinsics.checkNotNullExpressionValue(string3, "log.toString()");
                            g3e.a("CountryListUtil", string3);
                        }
                    }
                }
            }
            g3e.a("CountryListUtil", "the cursor count is : " + matrixCursor.getCount());
        }
        return matrixCursor;
    }

    @JvmStatic
    public static final CountryInfo c(String country) {
        String str = "";
        String str2 = "";
        String str3 = str2;
        for (String str4 : StringsKt.split$default(country, new String[]{"+"}, false, 0, 6, (Object) null)) {
            if (b.matcher(str4).matches()) {
                str2 = str4;
            } else if (c.matcher(str4).matches()) {
                str3 = str4;
            } else {
                str = str4;
            }
        }
        g3e.a("CountryListUtil", "origin countryStr " + country + " , " + str + " iso " + str2 + " code " + str3);
        return new CountryInfo(str, str2, str3);
    }

    @JvmStatic
    public static final String e(String name, String countryIso, String currentSysLanguage, boolean versionCN) {
        String str;
        String str2;
        if (versionCN) {
            str = "country_" + countryIso + "_in_" + currentSysLanguage + "_CN";
        } else {
            str = "country_" + countryIso + "_in_" + currentSysLanguage;
        }
        if (f.get(str) == null || (str2 = f.get(str)) == null) {
            str2 = name;
        }
        if (!Intrinsics.areEqual(name, str2)) {
            g3e.a("CountryListUtil", "the name has change because the name need to map ");
        }
        return str2;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00f4  */
    @JvmStatic
    public static final void f(Context context, String currentSysLanguage) {
        DataInputStream dataInputStream;
        f.clear();
        try {
            InputStream inputStreamOpen = context.getAssets().open("CountryNameMappingFile.dat");
            Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "context.assets.open(Phon…stants.NAME_MAPPING_FILE)");
            a(inputStreamOpen);
            dataInputStream = new DataInputStream(new FileInputStream(PhoneNoInquireProvider.sNameMappingFile));
        } catch (IOException unused) {
            g3e.b("CountryListUtil", "Exception when access the file");
            dataInputStream = null;
        }
        try {
            if (dataInputStream != null) {
                try {
                    dataInputStream.readInt();
                    int i2 = dataInputStream.readInt();
                    h = new ArrayList<>();
                    for (int i3 = 0; i3 < i2; i3++) {
                        ArrayList<String> arrayList = h;
                        if (arrayList != null) {
                            String utf = dataInputStream.readUTF();
                            if (utf == null) {
                                utf = "";
                            } else {
                                Intrinsics.checkNotNullExpressionValue(utf, "it.readUTF() ?: \"\"");
                            }
                            arrayList.add(utf);
                        }
                    }
                    g3e.a("CountryListUtil", "support " + i2 + " country , the currentLanguage is : " + currentSysLanguage);
                    while (true) {
                        String utf2 = dataInputStream.readUTF();
                        String utf3 = dataInputStream.readUTF();
                        Matcher matcher = d.matcher(utf2);
                        if (!matcher.matches()) {
                            Intrinsics.checkNotNullExpressionValue(utf2, Node.I_KEY);
                            if (StringsKt.startsWith$default(utf2, "com.oplus.phonenoareainquire_", false, 2, (Object) null)) {
                                HashMap<String, String> map = e;
                                Intrinsics.checkNotNullExpressionValue(utf3, "value");
                                map.put(utf2, utf3);
                            } else {
                                HashMap<String, String> map2 = g;
                                Intrinsics.checkNotNullExpressionValue(utf3, "value");
                                map2.put(utf2, utf3);
                            }
                        } else if (Intrinsics.areEqual(currentSysLanguage, matcher.group(1))) {
                            HashMap<String, String> map3 = f;
                            Intrinsics.checkNotNullExpressionValue(utf2, Node.I_KEY);
                            Intrinsics.checkNotNullExpressionValue(utf3, "value");
                            map3.put(utf2, utf3);
                        }
                    }
                } catch (IOException e2) {
                    g3e.a("CountryListUtil", "may have load file complete " + e2);
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(dataInputStream, (Throwable) null);
                }
            }
            ArrayList<String> arrayList2 = h;
            if (arrayList2 != null) {
                Intrinsics.checkNotNull(arrayList2);
                if (arrayList2.size() <= 10) {
                    SelfHealUtil.e(context);
                }
            } else {
                SelfHealUtil.e(context);
            }
            SelfHealUtil.d();
            g3e.a("CountryListUtil", "totally load " + (f.size() + e.size() + g.size()) + " data to map, mAllLanguageNameMapping size " + f.size() + " , mPhoneNoAreaInquireNameMapping size " + e.size() + "  mSpecialNameMapping size " + g.size() + " ");
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(dataInputStream, th);
                throw th2;
            }
        }
    }

    @JvmStatic
    public static final String g(String name, String countryIso, String currentSysLanguage, boolean versionCN) {
        String str;
        String strE = e(name, countryIso, currentSysLanguage, versionCN);
        if (versionCN) {
            str = g.get(name + "_CN");
        } else {
            str = g.get(name);
        }
        String str2 = str;
        if (str2 != null) {
            strE = str2;
        }
        if (!Intrinsics.areEqual(name, strE)) {
            g3e.a("CountryListUtil", "the name of " + countryIso + " has change because the name need to map ");
        }
        return strE;
    }

    @JvmStatic
    @NotNull
    public static final String h(@NotNull String name, @NotNull String currentSysLanguage, boolean versionCN) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(currentSysLanguage, "currentSysLanguage");
        if (versionCN) {
            str = e.get("com.oplus.phonenoareainquire_" + name + "_in_" + currentSysLanguage + "_CN");
        } else {
            str = e.get("com.oplus.phonenoareainquire_" + name + "_in_" + currentSysLanguage);
        }
        if (str == null) {
            str = name;
        }
        boolean zAreEqual = Intrinsics.areEqual(str, name);
        if (c.DEBUG) {
            g3e.a("CountryListUtil", "isSame = " + zAreEqual);
        }
        if (!zAreEqual) {
            return str;
        }
        if (versionCN) {
            str2 = e.get("com.oplus.phonenoareainquire_" + name + "_CN");
        } else {
            str2 = e.get("com.oplus.phonenoareainquire_" + name);
        }
        if (str2 != null) {
            name = str2;
        }
        return name;
    }

    @JvmStatic
    public static final void i(@NotNull Context context, boolean versionCN, @NotNull CountDownLatch countDownLatch) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(countDownLatch, "countDownLatch");
        g3e.a("CountryListUtil", "start load data to cursor");
        String strB = x5b.b();
        synchronized (mb4.class) {
            Cursor cursor = i;
            if (cursor != null) {
                cursor.close();
            }
            i = null;
            f(context, strB);
            ArrayList<String> arrayList = h;
            g3e.a("CountryListUtil", "the support country list count " + (arrayList != null ? arrayList.size() : 0));
            i = b(context, versionCN, strB);
            h = null;
            countDownLatch.countDown();
            Unit unit = Unit.INSTANCE;
        }
    }

    @Nullable
    public final Cursor d() {
        return i;
    }
}
