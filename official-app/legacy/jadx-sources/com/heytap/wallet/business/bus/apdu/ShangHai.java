package com.heytap.wallet.business.bus.apdu;

import android.text.TextUtils;
import com.google.android.material.timepicker.TimeModel;
import com.heytap.health.wallet.bean.Command;
import com.heytap.health.wallet.bean.TaskResult;
import com.heytap.wallet.business.bus.bean.NfcConsumeRecord;
import com.heytap.wallet.business.bus.bean.TrafficCardInfo;
import com.oplus.aiunit.vision.d04;
import com.oplus.aiunit.vision.drk;
import com.oplus.aiunit.vision.e1j;
import com.oplus.aiunit.vision.h0b;
import com.oplus.aiunit.vision.j3;
import com.oplus.aiunit.vision.t6b;
import com.oplus.aiunit.vision.x7e;
import com.oplus.aiunit.vision.z60;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes19.dex */
public class ShangHai extends j3 implements x7e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f8423c = {"00A404000FA00000004644574F50504F53484149", "80CA000009", "00B2038C00", "00B2039400", "00B2039C00", "00B206A400"};
    public static final String[] d = {"00A4040010A0000006320101060200290046445774", "80CA000009", "00B2038C00", "00B2039400", "00B2039C00", "00B206A400"};
    public String b;

    public static class ShangHaiConsumeRecor extends NfcConsumeRecord {
        public boolean isRecharge;
        public String result;

        @Override // com.heytap.wallet.business.bus.bean.NfcConsumeRecord
        public boolean isConsume() {
            return !this.isRecharge;
        }
    }

    public ShangHai(String str) {
        this.b = str;
    }

    @Override // com.oplus.aiunit.vision.x7e
    public String a(String str, String str2) {
        return n(str2);
    }

    @Override // com.oplus.aiunit.vision.l92
    public String getAid() {
        return this.b;
    }

    @Override // com.oplus.aiunit.vision.j3
    public TrafficCardInfo h(TaskResult taskResult) {
        if (9000 == taskResult.getResultCode()) {
            List<Command> commands = taskResult.getContent().getCommands();
            int size = commands.size();
            if (!commands.isEmpty()) {
                int i = size - 1;
                if (!TextUtils.isEmpty(commands.get(i).getResult())) {
                    t6b.b("ShangHai", "post card id result");
                    String result = commands.get(i).getResult();
                    t6b.b("ShangHai", "card idresult apdu -> " + result);
                    if (result.length() >= 94) {
                        String strM = m(result);
                        String strN = n(result);
                        String strSubstring = result.substring(84, 92);
                        String strSubstring2 = result.substring(92, 100);
                        TrafficCardInfo trafficCardInfo = new TrafficCardInfo();
                        trafficCardInfo.cardNo = strN;
                        trafficCardInfo.innerNo = strM;
                        trafficCardInfo.serialNo = result.substring(68, 84);
                        trafficCardInfo.startDate = strSubstring;
                        trafficCardInfo.endDate = strSubstring2;
                        trafficCardInfo.aid = getAid();
                        trafficCardInfo.isInBlackList = false;
                        t6b.e(trafficCardInfo.toString());
                        return trafficCardInfo;
                    }
                }
            }
        }
        return null;
    }

    @Override // com.oplus.aiunit.vision.j3
    public String i(String str) {
        String strSubstring = str.substring(68, 84);
        return String.format("%010d", Long.valueOf(Long.parseLong(strSubstring.substring(strSubstring.length() - 8), 16)));
    }

    @Override // com.oplus.aiunit.vision.j3
    public String j(String str) {
        String strSubstring = str.substring(68, 84);
        long j2 = Long.parseLong(strSubstring.substring(strSubstring.length() - 8), 16);
        StringBuilder sb = new StringBuilder(10);
        String str2 = String.format("%010d", Long.valueOf(j2));
        long j3 = 0;
        for (int i = 0; i < 5; i++) {
            if (i != 0) {
                j2 /= 100;
            }
            long j4 = (j2 % 10) * 2;
            long j5 = j2 % 100;
            sb.append(String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Long.valueOf(j5)));
            j3 = j3 + (j4 % 10) + (j4 / 10) + (j5 / 10);
        }
        String str3 = String.valueOf(Math.abs(10 - (j3 % 10)) % 10) + sb.toString();
        t6b.b("CardNoParser", "serialNo:" + strSubstring + " innerNo:" + str2 + " cardNo:" + str3);
        return str3;
    }

    @Override // com.oplus.aiunit.vision.j3
    public ArrayList<NfcConsumeRecord> k(TaskResult taskResult) {
        String result;
        ShangHaiConsumeRecor shangHaiConsumeRecorQ;
        ArrayList<NfcConsumeRecord> arrayListA = h0b.a();
        new HashMap();
        if (taskResult.getResultCode() == 9000) {
            List<Command> commands = taskResult.getContent().getCommands();
            if (!drk.e(commands)) {
                for (Command command : commands) {
                    t6b.i("RecordParser", command.getResult());
                    if (command.getCommand().startsWith(d04.TAG_QUERY_TRANSACTION_DETAIL) && !Pattern.matches("0{31,}9000", command.getResult()) && (result = command.getResult()) != null && (shangHaiConsumeRecorQ = q(result)) != null) {
                        shangHaiConsumeRecorQ.result = result;
                        if (result.length() > 36) {
                            arrayListA.add(shangHaiConsumeRecorQ);
                        }
                    }
                }
            }
        }
        return arrayListA;
    }

    public List<Command> p() {
        return d(z60.APPCODE_SHANG_HAI.equalsIgnoreCase(this.b) ? f8423c : d, ".*(9000)$");
    }

    public ShangHaiConsumeRecor q(String str) {
        ShangHaiConsumeRecor shangHaiConsumeRecor = null;
        if (!TextUtils.isEmpty(str) && str.length() >= 36) {
            if (str.length() >= 50) {
                shangHaiConsumeRecor = new ShangHaiConsumeRecor();
                shangHaiConsumeRecor.serialNumber = str.substring(0, 4);
                shangHaiConsumeRecor.balance = Integer.valueOf(e1j.f(e1j.e(str.substring(4, 10))));
                shangHaiConsumeRecor.amount = e1j.f(e1j.e(str.substring(10, 18)));
                String strSubstring = str.substring(18, 20);
                int i = Integer.parseInt(strSubstring, 16);
                StringBuilder sb = new StringBuilder();
                sb.append("isRecharge:");
                sb.append(i == 2);
                sb.append("_18type:");
                sb.append(i);
                t6b.b("RecordParser", sb.toString());
                if (i == 2) {
                    shangHaiConsumeRecor.isRecharge = true;
                } else {
                    shangHaiConsumeRecor.isRecharge = false;
                }
                shangHaiConsumeRecor.transeType = strSubstring;
                shangHaiConsumeRecor.terminalCode = str.substring(20, 32);
                shangHaiConsumeRecor.transTime = str.substring(32, 46);
            } else {
                t6b.h("RecordParse erro reulst:" + str + " length:" + str.length());
            }
            t6b.b("RecordParser", "record:" + shangHaiConsumeRecor);
        }
        return shangHaiConsumeRecor;
    }

    public int r(TaskResult taskResult) {
        String result;
        if (taskResult.getResultCode() != 9000) {
            return 0;
        }
        List<Command> commands = taskResult.getContent().getCommands();
        if (!drk.e(commands)) {
            for (Command command : commands) {
                t6b.i("parseSiteState", command.getResult());
                if (command.getCommand().startsWith(d04.TAG_QUERY_TRANSACTION_DETAIL) && Pattern.matches(".*(9000)$", command.getResult()) && (result = command.getResult()) != null && result.length() >= 2) {
                    String strSubstring = result.substring(0, 2);
                    if ("00B206A400".equalsIgnoreCase(command.getCommand())) {
                        if ("AA".equals(strSubstring) || "CC".equals(strSubstring) || "33".equals(strSubstring)) {
                            return 1;
                        }
                    } else if ("55".equals(strSubstring)) {
                        return 1;
                    }
                }
            }
        }
        return 2;
    }
}
