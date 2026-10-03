package com.oplus.aiunit.vision;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00172\u00020\u0001:\u000e\t\u000e\u000b\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"B'\b\u0004\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0000\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0017\u0010\r\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00008\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\t\u0010\u0010R\u0017\u0010\u0014\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0012\u001a\u0004\b\u000e\u0010\u0013\u0082\u0001\r#$%&'()*+,-./¨\u00060"}, d2 = {"Lcom/oplus/aiunit/vision/svc;", "", "other", "", "equals", "", "hashCode", "", "toString", "a", "I", "c", "()I", "status", "b", "Lcom/oplus/aiunit/vision/svc;", "()Lcom/oplus/aiunit/vision/svc;", "preState", "Z", "()Z", "singleDispatch", "<init>", "(ILcom/oplus/aiunit/vision/svc;Z)V", "Companion", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "Lcom/oplus/aiunit/vision/svc$a;", "Lcom/oplus/aiunit/vision/svc$b;", "Lcom/oplus/aiunit/vision/svc$d;", "Lcom/oplus/aiunit/vision/svc$e;", "Lcom/oplus/aiunit/vision/svc$f;", "Lcom/oplus/aiunit/vision/svc$g;", "Lcom/oplus/aiunit/vision/svc$h;", "Lcom/oplus/aiunit/vision/svc$i;", "Lcom/oplus/aiunit/vision/svc$j;", "Lcom/oplus/aiunit/vision/svc$k;", "Lcom/oplus/aiunit/vision/svc$l;", "Lcom/oplus/aiunit/vision/svc$m;", "Lcom/oplus/aiunit/vision/svc$n;", "wearableservicesdk_release"}, k = 1, mv = {1, 8, 0})
public abstract class svc {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public final int a;

