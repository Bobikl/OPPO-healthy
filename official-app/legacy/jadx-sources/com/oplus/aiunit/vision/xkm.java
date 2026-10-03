package com.oplus.aiunit.vision;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.util.Locale;

/* JADX INFO: loaded from: classes12.dex */
public final class xkm {
    public boolean a;
    public String b = com.alipay.sdk.m.u.a.j(24);

    public xkm(boolean z) {
        this.a = z;
    }

    public static int a(String str) {
        return Integer.parseInt(str);
    }

    public static String d(int i) {
        return String.format(Locale.getDefault(), "%05d", Integer.valueOf(i));
    }

    public static byte[] e(String str, String str2) {
        return tom.a(str, str2);
    }

    public static byte[] f(String str, byte[] bArr, String str2) {
        return ssm.b(str, bArr, str2);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x0056 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:? A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
    public static byte[] g(byte[]... bArr) throws Throwable {
        DataOutputStream dataOutputStream;
        ?? r0 = 0;
        bArr = null;
        byte[] bArr2 = null;
        if (bArr != null) {
            ?? length = bArr.length;
            try {
                if (length != 0) {
                    try {
                        length = new ByteArrayOutputStream();
                        try {
                            dataOutputStream = new DataOutputStream(length);
                            try {
                                for (byte[] bArr3 : bArr) {
                                    dataOutputStream.write(d(bArr3.length).getBytes());
                                    dataOutputStream.write(bArr3);
                                }
                                dataOutputStream.flush();
                                byte[] byteArray = length.toByteArray();
                                try {
                                    length.close();
                                } catch (Exception unused) {
                                }
                                bArr2 = byteArray;
                            } catch (Exception e2) {
                                e = e2;
                                qrm.d(e);
                                if (length != 0) {
                                    try {
                                        length.close();
                                    } catch (Exception unused2) {
                                    }
                                }
                                if (dataOutputStream != null) {
                                }
                                return bArr2;
                            }
                        } catch (Exception e3) {
                            e = e3;
                            dataOutputStream = null;
                        } catch (Throwable th) {
                            th = th;
                            r0 = length;
                            if (r0 != 0) {
                                try {
                                    r0.close();
                                } catch (Exception unused3) {
                                }
                            }
                            if (r0 != 0) {
                                throw th;
                            }
                            try {
                                r0.close();
                                throw th;
                            } catch (Exception unused4) {
                                throw th;
                            }
                        }
                    } catch (Exception e4) {
                        e = e4;
                        length = 0;
                        dataOutputStream = null;
                    } catch (Throwable th2) {
                        th = th2;
                        if (r0 != 0) {
                            r0.close();
                        }
                        if (r0 != 0) {
                            throw th;
                        }
                        r0.close();
                        throw th;
                    }
                    try {
                        dataOutputStream.close();
                    } catch (Exception unused5) {
                    }
                    return bArr2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
        return null;
    }

    public static byte[] h(String str, byte[] bArr, String str2) {
        return ssm.d(str, bArr, str2);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0079 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0076: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:37:0x0076 */
    public ygm b(vom vomVar, String str) {
        ByteArrayInputStream byteArrayInputStream;
        String str2;
        ByteArrayInputStream byteArrayInputStream2;
        String str3;
        ByteArrayInputStream byteArrayInputStream3 = null;
        try {
            try {
                byteArrayInputStream = new ByteArrayInputStream(vomVar.a());
                try {
                    byte[] bArr = new byte[5];
                    byteArrayInputStream.read(bArr);
                    byte[] bArr2 = new byte[a(new String(bArr))];
                    byteArrayInputStream.read(bArr2);
                    str2 = new String(bArr2);
                    try {
                        byte[] bArr3 = new byte[5];
                        byteArrayInputStream.read(bArr3);
                        int iA = a(new String(bArr3));
                        if (iA > 0) {
                            byte[] bArrB = new byte[iA];
                            byteArrayInputStream.read(bArrB);
                            if (this.a) {
                                bArrB = f(this.b, bArrB, str);
                            }
                            if (vomVar.b()) {
                                bArrB = vgm.b(bArrB);
                            }
                            str3 = new String(bArrB);
                        } else {
                            str3 = null;
                        }
                        try {
                            byteArrayInputStream.close();
                        } catch (Exception unused) {
                        }
                    } catch (Exception e2) {
                        e = e2;
                        qrm.d(e);
                        if (byteArrayInputStream != null) {
                            try {
                                byteArrayInputStream.close();
                            } catch (Exception unused2) {
                            }
                        }
                        str3 = null;
                    }
                } catch (Exception e3) {
                    e = e3;
                    str2 = null;
                }
            } catch (Throwable th) {
                th = th;
                byteArrayInputStream3 = byteArrayInputStream2;
                if (byteArrayInputStream3 != null) {
                    try {
                        byteArrayInputStream3.close();
                    } catch (Exception unused3) {
                    }
                }
                throw th;
            }
        } catch (Exception e4) {
            e = e4;
            byteArrayInputStream = null;
            str2 = null;
        } catch (Throwable th2) {
            th = th2;
            if (byteArrayInputStream3 != null) {
                byteArrayInputStream3.close();
            }
            throw th;
        }
        if (str2 == null && str3 == null) {
            return null;
        }
        return new ygm(str2, str3);
    }

    public vom c(ygm ygmVar, boolean z, String str) {
        if (ygmVar == null) {
            return null;
        }
        byte[] bytes = ygmVar.b().getBytes();
        byte[] bytes2 = ygmVar.a().getBytes();
        if (z) {
            try {
                bytes2 = vgm.a(bytes2);
            } catch (Exception unused) {
                z = false;
            }
        }
        return new vom(z, this.a ? g(bytes, e(this.b, ham.f), h(this.b, bytes2, str)) : g(bytes, bytes2));
    }
}
