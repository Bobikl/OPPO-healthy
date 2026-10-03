package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.esim.R$string;
import com.heytap.health.esim.nec.NecBrowserActivity;
import com.heytap.store.base.core.util.deeplink.DeepLinkInterpreter;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.k3h, reason: from toString */
/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0004\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0010\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\n\u0010\u0013¨\u0006\u0018"}, d2 = {"Lcom/oplus/aiunit/vision/k3h;", "", "", "b", "toString", "", "hashCode", "other", "", "equals", "a", "I", "c", "()I", "slotIndex", "d", NecBrowserActivity.SUB_ID, "Ljava/lang/String;", "getImsi", "()Ljava/lang/String;", SpeechConstant.KEY_IMSI, DeepLinkInterpreter.KEY_PHONE_NUM, "<init>", "(IILjava/lang/String;Ljava/lang/String;)V", "esim_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class SimInfo {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final int slotIndex;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final int subId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final String imsi;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    public final String phoneNum;

    public SimInfo(int i, int i2, @NotNull String imsi, @NotNull String phoneNum) {
        Intrinsics.checkNotNullParameter(imsi, "imsi");
        Intrinsics.checkNotNullParameter(phoneNum, "phoneNum");
        this.slotIndex = i;
        this.subId = i2;
        this.imsi = imsi;
        this.phoneNum = phoneNum;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getPhoneNum() {
        return this.phoneNum;
    }

    @NotNull
    public final String b() {
        String string = b78.a().getString(R$string.esim_slot_info, String.valueOf(this.slotIndex + 1));
        Intrinsics.checkNotNullExpressionValue(string, "getAppContext().getStrin…+ 1).toString()\n        )");
        return string;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getSlotIndex() {
        return this.slotIndex;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getSubId() {
        return this.subId;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SimInfo)) {
            return false;
        }
        SimInfo simInfo = (SimInfo) other;
        return this.slotIndex == simInfo.slotIndex && this.subId == simInfo.subId && Intrinsics.areEqual(this.imsi, simInfo.imsi) && Intrinsics.areEqual(this.phoneNum, simInfo.phoneNum);
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.slotIndex) * 31) + Integer.hashCode(this.subId)) * 31) + this.imsi.hashCode()) * 31) + this.phoneNum.hashCode();
    }

    @NotNull
    public String toString() {
        return "SimInfo(slotIndex=" + this.slotIndex + ", subId=" + this.subId + ", imsi=" + this.imsi + ", phoneNum=" + this.phoneNum + ")";
    }
}
