package com.oplus.aiunit.vision;

import com.heytap.log.formatter.LogFieldKey;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00172\u00020\u0001:\u000e\t\u000e\u000b\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"B'\b\u0004\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0000\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0017\u0010\r\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00008\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\t\u0010\u0010R\u0017\u0010\u0014\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0012\u001a\u0004\b\u000e\u0010\u0013\u0082\u0001\r#$%&'()*+,-./¨\u00060"}, d2 = {"Lcom/oplus/aiunit/vision/auc;", "", "other", "", "equals", "", "hashCode", "", "toString", "a", "I", "c", "()I", "status", "b", "Lcom/oplus/aiunit/vision/auc;", "()Lcom/oplus/aiunit/vision/auc;", "preState", "Z", "()Z", "singleDispatch", "<init>", "(ILcom/oplus/aiunit/vision/auc;Z)V", "Companion", "d", MapSchema.FIELD_NAME_ENTRY, "f", b2n.f, b2n.g, "i", "j", MapSchema.FIELD_NAME_KEY, LogFieldKey.LEVEL_KEY, LogFieldKey.MESSAGE_KEY, "n", "Lcom/oplus/aiunit/vision/auc$a;", "Lcom/oplus/aiunit/vision/auc$b;", "Lcom/oplus/aiunit/vision/auc$d;", "Lcom/oplus/aiunit/vision/auc$e;", "Lcom/oplus/aiunit/vision/auc$f;", "Lcom/oplus/aiunit/vision/auc$g;", "Lcom/oplus/aiunit/vision/auc$h;", "Lcom/oplus/aiunit/vision/auc$i;", "Lcom/oplus/aiunit/vision/auc$j;", "Lcom/oplus/aiunit/vision/auc$k;", "Lcom/oplus/aiunit/vision/auc$l;", "Lcom/oplus/aiunit/vision/auc$m;", "Lcom/oplus/aiunit/vision/auc$n;", "wearableservicesdk_release"}, k = 1, mv = {1, 8, 0})
public abstract class auc {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int status;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final auc preState;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final boolean singleDispatch;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/oplus/aiunit/vision/auc$a;", "Lcom/oplus/aiunit/vision/auc;", "<init>", "()V", "wearableservicesdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a extends auc {

        @NotNull
        public static final a INSTANCE = new a();

