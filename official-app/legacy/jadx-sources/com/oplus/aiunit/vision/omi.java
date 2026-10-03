package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.Intent;
import com.heytap.mcssdk.PushService;
import com.heytap.mcssdk.constant.MessageConstant$CommandId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class omi {
    public static boolean a(Context context) {
        String strL = PushService.j().l(context);
        return mrk.f(context, strL) && mrk.c(context, strL) >= 1017;
    }

    public static boolean b(Context context, List<com.heytap.msp.push.mode.c> list) {
        LinkedList linkedList = new LinkedList();
        linkedList.addAll(list);
        cpm.a("isSupportStatisticByMcs:" + a(context) + ",list size:" + linkedList.size());
        if (linkedList.size() <= 0 || !a(context)) {
            return false;
        }
        return c(context, linkedList);
    }

    public static boolean c(Context context, List<com.heytap.msp.push.mode.c> list) {
        try {
            Intent intent = new Intent();
            intent.setAction(PushService.j().t(context));
            intent.setPackage(PushService.j().l(context));
            intent.putExtra("appPackage", context.getPackageName());
            intent.putExtra("type", MessageConstant$CommandId.COMMAND_STATISTIC);
            intent.putExtra("count", list.size());
            ArrayList<String> arrayList = new ArrayList<>();
            Iterator<com.heytap.msp.push.mode.c> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().i());
            }
            intent.putStringArrayListExtra("list", arrayList);
            context.startService(intent);
            return true;
        } catch (Exception e2) {
            cpm.c("statisticMessage--Exception" + e2.getMessage());
            return false;
        }
    }
}
