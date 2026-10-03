package com.oplus.aiunit.vision;

import android.util.Log;
import com.oplus.weatherservicesdk.data.Weather;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Calendar;

/* JADX INFO: loaded from: classes13.dex */
public class rd7 {
    public static final String FILES_DIRECTROTY = "/data/data/com.heytap.okhttp.demo/files";
    public static final String STATISTIC_20214_FILE_PATH = "/data/data/com.heytap.okhttp.demo/files/stat_20214";
    public static final String STATISTIC_CUSTOM_FILE_PATH = "/data/data/com.heytap.okhttp.demo/files/stat_custom";
    public static final String TEST_DEMO_MUTI_RACE_PATH = "/data/data/com.heytap.okhttp.demo/files/test_demo_muti_race";
    public static final String TEST_DEMO_QUIC_PATH = "/data/data/com.heytap.okhttp.demo/files/test_demo_quic";
    public static final String TEST_DEMO_TCP_NOTLS_PATH = "/data/data/com.heytap.okhttp.demo/files/test_demo_tcp_notls";
    public static final String TEST_DEMO_TCP_PATH = "/data/data/com.heytap.okhttp.demo/files/test_demo_tcp";

    public static String a() {
        Calendar calendar = Calendar.getInstance();
        return calendar.get(1) + "-" + (calendar.get(2) + 1) + "-" + calendar.get(5) + "-" + calendar.get(11) + "-" + calendar.get(12) + "-" + calendar.get(13) + ":";
    }

    public static synchronized void b(String str, String str2) {
        BufferedWriter bufferedWriter = null;
        try {
            try {
                File file = new File(FILES_DIRECTROTY);
                if (!file.exists()) {
                    file.mkdirs();
                    Log.d("Taphttp.FileUtil", "(调试使用)文件夹创建完毕");
                }
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(str, true)));
                try {
                    String str3 = a() + str2 + Weather.SEPARATOR;
                    bufferedWriter2.write(str3);
                    Log.d("Taphttp.FileUtil", "（调试使用）数据已保存：" + str3);
                    try {
                        bufferedWriter2.close();
                    } catch (IOException e2) {
                        e = e2;
                        e.printStackTrace();
                    }
                } catch (IOException e3) {
                    e = e3;
                    bufferedWriter = bufferedWriter2;
                    e.printStackTrace();
                    if (bufferedWriter != null) {
                        try {
                            bufferedWriter.close();
                        } catch (IOException e4) {
                            e = e4;
                            e.printStackTrace();
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter = bufferedWriter2;
                    if (bufferedWriter != null) {
                        try {
                            bufferedWriter.close();
                        } catch (IOException e5) {
                            e5.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (IOException e6) {
                e = e6;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
