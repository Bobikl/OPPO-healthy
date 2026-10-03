package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.heytap.health.wallet.bean.Command;
import com.heytap.health.wallet.bean.Content;
import com.heytap.health.wallet.bean.TaskResult;
import com.oppo.wear.wallet.proto.APDUTransmit$APDUTransmitMessage;
import com.oppo.wear.wallet.proto.ChannelManger$OpenChannelReplyMessage;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes18.dex */
public abstract class y60<T> extends mz0<T> {
    private ydc mTransmitManager = ydc.n();

    public TaskResult execCommand(Content content, boolean z) {
        String string;
        boolean z2;
        TaskResult taskResult = new TaskResult();
        StringBuilder sb = new StringBuilder();
        vak vakVar = new vak();
        this.mTransmitManager.l(sb);
        if (TextUtils.isEmpty(sb.toString())) {
            t6b.f("BaseApduJob", "basicChannel == null");
            ydc ydcVar = this.mTransmitManager;
            string = d04.DEFAULT_AID;
            ydcVar.D(d04.DEFAULT_AID, 1, vakVar, z);
        } else {
            string = sb.toString();
        }
        if (content.isValid()) {
            String str = com.alipay.sdk.m.u.h.i;
            boolean z3 = true;
            int i = 0;
            while (true) {
                if (i >= content.getCommands().size()) {
                    z2 = z3;
                    break;
                }
                Command command = content.getCommands().get(i);
                if (!command.getCommand().startsWith(d04.TAG_AID_BIG) && !command.getCommand().startsWith(d04.TAG_AID_SMALL)) {
                    t6b.b("BaseApduJob", "exec command :" + command.getCommand());
                    t6b.b("BaseApduJob", "exec command aid  :" + string);
                    vak vakVar2 = new vak();
                    this.mTransmitManager.O(command.getIndex(), e1j.e(command.getCommand()), string, vakVar2);
                    APDUTransmit$APDUTransmitMessage aPDUTransmit$APDUTransmitMessageA = vakVar2.a();
                    if (aPDUTransmit$APDUTransmitMessageA != null) {
                        String strR = e1j.r(aPDUTransmit$APDUTransmitMessageA.getWalletChannelAPDU().toByteArray());
                        t6b.b("BaseApduJob", "exec command result:" + strR);
                        if (!TextUtils.isEmpty(strR)) {
                            command.setResult(strR);
                            String checker = command.getChecker();
                            if (TextUtils.isEmpty(checker)) {
                                t6b.b("BaseApduJob", "no need use regex");
                                if (strR.endsWith("9000")) {
                                    t6b.b("BaseApduJob", "no need use regex judge and response : " + strR);
                                } else {
                                    t6b.i("BaseApduJob", "no need use regex judge but response : " + strR);
                                    str = "no need use regex judge but response : " + strR;
                                }
                            } else {
                                t6b.b("BaseApduJob", "apdu response need match regex ");
                                if (Pattern.matches(checker, strR)) {
                                    t6b.b("BaseApduJob", "apdu response match regex successfully! regex --> " + checker);
                                } else {
                                    t6b.i("BaseApduJob", "apdu response match regex failed! regex --> " + checker);
                                    str = "apdu response match regex failed! regex --> " + checker;
                                }
                            }
                        }
                    } else {
                        t6b.i("BaseApduJob", "transmitAPDU = null");
                        command.setResult(null);
                        str = "APDU Transmit no Response";
                    }
                    z2 = false;
                    break;
                }
                this.mTransmitManager.H();
                String strSubstring = command.getCommand().substring(10, (Integer.parseInt(command.getCommand().substring(8, 10), 16) * 2) + 10);
                t6b.f("BaseApduJob", "new channel -> " + strSubstring);
                this.mTransmitManager.D(strSubstring, 1, vakVar, z);
                ChannelManger$OpenChannelReplyMessage channelManger$OpenChannelReplyMessageB = vakVar.b();
                if (channelManger$OpenChannelReplyMessageB != null) {
                    t6b.b("BaseApduJob", "new channel -> reponse " + e1j.r(channelManger$OpenChannelReplyMessageB.getWalletResponseAPDU().toByteArray()));
                    command.setResult(e1j.r(channelManger$OpenChannelReplyMessageB.getWalletResponseAPDU().toByteArray()));
                } else {
                    t6b.f("BaseApduJob", "new channel = null ");
                    command.setResult(null);
                    str = "channel is null";
                    z3 = false;
                }
                string = strSubstring;
                i++;
            }
            t6b.f("BaseApduJob", "excuteApdu  success: " + z2);
            taskResult.setContent(content);
            if (z2) {
                taskResult.setResultMsg("success");
                taskResult.setResultCode(9000);
                content.setSucceed(Boolean.TRUE);
            } else {
                taskResult.setResultMsg(str);
                taskResult.setResultCode(d04.COMMANDS_EXECUTE_FAILED);
                content.setSucceed(Boolean.FALSE);
            }
        }
        return taskResult;
    }
}
