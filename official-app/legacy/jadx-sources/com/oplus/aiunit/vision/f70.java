package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.heytap.health.wallet.bean.Command;
import com.heytap.health.wallet.bean.Content;
import com.heytap.health.wallet.bean.TaskResult;
import com.oppo.wear.wallet.proto.APDUTransmit$APDUTransmitMessage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes18.dex */
public class f70 {
    public static final String DEFAULT_NO_ACTIVITE_AID = "no_activite_aid";
    public static final int INVALID_TECH_MASK = -1;

    public static String a(String str, String str2) {
        int length = str2.length() / 2;
        String strO = e1j.o(length);
        t6b.b("ApduUtils", "aid length -> " + length);
        t6b.b("ApduUtils", "aid length in hex -> " + strO);
        return str + e1j.o(length + 2).toUpperCase() + "4F" + strO.toUpperCase() + str2;
    }

    public static Content b(String str, String str2) {
        Content content = new Content();
        ArrayList arrayList = new ArrayList();
        Command command = new Command();
        command.setIndex("0");
        command.setCommand(d04.ACTIVATE_CARD_CHANNNEL);
        Command command2 = new Command();
        command2.setIndex("1");
        command2.setCommand(a(str, str2));
        arrayList.add(command);
        arrayList.add(command2);
        content.setCommands(arrayList);
        return content;
    }

    public static boolean c(String str, String str2) {
        String str3 = str + "9F70";
        int iIndexOf = str2.indexOf(str3);
        if (iIndexOf <= -1) {
            t6b.b("ApduUtils", "do not find aid+9F70 -> " + str);
            return false;
        }
        String strSubstring = str2.substring(iIndexOf, str3.length() + iIndexOf + 6);
        t6b.b("ApduUtils", "key data -> " + strSubstring);
        if (strSubstring.endsWith("01")) {
            j7l.K(str);
            t6b.b("ApduUtils", "activated aid -> " + str);
            return true;
        }
        if (strSubstring.endsWith("00")) {
            t6b.b("ApduUtils", "unactivated aid -> " + str);
            return false;
        }
        t6b.b("ApduUtils", "unresolved aid -> " + str);
        return false;
    }

    public static TaskResult d() {
        String strR;
        TaskResult taskResult = new TaskResult();
        taskResult.setResultCode(9000);
        taskResult.setResultMsg("success");
        Content content = new Content();
        content.setSucceed(Boolean.TRUE);
        ArrayList arrayList = new ArrayList();
        content.setCommands(arrayList);
        taskResult.setContent(content);
        t6b.h("executeCheckAllCardStatusApdus");
        String[] strArr = d04.CHECK_ALL_CARD_STATUS;
        String strSubstring = strArr[0].substring(10);
        vak vakVar = new vak();
        ydc.n().D(strSubstring, 1, vakVar, false);
        if (vakVar.b() != null) {
            try {
                String str = strArr[1];
                int i = -1;
                while (true) {
                    Command command = new Command();
                    command.setCommand(str);
                    t6b.i("ApduUtils", "exec command -> " + command.getCommand());
                    vak vakVar2 = new vak();
                    ydc.n().O("", e1j.e(command.getCommand()), strSubstring, vakVar2);
                    APDUTransmit$APDUTransmitMessage aPDUTransmit$APDUTransmitMessageA = vakVar2.a();
                    t6b.b("ApduUtils", "apduTransmitMessage " + aPDUTransmit$APDUTransmitMessageA);
                    if (e1j.l(aPDUTransmit$APDUTransmitMessageA.getWalletChannelId())) {
                        t6b.i("ApduUtils", "the [walletChannelId] field is empty");
                        strR = null;
                    } else {
                        strR = e1j.r(aPDUTransmit$APDUTransmitMessageA.getWalletChannelAPDU().toByteArray());
                        t6b.f("ApduUtils", "exec command result -> " + strR);
                    }
                    command.setResult(strR);
                    arrayList.add(command);
                    String str2 = d04.CHECK_ALL_CARD_STATUS[2];
                    i++;
                    if (TextUtils.isEmpty(strR) || !Pattern.matches(".*(6310)$", strR) || i >= 20) {
                        break;
                        break;
                        break;
                    }
                    str = str2;
                }
                if (i >= 20) {
                    t6b.h("except end executeCheckAllCardStatusApdus tms");
                }
                if (TextUtils.isEmpty(strR) || !Pattern.matches(".*(9000)$", strR)) {
                    taskResult.setResultCode(d04.COMMANDS_EXECUTE_FAILED);
                    taskResult.setResultMsg("exec failed");
                } else {
                    taskResult.setResultCode(9000);
                    taskResult.setResultMsg("exec success");
                }
            } catch (Exception e2) {
                t6b.d("ApduUtils", Thread.currentThread().getStackTrace()[1].getMethodName() + e2.getMessage());
                taskResult.setResultCode(d04.COMMANDS_EXECUTE_FAILED);
                taskResult.setResultMsg("exec failed");
                t6b.c(e2.getMessage());
            }
        } else {
            taskResult.setResultCode(d04.COMMANDS_EXECUTE_FAILED);
            taskResult.setResultMsg("exec failed");
            t6b.d("ApduUtils", "replyMessage = null");
        }
        t6b.h("end executeCheckAllCardStatusApdus");
        return taskResult;
    }

    public static String e(int i) {
        if (i == 1) {
            return "issuecard";
        }
        if (i == 3) {
            return "issueTopup";
        }
        if (i != 4) {
            return i != 5 ? "topup" : "shiftin";
        }
        return "shiftout";
    }

    public static String f(List<Command> list) {
        if (drk.e(list)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator<Command> it = list.iterator();
        while (it.hasNext()) {
            String result = it.next().getResult();
            sb.append(result.substring(0, result.length() - 4));
        }
        String string = sb.toString();
        t6b.b("ApduUtils", "parserDefaultAid final result -> " + string);
        return g(string);
    }

    public static String g(String str) {
        String str2 = "no_activite_aid";
        if (!TextUtils.isEmpty(str)) {
            for (String str3 : fs.b().a()) {
                if (c(str3, str)) {
                    str2 = str3;
                    break;
                }
            }
        } else {
            t6b.b("ApduUtils", "apdu is null");
        }
        t6b.i("ApduUtils", "phraseActivatedCard : " + str2);
        j7l.K(str2);
        return str2;
    }
}
