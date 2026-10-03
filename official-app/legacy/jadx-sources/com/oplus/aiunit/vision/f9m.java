package com.oplus.aiunit.vision;

import android.content.Context;
import com.heytap.mcssdk.PushService;
import com.heytap.mcssdk.constant.MessageConstant$CommandId;
import com.heytap.msp.push.callback.ICallBackResultService;
import com.heytap.msp.push.callback.IDataMessageCallBackService;
import com.heytap.msp.push.callback.IGetAppNotificationCallBackService;
import com.heytap.msp.push.callback.ISetAppNotificationCallBackService;

/* JADX INFO: loaded from: classes19.dex */
public class f9m implements ilm {

    public class a implements Runnable {
        public final /* synthetic */ khm i;

        public a(khm khmVar) {
            this.i = khmVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            f9m.this.c(this.i, PushService.j());
        }
    }

    @Override // com.oplus.aiunit.vision.ilm
    public void a(Context context, com.heytap.msp.push.mode.a aVar, IDataMessageCallBackService iDataMessageCallBackService) {
        if (aVar != null && aVar.a() == 4105) {
            khm khmVar = (khm) aVar;
            cpm.a("mcssdk-CallBackResultProcessor:" + khmVar.toString());
            hum.a(new a(khmVar));
        }
    }

    public final void c(khm khmVar, PushService pushService) {
        int i;
        String str;
        if (khmVar == null) {
            str = "message is null , please check param of parseCommandMessage(2)";
        } else if (pushService == null) {
            str = "pushService is null , please check param of parseCommandMessage(2)";
        } else {
            if (pushService.q() != null) {
                int iF = khmVar.f();
                if (iF == 12287) {
                    ICallBackResultService iCallBackResultServiceQ = pushService.q();
                    if (iCallBackResultServiceQ != null) {
                        iCallBackResultServiceQ.onError(khmVar.j(), khmVar.h(), khmVar.m(), khmVar.l());
                        return;
                    }
                    return;
                }
                if (iF == 12298) {
                    pushService.q().onSetPushTime(khmVar.j(), khmVar.h());
                    return;
                }
                if (iF == 12306) {
                    pushService.q().onGetPushStatus(khmVar.j(), mrk.i(khmVar.h()));
                    return;
                }
                if (iF == 12309) {
                    pushService.q().onGetNotificationStatus(khmVar.j(), mrk.i(khmVar.h()));
                    return;
                }
                if (iF == 12289) {
                    if (khmVar.j() == 0) {
                        pushService.C(khmVar.h());
                    }
                    pushService.q().onRegister(khmVar.j(), khmVar.h(), khmVar.m(), khmVar.l());
                    return;
                }
                if (iF == 12290) {
                    pushService.q().onUnRegister(khmVar.j(), khmVar.m(), khmVar.l());
                    return;
                }
                switch (iF) {
                    case MessageConstant$CommandId.COMMAND_APP_NOTIFICATION_OPEN /* 12316 */:
                    case MessageConstant$CommandId.COMMAND_APP_NOTIFICATION_CLOSE /* 12317 */:
                        ISetAppNotificationCallBackService iSetAppNotificationCallBackServiceS = pushService.s();
                        if (iSetAppNotificationCallBackServiceS != null) {
                            iSetAppNotificationCallBackServiceS.onSetAppNotificationSwitch(khmVar.j());
                        }
                        break;
                    case MessageConstant$CommandId.COMMAND_APP_NOTIFICATION_GET /* 12318 */:
                        try {
                            i = Integer.parseInt(khmVar.h());
                        } catch (Exception unused) {
                            i = 0;
                        }
                        IGetAppNotificationCallBackService iGetAppNotificationCallBackServiceR = pushService.r();
                        if (iGetAppNotificationCallBackServiceR != null) {
                            iGetAppNotificationCallBackServiceR.onGetAppNotificationSwitch(khmVar.j(), i);
                        }
                        break;
                }
            }
            str = "pushService.getPushCallback() is null , please check param of parseCommandMessage(2)";
        }
        cpm.c(str);
    }
}
