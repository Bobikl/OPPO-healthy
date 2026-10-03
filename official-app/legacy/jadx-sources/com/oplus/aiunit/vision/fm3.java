package com.oplus.aiunit.vision;

import com.oplus.deepthinker.sdk.app.aidl.eventfountain.TriggerEvent;
import com.oplus.weatherservicesdk.data.Weather;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public class fm3 {

    public static class b {
        public static final fm3 a = new fm3();
    }

    public static final fm3 b() {
        return b.a;
    }

    public static String c(BufferedInputStream bufferedInputStream) {
        int i;
        if (bufferedInputStream == null) {
            return "";
        }
        byte[] bArr = new byte[512];
        StringBuilder sb = new StringBuilder();
        do {
            try {
                i = bufferedInputStream.read(bArr);
                if (i > 0) {
                    sb.append(new String(bArr, 0, i));
                }
            } catch (Exception e2) {
                v6b.b(e2.toString());
            }
        } while (i >= 512);
        return sb.toString();
    }

    public static String d() throws Throwable {
        try {
            String strA = b().a("cat /proc/self/cgroup");
            if (strA != null && strA.length() != 0) {
                int iLastIndexOf = strA.lastIndexOf(TriggerEvent.EXTRA_UID);
                int iLastIndexOf2 = strA.lastIndexOf("/pid");
                if (iLastIndexOf < 0) {
                    return null;
                }
                if (iLastIndexOf2 <= 0) {
                    iLastIndexOf2 = strA.length();
                }
                String strReplaceAll = strA.substring(iLastIndexOf + 4, iLastIndexOf2).replaceAll(Weather.SEPARATOR, "");
                if (e(strReplaceAll)) {
                    return String.format("u0_a%d", Integer.valueOf(Integer.valueOf(strReplaceAll).intValue() - 10000));
                }
                return null;
            }
            return null;
        } catch (Exception e2) {
            v6b.b(e2.toString());
            return null;
        }
    }

    public static boolean e(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0081  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:60:0x0073 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x008a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0065 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x0098 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:? A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.io.BufferedInputStream] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.BufferedInputStream] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.io.BufferedInputStream] */
    public String a(String str) throws Throwable {
        Process processExec;
        BufferedOutputStream bufferedOutputStream;
        ?? bufferedInputStream;
        Throwable th;
        try {
            processExec = Runtime.getRuntime().exec("sh");
            try {
                bufferedOutputStream = new BufferedOutputStream(processExec.getOutputStream());
                try {
                    bufferedInputStream = new BufferedInputStream(processExec.getInputStream());
                    try {
                        bufferedOutputStream.write(str.getBytes());
                        bufferedOutputStream.write(10);
                        bufferedOutputStream.flush();
                        bufferedOutputStream.close();
                        processExec.waitFor();
                        String strC = c(bufferedInputStream);
                        try {
                            bufferedOutputStream.close();
                        } catch (IOException e2) {
                            v6b.b(e2.toString());
                        }
                        try {
                            bufferedInputStream.close();
                        } catch (IOException e3) {
                            v6b.b(e3.toString());
                        }
                        processExec.destroy();
                        return strC;
                    } catch (Exception unused) {
                        if (bufferedOutputStream != null) {
                            try {
                                bufferedOutputStream.close();
                            } catch (IOException e4) {
                                v6b.b(e4.toString());
                            }
                        }
                        if (bufferedInputStream != 0) {
                            try {
                                bufferedInputStream.close();
                            } catch (IOException e5) {
                                v6b.b(e5.toString());
                            }
                        }
                        if (processExec != null) {
                            processExec.destroy();
                        }
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        if (bufferedOutputStream != null) {
                            try {
                                bufferedOutputStream.close();
                            } catch (IOException e6) {
                                v6b.b(e6.toString());
                            }
                        }
                        if (bufferedInputStream != 0) {
                            try {
                                bufferedInputStream.close();
                            } catch (IOException e7) {
                                v6b.b(e7.toString());
                            }
                        }
                        if (processExec == null) {
                            throw th;
                        }
                        processExec.destroy();
                        throw th;
                    }
                } catch (Exception unused2) {
                    bufferedInputStream = 0;
                } catch (Throwable th3) {
                    th = th3;
                    bufferedInputStream = 0;
                    th = th;
                    if (bufferedOutputStream != null) {
                        bufferedOutputStream.close();
                    }
                    if (bufferedInputStream != 0) {
                        bufferedInputStream.close();
                    }
                    if (processExec == null) {
                        throw th;
                    }
                    processExec.destroy();
                    throw th;
                }
            } catch (Exception unused3) {
                bufferedOutputStream = null;
                bufferedInputStream = bufferedOutputStream;
                if (bufferedOutputStream != null) {
                    bufferedOutputStream.close();
                }
                if (bufferedInputStream != 0) {
                    bufferedInputStream.close();
                }
                if (processExec != null) {
                    processExec.destroy();
                }
                return null;
            } catch (Throwable th4) {
                th = th4;
                bufferedOutputStream = null;
                bufferedInputStream = bufferedOutputStream;
                th = th;
                if (bufferedOutputStream != null) {
                    bufferedOutputStream.close();
                }
                if (bufferedInputStream != 0) {
                    bufferedInputStream.close();
                }
                if (processExec == null) {
                    throw th;
                }
                processExec.destroy();
                throw th;
            }
        } catch (Exception unused4) {
            processExec = null;
            bufferedOutputStream = null;
        } catch (Throwable th5) {
            th = th5;
            processExec = null;
            bufferedOutputStream = null;
        }
    }

    public fm3() {
    }
}
