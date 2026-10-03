package com.heytap.device.data.sporthealth.pull.fetcher;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.heytap.databaseengine.model.EcgDetail;
import com.heytap.health.base.base.BaseApplication;
import com.heytap.health.protocol.fitness.FitnessProto;
import com.heytap.health.protocol.fitness.FitnessProtoV2;
import com.oplus.aiunit.vision.ay4;
import com.oplus.aiunit.vision.e88;
import com.oplus.aiunit.vision.if0;
import com.oplus.aiunit.vision.kq5;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.ne7;
import com.oplus.aiunit.vision.od7;
import com.oplus.aiunit.vision.qr0;
import com.oplus.aiunit.vision.ul4;
import com.oplus.aiunit.vision.vd8;
import com.oplus.aiunit.vision.wl4;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes15.dex */
public class i extends h {
    public Handler p;
    public final a q;
    public ul4.b r;
    public final String t;
    public int u;
    public volatile String w;
    public final String x;
    public final int y;
    public final int z;
    public final String n = "Data-Sync";
    public final String o = BaseApplication.a().getExternalFilesDir(kq5.NOT_SET) + "/sport_record/";
    public final ConcurrentHashMap<String, String> s = new ConcurrentHashMap<>();
    public final int v = 15000;

    public interface a {
        boolean d(i iVar, String str, EcgDetail ecgDetail);
    }

    public class b implements ul4.b {
        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f(String str, od7 od7Var) throws Throwable {
            i.this.J(str, od7Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void g(String str, od7 od7Var) {
            i.this.I(str, od7Var);
        }

        public void a(@NonNull String str, od7 od7Var) {
            if (i.this.s.get(od7Var.h()) != null) {
                i iVar = i.this;
                iVar.P(iVar.u, "Waiting receive file" + od7Var.b() + ", file size:" + od7Var.c());
            }
        }

        public void b(@NonNull final String str, @NonNull final od7 od7Var) {
            h.m.execute(new Runnable() { // from class: com.oplus.aiunit.vision.te6
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    this.i.f(str, od7Var);
                }
            });
        }

        public void c(@NonNull final String str, @NonNull final od7 od7Var) {
            h.m.execute(new Runnable() { // from class: com.oplus.aiunit.vision.se6
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.g(str, od7Var);
                }
            });
        }

        public b() {
        }
    }

