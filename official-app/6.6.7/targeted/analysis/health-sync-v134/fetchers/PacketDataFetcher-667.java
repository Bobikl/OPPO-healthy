package com.heytap.device.data.sporthealth.pull.fetcher;

import android.text.TextUtils;
import com.google.protobuf.InvalidProtocolBufferException;
import com.heytap.device.data.sporthealth.pull.fetcher.PacketDataFetcher;
import com.heytap.health.devicemanager.deviceability.DeviceInfo;
import com.heytap.health.protocol.fitness.FitnessProto;
import com.heytap.health.protocol.fitness.FitnessProtoV2;
import com.oplus.aiunit.vision.ProcessPacketDataResult;
import com.oplus.aiunit.vision.c8c;
import com.oplus.aiunit.vision.gd5;
import com.oplus.aiunit.vision.if0;
import com.oplus.aiunit.vision.jze;
import com.oplus.aiunit.vision.kq5;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.o3k;
import com.oplus.aiunit.vision.ohi;
import com.oplus.aiunit.vision.s2k;
import com.oplus.aiunit.vision.s5e;
import com.oplus.aiunit.vision.yei;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes15.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\"\u001a\u00020\u0005\u0012\u0006\u0010$\u001a\u00020\u0005\u0012\u0006\u0010&\u001a\u00020\u0005\u0012\u0006\u0010)\u001a\u00020\u0005¢\u0006\u0004\b<\u0010=J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0006\u0010\u0006\u001a\u00020\u0005J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H&J\b\u0010\u000b\u001a\u00020\u0003H\u0002J\b\u0010\f\u001a\u00020\u0005H\u0002J\b\u0010\r\u001a\u00020\u0003H\u0002J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0012\u0010\u0012\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\tH\u0002J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\b\u0010\u0014\u001a\u00020\u0003H\u0002J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\u0017\u001a\u00020\u0003H\u0002J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\b\u001a\u00020\u0007H\u0002R\u0017\u0010\"\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001fR\u0014\u0010&\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u001fR\u0017\u0010)\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b'\u0010\u001f\u001a\u0004\b(\u0010!R\u0014\u0010+\u001a\u00020\u00058\u0002X\u0082D¢\u0006\u0006\n\u0004\b*\u0010\u001fR\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00101\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010\u001fR\u0018\u00104\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00108\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u0010;\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010:¨\u0006>"}, d2 = {"Lcom/heytap/device/data/sporthealth/pull/fetcher/PacketDataFetcher;", "Lcom/oplus/aiunit/vision/s2k;", "Lcom/oplus/aiunit/vision/jze;", kq5.NOT_SET, "y", kq5.NOT_SET, "T", kq5.NOT_SET, "data", "Lcom/oplus/aiunit/vision/kze;", "e", "c0", "V", "Q", "Lcom/oplus/aiunit/vision/c8c$a;", "result", "W", "prePacketDataResult", "K", "X", "N", "Y", "b0", "J", "Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;", "msg", "Lcom/heytap/health/protocol/fitness/FitnessProto$PacketIndexData;", "Z", "Lcom/heytap/health/protocol/fitness/FitnessProtoV2$PacketSummary;", "a0", "p", "I", "getSid", "()I", "sid", "q", "indexCid", "r", "dataCid", "s", "U", "dataType", "t", "DEBUG_TIME_OUT", "Ljava/util/concurrent/atomic/AtomicInteger;", "u", "Ljava/util/concurrent/atomic/AtomicInteger;", "currentFetchIndex", "v", "errorPacket", "w", "Lcom/heytap/health/protocol/fitness/FitnessProto$PacketIndexData;", "packetIndexData", kq5.NOT_SET, "x", "Ljava/lang/String;", "packetSessionId", "Lcom/oplus/aiunit/vision/s5e;", "Lcom/oplus/aiunit/vision/s5e;", "packetDataSaveJob", "<init>", "(IIII)V", "device_data_sync_impl_release"}, k = 1, mv = {1, 8, 0})
public abstract class PacketDataFetcher extends s2k implements jze {

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public final int sid;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public final int indexCid;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public final int dataCid;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public final int dataType;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public final int DEBUG_TIME_OUT = 15000;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    public AtomicInteger currentFetchIndex = new AtomicInteger(0);

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public volatile int errorPacket;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @Nullable
    public volatile FitnessProto.PacketIndexData packetIndexData;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @Nullable
    public String packetSessionId;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @Nullable
    public volatile s5e packetDataSaveJob;

