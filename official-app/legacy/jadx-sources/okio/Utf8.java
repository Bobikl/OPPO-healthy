package okio;

import com.oplus.aiunit.vision.oei;
import com.oplus.aiunit.vision.u48;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.JvmName;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.ByteCompanionObject;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u001a\u0011\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0001H\u0080\b\u001a\u0011\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0007H\u0080\b\u001a4\u0010\u0010\u001a\u00020\u0001*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00160\u0015H\u0080\bø\u0001\u0000\u001a4\u0010\u0017\u001a\u00020\u0001*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00160\u0015H\u0080\bø\u0001\u0000\u001a4\u0010\u0018\u001a\u00020\u0001*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00160\u0015H\u0080\bø\u0001\u0000\u001a4\u0010\u0019\u001a\u00020\u0016*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00160\u0015H\u0080\bø\u0001\u0000\u001a4\u0010\u001a\u001a\u00020\u0016*\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00160\u0015H\u0080\bø\u0001\u0000\u001a4\u0010\u001c\u001a\u00020\u0016*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00160\u0015H\u0080\bø\u0001\u0000\u001a%\u0010\u001d\u001a\u00020\u001e*\u00020\u001b2\b\b\u0002\u0010\u0012\u001a\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u0001H\u0007¢\u0006\u0002\b\u001f\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\tX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006 "}, d2 = {"HIGH_SURROGATE_HEADER", "", "LOG_SURROGATE_HEADER", "MASK_2BYTES", "MASK_3BYTES", "MASK_4BYTES", "REPLACEMENT_BYTE", "", "REPLACEMENT_CHARACTER", "", "REPLACEMENT_CODE_POINT", "isIsoControl", "", "codePoint", "isUtf8Continuation", "byte", "process2Utf8Bytes", "", "beginIndex", "endIndex", "yield", "Lkotlin/Function1;", "", "process3Utf8Bytes", "process4Utf8Bytes", "processUtf16Chars", "processUtf8Bytes", "", "processUtf8CodePoints", "utf8Size", "", "size", "okio"}, k = 2, mv = {1, 9, 0}, xi = 48)
@JvmName(name = "Utf8")
@SourceDebugExtension({"SMAP\nUtf8.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Utf8.kt\nokio/Utf8\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,559:1\n397#1,9:563\n127#1:572\n406#1,20:574\n440#1,4:595\n127#1:599\n446#1,10:601\n127#1:611\n456#1,5:612\n127#1:617\n461#1,24:618\n500#1,4:643\n127#1:647\n506#1,2:649\n127#1:651\n510#1,10:652\n127#1:662\n520#1,5:663\n127#1:668\n525#1,5:669\n127#1:674\n530#1,28:675\n397#1,9:704\n127#1:713\n406#1,20:715\n440#1,4:736\n127#1:740\n446#1,10:742\n127#1:752\n456#1,5:753\n127#1:758\n461#1,24:759\n500#1,4:784\n127#1:788\n506#1,2:790\n127#1:792\n510#1,10:793\n127#1:803\n520#1,5:804\n127#1:809\n525#1,5:810\n127#1:815\n530#1,28:816\n127#1:844\n127#1:846\n127#1:848\n127#1:850\n127#1:852\n127#1:854\n127#1:856\n127#1:858\n127#1:860\n1#2:560\n74#3:561\n68#3:562\n74#3:573\n68#3:594\n74#3:600\n68#3:642\n74#3:648\n68#3:703\n74#3:714\n68#3:735\n74#3:741\n68#3:783\n74#3:789\n74#3:845\n74#3:847\n74#3:849\n74#3:851\n74#3:853\n74#3:855\n74#3:857\n74#3:859\n74#3:861\n*S KotlinDebug\n*F\n+ 1 Utf8.kt\nokio/Utf8\n*L\n228#1:563,9\n228#1:572\n228#1:574,20\n232#1:595,4\n232#1:599\n232#1:601,10\n232#1:611\n232#1:612,5\n232#1:617\n232#1:618,24\n236#1:643,4\n236#1:647\n236#1:649,2\n236#1:651\n236#1:652,10\n236#1:662\n236#1:663,5\n236#1:668\n236#1:669,5\n236#1:674\n236#1:675,28\n277#1:704,9\n277#1:713\n277#1:715,20\n281#1:736,4\n281#1:740\n281#1:742,10\n281#1:752\n281#1:753,5\n281#1:758\n281#1:759,24\n285#1:784,4\n285#1:788\n285#1:790,2\n285#1:792\n285#1:793,10\n285#1:803\n285#1:804,5\n285#1:809\n285#1:810,5\n285#1:815\n285#1:816,28\n405#1:844\n443#1:846\n455#1:848\n460#1:850\n503#1:852\n507#1:854\n519#1:856\n524#1:858\n529#1:860\n127#1:561\n226#1:562\n228#1:573\n230#1:594\n232#1:600\n234#1:642\n236#1:648\n275#1:703\n277#1:714\n279#1:735\n281#1:741\n283#1:783\n285#1:789\n405#1:845\n443#1:847\n455#1:849\n460#1:851\n503#1:853\n507#1:855\n519#1:857\n524#1:859\n529#1:861\n*E\n"})
public final class Utf8 {
    public static final int HIGH_SURROGATE_HEADER = 55232;
    public static final int LOG_SURROGATE_HEADER = 56320;
    public static final int MASK_2BYTES = 3968;
    public static final int MASK_3BYTES = -123008;
    public static final int MASK_4BYTES = 3678080;
    public static final byte REPLACEMENT_BYTE = 63;
    public static final char REPLACEMENT_CHARACTER = 65533;
    public static final int REPLACEMENT_CODE_POINT = 65533;

