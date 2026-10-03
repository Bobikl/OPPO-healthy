package io.netty.handler.codec.compression;

import com.oplus.aiunit.vision.ixb;
import io.netty.buffer.ByteBuf;

/* JADX INFO: loaded from: classes10.dex */
final class FastLz {
    static final byte BLOCK_TYPE_COMPRESSED = 1;
    static final byte BLOCK_TYPE_NON_COMPRESSED = 0;
    static final byte BLOCK_WITHOUT_CHECKSUM = 0;
    static final byte BLOCK_WITH_CHECKSUM = 16;
    static final int CHECKSUM_OFFSET = 4;
    private static final int HASH_LOG = 13;
    private static final int HASH_MASK = 8191;
    private static final int HASH_SIZE = 8192;
    static final int LEVEL_1 = 1;
    static final int LEVEL_2 = 2;
    static final int LEVEL_AUTO = 0;
    static final int MAGIC_NUMBER = 4607066;
    static final int MAX_CHUNK_LENGTH = 65535;
    private static final int MAX_COPY = 32;
    private static final int MAX_DISTANCE = 8191;
    private static final int MAX_FARDISTANCE = 73725;
    private static final int MAX_LEN = 264;
    static final int MIN_LENGTH_TO_COMPRESSION = 32;
    private static final int MIN_RECOMENDED_LENGTH_FOR_LEVEL_2 = 65536;
    static final int OPTIONS_OFFSET = 3;

    private FastLz() {
    }

