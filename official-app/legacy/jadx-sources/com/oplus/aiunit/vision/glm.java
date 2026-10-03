package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.Intent;
import com.heytap.mcssdk.PushService;
import com.heytap.msp.push.callback.IDataMessageCallBackService;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class glm {
    public static void a(Context context, Intent intent, IDataMessageCallBackService iDataMessageCallBackService) {
        String str;
        if (context == null) {
            str = "context is null , please check param of parseIntent()";
        } else if (intent == null) {
            str = "intent is null , please check param of parseIntent()";
        } else if (iDataMessageCallBackService == null) {
            str = "callback is null , please check param of parseIntent()";
        } else {
            if (mrk.h(context)) {
                List<com.heytap.msp.push.mode.a> listB = hlm.b(context, intent);
                if (listB == null) {
                    return;
                }
                for (com.heytap.msp.push.mode.a aVar : listB) {
                    if (aVar != null) {
                        for (ilm ilmVar : PushService.j().p()) {
                            if (ilmVar != null) {
                                ilmVar.a(context, aVar, iDataMessageCallBackService);
                            }
                        }
                    }
                }
                return;
            }
            str = "push is null ,please check system has push";
        }
        cpm.c(str);
    }
}
