package com.cloud.sdk.cloudstorage.utils;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u0014\u0015\u0016B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u0004J*\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004J\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\r\u001a\u00020\u0004J\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u0004J*\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004J\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00112\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u0004J*\u0010\u0013\u001a\u0004\u0018\u00010\u00112\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/cloud/sdk/cloudstorage/utils/Base64;", "", "()V", "CRLF", "", "DEFAULT", "NO_CLOSE", "NO_PADDING", "NO_WRAP", "URL_SAFE", "decode", "", "input", UTraceSQLiteHelperKt.COL_FLAGS, TypedValues.CycleType.S_WAVE_OFFSET, "len", "str", "", "encode", "encodeToString", "Coder", "Decoder", "Encoder", "cloud_storage_sdk_release"}, k = 1, mv = {1, 4, 2})
public final class Base64 {
    public static final int CRLF = 4;
    public static final int DEFAULT = 0;

    @NotNull
    public static final Base64 INSTANCE = new Base64();
    public static final int NO_CLOSE = 16;
    public static final int NO_PADDING = 1;
    public static final int NO_WRAP = 2;
    public static final int URL_SAFE = 8;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H&J*\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0012H&R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0016"}, d2 = {"Lcom/cloud/sdk/cloudstorage/utils/Base64$Coder;", "", "()V", "op", "", "getOp", "()I", "setOp", "(I)V", "output", "", "getOutput", "()[B", "setOutput", "([B)V", "maxOutputSize", "len", "process", "", "input", TypedValues.CycleType.S_WAVE_OFFSET, "finish", "cloud_storage_sdk_release"}, k = 1, mv = {1, 4, 2})
    public static abstract class Coder {
        private int op;

        @Nullable
        private byte[] output;

        public final int getOp() {
            return this.op;
        }

        @Nullable
        public final byte[] getOutput() {
            return this.output;
        }

        public abstract int maxOutputSize(int len);

        public abstract boolean process(@Nullable byte[] input, int offset, int len, boolean finish);

        public final void setOp(int i) {
            this.op = i;
        }

        public final void setOutput(@Nullable byte[] bArr) {
            this.output = bArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003H\u0016J*\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u000eH\u0016R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/cloud/sdk/cloudstorage/utils/Base64$Decoder;", "Lcom/cloud/sdk/cloudstorage/utils/Base64$Coder;", UTraceSQLiteHelperKt.COL_FLAGS, "", "output", "", "(I[B)V", "alphabet", "", "state", "value", "maxOutputSize", "len", "process", "", "input", TypedValues.CycleType.S_WAVE_OFFSET, "finish", "Companion", "cloud_storage_sdk_release"}, k = 1, mv = {1, 4, 2})
    public static final class Decoder extends Coder {
        private static final int[] DECODE = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        private static final int[] DECODE_WEBSAFE = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        private static final int EQUALS = -2;
        private static final int SKIP = -1;
        private final int[] alphabet;
        private int state;
        private int value;

        public Decoder(int i, @Nullable byte[] bArr) {
            setOutput(bArr);
            this.alphabet = (i & 8) == 0 ? DECODE : DECODE_WEBSAFE;
            this.state = 0;
            this.value = 0;
        }

        @Override // com.cloud.sdk.cloudstorage.utils.Base64.Coder
        public int maxOutputSize(int len) {
            return ((len * 3) / 4) + 10;
        }

        /* JADX WARN: Code duplicated, block: B:59:0x0134  */
        @Override // com.cloud.sdk.cloudstorage.utils.Base64.Coder
        public boolean process(@Nullable byte[] input, int offset, int len, boolean finish) {
            int i = this.state;
            if (i == 6 || input == null) {
                return false;
            }
            int i2 = len + offset;
            int i3 = this.value;
            byte[] output = getOutput();
            if (output == null) {
                output = new byte[0];
            }
            int[] iArr = this.alphabet;
            if (iArr == null) {
                iArr = new int[0];
            }
            int i4 = 0;
            int i5 = i3;
            int i6 = i;
            int i7 = offset;
            while (i7 < i2) {
                if (i6 == 0) {
                    while (true) {
                        int i8 = i7 + 4;
                        if (i8 > i2 || (i5 = (iArr[input[i7] & 255] << 18) | (iArr[input[i7 + 1] & 255] << 12) | (iArr[input[i7 + 2] & 255] << 6) | iArr[input[i7 + 3] & 255]) < 0) {
                            break;
                        }
                        output[i4 + 2] = ((Byte) Integer.valueOf(i5)).byteValue();
                        output[i4 + 1] = ((Byte) Integer.valueOf(i5 >> 8)).byteValue();
                        output[i4] = ((Byte) Integer.valueOf(i5 >> 16)).byteValue();
                        i4 += 3;
                        i7 = i8;
                    }
                    if (i7 >= i2) {
                        break;
                    }
                }
                int i9 = i7 + 1;
                int i10 = iArr[input[i7] & 255];
                if (i6 != 0) {
                    if (i6 != 1) {
                        if (i6 != 2) {
                            if (i6 != 3) {
                                if (i6 != 4) {
                                    if (i6 == 5 && i10 != -1) {
                                        this.state = 6;
                                        return false;
                                    }
                                } else if (i10 == -2) {
                                    i6++;
                                } else if (i10 != -1) {
                                    this.state = 6;
                                    return false;
                                }
                            } else if (i10 >= 0) {
                                int i11 = i10 | (i5 << 6);
                                output[i4 + 2] = ((Byte) Integer.valueOf(i11)).byteValue();
                                output[i4 + 1] = ((Byte) Integer.valueOf(i11 >> 8)).byteValue();
                                output[i4] = ((Byte) Integer.valueOf(i11 >> 16)).byteValue();
                                i4 += 3;
                                i5 = i11;
                                i6 = 0;
                            } else if (i10 == -2) {
                                output[i4 + 1] = ((Byte) Integer.valueOf(i5 >> 2)).byteValue();
                                output[i4] = ((Byte) Integer.valueOf(i5 >> 10)).byteValue();
                                i4 += 2;
                                i6 = 5;
                            } else if (i10 != -1) {
                                this.state = 6;
                                return false;
                            }
                        } else if (i10 >= 0) {
                            i10 |= i5 << 6;
                            i6++;
                            i5 = i10;
                        } else if (i10 == -2) {
                            output[i4] = ((Byte) Integer.valueOf(i5 >> 4)).byteValue();
                            i4++;
                            i6 = 4;
                        } else if (i10 != -1) {
                            this.state = 6;
                            return false;
                        }
                    } else if (i10 >= 0) {
                        i10 |= i5 << 6;
                        i6++;
                        i5 = i10;
                    } else if (i10 != -1) {
                        this.state = 6;
                        return false;
                    }
                } else if (i10 >= 0) {
                    i6++;
                    i5 = i10;
                } else if (i10 != -1) {
                    this.state = 6;
                    return false;
                }
                i7 = i9;
            }
            if (!finish) {
                this.state = i6;
                this.value = i5;
                setOp(i4);
                return true;
            }
            if (i6 == 1) {
                this.state = 6;
                return false;
            }
            if (i6 == 2) {
                output[i4] = ((Byte) Integer.valueOf(i5 >> 4)).byteValue();
                i4++;
            } else if (i6 == 3) {
                int i12 = i4 + 1;
                output[i4] = ((Byte) Integer.valueOf(i5 >> 10)).byteValue();
                i4 = i12 + 1;
                output[i12] = ((Byte) Integer.valueOf(i5 >> 2)).byteValue();
            } else if (i6 == 4) {
                this.state = 6;
                return false;
            }
            this.state = i6;
            setOp(i4);
            return true;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J*\u0010\u0019\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\nH\u0016R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u000f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001e"}, d2 = {"Lcom/cloud/sdk/cloudstorage/utils/Base64$Encoder;", "Lcom/cloud/sdk/cloudstorage/utils/Base64$Coder;", UTraceSQLiteHelperKt.COL_FLAGS, "", "output", "", "(I[B)V", "alphabet", "count", "do_cr", "", "getDo_cr", "()Z", "do_newline", "getDo_newline", "do_padding", "getDo_padding", "tail", "tailLen", "getTailLen", "()I", "setTailLen", "(I)V", "maxOutputSize", "len", "process", "input", TypedValues.CycleType.S_WAVE_OFFSET, "finish", "Companion", "cloud_storage_sdk_release"}, k = 1, mv = {1, 4, 2})
    public static final class Encoder extends Coder {
        private static final byte[] ENCODE;
        private static final byte[] ENCODE_WEBSAFE;
        public static final int LINE_GROUPS = 19;
        private final byte[] alphabet;
        private int count;
        private final boolean do_cr;
        private final boolean do_newline;
        private final boolean do_padding;
        private final byte[] tail;
        private int tailLen;

        static {
            byte b = (byte) 65;
            byte b2 = (byte) 66;
            byte b3 = (byte) 67;
            byte b4 = (byte) 68;
            byte b5 = (byte) 69;
            byte b6 = (byte) 70;
            byte b7 = (byte) 71;
            byte b8 = (byte) 72;
            byte b9 = (byte) 73;
            byte b10 = (byte) 74;
            byte b11 = (byte) 75;
            byte b12 = (byte) 76;
            byte b13 = (byte) 77;
            byte b14 = (byte) 78;
            byte b15 = (byte) 79;
            byte b16 = (byte) 80;
            byte b17 = (byte) 81;
            byte b18 = (byte) 82;
            byte b19 = (byte) 83;
            byte b20 = (byte) 84;
            byte b21 = (byte) 85;
            byte b22 = (byte) 86;
            byte b23 = (byte) 87;
            byte b24 = (byte) 88;
            byte b25 = (byte) 89;
            byte b26 = (byte) 90;
            byte b27 = (byte) 97;
            byte b28 = (byte) 98;
            byte b29 = (byte) 99;
            byte b30 = (byte) 100;
            byte b31 = (byte) 101;
            byte b32 = (byte) 102;
            byte b33 = (byte) 103;
            byte b34 = (byte) 104;
            byte b35 = (byte) 105;
            byte b36 = (byte) 106;
            byte b37 = (byte) 107;
            byte b38 = (byte) 108;
            byte b39 = (byte) 109;
            byte b40 = (byte) 110;
            byte b41 = (byte) 111;
            byte b42 = (byte) 112;
            byte b43 = (byte) 113;
            byte b44 = (byte) 114;
            byte b45 = (byte) 115;
            byte b46 = (byte) 116;
            byte b47 = (byte) 117;
            byte b48 = (byte) 118;
            byte b49 = (byte) 119;
            byte b50 = (byte) 120;
            byte b51 = (byte) 121;
            byte b52 = (byte) 122;
            byte b53 = (byte) 48;
            byte b54 = (byte) 49;
            byte b55 = (byte) 50;
            byte b56 = (byte) 51;
            byte b57 = (byte) 52;
            byte b58 = (byte) 53;
            byte b59 = (byte) 54;
            byte b60 = (byte) 55;
            byte b61 = (byte) 56;
            byte b62 = (byte) 57;
            ENCODE = new byte[]{b, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20, b21, b22, b23, b24, b25, b26, b27, b28, b29, b30, b31, b32, b33, b34, b35, b36, b37, b38, b39, b40, b41, b42, b43, b44, b45, b46, b47, b48, b49, b50, b51, b52, b53, b54, b55, b56, b57, b58, b59, b60, b61, b62, (byte) 43, (byte) 47};
            ENCODE_WEBSAFE = new byte[]{b, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20, b21, b22, b23, b24, b25, b26, b27, b28, b29, b30, b31, b32, b33, b34, b35, b36, b37, b38, b39, b40, b41, b42, b43, b44, b45, b46, b47, b48, b49, b50, b51, b52, b53, b54, b55, b56, b57, b58, b59, b60, b61, b62, (byte) 45, (byte) 95};
        }

        public Encoder(int i, @Nullable byte[] bArr) {
            setOutput(bArr);
            this.do_padding = (i & 1) == 0;
            boolean z = (i & 2) == 0;
            this.do_newline = z;
            this.do_cr = (i & 4) != 0;
            this.alphabet = (i & 8) == 0 ? ENCODE : ENCODE_WEBSAFE;
            this.tail = new byte[2];
            this.tailLen = 0;
            this.count = z ? 19 : -1;
        }

        public final boolean getDo_cr() {
            return this.do_cr;
        }

        public final boolean getDo_newline() {
            return this.do_newline;
        }

        public final boolean getDo_padding() {
            return this.do_padding;
        }

        public final int getTailLen() {
            return this.tailLen;
        }

        @Override // com.cloud.sdk.cloudstorage.utils.Base64.Coder
        public int maxOutputSize(int len) {
            return ((len * 8) / 5) + 10;
        }

        /* JADX WARN: Code duplicated, block: B:24:0x0066  */
        @Override // com.cloud.sdk.cloudstorage.utils.Base64.Coder
        public boolean process(@Nullable byte[] input, int offset, int len, boolean finish) {
            byte[] bArr;
            int i;
            int i2;
            int i3;
            boolean z;
            int i4;
            int i5;
            byte b;
            byte b2;
            int i6;
            byte b3;
            int i7;
            int i8;
            byte[] bArr2;
            byte[] bArr3 = this.alphabet;
            int i9 = 0;
            if (bArr3 == null) {
                bArr3 = new byte[0];
            }
            byte[] output = getOutput();
            if (output == null) {
                output = new byte[0];
            }
            int i10 = this.count;
            int i11 = len + offset;
            int i12 = this.tailLen;
            if (i12 != 1) {
                if (i12 == 2 && (i8 = offset + 1) <= i11 && (bArr2 = this.tail) != null) {
                    int i13 = ((bArr2[1] & 255) << 8) | ((bArr2[0] & 255) << 16);
                    Intrinsics.checkNotNull(input);
                    i2 = i13 | (input[offset] & 255);
                    this.tailLen = 0;
                    i = i8;
                } else {
                    i = offset;
                    i2 = -1;
                }
            } else if (offset + 2 > i11 || (bArr = this.tail) == null) {
                i = offset;
                i2 = -1;
            } else {
                int i14 = (bArr[0] & 255) << 16;
                Intrinsics.checkNotNull(input);
                int i15 = offset + 1;
                i = i15 + 1;
                i2 = (input[i15] & 255) | i14 | ((input[offset] & 255) << 8);
                this.tailLen = 0;
            }
            if (i2 != -1) {
                output[0] = bArr3[(i2 >> 18) & 63];
                output[1] = bArr3[(i2 >> 12) & 63];
                output[2] = bArr3[(i2 >> 6) & 63];
                output[3] = bArr3[i2 & 63];
                i10--;
                if (i10 == 0) {
                    if (this.do_cr) {
                        output[4] = (byte) 13;
                        i7 = 5;
                    } else {
                        i7 = 4;
                    }
                    i3 = i7 + 1;
                    output[i7] = (byte) 10;
                    i10 = 19;
                } else {
                    i3 = 4;
                }
            } else {
                i3 = 0;
            }
            while (true) {
                int i16 = i + 3;
                if (i16 > i11) {
                    break;
                }
                if (input != null) {
                    i2 = ((input[i + 1] & 255) << 8) | ((input[i] & 255) << 16) | (input[i + 2] & 255);
                }
                output[i3] = bArr3[(i2 >> 18) & 63];
                output[i3 + 1] = bArr3[(i2 >> 12) & 63];
                output[i3 + 2] = bArr3[(i2 >> 6) & 63];
                output[i3 + 3] = bArr3[i2 & 63];
                i3 += 4;
                i10--;
                if (i10 == 0) {
                    if (this.do_cr) {
                        output[i3] = (byte) 13;
                        i3++;
                    }
                    output[i3] = (byte) 10;
                    i3++;
                    i10 = 19;
                }
                i = i16;
            }
            if (!finish) {
                byte[] bArr4 = this.tail;
                if (bArr4 != null) {
                    if (i == i11 - 1) {
                        int i17 = this.tailLen;
                        this.tailLen = i17 + 1;
                        Intrinsics.checkNotNull(input);
                        bArr4[i17] = input[i];
                    } else if (i == i11 - 2) {
                        int i18 = this.tailLen;
                        this.tailLen = i18 + 1;
                        Intrinsics.checkNotNull(input);
                        bArr4[i18] = input[i];
                        byte[] bArr5 = this.tail;
                        int i19 = this.tailLen;
                        this.tailLen = i19 + 1;
                        z = true;
                        bArr5[i19] = input[i + 1];
                    }
                }
                setOp(i3);
                this.count = i10;
                return z;
            }
            int i20 = this.tailLen;
            if (i - i20 == i11 - 1) {
                byte[] bArr6 = this.tail;
                if (bArr6 != null) {
                    if (i20 > 0) {
                        b3 = bArr6[0];
                        i6 = 1;
                    } else {
                        Intrinsics.checkNotNull(input);
                        i6 = 0;
                        b3 = input[i];
                    }
                    i2 = (b3 & 255) << 4;
                    i9 = i6;
                }
                this.tailLen -= i9;
                int i21 = i3 + 1;
                output[i3] = bArr3[(i2 >> 6) & 63];
                int i22 = i21 + 1;
                output[i21] = bArr3[i2 & 63];
                if (this.do_padding) {
                    int i23 = i22 + 1;
                    byte b4 = (byte) 61;
                    output[i22] = b4;
                    i22 = i23 + 1;
                    output[i23] = b4;
                }
                i3 = i22;
                if (this.do_newline) {
                    if (this.do_cr) {
                        output[i3] = (byte) 13;
                        i3++;
                    }
                    i4 = i3 + 1;
                    output[i3] = (byte) 10;
                    i3 = i4;
                }
            } else if (i - i20 == i11 - 2) {
                byte[] bArr7 = this.tail;
                if (bArr7 != null) {
                    if (i20 > 1) {
                        b = bArr7[0];
                        i5 = 1;
                    } else {
                        Intrinsics.checkNotNull(input);
                        byte b5 = input[i];
                        i++;
                        i5 = 0;
                        b = b5;
                    }
                    int i24 = (b & 255) << 10;
                    if (this.tailLen > 0) {
                        b2 = this.tail[i5];
                        i5++;
                    } else {
                        Intrinsics.checkNotNull(input);
                        b2 = input[i];
                    }
                    i2 = i24 | ((b2 & 255) << 2);
                    i9 = i5;
                }
                this.tailLen -= i9;
                int i25 = i3 + 1;
                output[i3] = bArr3[(i2 >> 12) & 63];
                int i26 = i25 + 1;
                output[i25] = bArr3[(i2 >> 6) & 63];
                int i27 = i26 + 1;
                output[i26] = bArr3[i2 & 63];
                if (this.do_padding) {
                    output[i27] = (byte) 61;
                    i3 = i27 + 1;
                } else {
                    i3 = i27;
                }
                if (this.do_newline) {
                    if (this.do_cr) {
                        output[i3] = (byte) 13;
                        i3++;
                    }
                    i4 = i3 + 1;
                    output[i3] = (byte) 10;
                    i3 = i4;
                }
            } else if (this.do_newline && i3 > 0 && i10 != 19) {
                if (this.do_cr) {
                    output[i3] = (byte) 13;
                    i3++;
                }
                i4 = i3 + 1;
                output[i3] = (byte) 10;
                i3 = i4;
            }
            z = true;
            setOp(i3);
            this.count = i10;
            return z;
        }

        public final void setTailLen(int i) {
            this.tailLen = i;
        }
    }

    private Base64() {
    }

    @Nullable
    public final byte[] decode(@Nullable String str, int flags) {
        if (str == null || StringsKt__StringsJVMKt.isBlank(str)) {
            return null;
        }
        Charset charset = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullExpressionValue(charset, "StandardCharsets.UTF_8");
        if (str == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        byte[] bytes = str.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
        return decode(bytes, flags);
    }

    @Nullable
    public final byte[] encode(@Nullable byte[] input, int flags) {
        if (input == null) {
            return null;
        }
        return encode(input, 0, input.length, flags);
    }

    @Nullable
    public final String encodeToString(@Nullable byte[] input, int flags) {
        try {
            byte[] bArrEncode = encode(input, flags);
            if (bArrEncode == null) {
                return null;
            }
            Charset charset = StandardCharsets.US_ASCII;
            Intrinsics.checkNotNullExpressionValue(charset, "StandardCharsets.US_ASCII");
            return new String(bArrEncode, charset);
        } catch (UnsupportedEncodingException e2) {
            throw new AssertionError(e2);
        }
    }

    @Nullable
    public final byte[] encode(@Nullable byte[] input, int offset, int len, int flags) {
        Encoder encoder = new Encoder(flags, null);
        int i = (len / 3) * 4;
        if (!encoder.getDo_padding()) {
            int i2 = len % 3;
            if (i2 == 1) {
                i += 2;
            } else if (i2 == 2) {
                i += 3;
            }
        } else if (len % 3 > 0) {
            i += 4;
        }
        if (encoder.getDo_newline() && len > 0) {
            i += (((len - 1) / 57) + 1) * (encoder.getDo_cr() ? 2 : 1);
        }
        encoder.setOutput(new byte[i]);
        encoder.process(input, offset, len, true);
        encoder.getOp();
        return encoder.getOutput();
    }

    @Nullable
    public final byte[] decode(@Nullable byte[] input, int flags) {
        if (input == null) {
            return null;
        }
        return decode(input, 0, input.length, flags);
    }

    @Nullable
    public final byte[] decode(@Nullable byte[] input, int offset, int len, int flags) {
        Decoder decoder = new Decoder(flags, new byte[(len * 3) / 4]);
        if (decoder.process(input, offset, len, true)) {
            byte[] output = decoder.getOutput();
            if (output == null) {
                return null;
            }
            if (decoder.getOp() == output.length) {
                return decoder.getOutput();
            }
            byte[] bArr = new byte[decoder.getOp()];
            System.arraycopy(output, 0, bArr, 0, decoder.getOp());
            return bArr;
        }
        throw new IllegalArgumentException("bad base-64".toString());
    }

    @Nullable
    public final String encodeToString(@Nullable byte[] input, int offset, int len, int flags) {
        try {
            byte[] bArrEncode = encode(input, offset, len, flags);
            if (bArrEncode == null) {
                return null;
            }
            Charset charset = StandardCharsets.US_ASCII;
            Intrinsics.checkNotNullExpressionValue(charset, "StandardCharsets.US_ASCII");
            return new String(bArrEncode, charset);
        } catch (UnsupportedEncodingException e2) {
            throw new AssertionError(e2);
        }
    }
}
