package com.oplus.aiunit.vision;

import com.heytap.log.formatter.LogFieldKey;
import io.protostuff.MapSchema;
import org.apache.commons.codec.language.bm.Languages;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0005\u000e\u000f\n\u000b\u0018B\t\b\u0002¢\u0006\u0004\b,\u0010-J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0010\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\b\u001a\u00020\u0002J\u0006\u0010\t\u001a\u00020\u0002J\u0006\u0010\n\u001a\u00020\u0002J\u0006\u0010\u000b\u001a\u00020\u0002J\u0006\u0010\f\u001a\u00020\u0002J\u0006\u0010\r\u001a\u00020\u0002J\u0006\u0010\u000e\u001a\u00020\u0002J\u0006\u0010\u000f\u001a\u00020\u0002J\u0012\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0002R\u0014\u0010\u0013\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014R$\u0010\u001c\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0014\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001eR\u0018\u0010\"\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010!R\u0018\u0010%\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010$R\u0018\u0010(\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010'R\u0018\u0010+\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010*¨\u0006."}, d2 = {"Lcom/oplus/aiunit/vision/bee;", "", "", "i", "j", "", "round", LogFieldKey.LEVEL_KEY, "n", "o", "c", "d", "f", b2n.f, "a", "b", Languages.ANY, b2n.g, "", "TAG", "Ljava/lang/String;", "BOOTLOADER_NODE_START", "BOOTLOADER_START_ALL_NODE", "ENGINE_INIT", MapSchema.FIELD_NAME_ENTRY, "()Ljava/lang/String;", MapSchema.FIELD_NAME_KEY, "(Ljava/lang/String;)V", "sessionId", "Lcom/oplus/aiunit/vision/bee$d;", "Lcom/oplus/aiunit/vision/bee$d;", "recordBean", "Lcom/oplus/aiunit/vision/bee$e;", "Lcom/oplus/aiunit/vision/bee$e;", "vadBean", "Lcom/oplus/aiunit/vision/bee$b;", "Lcom/oplus/aiunit/vision/bee$b;", "dmBean", "Lcom/oplus/aiunit/vision/bee$c;", "Lcom/oplus/aiunit/vision/bee$c;", "nluBean", "Lcom/oplus/aiunit/vision/bee$a;", "Lcom/oplus/aiunit/vision/bee$a;", "asrBean", "<init>", "()V", "speechEngine_release"}, k = 1, mv = {1, 5, 1})
public final class bee {

    @NotNull
    public static final String BOOTLOADER_NODE_START = "Bootloader#start";

    @NotNull
    public static final String BOOTLOADER_START_ALL_NODE = "Bootloader#startAllNodes";

    @NotNull
    public static final String ENGINE_INIT = "HeytapSpeechEngine#init";

    @NotNull
    public static final bee INSTANCE = new bee();

    @NotNull
    public static final String TAG = "PerfBean";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public static String sessionId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public static RecordBean recordBean;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public static VadBean vadBean;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public static DmBean dmBean;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public static NluBean nluBean;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public static AsrBean asrBean;

    public static /* synthetic */ void m(bee beeVar, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        beeVar.l(i);
    }

    public final void a() {
        AsrBean asrBean2 = new AsrBean(sessionId, System.currentTimeMillis(), 0L, 0L, 12, null);
        asrBean = asrBean2;
        h(asrBean2);
    }

    public final void b() {
        AsrBean asrBean2 = asrBean;
        if (asrBean2 == null) {
            asrBean2 = null;
        } else {
            asrBean2.d(System.currentTimeMillis());
            asrBean2.c(asrBean2.getStopTime() - asrBean2.getStartTime());
        }
        h(asrBean2);
    }

    public final void c() {
        DmBean dmBean2 = new DmBean(sessionId, System.currentTimeMillis(), 0L, 0L, 12, null);
        dmBean = dmBean2;
        h(dmBean2);
    }

    public final void d() {
        DmBean dmBean2 = dmBean;
        if (dmBean2 == null) {
            dmBean2 = null;
        } else {
            String sessionId2 = dmBean2.getSessionId();
            if (sessionId2 == null || sessionId2.length() == 0) {
                dmBean2.e(INSTANCE.e());
            }
            dmBean2.f(System.currentTimeMillis());
            dmBean2.d(dmBean2.getStopTime() - dmBean2.getStartTime());
        }
        h(dmBean2);
    }

    @Nullable
    public final String e() {
        return sessionId;
    }

    public final void f() {
        NluBean nluBean2 = new NluBean(sessionId, System.currentTimeMillis(), 0L, 0L, 12, null);
        nluBean = nluBean2;
        h(nluBean2);
    }

