package p010kotlin.collections;

import com.oplus.aiunit.vision.y04;
import org.jetbrains.annotations.NotNull;
import p010kotlin.ExperimentalUnsignedTypes;
import p010kotlin.Metadata;
import p010kotlin.UByteArray;
import p010kotlin.UIntArray;
import p010kotlin.ULongArray;
import p010kotlin.UShort;
import p010kotlin.UShortArray;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0010\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\t\u0010\n\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\f\u0010\r\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a'\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a'\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a'\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a'\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001a'\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u001e\u0010\u0014\u001a'\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u001f\u0010\u0016\u001a'\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b \u0010\u0018\u001a'\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b!\u0010\u001a¨\u0006\""}, d2 = {"partition", "", "array", "Lkotlin/UByteArray;", y04.TIME_STYLE_LEFT_DIR_NAME, y04.TIME_STYLE_RIGHT_DIR_NAME, "partition-4UcCI2c", "([BII)I", "Lkotlin/UIntArray;", "partition-oBK06Vg", "([III)I", "Lkotlin/ULongArray;", "partition--nroSd4", "([JII)I", "Lkotlin/UShortArray;", "partition-Aa5vz7o", "([SII)I", "quickSort", "", "quickSort-4UcCI2c", "([BII)V", "quickSort-oBK06Vg", "([III)V", "quickSort--nroSd4", "([JII)V", "quickSort-Aa5vz7o", "([SII)V", "sortArray", "fromIndex", "toIndex", "sortArray-4UcCI2c", "sortArray-oBK06Vg", "sortArray--nroSd4", "sortArray-Aa5vz7o", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class UArraySortingKt {
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: partition--nroSd4, reason: not valid java name */
    private static final int m5747partitionnroSd4(long[] jArr, int i, int i2) {
        long jM5521getsVKNKU = ULongArray.m5521getsVKNKU(jArr, (i + i2) / 2);
        while (i <= i2) {
            while (Long.compareUnsigned(ULongArray.m5521getsVKNKU(jArr, i), jM5521getsVKNKU) < 0) {
                i++;
            }
            while (Long.compareUnsigned(ULongArray.m5521getsVKNKU(jArr, i2), jM5521getsVKNKU) > 0) {
                i2--;
            }
            if (i <= i2) {
                long jM5521getsVKNKU2 = ULongArray.m5521getsVKNKU(jArr, i);
                ULongArray.m5526setk8EXiF4(jArr, i, ULongArray.m5521getsVKNKU(jArr, i2));
                ULongArray.m5526setk8EXiF4(jArr, i2, jM5521getsVKNKU2);
                i++;
                i2--;
            }
        }
        return i;
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: partition-4UcCI2c, reason: not valid java name */
    private static final int m5748partition4UcCI2c(byte[] bArr, int i, int i2) {
        int i3;
        byte bM5363getw2LRezQ = UByteArray.m5363getw2LRezQ(bArr, (i + i2) / 2);
        while (i <= i2) {
            while (true) {
                i3 = bM5363getw2LRezQ & 255;
                if (Intrinsics.compare(UByteArray.m5363getw2LRezQ(bArr, i) & 255, i3) >= 0) {
                    break;
                }
                i++;
            }
            while (Intrinsics.compare(UByteArray.m5363getw2LRezQ(bArr, i2) & 255, i3) > 0) {
                i2--;
            }
            if (i <= i2) {
                byte bM5363getw2LRezQ2 = UByteArray.m5363getw2LRezQ(bArr, i);
                UByteArray.m5368setVurrAj0(bArr, i, UByteArray.m5363getw2LRezQ(bArr, i2));
                UByteArray.m5368setVurrAj0(bArr, i2, bM5363getw2LRezQ2);
                i++;
                i2--;
            }
        }
        return i;
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: partition-Aa5vz7o, reason: not valid java name */
    private static final int m5749partitionAa5vz7o(short[] sArr, int i, int i2) {
        int i3;
        short sM5626getMh2AYeg = UShortArray.m5626getMh2AYeg(sArr, (i + i2) / 2);
        while (i <= i2) {
            while (true) {
                int iM5626getMh2AYeg = UShortArray.m5626getMh2AYeg(sArr, i) & UShort.MAX_VALUE;
                i3 = sM5626getMh2AYeg & UShort.MAX_VALUE;
                if (Intrinsics.compare(iM5626getMh2AYeg, i3) >= 0) {
                    break;
                }
                i++;
            }
            while (Intrinsics.compare(UShortArray.m5626getMh2AYeg(sArr, i2) & UShort.MAX_VALUE, i3) > 0) {
                i2--;
            }
            if (i <= i2) {
                short sM5626getMh2AYeg2 = UShortArray.m5626getMh2AYeg(sArr, i);
                UShortArray.m5631set01HTLdE(sArr, i, UShortArray.m5626getMh2AYeg(sArr, i2));
                UShortArray.m5631set01HTLdE(sArr, i2, sM5626getMh2AYeg2);
                i++;
                i2--;
            }
        }
        return i;
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: partition-oBK06Vg, reason: not valid java name */
    private static final int m5750partitionoBK06Vg(int[] iArr, int i, int i2) {
        int iM5442getpVg5ArA = UIntArray.m5442getpVg5ArA(iArr, (i + i2) / 2);
        while (i <= i2) {
            while (Integer.compareUnsigned(UIntArray.m5442getpVg5ArA(iArr, i), iM5442getpVg5ArA) < 0) {
                i++;
            }
            while (Integer.compareUnsigned(UIntArray.m5442getpVg5ArA(iArr, i2), iM5442getpVg5ArA) > 0) {
                i2--;
            }
            if (i <= i2) {
                int iM5442getpVg5ArA2 = UIntArray.m5442getpVg5ArA(iArr, i);
                UIntArray.m5447setVXSXFK8(iArr, i, UIntArray.m5442getpVg5ArA(iArr, i2));
                UIntArray.m5447setVXSXFK8(iArr, i2, iM5442getpVg5ArA2);
                i++;
                i2--;
            }
        }
        return i;
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: quickSort--nroSd4, reason: not valid java name */
    private static final void m5751quickSortnroSd4(long[] jArr, int i, int i2) {
        int iM5747partitionnroSd4 = m5747partitionnroSd4(jArr, i, i2);
        int i3 = iM5747partitionnroSd4 - 1;
        if (i < i3) {
            m5751quickSortnroSd4(jArr, i, i3);
        }
        if (iM5747partitionnroSd4 < i2) {
            m5751quickSortnroSd4(jArr, iM5747partitionnroSd4, i2);
        }
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: quickSort-4UcCI2c, reason: not valid java name */
    private static final void m5752quickSort4UcCI2c(byte[] bArr, int i, int i2) {
        int iM5748partition4UcCI2c = m5748partition4UcCI2c(bArr, i, i2);
        int i3 = iM5748partition4UcCI2c - 1;
        if (i < i3) {
            m5752quickSort4UcCI2c(bArr, i, i3);
        }
        if (iM5748partition4UcCI2c < i2) {
            m5752quickSort4UcCI2c(bArr, iM5748partition4UcCI2c, i2);
        }
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: quickSort-Aa5vz7o, reason: not valid java name */
    private static final void m5753quickSortAa5vz7o(short[] sArr, int i, int i2) {
        int iM5749partitionAa5vz7o = m5749partitionAa5vz7o(sArr, i, i2);
        int i3 = iM5749partitionAa5vz7o - 1;
        if (i < i3) {
            m5753quickSortAa5vz7o(sArr, i, i3);
        }
        if (iM5749partitionAa5vz7o < i2) {
            m5753quickSortAa5vz7o(sArr, iM5749partitionAa5vz7o, i2);
        }
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: quickSort-oBK06Vg, reason: not valid java name */
    private static final void m5754quickSortoBK06Vg(int[] iArr, int i, int i2) {
        int iM5750partitionoBK06Vg = m5750partitionoBK06Vg(iArr, i, i2);
        int i3 = iM5750partitionoBK06Vg - 1;
        if (i < i3) {
            m5754quickSortoBK06Vg(iArr, i, i3);
        }
        if (iM5750partitionoBK06Vg < i2) {
            m5754quickSortoBK06Vg(iArr, iM5750partitionoBK06Vg, i2);
        }
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sortArray--nroSd4, reason: not valid java name */
    public static final void m5755sortArraynroSd4(@NotNull long[] array, int i, int i2) {
        Intrinsics.checkNotNullParameter(array, "array");
        m5751quickSortnroSd4(array, i, i2 - 1);
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sortArray-4UcCI2c, reason: not valid java name */
    public static final void m5756sortArray4UcCI2c(@NotNull byte[] array, int i, int i2) {
        Intrinsics.checkNotNullParameter(array, "array");
        m5752quickSort4UcCI2c(array, i, i2 - 1);
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sortArray-Aa5vz7o, reason: not valid java name */
    public static final void m5757sortArrayAa5vz7o(@NotNull short[] array, int i, int i2) {
        Intrinsics.checkNotNullParameter(array, "array");
        m5753quickSortAa5vz7o(array, i, i2 - 1);
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sortArray-oBK06Vg, reason: not valid java name */
    public static final void m5758sortArrayoBK06Vg(@NotNull int[] array, int i, int i2) {
        Intrinsics.checkNotNullParameter(array, "array");
        m5754quickSortoBK06Vg(array, i, i2 - 1);
    }
}
