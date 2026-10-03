package com.heytap.health.wallet.network.door.params;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.j7l;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/heytap/health/wallet/network/door/params/NeedDeleteDoorCardListParam;", "", "()V", j7l.KEY_CPLC, "", "getCplc", "()Ljava/lang/String;", "setCplc", "(Ljava/lang/String;)V", "isDelete", "", "()Z", "setDelete", "(Z)V", "commonlib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class NeedDeleteDoorCardListParam {

    @Nullable
    private String cplc;
    private boolean isDelete;

    @Nullable
    public final String getCplc() {
        return this.cplc;
    }

    /* JADX INFO: renamed from: isDelete, reason: from getter */
    public final boolean getIsDelete() {
        return this.isDelete;
    }

    public final void setCplc(@Nullable String str) {
        this.cplc = str;
    }

    public final void setDelete(boolean z) {
        this.isDelete = z;
    }
}