    public final void g() {
        NluBean nluBean2 = nluBean;
        if (nluBean2 == null) {
            nluBean2 = null;
        } else {
            String sessionId2 = nluBean2.getSessionId();
            if (sessionId2 == null || sessionId2.length() == 0) {
                nluBean2.e(INSTANCE.e());
            }
            nluBean2.f(System.currentTimeMillis());
            nluBean2.d(nluBean2.getStopTime() - nluBean2.getStartTime());
        }
        h(nluBean2);
    }

    public final void h(Object any) {
        if (any == null) {
            return;
        }
        t7b.INSTANCE.i(TAG, any.toString());
    }

    public final void i() {
        RecordBean recordBean2 = new RecordBean(sessionId, System.currentTimeMillis(), 0L, 0L, 12, null);
        recordBean = recordBean2;
        h(recordBean2);
    }

    public final void j() {
        RecordBean recordBean2 = recordBean;
        if (recordBean2 == null) {
            recordBean2 = null;
        } else {
            recordBean2.d(System.currentTimeMillis());
            recordBean2.c(recordBean2.getStopTime() - recordBean2.getStartTime());
        }
        h(recordBean2);
    }

    public final void k(@Nullable String str) {
        sessionId = str;
    }

    public final void l(int round) {
        VadBean vadBean2 = new VadBean(sessionId, System.currentTimeMillis(), round, 0L, null, 0L, 56, null);
        vadBean = vadBean2;
        h(vadBean2);
    }

    public final void n() {
        VadBean vadBean2 = vadBean;
        if (vadBean2 != null) {
            vadBean2.e(System.currentTimeMillis());
            vadBean2.d("success");
            vadBean2.c(vadBean2.getStopTime() - vadBean2.getStartTime());
        }
        h(vadBean);
    }

    public final void o() {
        VadBean vadBean2 = vadBean;
        if (vadBean2 == null) {
            vadBean2 = null;
        } else {
            vadBean2.e(System.currentTimeMillis());
            vadBean2.d("timeout");
            vadBean2.c(vadBean2.getStopTime() - vadBean2.getStartTime());
        }
        h(vadBean2);
    }

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.bee$e, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u000e\u0012\b\b\u0002\u0010 \u001a\u00020\u0002\u0012\b\b\u0002\u0010#\u001a\u00020\u000e¢\u0006\u0004\b$\u0010%J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0012\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\t\u0010\u0011R\"\u0010\u0019\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u001d\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011\"\u0004\b\u001b\u0010\u001cR\"\u0010 \u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\n\u001a\u0004\b\u001e\u0010\f\"\u0004\b\u001a\u0010\u001fR\"\u0010#\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0010\u001a\u0004\b\"\u0010\u0011\"\u0004\b\u0013\u0010\u001c¨\u0006&"}, d2 = {"Lcom/oplus/aiunit/vision/bee$e;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getSessionId", "()Ljava/lang/String;", "sessionId", "", "b", "J", "()J", "startTime", "c", "I", "getRound", "()I", "setRound", "(I)V", "round", "d", MapSchema.FIELD_NAME_ENTRY, "(J)V", "stopTime", "getResult", "(Ljava/lang/String;)V", "result", "f", "getCost", "cost", "<init>", "(Ljava/lang/String;JIJLjava/lang/String;J)V", "speechEngine_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class VadBean {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @Nullable
        public final String sessionId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        public final long startTime;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        public int round;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
        public long stopTime;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public String result;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
        public long cost;

        public VadBean(@Nullable String str, long j2, int i, long j3, @NotNull String result, long j4) {
            Intrinsics.checkNotNullParameter(result, "result");
            this.sessionId = str;
            this.startTime = j2;
            this.round = i;
            this.stopTime = j3;
            this.result = result;
            this.cost = j4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getStartTime() {
            return this.startTime;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getStopTime() {
            return this.stopTime;
        }

        public final void c(long j2) {
            this.cost = j2;
        }

        public final void d(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.result = str;
        }

        public final void e(long j2) {
            this.stopTime = j2;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VadBean)) {
                return false;
            }
            VadBean vadBean = (VadBean) other;
            return Intrinsics.areEqual(this.sessionId, vadBean.sessionId) && this.startTime == vadBean.startTime && this.round == vadBean.round && this.stopTime == vadBean.stopTime && Intrinsics.areEqual(this.result, vadBean.result) && this.cost == vadBean.cost;
        }

        public int hashCode() {
            String str = this.sessionId;
            return ((((((((((str == null ? 0 : str.hashCode()) * 31) + Long.hashCode(this.startTime)) * 31) + Integer.hashCode(this.round)) * 31) + Long.hashCode(this.stopTime)) * 31) + this.result.hashCode()) * 31) + Long.hashCode(this.cost);
        }

