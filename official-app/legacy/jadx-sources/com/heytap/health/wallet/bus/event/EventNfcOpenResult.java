package com.heytap.health.wallet.bus.event;

import androidx.annotation.Keep;
import com.heytap.health.wallet.model.NfcCardDetail;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class EventNfcOpenResult {
    private NfcCardDetail detail;
    private int openType;
    private boolean success;

    public EventNfcOpenResult(int i, NfcCardDetail nfcCardDetail) {
        this(i, nfcCardDetail, true);
    }

    public NfcCardDetail getDetail() {
        return this.detail;
    }

    public int getOpenType() {
        return this.openType;
    }

    public boolean getSuccess() {
        return this.success;
    }

    public EventNfcOpenResult(int i, NfcCardDetail nfcCardDetail, boolean z) {
        this.openType = i;
        this.detail = nfcCardDetail;
        this.success = z;
    }
}
