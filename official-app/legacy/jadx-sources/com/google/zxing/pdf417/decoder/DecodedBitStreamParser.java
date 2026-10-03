package com.google.zxing.pdf417.decoder;

import com.google.zxing.FormatException;
import com.google.zxing.common.CharacterSetECI;
import com.google.zxing.common.DecoderResult;
import com.google.zxing.pdf417.PDF417ResultMetadata;
import io.netty.util.internal.StringUtil;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
final class DecodedBitStreamParser {
    private static final int AL = 28;
    private static final int AS = 27;
    private static final int BEGIN_MACRO_PDF417_CONTROL_BLOCK = 928;
    private static final int BEGIN_MACRO_PDF417_OPTIONAL_FIELD = 923;
    private static final int BYTE_COMPACTION_MODE_LATCH = 901;
    private static final int BYTE_COMPACTION_MODE_LATCH_6 = 924;
    private static final int ECI_CHARSET = 927;
    private static final int ECI_GENERAL_PURPOSE = 926;
    private static final int ECI_USER_DEFINED = 925;
    private static final BigInteger[] EXP900;
    private static final int LL = 27;
    private static final int MACRO_PDF417_OPTIONAL_FIELD_ADDRESSEE = 4;
    private static final int MACRO_PDF417_OPTIONAL_FIELD_CHECKSUM = 6;
    private static final int MACRO_PDF417_OPTIONAL_FIELD_FILE_NAME = 0;
    private static final int MACRO_PDF417_OPTIONAL_FIELD_FILE_SIZE = 5;
    private static final int MACRO_PDF417_OPTIONAL_FIELD_SEGMENT_COUNT = 1;
    private static final int MACRO_PDF417_OPTIONAL_FIELD_SENDER = 3;
    private static final int MACRO_PDF417_OPTIONAL_FIELD_TIME_STAMP = 2;
    private static final int MACRO_PDF417_TERMINATOR = 922;
    private static final int MAX_NUMERIC_CODEWORDS = 15;
    private static final int ML = 28;
    private static final int MODE_SHIFT_TO_BYTE_COMPACTION_MODE = 913;
    private static final int NUMBER_OF_SEQUENCE_CODEWORDS = 2;
    private static final int NUMERIC_COMPACTION_MODE_LATCH = 902;
    private static final int PAL = 29;
    private static final int PL = 25;
    private static final int PS = 29;
    private static final int TEXT_COMPACTION_MODE_LATCH = 900;
    private static final char[] PUNCT_CHARS = ";<>@[\\]_`~!\r\t,:\n-.$/\"|*()?{}'".toCharArray();
    private static final char[] MIXED_CHARS = "0123456789&\r\t,:#-.$/+%*=^".toCharArray();