    public PacketDataFetcher(int i, int i2, int i3, int i4) {
        this.sid = i;
        this.indexCid = i2;
        this.dataCid = i3;
        this.dataType = i4;
    }

    public static final void L(final PacketDataFetcher packetDataFetcher, final c8c.a aVar) {
        Intrinsics.checkNotNullParameter(packetDataFetcher, "this$0");
        h.m.execute(new Runnable() { // from class: com.oplus.aiunit.vision.l5e
            @Override // java.lang.Runnable
            public final void run() {
                PacketDataFetcher.M(this.i, aVar);
            }
        });
    }

    public static final void M(PacketDataFetcher packetDataFetcher, c8c.a aVar) {
        Intrinsics.checkNotNullParameter(packetDataFetcher, "this$0");
        Intrinsics.checkNotNullExpressionValue(aVar, "result");
        packetDataFetcher.X(aVar);
    }

    public static final void O(final PacketDataFetcher packetDataFetcher, final long j, final c8c.a aVar) {
        Intrinsics.checkNotNullParameter(packetDataFetcher, "this$0");
        h.m.execute(new Runnable() { // from class: com.oplus.aiunit.vision.p5e
            @Override // java.lang.Runnable
            public final void run() {
                PacketDataFetcher.P(this.i, j, aVar);
            }
        });
    }

    public static final void P(PacketDataFetcher packetDataFetcher, long j, c8c.a aVar) {
        Intrinsics.checkNotNullParameter(packetDataFetcher, "this$0");
        m8b.f("Data-Sync", packetDataFetcher.m() + " device data received cost = " + (System.currentTimeMillis() - j));
        Intrinsics.checkNotNullExpressionValue(aVar, "result");
        packetDataFetcher.Y(aVar);
    }

    public static final void R(final PacketDataFetcher packetDataFetcher, final c8c.a aVar) {
        Intrinsics.checkNotNullParameter(packetDataFetcher, "this$0");
        Intrinsics.checkNotNullParameter(aVar, "result");
        h.m.execute(new Runnable() { // from class: com.oplus.aiunit.vision.q5e
            @Override // java.lang.Runnable
            public final void run() {
                PacketDataFetcher.S(this.i, aVar);
            }
        });
    }

    public static final void S(PacketDataFetcher packetDataFetcher, c8c.a aVar) {
        Intrinsics.checkNotNullParameter(packetDataFetcher, "this$0");
        Intrinsics.checkNotNullParameter(aVar, "$result");
        packetDataFetcher.W(aVar);
    }

    public static final void d0(PacketDataFetcher packetDataFetcher) {
        Intrinsics.checkNotNullParameter(packetDataFetcher, "this$0");
        if (!packetDataFetcher.k(packetDataFetcher.dataType)) {
            packetDataFetcher.s(2);
        } else if (!packetDataFetcher.k || packetDataFetcher.dataType == 18) {
            packetDataFetcher.Q();
        } else {
            packetDataFetcher.N();
        }
    }

    public final synchronized void J() {
        if (this.packetDataSaveJob != null) {
            return;
        }
        String strM = m();
        Intrinsics.checkNotNullExpressionValue(strM, "getFetcherName()");
        this.packetDataSaveJob = new s5e(this, strM);
    }

    public final void K(ProcessPacketDataResult prePacketDataResult) {
        if (this.packetIndexData == null) {
            return;
        }
        int iAddAndGet = this.currentFetchIndex.addAndGet(1);
        FitnessProto.PacketIndexData packetIndexData = this.packetIndexData;
        Intrinsics.checkNotNull(packetIndexData);
        if (iAddAndGet > packetIndexData.getPackTotal()) {
            return;
        }
        FitnessProto.PacketIndexData packetIndexData2 = this.packetIndexData;
        Intrinsics.checkNotNull(packetIndexData2);
        int startTimestamp = packetIndexData2.getStartTimestamp();
        if (prePacketDataResult != null && iAddAndGet > 1) {
            startTimestamp = prePacketDataResult.getNextPacketStartTime();
        }
        FitnessProto.PacketDataRequest.Builder builderNewBuilder = FitnessProto.PacketDataRequest.newBuilder();
        builderNewBuilder.setIndex(iAddAndGet);
        builderNewBuilder.setStartTimestamp(startTimestamp);
        if (!TextUtils.isEmpty(this.packetSessionId)) {
            builderNewBuilder.setSessionId(this.packetSessionId);
        }
        MessageEvent messageEvent = new MessageEvent(this.sid, this.dataCid, builderNewBuilder.build().toByteArray());
        m8b.f("Data-Sync", "Send request packet data, index=" + iAddAndGet + ", dataType=" + this.dataType);
        this.d.T(messageEvent, new c8c() { // from class: com.oplus.aiunit.vision.r5e
            public final void f(c8c.a aVar) {
                PacketDataFetcher.L(this.i, aVar);
            }
        });
    }

