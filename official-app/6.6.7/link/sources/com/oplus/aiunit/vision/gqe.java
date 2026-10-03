package com.oplus.aiunit.vision;

import com.oplus.phonenoareainquire.PhoneNoInquireProvider;
import com.oplus.phonenoareainquire.c;
import com.oplus.smartenginehelper.ParserTag;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u000eB\t\b\u0002¢\u0006\u0004\b'\u0010(J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0006H\u0003J\b\u0010\u000b\u001a\u00020\nH\u0007J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0003J\u0018\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0003J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0007J\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0011H\u0007J\b\u0010\u0013\u001a\u00020\nH\u0007R\u0014\u0010\u0014\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00188\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00188\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0015R\u0014\u0010\u001d\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0015R\u0014\u0010\u001e\u001a\u00020\u00188\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR2\u0010\"\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u001fj\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004` 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010!R&\u0010&\u001a\u0012\u0012\u0004\u0012\u00020\u00040#j\b\u0012\u0004\u0012\u00020\u0004`$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010%¨\u0006)"}, d2 = {"Lcom/oplus/aiunit/vision/gqe;", "", "", ParserTag.TAG_NUMBER, "", "systemLanguage", "Lcom/oplus/aiunit/vision/gqe$a;", "g", "numberInfo", "f", "", "h", "e", "file", "a", "input", "d", "Ljava/io/InputStream;", "c", "b", "TAG", "Ljava/lang/String;", "DEFAULT_LANGUAGE", "ENGLISH_LANGUAGE", "", "DEFAULT_LANGUAGE_INDEX", "I", "CHINESE_MOBILE_LENGTH", "NO_LOCATION_INFO", "NO_CARRIER_INFO", "LOCATION_CACHE_CAPACITY", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "mCarrierNameMap", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "mLocationCache", "<init>", "()V", "contactnetnumber_impl_thirdRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPortabilityNumbersUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PortabilityNumbersUtil.kt\ncom/oplus/phonenoareainquire/utils/PortabilityNumbersUtil\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,295:1\n37#2,2:296\n37#2,2:298\n*S KotlinDebug\n*F\n+ 1 PortabilityNumbersUtil.kt\ncom/oplus/phonenoareainquire/utils/PortabilityNumbersUtil\n*L\n112#1:296,2\n123#1:298,2\n*E\n"})
public final class gqe {
    public static final int CHINESE_MOBILE_LENGTH = 11;

    @NotNull
    public static final String DEFAULT_LANGUAGE = "CN";
    public static final int DEFAULT_LANGUAGE_INDEX = 1;

    @NotNull
    public static final String ENGLISH_LANGUAGE = "EN";
    public static final int LOCATION_CACHE_CAPACITY = 500;

    @NotNull
    public static final String NO_CARRIER_INFO = "0";

    @NotNull
    public static final String NO_LOCATION_INFO = "0";

    @NotNull
    public static final String TAG = "PortabilityNumbersUtil";

    @NotNull
    public static final gqe INSTANCE = new gqe();

    @NotNull
    public static HashMap<String, String> a = new HashMap<>();

    @NotNull
    public static ArrayList<String> b = new ArrayList<>();

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.gqe$a, reason: from toString */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\t\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/oplus/aiunit/vision/gqe$a;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "mLocation", "mCarrier", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "contactnetnumber_impl_thirdRelease"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class NumberInfo {

        /* JADX INFO: renamed from: a, reason: from toString */
        @NotNull
        public final String mLocation;

        /* JADX INFO: renamed from: b, reason: from toString */
        @NotNull
        public final String mCarrier;

        public NumberInfo(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "mLocation");
            Intrinsics.checkNotNullParameter(str2, "mCarrier");
            this.mLocation = str;
            this.mCarrier = str2;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getMCarrier() {
            return this.mCarrier;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getMLocation() {
            return this.mLocation;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NumberInfo)) {
                return false;
            }
            NumberInfo numberInfo = (NumberInfo) other;
            return Intrinsics.areEqual(this.mLocation, numberInfo.mLocation) && Intrinsics.areEqual(this.mCarrier, numberInfo.mCarrier);
        }

        public int hashCode() {
            return (this.mLocation.hashCode() * 31) + this.mCarrier.hashCode();
        }

