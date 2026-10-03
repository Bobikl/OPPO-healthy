package com.heytap.device.data.sporthealth.pull.fetcher;

import com.google.protobuf.InvalidProtocolBufferException;
import com.heytap.device.data.sporthealth.pull.fetcher.d;
import com.heytap.health.protocol.fitness.FitnessProto;
import com.oplus.aiunit.vision.c8c;
import com.oplus.aiunit.vision.kq5;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.qr0;
import com.oplus.aiunit.vision.s2k;
import com.oplus.aiunit.vision.v2e;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes15.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/heytap/device/data/sporthealth/pull/fetcher/d;", "Lcom/oplus/aiunit/vision/s2k;", kq5.NOT_SET, "m", kq5.NOT_SET, "y", kq5.NOT_SET, "byteData", "E", kq5.NOT_SET, "p", "I", "dataType", "<init>", "()V", "device_data_sync_impl_release"}, k = 1, mv = {1, 8, 0})
public final class d extends s2k {

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public final int dataType = 27;

    public static final void F(final d dVar, final c8c.a aVar) {
        Intrinsics.checkNotNullParameter(dVar, "this$0");
        Intrinsics.checkNotNullParameter(aVar, "result");
        if (aVar.f()) {
            h.m.execute(new Runnable() { // from class: com.oplus.aiunit.vision.mt1
                @Override // java.lang.Runnable
                public final void run() {
                    d.G(this.i, aVar);
                }
            });
            return;
        }
        m8b.b("Data-Sync", "Fetch blood sugar device data fail, error=" + aVar.b());
        dVar.s(2);
    }

    public static final void G(d dVar, c8c.a aVar) {
        Intrinsics.checkNotNullParameter(dVar, "this$0");
        Intrinsics.checkNotNullParameter(aVar, "$result");
        byte[] data = aVar.e().getData();
        Intrinsics.checkNotNullExpressionValue(data, "result.respMsg.data");
        dVar.E(data);
    }

    public final void E(byte[] byteData) {
        boolean zB;
        try {
            FitnessProto.BloodSugarDeviceState from = FitnessProto.BloodSugarDeviceState.parseFrom(byteData);
            String strB = v2e.b(from);
            StringBuilder sb = new StringBuilder();
            sb.append("Get blood sugar device data=");
            sb.append(strB);
            if (from == null) {
                s(1);
                return;
            }
            try {
                com.heytap.device.data.storage.b.Companion companion = com.heytap.device.data.storage.b.INSTANCE;
                String str = this.f;
                Intrinsics.checkNotNullExpressionValue(str, "deviceMac");
                zB = companion.b(from, str);
            } catch (Exception e) {
                m8b.b("Data-Sync", "Save blood sugar device state fail=" + e);
                zB = false;
            }
            if (zB) {
                int timeStamp = from.getTimeStamp();
                u(this.dataType, timeStamp);
                x(from.getTimeStamp());
                w(timeStamp);
                v(true);
            }
            s(zB ? 1 : 4);
        } catch (InvalidProtocolBufferException e2) {
            m8b.b("Data-Sync", "Parse blood sugar device data error=" + e2);
            s(3);
        }
    }

    @Override // com.heytap.device.data.sporthealth.pull.fetcher.h
    @NotNull
    public String m() {
        return "BloodSugarDeviceDataFetcher";
    }

    @Override // com.heytap.device.data.sporthealth.pull.fetcher.h
    public void y() {
        if (this.e) {
            return;
        }
        this.e = true;
        if (!k(this.dataType)) {
            s(2);
            return;
        }
        FitnessProto.TimeRangeRequest timeRangeRequestZ = z(this.dataType);
        m8b.f("Data-Sync", "Start fetch blood sugar device data, timeRange=" + this.n + "-" + this.o);
        qr0.w().T(new MessageEvent(5, this.k ? 170 : 119, timeRangeRequestZ.toByteArray()), new c8c() { // from class: com.oplus.aiunit.vision.lt1
            public final void f(c8c.a aVar) {
                d.F(this.i, aVar);
            }
        });
    }
}