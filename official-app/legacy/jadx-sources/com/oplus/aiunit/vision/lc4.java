package com.oplus.aiunit.vision;

import android.util.Pair;
import com.platform.usercenter.tools.device.UCDeviceInfoUtil;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class lc4 {

    public interface a {
        Pair<String, String> a(String str);
    }

    public static Map<String, String> b() {
        try {
            return d(new FileInputStream(UCDeviceInfoUtil.PROC_CPU_INFO), new a() { // from class: com.oplus.aiunit.vision.kc4
                @Override // com.oplus.aiunit.vision.lc4.a
                public final Pair a(String str) {
                    return lc4.c(str);
                }
            });
        } catch (IOException e2) {
            v6b.b(e2.toString());
            return null;
        }
    }

    public static /* synthetic */ Pair c(String str) {
        String[] strArrSplit = str.split(":", 2);
        if (strArrSplit.length < 2) {
            return null;
        }
        return new Pair(strArrSplit[0].trim(), strArrSplit[1].trim());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0045 -> B:32:0x004c). Please report as a decompilation issue!!! */
    public static Map<String, String> d(InputStream inputStream, a aVar) throws Throwable {
        HashMap map = new HashMap();
        ?? r1 = 0;
        String str = null;
        BufferedReader bufferedReader = null;
        r1 = 0;
        try {
            try {
                try {
                    BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
                    while (true) {
                        try {
                            String line = bufferedReader2.readLine();
                            if (line == null) {
                                break;
                            }
                            Pair<String, String> pairA = aVar.a(line);
                            if (pairA != null) {
                                str = (String) pairA.first;
                                map.put(str, (String) pairA.second);
                            }
                        } catch (Exception e2) {
                            e = e2;
                            bufferedReader = bufferedReader2;
                            v6b.b(e.toString());
                            r1 = bufferedReader;
                            if (bufferedReader != null) {
                                bufferedReader.close();
                                r1 = bufferedReader;
                            }
                        } catch (Throwable th) {
                            th = th;
                            r1 = bufferedReader2;
                            if (r1 != 0) {
                                try {
                                    r1.close();
                                } catch (Exception e3) {
                                    v6b.b(e3.toString());
                                }
                            }
                            throw th;
                        }
                    }
                    bufferedReader2.close();
                    r1 = str;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e4) {
                e = e4;
            }
        } catch (Exception e5) {
            v6b.b(e5.toString());
            r1 = r1;
        }
        return map;
    }
}
