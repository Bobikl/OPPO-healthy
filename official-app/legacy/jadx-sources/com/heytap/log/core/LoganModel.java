package com.heytap.log.core;

/* JADX INFO: loaded from: classes19.dex */
public class LoganModel {
    Action action;
    boolean isKeyWordFlags = false;
    OnActionCompleteListener listener;
    SendAction sendAction;
    WriteAction writeAction;

    public enum Action {
        WRITE,
        SEND,
        FLUSH
    }

    public interface OnActionCompleteListener {
        void onComplete();
    }

    public boolean isValid() {
        WriteAction writeAction;
        SendAction sendAction;
        Action action = this.action;
        if (action != null) {
            if (action == Action.SEND && (sendAction = this.sendAction) != null && sendAction.isValid()) {
                return true;
            }
            if ((this.action == Action.WRITE && (writeAction = this.writeAction) != null && writeAction.isValid()) || this.action == Action.FLUSH) {
                return true;
            }
        }
        return false;
    }
}