    @Nullable
    public final svc b;
    public final boolean c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/oplus/aiunit/vision/svc$a;", "Lcom/oplus/aiunit/vision/svc;", "<init>", "()V", "wearableservicesdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a extends svc {

        @NotNull
        public static final a INSTANCE = new a();

        public a() {
            super(3, null, false, 6, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/oplus/aiunit/vision/svc$b;", "Lcom/oplus/aiunit/vision/svc;", "<init>", "()V", "wearableservicesdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class b extends svc {

        @NotNull
        public static final b INSTANCE = new b();

        public b() {
            super(6, null, false, 6, null);
        }
    }

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.svc$c, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\n"}, d2 = {"Lcom/oplus/aiunit/vision/svc$c;", "", "", "status", "Lcom/oplus/aiunit/vision/svc;", "a", "", "b", "<init>", "()V", "wearableservicesdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final svc a(int status) {
            f fVar = f.INSTANCE;
            if (status == fVar.getA()) {
                return fVar;
            }
            e eVar = e.INSTANCE;
            if (status == eVar.getA()) {
                return eVar;
            }
            a aVar = a.INSTANCE;
            if (status == aVar.getA()) {
                return aVar;
            }
            g gVar = g.INSTANCE;
            if (status == gVar.getA()) {
                return gVar;
            }
            h hVar = h.INSTANCE;
            if (status == hVar.getA()) {
                return hVar;
            }
            k kVar = k.INSTANCE;
            if (status == kVar.getA()) {
                return kVar;
            }
            d dVar = d.INSTANCE;
            if (status == dVar.getA()) {
                return dVar;
            }
            b bVar = b.INSTANCE;
            if (status == bVar.getA()) {
                return bVar;
            }
            j jVar = j.INSTANCE;
            if (status == jVar.getA()) {
                return jVar;
            }
            m mVar = m.INSTANCE;
            if (status == mVar.getA()) {
                return mVar;
            }
            i iVar = i.INSTANCE;
            if (status == iVar.getA()) {
                return iVar;
            }
            n nVar = n.INSTANCE;
            return status == nVar.getA() ? nVar : l.INSTANCE;
        }

        @JvmStatic
        @NotNull
        public final String b(@NotNull svc status) {
            Intrinsics.checkNotNullParameter(status, "status");
            f fVar = f.INSTANCE;
            if (Intrinsics.areEqual(status, fVar)) {
                return "NodeDis(" + fVar.getA() + ")";
            }
            e eVar = e.INSTANCE;
            if (Intrinsics.areEqual(status, eVar)) {
                return "NodeConn(" + eVar.getA() + ")";
            }
            a aVar = a.INSTANCE;
            if (Intrinsics.areEqual(status, aVar)) {
                return "BondConn(" + aVar.getA() + ")";
            }
            g gVar = g.INSTANCE;
            if (Intrinsics.areEqual(status, gVar)) {
                return "NodePreConn(" + gVar.getA() + ")";
            }
            h hVar = h.INSTANCE;
            if (Intrinsics.areEqual(status, hVar)) {
                return "NodePreDis(" + hVar.getA() + ")";
            }
            k kVar = k.INSTANCE;
            if (Intrinsics.areEqual(status, kVar)) {
                return "UnBond(" + kVar.getA() + ")";
            }
            if (Intrinsics.areEqual(status, d.INSTANCE)) {
                return "MigrateConn(" + kVar.getA() + ")";
            }
            if (Intrinsics.areEqual(status, b.INSTANCE)) {
                return "ClouldBoundSuccess(" + kVar.getA() + ")";
            }
            if (Intrinsics.areEqual(status, j.INSTANCE)) {
                return "OafDisabled(" + kVar.getA() + ")";
            }
            n nVar = n.INSTANCE;
            if (Intrinsics.areEqual(status, nVar)) {
                return "WifiDisConn(" + nVar.getA() + ")";
            }
            m mVar = m.INSTANCE;
            if (Intrinsics.areEqual(status, mVar)) {
                return "WifiConn(" + mVar.getA() + ")";
            }
            i iVar = i.INSTANCE;
            if (Intrinsics.areEqual(status, iVar)) {
                return "NodeSwitch(" + iVar.getA() + ")";
            }
            return "UnKnown(" + l.INSTANCE.getA() + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/oplus/aiunit/vision/svc$d;", "Lcom/oplus/aiunit/vision/svc;", "<init>", "()V", "wearableservicesdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class d extends svc {

        @NotNull
        public static final d INSTANCE = new d();

        public d() {
            super(5, null, false, 6, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/oplus/aiunit/vision/svc$e;", "Lcom/oplus/aiunit/vision/svc;", "<init>", "()V", "wearableservicesdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class e extends svc {

        @NotNull
        public static final e INSTANCE = new e();

        public e() {
            super(2, g.INSTANCE, false, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/oplus/aiunit/vision/svc$f;", "Lcom/oplus/aiunit/vision/svc;", "<init>", "()V", "wearableservicesdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class f extends svc {

        @NotNull
        public static final f INSTANCE = new f();

        public f() {
            super(1, h.INSTANCE, false, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/oplus/aiunit/vision/svc$g;", "Lcom/oplus/aiunit/vision/svc;", "<init>", "()V", "wearableservicesdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class g extends svc {

        @NotNull
        public static final g INSTANCE = new g();

        public g() {
            super(100, null, true, 2, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/oplus/aiunit/vision/svc$h;", "Lcom/oplus/aiunit/vision/svc;", "<init>", "()V", "wearableservicesdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class h extends svc {

        @NotNull
        public static final h INSTANCE = new h();

        public h() {
            super(101, null, true, 2, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/oplus/aiunit/vision/svc$i;", "Lcom/oplus/aiunit/vision/svc;", "<init>", "()V", "wearableservicesdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class i extends svc {

        @NotNull
        public static final i INSTANCE = new i();

        public i() {
            super(8, null, false, 6, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/oplus/aiunit/vision/svc$j;", "Lcom/oplus/aiunit/vision/svc;", "<init>", "()V", "wearableservicesdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class j extends svc {

        @NotNull
        public static final j INSTANCE = new j();

        public j() {
            super(7, null, false, 6, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/oplus/aiunit/vision/svc$k;", "Lcom/oplus/aiunit/vision/svc;", "<init>", "()V", "wearableservicesdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class k extends svc {

        @NotNull
        public static final k INSTANCE = new k();

        public k() {
            super(4, null, false, 6, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/oplus/aiunit/vision/svc$l;", "Lcom/oplus/aiunit/vision/svc;", "<init>", "()V", "wearableservicesdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class l extends svc {

        @NotNull
        public static final l INSTANCE = new l();

        public l() {
            super(0, null, false, 6, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/oplus/aiunit/vision/svc$m;", "Lcom/oplus/aiunit/vision/svc;", "<init>", "()V", "wearableservicesdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class m extends svc {

        @NotNull
        public static final m INSTANCE = new m();

        public m() {
            super(9, null, false, 6, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/oplus/aiunit/vision/svc$n;", "Lcom/oplus/aiunit/vision/svc;", "<init>", "()V", "wearableservicesdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class n extends svc {

        @NotNull
        public static final n INSTANCE = new n();

        public n() {
            super(10, null, false, 6, null);
        }
    }

    public /* synthetic */ svc(int i2, svc svcVar, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, svcVar, z);
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final svc getB() {
        return this.b;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getC() {
        return this.c;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getA() {
        return this.a;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(getClass(), other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.oplus.wearable.linkservice.sdk.nodestatus.NodeStatus");
        return this.a == ((svc) other).a;
    }

    public int hashCode() {
        return this.a;
    }

    @NotNull
    public String toString() {
        return INSTANCE.b(this);
    }

    public svc(int i2, svc svcVar, boolean z) {
        this.a = i2;
        this.b = svcVar;
        this.c = z;
    }

    public /* synthetic */ svc(int i2, svc svcVar, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, (i3 & 2) != 0 ? null : svcVar, (i3 & 4) != 0 ? false : z, null);
    }
}
