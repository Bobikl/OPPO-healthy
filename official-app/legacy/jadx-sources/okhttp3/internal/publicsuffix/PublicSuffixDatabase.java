package okhttp3.internal.publicsuffix;

import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.sqk;
import io.protostuff.MapSchema;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.internal.platform.Platform;
import okio.BufferedSource;
import okio.GzipSource;
import okio.Okio;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.collections.CollectionsKt__CollectionsJVMKt;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.io.CloseableKt;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.sequences.SequencesKt___SequencesKt;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\u0002J\b\u0010\n\u001a\u00020\tH\u0002J\b\u0010\u000b\u001a\u00020\tH\u0002R\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\b\u0010\u0016¨\u0006\u001c"}, d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "", "", "domain", MapSchema.FIELD_NAME_ENTRY, "", b2n.g, "domainLabels", "d", "", b2n.f, "f", "Ljava/util/concurrent/atomic/AtomicBoolean;", "a", "Ljava/util/concurrent/atomic/AtomicBoolean;", "listRead", "Ljava/util/concurrent/CountDownLatch;", "b", "Ljava/util/concurrent/CountDownLatch;", "readCompleteLatch", "", "c", "[B", "publicSuffixListBytes", "publicSuffixExceptionListBytes", "<init>", "()V", "Companion", "okhttp4_extension_release"}, k = 1, mv = {1, 4, 0})
public final class PublicSuffixDatabase {

    @NotNull
    public static final String PUBLIC_SUFFIX_RESOURCE = "publicsuffixes.gz";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final AtomicBoolean listRead = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final CountDownLatch readCompleteLatch = new CountDownLatch(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public byte[] publicSuffixListBytes;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public byte[] publicSuffixExceptionListBytes;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f20734e = {(byte) 42};
    public static final List<String> f = CollectionsKt__CollectionsJVMKt.listOf("*");
    public static final PublicSuffixDatabase g = new PublicSuffixDatabase();

    /* JADX INFO: renamed from: okhttp3.internal.publicsuffix.PublicSuffixDatabase$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0006\u0010\u0003\u001a\u00020\u0002J+\u0010\n\u001a\u0004\u0018\u00010\t*\u00020\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase$a;", "", "Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "c", "", "", "labels", "", "labelIndex", "", "b", "([B[[BI)Ljava/lang/String;", "", "EXCEPTION_MARKER", "C", "", "PREVAILING_RULE", "Ljava/util/List;", "PUBLIC_SUFFIX_RESOURCE", "Ljava/lang/String;", "WILDCARD_LABEL", "[B", "instance", "Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "<init>", "()V", "okhttp4_extension_release"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String b(byte[] bArr, byte[][] bArr2, int i) {
            int i2;
            boolean z;
            int iB;
            int iB2;
            int length = bArr.length;
            int i3 = 0;
            while (i3 < length) {
                int i4 = (i3 + length) / 2;
                while (i4 > -1 && bArr[i4] != ((byte) 10)) {
                    i4--;
                }
                int i5 = i4 + 1;
                int i6 = 1;
                while (true) {
                    i2 = i5 + i6;
                    if (bArr[i2] == ((byte) 10)) {
                        break;
                    }
                    i6++;
                }
                int i7 = i2 - i5;
                int i8 = i;
                boolean z2 = false;
                int i9 = 0;
                int i10 = 0;
                while (true) {
                    if (z2) {
                        iB = 46;
                        z = false;
                    } else {
                        z = z2;
                        iB = sqk.b(bArr2[i8][i9], 255);
                    }
                    iB2 = iB - sqk.b(bArr[i5 + i10], 255);
                    if (iB2 != 0) {
                        break;
                    }
                    i10++;
                    i9++;
                    if (i10 == i7) {
                        break;
                    }
                    if (bArr2[i8].length != i9) {
                        z2 = z;
                    } else {
                        if (i8 == bArr2.length - 1) {
                            break;
                        }
                        i8++;
                        i9 = -1;
                        z2 = true;
                    }
                }
                if (iB2 >= 0) {
                    if (iB2 <= 0) {
                        int i11 = i7 - i10;
                        int length2 = bArr2[i8].length - i9;
                        int length3 = bArr2.length;
                        for (int i12 = i8 + 1; i12 < length3; i12++) {
                            length2 += bArr2[i12].length;
                        }
                        if (length2 >= i11) {
                            if (length2 <= i11) {
                                Charset UTF_8 = StandardCharsets.UTF_8;
                                Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
                                return new String(bArr, i5, i7, UTF_8);
                            }
                        }
                    }
                    i3 = i2 + 1;
                }
                length = i5 - 1;
            }
            return null;
        }

        @NotNull
        public final PublicSuffixDatabase c() {
            return PublicSuffixDatabase.g;
        }
    }

    public static final /* synthetic */ byte[] b(PublicSuffixDatabase publicSuffixDatabase) {
        byte[] bArr = publicSuffixDatabase.publicSuffixListBytes;
        if (bArr == null) {
            Intrinsics.throwUninitializedPropertyAccessException("publicSuffixListBytes");
        }
        return bArr;
    }

    public final List<String> d(List<String> domainLabels) {
        String str;
        String strB;
        String str2;
        List<String> listEmptyList;
        List<String> listEmptyList2;
        if (this.listRead.get() || !this.listRead.compareAndSet(false, true)) {
            try {
                this.readCompleteLatch.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            g();
        }
        if (!(this.publicSuffixListBytes != null)) {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.".toString());
        }
        int size = domainLabels.size();
        byte[][] bArr = new byte[size][];
        for (int i = 0; i < size; i++) {
            String str3 = domainLabels.get(i);
            Charset UTF_8 = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
            if (str3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            byte[] bytes = str3.getBytes(UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            bArr[i] = bytes;
        }
        int i2 = 0;
        while (true) {
            str = null;
            if (i2 >= size) {
                strB = null;
                break;
            }
            Companion companion = INSTANCE;
            byte[] bArr2 = this.publicSuffixListBytes;
            if (bArr2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("publicSuffixListBytes");
            }
            strB = companion.b(bArr2, bArr, i2);
            if (strB != null) {
                break;
            }
            i2++;
        }
        if (size <= 1) {
            str2 = null;
            break;
        }
        byte[][] bArr3 = (byte[][]) bArr.clone();
        int length = bArr3.length - 1;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                str2 = null;
                break;
            }
            bArr3[i3] = f20734e;
            Companion companion2 = INSTANCE;
            byte[] bArr4 = this.publicSuffixListBytes;
            if (bArr4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("publicSuffixListBytes");
            }
            String strB2 = companion2.b(bArr4, bArr3, i3);
            if (strB2 != null) {
                str2 = strB2;
                break;
            }
            i3++;
        }
        if (str2 != null) {
            int i4 = size - 1;
            for (int i5 = 0; i5 < i4; i5++) {
                Companion companion3 = INSTANCE;
                byte[] bArr5 = this.publicSuffixExceptionListBytes;
                if (bArr5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("publicSuffixExceptionListBytes");
                }
                String strB3 = companion3.b(bArr5, bArr, i5);
                if (strB3 != null) {
                    str = strB3;
                    break;
                }
            }
        }
        if (str != null) {
            return StringsKt__StringsKt.split$default((CharSequence) ('!' + str), new char[]{'.'}, false, 0, 6, (Object) null);
        }
        if (strB == null && str2 == null) {
            return f;
        }
        if (strB == null || (listEmptyList = StringsKt__StringsKt.split$default((CharSequence) strB, new char[]{'.'}, false, 0, 6, (Object) null)) == null) {
            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        if (str2 == null || (listEmptyList2 = StringsKt__StringsKt.split$default((CharSequence) str2, new char[]{'.'}, false, 0, 6, (Object) null)) == null) {
            listEmptyList2 = CollectionsKt__CollectionsKt.emptyList();
        }
        return listEmptyList.size() > listEmptyList2.size() ? listEmptyList : listEmptyList2;
    }

    @Nullable
    public final String e(@NotNull String domain) {
        int size;
        int size2;
        Intrinsics.checkNotNullParameter(domain, "domain");
        String unicodeDomain = IDN.toUnicode(domain);
        Intrinsics.checkNotNullExpressionValue(unicodeDomain, "unicodeDomain");
        List<String> listH = h(unicodeDomain);
        List<String> listD = d(listH);
        if (listH.size() == listD.size() && listD.get(0).charAt(0) != '!') {
            return null;
        }
        if (listD.get(0).charAt(0) == '!') {
            size = listH.size();
            size2 = listD.size();
        } else {
            size = listH.size();
            size2 = listD.size() + 1;
        }
        return SequencesKt___SequencesKt.joinToString$default(SequencesKt___SequencesKt.drop(CollectionsKt___CollectionsKt.asSequence(h(domain)), size - size2), ".", null, null, 0, null, null, 62, null);
    }

    public final void f() throws IOException {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream(PUBLIC_SUFFIX_RESOURCE);
        if (resourceAsStream != null) {
            Intrinsics.checkNotNullExpressionValue(resourceAsStream, "PublicSuffixDatabase::cl…UFFIX_RESOURCE) ?: return");
            BufferedSource bufferedSourceBuffer = Okio.buffer(new GzipSource(Okio.source(resourceAsStream)));
            try {
                byte[] byteArray = bufferedSourceBuffer.readByteArray(bufferedSourceBuffer.readInt());
                byte[] byteArray2 = bufferedSourceBuffer.readByteArray(bufferedSourceBuffer.readInt());
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(bufferedSourceBuffer, null);
                synchronized (this) {
                    Intrinsics.checkNotNull(byteArray);
                    this.publicSuffixListBytes = byteArray;
                    Intrinsics.checkNotNull(byteArray2);
                    this.publicSuffixExceptionListBytes = byteArray2;
                }
                this.readCompleteLatch.countDown();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(bufferedSourceBuffer, th);
                    throw th2;
                }
            }
        }
    }

    public final void g() {
        boolean z = false;
        while (true) {
            try {
                try {
                    f();
                    break;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z = true;
                } catch (IOException e2) {
                    Platform.INSTANCE.get().log("Failed to read public suffix list", 5, e2);
                    if (z) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    return;
                }
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public final List<String> h(String domain) {
        List<String> listSplit$default = StringsKt__StringsKt.split$default((CharSequence) domain, new char[]{'.'}, false, 0, 6, (Object) null);
        return Intrinsics.areEqual((String) CollectionsKt___CollectionsKt.last((List) listSplit$default), "") ? CollectionsKt___CollectionsKt.dropLast(listSplit$default, 1) : listSplit$default;
    }
}
