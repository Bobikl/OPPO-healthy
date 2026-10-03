package com.heytap.health.devicemanager.processor.bean;

import androidx.annotation.Keep;
import com.heytap.speech.engine.constant.EngineConstant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/heytap/health/devicemanager/processor/bean/InterceptBean;", "", "intercept", "", EngineConstant.REASON, "", "(ZLjava/lang/String;)V", "getIntercept", "()Z", "getReason", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "device_manager_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class InterceptBean {
    private final boolean intercept;

    @NotNull
    private final String reason;

    public InterceptBean(boolean z, @NotNull String reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.intercept = z;
        this.reason = reason;
    }

    public static /* synthetic */ InterceptBean copy$default(InterceptBean interceptBean, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = interceptBean.intercept;
        }
        if ((i & 2) != 0) {
            str = interceptBean.reason;
        }
        return interceptBean.copy(z, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIntercept() {
        return this.intercept;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    @NotNull
    public final InterceptBean copy(boolean intercept, @NotNull String reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        return new InterceptBean(intercept, reason);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InterceptBean)) {
            return false;
        }
        InterceptBean interceptBean = (InterceptBean) other;
        return this.intercept == interceptBean.intercept && Intrinsics.areEqual(this.reason, interceptBean.reason);
    }

    public final boolean getIntercept() {
        return this.intercept;
    }

    @NotNull
    public final String getReason() {
        return this.reason;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.intercept;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (r0 * 31) + this.reason.hashCode();
    }

    @NotNull
    public String toString() {
        return "InterceptBean(intercept=" + this.intercept + ", reason=" + this.reason + ")";
    }
}
