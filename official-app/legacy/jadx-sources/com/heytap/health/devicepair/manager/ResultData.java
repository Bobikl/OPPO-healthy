package com.heytap.health.devicepair.manager;

import androidx.annotation.Keep;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.accountsdk.open.core.web.executor.AcOpenGetTokenExecutor;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.z5e;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0086\b\u0018\u0000 ,2\u00020\u0001:\u0003\b-.B\u0019\b\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0014\u001a\u00020\u0010¢\u0006\u0004\b*\u0010+J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0004J\b\u0010\n\u001a\u00020\tH\u0016J\t\u0010\u000b\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0016\u0010\u000f\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u000eR\u0017\u0010\u0014\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\u001b\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u001d\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0015\u0010\u0018\"\u0004\b\u001c\u0010\u001aR\"\u0010!\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u001f\u0010\u0018\"\u0004\b \u0010\u001aR\"\u0010'\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$\"\u0004\b%\u0010&R\"\u0010)\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0016\u001a\u0004\b\u001e\u0010\u0018\"\u0004\b(\u0010\u001a¨\u0006/"}, d2 = {"Lcom/heytap/health/devicepair/manager/ResultData;", "", "", "b", "", "d", "changeCode", "", "a", "", "toString", "hashCode", "other", "equals", "I", "code", "Lcom/heytap/health/devicepair/manager/ResultData$PairExpandBean;", "Lcom/heytap/health/devicepair/manager/ResultData$PairExpandBean;", b2n.f, "()Lcom/heytap/health/devicepair/manager/ResultData$PairExpandBean;", "pairExpandBean", "c", "Ljava/lang/String;", b2n.g, "()Ljava/lang/String;", LogFieldKey.LEVEL_KEY, "(Ljava/lang/String;)V", "ssoid", "i", AcOpenGetTokenExecutor.ACCOUNT_NAME_KEY, MapSchema.FIELD_NAME_ENTRY, "getNumber", "setNumber", "number", "f", "Z", "()Z", MapSchema.FIELD_NAME_KEY, "(Z)V", "needPause", "j", "model", "<init>", "(ILcom/heytap/health/devicepair/manager/ResultData$PairExpandBean;)V", "Companion", "PairExpandBean", "PairFailType", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class ResultData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int NORMAL_CODE = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public int code;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final PairExpandBean pairExpandBean;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public String ssoid;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public String accountName;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public String number;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    public boolean needPause;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public String model;

    @Keep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/heytap/health/devicepair/manager/ResultData$PairFailType;", "", "(Ljava/lang/String;I)V", "BT_CONNECT_FAIL", "PB", "CLOUND", "NORMAL", "OTHER", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum PairFailType {
        BT_CONNECT_FAIL,
        PB,
        CLOUND,
        NORMAL,
        OTHER
    }

    /* JADX INFO: renamed from: com.heytap.health.devicepair.manager.ResultData$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004J\u001a\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/heytap/health/devicepair/manager/ResultData$a;", "", "", "code", "Lcom/heytap/health/devicepair/manager/ResultData$PairExpandBean;", "pairExpandBean", "Lcom/heytap/health/devicepair/manager/ResultData;", "a", "", "msg", "c", "NORMAL_CODE", "I", "<init>", "()V", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ ResultData b(Companion companion, int i, PairExpandBean pairExpandBean, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = 0;
            }
            if ((i2 & 2) != 0) {
                pairExpandBean = new PairExpandBean(PairFailType.OTHER, "");
            }
            return companion.a(i, pairExpandBean);
        }

        public static /* synthetic */ ResultData d(Companion companion, int i, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = 0;
            }
            if ((i2 & 2) != 0) {
                str = "";
            }
            return companion.c(i, str);
        }

        @NotNull
        public final ResultData a(int code, @NotNull PairExpandBean pairExpandBean) {
            Intrinsics.checkNotNullParameter(pairExpandBean, "pairExpandBean");
            return new ResultData(z5e.INSTANCE.c(code, Integer.MIN_VALUE), pairExpandBean, null);
        }

        @NotNull
        public final ResultData c(int code, @NotNull String msg) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            return new ResultData(z5e.INSTANCE.c(code, 1073741824), new PairExpandBean(PairFailType.NORMAL, msg), null);
        }
    }

    public /* synthetic */ ResultData(int i, PairExpandBean pairExpandBean, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, pairExpandBean);
    }

    public final void a(int changeCode) {
        z5e z5eVar = z5e.INSTANCE;
        this.code = z5eVar.c(changeCode, z5eVar.b(this.code));
    }

    public final boolean b() {
        return z5e.INSTANCE.b(this.code) == 1073741824;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getAccountName() {
        return this.accountName;
    }

    public final int d() {
        return z5e.INSTANCE.a(this.code);
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResultData)) {
            return false;
        }
        ResultData resultData = (ResultData) other;
        return this.code == resultData.code && Intrinsics.areEqual(this.pairExpandBean, resultData.pairExpandBean);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getNeedPause() {
        return this.needPause;
    }

    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public final PairExpandBean getPairExpandBean() {
        return this.pairExpandBean;
    }

    @NotNull
    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getSsoid() {
        return this.ssoid;
    }

    public int hashCode() {
        return (Integer.hashCode(this.code) * 31) + this.pairExpandBean.hashCode();
    }

    public final void i(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.accountName = str;
    }

    public final void j(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.model = str;
    }

    public final void k(boolean z) {
        this.needPause = z;
    }

    public final void l(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.ssoid = str;
    }

    @NotNull
    public String toString() {
        return "ResultData(code=" + d() + ", pairExpandBean='" + this.pairExpandBean + "', needPause='" + this.needPause + "')";
    }

    public ResultData(int i, PairExpandBean pairExpandBean) {
        this.code = i;
        this.pairExpandBean = pairExpandBean;
        this.ssoid = "";
        this.accountName = "";
        this.number = "";
        this.model = "";
    }

    @Keep
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\b\u0010\u0015\u001a\u00020\u0005H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/heytap/health/devicepair/manager/ResultData$PairExpandBean;", "", "type", "Lcom/heytap/health/devicepair/manager/ResultData$PairFailType;", "msg", "", "(Lcom/heytap/health/devicepair/manager/ResultData$PairFailType;Ljava/lang/String;)V", "getMsg", "()Ljava/lang/String;", "setMsg", "(Ljava/lang/String;)V", "getType", "()Lcom/heytap/health/devicepair/manager/ResultData$PairFailType;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class PairExpandBean {

        @NotNull
        private String msg;

        /* JADX INFO: renamed from: type, reason: from kotlin metadata and from toString */
        @NotNull
        private final PairFailType PairExpandBean_type;

        public PairExpandBean(@NotNull PairFailType type, @NotNull String msg) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(msg, "msg");
            this.PairExpandBean_type = type;
            this.msg = msg;
        }

        public static /* synthetic */ PairExpandBean copy$default(PairExpandBean pairExpandBean, PairFailType pairFailType, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                pairFailType = pairExpandBean.PairExpandBean_type;
            }
            if ((i & 2) != 0) {
                str = pairExpandBean.msg;
            }
            return pairExpandBean.copy(pairFailType, str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final PairFailType getPairExpandBean_type() {
            return this.PairExpandBean_type;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getMsg() {
            return this.msg;
        }

        @NotNull
        public final PairExpandBean copy(@NotNull PairFailType type, @NotNull String msg) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(msg, "msg");
            return new PairExpandBean(type, msg);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PairExpandBean)) {
                return false;
            }
            PairExpandBean pairExpandBean = (PairExpandBean) other;
            return this.PairExpandBean_type == pairExpandBean.PairExpandBean_type && Intrinsics.areEqual(this.msg, pairExpandBean.msg);
        }

        @NotNull
        public final String getMsg() {
            return this.msg;
        }

        @NotNull
        public final PairFailType getType() {
            return this.PairExpandBean_type;
        }

        public int hashCode() {
            return (this.PairExpandBean_type.hashCode() * 31) + this.msg.hashCode();
        }

        public final void setMsg(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.msg = str;
        }

        @NotNull
        public String toString() {
            return "PairExpandBean_type=" + this.PairExpandBean_type + "&PairExpandBean_msg=" + this.msg + "&";
        }

        public /* synthetic */ PairExpandBean(PairFailType pairFailType, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(pairFailType, (i & 2) != 0 ? "" : str);
        }
    }
}
