package com.lifesense.plugin.ble.data.tracker;

/* JADX INFO: loaded from: classes5.dex */
public class ATPairConfirmInfo {
    private ATPairConfirmState confirmState;
    private int userNumber;

    public ATPairConfirmInfo(ATPairConfirmState aTPairConfirmState) {
        this.confirmState = aTPairConfirmState;
    }

    public ATPairConfirmState getConfirmState() {
        return this.confirmState;
    }

    public int getUserNumber() {
        return this.userNumber;
    }

    public void setConfirmState(ATPairConfirmState aTPairConfirmState) {
        this.confirmState = aTPairConfirmState;
    }

    public void setUserNumber(int i) {
        this.userNumber = i;
    }

    public String toString() {
        return "ATPairConfirmInfo [confirmState=" + this.confirmState + ", userNumber=" + this.userNumber + "]";
    }
}
