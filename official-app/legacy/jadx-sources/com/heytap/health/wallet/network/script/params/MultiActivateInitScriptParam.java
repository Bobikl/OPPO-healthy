package com.heytap.health.wallet.network.script.params;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.f04;
import com.oplus.aiunit.vision.j7l;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007¢\u0006\u0002\u0010\bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\n\"\u0004\b\u0015\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/heytap/health/wallet/network/script/params/MultiActivateInitScriptParam;", "", j7l.KEY_CPLC, "", "multiActiveType", f04.JSON_KEY_RKE_ACTION_TYPE, "instanceIdList", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getActionType", "()Ljava/lang/String;", "setActionType", "(Ljava/lang/String;)V", "getCplc", "setCplc", "", "getInstanceIdList", "()Ljava/util/List;", "setInstanceIdList", "(Ljava/util/List;)V", "getMultiActiveType", "setMultiActiveType", "commonlib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MultiActivateInitScriptParam {

    @Nullable
    private String actionType;

    @Nullable
    private String cplc;

    @Nullable
    private List<String> instanceIdList;

    @Nullable
    private String multiActiveType;

    public MultiActivateInitScriptParam(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable List<String> list) {
        this.cplc = str;
        this.multiActiveType = str2;
        this.instanceIdList = list;
        this.actionType = str3;
    }

    @Nullable
    public final String getActionType() {
        return this.actionType;
    }

    @Nullable
    public final String getCplc() {
        return this.cplc;
    }

    @Nullable
    public final List<String> getInstanceIdList() {
        return this.instanceIdList;
    }

    @Nullable
    public final String getMultiActiveType() {
        return this.multiActiveType;
    }

    public final void setActionType(@Nullable String str) {
        this.actionType = str;
    }

    public final void setCplc(@Nullable String str) {
        this.cplc = str;
    }

    public final void setInstanceIdList(@Nullable List<String> list) {
        this.instanceIdList = list;
    }

    public final void setMultiActiveType(@Nullable String str) {
        this.multiActiveType = str;
    }
}
