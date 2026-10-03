package com.oplus.aiunit.vision;

import com.heytap.health.wallet.bean.Command;
import com.heytap.health.wallet.bean.TaskResult;
import com.heytap.wallet.business.bus.bean.NfcConsumeRecord;
import com.heytap.wallet.business.bus.bean.TrafficCardInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
@Deprecated
public abstract class j3 implements l92 {
    public String a = "AbsBusConfig";

    public static String c(String str) {
        return e1j.o(str.length() / 2).toUpperCase();
    }

    public static String e(String str) {
        return d04.TAG_AID_BIG + c(str) + str;
    }

    public int b(List<Command> list, String[] strArr, int i, String str) {
        if (strArr == null) {
            t6b.b(this.a, "genCommands failed");
            return 0;
        }
        for (int i2 = 0; i2 < strArr.length; i2++) {
            list.add(g(strArr[i2], i + i2, str));
        }
        return strArr.length;
    }

    public List<Command> d(String[] strArr, String str) {
        ArrayList arrayList = new ArrayList(15);
        if (strArr != null) {
            int iB = 0;
            for (int i = 0; i < strArr.length; i++) {
                String str2 = strArr[i];
                if (z60.OPCODES_DEFAULT_SELECT.equals(str2)) {
                    arrayList.add(g(f(), iB + i, str));
                } else if (str2.startsWith(z60.OP_TRANS_PRE)) {
                    iB += b(arrayList, z60.OPCODES_SET.get(str2), iB + i, str);
                } else {
                    arrayList.add(g(str2, iB + i, str));
                }
            }
        } else {
            t6b.b(this.a, "get command failed");
        }
        return arrayList;
    }

    public final String f() {
        return e(getAid());
    }

    public Command g(String str, int i, String str2) {
        Command command = new Command();
        command.setCommand(str);
        command.setChecker(str2);
        command.setIndex(String.valueOf(i));
        return command;
    }

    public abstract TrafficCardInfo h(TaskResult taskResult);

    public abstract String i(String str);

    public abstract String j(String str);

    public abstract ArrayList<NfcConsumeRecord> k(TaskResult taskResult);

    public TrafficCardInfo l(TaskResult taskResult) {
        try {
            return h(taskResult);
        } catch (Exception e2) {
            t6b.d(this.a, Thread.currentThread().getStackTrace()[1].getMethodName() + e2.getMessage());
            return null;
        }
    }

    public final String m(String str) {
        try {
            return i(str);
        } catch (Exception e2) {
            t6b.d(this.a, Thread.currentThread().getStackTrace()[1].getMethodName() + e2.getMessage());
            return null;
        }
    }

    public final String n(String str) {
        try {
            return j(str);
        } catch (Exception e2) {
            t6b.d(this.a, Thread.currentThread().getStackTrace()[1].getMethodName() + e2.getMessage());
            return null;
        }
    }

    public ArrayList<NfcConsumeRecord> o(TaskResult taskResult) {
        try {
            return k(taskResult);
        } catch (Exception e2) {
            t6b.d(this.a, Thread.currentThread().getStackTrace()[1].getMethodName() + e2.getMessage());
            return null;
        }
    }
}
