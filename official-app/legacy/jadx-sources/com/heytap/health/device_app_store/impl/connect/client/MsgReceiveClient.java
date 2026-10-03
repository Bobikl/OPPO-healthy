package com.heytap.health.device_app_store.impl.connect.client;

import android.content.Context;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.heytap.health.device_app_store.impl.connect.client.MsgReceiveClient;
import com.heytap.health.devicemanager.client.impl.arouter.DMIMessageHandler;
import com.heytap.health.watch.watchapp.proto.WatchAppProto$AppCommandMsg;
import com.oplus.aiunit.vision.bdd;
import com.oplus.aiunit.vision.be0;
import com.oplus.aiunit.vision.ccd;
import com.oplus.aiunit.vision.lbd;
import com.oplus.aiunit.vision.o14;
import com.oplus.aiunit.vision.s5l;
import com.oplus.aiunit.vision.su8;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Route(path = "/device_app_store/WatchAppMessageReceiveClient")
public class MsgReceiveClient extends DMIMessageHandler {
    public static final String TAG = "WatchAppMsgReceiveClient";
    public be0 i;

    public static /* synthetic */ void Q6(Throwable th) throws Throwable {
        s5l.g(TAG, "[dispatchMessage] throwable = " + th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void db(WatchAppProto$AppCommandMsg watchAppProto$AppCommandMsg) throws Throwable {
        this.i.g(watchAppProto$AppCommandMsg);
    }

    public static /* synthetic */ void q6(MessageEvent messageEvent, ccd ccdVar) throws Throwable {
        ccdVar.onNext(WatchAppProto$AppCommandMsg.parseFrom(messageEvent.getData()));
        ccdVar.onComplete();
    }

    @NotNull
    public final o14<Throwable> eb() {
        return new o14() { // from class: com.oplus.aiunit.vision.q6c
            @Override // com.oplus.aiunit.vision.o14
            public final void accept(Object obj) throws Throwable {
                MsgReceiveClient.Q6((Throwable) obj);
            }
        };
    }

    @NotNull
    public final o14<WatchAppProto$AppCommandMsg> fb() {
        return new o14() { // from class: com.oplus.aiunit.vision.r6c
            @Override // com.oplus.aiunit.vision.o14
            public final void accept(Object obj) throws Throwable {
                this.i.db((WatchAppProto$AppCommandMsg) obj);
            }
        };
    }

    public final void l3(final MessageEvent messageEvent) {
        lbd.w(new bdd() { // from class: com.oplus.aiunit.vision.p6c
            @Override // com.oplus.aiunit.vision.bdd
            public final void a(ccd ccdVar) throws Throwable {
                MsgReceiveClient.q6(messageEvent, ccdVar);
            }
        }).L0(su8.f()).n0(su8.c()).b(fb(), eb());
    }

    @Override // com.heytap.health.devicemanager.client.impl.arouter.DMIMessageHandler
    public void onCreate(Context context) {
        this.i = be0.e();
    }

    @Override // com.heytap.health.devicemanager.client.impl.arouter.DMIMessageHandler
    public void onMessageReceived(String str, MessageEvent messageEvent) {
        s5l.a(TAG, "[dispatchMessage] receive msg,messageEvent " + messageEvent);
        if (messageEvent == null || messageEvent.getServiceId() != 267) {
            s5l.g(TAG, "[onMessageReceived] --> messageEvent = null or service id is not 267");
        } else {
            l3(messageEvent);
        }
    }
}
