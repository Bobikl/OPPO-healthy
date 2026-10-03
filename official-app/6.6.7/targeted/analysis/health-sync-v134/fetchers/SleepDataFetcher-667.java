package com.heytap.device.data.sporthealth.pull.fetcher;

import android.text.TextUtils;
import com.google.protobuf.ByteString;
import com.heytap.device.data.sporthealth.pull.fetcher.SleepDataFetcher;
import com.heytap.device.data.storage.SleepDataRepository;
import com.heytap.health.devicemanager.deviceability.DeviceModel;
import com.heytap.health.protocol.fitness.FitnessProto;
import com.heytap.health.protocol.fitness.FitnessProtoV2;
import com.oplus.aiunit.vision.ProcessPacketDataResult;
import com.oplus.aiunit.vision.gd5;
import com.oplus.aiunit.vision.if0;
import com.oplus.aiunit.vision.j6e;
import com.oplus.aiunit.vision.kq5;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.nq5;
import com.oplus.aiunit.vision.o3k;
import com.oplus.aiunit.vision.v2e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes15.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\nH\u0002J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\rH\u0002J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0002H\u0002J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\nH\u0002J\u0010\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\nH\u0002J\u0012\u0010\u0015\u001a\u00020\u00142\b\u0010\u0005\u001a\u0004\u0018\u00010\rH\u0002J\u0010\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\nH\u0002¨\u0006\u0019"}, d2 = {"Lcom/heytap/device/data/sporthealth/pull/fetcher/SleepDataFetcher;", "Lcom/heytap/device/data/sporthealth/pull/fetcher/PacketDataFetcher;", kq5.NOT_SET, "m", kq5.NOT_SET, "data", "Lcom/oplus/aiunit/vision/kze;", "e", "q0", "p0", "Lcom/heytap/health/protocol/fitness/FitnessProto$SleepData;", kq5.NOT_SET, "i0", "Lcom/heytap/health/protocol/fitness/FitnessProtoV2$SleepDataV2;", "j0", "deviceMac", "k0", kq5.NOT_SET, "g0", "h0", kq5.NOT_SET, "m0", "l0", "<init>", "()V", "device_data_sync_impl_release"}, k = 1, mv = {1, 8, 0})
public final class SleepDataFetcher extends PacketDataFetcher {
    public SleepDataFetcher() {
        super(5, 13, 14, 3);
    }

    public static final String n0(List list, int i) {
        return ((FitnessProtoV2.SleepDataItemV2) list.get(i)).getState() + com.heytap.device.data.storage.e.COMMA;
    }

    public static final String o0(ByteString byteString, int i) {
        return ((int) byteString.byteAt(i)) + com.heytap.device.data.storage.e.COMMA;
    }

    @Override // com.heytap.device.data.sporthealth.pull.fetcher.PacketDataFetcher, com.oplus.aiunit.vision.jze
    @NotNull
    public ProcessPacketDataResult e(@NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return this.k ? p0(data) : q0(data);
    }