    public final void N() {
        FitnessProto.TimeRangeRequest timeRangeRequestZ = z(this.dataType);
        m8b.f("Data-Sync", m() + " Start new agreement packet data request, dataType=" + ohi.a(this.dataType) + ", TimeRange=" + o3k.a(((long) this.n) * 1000) + "~" + o3k.a(((long) this.o) * 1000));
        MessageEvent messageEvent = new MessageEvent(this.sid, this.dataCid, timeRangeRequestZ.toByteArray());
        final long jCurrentTimeMillis = System.currentTimeMillis();
        String strM = m();
        StringBuilder sb = new StringBuilder();
        sb.append(strM);
        sb.append(" start to request data from device");
        m8b.f("Data-Sync", sb.toString());
        this.d.S(messageEvent, if0.E() ? V() : this.DEBUG_TIME_OUT, new c8c() { // from class: com.oplus.aiunit.vision.o5e
            public final void f(c8c.a aVar) {
                PacketDataFetcher.O(this.i, jCurrentTimeMillis, aVar);
            }
        });
    }

    public final void Q() {
        FitnessProto.TimeRangeRequest timeRangeRequestZ = z(this.dataType);
        m8b.f("Data-Sync", m() + " Start packet index request, dataType=" + ohi.a(this.dataType) + ", TimeRange=" + o3k.a(((long) this.n) * 1000) + "~" + o3k.a(((long) this.o) * 1000));
        this.d.S(new MessageEvent(this.sid, this.indexCid, timeRangeRequestZ.toByteArray()), if0.E() ? V() : this.DEBUG_TIME_OUT, new c8c() { // from class: com.oplus.aiunit.vision.n5e
            public final void f(c8c.a aVar) {
                PacketDataFetcher.R(this.i, aVar);
            }
        });
    }

    public final int T() {
        return this.currentFetchIndex.get();
    }

    /* JADX INFO: renamed from: U, reason: from getter */
    public final int getDataType() {
        return this.dataType;
    }

    public final int V() {
        int iF1 = yei.a(this.f).F1();
        if (this.dataType == 23 && ((Boolean) gd5.c(this.f).a(new Function1<DeviceInfo, Boolean>() { // from class: com.heytap.device.data.sporthealth.pull.fetcher.PacketDataFetcher$getTimeOut$1
            @NotNull
            public final Boolean invoke(@NotNull DeviceInfo deviceInfo) {
                Intrinsics.checkNotNullParameter(deviceInfo, "$this$applyInfo");
                return Boolean.valueOf(deviceInfo.G9());
            }
        })).booleanValue()) {
            return 60000;
        }
        return iF1;
    }

    public final void W(c8c.a result) {
        if (!result.f()) {
            m8b.b("Data-Sync", m() + " Request packet index fail:" + result.b());
            s(result.g() ? 5 : 2);
            return;
        }
        MessageEvent messageEventE = result.e();
        Intrinsics.checkNotNullExpressionValue(messageEventE, "result.respMsg");
        FitnessProto.PacketIndexData packetIndexDataZ = Z(messageEventE);
        if (packetIndexDataZ == null) {
            s(3);
            return;
        }
        this.packetSessionId = packetIndexDataZ.getSessionId();
        m8b.f("Data-Sync", m() + " Packet index resp, packTotal=" + packetIndexDataZ.getPackTotal() + " dayCount:" + packetIndexDataZ.getMaxDayCnt() + " startTime:" + o3k.a(((long) packetIndexDataZ.getStartTimestamp()) * 1000));
        if (packetIndexDataZ.getPackTotal() <= 0) {
            s(1);
            return;
        }
        this.packetIndexData = packetIndexDataZ;
        this.currentFetchIndex.set(0);
        K(null);
    }