        @NotNull
        public String toString() {
            return "NumberInfo(mLocation=" + this.mLocation + ", mCarrier=" + this.mCarrier + ")";
        }
    }

    static {
        try {
            h();
        } catch (Throwable th) {
            g3e.b(TAG, "Exception when loadLocationInfoCache " + th);
        }
    }

    @JvmStatic
    public static final NumberInfo a(String file, long number) {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
            try {
                randomAccessFile.readInt();
                randomAccessFile.readInt();
                int i = randomAccessFile.readInt();
                int i2 = randomAccessFile.readInt();
                int i3 = randomAccessFile.readInt();
                int i4 = randomAccessFile.readInt();
                int i5 = randomAccessFile.readInt();
                randomAccessFile.readInt();
                if (a.size() == 0) {
                    String[] strArr = new String[i];
                    for (int i6 = 0; i6 < i; i6++) {
                        strArr[i6] = "";
                    }
                    for (int i7 = 0; i7 < i; i7++) {
                        String utf = randomAccessFile.readUTF();
                        Intrinsics.checkNotNullExpressionValue(utf, "input.readUTF()");
                        strArr[i7] = utf;
                    }
                    for (int i8 = 0; i8 < i2; i8++) {
                        byte b2 = randomAccessFile.readByte();
                        for (int i9 = 0; i9 < i; i9++) {
                            String str = ((int) b2) + "_" + d(strArr[i9]);
                            String utf2 = randomAccessFile.readUTF();
                            HashMap<String, String> map = a;
                            Intrinsics.checkNotNullExpressionValue(utf2, "value");
                            map.put(str, utf2);
                        }
                    }
                }
                int i10 = 0;
                while (i10 <= i4) {
                    int i11 = (i4 + i10) / 2;
                    randomAccessFile.seek((i11 * i5) + i3);
                    if (randomAccessFile.getFilePointer() >= randomAccessFile.length()) {
                        NumberInfo numberInfo = new NumberInfo("0", "0");
                        CloseableKt.closeFinally(randomAccessFile, (Throwable) null);
                        return numberInfo;
                    }
                    long j = randomAccessFile.readLong();
                    if (number > j) {
                        i10 = i11 + 1;
                    } else {
                        if (number == j) {
                            NumberInfo numberInfo2 = new NumberInfo(String.valueOf((int) randomAccessFile.readShort()), String.valueOf((int) randomAccessFile.readByte()));
                            CloseableKt.closeFinally(randomAccessFile, (Throwable) null);
                            return numberInfo2;
                        }
                        i4 = i11 - 1;
                    }
                }
                NumberInfo numberInfo3 = new NumberInfo("0", "0");
                CloseableKt.closeFinally(randomAccessFile, (Throwable) null);
                return numberInfo3;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(randomAccessFile, th);
                    throw th2;
                }
            }
        } catch (IOException e) {
            g3e.b(TAG, "Exception when binary search : " + e);
            return new NumberInfo("0", "0");
        } catch (NumberFormatException e2) {
            g3e.b(TAG, "Exception when binary search = " + e2);
            return new NumberInfo("0", "0");
        }
    }

    @JvmStatic
    public static final void b() {
        b.clear();
        a.clear();
    }

    @JvmStatic
    public static final void c(@NotNull InputStream input) {
        Intrinsics.checkNotNullParameter(input, "input");
        try {
            File file = new File(PhoneNoInquireProvider.sPortedNumberFile);
            if (!file.exists()) {
                String str = PhoneNoInquireProvider.sPortedNumberFile;
                Intrinsics.checkNotNullExpressionValue(str, "sPortedNumberFile");
                h5f.a("PortabilityNumberData.dat", str);
                return;
            }
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                DataInputStream dataInputStream2 = new DataInputStream(input);
                try {
                    int i = dataInputStream2.readInt();
                    int i2 = dataInputStream.readInt();
                    g3e.a(TAG, "the current version is : " + i2 + " ,the file version in assets is " + i);
                    boolean z = i2 < i;
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(dataInputStream2, (Throwable) null);
                    CloseableKt.closeFinally(dataInputStream, (Throwable) null);
                    if (z) {
                        String str2 = PhoneNoInquireProvider.sPortedNumberFile;
                        Intrinsics.checkNotNullExpressionValue(str2, "sPortedNumberFile");
                        h5f.a("PortabilityNumberData.dat", str2);
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
        } catch (IOException e) {
            g3e.b(TAG, "Exception when copy file to data file directory : " + e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0031  */
    @JvmStatic
    @NotNull
    public static final String d(@NotNull String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        StringBuilder sb = new StringBuilder();
        int length = input.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = input.charAt(i);
            if ('a' <= cCharAt && cCharAt < '{') {
                sb.append(cCharAt);
            } else if ('A' <= cCharAt && cCharAt < '[') {
                sb.append(cCharAt);
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "sb.toString()");
        return string;
    }

    @JvmStatic
    public static final String e(NumberInfo numberInfo, String systemLanguage) {
        String str;
        if (Intrinsics.areEqual(numberInfo.getMCarrier(), "0")) {
            return "";
        }
        String mCarrier = numberInfo.getMCarrier();
        if (x5b.c(systemLanguage)) {
            str = mCarrier + "_EN";
        } else {
            String upperCase = systemLanguage.toUpperCase();
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            str = mCarrier + "_" + upperCase;
        }
        if (a.get(str) != null) {
            return String.valueOf(a.get(str));
        }
        String str2 = mCarrier + "_CN";
        return a.get(str2) != null ? String.valueOf(a.get(str2)) : "";
    }

    @JvmStatic
    public static final String f(NumberInfo numberInfo) {
        if (Intrinsics.areEqual(numberInfo.getMLocation(), "0")) {
            return "";
        }
        if (Integer.parseInt(numberInfo.getMLocation()) - 1 < b.size()) {
            String str = b.get(Integer.parseInt(numberInfo.getMLocation()) - 1);
            Intrinsics.checkNotNullExpressionValue(str, "mLocationCache[numberInfo.mLocation.toInt() - 1]");
            return str;
        }
        g3e.a(TAG, "there is no city indexed " + numberInfo.getMLocation());
        return "";
    }

    @JvmStatic
    @NotNull
    public static final NumberInfo g(long number, @NotNull String systemLanguage) {
        Intrinsics.checkNotNullParameter(systemLanguage, "systemLanguage");
        if (String.valueOf(number).length() != 11) {
            return new NumberInfo("", "");
        }
        try {
            String str = PhoneNoInquireProvider.sPortedNumberFile;
            Intrinsics.checkNotNullExpressionValue(str, "sPortedNumberFile");
            NumberInfo numberInfoA = a(str, number);
            return new NumberInfo(f(numberInfoA), e(numberInfoA, systemLanguage));
        } catch (IOException e) {
            g3e.b(TAG, "IOException = " + e);
            return new NumberInfo("", "");
        } catch (NumberFormatException e2) {
            g3e.b(TAG, "NumberFormatException = " + e2);
            return new NumberInfo("", "");
        }
    }

    @JvmStatic
    public static final void h() {
        String strA = x5b.a();
        b.clear();
        InputStreamReader inputStreamReader = new InputStreamReader(c.b("Multi_Language_Table.txt", PhoneNoInquireProvider.sMultiLanguageTableFile));
        try {
            int i = 1;
            int i2 = 0;
            for (String str : TextStreamsKt.readLines(inputStreamReader)) {
                if (!Intrinsics.areEqual(StringsKt.trim(str).toString(), "")) {
                    if (i2 == 0) {
                        String[] strArr = (String[]) StringsKt.split$default(str, new String[]{"\t"}, false, 0, 6, (Object) null).toArray(new String[0]);
                        int length = strArr.length;
                        for (int i3 = 0; i3 < length; i3++) {
                            String string = StringsKt.trim(strArr[i3]).toString();
                            String upperCase = strA.toUpperCase();
                            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                            if (Intrinsics.areEqual(string, upperCase)) {
                                i = i3;
                                break;
                            }
                        }
                        i2++;
                    } else {
                        String[] strArr2 = (String[]) StringsKt.split$default(str, new String[]{"\t"}, false, 0, 6, (Object) null).toArray(new String[0]);
                        if (i >= strArr2.length) {
                            g3e.a(TAG, "the language index is : " + i + " , the citys size is : " + strArr2.length);
                        } else {
                            if (b.size() >= 500) {
                                CloseableKt.closeFinally(inputStreamReader, (Throwable) null);
                                return;
                            }
                            b.add(StringsKt.trim(strArr2[i]).toString());
                        }
                    }
                }
            }
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(inputStreamReader, (Throwable) null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(inputStreamReader, th);
                throw th2;
            }
        }
    }
}