    public i(int i, int i2, String str, String str2, a aVar) {
        this.y = i;
        this.z = i2;
        this.t = str;
        this.x = str2;
        this.q = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H(String str) {
        m8b.b("Data-Sync", "On request file timeout, when:" + str);
        O();
        s(5);
    }

    public final EcgDetail E(FitnessProtoV2.ECG_PB ecg_pb) {
        EcgDetail ecgDetail = new EcgDetail();
        ecgDetail.setEcgId(ecg_pb.getEcgId());
        ecgDetail.setAppVersion(ecg_pb.getAppVersion());
        ecgDetail.setHand(ecg_pb.getHand());
        ecgDetail.setFrequency(ecg_pb.getFrequency());
        ecgDetail.setSource(Integer.valueOf(ecg_pb.getSource()));
        ecgDetail.setDuration(ecg_pb.getDuration());
        ecgDetail.setTimeBegin(ecg_pb.getTimeBegin());
        ecgDetail.setTimeEnd(ecg_pb.getTimeEnd());
        ecgDetail.setEcgHeartRate(ecg_pb.getEcgHeartRate());
        ecgDetail.setEcgResultId(String.valueOf(ecg_pb.getEcgResultId()));
        ecgDetail.setEcgResultName(ecg_pb.getEcgResultName());
        ecgDetail.setSymptoms(ecg_pb.getSymptoms());
        ecgDetail.setListHeartrate((String) ecg_pb.getHeartRateList().stream().map(new Function() { // from class: com.oplus.aiunit.vision.re6
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return String.valueOf((Integer) obj);
            }
        }).collect(Collectors.joining(com.heytap.device.data.storage.e.COMMA)));
        ecgDetail.setData((String) ecg_pb.getDataList().stream().map(new Function() { // from class: com.oplus.aiunit.vision.re6
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return String.valueOf((Integer) obj);
            }
        }).collect(Collectors.joining(com.heytap.device.data.storage.e.COMMA)));
        return ecgDetail;
    }

    public final String F(String str) {
        String str2;
        File externalFilesDir = e88.a().getExternalFilesDir(null);
        if (externalFilesDir != null) {
            str2 = externalFilesDir.getAbsolutePath() + "/sport_record/";
        } else {
            str2 = this.o;
        }
        String str3 = str2 + str;
        File file = new File(str3);
        int i = 1;
        while (file.isFile() && file.exists()) {
            file = new File(str3 + "_" + i);
            i++;
        }
        return file.getAbsolutePath();
    }

    public String G() {
        return this.t;
    }

    public void I(String str, od7 od7Var) {
        m8b.f("Data-Sync", "On file transfer request, fileName:" + od7Var.b());
        String strF = F(od7Var.b());
        this.s.put(od7Var.h(), strF);
        boolean zJ = this.d.J(od7Var.h(), strF);
        this.w = od7Var.h();
        if (!zJ) {
            m8b.b("Data-Sync", "Accept file fail,  file_name:" + od7Var.b());
            O();
            s(2);
            return;
        }
        m8b.f("Data-Sync", "Accept file success, file_name:" + od7Var.b());
        M();
        int iC = (int) od7Var.c();
        int iJ = j((long) iC, this.f);
        this.u = iJ;
        P(iJ, "Waiting receive file" + od7Var.b() + ", file size:" + iC);
    }

    public final void J(String str, od7 od7Var) throws Throwable {
        String strRemove = this.s.remove(od7Var.h());
        EcgDetail ecgDetailE = null;
        this.w = null;
        if (strRemove == null) {
            m8b.b("Data-Sync", "File save path is null, is not my file transfer task, taskId=" + od7Var.h());
            return;
        }
        M();
        if (od7Var.a() != 0) {
            m8b.b("Data-Sync", "On FileTransferCompleted error, code=" + od7Var.a());
            s(2);
            O();
            this.s.remove(od7Var.h());
            return;
        }
        od7Var.b();
        if (ay4.HEALTH_ECG_FILE_URI.equals(this.x)) {
            try {
                FileInputStream fileInputStream = new FileInputStream(strRemove);
                try {
                    FitnessProtoV2.ECG_PB from = FitnessProtoV2.ECG_PB.parseFrom(fileInputStream);
                    ecgDetailE = E(from);
                    L(from);
                    fileInputStream.close();
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Exception e) {
                m8b.b("Data-Sync", "Parse pb ecg file fail, error=" + e);
            }
        } else {
            try {
                String strR = ne7.r(new File(strRemove));
                if (strR.startsWith(ay4.PREFIX_ECG_DATA)) {
                    ecgDetailE = (EcgDetail) vd8.a(strR.substring(8), EcgDetail.class);
                }
            } catch (Exception e2) {
                m8b.b("Data-Sync", "Parse json ecg file fail, error=" + e2);
            }
        }
        if (if0.z()) {
            ne7.h(strRemove);
        }
        K(str, ecgDetailE);
    }

    public final void K(String str, EcgDetail ecgDetail) {
        boolean zD;
        if (this.q != null) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(" data = ");
                sb.append(ecgDetail);
                zD = this.q.d(this, str, ecgDetail);
            } catch (Throwable th) {
                m8b.f("Data-Sync", "On save sport record error = " + th);
                zD = false;
            }
        } else {
            zD = false;
        }
        v(zD);
        O();
        s(zD ? 1 : 4);
    }

    public final void L(FitnessProtoV2.ECG_PB ecg_pb) {
        if (ecg_pb.getDataList() != null) {
            int size = ecg_pb.getDataList().size();
            StringBuilder sb = new StringBuilder();
            sb.append(" ecgPBData original data size = ");
            sb.append(size);
            StringBuilder sb2 = new StringBuilder();
            for (int i = 0; i < size; i++) {
                sb2.append(ecg_pb.getDataList().get(i));
                sb2.append(com.heytap.device.data.storage.e.COMMA);
                if (i % 500 == 0) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(" ecgPBData original data ");
                    sb3.append((Object) sb2);
                    sb2.delete(0, sb2.length());
                }
            }
        }
    }

    public final void M() {
        Handler handler = this.p;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public final void N() {
        m8b.f("Data-Sync", "Register file listener, uri=" + this.x);
        qr0.w().L(this.x, this.r);
        m8b.f("Data-Sync", "Send request ecg record rpt file msg, file_name:" + this.t);
        this.d.R(new MessageEvent(this.y, this.z, FitnessProto.StringRequest.newBuilder().setValue(this.t).build().toByteArray()));
        P(15000, "Request rpt file=" + this.t);
    }

    public final void O() {
        m8b.f("Data-Sync", "Unregister file listener, uri=" + this.x);
        qr0.w().V(this.x, this.r);
        if (this.w != null) {
            wl4.devicePrimary.c.cancelFile(this.w);
        }
    }

    public final void P(int i, final String str) {
        if (this.p == null) {
            this.p = new Handler(Looper.getMainLooper());
        }
        this.p.removeCallbacksAndMessages(null);
        this.p.postDelayed(new Runnable() { // from class: com.oplus.aiunit.vision.qe6
            @Override // java.lang.Runnable
            public final void run() {
                this.i.H(str);
            }
        }, i);
    }

    @Override // com.heytap.device.data.sporthealth.pull.fetcher.h
    public String m() {
        return "EcgRecordFetcher";
    }

    @Override // com.heytap.device.data.sporthealth.pull.fetcher.h
    public synchronized void y() {
        if (this.e) {
            return;
        }
        this.e = true;
        if (k(5)) {
            this.r = new b();
            N();
        } else {
            s(2);
        }
    }
}