        @NotNull
        public String toString() {
            return "VadBean(sessionId=" + ((Object) this.sessionId) + ", startTime=" + this.startTime + ", round=" + this.round + ", stopTime=" + this.stopTime + ", result=" + this.result + ", cost=" + this.cost + ')';
        }

        public /* synthetic */ VadBean(String str, long j2, int i, long j3, String str2, long j4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, j2, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? 0L : j3, (i2 & 16) != 0 ? "unknown" : str2, (i2 & 32) != 0 ? 0L : j4);
        }
    }

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.bee$a, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u000e¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0012\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\t\u0010\u0011R\"\u0010\u0016\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0018\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0017\u0010\u0011\"\u0004\b\u0013\u0010\u0015¨\u0006\u001b"}, d2 = {"Lcom/oplus/aiunit/vision/bee$a;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getSessionId", "()Ljava/lang/String;", "sessionId", "", "b", "J", "()J", "startTime", "c", "d", "(J)V", "stopTime", "getCost", "cost", "<init>", "(Ljava/lang/String;JJJ)V", "speechEngine_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class AsrBean {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @Nullable
        public final String sessionId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        public final long startTime;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        public long stopTime;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
        public long cost;

        public AsrBean(@Nullable String str, long j2, long j3, long j4) {
            this.sessionId = str;
            this.startTime = j2;
            this.stopTime = j3;
            this.cost = j4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getStartTime() {
            return this.startTime;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getStopTime() {
            return this.stopTime;
        }

        public final void c(long j2) {
            this.cost = j2;
        }

        public final void d(long j2) {
            this.stopTime = j2;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AsrBean)) {
                return false;
            }
            AsrBean asrBean = (AsrBean) other;
            return Intrinsics.areEqual(this.sessionId, asrBean.sessionId) && this.startTime == asrBean.startTime && this.stopTime == asrBean.stopTime && this.cost == asrBean.cost;
        }

        public int hashCode() {
            String str = this.sessionId;
            return ((((((str == null ? 0 : str.hashCode()) * 31) + Long.hashCode(this.startTime)) * 31) + Long.hashCode(this.stopTime)) * 31) + Long.hashCode(this.cost);
        }

        @NotNull
        public String toString() {
            return "AsrBean(sessionId=" + ((Object) this.sessionId) + ", startTime=" + this.startTime + ", stopTime=" + this.stopTime + ", cost=" + this.cost + ')';
        }

        public /* synthetic */ AsrBean(String str, long j2, long j3, long j4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, j2, (i & 4) != 0 ? 0L : j3, (i & 8) != 0 ? 0L : j4);
        }
    }

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.bee$b, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u000f¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R$\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\rR\u0017\u0010\u0013\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\"\u0010\u0017\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0014\u0010\u0012\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001a\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u0018\u0010\u0016¨\u0006\u001d"}, d2 = {"Lcom/oplus/aiunit/vision/bee$b;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", MapSchema.FIELD_NAME_ENTRY, "(Ljava/lang/String;)V", "sessionId", "", "b", "J", "()J", "startTime", "c", "f", "(J)V", "stopTime", "d", "getCost", "cost", "<init>", "(Ljava/lang/String;JJJ)V", "speechEngine_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class DmBean {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @Nullable
        public String sessionId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        public final long startTime;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        public long stopTime;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
        public long cost;

        public DmBean(@Nullable String str, long j2, long j3, long j4) {
            this.sessionId = str;
            this.startTime = j2;
            this.stopTime = j3;
            this.cost = j4;
        }

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getSessionId() {
            return this.sessionId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getStartTime() {
            return this.startTime;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final long getStopTime() {
            return this.stopTime;
        }

        public final void d(long j2) {
            this.cost = j2;
        }

        public final void e(@Nullable String str) {
            this.sessionId = str;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DmBean)) {
                return false;
            }
            DmBean dmBean = (DmBean) other;
            return Intrinsics.areEqual(this.sessionId, dmBean.sessionId) && this.startTime == dmBean.startTime && this.stopTime == dmBean.stopTime && this.cost == dmBean.cost;
        }

        public final void f(long j2) {
            this.stopTime = j2;
        }

        public int hashCode() {
            String str = this.sessionId;
            return ((((((str == null ? 0 : str.hashCode()) * 31) + Long.hashCode(this.startTime)) * 31) + Long.hashCode(this.stopTime)) * 31) + Long.hashCode(this.cost);
        }

        @NotNull
        public String toString() {
            return "DmBean(sessionId=" + ((Object) this.sessionId) + ", startTime=" + this.startTime + ", stopTime=" + this.stopTime + ", cost=" + this.cost + ')';
        }

        public /* synthetic */ DmBean(String str, long j2, long j3, long j4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, j2, (i & 4) != 0 ? 0L : j3, (i & 8) != 0 ? 0L : j4);
        }
    }

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.bee$c, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u000f¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R$\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\rR\u0017\u0010\u0013\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\"\u0010\u0017\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0014\u0010\u0012\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001a\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u0018\u0010\u0016¨\u0006\u001d"}, d2 = {"Lcom/oplus/aiunit/vision/bee$c;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", MapSchema.FIELD_NAME_ENTRY, "(Ljava/lang/String;)V", "sessionId", "", "b", "J", "()J", "startTime", "c", "f", "(J)V", "stopTime", "d", "getCost", "cost", "<init>", "(Ljava/lang/String;JJJ)V", "speechEngine_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class NluBean {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @Nullable
        public String sessionId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        public final long startTime;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        public long stopTime;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
        public long cost;

        public NluBean(@Nullable String str, long j2, long j3, long j4) {
            this.sessionId = str;
            this.startTime = j2;
            this.stopTime = j3;
            this.cost = j4;
        }

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getSessionId() {
            return this.sessionId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getStartTime() {
            return this.startTime;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final long getStopTime() {
            return this.stopTime;
        }

        public final void d(long j2) {
            this.cost = j2;
        }

        public final void e(@Nullable String str) {
            this.sessionId = str;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NluBean)) {
                return false;
            }
            NluBean nluBean = (NluBean) other;
            return Intrinsics.areEqual(this.sessionId, nluBean.sessionId) && this.startTime == nluBean.startTime && this.stopTime == nluBean.stopTime && this.cost == nluBean.cost;
        }

        public final void f(long j2) {
            this.stopTime = j2;
        }

        public int hashCode() {
            String str = this.sessionId;
            return ((((((str == null ? 0 : str.hashCode()) * 31) + Long.hashCode(this.startTime)) * 31) + Long.hashCode(this.stopTime)) * 31) + Long.hashCode(this.cost);
        }

        @NotNull
        public String toString() {
            return "NluBean(sessionId=" + ((Object) this.sessionId) + ", startTime=" + this.startTime + ", stopTime=" + this.stopTime + ", cost=" + this.cost + ')';
        }

        public /* synthetic */ NluBean(String str, long j2, long j3, long j4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, j2, (i & 4) != 0 ? 0L : j3, (i & 8) != 0 ? 0L : j4);
        }
    }

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.bee$d, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u000e¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0012\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\t\u0010\u0011R\"\u0010\u0016\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0018\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0017\u0010\u0011\"\u0004\b\u0013\u0010\u0015¨\u0006\u001b"}, d2 = {"Lcom/oplus/aiunit/vision/bee$d;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getSessionId", "()Ljava/lang/String;", "sessionId", "", "b", "J", "()J", "startTime", "c", "d", "(J)V", "stopTime", "getCost", "cost", "<init>", "(Ljava/lang/String;JJJ)V", "speechEngine_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class RecordBean {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @Nullable
        public final String sessionId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        public final long startTime;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        public long stopTime;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
        public long cost;

        public RecordBean(@Nullable String str, long j2, long j3, long j4) {
            this.sessionId = str;
            this.startTime = j2;
            this.stopTime = j3;
            this.cost = j4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getStartTime() {
            return this.startTime;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getStopTime() {
            return this.stopTime;
        }

        public final void c(long j2) {
            this.cost = j2;
        }

        public final void d(long j2) {
            this.stopTime = j2;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RecordBean)) {
                return false;
            }
            RecordBean recordBean = (RecordBean) other;
            return Intrinsics.areEqual(this.sessionId, recordBean.sessionId) && this.startTime == recordBean.startTime && this.stopTime == recordBean.stopTime && this.cost == recordBean.cost;
        }

        public int hashCode() {
            String str = this.sessionId;
            return ((((((str == null ? 0 : str.hashCode()) * 31) + Long.hashCode(this.startTime)) * 31) + Long.hashCode(this.stopTime)) * 31) + Long.hashCode(this.cost);
        }

        @NotNull
        public String toString() {
            return "RecordBean(sessionId=" + ((Object) this.sessionId) + ", startTime=" + this.startTime + ", stopTime=" + this.stopTime + ", cost=" + this.cost + ')';
        }

        public /* synthetic */ RecordBean(String str, long j2, long j3, long j4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, j2, (i & 4) != 0 ? 0L : j3, (i & 8) != 0 ? 0L : j4);
        }
    }
}
