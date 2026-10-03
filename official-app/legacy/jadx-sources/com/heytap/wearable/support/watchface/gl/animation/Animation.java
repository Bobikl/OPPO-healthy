package com.heytap.wearable.support.watchface.gl.animation;

/* JADX INFO: loaded from: classes2.dex */
public class Animation {
    protected UpdateListener mListener;

    public void onStop() {
        UpdateListener updateListener = this.mListener;
        if (updateListener != null) {
            updateListener.onUpdateEnd();
        }
    }

    public void setListener(UpdateListener updateListener) {
        this.mListener = updateListener;
    }
}
