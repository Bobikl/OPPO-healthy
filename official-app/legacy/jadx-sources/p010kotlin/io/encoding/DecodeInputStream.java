package p010kotlin.io.encoding;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.IOException;
import java.io.InputStream;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.collections.ArraysKt___ArraysJvmKt;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
@ExperimentalEncodingApi
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0013\u001a\u00020\u0014H\u0016J \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\tH\u0002J(\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\tH\u0002J\u0010\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\tH\u0002J\b\u0010\u001d\u001a\u00020\tH\u0016J \u0010\u001d\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\tH\u0016J\b\u0010 \u001a\u00020\tH\u0002J\b\u0010!\u001a\u00020\u0014H\u0002J\b\u0010\"\u001a\u00020\u0014H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lkotlin/io/encoding/DecodeInputStream;", "Ljava/io/InputStream;", "input", "base64", "Lkotlin/io/encoding/Base64;", "(Ljava/io/InputStream;Lkotlin/io/encoding/Base64;)V", "byteBuffer", "", "byteBufferEndIndex", "", "byteBufferLength", "getByteBufferLength", "()I", "byteBufferStartIndex", "isClosed", "", "isEOF", "singleByteBuffer", "symbolBuffer", "close", "", "copyByteBufferInto", "dst", "dstOffset", "length", "decodeSymbolBufferInto", "dstEndIndex", "symbolBufferLength", "handlePaddingSymbol", "read", "destination", TypedValues.CycleType.S_WAVE_OFFSET, "readNextSymbol", "resetByteBufferIfEmpty", "shiftByteBufferToStartIfNeeded", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class DecodeInputStream extends InputStream {

    @NotNull
    private final Base64 base64;

    @NotNull
    private final byte[] byteBuffer;
    private int byteBufferEndIndex;
    private int byteBufferStartIndex;

    @NotNull
    private final InputStream input;
    private boolean isClosed;
    private boolean isEOF;

    @NotNull
    private final byte[] singleByteBuffer;

    @NotNull
    private final byte[] symbolBuffer;

    public DecodeInputStream(@NotNull InputStream input, @NotNull Base64 base64) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(base64, "base64");
        this.input = input;
        this.base64 = base64;
        this.singleByteBuffer = new byte[1];
        this.symbolBuffer = new byte[1024];
        this.byteBuffer = new byte[1024];
    }

    private final void copyByteBufferInto(byte[] dst, int dstOffset, int length) {
        byte[] bArr = this.byteBuffer;
        int i = this.byteBufferStartIndex;
        ArraysKt___ArraysJvmKt.copyInto(bArr, dst, dstOffset, i, i + length);
        this.byteBufferStartIndex += length;
        resetByteBufferIfEmpty();
    }

    private final int decodeSymbolBufferInto(byte[] dst, int dstOffset, int dstEndIndex, int symbolBufferLength) {
        int i = this.byteBufferEndIndex;
        this.byteBufferEndIndex = i + this.base64.decodeIntoByteArray(this.symbolBuffer, this.byteBuffer, i, 0, symbolBufferLength);
        int iMin = Math.min(getByteBufferLength(), dstEndIndex - dstOffset);
        copyByteBufferInto(dst, dstOffset, iMin);
        shiftByteBufferToStartIfNeeded();
        return iMin;
    }

    private final int getByteBufferLength() {
        return this.byteBufferEndIndex - this.byteBufferStartIndex;
    }

    private final int handlePaddingSymbol(int symbolBufferLength) throws IOException {
        this.symbolBuffer[symbolBufferLength] = Base64.padSymbol;
        if ((symbolBufferLength & 3) != 2) {
            return symbolBufferLength + 1;
        }
        int nextSymbol = readNextSymbol();
        if (nextSymbol >= 0) {
            this.symbolBuffer[symbolBufferLength + 1] = (byte) nextSymbol;
        }
        return symbolBufferLength + 2;
    }

    private final int readNextSymbol() throws IOException {
        int i;
        if (!this.base64.getIsMimeScheme()) {
            return this.input.read();
        }
        do {
            i = this.input.read();
            if (i == -1) {
                break;
            }
        } while (!Base64Kt.isInMimeAlphabet(i));
        return i;
    }

    private final void resetByteBufferIfEmpty() {
        if (this.byteBufferStartIndex == this.byteBufferEndIndex) {
            this.byteBufferStartIndex = 0;
            this.byteBufferEndIndex = 0;
        }
    }

    private final void shiftByteBufferToStartIfNeeded() {
        byte[] bArr = this.byteBuffer;
        int length = bArr.length;
        int i = this.byteBufferEndIndex;
        if ((this.symbolBuffer.length / 4) * 3 > length - i) {
            ArraysKt___ArraysJvmKt.copyInto(bArr, bArr, 0, this.byteBufferStartIndex, i);
            this.byteBufferEndIndex -= this.byteBufferStartIndex;
            this.byteBufferStartIndex = 0;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.isClosed) {
            return;
        }
        this.isClosed = true;
        this.input.close();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        int i = this.byteBufferStartIndex;
        if (i < this.byteBufferEndIndex) {
            int i2 = this.byteBuffer[i] & 255;
            this.byteBufferStartIndex = i + 1;
            resetByteBufferIfEmpty();
            return i2;
        }
        int i3 = read(this.singleByteBuffer, 0, 1);
        if (i3 == -1) {
            return -1;
        }
        if (i3 == 1) {
            return this.singleByteBuffer[0] & 255;
        }
        throw new IllegalStateException("Unreachable".toString());
    }

    @Override // java.io.InputStream
    public int read(@NotNull byte[] destination, int offset, int length) throws IOException {
        int i;
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (offset >= 0 && length >= 0 && (i = offset + length) <= destination.length) {
            if (!this.isClosed) {
                if (this.isEOF) {
                    return -1;
                }
                if (length == 0) {
                    return 0;
                }
                if (getByteBufferLength() >= length) {
                    copyByteBufferInto(destination, offset, length);
                    return length;
                }
                int byteBufferLength = ((((length - getByteBufferLength()) + 3) - 1) / 3) * 4;
                int iDecodeSymbolBufferInto = offset;
                while (true) {
                    z = this.isEOF;
                    if (z || byteBufferLength <= 0) {
                        break;
                    }
                    int iMin = Math.min(this.symbolBuffer.length, byteBufferLength);
                    int iHandlePaddingSymbol = 0;
                    while (true) {
                        z2 = this.isEOF;
                        if (z2 || iHandlePaddingSymbol >= iMin) {
                            break;
                        }
                        int nextSymbol = readNextSymbol();
                        if (nextSymbol == -1) {
                            this.isEOF = true;
                        } else if (nextSymbol != 61) {
                            this.symbolBuffer[iHandlePaddingSymbol] = (byte) nextSymbol;
                            iHandlePaddingSymbol++;
                        } else {
                            iHandlePaddingSymbol = handlePaddingSymbol(iHandlePaddingSymbol);
                            this.isEOF = true;
                        }
                    }
                    if (z2 || iHandlePaddingSymbol == iMin) {
                        byteBufferLength -= iHandlePaddingSymbol;
                        iDecodeSymbolBufferInto += decodeSymbolBufferInto(destination, iDecodeSymbolBufferInto, i, iHandlePaddingSymbol);
                    } else {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                }
                if (iDecodeSymbolBufferInto == offset && z) {
                    return -1;
                }
                return iDecodeSymbolBufferInto - offset;
            }
            throw new IOException("The input stream is closed.");
        }
        throw new IndexOutOfBoundsException("offset: " + offset + ", length: " + length + ", buffer size: " + destination.length);
    }
}
