package com.lifesense.plugin.ble.device.a.a;

import com.lifesense.plugin.ble.data.LSAppCategory;
import com.lifesense.plugin.ble.data.tracker.ATTextMessage;

/* JADX INFO: loaded from: classes5.dex */
class j extends com.lifesense.plugin.ble.device.proto.h {
    final /* synthetic */ g a;

    public j(g gVar) {
        this.a = gVar;
    }

    @Override // com.lifesense.plugin.ble.device.proto.h
    public synchronized void a(String str, com.lifesense.plugin.ble.device.proto.g gVar) {
        if (gVar != null) {
            if (gVar.h()) {
                if ("8000".equalsIgnoreCase(gVar.b())) {
                    String strA = gVar.a();
                    try {
                        if (Integer.toHexString(106).equalsIgnoreCase(strA)) {
                            String strF = gVar.f();
                            LSAppCategory lSAppCategoryC = com.lifesense.plugin.ble.c.c.c(strF);
                            boolean zD = com.lifesense.plugin.ble.c.c.d(strF);
                            if (lSAppCategoryC != null) {
                                ATTextMessage aTTextMessage = new ATTextMessage(lSAppCategoryC);
                                aTTextMessage.setEnable(zD);
                                g.a().a(str, aTTextMessage);
                            }
                        }
                    } catch (Exception e2) {
                        String str2 = "failed to parse message setting results,has exception...>> " + gVar.f();
                        g gVar2 = this.a;
                        gVar2.printLogMessage(gVar2.getAdvancedLogInfo(str, str2, com.lifesense.plugin.ble.b.a.a.Warning_Message, null, false));
                        e2.printStackTrace();
                    }
                    String hexString = Integer.toHexString(180);
                    String hexString2 = Integer.toHexString(249);
                    if (hexString.equalsIgnoreCase(strA)) {
                        return;
                    }
                    if (hexString2.equalsIgnoreCase(strA)) {
                        g gVar3 = this.a;
                        gVar3.printLogMessage(gVar3.getGeneralLogInfo(str, "waiting for resp,cmd=" + strA, com.lifesense.plugin.ble.b.a.a.Callback_Message, null, true));
                        return;
                    }
                    this.a.a(str, strA, 0, true);
                }
            }
        }
    }
}
