package com.heytap.accessory.utils.statis;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class StatisticsDisplay {
    public static final int STATISTICS_TYPE_CONNECT = 0;
    public static final int STATISTICS_TYPE_FILE = 1;
    public static final int STATISTICS_TYPE_MSG = 2;

    private static String getDisplayDesc(int i) {
        if (i == 0) {
            return "通道连接统计";
        }
        if (i != 1) {
            return i != 2 ? "未知统计类型" : "消息发送统计";
        }
        return "文件发送统计";
    }

    private static void resetData(int i) {
        if (i == 0) {
            StatisticsTpForStandard.resetConnectData();
        } else if (i == 1) {
            StatisticsTpForStandard.resetFileData();
        } else {
            if (i != 2) {
                return;
            }
            StatisticsTpForStandard.resetMsgData();
        }
    }

    public static String showContent(int i) {
        if (i == 0) {
            return StatisticsTpForStandard.getConnectReport();
        }
        if (i == 1) {
            return StatisticsTpForStandard.getFileSendReport();
        }
        if (i == 2) {
            return StatisticsTpForStandard.getMsgSendReport();
        }
        return "未知统计类型：" + i;
    }
}
