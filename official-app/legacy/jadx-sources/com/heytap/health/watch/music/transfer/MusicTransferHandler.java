package com.heytap.health.watch.music.transfer;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.heytap.health.base.task.ThreadUtils;
import com.heytap.health.devicemanager.client.impl.arouter.DMIMessageHandler;
import com.heytap.health.watch.music.transfer.MusicTransferHandler;
import com.heytap.wearable.music.proto.MusicProto$MusicTransErrorCode;
import com.heytap.wearable.music.proto.MusicProto$RspMusicFiles;
import com.heytap.wearable.music.proto.MusicProto$RspSyncMusicBook;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.mc7;
import com.oplus.aiunit.vision.qac;
import com.oplus.aiunit.vision.zti;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;

/* JADX INFO: loaded from: classes19.dex */
@Route(path = "/music/transfer")
public class MusicTransferHandler extends DMIMessageHandler {
    public static /* synthetic */ void h1(String str, mc7 mc7Var) {
        qac.F(str).Y(mc7Var);
    }

    @Override // com.heytap.health.devicemanager.client.impl.arouter.DMIMessageHandler
    public void onMessageReceived(String str, MessageEvent messageEvent) {
        a7b.m("MusicTransferHandler", "onMessageReceived messageEvent = [" + messageEvent + "]");
        switch (messageEvent.getCommandId()) {
            case 10:
                try {
                    MusicProto$MusicTransErrorCode from = MusicProto$MusicTransErrorCode.parseFrom(messageEvent.getData());
                    if (from.getErrorCode() == 100000) {
                        qac.F(str).i0();
                    } else {
                        a7b.m("MusicTransferHandler", "requesting transfer file returns error: " + from.getErrorCode());
                        qac.F(str).r();
                    }
                } catch (Exception e2) {
                    a7b.b("MusicTransferHandler", "onMessageReceived MUSIC_TRANSFER_REQUEST with exception" + e2.getMessage());
                    return;
                }
                break;
            case 11:
            case 13:
                try {
                    MusicProto$RspMusicFiles from2 = MusicProto$RspMusicFiles.parseFrom(messageEvent.getData());
                    qac.F(str).a0(from2);
                    if (from2.getDataIndex() == from2.getPackTotal()) {
                        zti.a();
                    }
                } catch (Exception e3) {
                    a7b.b("MusicTransferHandler", "onMessageReceived SYNC_MUSIC_LIST_INFO with exception" + e3.getMessage());
                    return;
                }
                break;
            case 14:
            case 15:
                try {
                    qac.F(str).b0(MusicProto$RspSyncMusicBook.parseFrom(messageEvent.getData()));
                } catch (Exception e4) {
                    a7b.b("MusicTransferHandler", "onMessageReceived SYNC_PLAY_LIST_INFO with exception" + e4.getMessage());
                    return;
                }
                break;
        }
    }

    @Override // com.heytap.health.devicemanager.client.impl.arouter.DMIMessageHandler
    public void onProgressChanged(String str, mc7 mc7Var) {
        StringBuilder sb = new StringBuilder();
        sb.append("onProgressChanged with progress: ");
        sb.append(mc7Var.f());
        qac.F(str).W(mc7Var);
        super.onProgressChanged(str, mc7Var);
    }

    @Override // com.heytap.health.devicemanager.client.impl.arouter.DMIMessageHandler
    public void onTransferCompleted(final String str, final mc7 mc7Var) {
        StringBuilder sb = new StringBuilder();
        sb.append("onTransferCompleted with status: ");
        sb.append(mc7Var.a());
        ThreadUtils.doInBackground(new Runnable() { // from class: com.oplus.aiunit.vision.zcc
            @Override // java.lang.Runnable
            public final void run() {
                MusicTransferHandler.h1(str, mc7Var);
            }
        });
        super.onTransferCompleted(str, mc7Var);
    }

    @Override // com.heytap.health.devicemanager.client.impl.arouter.DMIMessageHandler
    public void onTransferRequested(String str, mc7 mc7Var) {
        super.onTransferRequested(str, mc7Var);
    }
}