    /* JADX INFO: renamed from: com.google.zxing.pdf417.decoder.DecodedBitStreamParser$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$zxing$pdf417$decoder$DecodedBitStreamParser$Mode;

        static {
            int[] iArr = new int[Mode.values().length];
            $SwitchMap$com$google$zxing$pdf417$decoder$DecodedBitStreamParser$Mode = iArr;
            try {
                iArr[Mode.ALPHA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$zxing$pdf417$decoder$DecodedBitStreamParser$Mode[Mode.LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$zxing$pdf417$decoder$DecodedBitStreamParser$Mode[Mode.MIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$zxing$pdf417$decoder$DecodedBitStreamParser$Mode[Mode.PUNCT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$zxing$pdf417$decoder$DecodedBitStreamParser$Mode[Mode.ALPHA_SHIFT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$zxing$pdf417$decoder$DecodedBitStreamParser$Mode[Mode.PUNCT_SHIFT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public enum Mode {
        ALPHA,
        LOWER,
        MIXED,
        PUNCT,
        ALPHA_SHIFT,
        PUNCT_SHIFT
    }

    static {
        BigInteger[] bigIntegerArr = new BigInteger[16];
        EXP900 = bigIntegerArr;
        bigIntegerArr[0] = BigInteger.ONE;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(900L);
        bigIntegerArr[1] = bigIntegerValueOf;
        int i = 2;
        while (true) {
            BigInteger[] bigIntegerArr2 = EXP900;
            if (i >= bigIntegerArr2.length) {
                return;
            }
            bigIntegerArr2[i] = bigIntegerArr2[i - 1].multiply(bigIntegerValueOf);
            i++;
        }
    }

    private DecodedBitStreamParser() {
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0045 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0021 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:34:0x0077. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:35:0x007a. Please report as an issue. */
    /* JADX WARN: Switch 'out' block B:29:0x0064 for B:34:0x0077 already processed. Defaulting to fallback option. */
    /* JADX WARN: Switch 'out' block B:29:0x0064 for B:35:0x007a already processed. Defaulting to fallback option. */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1067)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:419)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:399)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:31)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:21)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    private static int byteCompaction(int r16, int[] r17, java.nio.charset.Charset r18, int r19, java.lang.StringBuilder r20) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.pdf417.decoder.DecodedBitStreamParser.byteCompaction(int, int[], java.nio.charset.Charset, int, java.lang.StringBuilder):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:17:0x004e  */
    public static DecoderResult decode(int[] iArr, String str) throws FormatException {
        int iTextCompaction;
        StringBuilder sb = new StringBuilder(iArr.length << 1);
        Charset charsetForName = StandardCharsets.ISO_8859_1;
        int i = iArr[1];
        PDF417ResultMetadata pDF417ResultMetadata = new PDF417ResultMetadata();
        int i2 = 2;
        while (i2 < iArr[0]) {
            if (i != MODE_SHIFT_TO_BYTE_COMPACTION_MODE) {
                switch (i) {
                    case 900:
                        iTextCompaction = textCompaction(iArr, i2, sb);
                        break;
                    case 901:
                        iTextCompaction = byteCompaction(i, iArr, charsetForName, i2, sb);
                        break;
                    case 902:
                        iTextCompaction = numericCompaction(iArr, i2, sb);
                        break;
                    default:
                        switch (i) {
                            case 922:
                            case 923:
                                throw FormatException.getFormatInstance();
                            case 924:
                                iTextCompaction = byteCompaction(i, iArr, charsetForName, i2, sb);
                                break;
                            case ECI_USER_DEFINED /* 925 */:
                                iTextCompaction = i2 + 1;
                                break;
                            case ECI_GENERAL_PURPOSE /* 926 */:
                                iTextCompaction = i2 + 2;
                                break;
                            case ECI_CHARSET /* 927 */:
                                iTextCompaction = i2 + 1;
                                charsetForName = Charset.forName(CharacterSetECI.getCharacterSetECIByValue(iArr[i2]).name());
                                break;
                            case 928:
                                iTextCompaction = decodeMacroBlock(iArr, i2, pDF417ResultMetadata);
                                break;
                            default:
                                iTextCompaction = textCompaction(iArr, i2 - 1, sb);
                                break;
                        }
                        break;
                }
            } else {
                iTextCompaction = i2 + 1;
                sb.append((char) iArr[i2]);
            }
            if (iTextCompaction >= iArr.length) {
                throw FormatException.getFormatInstance();
            }
            i2 = iTextCompaction + 1;
            i = iArr[iTextCompaction];
        }
        if (sb.length() == 0) {
            throw FormatException.getFormatInstance();
        }
        DecoderResult decoderResult = new DecoderResult(null, sb.toString(), null, str);
        decoderResult.setOther(pDF417ResultMetadata);
        return decoderResult;
    }

    private static String decodeBase900toBase10(int[] iArr, int i) throws FormatException {
        BigInteger bigIntegerAdd = BigInteger.ZERO;
        for (int i2 = 0; i2 < i; i2++) {
            bigIntegerAdd = bigIntegerAdd.add(EXP900[(i - i2) - 1].multiply(BigInteger.valueOf(iArr[i2])));
        }
        String string = bigIntegerAdd.toString();
        if (string.charAt(0) == '1') {
            return string.substring(1);
        }
        throw FormatException.getFormatInstance();
    }

    public static int decodeMacroBlock(int[] iArr, int i, PDF417ResultMetadata pDF417ResultMetadata) throws FormatException {
        if (i + 2 > iArr[0]) {
            throw FormatException.getFormatInstance();
        }
        int[] iArr2 = new int[2];
        int i2 = 0;
        while (i2 < 2) {
            iArr2[i2] = iArr[i];
            i2++;
            i++;
        }
        pDF417ResultMetadata.setSegmentIndex(Integer.parseInt(decodeBase900toBase10(iArr2, 2)));
        StringBuilder sb = new StringBuilder();
        int iTextCompaction = textCompaction(iArr, i, sb);
        pDF417ResultMetadata.setFileId(sb.toString());
        int i3 = iArr[iTextCompaction] == 923 ? iTextCompaction + 1 : -1;
        while (iTextCompaction < iArr[0]) {
            int i4 = iArr[iTextCompaction];
            if (i4 == 922) {
                iTextCompaction++;
                pDF417ResultMetadata.setLastSegment(true);
            } else {
                if (i4 != 923) {
                    throw FormatException.getFormatInstance();
                }
                int i5 = iTextCompaction + 1;
                switch (iArr[i5]) {
                    case 0:
                        StringBuilder sb2 = new StringBuilder();
                        iTextCompaction = textCompaction(iArr, i5 + 1, sb2);
                        pDF417ResultMetadata.setFileName(sb2.toString());
                        break;
                    case 1:
                        StringBuilder sb3 = new StringBuilder();
                        iTextCompaction = numericCompaction(iArr, i5 + 1, sb3);
                        pDF417ResultMetadata.setSegmentCount(Integer.parseInt(sb3.toString()));
                        break;
                    case 2:
                        StringBuilder sb4 = new StringBuilder();
                        iTextCompaction = numericCompaction(iArr, i5 + 1, sb4);
                        pDF417ResultMetadata.setTimestamp(Long.parseLong(sb4.toString()));
                        break;
                    case 3:
                        StringBuilder sb5 = new StringBuilder();
                        iTextCompaction = textCompaction(iArr, i5 + 1, sb5);
                        pDF417ResultMetadata.setSender(sb5.toString());
                        break;
                    case 4:
                        StringBuilder sb6 = new StringBuilder();
                        iTextCompaction = textCompaction(iArr, i5 + 1, sb6);
                        pDF417ResultMetadata.setAddressee(sb6.toString());
                        break;
                    case 5:
                        StringBuilder sb7 = new StringBuilder();
                        iTextCompaction = numericCompaction(iArr, i5 + 1, sb7);
                        pDF417ResultMetadata.setFileSize(Long.parseLong(sb7.toString()));
                        break;
                    case 6:
                        StringBuilder sb8 = new StringBuilder();
                        iTextCompaction = numericCompaction(iArr, i5 + 1, sb8);
                        pDF417ResultMetadata.setChecksum(Integer.parseInt(sb8.toString()));
                        break;
                    default:
                        throw FormatException.getFormatInstance();
                }
            }
        }
        if (i3 != -1) {
            int i6 = iTextCompaction - i3;
            if (pDF417ResultMetadata.isLastSegment()) {
                i6--;
            }
            pDF417ResultMetadata.setOptionalData(Arrays.copyOfRange(iArr, i3, i6 + i3));
        }
        return iTextCompaction;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:42:0x008d  */
    private static void decodeTextCompaction(int[] iArr, int[] iArr2, int i, StringBuilder sb) {
        Mode mode;
        int i2;
        Mode mode2 = Mode.ALPHA;
        Mode mode3 = mode2;
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = iArr[i3];
            int i5 = AnonymousClass1.$SwitchMap$com$google$zxing$pdf417$decoder$DecodedBitStreamParser$Mode[mode2.ordinal()];
            char c2 = StringUtil.SPACE;
            switch (i5) {
                case 1:
                    if (i4 < 26) {
                        i2 = i4 + 65;
                        c2 = (char) i2;
                    } else {
                        if (i4 == 900) {
                            mode2 = Mode.ALPHA;
                        } else if (i4 != MODE_SHIFT_TO_BYTE_COMPACTION_MODE) {
                            switch (i4) {
                                case 27:
                                    mode2 = Mode.LOWER;
                                    break;
                                case 28:
                                    mode2 = Mode.MIXED;
                                    break;
                                case 29:
                                    mode = Mode.PUNCT_SHIFT;
                                    c2 = 0;
                                    Mode mode4 = mode;
                                    mode3 = mode2;
                                    mode2 = mode4;
                                    break;
                            }
                        } else {
                            sb.append((char) iArr2[i3]);
                        }
                        c2 = 0;
                    }
                    break;
                case 2:
                    if (i4 < 26) {
                        i2 = i4 + 97;
                        c2 = (char) i2;
                    } else {
                        if (i4 == 900) {
                            mode2 = Mode.ALPHA;
                        } else if (i4 != MODE_SHIFT_TO_BYTE_COMPACTION_MODE) {
                            switch (i4) {
                                case 27:
                                    mode = Mode.ALPHA_SHIFT;
                                    c2 = 0;
                                    Mode mode5 = mode;
                                    mode3 = mode2;
                                    mode2 = mode5;
                                    break;
                                case 28:
                                    mode2 = Mode.MIXED;
                                    break;
                                case 29:
                                    mode = Mode.PUNCT_SHIFT;
                                    c2 = 0;
                                    Mode mode6 = mode;
                                    mode3 = mode2;
                                    mode2 = mode6;
                                    break;
                            }
                        } else {
                            sb.append((char) iArr2[i3]);
                        }
                        c2 = 0;
                    }
                    break;
                case 3:
                    if (i4 < 25) {
                        c2 = MIXED_CHARS[i4];
                    } else if (i4 == 900) {
                        mode2 = Mode.ALPHA;
                        c2 = 0;
                    } else {
                        if (i4 != MODE_SHIFT_TO_BYTE_COMPACTION_MODE) {
                            switch (i4) {
                                case 25:
                                    mode2 = Mode.PUNCT;
                                    break;
                                case 27:
                                    mode2 = Mode.LOWER;
                                    break;
                                case 28:
                                    mode2 = Mode.ALPHA;
                                    break;
                                case 29:
                                    mode = Mode.PUNCT_SHIFT;
                                    c2 = 0;
                                    Mode mode7 = mode;
                                    mode3 = mode2;
                                    mode2 = mode7;
                                    break;
                            }
                        } else {
                            sb.append((char) iArr2[i3]);
                        }
                        c2 = 0;
                    }
                    break;
                case 4:
                    if (i4 < 29) {
                        c2 = PUNCT_CHARS[i4];
                    } else {
                        if (i4 == 29 || i4 == 900) {
                            mode2 = Mode.ALPHA;
                        } else if (i4 == MODE_SHIFT_TO_BYTE_COMPACTION_MODE) {
                            sb.append((char) iArr2[i3]);
                        }
                        c2 = 0;
                    }
                    break;
                case 5:
                    if (i4 < 26) {
                        c2 = (char) (i4 + 65);
                    } else if (i4 != 26) {
                        mode2 = i4 != 900 ? mode3 : Mode.ALPHA;
                        c2 = 0;
                    }
                    mode2 = mode3;
                    break;
                case 6:
                    if (i4 < 29) {
                        c2 = PUNCT_CHARS[i4];
                    } else if (i4 == 29 || i4 == 900) {
                        mode2 = Mode.ALPHA;
                        c2 = 0;
                    } else {
                        if (i4 == MODE_SHIFT_TO_BYTE_COMPACTION_MODE) {
                            sb.append((char) iArr2[i3]);
                        }
                        c2 = 0;
                    }
                    mode2 = mode3;
                    break;
                default:
                    c2 = 0;
                    break;
            }
            if (c2 != 0) {
                sb.append(c2);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x002c  */
    private static int numericCompaction(int[] iArr, int i, StringBuilder sb) throws FormatException {
        int[] iArr2 = new int[15];
        boolean z = false;
        int i2 = 0;
        while (true) {
            int i3 = iArr[0];
            if (i < i3 && !z) {
                int i4 = i + 1;
                int i5 = iArr[i];
                if (i4 == i3) {
                    z = true;
                }
                if (i5 >= 900) {
                    if (i5 != 900 && i5 != 901 && i5 != 928) {
                        switch (i5) {
                            case 922:
                            case 923:
                            case 924:
                                i4--;
                                z = true;
                                break;
                        }
                    } else {
                        i4--;
                        z = true;
                    }
                } else {
                    iArr2[i2] = i5;
                    i2++;
                }
                if ((i2 % 15 == 0 || i5 == 902 || z) && i2 > 0) {
                    sb.append(decodeBase900toBase10(iArr2, i2));
                    i2 = 0;
                }
                i = i4;
            }
        }
        return i;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x0033. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x0036. Please report as an issue. */
    private static int textCompaction(int[] iArr, int i, StringBuilder sb) {
        int i2 = iArr[0];
        int[] iArr2 = new int[(i2 - i) << 1];
        int[] iArr3 = new int[(i2 - i) << 1];
        boolean z = false;
        int i3 = 0;
        while (i < iArr[0] && !z) {
            int i4 = i + 1;
            int i5 = iArr[i];
            if (i5 < 900) {
                iArr2[i3] = i5 / 30;
                iArr2[i3 + 1] = i5 % 30;
                i3 += 2;
            } else if (i5 != MODE_SHIFT_TO_BYTE_COMPACTION_MODE) {
                if (i5 != 928) {
                    switch (i5) {
                        case 900:
                            iArr2[i3] = 900;
                            i3++;
                            break;
                        case 901:
                        case 902:
                            break;
                        default:
                            switch (i5) {
                                case 922:
                                case 923:
                                case 924:
                                    break;
                                default:
                                    break;
                            }
                            break;
                    }
                }
                i = i4 - 1;
                z = true;
            } else {
                iArr2[i3] = MODE_SHIFT_TO_BYTE_COMPACTION_MODE;
                i = i4 + 1;
                iArr3[i3] = iArr[i4];
                i3++;
            }
            i = i4;
        }
        decodeTextCompaction(iArr2, iArr3, i3, sb);
        return i;
    }
}
