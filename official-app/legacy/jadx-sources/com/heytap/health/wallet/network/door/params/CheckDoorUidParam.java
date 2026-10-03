package com.heytap.health.wallet.network.door.params;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.j7l;
import com.oplus.deepthinker.sdk.app.aidl.eventfountain.TriggerEvent;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/heytap/health/wallet/network/door/params/CheckDoorUidParam;", "", "()V", j7l.KEY_CPLC, "", "getCplc", "()Ljava/lang/String;", "setCplc", "(Ljava/lang/String;)V", TriggerEvent.EXTRA_UID, "getUid", "setUid", "voucher", "getVoucher", "setVoucher", "commonlib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CheckDoorUidParam {

    @Nullable
    private String cplc;

    @Nullable
    private String uid;

    @Nullable
    private String voucher;

    @Nullable
    public final String getCplc() {
        return this.cplc;
    }

    @Nullable
    public final String getUid() {
        return this.uid;
    }

    @Nullable
    public final String getVoucher() {
        return this.voucher;
    }

    public final void setCplc(@Nullable String str) {
        this.cplc = str;
    }

    public final void setUid(@Nullable String str) {
        this.uid = str;
    }

    public final void setVoucher(@Nullable String str) {
        this.voucher = str;
    }
}