        public a() {
            super(3, null, false, 6, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/oplus/aiunit/vision/auc$b;", "Lcom/oplus/aiunit/vision/auc;", "<init>", "()V", "wearableservicesdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class b extends auc {

        @NotNull
        public static final b INSTANCE = new b();

        public b() {
            super(6, null, false, 6, null);
        }
    }

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.auc$c, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\n"}, d2 = {"Lcom/oplus/aiunit/vision/auc$c;", "", "", "status", "Lcom/oplus/aiunit/vision/auc;", "a", "", "b", "<init>", "()V", "wearableservicesdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final auc a(int status) {
            f fVar = f.INSTANCE;
            if (status == fVar.getStatus()) {
                return fVar;
            }
            e eVar = e.INSTANCE;
            if (status == eVar.getStatus()) {
                return eVar;
            }
            a aVar = a.INSTANCE;
            if (status == aVar.getStatus()) {
                return aVar;
            }
            g gVar = g.INSTANCE;
            if (status == gVar.getStatus()) {
                return gVar;
            }
            h hVar = h.INSTANCE;
            if (status == hVar.getStatus()) {
                return hVar;
            }
            k kVar = k.INSTANCE;
            if (status == kVar.getStatus()) {
                return kVar;
            }
            d dVar = d.INSTANCE;
            if (status == dVar.getStatus()) {
                return dVar;
            }
            b bVar = b.INSTANCE;
            if (status == bVar.getStatus()) {
                return bVar;
            }
            j jVar = j.INSTANCE;
            if (status == jVar.getStatus()) {
                return jVar;
            }
            m mVar = m.INSTANCE;
            if (status == mVar.getStatus()) {
                return mVar;
            }
            i iVar = i.INSTANCE;
            if (status == iVar.getStatus()) {
                return iVar;
            }
            n nVar = n.INSTANCE;
            return status == nVar.getStatus() ? nVar : l.INSTANCE;
        }

        @JvmStatic
        @NotNull
        public final String b(@NotNull auc status) {
            Intrinsics.checkNotNullParameter(status, "status");
            f fVar = f.INSTANCE;
            if (Intrinsics.areEqual(status, fVar)) {
                return "NodeDis(" + fVar.getStatus() + ")";
            }
            e eVar = e.INSTANCE;
            if (Intrinsics.areEqual(status, eVar)) {
                return "NodeConn(" + eVar.getStatus() + ")";
            }
            a aVar = a.INSTANCE;
            if (Intrinsics.areEqual(status, aVar)) {
                return "BondConn(" + aVar.getStatus() + ")";
            }
            g gVar = g.INSTANCE;
            if (Intrinsics.areEqual(status, gVar)) {
                return "NodePreConn(" + gVar.getStatus() + ")";
            }
            h hVar = h.INSTANCE;
            if (Intrinsics.areEqual(status, hVar)) {
                return "NodePreDis(" + hVar.getStatus() + ")";
            }
            k kVar = k.INSTANCE;
            if (Intrinsics.areEqual(status, kVar)) {
                return "UnBond(" + kVar.getStatus() + ")";
            }
            if (Intrinsics.areEqual(status, d.INSTANCE)) {
                return "MigrateConn(" + kVar.getStatus() + ")";
            }
            if (Intrinsics.areEqual(status, b.INSTANCE)) {
                return "ClouldBoundSuccess(" + kVar.getStatus() + ")";
            }
            if (Intrinsics.areEqual(status, j.INSTANCE)) {
                return "OafDisabled(" + kVar.getStatus() + ")";
            }
            n nVar = n.INSTANCE;
            if (Intrinsics.areEqual(status, nVar)) {
                return "WifiDisConn(" + nVar.getStatus() + ")";
            }
            m mVar = m.INSTANCE;
            if (Intrinsics.areEqual(status, mVar)) {
                return "WifiConn(" + mVar.getStatus() + ")";
            }
            i iVar = i.INSTANCE;
            if (Intrinsics.areEqual(status, iVar)) {
                return "NodeSwitch(" + iVar.getStatus() + ")";
            }
            return "UnKnown(" + l.INSTANCE.getStatus() + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/oplus/aiunit/vision/auc$d;", "Lcom/oplus/aiunit/vision/auc;", "<init>", "()V", "wearableservicesdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class d extends auc {

        @NotNull
        public static final d INSTANCE = new d();

        public d() {
            super(5, null, false, 6, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/oplus/aiunit/vision/auc$e;", "Lcom/oplus/aiunit/vision/auc;", "<init>", "()V", "wearableservicesdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class e extends auc {

        @NotNull
        public static final e INSTANCE = new e();

        public e() {
            super(2, g.INSTANCE, false, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/oplus/aiunit/vision/auc$f;", "Lcom/oplus/aiunit/vision/auc;", "<init>", "()V", "wearableservicesdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class f extends auc {

        @NotNull
        public static final f INSTANCE = new f();

        public f() {
            super(1, h.INSTANCE, false, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/oplus/aiunit/vision/auc$g;", "Lcom/oplus/aiunit/vision/auc;", "<init>", "()V", "wearableservicesdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class g extends auc {

        @NotNull
        public static final g INSTANCE = new g();

        public g() {
            super(100, null, true, 2, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/oplus/aiunit/vision/auc$h;", "Lcom/oplus/aiunit/vision/auc;", "<init>", "()V", "wearableservicesdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class h extends auc {

        @NotNull
        public static final h INSTANCE = new h();

        public h() {
            super(101, null, true, 2, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/oplus/aiunit/vision/auc$i;", "Lcom/oplus/aiunit/vision/auc;", "<init>", "()V", "wearableservicesdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class i extends auc {

        @NotNull
        public static final i INSTANCE = new i();

        public i() {
            super(8, null, false, 6, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/oplus/aiunit/vision/auc$j;", "Lcom/oplus/aiunit/vision/auc;", "<init>", "()V", "wearableservicesdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class j extends auc {

        @NotNull
        public static final j INSTANCE = new j();

        public j() {
            super(7, null, false, 6, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/oplus/aiunit/vision/auc$k;", "Lcom/oplus/aiunit/vision/auc;", "<init>", "()V", "wearableservicesdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class k extends auc {

        @NotNull
        public static final k INSTANCE = new k();

        public k() {
            super(4, null, false, 6, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/oplus/aiunit/vision/auc$l;", "Lcom/oplus/aiunit/vision/auc;", "<init>", "()V", "wearableservicesdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class l extends auc {

        @NotNull
        public static final l INSTANCE = new l();

        public l() {
            super(0, null, false, 6, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/oplus/aiunit/vision/auc$m;", "Lcom/oplus/aiunit/vision/auc;", "<init>", "()V", "wearableservicesdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class m extends auc {

        @NotNull
        public static final m INSTANCE = new m();

        public m() {
            super(9, null, false, 6, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/oplus/aiunit/vision/auc$n;", "Lcom/oplus/aiunit/vision/auc;", "<init>", "()V", "wearableservicesdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class n extends auc {

        @NotNull
        public static final n INSTANCE = new n();

        public n() {
            super(10, null, false, 6, null);
        }
    }

    public /* synthetic */ auc(int i2, auc aucVar, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, aucVar, z);
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final auc getPreState() {
        return this.preState;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getSingleDispatch() {
        return this.singleDispatch;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(getClass(), other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.oplus.wearable.linkservice.sdk.nodestatus.NodeStatus");
        return this.status == ((auc) other).status;
    }

    public int hashCode() {
        return this.status;
    }

    @NotNull
    public String toString() {
        return INSTANCE.b(this);
    }

    public auc(int i2, auc aucVar, boolean z) {
        this.status = i2;
        this.preState = aucVar;
        this.singleDispatch = z;
    }

    public /* synthetic */ auc(int i2, auc aucVar, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, (i3 & 2) != 0 ? null : aucVar, (i3 & 4) != 0 ? false : z, null);
    }
}
