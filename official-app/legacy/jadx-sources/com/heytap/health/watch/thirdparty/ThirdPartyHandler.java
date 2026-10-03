package com.heytap.health.watch.thirdparty;

import android.annotation.SuppressLint;
import android.content.Context;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.heytap.health.devicemanager.client.impl.arouter.DMIMessageHandler;
import com.heytap.wearable.oms.base.message.MessageManager;
import com.heytap.wearable.oms.common.Status;
import com.oplus.aiunit.vision.ovj;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Route(path = "/thirdparty/message")
public class ThirdPartyHandler extends DMIMessageHandler {
    public MessageManager i;

    public class a extends MessageManager {
        public a() {
        }

        @Override // com.oplus.aiunit.vision.sx9
        @NotNull
        public Status a(@NotNull String str, @NotNull MessageEvent messageEvent) {
            return ovj.d().f(messageEvent);
        }
    }

    @Override // com.heytap.health.devicemanager.client.impl.arouter.DMIMessageHandler
    public void onCreate(Context context) {
        this.i = new a();
    }

    @Override // com.heytap.health.devicemanager.client.impl.arouter.DMIMessageHandler
    @SuppressLint({"CheckResult"})
    public void onMessageReceived(String str, MessageEvent messageEvent) {
        this.i.f(str, 17, messageEvent.getCommandId(), messageEvent.getData());
    }
}