    public final void X(c8c.a result) {
        ProcessPacketDataResult processPacketDataResultE;
        if (!result.f()) {
            this.errorPacket++;
            m8b.b("Data-Sync", m() + " On receive packet data error=" + result.b() + ", index=" + this.currentFetchIndex);
        }
        try {
            byte[] data = result.e().getData();
            Intrinsics.checkNotNullExpressionValue(data, "result.respMsg.data");
            processPacketDataResultE = e(data);
        } catch (Exception e) {
            m8b.f("Data-Sync", "processPacketData error " + e.getMessage());
            s(3);
            processPacketDataResultE = null;
        }
        if (processPacketDataResultE == null) {
            s(3);
            m8b.f("Data-Sync", m() + " processPacketResult is null");
            return;
        }
        if (this.errorPacket > 0) {
            s(processPacketDataResultE.getProcessCode());
            return;
        }
        int i = this.currentFetchIndex.get();
        FitnessProto.PacketIndexData packetIndexData = this.packetIndexData;
        Intrinsics.checkNotNull(packetIndexData);
        if (i < packetIndexData.getPackTotal()) {
            K(processPacketDataResultE);
            return;
        }
        this.packetIndexData = null;
        this.currentFetchIndex.set(0);
        s(this.errorPacket != 0 ? 3 : 1);
    }

    public final void Y(c8c.a result) {
        if (result.f()) {
            if (result.e().getData() == null) {
                r(1);
                s(1);
                return;
            } else {
                J();
                byte[] data = result.e().getData();
                Intrinsics.checkNotNullExpressionValue(data, "result.respMsg.data");
                b0(data);
                return;
            }
        }
        m8b.b("Data-Sync", m() + " Request packet index fail:" + result.b());
        s5e s5eVar = this.packetDataSaveJob;
        if (s5eVar != null) {
            s5eVar.j();
        }
        r(result.g() ? 5 : 2);
        s(result.g() ? 5 : 2);
    }

    public final FitnessProto.PacketIndexData Z(MessageEvent msg) {
        try {
            return FitnessProto.PacketIndexData.parseFrom(msg.getData());
        } catch (InvalidProtocolBufferException e) {
            m8b.b("Data-Sync", "parseIndexData: ex " + e.getMessage());
            return null;
        }
    }

    public final FitnessProtoV2.PacketSummary a0(byte[] data) {
        try {
            return FitnessProtoV2.PacketSummary.parseFrom(data);
        } catch (InvalidProtocolBufferException e) {
            m8b.b("Data-Sync", "parseIndexData: ex " + e.getMessage());
            return null;
        }
    }

    public final void b0(byte[] data) {
        FitnessProtoV2.PacketSummary packetSummaryA0 = a0(data);
        if (packetSummaryA0 == null) {
            m8b.f("Data-Sync", m() + " processHasMorePacketData is null");
            s5e s5eVar = this.packetDataSaveJob;
            if (s5eVar != null) {
                s5eVar.j();
            }
            r(3);
            s(3);
            return;
        }
        boolean hasMore = packetSummaryA0.getHasMore();
        m8b.f("Data-Sync", m() + " Packet data resp, hasMore=" + hasMore + " data startTime = " + o3k.a(((long) packetSummaryA0.getStartTime()) * 1000) + " endTime = " + o3k.a(((long) packetSummaryA0.getEndTime()) * 1000));
        if (!hasMore) {
            r(1);
        }
        s5e s5eVar2 = this.packetDataSaveJob;
        if (s5eVar2 != null) {
            s5eVar2.f(data);
        }
        s5e s5eVar3 = this.packetDataSaveJob;
        Boolean boolValueOf = s5eVar3 != null ? Boolean.valueOf(s5eVar3.g()) : null;
        if (!hasMore || Intrinsics.areEqual(boolValueOf, Boolean.TRUE)) {
            s5e s5eVar4 = this.packetDataSaveJob;
            Integer numValueOf = s5eVar4 != null ? Integer.valueOf(s5eVar4.j()) : null;
            s(numValueOf != null ? numValueOf.intValue() : 1);
        } else {
            this.n = packetSummaryA0.getEndTime();
            this.o = (int) (System.currentTimeMillis() / 1000);
            N();
        }
    }

    public final void c0() {
        this.e = true;
        this.packetIndexData = null;
        this.errorPacket = 0;
        this.currentFetchIndex.set(0);
    }

    @NotNull
    public abstract ProcessPacketDataResult e(@NotNull byte[] data);

    @Override // com.heytap.device.data.sporthealth.pull.fetcher.h
    public synchronized void y() {
        if (this.e) {
            return;
        }
        c0();
        this.e = true;
        h.m.execute(new Runnable() { // from class: com.oplus.aiunit.vision.m5e
            @Override // java.lang.Runnable
            public final void run() {
                PacketDataFetcher.d0(this.i);
            }
        });
    }
}