    public final int g0(FitnessProto.SleepData data) {
        int startTime = data.getStartTime();
        return (data.getState() == null || data.getState().size() <= 0) ? startTime : startTime + ((data.getState().size() - 1) * 60) + 1;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003b  */
    /* JADX WARN: Code duplicated, block: B:29:? A[RETURN, SYNTHETIC] */
    public final int h0(FitnessProto.SleepData data) {
        boolean z;
        int startTime = data.getStartTime();
        if (data.getState() == null || data.getState().size() == 0) {
            return 0;
        }
        ByteString state = data.getState();
        for (int size = state.size() - 1; size >= 0; size--) {
            int iByteAt = state.byteAt(size) & 7;
            if (iByteAt == 1 || iByteAt == 2 || iByteAt == 3 || iByteAt == 4) {
                z = true;
                if (z) {
                    return startTime + (size * 60) + 1;
                }
                return 0;
            }
        }
        z = false;
        if (z) {
            return startTime + (size * 60) + 1;
        }
        return 0;
    }

    public final boolean i0(FitnessProto.SleepData data) {
        ByteString state = data.getState();
        int size = state.size();
        for (int i = 0; i < size; i++) {
            int iByteAt = state.byteAt(i) & 7;
            if (iByteAt == 1 || iByteAt == 2 || iByteAt == 3) {
                return true;
            }
        }
        return false;
    }

    public final boolean j0(FitnessProtoV2.SleepDataV2 data) {
        List dataList = data.getDataList();
        int size = data.getDataList().size();
        for (int i = 0; i < size; i++) {
            int state = ((FitnessProtoV2.SleepDataItemV2) dataList.get(i)).getState() & 7;
            if (state == 1 || state == 2 || state == 3) {
                return true;
            }
        }
        return false;
    }

    public final boolean k0(String deviceMac) {
        String strC = nq5.c(deviceMac);
        if (TextUtils.isEmpty(strC)) {
            return false;
        }
        return ((Boolean) gd5.d(strC).a(new Function1<DeviceModel, Boolean>() { // from class: com.heytap.device.data.sporthealth.pull.fetcher.SleepDataFetcher$isSmartWatch$1
            @NotNull
            public final Boolean invoke(@NotNull DeviceModel deviceModel) {
                Intrinsics.checkNotNullParameter(deviceModel, "$this$applyMode");
                return Boolean.valueOf(deviceModel.M9());
            }
        })).booleanValue();
    }

    public final void l0(FitnessProto.SleepData data) {
        if (if0.w()) {
            final ByteString state = data.getState();
            m8b.f("Data-Sync", "Sleep data startTime=" + o3k.a(((long) data.getStartTime()) * 1000) + ", totalCount=" + state.size());
            j6e.a("Data-Sync", "Sleep", state.size(), 60, new j6e.a() { // from class: com.oplus.aiunit.vision.nfh
                @Override // com.oplus.aiunit.vision.j6e.a
                public final String a(int i) {
                    return SleepDataFetcher.o0(state, i);
                }
            });
        }
    }

    @Override // com.heytap.device.data.sporthealth.pull.fetcher.h
    @NotNull
    public String m() {
        return "SleepDataFetcher";
    }

    public final void m0(FitnessProtoV2.SleepDataV2 data) {
        if (!if0.w() || data == null) {
            return;
        }
        final List dataList = data.getDataList();
        m8b.f("Data-Sync", "Sleep data startTime=" + o3k.a(((long) data.getStartTime()) * 1000) + ", totalCount=" + dataList.size());
        j6e.a("Data-Sync", "Sleep", dataList.size(), 60, new j6e.a() { // from class: com.oplus.aiunit.vision.ofh
            @Override // com.oplus.aiunit.vision.j6e.a
            public final String a(int i) {
                return SleepDataFetcher.n0(dataList, i);
            }
        });
    }

    public final ProcessPacketDataResult p0(byte[] data) {
        FitnessProtoV2.SleepDataV2 from;
        ProcessPacketDataResult processPacketDataResult = new ProcessPacketDataResult(1, 0);
        try {
            from = FitnessProtoV2.SleepDataV2.parseFrom(data);
        } catch (Exception unused) {
            m8b.b("Data-Sync", m() + " errorPacketData=" + v2e.a(data));
            from = null;
        }
        if (from != null) {
            m8b.f("Data-Sync", "On SleepData packet, startTime= " + o3k.a(((long) from.getStartTime()) * 1000) + "  hasMore = " + from.getHasMore());
            m0(from);
            List dataList = from.getDataList();
            if (dataList == null || dataList.isEmpty()) {
                processPacketDataResult.d(1);
                return processPacketDataResult;
            }
            SleepDataRepository.Companion companion = SleepDataRepository.INSTANCE;
            String str = this.f;
            Intrinsics.checkNotNullExpressionValue(str, "deviceMac");
            if (companion.d(from, str)) {
                int endTime = from.getEndTime();
                m8b.f("Data-Sync", " lastSleepItemTime = " + endTime);
                if (endTime > 0) {
                    u(getDataType(), endTime);
                    x(from.getStartTime());
                    w(endTime);
                    v(j0(from));
                }
                processPacketDataResult.d(1);
                processPacketDataResult.c(endTime);
            } else {
                processPacketDataResult.d(4);
            }
        } else {
            processPacketDataResult.d(3);
        }
        return processPacketDataResult;
    }

    public final ProcessPacketDataResult q0(byte[] data) {
        FitnessProto.SleepData from;
        ProcessPacketDataResult processPacketDataResult = new ProcessPacketDataResult(1, 0);
        try {
            from = FitnessProto.SleepData.parseFrom(data);
        } catch (Exception unused) {
            m8b.b("Data-Sync", m() + " errorPacketData=" + v2e.a(data));
            from = null;
        }
        if (from != null) {
            l0(from);
            SleepDataRepository.Companion companion = SleepDataRepository.INSTANCE;
            String str = this.f;
            Intrinsics.checkNotNullExpressionValue(str, "deviceMac");
            if (companion.c(from, str)) {
                String str2 = this.f;
                Intrinsics.checkNotNullExpressionValue(str2, "deviceMac");
                int iH0 = k0(str2) ? h0(from) : g0(from);
                m8b.f("Data-Sync", " lastSleepItemTime = " + iH0);
                if (iH0 > 0) {
                    u(getDataType(), iH0);
                    x(from.getStartTime());
                    w(iH0 - 1);
                    v(i0(from));
                }
                processPacketDataResult.d(1);
                processPacketDataResult.c(iH0);
            } else {
                processPacketDataResult.d(4);
            }
        } else {
            processPacketDataResult.d(3);
        }
        return processPacketDataResult;
    }
}