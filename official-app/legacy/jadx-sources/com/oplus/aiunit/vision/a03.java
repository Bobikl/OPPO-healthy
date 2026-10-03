package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.heytap.health.wallet.bean.Command;
import com.heytap.health.wallet.bean.TaskResult;
import com.heytap.wallet.business.bus.apdu.ShangHai;
import com.heytap.wallet.business.bus.bean.TrafficCardInfo;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class a03 {
    public static a03 b;
    public final String a = "RecordParser";

    public static a03 a() {
        if (b == null) {
            synchronized (a03.class) {
                if (b == null) {
                    b = new a03();
                }
            }
        }
        return b;
    }

    public static TrafficCardInfo b(String str, List<Command> list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        for (Command command : list) {
            if (command.getResult() != null && command.getResult().endsWith("6283")) {
                TrafficCardInfo trafficCardInfo = new TrafficCardInfo();
                trafficCardInfo.aid = str;
                trafficCardInfo.isInBlackList = true;
                return trafficCardInfo;
            }
        }
        return null;
    }

    public static TrafficCardInfo c(String str, String str2) {
        if (str2.length() <= 56) {
            return null;
        }
        String strSubstring = str2.substring(0, 16);
        String strD = m92.d(str, str2);
        String strSubstring2 = str2.substring(40, 48);
        String strSubstring3 = str2.substring(48, 56);
        TrafficCardInfo trafficCardInfo = new TrafficCardInfo();
        trafficCardInfo.cardNo = strD;
        trafficCardInfo.startDate = strSubstring2;
        trafficCardInfo.endDate = strSubstring3;
        trafficCardInfo.aid = str;
        trafficCardInfo.status = str2.substring(18, 20);
        trafficCardInfo.isInBlackList = false;
        trafficCardInfo.cardIssuerId = strSubstring;
        t6b.e(trafficCardInfo.toString());
        return trafficCardInfo;
    }

    public static TrafficCardInfo e(String str, String str2) {
        if (str2.length() < 60) {
            return null;
        }
        String strSubstring = str2.substring(0, 16);
        String strA = k03.b().a(str, str2);
        String strSubstring2 = str2.substring(40, 48);
        String strSubstring3 = str2.substring(48, 56);
        TrafficCardInfo trafficCardInfo = new TrafficCardInfo();
        trafficCardInfo.cardNo = strA;
        trafficCardInfo.startDate = strSubstring2;
        trafficCardInfo.endDate = strSubstring3;
        trafficCardInfo.aid = str;
        trafficCardInfo.status = "02".equalsIgnoreCase(str2.substring(58, 60)) ? "01" : "00";
        trafficCardInfo.isInBlackList = false;
        trafficCardInfo.cardIssuerId = strSubstring;
        t6b.e(trafficCardInfo.toString());
        return trafficCardInfo;
    }

    public static TrafficCardInfo f(String str, List<Command> list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        for (Command command : list) {
            if (command.getResult() != null && (command.getResult().endsWith("6283") || command.getResult().endsWith("6a81") || command.getResult().endsWith("6A81"))) {
                TrafficCardInfo trafficCardInfo = new TrafficCardInfo();
                trafficCardInfo.aid = str;
                trafficCardInfo.isInBlackList = true;
                return trafficCardInfo;
            }
        }
        return null;
    }

    public static TrafficCardInfo g(String str, String str2) {
        if (str2.length() < 94) {
            return null;
        }
        String strSubstring = str2.substring(0, 4);
        String strA = k03.b().a(str, str2);
        String strSubstring2 = str2.substring(56, 64);
        String strSubstring3 = str2.substring(64, 72);
        TrafficCardInfo trafficCardInfo = new TrafficCardInfo();
        trafficCardInfo.cardNo = strA;
        trafficCardInfo.startDate = strSubstring2;
        trafficCardInfo.endDate = strSubstring3;
        trafficCardInfo.aid = str;
        trafficCardInfo.status = "02".equalsIgnoreCase(str2.substring(12, 14)) ? "01" : "00";
        trafficCardInfo.isInBlackList = false;
        trafficCardInfo.cardIssuerId = strSubstring;
        trafficCardInfo.abnormalUserCard = drk.b(16, str2.substring(72, 74), 0) > 127;
        t6b.e(trafficCardInfo.toString());
        return trafficCardInfo;
    }

    public TrafficCardInfo d(String str, TaskResult taskResult) {
        if (9000 != taskResult.getResultCode()) {
            List<Command> commands = taskResult.getContent().getCommands();
            t6b.b("RecordParser", "parseCardInfo" + commands.toString());
            return v13.j(str) ? f(str, commands) : b(str, commands);
        }
        List<Command> commands2 = taskResult.getContent().getCommands();
        int size = commands2.size();
        t6b.b("RecordParser", "post card id result");
        if (commands2.isEmpty()) {
            return null;
        }
        int i = size - 1;
        if (TextUtils.isEmpty(commands2.get(i).getResult())) {
            return null;
        }
        t6b.b("RecordParser", "post card id result");
        String result = commands2.get(i).getResult();
        t6b.b("RecordParser", "card idresult apdu -> " + result);
        if (v13.j(str)) {
            return g(str, result);
        }
        if (v13.h(str)) {
            return new ShangHai(str).l(taskResult);
        }
        return "D156000015CCECB8AECDA8BFA8".equals(str) ? e(str, result) : c(str, result);
    }
}
