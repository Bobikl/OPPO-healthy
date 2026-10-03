package com.heytap.health.wallet.network.car.params;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.j7l;
import com.oplus.pantanal.seedling.constants.TraceConstants;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lcom/heytap/health/wallet/network/car/params/NotifyParam;", "", "()V", "aid", "", "getAid", "()Ljava/lang/String;", "setAid", "(Ljava/lang/String;)V", "apkSign", "getApkSign", "setApkSign", "carExtraInfo", "getCarExtraInfo", "setCarExtraInfo", j7l.KEY_CPLC, "getCplc", "setCplc", TraceConstants.KEY_PKG_NAME, "getPkgName", "setPkgName", "sign", "getSign", "setSign", "status", "", "getStatus", "()I", "setStatus", "(I)V", "timestamp", "", "getTimestamp", "()J", "setTimestamp", "(J)V", "commonlib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class NotifyParam {

    @Nullable
    private String aid;

    @Nullable
    private String apkSign;

    @Nullable
    private String carExtraInfo;

    @Nullable
    private String cplc;

    @Nullable
    private String pkgName;

    @Nullable
    private String sign;
    private int status;
    private long timestamp;

    @Nullable
    public final String getAid() {
        return this.aid;
    }

    @Nullable
    public final String getApkSign() {
        return this.apkSign;
    }

    @Nullable
    public final String getCarExtraInfo() {
        return this.carExtraInfo;
    }

    @Nullable
    public final String getCplc() {
        return this.cplc;
    }

    @Nullable
    public final String getPkgName() {
        return this.pkgName;
    }

    @Nullable
    public final String getSign() {
        return this.sign;
    }

    public final int getStatus() {
        return this.status;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final void setAid(@Nullable String str) {
        this.aid = str;
    }

    public final void setApkSign(@Nullable String str) {
        this.apkSign = str;
    }

    public final void setCarExtraInfo(@Nullable String str) {
        this.carExtraInfo = str;
    }

    public final void setCplc(@Nullable String str) {
        this.cplc = str;
    }

    public final void setPkgName(@Nullable String str) {
        this.pkgName = str;
    }

    public final void setSign(@Nullable String str) {
        this.sign = str;
    }

    public final void setStatus(int i) {
        this.status = i;
    }

    public final void setTimestamp(long j2) {
        this.timestamp = j2;
    }
}