    public static int calculateOutputBufferLength(int i) {
        return Math.max((int) (((double) i) * 1.06d), 66);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01f7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:101:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:102:0x0215  */
    /* JADX WARN: Code duplicated, block: B:105:0x0229 A[LOOP:4: B:103:0x0225->B:105:0x0229, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:107:0x0247 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:108:0x0249  */
    /* JADX WARN: Code duplicated, block: B:109:0x0275  */
    /* JADX WARN: Code duplicated, block: B:111:0x0285 A[LOOP:5: B:110:0x0283->B:111:0x0285, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:113:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:115:0x02b9 A[ADDED_TO_REGION, LOOP:6: B:115:0x02b9->B:116:0x02bb, LOOP_START, PHI: r5 r6 r9 r13
  0x02b9: PHI (r5v21 int) = (r5v15 int), (r5v27 int) binds: [B:114:0x02b7, B:116:0x02bb] A[DONT_GENERATE, DONT_INLINE]
  0x02b9: PHI (r6v10 char) = (r6v4 char), (r6v14 char) binds: [B:114:0x02b7, B:116:0x02bb] A[DONT_GENERATE, DONT_INLINE]
  0x02b9: PHI (r9v28 int) = (r9v16 int), (r9v29 int) binds: [B:114:0x02b7, B:116:0x02bb] A[DONT_GENERATE, DONT_INLINE]
  0x02b9: PHI (r13v13 int) = (r13v9 int), (r13v14 int) binds: [B:114:0x02b7, B:116:0x02bb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:116:0x02bb A[LOOP:6: B:115:0x02b9->B:116:0x02bb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:118:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:119:0x0301  */
    /* JADX WARN: Code duplicated, block: B:141:0x014e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:142:0x014e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:143:0x014e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:154:0x01d9 A[EDGE_INSN: B:154:0x01d9->B:93:0x01d9 BREAK  A[LOOP:3: B:75:0x018e->B:79:0x019b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:158:0x01bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:159:0x01b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:161:0x01d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0099  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:49:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:68:0x0171 A[PHI: r1 r4 r6 r14
  0x0171: PHI (r1v37 int) = (r1v35 int), (r1v44 int) binds: [B:65:0x0161, B:60:0x013d] A[DONT_GENERATE, DONT_INLINE]
  0x0171: PHI (r4v12 int) = (r4v11 int), (r4v16 int) binds: [B:65:0x0161, B:60:0x013d] A[DONT_GENERATE, DONT_INLINE]
  0x0171: PHI (r6v35 int) = (r6v34 int), (r6v38 int) binds: [B:65:0x0161, B:60:0x013d] A[DONT_GENERATE, DONT_INLINE]
  0x0171: PHI (r14v12 int) = (r14v11 int), (r14v15 int) binds: [B:65:0x0161, B:60:0x013d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:74:0x0186  */
    /* JADX WARN: Code duplicated, block: B:76:0x0190  */
    /* JADX WARN: Code duplicated, block: B:79:0x019b A[LOOP:3: B:75:0x018e->B:79:0x019b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:80:0x019f  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:85:0x01b8 A[LOOP:7: B:81:0x01a0->B:85:0x01b8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:88:0x01c0 A[ADDED_TO_REGION, LOOP:8: B:88:0x01c0->B:92:0x01d6, LOOP_START, PHI: r1 r9
  0x01c0: PHI (r1v19 int) = (r1v18 int), (r1v23 int) binds: [B:87:0x01be, B:92:0x01d6] A[DONT_GENERATE, DONT_INLINE]
  0x01c0: PHI (r9v8 int) = (r9v7 int), (r9v11 int) binds: [B:87:0x01be, B:92:0x01d6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:89:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:92:0x01d6 A[LOOP:8: B:88:0x01c0->B:92:0x01d6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:94:0x01db  */
    /* JADX WARN: Code duplicated, block: B:95:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:98:0x01f3  */
    public static int compress(ByteBuf byteBuf, int i, int i2, ByteBuf byteBuf2, int i3, int i4) {
        int i5;
        long j2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        long j3;
        char c2;
        int i11;
        boolean z;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        byte b;
        int i25;
        int i26;
        int i27;
        char c3;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33 = 2;
        int i34 = 1;
        int i35 = i4 == 0 ? i2 < 65536 ? 1 : 2 : i4;
        int i36 = i2 + 0;
        int i37 = i36 - 2;
        int i38 = i36 - 12;
        int[] iArr = new int[8192];
        if (i2 < 4) {
            if (i2 == 0) {
                return 0;
            }
            byteBuf2.setByte(i3 + 0, (byte) (i2 - 1));
            int i39 = i37 + 1;
            int i40 = 1;
            for (int i41 = 0; i41 <= i39; i41++) {
                byteBuf2.setByte(i40 + i3, byteBuf.getByte(i + i41));
                i40++;
            }
            return i2 + 1;
        }
        for (int i42 = 0; i42 < 8192; i42++) {
            iArr[i42] = 0;
        }
        byteBuf2.setByte(i3 + 0, 31);
        byteBuf2.setByte(i3 + 1, byteBuf.getByte(i + 0));
        byteBuf2.setByte(i3 + 2, byteBuf.getByte(i + 1));
        int i43 = 2;
        int i44 = 2;
        int i45 = 3;
        while (i43 < i38) {
            if (i35 == i33) {
                int i46 = i + i43;
                int i47 = i46 - 1;
                if (byteBuf.getByte(i46) == byteBuf.getByte(i47) && readU16(byteBuf, i47) == readU16(byteBuf, i46 + 1)) {
                    i5 = i43 + 3;
                    i6 = i43 + 2;
                    i7 = i34;
                    j2 = 1;
                } else {
                    i5 = i43;
                    j2 = 0;
                    i6 = 0;
                    i7 = 0;
                }
            } else {
                i5 = i43;
                j2 = 0;
                i6 = 0;
                i7 = 0;
            }
            if (i7 == 0) {
                int i48 = i + i5;
                int iHashFunction = hashFunction(byteBuf, i48);
                int i49 = iArr[iHashFunction];
                int i50 = i35;
                long j4 = i43 - i49;
                iArr[iHashFunction] = i43;
                if (j4 != 0) {
                    i8 = i50;
                    if (i8 == 1) {
                        if (j4 < 8191) {
                            i28 = i49 + 1;
                            i29 = i5 + 1;
                            if (byteBuf.getByte(i + i49) == byteBuf.getByte(i48)) {
                                i30 = i28 + 1;
                                i31 = i29 + 1;
                                if (byteBuf.getByte(i + i28) == byteBuf.getByte(i + i29)) {
                                    i32 = i30 + 1;
                                    int i51 = i31 + 1;
                                    if (byteBuf.getByte(i + i30) != byteBuf.getByte(i + i31)) {
                                        if (i8 == 2 || j4 < 8191) {
                                            i6 = i32;
                                            j2 = j4;
                                        } else {
                                            int i52 = i51 + 1;
                                            int i53 = i32 + 1;
                                            if (byteBuf.getByte(i + i51) == byteBuf.getByte(i + i32)) {
                                                byte b2 = byteBuf.getByte(i + i52);
                                                i6 = i53 + 1;
                                                if (b2 == byteBuf.getByte(i + i53)) {
                                                    i9 = 5;
                                                    j2 = j4;
                                                }
                                            }
                                            i26 = i45 + 1;
                                            i27 = i43 + 1;
                                            byteBuf2.setByte(i3 + i45, byteBuf.getByte(i + i43));
                                            i44++;
                                            if (i44 == 32) {
                                                i45 = i26 + 1;
                                                c3 = 31;
                                                byteBuf2.setByte(i26 + i3, 31);
                                                i43 = i27;
                                                i34 = 1;
                                                i44 = 0;
                                            } else {
                                                i45 = i26;
                                                i43 = i27;
                                                i34 = 1;
                                            }
                                            i35 = i8;
                                            i33 = 2;
                                        }
                                        i10 = i9 + i43;
                                        j3 = j2 - 1;
                                        c2 = '\b';
                                        if (j3 == 0) {
                                            b = byteBuf.getByte((i + i10) - 1);
                                            while (i10 < i37) {
                                                i25 = i6 + 1;
                                                if (byteBuf.getByte(i + i6) != b) {
                                                    break;
                                                }
                                                i10++;
                                                i6 = i25;
                                            }
                                        } else {
                                            i11 = 0;
                                            while (true) {
                                                if (i11 < 8) {
                                                    z = false;
                                                    break;
                                                }
                                                i14 = i6 + 1;
                                                i15 = i10 + 1;
                                                if (byteBuf.getByte(i + i6) != byteBuf.getByte(i + i10)) {
                                                    i6 = i14;
                                                    i10 = i15;
                                                    z = true;
                                                    break;
                                                }
                                                i11++;
                                                i6 = i14;
                                                i10 = i15;
                                            }
                                            if (!z) {
                                                while (i10 < i37) {
                                                    i12 = i6 + 1;
                                                    i13 = i10 + 1;
                                                    if (byteBuf.getByte(i + i6) != byteBuf.getByte(i + i10)) {
                                                        i10 = i13;
                                                        break;
                                                    }
                                                    i6 = i12;
                                                    i10 = i13;
                                                }
                                            }
                                        }
                                        if (i44 != 0) {
                                            byteBuf2.setByte(((i3 + i45) - i44) - 1, (byte) (i44 - 1));
                                        } else {
                                            i45--;
                                        }
                                        int i54 = i10 - 3;
                                        i16 = i54 - i43;
                                        if (i8 == 2) {
                                            i17 = ixb.DIVE_ALARM;
                                            if (i16 > 262) {
                                                while (i16 > i17) {
                                                    int i55 = i45 + 1;
                                                    byteBuf2.setByte(i3 + i45, (byte) ((j3 >>> c2) + 224));
                                                    int i56 = i55 + 1;
                                                    byteBuf2.setByte(i3 + i55, -3);
                                                    i45 = i56 + 1;
                                                    byteBuf2.setByte(i56 + i3, (byte) (j3 & 255));
                                                    i16 -= 262;
                                                    i17 = ixb.DIVE_ALARM;
                                                    c2 = '\b';
                                                }
                                            }
                                            if (i16 < 7) {
                                                int i57 = i45 + 1;
                                                byteBuf2.setByte(i3 + i45, (byte) (((long) (i16 << 5)) + (j3 >>> 8)));
                                                i19 = i57 + 1;
                                                byteBuf2.setByte(i57 + i3, (byte) (j3 & 255));
                                            } else {
                                                int i58 = i45 + 1;
                                                byteBuf2.setByte(i3 + i45, (byte) ((j3 >>> 8) + 224));
                                                int i59 = i58 + 1;
                                                byteBuf2.setByte(i58 + i3, (byte) (i16 - 7));
                                                i18 = i59 + 1;
                                                byteBuf2.setByte(i59 + i3, (byte) (j3 & 255));
                                                i19 = i18;
                                            }
                                        } else if (j3 < 8191) {
                                            if (i16 < 7) {
                                                int i60 = i45 + 1;
                                                byteBuf2.setByte(i3 + i45, (byte) (((long) (i16 << 5)) + (j3 >>> 8)));
                                                i19 = i60 + 1;
                                                byteBuf2.setByte(i60 + i3, (byte) (j3 & 255));
                                            } else {
                                                i23 = i45 + 1;
                                                byteBuf2.setByte(i45 + i3, (byte) ((j3 >>> 8) + 224));
                                                i24 = i16 - 7;
                                                while (i24 >= 255) {
                                                    byteBuf2.setByte(i23 + i3, -1);
                                                    i24 -= 255;
                                                    i23++;
                                                }
                                                int i61 = i23 + 1;
                                                byteBuf2.setByte(i23 + i3, (byte) i24);
                                                i18 = i61 + 1;
                                                byteBuf2.setByte(i61 + i3, (byte) (j3 & 255));
                                                i19 = i18;
                                            }
                                        } else if (i16 < 7) {
                                            long j5 = j3 - 8191;
                                            int i62 = i45 + 1;
                                            byteBuf2.setByte(i3 + i45, (byte) ((i16 << 5) + 31));
                                            int i63 = i62 + 1;
                                            byteBuf2.setByte(i62 + i3, -1);
                                            int i64 = i63 + 1;
                                            byteBuf2.setByte(i63 + i3, (byte) (j5 >>> 8));
                                            i19 = i64 + 1;
                                            byteBuf2.setByte(i64 + i3, (byte) (j5 & 255));
                                        } else {
                                            long j6 = j3 - 8191;
                                            i20 = i45 + 1;
                                            i21 = -1;
                                            byteBuf2.setByte(i3 + i45, -1);
                                            i22 = i16 - 7;
                                            while (i22 >= 255) {
                                                byteBuf2.setByte(i20 + i3, i21);
                                                i22 -= 255;
                                                i20++;
                                                i21 = -1;
                                            }
                                            int i65 = i20 + 1;
                                            byteBuf2.setByte(i20 + i3, (byte) i22);
                                            int i66 = i65 + 1;
                                            byteBuf2.setByte(i3 + i65, -1);
                                            int i67 = i66 + 1;
                                            byteBuf2.setByte(i66 + i3, (byte) (j6 >>> 8));
                                            i19 = i67 + 1;
                                            byteBuf2.setByte(i3 + i67, (byte) (j6 & 255));
                                        }
                                        int i68 = i54 + 1;
                                        iArr[hashFunction(byteBuf, i + i54)] = i54;
                                        i43 = i68 + 1;
                                        iArr[hashFunction(byteBuf, i + i68)] = i68;
                                        i45 = i19 + 1;
                                        byteBuf2.setByte(i3 + i19, 31);
                                        i35 = i8;
                                        i33 = 2;
                                        i34 = 1;
                                        i44 = 0;
                                    }
                                }
                            }
                        }
                    } else if (j4 < 73725) {
                        i28 = i49 + 1;
                        i29 = i5 + 1;
                        if (byteBuf.getByte(i + i49) == byteBuf.getByte(i48)) {
                            i30 = i28 + 1;
                            i31 = i29 + 1;
                            if (byteBuf.getByte(i + i28) == byteBuf.getByte(i + i29)) {
                                i32 = i30 + 1;
                                int i510 = i31 + 1;
                                if (byteBuf.getByte(i + i30) != byteBuf.getByte(i + i31)) {
                                    if (i8 == 2) {
                                    }
                                    i6 = i32;
                                    j2 = j4;
                                }
                            }
                        }
                    }
                } else {
                    i8 = i50;
                }
                i26 = i45 + 1;
                i27 = i43 + 1;
                byteBuf2.setByte(i3 + i45, byteBuf.getByte(i + i43));
                i44++;
                if (i44 == 32) {
                    i45 = i26 + 1;
                    c3 = 31;
                    byteBuf2.setByte(i26 + i3, 31);
                    i43 = i27;
                    i34 = 1;
                    i44 = 0;
                } else {
                    i45 = i26;
                    i43 = i27;
                    i34 = 1;
                }
                i35 = i8;
                i33 = 2;
            } else {
                i8 = i35;
            }
            i9 = 3;
            i10 = i9 + i43;
            j3 = j2 - 1;
            c2 = '\b';
            if (j3 == 0) {
                b = byteBuf.getByte((i + i10) - 1);
                while (i10 < i37) {
                    i25 = i6 + 1;
                    if (byteBuf.getByte(i + i6) != b) {
                        break;
                        break;
                    }
                    i10++;
                    i6 = i25;
                }
            } else {
                i11 = 0;
                while (true) {
                    if (i11 < 8) {
                        z = false;
                        break;
                    }
                    i14 = i6 + 1;
                    i15 = i10 + 1;
                    if (byteBuf.getByte(i + i6) != byteBuf.getByte(i + i10)) {
                        i6 = i14;
                        i10 = i15;
                        z = true;
                        break;
                    }
                    i11++;
                    i6 = i14;
                    i10 = i15;
                }
                if (!z) {
                    while (i10 < i37) {
                        i12 = i6 + 1;
                        i13 = i10 + 1;
                        if (byteBuf.getByte(i + i6) != byteBuf.getByte(i + i10)) {
                            i10 = i13;
                            break;
                        }
                        i6 = i12;
                        i10 = i13;
                    }
                }
            }
            if (i44 != 0) {
                byteBuf2.setByte(((i3 + i45) - i44) - 1, (byte) (i44 - 1));
            } else {
                i45--;
            }
            int i511 = i10 - 3;
            i16 = i511 - i43;
            if (i8 == 2) {
                i17 = ixb.DIVE_ALARM;
                if (i16 > 262) {
                    while (i16 > i17) {
                        int i512 = i45 + 1;
                        byteBuf2.setByte(i3 + i45, (byte) ((j3 >>> c2) + 224));
                        int i513 = i512 + 1;
                        byteBuf2.setByte(i3 + i512, -3);
                        i45 = i513 + 1;
                        byteBuf2.setByte(i513 + i3, (byte) (j3 & 255));
                        i16 -= 262;
                        i17 = ixb.DIVE_ALARM;
                        c2 = '\b';
                    }
                }
                if (i16 < 7) {
                    int i514 = i45 + 1;
                    byteBuf2.setByte(i3 + i45, (byte) (((long) (i16 << 5)) + (j3 >>> 8)));
                    i19 = i514 + 1;
                    byteBuf2.setByte(i514 + i3, (byte) (j3 & 255));
                } else {
                    int i515 = i45 + 1;
                    byteBuf2.setByte(i3 + i45, (byte) ((j3 >>> 8) + 224));
                    int i516 = i515 + 1;
                    byteBuf2.setByte(i515 + i3, (byte) (i16 - 7));
                    i18 = i516 + 1;
                    byteBuf2.setByte(i516 + i3, (byte) (j3 & 255));
                    i19 = i18;
                }
            } else if (j3 < 8191) {
                if (i16 < 7) {
                    int i69 = i45 + 1;
                    byteBuf2.setByte(i3 + i45, (byte) (((long) (i16 << 5)) + (j3 >>> 8)));
                    i19 = i69 + 1;
                    byteBuf2.setByte(i69 + i3, (byte) (j3 & 255));
                } else {
                    i23 = i45 + 1;
                    byteBuf2.setByte(i45 + i3, (byte) ((j3 >>> 8) + 224));
                    i24 = i16 - 7;
                    while (i24 >= 255) {
                        byteBuf2.setByte(i23 + i3, -1);
                        i24 -= 255;
                        i23++;
                    }
                    int i610 = i23 + 1;
                    byteBuf2.setByte(i23 + i3, (byte) i24);
                    i18 = i610 + 1;
                    byteBuf2.setByte(i610 + i3, (byte) (j3 & 255));
                    i19 = i18;
                }
            } else if (i16 < 7) {
                long j7 = j3 - 8191;
                int i611 = i45 + 1;
                byteBuf2.setByte(i3 + i45, (byte) ((i16 << 5) + 31));
                int i612 = i611 + 1;
                byteBuf2.setByte(i611 + i3, -1);
                int i613 = i612 + 1;
                byteBuf2.setByte(i612 + i3, (byte) (j7 >>> 8));
                i19 = i613 + 1;
                byteBuf2.setByte(i613 + i3, (byte) (j7 & 255));
            } else {
                long j8 = j3 - 8191;
                i20 = i45 + 1;
                i21 = -1;
                byteBuf2.setByte(i3 + i45, -1);
                i22 = i16 - 7;
                while (i22 >= 255) {
                    byteBuf2.setByte(i20 + i3, i21);
                    i22 -= 255;
                    i20++;
                    i21 = -1;
                }
                int i614 = i20 + 1;
                byteBuf2.setByte(i20 + i3, (byte) i22);
                int i615 = i614 + 1;
                byteBuf2.setByte(i3 + i614, -1);
                int i616 = i615 + 1;
                byteBuf2.setByte(i615 + i3, (byte) (j8 >>> 8));
                i19 = i616 + 1;
                byteBuf2.setByte(i3 + i616, (byte) (j8 & 255));
            }
            int i617 = i511 + 1;
            iArr[hashFunction(byteBuf, i + i511)] = i511;
            i43 = i617 + 1;
            iArr[hashFunction(byteBuf, i + i617)] = i617;
            i45 = i19 + 1;
            byteBuf2.setByte(i3 + i19, 31);
            i35 = i8;
            i33 = 2;
            i34 = 1;
            i44 = 0;
        }
        int i70 = i35;
        int i71 = i37 + i34;
        while (i43 <= i71) {
            int i72 = i45 + 1;
            i43++;
            byteBuf2.setByte(i3 + i45, byteBuf.getByte(i + i43));
            i44++;
            if (i44 == 32) {
                i45 = i72 + 1;
                byteBuf2.setByte(i72 + i3, 31);
                i44 = 0;
            } else {
                i45 = i72;
            }
        }
        if (i44 != 0) {
            byteBuf2.setByte(((i3 + i45) - i44) - 1, (byte) (i44 - 1));
        } else {
            i45--;
        }
        if (i70 == 2) {
            byteBuf2.setByte(i3, byteBuf2.getByte(i3) | 32);
        }
        return i45;
    }

    public static int decompress(ByteBuf byteBuf, int i, int i2, ByteBuf byteBuf2, int i3, int i4) {
        boolean z;
        int i5;
        long unsignedByte;
        int unsignedByte2;
        int i6;
        char c2 = 5;
        boolean z2 = true;
        int i7 = (byteBuf.getByte(i) >> 5) + 1;
        if (i7 != 1 && i7 != 2) {
            throw new DecompressionException(String.format("invalid level: %d (expected: %d or %d)", Integer.valueOf(i7), 1, 2));
        }
        long j2 = byteBuf.getByte(i + 0) & 31;
        int i8 = 1;
        boolean z3 = true;
        int i9 = 0;
        while (true) {
            long j3 = j2 >> c2;
            long j4 = (31 & j2) << 8;
            if (j2 >= 32) {
                long unsignedByte3 = j3 - 1;
                long j5 = i9;
                int i10 = i9;
                int i11 = (int) (j5 - j4);
                boolean z4 = z3;
                if (unsignedByte3 != 6) {
                    unsignedByte = j2;
                } else if (i7 == 1) {
                    unsignedByte3 += (long) byteBuf.getUnsignedByte(i + i8);
                    i8++;
                    unsignedByte = j2;
                } else {
                    while (true) {
                        i6 = i8 + 1;
                        short unsignedByte4 = byteBuf.getUnsignedByte(i + i8);
                        unsignedByte = j2;
                        unsignedByte3 += (long) unsignedByte4;
                        if (unsignedByte4 != 255) {
                            break;
                        }
                        i8 = i6;
                        j2 = unsignedByte;
                    }
                    i8 = i6;
                }
                if (i7 == 1) {
                    i8++;
                    unsignedByte2 = i11 - byteBuf.getUnsignedByte(i + i8);
                } else {
                    i8++;
                    short unsignedByte5 = byteBuf.getUnsignedByte(i + i8);
                    unsignedByte2 = i11 - unsignedByte5;
                    if (unsignedByte5 == 255 && j4 == 7936) {
                        int i12 = i8 + 1;
                        long unsignedByte6 = byteBuf.getUnsignedByte(i + i8) << 8;
                        i8 = i12 + 1;
                        unsignedByte2 = (int) ((j5 - (unsignedByte6 + ((long) byteBuf.getUnsignedByte(i + i12)))) - 8191);
                    }
                }
                if (j5 + unsignedByte3 + 3 > i4 || unsignedByte2 - 1 < 0) {
                    return 0;
                }
                if (i8 < i2) {
                    unsignedByte = byteBuf.getUnsignedByte(i + i8);
                    z3 = z4;
                    i8++;
                } else {
                    z3 = false;
                }
                if (unsignedByte2 == i10) {
                    z = true;
                    byte b = byteBuf2.getByte((i3 + unsignedByte2) - 1);
                    int i13 = i10 + 1;
                    byteBuf2.setByte(i3 + i10, b);
                    int i14 = i13 + 1;
                    byteBuf2.setByte(i3 + i13, b);
                    int i15 = i14 + 1;
                    byteBuf2.setByte(i3 + i14, b);
                    while (unsignedByte3 != 0) {
                        byteBuf2.setByte(i3 + i15, b);
                        unsignedByte3--;
                        i15++;
                    }
                    i5 = i15;
                } else {
                    z = true;
                    int i16 = unsignedByte2 - 1;
                    int i17 = i10 + 1;
                    int i18 = i16 + 1;
                    byteBuf2.setByte(i3 + i10, byteBuf2.getByte(i3 + i16));
                    int i19 = i17 + 1;
                    int i20 = i18 + 1;
                    byteBuf2.setByte(i3 + i17, byteBuf2.getByte(i3 + i18));
                    int i21 = i19 + 1;
                    int i22 = i20 + 1;
                    byteBuf2.setByte(i3 + i19, byteBuf2.getByte(i3 + i20));
                    while (unsignedByte3 != 0) {
                        byteBuf2.setByte(i3 + i21, byteBuf2.getByte(i3 + i22));
                        unsignedByte3--;
                        i21++;
                        i22++;
                    }
                    i5 = i21;
                }
                j2 = unsignedByte;
            } else {
                int i23 = i9;
                z = z2;
                long j6 = j2 + 1;
                if (((long) i23) + j6 > i4 || ((long) i8) + j6 > i2) {
                    return 0;
                }
                i5 = i23 + 1;
                int i24 = i8 + 1;
                byteBuf2.setByte(i3 + i23, byteBuf.getByte(i + i8));
                j2 = j6 - 1;
                while (j2 != 0) {
                    byteBuf2.setByte(i3 + i5, byteBuf.getByte(i + i24));
                    j2--;
                    i5++;
                    i24++;
                }
                boolean z5 = i24 < i2 ? z : false;
                if (z5) {
                    int i25 = i24 + 1;
                    long unsignedByte7 = byteBuf.getUnsignedByte(i + i24);
                    z3 = z5;
                    i8 = i25;
                    j2 = unsignedByte7;
                } else {
                    i8 = i24;
                    z3 = z5;
                }
            }
            if (!z3) {
                return i5;
            }
            z2 = z;
            c2 = 5;
            i9 = i5;
        }
    }

    private static int hashFunction(ByteBuf byteBuf, int i) {
        int u16 = readU16(byteBuf, i);
        return ((readU16(byteBuf, i + 1) ^ (u16 >> 3)) ^ u16) & 8191;
    }

    private static int readU16(ByteBuf byteBuf, int i) {
        int i2 = i + 1;
        if (i2 >= byteBuf.readableBytes()) {
            return byteBuf.getUnsignedByte(i);
        }
        return byteBuf.getUnsignedByte(i) | (byteBuf.getUnsignedByte(i2) << 8);
    }
}
