package com.badlogic.gdx.utils;

import com.squareup.moshi.Json;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

/* JADX INFO: loaded from: classes13.dex */
public final class l {
    /* JADX WARN: Code duplicated, block: B:103:0x011c  */
    /* JADX WARN: Code duplicated, block: B:107:0x0122  */
    /* JADX WARN: Code duplicated, block: B:118:0x013d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:119:0x013f  */
    /* JADX WARN: Code duplicated, block: B:147:0x0132 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:153:0x011a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x00c2 A[PHI: r12
  0x00c2: PHI (r12v8 char) = (r12v2 char), (r12v3 char), (r12v4 char), (r12v5 char), (r12v6 char), (r12v1 char), (r12v1 char), (r12v1 char) binds: [B:60:0x00c0, B:59:0x00bd, B:58:0x00bb, B:57:0x00b9, B:56:0x00b6, B:140:0x00c2, B:102:0x011a, B:104:0x011d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:93:0x010b  */
    /* JADX WARN: Code duplicated, block: B:95:0x010e  */
    /* JADX WARN: Code duplicated, block: B:97:0x0111 A[ADDED_TO_REGION] */
    public static void a(i<String, String> iVar, Reader reader) throws IOException {
        char c2;
        if (iVar == null) {
            throw new NullPointerException("properties cannot be null");
        }
        if (reader == null) {
            throw new NullPointerException("reader cannot be null");
        }
        char[] cArr = new char[40];
        BufferedReader bufferedReader = new BufferedReader(reader);
        int i = 1;
        int i2 = 0;
        boolean z = true;
        int i3 = -1;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            int i8 = bufferedReader.read();
            if (i8 == -1) {
                if (i5 == 2 && i6 <= 4) {
                    throw new IllegalArgumentException("Invalid Unicode sequence: expected format \\uxxxx");
                }
                if (i3 == -1 && i4 > 0) {
                    i3 = i4;
                }
                if (i3 >= 0) {
                    String str = new String(cArr, i2, i4);
                    String strSubstring = str.substring(i2, i3);
                    String strSubstring2 = str.substring(i3);
                    if (i5 == i) {
                        strSubstring2 = strSubstring2 + Json.UNSET_NAME;
                    }
                    iVar.h(strSubstring, strSubstring2);
                    return;
                }
                return;
            }
            char c3 = (char) i8;
            if (i4 == cArr.length) {
                char[] cArr2 = new char[cArr.length * 2];
                System.arraycopy(cArr, i2, cArr2, i2, i4);
                cArr = cArr2;
            }
            if (i5 == 2) {
                int iDigit = Character.digit(c3, 16);
                if (iDigit >= 0) {
                    i7 = (i7 << 4) + iDigit;
                    i6++;
                    if (i6 < 4) {
                    }
                } else if (i6 <= 4) {
                    throw new IllegalArgumentException("Invalid Unicode sequence: illegal character");
                }
                cArr[i4] = (char) i7;
                i4++;
                i5 = i2;
                if (c3 != '\n') {
                }
            }
            if (i5 == i) {
                if (c3 == '\n') {
                    i5 = 5;
                    i2 = 0;
                } else if (c3 != '\r') {
                    if (c3 == 'b') {
                        c3 = '\b';
                    } else if (c3 == 'f') {
                        c3 = '\f';
                    } else if (c3 == 'n') {
                        c3 = '\n';
                    } else if (c3 == 'r') {
                        c3 = '\r';
                    } else if (c3 == 't') {
                        c3 = '\t';
                    } else if (c3 == 'u') {
                        i2 = 0;
                        i5 = 2;
                        i6 = 0;
                        i7 = 0;
                    }
                    i5 = 0;
                    if (i5 == 4) {
                        i3 = i4;
                        i5 = 0;
                    }
                    cArr[i4] = c3;
                    i4++;
                    i = 1;
                    i2 = 0;
                    z = false;
                } else {
                    i2 = 0;
                    i5 = 3;
                }
            } else if (c3 != '\n') {
                if (c3 == '\r') {
                    if (i4 <= 0 || (i4 == 0 && i3 == 0)) {
                        if (i3 == -1) {
                            i3 = i4;
                        }
                        i2 = 0;
                        String str2 = new String(cArr, 0, i4);
                        iVar.h(str2.substring(0, i3), str2.substring(i3));
                    } else {
                        i2 = 0;
                    }
                    i3 = -1;
                    i4 = i2;
                    i5 = i4;
                    i = 1;
                    z = true;
                } else if (c3 == '!' || c3 == '#') {
                    if (z) {
                        do {
                            int i9 = bufferedReader.read();
                            if (i9 == -1 || (c2 = (char) i9) == '\r') {
                                break;
                            }
                        } while (c2 != '\n');
                    } else {
                        if (Character.isSpace(c3)) {
                            if (i5 == 3) {
                                i5 = 5;
                            }
                            if (i4 == 0 && i4 != i3 && i5 != 5) {
                                if (i3 == -1) {
                                    i5 = 4;
                                }
                            }
                        }
                        if (i5 != 5 || i5 == 3) {
                            i5 = 0;
                        }
                        if (i5 == 4) {
                            i3 = i4;
                            i5 = 0;
                        }
                        cArr[i4] = c3;
                        i4++;
                        i = 1;
                        i2 = 0;
                        z = false;
                    }
                    i = 1;
                    i2 = 0;
                } else if (c3 == ':' || c3 == '=') {
                    if (i3 == -1) {
                        i3 = i4;
                        i = 1;
                        i2 = 0;
                        i5 = 0;
                    } else {
                        if (Character.isSpace(c3)) {
                            if (i5 == 3) {
                                i5 = 5;
                            }
                            if (i4 == 0) {
                            }
                            i = 1;
                            i2 = 0;
                        }
                        if (i5 != 5) {
                            i5 = 0;
                        } else {
                            i5 = 0;
                        }
                        if (i5 == 4) {
                            i3 = i4;
                            i5 = 0;
                        }
                        cArr[i4] = c3;
                        i4++;
                        i = 1;
                        i2 = 0;
                        z = false;
                    }
                } else if (c3 != '\\') {
                    if (Character.isSpace(c3)) {
                        if (i5 == 3) {
                            i5 = 5;
                        }
                        if (i4 == 0) {
                        }
                        i = 1;
                        i2 = 0;
                    }
                    if (i5 != 5) {
                        i5 = 0;
                    } else {
                        i5 = 0;
                    }
                    if (i5 == 4) {
                        i3 = i4;
                        i5 = 0;
                    }
                    cArr[i4] = c3;
                    i4++;
                    i = 1;
                    i2 = 0;
                    z = false;
                } else {
                    if (i5 == 4) {
                        i3 = i4;
                    }
                    i = 1;
                    i2 = 0;
                    i5 = 1;
                }
            } else if (i5 == 3) {
                i5 = 5;
                i = 1;
                i2 = 0;
            } else {
                if (i4 <= 0) {
                    if (i3 == -1) {
                        i3 = i4;
                    }
                    i2 = 0;
                    String str3 = new String(cArr, 0, i4);
                    iVar.h(str3.substring(0, i3), str3.substring(i3));
                } else {
                    if (i3 == -1) {
                        i3 = i4;
                    }
                    i2 = 0;
                    String str4 = new String(cArr, 0, i4);
                    iVar.h(str4.substring(0, i3), str4.substring(i3));
                }
                i3 = -1;
                i4 = i2;
                i5 = i4;
                i = 1;
                z = true;
            }
        }
    }
}
