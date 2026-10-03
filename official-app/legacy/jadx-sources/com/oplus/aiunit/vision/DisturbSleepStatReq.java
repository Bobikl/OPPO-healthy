package com.oplus.aiunit.vision;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.sw5, reason: from toString */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\"\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006R$\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/oplus/aiunit/vision/sw5;", "", "", "toString", "", "a", "I", "()I", "b", "(I)V", "date", "queryFlag", "c", "Ljava/lang/String;", "getDeviceUniqueId", "()Ljava/lang/String;", "setDeviceUniqueId", "(Ljava/lang/String;)V", t04.DEVICE_UNIQUE_ID, "<init>", "(IILjava/lang/String;)V", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
public final class DisturbSleepStatReq {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("date")
    private int date;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("queryFlag")
    private final int queryFlag;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName(t04.DEVICE_UNIQUE_ID)
    @Nullable
    private String deviceUniqueId;

    public DisturbSleepStatReq(int i, int i2, @Nullable String str) {
        this.date = i;
        this.queryFlag = i2;
        this.deviceUniqueId = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getDate() {
        return this.date;
    }

    public final void b(int i) {
        this.date = i;
    }

    @NotNull
    public String toString() {
        return "DisturbSleepStatReq(date=" + this.date + ", queryFlag=" + this.queryFlag + ", deviceUniqueId='" + this.deviceUniqueId + "')";
    }
}
