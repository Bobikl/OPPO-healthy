package io.netty.handler.codec.compression;

import androidx.core.app.FrameMetricsAggregator;
import io.netty.buffer.ByteBuf;
import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
final class Bzip2HuffmanStageEncoder {
    private static final int HUFFMAN_HIGH_SYMBOL_COST = 15;
    private final int[][] huffmanCodeLengths;
    private final int[][] huffmanMergedCodeSymbols;
    private final int mtfAlphabetSize;
    private final char[] mtfBlock;
    private final int mtfLength;
    private final int[] mtfSymbolFrequencies;
    private final byte[] selectors;
    private final Bzip2BitWriter writer;

    public Bzip2HuffmanStageEncoder(Bzip2BitWriter bzip2BitWriter, char[] cArr, int i, int i2, int[] iArr) {
        this.writer = bzip2BitWriter;
        this.mtfBlock = cArr;
        this.mtfLength = i;
        this.mtfAlphabetSize = i2;
        this.mtfSymbolFrequencies = iArr;
        int iSelectTableCount = selectTableCount(i);
        Class cls = Integer.TYPE;
        this.huffmanCodeLengths = (int[][]) Array.newInstance((Class<?>) cls, iSelectTableCount, i2);
        this.huffmanMergedCodeSymbols = (int[][]) Array.newInstance((Class<?>) cls, iSelectTableCount, i2);
        this.selectors = new byte[((i + 50) - 1) / 50];
    }