    public static final boolean isIsoControl(int i) {
        if (i >= 0 && i < 32) {
            return true;
        }
        return 127 <= i && i < 160;
    }

    public static final boolean isUtf8Continuation(byte b) {
        return (b & 192) == 128;
    }

    public static final int process2Utf8Bytes(@NotNull byte[] bArr, int i, int i2, @NotNull Function1<? super Integer, Unit> yield) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(yield, "yield");
        int i3 = i + 1;
        if (i2 <= i3) {
            yield.invoke(65533);
            return 1;
        }
        byte b = bArr[i];
        byte b2 = bArr[i3];
        if (!((b2 & 192) == 128)) {
            yield.invoke(65533);
            return 1;
        }
        int i4 = (b2 ^ ByteCompanionObject.MIN_VALUE) ^ (b << 6);
        if (i4 < 128) {
            yield.invoke(65533);
            return 2;
        }
        yield.invoke(Integer.valueOf(i4));
        return 2;
    }

    public static final int process3Utf8Bytes(@NotNull byte[] bArr, int i, int i2, @NotNull Function1<? super Integer, Unit> yield) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(yield, "yield");
        int i3 = i + 2;
        boolean z = false;
        if (i2 <= i3) {
            yield.invoke(65533);
            int i4 = i + 1;
            if (i2 > i4) {
                if ((bArr[i4] & 192) == 128) {
                    return 2;
                }
            }
            return 1;
        }
        byte b = bArr[i];
        byte b2 = bArr[i + 1];
        if (!((b2 & 192) == 128)) {
            yield.invoke(65533);
            return 1;
        }
        byte b3 = bArr[i3];
        if (!((b3 & 192) == 128)) {
            yield.invoke(65533);
            return 2;
        }
        int i5 = ((b3 ^ ByteCompanionObject.MIN_VALUE) ^ (b2 << 6)) ^ (b << 12);
        if (i5 < 2048) {
            yield.invoke(65533);
            return 3;
        }
        if (55296 <= i5 && i5 < 57344) {
            z = true;
        }
        if (z) {
            yield.invoke(65533);
            return 3;
        }
        yield.invoke(Integer.valueOf(i5));
        return 3;
    }

    public static final int process4Utf8Bytes(@NotNull byte[] bArr, int i, int i2, @NotNull Function1<? super Integer, Unit> yield) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(yield, "yield");
        int i3 = i + 3;
        boolean z = false;
        if (i2 <= i3) {
            yield.invoke(65533);
            int i4 = i + 1;
            if (i2 > i4) {
                if ((bArr[i4] & 192) == 128) {
                    int i5 = i + 2;
                    if (i2 > i5) {
                        if ((bArr[i5] & 192) == 128) {
                            return 3;
                        }
                    }
                    return 2;
                }
            }
            return 1;
        }
        byte b = bArr[i];
        byte b2 = bArr[i + 1];
        if (!((b2 & 192) == 128)) {
            yield.invoke(65533);
            return 1;
        }
        byte b3 = bArr[i + 2];
        if (!((b3 & 192) == 128)) {
            yield.invoke(65533);
            return 2;
        }
        byte b4 = bArr[i3];
        if (!((b4 & 192) == 128)) {
            yield.invoke(65533);
            return 3;
        }
        int i6 = (((b4 ^ ByteCompanionObject.MIN_VALUE) ^ (b3 << 6)) ^ (b2 << 12)) ^ (b << 18);
        if (i6 > 1114111) {
            yield.invoke(65533);
            return 4;
        }
        if (55296 <= i6 && i6 < 57344) {
            z = true;
        }
        if (z) {
            yield.invoke(65533);
            return 4;
        }
        if (i6 < 65536) {
            yield.invoke(65533);
            return 4;
        }
        yield.invoke(Integer.valueOf(i6));
        return 4;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0171  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d2  */
    public static final void processUtf16Chars(@NotNull byte[] bArr, int i, int i2, @NotNull Function1<? super Character, Unit> yield) {
        int i3;
        char c2;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(yield, "yield");
        int i4 = i;
        while (i4 < i2) {
            byte b = bArr[i4];
            if (b >= 0) {
                yield.invoke(Character.valueOf((char) b));
                i4++;
                while (i4 < i2) {
                    byte b2 = bArr[i4];
                    if (b2 < 0) {
                        break;
                    }
                    i4++;
                    yield.invoke(Character.valueOf((char) b2));
                }
            } else {
                boolean z = false;
                if ((b >> 5) == -2) {
                    int i5 = i4 + 1;
                    if (i2 > i5) {
                        byte b3 = bArr[i5];
                        if ((b3 & 192) == 128) {
                            int i6 = (b << 6) ^ (b3 ^ ByteCompanionObject.MIN_VALUE);
                            yield.invoke(Character.valueOf(i6 < 128 ? (char) 65533 : (char) i6));
                            Unit unit = Unit.INSTANCE;
                            i3 = 2;
                            i4 += i3;
                        }
                    }
                    yield.invoke(Character.valueOf((char) 65533));
                    Unit unit2 = Unit.INSTANCE;
                    i3 = 1;
                    i4 += i3;
                } else if ((b >> 4) == -2) {
                    int i7 = i4 + 2;
                    if (i2 <= i7) {
                        yield.invoke(Character.valueOf((char) 65533));
                        Unit unit3 = Unit.INSTANCE;
                        int i8 = i4 + 1;
                        if (i2 > i8) {
                            if ((bArr[i8] & 192) == 128) {
                                i3 = 2;
                            }
                        }
                        i3 = 1;
                    } else {
                        byte b4 = bArr[i4 + 1];
                        if ((b4 & 192) == 128) {
                            byte b5 = bArr[i7];
                            if ((b5 & 192) == 128) {
                                int i9 = (b << 12) ^ ((b5 ^ ByteCompanionObject.MIN_VALUE) ^ (b4 << 6));
                                if (i9 >= 2048) {
                                    if (55296 <= i9 && i9 < 57344) {
                                        z = true;
                                    }
                                    if (z) {
                                        c2 = (char) 65533;
                                    } else {
                                        c2 = (char) i9;
                                    }
                                } else {
                                    c2 = (char) 65533;
                                }
                                yield.invoke(Character.valueOf(c2));
                                Unit unit4 = Unit.INSTANCE;
                                i3 = 3;
                            } else {
                                yield.invoke(Character.valueOf((char) 65533));
                                Unit unit5 = Unit.INSTANCE;
                                i3 = 2;
                            }
                        } else {
                            yield.invoke(Character.valueOf((char) 65533));
                            Unit unit6 = Unit.INSTANCE;
                            i3 = 1;
                        }
                    }
                    i4 += i3;
                } else if ((b >> 3) == -2) {
                    int i10 = i4 + 3;
                    if (i2 <= i10) {
                        yield.invoke(Character.valueOf(REPLACEMENT_CHARACTER));
                        Unit unit7 = Unit.INSTANCE;
                        int i11 = i4 + 1;
                        if (i2 > i11) {
                            if ((bArr[i11] & 192) == 128) {
                                int i12 = i4 + 2;
                                if (i2 > i12) {
                                    if ((bArr[i12] & 192) == 128) {
                                        i3 = 3;
                                    }
                                }
                                i3 = 2;
                            }
                        }
                        i3 = 1;
                    } else {
                        byte b6 = bArr[i4 + 1];
                        if ((b6 & 192) == 128) {
                            byte b7 = bArr[i4 + 2];
                            if ((b7 & 192) == 128) {
                                byte b8 = bArr[i10];
                                if ((b8 & 192) == 128) {
                                    int i13 = (b << 18) ^ (((b8 ^ ByteCompanionObject.MIN_VALUE) ^ (b7 << 6)) ^ (b6 << 12));
                                    if (i13 <= 1114111) {
                                        if (55296 <= i13 && i13 < 57344) {
                                            z = true;
                                        }
                                        if (z || i13 < 65536 || i13 == 65533) {
                                            yield.invoke(Character.valueOf(REPLACEMENT_CHARACTER));
                                        } else {
                                            yield.invoke(Character.valueOf((char) ((i13 >>> 10) + HIGH_SURROGATE_HEADER)));
                                            yield.invoke(Character.valueOf((char) ((i13 & 1023) + 56320)));
                                        }
                                    } else {
                                        yield.invoke(Character.valueOf(REPLACEMENT_CHARACTER));
                                    }
                                    Unit unit8 = Unit.INSTANCE;
                                    i3 = 4;
                                } else {
                                    yield.invoke(Character.valueOf(REPLACEMENT_CHARACTER));
                                    Unit unit9 = Unit.INSTANCE;
                                    i3 = 3;
                                }
                            } else {
                                yield.invoke(Character.valueOf(REPLACEMENT_CHARACTER));
                                Unit unit10 = Unit.INSTANCE;
                                i3 = 2;
                            }
                        } else {
                            yield.invoke(Character.valueOf(REPLACEMENT_CHARACTER));
                            Unit unit11 = Unit.INSTANCE;
                            i3 = 1;
                        }
                    }
                    i4 += i3;
                } else {
                    yield.invoke(Character.valueOf(REPLACEMENT_CHARACTER));
                    i4++;
                }
            }
        }
    }

    public static final void processUtf8Bytes(@NotNull String str, int i, int i2, @NotNull Function1<? super Byte, Unit> yield) {
        int i3;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(yield, "yield");
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (Intrinsics.compare((int) cCharAt, 128) < 0) {
                yield.invoke(Byte.valueOf((byte) cCharAt));
                i++;
                while (i < i2 && Intrinsics.compare((int) str.charAt(i), 128) < 0) {
                    yield.invoke(Byte.valueOf((byte) str.charAt(i)));
                    i++;
                }
            } else {
                if (Intrinsics.compare((int) cCharAt, 2048) < 0) {
                    yield.invoke(Byte.valueOf((byte) ((cCharAt >> 6) | 192)));
                    yield.invoke(Byte.valueOf((byte) ((cCharAt & '?') | 128)));
                } else {
                    boolean z = false;
                    if (55296 <= cCharAt && cCharAt < 57344) {
                        if (Intrinsics.compare((int) cCharAt, u48.SURR1_LAST) <= 0 && i2 > (i3 = i + 1)) {
                            char cCharAt2 = str.charAt(i3);
                            if (56320 <= cCharAt2 && cCharAt2 < 57344) {
                                z = true;
                            }
                            if (z) {
                                int iCharAt = ((cCharAt << '\n') + str.charAt(i3)) - 56613888;
                                yield.invoke(Byte.valueOf((byte) ((iCharAt >> 18) | 240)));
                                yield.invoke(Byte.valueOf((byte) (((iCharAt >> 12) & 63) | 128)));
                                yield.invoke(Byte.valueOf((byte) (((iCharAt >> 6) & 63) | 128)));
                                yield.invoke(Byte.valueOf((byte) ((iCharAt & 63) | 128)));
                                i += 2;
                            }
                        }
                        yield.invoke(Byte.valueOf(REPLACEMENT_BYTE));
                    } else {
                        yield.invoke(Byte.valueOf((byte) ((cCharAt >> '\f') | oei.TAI_CHI)));
                        yield.invoke(Byte.valueOf((byte) (((cCharAt >> 6) & 63) | 128)));
                        yield.invoke(Byte.valueOf((byte) ((cCharAt & '?') | 128)));
                    }
                }
                i++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x016f  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ce  */
    public static final void processUtf8CodePoints(@NotNull byte[] bArr, int i, int i2, @NotNull Function1<? super Integer, Unit> yield) {
        int i3;
        int iValueOf;
        int iValueOf2;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(yield, "yield");
        int i4 = i;
        while (i4 < i2) {
            byte b = bArr[i4];
            if (b >= 0) {
                yield.invoke(Integer.valueOf(b));
                i4++;
                while (i4 < i2) {
                    byte b2 = bArr[i4];
                    if (b2 < 0) {
                        break;
                    }
                    i4++;
                    yield.invoke(Integer.valueOf(b2));
                }
            } else {
                boolean z = false;
                if ((b >> 5) == -2) {
                    int i5 = i4 + 1;
                    if (i2 > i5) {
                        byte b3 = bArr[i5];
                        if ((b3 & 192) == 128) {
                            int i6 = (b << 6) ^ (b3 ^ ByteCompanionObject.MIN_VALUE);
                            yield.invoke(i6 < 128 ? 65533 : Integer.valueOf(i6));
                            Unit unit = Unit.INSTANCE;
                            i3 = 2;
                            i4 += i3;
                        }
                    }
                    yield.invoke(65533);
                    Unit unit2 = Unit.INSTANCE;
                    i3 = 1;
                    i4 += i3;
                } else if ((b >> 4) == -2) {
                    int i7 = i4 + 2;
                    if (i2 <= i7) {
                        yield.invoke(65533);
                        Unit unit3 = Unit.INSTANCE;
                        int i8 = i4 + 1;
                        if (i2 > i8) {
                            if ((bArr[i8] & 192) == 128) {
                                i3 = 2;
                            }
                        }
                        i3 = 1;
                    } else {
                        byte b4 = bArr[i4 + 1];
                        if ((b4 & 192) == 128) {
                            byte b5 = bArr[i7];
                            if ((b5 & 192) == 128) {
                                int i9 = (b << 12) ^ ((b5 ^ ByteCompanionObject.MIN_VALUE) ^ (b4 << 6));
                                if (i9 >= 2048) {
                                    if (55296 <= i9 && i9 < 57344) {
                                        z = true;
                                    }
                                    if (z) {
                                        iValueOf = 65533;
                                    } else {
                                        iValueOf = Integer.valueOf(i9);
                                    }
                                } else {
                                    iValueOf = 65533;
                                }
                                yield.invoke(iValueOf);
                                Unit unit4 = Unit.INSTANCE;
                                i3 = 3;
                            } else {
                                yield.invoke(65533);
                                Unit unit5 = Unit.INSTANCE;
                                i3 = 2;
                            }
                        } else {
                            yield.invoke(65533);
                            Unit unit6 = Unit.INSTANCE;
                            i3 = 1;
                        }
                    }
                    i4 += i3;
                } else if ((b >> 3) == -2) {
                    int i10 = i4 + 3;
                    if (i2 <= i10) {
                        yield.invoke(65533);
                        Unit unit7 = Unit.INSTANCE;
                        int i11 = i4 + 1;
                        if (i2 > i11) {
                            if ((bArr[i11] & 192) == 128) {
                                int i12 = i4 + 2;
                                if (i2 > i12) {
                                    if ((bArr[i12] & 192) == 128) {
                                        i3 = 3;
                                    }
                                }
                                i3 = 2;
                            }
                        }
                        i3 = 1;
                    } else {
                        byte b6 = bArr[i4 + 1];
                        if ((b6 & 192) == 128) {
                            byte b7 = bArr[i4 + 2];
                            if ((b7 & 192) == 128) {
                                byte b8 = bArr[i10];
                                if ((b8 & 192) == 128) {
                                    int i13 = (b << 18) ^ (((b8 ^ ByteCompanionObject.MIN_VALUE) ^ (b7 << 6)) ^ (b6 << 12));
                                    if (i13 <= 1114111) {
                                        if (55296 <= i13 && i13 < 57344) {
                                            z = true;
                                        }
                                        if (!z && i13 >= 65536) {
                                            iValueOf2 = Integer.valueOf(i13);
                                        } else {
                                            iValueOf2 = 65533;
                                        }
                                    } else {
                                        iValueOf2 = 65533;
                                    }
                                    yield.invoke(iValueOf2);
                                    Unit unit8 = Unit.INSTANCE;
                                    i3 = 4;
                                } else {
                                    yield.invoke(65533);
                                    Unit unit9 = Unit.INSTANCE;
                                    i3 = 3;
                                }
                            } else {
                                yield.invoke(65533);
                                Unit unit10 = Unit.INSTANCE;
                                i3 = 2;
                            }
                        } else {
                            yield.invoke(65533);
                            Unit unit11 = Unit.INSTANCE;
                            i3 = 1;
                        }
                    }
                    i4 += i3;
                } else {
                    yield.invoke(65533);
                    i4++;
                }
            }
        }
    }

    @JvmOverloads
    @JvmName(name = "size")
    public static final long size(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return size$default(str, 0, 0, 3, null);
    }

    public static /* synthetic */ long size$default(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return size(str, i, i2);
    }

    @JvmOverloads
    @JvmName(name = "size")
    public static final long size(@NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return size$default(str, i, 0, 2, null);
    }

    @JvmOverloads
    @JvmName(name = "size")
    public static final long size(@NotNull String str, int i, int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i).toString());
        }
        if (i2 >= i) {
            if (!(i2 <= str.length())) {
                throw new IllegalArgumentException(("endIndex > string.length: " + i2 + " > " + str.length()).toString());
            }
            long j2 = 0;
            while (i < i2) {
                char cCharAt = str.charAt(i);
                if (cCharAt < 128) {
                    j2++;
                } else {
                    if (cCharAt < 2048) {
                        i3 = 2;
                    } else if (cCharAt < 55296 || cCharAt > 57343) {
                        i3 = 3;
                    } else {
                        int i4 = i + 1;
                        char cCharAt2 = i4 < i2 ? str.charAt(i4) : (char) 0;
                        if (cCharAt > 56319 || cCharAt2 < 56320 || cCharAt2 > 57343) {
                            j2++;
                            i = i4;
                        } else {
                            j2 += (long) 4;
                            i += 2;
                        }
                    }
                    j2 += (long) i3;
                }
                i++;
            }
            return j2;
        }
        throw new IllegalArgumentException(("endIndex < beginIndex: " + i2 + " < " + i).toString());
    }
}
