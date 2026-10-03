package com.lifesense.android.bluetooth.core.bean;

import com.lifesense.android.bluetooth.core.bean.constant.PairedConfirmState;

/* JADX INFO: loaded from: classes4.dex */
public class PairedConfirmInfo {
    public PairedConfirmState confirmState;
    public int userNumber;

    public PairedConfirmInfo(PairedConfirmState pairedConfirmState) {
        this.confirmState = pairedConfirmState;
    }

    public boolean canEqual(Object obj) {
        return obj instanceof PairedConfirmInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PairedConfirmInfo)) {
            return false;
        }
        PairedConfirmInfo pairedConfirmInfo = (PairedConfirmInfo) obj;
        if (!pairedConfirmInfo.canEqual(this)) {
            return false;
        }
        PairedConfirmState confirmState = getConfirmState();
        PairedConfirmState confirmState2 = pairedConfirmInfo.getConfirmState();
        if (confirmState != null ? confirmState.equals(confirmState2) : confirmState2 == null) {
            return getUserNumber() == pairedConfirmInfo.getUserNumber();
        }
        return false;
    }

    public PairedConfirmState getConfirmState() {
        return this.confirmState;
    }

    public int getUserNumber() {
        return this.userNumber;
    }

    public int hashCode() {
        PairedConfirmState confirmState = getConfirmState();
        return (((confirmState == null ? 43 : confirmState.hashCode()) + 59) * 59) + getUserNumber();
    }

    public void setConfirmState(PairedConfirmState pairedConfirmState) {
        this.confirmState = pairedConfirmState;
    }

    public void setUserNumber(int i) {
        this.userNumber = i;
    }

    public String toString() {
        return "PairedConfirmInfo(confirmState=" + getConfirmState() + ", userNumber=" + getUserNumber() + ")";
    }
}
