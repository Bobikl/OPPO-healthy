package com.lifesense.plugin.ble.device.ancs;

import android.telephony.PhoneStateListener;

/* JADX INFO: loaded from: classes5.dex */
class i extends PhoneStateListener {
    final /* synthetic */ MediaPlayerService a;

    public i(MediaPlayerService mediaPlayerService) {
        this.a = mediaPlayerService;
    }

    @Override // android.telephony.PhoneStateListener
    public void onCallStateChanged(int i, String str) {
        MediaPlayerService.logMessage("onCallStateChanged >>" + i + "; player=" + this.a.mediaPlayer + ";playPermission=" + this.a.playPermission);
        if (this.a.playPermission) {
            if (i == 0) {
                if (this.a.mediaPlayer == null || !this.a.ongoingCall) {
                    return;
                }
                MediaPlayerService.logMessage("onCallStateChanged >> resume mediaPlayer");
                this.a.ongoingCall = false;
                this.a.resumeMedia();
                return;
            }
            if ((i == 1 || i == 2) && this.a.mediaPlayer != null) {
                MediaPlayerService.logMessage("onCallStateChanged >> pause mediaPlayer");
                this.a.pauseMedia();
                this.a.ongoingCall = true;
            }
        }
    }
}
