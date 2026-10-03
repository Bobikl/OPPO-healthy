package com.heytap.health.devicemanager.client.impl.arouter;

import android.content.Context;
import com.alibaba.android.arouter.facade.template.IProvider;
import com.oplus.aiunit.vision.mc7;
import com.oplus.aiunit.vision.ra5;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;

/* JADX INFO: loaded from: classes16.dex */
public class DMIMessageHandler implements IProvider {
    public long getKeepAlive() {
        return 15000L;
    }

    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public void init(Context context) {
        onCreate(context);
    }

    public void onCreate(Context context) {
    }

    public void onDestroy() {
    }

    public void onMessageReceived(ra5 ra5Var, String str, MessageEvent messageEvent) {
    }

    public void onProgressChanged(ra5 ra5Var, String str, mc7 mc7Var) {
    }

    public void onTransferCompleted(ra5 ra5Var, String str, mc7 mc7Var) {
    }

    public void onTransferRequested(ra5 ra5Var, String str, mc7 mc7Var) {
    }

    public void onMessageReceived(String str, MessageEvent messageEvent) {
    }

    public void onProgressChanged(String str, mc7 mc7Var) {
    }

    public void onTransferCompleted(String str, mc7 mc7Var) {
    }

    public void onTransferRequested(String str, mc7 mc7Var) {
    }
}
