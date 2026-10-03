package com.oplus.aiunit.vision;

import com.heytap.health.wallet.bean.Command;
import com.heytap.health.wallet.bean.TaskResult;
import com.heytap.wallet.business.bus.apdu.ShangHai;
import com.heytap.wallet.business.bus.bean.NfcConsumeRecord;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes19.dex */
public class tqc implements w7e, x7e {
    public static tqc b;
    public String a = "NfcBus";

    public static tqc g() {
        if (b == null) {
            synchronized (tqc.class) {
                if (b == null) {
                    b = new tqc();
                }
            }
        }
        return b;
    }

    @Override // com.oplus.aiunit.vision.x7e
    @Deprecated
    public String a(String str, String str2) {
        try {
            return k03.b().a(str, str2);
        } catch (Exception e2) {
            t6b.d(this.a, Thread.currentThread().getStackTrace()[1].getMethodName() + e2.getMessage());
            return null;
        }
    }

    @Deprecated
    public List<Command> b(String str) {
        return yba.b(str);
    }

    @Deprecated
    public List<Command> c(String str) {
        return yba.c(str);
    }

    @Deprecated
    public List<Command> d(String str) {
        return ntk.b(str, ntk.STATIONS_STATUS_CODE_SET, ".*(9000)$");
    }

    @Deprecated
    public List<Command> e(String str) {
        return yba.d(str);
    }

    public w92 f(String str) {
        return x92.q().p(str);
    }

    @Deprecated
    public int h(String str, String str2) {
        try {
            return os0.a().b(str, str2);
        } catch (Exception e2) {
            t6b.d(this.a, Thread.currentThread().getStackTrace()[1].getMethodName() + e2.getMessage());
            return 0;
        }
    }

    @Deprecated
    public int i(String str, String str2) {
        try {
            if ("A0000006320101055359534A54".equals(str)) {
                return Integer.parseInt(str2.substring(38, 44), 16);
            }
            return 0;
        } catch (Exception e2) {
            t6b.d(this.a, Thread.currentThread().getStackTrace()[1].getMethodName() + e2.getMessage());
            return 0;
        }
    }

    @Deprecated
    public NfcConsumeRecord j(String str, String str2) {
        try {
            return thf.e().f(str, str2);
        } catch (Exception e2) {
            t6b.d(this.a, Thread.currentThread().getStackTrace()[1].getMethodName() + e2.getMessage());
            return null;
        }
    }

    @Deprecated
    public List<NfcConsumeRecord> k(String str, TaskResult taskResult) {
        NfcConsumeRecord nfcConsumeRecordE;
        if (v13.h(str)) {
            return new ShangHai(str).o(taskResult);
        }
        ArrayList arrayListA = h0b.a();
        if (taskResult.getResultCode() == 9000) {
            List<Command> commands = taskResult.getContent().getCommands();
            if (!drk.e(commands)) {
                for (Command command : commands) {
                    if (command.getCommand().startsWith(d04.TAG_QUERY_TRANSACTION_DETAIL) && !Pattern.matches("0{46}9000", command.getResult()) && (nfcConsumeRecordE = m92.e(command.getResult(), str)) != null) {
                        arrayListA.add(nfcConsumeRecordE);
                    }
                }
            }
        }
        return arrayListA;
    }
}
