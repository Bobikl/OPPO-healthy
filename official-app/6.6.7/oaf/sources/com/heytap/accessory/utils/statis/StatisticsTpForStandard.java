package com.heytap.accessory.utils.statis;

import com.heytap.accessory.logging.SdkLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class StatisticsTpForStandard {
    private static final String TAG = "[reportForTest]";
    private static int sConnectSuccessCount;
    private static int sConnectTotalCount;
    private static int sFileSuccessCount;
    private static int sFileTotalCount;
    private static int sMsgSuccessCount;
    private static int sMsgTotalCount;
    private static List<Long> sSystemConnectCosts = new ArrayList();
    private static List<Long> sOafConnectCosts = new ArrayList();
    private static List<Integer> sConnectRetryTime = new ArrayList();
    private static List<Long> sMsgCosts = new ArrayList();
    private static List<Float> sFileRates = new ArrayList();

    private static float calculateAvgFloat(List<Float> list) {
        float fFloatValue = 0.0f;
        if (list == null || list.isEmpty()) {
            return 0.0f;
        }
        Iterator<Float> it = list.iterator();
        while (it.hasNext()) {
            fFloatValue += it.next().floatValue();
        }
        return fFloatValue / list.size();
    }

    private static float calculateAvgInteger(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            return 0.0f;
        }
        Iterator<Integer> it = list.iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue += it.next().intValue();
        }
        return iIntValue / list.size();
    }

    private static long calculateAvgLong(List<Long> list) {
        long jLongValue = 0;
        if (list == null || list.isEmpty()) {
            return 0L;
        }
        Iterator<Long> it = list.iterator();
        while (it.hasNext()) {
            jLongValue += it.next().longValue();
        }
        return jLongValue / ((long) list.size());
    }

    public static String getConnectReport() {
        String str = "\n连接平均耗时(系统)：" + calculateAvgLong(sSystemConnectCosts) + "ms" + getSizeDesc(sSystemConnectCosts.size()) + "\n连接平均耗时(OAF)：" + calculateAvgLong(sOafConnectCosts) + "ms" + getSizeDesc(sOafConnectCosts.size()) + "\n连接成功率(OAF)：" + getPercent(sConnectSuccessCount, sConnectTotalCount) + getSizeDesc(sConnectTotalCount) + "\n重试平均次数：" + calculateAvgInteger(sConnectRetryTime) + getSizeDesc(sConnectRetryTime.size());
        SdkLog.i(TAG, "[Connect](重置统计命令：adb shell am force-stop com.heytap.accessory)" + str);
        return str;
    }

    public static String getFileSendReport() {
        String str = "\n文件传输平均速率：" + (String.format(Locale.CHINA, "%.2f", Float.valueOf(calculateAvgFloat(sFileRates))) + "kb/s") + getSizeDesc(sFileRates.size()) + "\n文件传输成功率：" + getPercent(sFileSuccessCount, sFileTotalCount) + getSizeDesc(sFileTotalCount);
        SdkLog.i(TAG, "[File](重置统计命令：adb shell am force-stop com.heytap.accessory)" + str);
        return str;
    }

    public static String getMsgSendReport() {
        String str = "\n消息传输平均时延：" + calculateAvgLong(sMsgCosts) + "ms" + getSizeDesc(sMsgCosts.size()) + "\n消息传输成功率：" + getPercent(sMsgSuccessCount, sMsgTotalCount) + getSizeDesc(sMsgTotalCount);
        SdkLog.i(TAG, "[Message](重置统计命令：adb shell am force-stop com.heytap.accessory.demo.consumers)" + str);
        return str;
    }

    private static String getPercent(int i, int i2) {
        if (i2 == 0) {
            return "0";
        }
        return String.format(Locale.CHINA, "%.2f", Float.valueOf((i / i2) * 100.0f)) + "%";
    }

    private static String getSizeDesc(int i) {
        return " (" + i + " 次)";
    }

    public static void onConnectStart() {
        sConnectTotalCount++;
    }

    public static void onConnectSuccess(long j, long j2, int i) {
        sConnectSuccessCount++;
        sSystemConnectCosts.add(Long.valueOf(j));
        sOafConnectCosts.add(Long.valueOf(j2));
        sConnectRetryTime.add(Integer.valueOf(i));
        getConnectReport();
    }

    public static void onFileStart() {
        sFileTotalCount++;
    }

    public static void onFileSuccess(float f) {
        sFileSuccessCount++;
        sFileRates.add(Float.valueOf(f));
        getFileSendReport();
    }

    public static void onMsgStart() {
        sMsgTotalCount++;
    }

    public static void onMsgSuccess(long j) {
        sMsgSuccessCount++;
        sMsgCosts.add(Long.valueOf(j));
        getMsgSendReport();
    }

    public static void resetConnectData() {
        sSystemConnectCosts.clear();
        sOafConnectCosts.clear();
        sConnectRetryTime.clear();
        sConnectSuccessCount = 0;
        sConnectTotalCount = 0;
    }

    public static void resetFileData() {
        sFileRates.clear();
        sFileSuccessCount = 0;
        sFileTotalCount = 0;
    }

    public static void resetMsgData() {
        sMsgCosts.clear();
        sMsgSuccessCount = 0;
        sMsgTotalCount = 0;
    }
}
