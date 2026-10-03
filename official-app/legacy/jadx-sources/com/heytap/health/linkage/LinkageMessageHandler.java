package com.heytap.health.linkage;

import android.content.Context;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.heytap.health.devicemanager.client.impl.arouter.DMIMessageHandler;
import com.heytap.health.linkage.watch.WatchController;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.i37;
import com.oplus.aiunit.vision.jya;
import com.oplus.aiunit.vision.yxa;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;

/* JADX INFO: loaded from: classes16.dex */
@Route(path = "/linkage/sync")
public class LinkageMessageHandler extends DMIMessageHandler {

    public class a implements Runnable {
        public final /* synthetic */ String i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ MessageEvent f4896j;

        public a(String str, MessageEvent messageEvent) {
            this.i = str;
            this.f4896j = messageEvent;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!yxa.c(b78.a())) {
                a7b.b("LA.LinkageMessage", "LinkageApp init fail");
                return;
            }
            yxa.g(this);
            WatchController watchControllerB = jya.a().b();
            if (watchControllerB == null) {
                a7b.f("LA.LinkageMessage", "[onMessageReceived] --> watchController == null");
            } else {
                watchControllerB.J(this.i, this.f4896j);
            }
        }
    }

    @Override // com.heytap.health.devicemanager.client.impl.arouter.DMIMessageHandler
    public void onCreate(Context context) {
    }

    @Override // com.heytap.health.devicemanager.client.impl.arouter.DMIMessageHandler
    public void onMessageReceived(String str, MessageEvent messageEvent) {
        if (messageEvent == null) {
            a7b.f("LA.LinkageMessage", "[onMessageReceived] --> messageEvent == null");
            return;
        }
        a7b.f("LA.LinkageMessage", "[onMessageReceived] --> cid = " + messageEvent.getCommandId());
        if (i37.b()) {
            return;
        }
        yxa.b(new a(str, messageEvent));
    }
}
