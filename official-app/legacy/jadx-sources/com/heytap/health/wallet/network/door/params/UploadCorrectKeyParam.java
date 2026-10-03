package com.heytap.health.wallet.network.door.params;

import androidx.annotation.Keep;
import com.heytap.health.wallet.bean.SmartSecretKey;
import com.oplus.aiunit.vision.j7l;
import com.oplus.deepthinker.sdk.app.aidl.eventfountain.TriggerEvent;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B'\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tB1\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u001b\u001a\u00020\u001c2\b\u0010\n\u001a\u0004\u0018\u00010\u0003R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/heytap/health/wallet/network/door/params/UploadCorrectKeyParam;", "", TriggerEvent.EXTRA_UID, "", "smartSecretKeys", "", "Lcom/heytap/health/wallet/bean/SmartSecretKey;", "inverseKeySuc", "", "(Ljava/lang/String;Ljava/util/List;Z)V", "addressInfo", "(Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;)V", j7l.KEY_CPLC, "getCplc", "()Ljava/lang/String;", "setCplc", "(Ljava/lang/String;)V", "getInverseKeySuc", "()Z", "setInverseKeySuc", "(Z)V", "getSmartSecretKeys", "()Ljava/util/List;", "setSmartSecretKeys", "(Ljava/util/List;)V", "getUid", "setUid", "setAddressInfo", "", "commonlib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class UploadCorrectKeyParam {

    @Nullable
    private String addressInfo;

    @Nullable
    private String cplc;
    private boolean inverseKeySuc;

    @Nullable
    private List<SmartSecretKey> smartSecretKeys;

    @NotNull
    private String uid;

    public UploadCorrectKeyParam(@NotNull String uid, @Nullable List<SmartSecretKey> list, boolean z) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        this.smartSecretKeys = list;
        this.uid = uid;
        this.inverseKeySuc = z;
    }

    @Nullable
    public final String getCplc() {
        return this.cplc;
    }

    public final boolean getInverseKeySuc() {
        return this.inverseKeySuc;
    }

    @Nullable
    public final List<SmartSecretKey> getSmartSecretKeys() {
        return this.smartSecretKeys;
    }

    @NotNull
    public final String getUid() {
        return this.uid;
    }

    public final void setAddressInfo(@Nullable String addressInfo) {
        this.addressInfo = addressInfo;
    }

    public final void setCplc(@Nullable String str) {
        this.cplc = str;
    }

    public final void setInverseKeySuc(boolean z) {
        this.inverseKeySuc = z;
    }

    public final void setSmartSecretKeys(@Nullable List<SmartSecretKey> list) {
        this.smartSecretKeys = list;
    }

    public final void setUid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.uid = str;
    }

    public UploadCorrectKeyParam(@NotNull String uid, @Nullable List<SmartSecretKey> list, boolean z, @Nullable String str) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        this.smartSecretKeys = list;
        this.uid = uid;
        this.inverseKeySuc = z;
        this.addressInfo = str;
    }
}