    private void assignHuffmanCodeSymbols() {
        int[][] iArr = this.huffmanMergedCodeSymbols;
        int[][] iArr2 = this.huffmanCodeLengths;
        int i = this.mtfAlphabetSize;
        int length = iArr2.length;
        for (int i2 = 0; i2 < length; i2++) {
            int[] iArr3 = iArr2[i2];
            int i3 = 32;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                int i6 = iArr3[i5];
                if (i6 > i4) {
                    i4 = i6;
                }
                if (i6 < i3) {
                    i3 = i6;
                }
            }
            int i7 = 0;
            while (i3 <= i4) {
                for (int i8 = 0; i8 < i; i8++) {
                    if ((iArr2[i2][i8] & 255) == i3) {
                        iArr[i2][i8] = (i3 << 24) | i7;
                        i7++;
                    }
                }
                i7 <<= 1;
                i3++;
            }
        }
    }

    private static void generateHuffmanCodeLengths(int i, int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[i];
        int[] iArr4 = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr3[i2] = (iArr[i2] << 9) | i2;
        }
        Arrays.sort(iArr3);
        for (int i3 = 0; i3 < i; i3++) {
            iArr4[i3] = iArr3[i3] >>> 9;
        }
        Bzip2HuffmanAllocator.allocateHuffmanCodeLengths(iArr4, 20);
        for (int i4 = 0; i4 < i; i4++) {
            iArr2[iArr3[i4] & FrameMetricsAggregator.EVERY_DURATION] = iArr4[i4];
        }
    }

    private void generateHuffmanOptimisationSeeds() {
        int[][] iArr = this.huffmanCodeLengths;
        int[] iArr2 = this.mtfSymbolFrequencies;
        int i = this.mtfAlphabetSize;
        int length = iArr.length;
        int i2 = this.mtfLength;
        int i3 = -1;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = length - i4;
            int i6 = i2 / i5;
            int i7 = i3 + 1;
            int i8 = 0;
            while (i8 < i6 && i3 < i - 1) {
                i3++;
                i8 += iArr2[i3];
            }
            if (i3 > i7 && i4 != 0 && i4 != length - 1 && (i5 & 1) == 0) {
                i8 -= iArr2[i3];
                i3--;
            }
            int[] iArr3 = iArr[i4];
            for (int i9 = 0; i9 < i; i9++) {
                if (i9 < i7 || i9 > i3) {
                    iArr3[i9] = 15;
                }
            }
            i2 -= i8;
        }
    }

    private void optimiseSelectorsAndHuffmanTables(boolean z) {
        char[] cArr = this.mtfBlock;
        byte[] bArr = this.selectors;
        int[][] iArr = this.huffmanCodeLengths;
        int i = this.mtfLength;
        int i2 = this.mtfAlphabetSize;
        int length = iArr.length;
        int[][] iArr2 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, length, i2);
        byte b = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            int iMin = Math.min(i3 + 50, i) - 1;
            int[] iArr3 = new int[length];
            for (int i5 = i3; i5 <= iMin; i5++) {
                char c2 = cArr[i5];
                for (int i6 = b; i6 < length; i6++) {
                    iArr3[i6] = iArr3[i6] + iArr[i6][c2];
                }
            }
            int i7 = iArr3[b];
            byte b2 = b;
            for (byte b3 = 1; b3 < length; b3 = (byte) (b3 + 1)) {
                int i8 = iArr3[b3];
                if (i8 < i7) {
                    i7 = i8;
                    b2 = b3;
                }
            }
            int[] iArr4 = iArr2[b2];
            while (i3 <= iMin) {
                char c3 = cArr[i3];
                iArr4[c3] = iArr4[c3] + 1;
                i3++;
            }
            if (z) {
                bArr[i4] = b2;
                i4++;
            }
            i3 = iMin + 1;
            b = 0;
        }
        for (int i9 = 0; i9 < length; i9++) {
            generateHuffmanCodeLengths(i2, iArr2[i9], iArr[i9]);
        }
    }

    private static int selectTableCount(int i) {
        if (i >= 2400) {
            return 6;
        }
        if (i >= 1200) {
            return 5;
        }
        if (i >= 600) {
            return 4;
        }
        return i >= 200 ? 3 : 2;
    }

    private void writeBlockData(ByteBuf byteBuf) {
        Bzip2BitWriter bzip2BitWriter = this.writer;
        int[][] iArr = this.huffmanMergedCodeSymbols;
        byte[] bArr = this.selectors;
        int i = this.mtfLength;
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            int iMin = Math.min(i2 + 50, i) - 1;
            int i4 = i3 + 1;
            int[] iArr2 = iArr[bArr[i3]];
            while (i2 <= iMin) {
                int i5 = i2 + 1;
                int i6 = iArr2[this.mtfBlock[i2]];
                bzip2BitWriter.writeBits(byteBuf, i6 >>> 24, i6);
                i2 = i5;
            }
            i3 = i4;
        }
    }

    private void writeSelectorsAndHuffmanTables(ByteBuf byteBuf) {
        Bzip2BitWriter bzip2BitWriter = this.writer;
        byte[] bArr = this.selectors;
        int length = bArr.length;
        int[][] iArr = this.huffmanCodeLengths;
        int length2 = iArr.length;
        int i = this.mtfAlphabetSize;
        int i2 = 3;
        bzip2BitWriter.writeBits(byteBuf, 3, length2);
        bzip2BitWriter.writeBits(byteBuf, 15, length);
        Bzip2MoveToFrontTable bzip2MoveToFrontTable = new Bzip2MoveToFrontTable();
        for (byte b : bArr) {
            bzip2BitWriter.writeUnary(byteBuf, bzip2MoveToFrontTable.valueToFront(b));
        }
        int length3 = iArr.length;
        int i3 = 0;
        while (i3 < length3) {
            int[] iArr2 = iArr[i3];
            int i4 = iArr2[0];
            bzip2BitWriter.writeBits(byteBuf, 5, i4);
            int i5 = 0;
            while (i5 < i) {
                int i6 = iArr2[i5];
                int i7 = i4 < i6 ? 2 : i2;
                int iAbs = Math.abs(i6 - i4);
                while (true) {
                    int i8 = iAbs - 1;
                    if (iAbs > 0) {
                        bzip2BitWriter.writeBits(byteBuf, 2, i7);
                        iAbs = i8;
                    }
                }
                bzip2BitWriter.writeBoolean(byteBuf, false);
                i5++;
                i4 = i6;
                i2 = 3;
            }
            i3++;
            i2 = 3;
        }
    }

    public void encode(ByteBuf byteBuf) {
        generateHuffmanOptimisationSeeds();
        int i = 3;
        while (i >= 0) {
            optimiseSelectorsAndHuffmanTables(i == 0);
            i--;
        }
        assignHuffmanCodeSymbols();
        writeSelectorsAndHuffmanTables(byteBuf);
        writeBlockData(byteBuf);
    }
}
