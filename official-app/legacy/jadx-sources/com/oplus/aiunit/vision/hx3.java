package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.speech.engine.constant.Constant;
import com.heytap.store.base.core.http.HttpConst;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u0003B\t\b\u0002¢\u0006\u0004\b4\u00105R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R(\u0010\u0013\u001a\u0004\u0018\u00010\u000e2\b\u0010\n\u001a\u0004\u0018\u00010\u000e8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\u0017\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u0015\u0010\u0006\"\u0004\b\u0016\u0010\bR\"\u0010\u001e\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010(\u001a\u00020\u001f2\u0006\u0010\n\u001a\u00020\u001f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b'\u0010#R$\u0010*\u001a\u00020\u001f2\u0006\u0010\n\u001a\u00020\u001f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\f\u0010!\u001a\u0004\b)\u0010#R\"\u0010-\u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010!\u001a\u0004\b+\u0010#\"\u0004\b,\u0010%R$\u00103\u001a\u0004\u0018\u00010.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010/\u001a\u0004\b \u00100\"\u0004\b1\u00102¨\u00066"}, d2 = {"Lcom/oplus/aiunit/vision/hx3;", "", "", "a", "I", b2n.f, "()I", LogFieldKey.PROCESS_NAME_KEY, "(I)V", HttpConst.SERVER_ENV, "<set-?>", "b", b2n.g, "heartBeatTime", "", "c", "Ljava/lang/String;", MapSchema.FIELD_NAME_KEY, "()Ljava/lang/String;", "region", "d", MapSchema.FIELD_NAME_ENTRY, "n", "connectTimeout", "", "J", "j", "()J", "q", "(J)V", "pskCacheFileTimeout", "", "f", "Z", LogFieldKey.MESSAGE_KEY, "()Z", "s", "(Z)V", "verifyPeerEnable", "i", Constant.PARAM_MESSAGE_ACK, "getServerMessageAck", "serverMessageAck", LogFieldKey.LEVEL_KEY, "r", "useSDKStat", "Lcom/oplus/aiunit/vision/nf4;", "Lcom/oplus/aiunit/vision/nf4;", "()Lcom/oplus/aiunit/vision/nf4;", "o", "(Lcom/oplus/aiunit/vision/nf4;)V", "customInfo", "<init>", "()V", "speechEngine_release"}, k = 1, mv = {1, 5, 1})
public final class hx3 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public int env;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int heartBeatTime;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public String region;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public int connectTimeout;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public long pskCacheFileTimeout;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public boolean verifyPeerEnable;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public boolean messageAck;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public boolean serverMessageAck;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public boolean useSDKStat;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public CustomInfo customInfo;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b!\u0010\"J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0002J\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\fJ\u0006\u0010\u0010\u001a\u00020\u000fR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0012R\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0017R\u0016\u0010\u001e\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u0017R\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lcom/oplus/aiunit/vision/hx3$a;", "", "", HttpConst.SERVER_ENV, "d", "heartBeatTime", MapSchema.FIELD_NAME_ENTRY, "", "region", "f", "connectTimeout", "b", "Lcom/oplus/aiunit/vision/nf4;", "customInfo", "c", "Lcom/oplus/aiunit/vision/hx3;", "a", "I", "Ljava/lang/String;", "", "J", "pskCacheFileTimeout", "", "Z", "verifyPeerEnable", b2n.f, Constant.PARAM_MESSAGE_ACK, b2n.g, "serverMessageAck", "i", "useSDKStat", "j", "Lcom/oplus/aiunit/vision/nf4;", "<init>", "()V", "speechEngine_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public int env = 1;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public int heartBeatTime = 30000;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public String region = "CN";

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public int connectTimeout = 5000;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public long pskCacheFileTimeout = 2592000000L;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        public boolean verifyPeerEnable;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        public boolean messageAck;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        public boolean serverMessageAck;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        public boolean useSDKStat;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public CustomInfo customInfo;

        /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
        
            if (android.text.TextUtils.isEmpty(r1.getIp()) == false) goto L13;
         */
        @NotNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final hx3 a() {
            hx3 hx3Var = new hx3(null);
            if (this.env == 4) {
                CustomInfo customInfo = this.customInfo;
                if (customInfo != null) {
                    Intrinsics.checkNotNull(customInfo);
                    if (TextUtils.isEmpty(customInfo.getCustomUrl())) {
                        CustomInfo customInfo2 = this.customInfo;
                        Intrinsics.checkNotNull(customInfo2);
                    }
                }
                throw new IllegalArgumentException("env is custom,but url is null.");
            }
            hx3Var.p(this.env);
            hx3Var.heartBeatTime = this.heartBeatTime;
            hx3Var.region = this.region;
            hx3Var.n(this.connectTimeout);
            hx3Var.q(this.pskCacheFileTimeout);
            hx3Var.s(this.verifyPeerEnable);
            hx3Var.messageAck = this.messageAck;
            hx3Var.r(this.useSDKStat);
            hx3Var.serverMessageAck = this.serverMessageAck;
            hx3Var.o(this.customInfo);
            return hx3Var;
        }

        @NotNull
        public final a b(int connectTimeout) {
            this.connectTimeout = connectTimeout;
            return this;
        }

        @NotNull
        public final a c(@NotNull CustomInfo customInfo) {
            Intrinsics.checkNotNullParameter(customInfo, "customInfo");
            this.customInfo = customInfo;
            return this;
        }

        @NotNull
        public final a d(int env) {
            if (env == 1 || env == 2 || env == 3 || env == 4) {
                this.env = env;
            }
            return this;
        }

        @NotNull
        public final a e(int heartBeatTime) {
            this.heartBeatTime = heartBeatTime;
            return this;
        }

        @NotNull
        public final a f(@NotNull String region) {
            Intrinsics.checkNotNullParameter(region, "region");
            this.region = region;
            return this;
        }
    }

    public /* synthetic */ hx3(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getConnectTimeout() {
        return this.connectTimeout;
    }

    @Nullable
    /* JADX INFO: renamed from: f, reason: from getter */
    public final CustomInfo getCustomInfo() {
        return this.customInfo;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getEnv() {
        return this.env;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getHeartBeatTime() {
        return this.heartBeatTime;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getMessageAck() {
        return this.messageAck;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final long getPskCacheFileTimeout() {
        return this.pskCacheFileTimeout;
    }

    @Nullable
    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getRegion() {
        return this.region;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getUseSDKStat() {
        return this.useSDKStat;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final boolean getVerifyPeerEnable() {
        return this.verifyPeerEnable;
    }

    public final void n(int i) {
        this.connectTimeout = i;
    }

    public final void o(@Nullable CustomInfo customInfo) {
        this.customInfo = customInfo;
    }

    public final void p(int i) {
        this.env = i;
    }

    public final void q(long j2) {
        this.pskCacheFileTimeout = j2;
    }

    public final void r(boolean z) {
        this.useSDKStat = z;
    }

    public final void s(boolean z) {
        this.verifyPeerEnable = z;
    }

    public hx3() {
        this.region = "CN";
    }
}
