package com.heytap.health.operations.doctor;

import androidx.annotation.Keep;
import com.oplus.deepthinker.sdk.app.aidl.eventfountain.TriggerEvent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/heytap/health/operations/doctor/AlipayUserBean;", "", "accessToken", "", TriggerEvent.EXTRA_UID, "(Ljava/lang/String;Ljava/lang/String;)V", "getAccessToken", "()Ljava/lang/String;", "setAccessToken", "(Ljava/lang/String;)V", "getUid", "setUid", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "operations_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class AlipayUserBean {

    @Nullable
    private String accessToken;

    @Nullable
    private String uid;

    public AlipayUserBean(@Nullable String str, @Nullable String str2) {
        this.accessToken = str;
        this.uid = str2;
    }

    public static /* synthetic */ AlipayUserBean copy$default(AlipayUserBean alipayUserBean, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = alipayUserBean.accessToken;
        }
        if ((i & 2) != 0) {
            str2 = alipayUserBean.uid;
        }
        return alipayUserBean.copy(str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAccessToken() {
        return this.accessToken;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUid() {
        return this.uid;
    }

    @NotNull
    public final AlipayUserBean copy(@Nullable String accessToken, @Nullable String uid) {
        return new AlipayUserBean(accessToken, uid);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlipayUserBean)) {
            return false;
        }
        AlipayUserBean alipayUserBean = (AlipayUserBean) other;
        return Intrinsics.areEqual(this.accessToken, alipayUserBean.accessToken) && Intrinsics.areEqual(this.uid, alipayUserBean.uid);
    }

    @Nullable
    public final String getAccessToken() {
        return this.accessToken;
    }

    @Nullable
    public final String getUid() {
        return this.uid;
    }

    public int hashCode() {
        String str = this.accessToken;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.uid;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setAccessToken(@Nullable String str) {
        this.accessToken = str;
    }

    public final void setUid(@Nullable String str) {
        this.uid = str;
    }

    @NotNull
    public String toString() {
        return "AlipayUserBean(accessToken=" + this.accessToken + ", uid=" + this.uid + ")";
    }
}
