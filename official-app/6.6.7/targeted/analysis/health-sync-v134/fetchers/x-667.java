package com.heytap.device.data.sporthealth.pull.fetcher;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.heytap.device.data.sporthealth.pull.fetcher.x;
import com.heytap.device.protocol.bean.SportRecordData;
import com.heytap.health.base.base.BaseApplication;
import com.heytap.health.device.sportrecord.bean.SportRecordV2;
import com.heytap.health.devicemanager.deviceability.DeviceInfo;
import com.heytap.health.protocol.file.FileProto;
import com.heytap.health.protocol.fitness.FitnessProto;
import com.heytap.health.protocol.workout.WorkoutProto;
import com.oplus.aiunit.vision.ay4;
import com.oplus.aiunit.vision.c46;
import com.oplus.aiunit.vision.c8c;
import com.oplus.aiunit.vision.cn;
import com.oplus.aiunit.vision.e88;
import com.oplus.aiunit.vision.gd5;
import com.oplus.aiunit.vision.hv4;
import com.oplus.aiunit.vision.if0;
import com.oplus.aiunit.vision.kq5;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.ne7;
import com.oplus.aiunit.vision.nji;
import com.oplus.aiunit.vision.od7;
import com.oplus.aiunit.vision.qr0;
import com.oplus.aiunit.vision.ul4;
import com.oplus.aiunit.vision.wl4;
import com.oplus.aiunit.vision.yei;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import java.io.File;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes15.dex */
public class x extends h {
    public static int FILE_TYPE_CUSTOMIZE_TLV = 4;
    public static int FILE_TYPE_IWATCH = 5;
    public static int FILE_TYPE_JSON = 1;
    public static int FILE_TYPE_JSON_AND_TLV = 2;
    public static int FILE_TYPE_TLV = 3;
    public volatile String A;
    public Handler p;
    public final b q;
    public SportRecordData r;
    public SportRecordV2 s;
    public ul4.b u;
    public final String w;
    public final int x;
    public int y;
    public final String n = "Data-Sync";
    public final String o = BaseApplication.a().getExternalFilesDir(kq5.NOT_SET) + "/sport_record/";
    public final LinkedList<String> t = new LinkedList<>();
    public final ConcurrentHashMap<String, String> v = new ConcurrentHashMap<>();
    public final int z = 120000;

    public class a implements ul4.b {
        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f(String str, od7 od7Var) {
            x.this.Q(str, od7Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void g(String str, od7 od7Var) {
            x.this.P(str, od7Var);
        }

        public void a(@NonNull String str, od7 od7Var) {
            if (x.this.v.get(od7Var.h()) != null) {
                x xVar = x.this;
                xVar.W(xVar.y, "Waiting receive file" + od7Var.b() + ", file size:" + od7Var.c());
            }
        }

        public void b(@NonNull final String str, @NonNull final od7 od7Var) {
            h.m.execute(new Runnable() { // from class: com.oplus.aiunit.vision.xii
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.f(str, od7Var);
                }
            });
        }

        public void c(@NonNull final String str, @NonNull final od7 od7Var) {
            h.m.execute(new Runnable() { // from class: com.oplus.aiunit.vision.wii
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.g(str, od7Var);
                }
            });
        }

        public a() {
        }
    }

    public interface b {
        boolean g(x xVar, String str, SportRecordData sportRecordData, SportRecordV2 sportRecordV2);
    }

    public x(String str, int i, b bVar) {
        this.w = str;
        this.x = i;
        this.q = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M(c8c.a aVar) {
        m8b.f("Data-Sync", "On request sub file result=" + aVar.b());
    }

    public static /* synthetic */ Boolean N(DeviceInfo deviceInfo) {
        return Boolean.valueOf(deviceInfo.C9() || deviceInfo.H9());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O(String str) {
        m8b.b("Data-Sync", "On request file timeout, when:" + str);
        V();
        s(5);
    }

    public final String H(String str) {
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

    public final void I() {
        if (this.t.isEmpty()) {
            return;
        }
        String strRemoveFirst = this.t.removeFirst();
        this.d.T(new MessageEvent(26, 1, FileProto.FileRequest.newBuilder().setName(strRemoveFirst).setUri(L()).setServiceId(4).build().toByteArray()), new c8c() { // from class: com.oplus.aiunit.vision.vii
            public final void f(c8c.a aVar) {
                this.i.M(aVar);
            }
        });
        W(60000, "Fetch sub file request:" + strRemoveFirst);
        m8b.f("Data-Sync", "Send fetch sub file request:" + strRemoveFirst);
    }

    public int J() {
        return this.x;
    }

    public String K() {
        return this.w;
    }

    public final String L() {
        return ((Boolean) gd5.c(this.f).a(new Function1() { // from class: com.oplus.aiunit.vision.uii
            public final Object invoke(Object obj) {
                return x.N((DeviceInfo) obj);
            }
        })).booleanValue() ? ay4.SPORT_RECORD_FILE_URI_OLD : ay4.SPORT_RECORD_FILE_URI;
    }

    public void P(String str, od7 od7Var) {
        m8b.f("Data-Sync", "On file transfer request, fileName:" + od7Var.b());
        String strH = H(od7Var.b());
        this.v.put(od7Var.h(), strH);
        boolean zJ = this.d.J(od7Var.h(), strH);
        this.A = od7Var.h();
        if (!zJ) {
            m8b.b("Data-Sync", "Accept file fail,  file_name:" + od7Var.b());
            V();
            s(2);
            return;
        }
        m8b.f("Data-Sync", "Accept file success, file_name:" + od7Var.b());
        T();
        int iC = (int) od7Var.c();
        int iJ = j((long) iC, this.f);
        this.y = iJ;
        W(iJ, "Waiting receive file" + od7Var.b() + ", file size:" + iC);
    }

    public final void Q(String str, od7 od7Var) {
        String strRemove = this.v.remove(od7Var.h());
        this.A = null;
        if (strRemove == null) {
            m8b.b("Data-Sync", "File save path is null, is not my file transfer task, taskId=" + od7Var.h());
            return;
        }
        T();
        if (od7Var.a() != 0) {
            m8b.b("Data-Sync", "On FileTransferCompleted error, code=" + od7Var.a());
            s(2);
            V();
            this.v.remove(od7Var.h());
            return;
        }
        String strB = od7Var.b();
        int i = this.x;
        int i2 = FILE_TYPE_JSON;
        if (i == i2 || i == FILE_TYPE_TLV || i == FILE_TYPE_CUSTOMIZE_TLV || i == FILE_TYPE_IWATCH) {
            if (i == i2) {
                this.r = nji.o(new File(strRemove));
            } else if (i == FILE_TYPE_TLV) {
                this.r = nji.p(new File(strRemove));
            } else if (i == FILE_TYPE_CUSTOMIZE_TLV) {
                this.s = nji.m(strRemove);
            } else {
                this.s = nji.n(strRemove);
            }
            if (if0.z()) {
                ne7.h(strRemove);
            }
            SportRecordData sportRecordData = this.r;
            if (sportRecordData != null || this.s != null) {
                R(str, sportRecordData, this.s);
                return;
            }
            com.heytap.health.base.track.a.C().a("ssoid", cn.c().getSsoid()).a("deviceUniqueId", str).a(c46.PARAM_DEVICE_TYPE, hv4.b(str)).a("errorMessage", "解析手表运动记录文件失败").b();
            V();
            s(3);
            return;
        }
        if (i == FILE_TYPE_JSON_AND_TLV) {
            if (!strB.endsWith(".rpt")) {
                if (this.r == null) {
                    s(3);
                    V();
                    if (if0.z()) {
                        ne7.h(strRemove);
                        return;
                    }
                    return;
                }
                if (strB.endsWith(".gps")) {
                    this.r.gpsData = nji.l(new File(strRemove));
                } else if (strB.endsWith(".dts")) {
                    this.r.detailData = nji.k(new File(strRemove));
                }
                if (if0.z()) {
                    ne7.h(strRemove);
                }
                if (this.t.isEmpty()) {
                    R(str, this.r, this.s);
                    return;
                } else {
                    I();
                    return;
                }
            }
            m8b.f("Data-Sync", "Receive rpt file success:" + strB);
            this.r = nji.o(new File(strRemove));
            if (if0.z()) {
                ne7.h(strRemove);
            }
            if (this.r == null) {
                m8b.b("Data-Sync", "Parse sport rpt file fail:" + strB);
                V();
                s(3);
                return;
            }
            m8b.f("Data-Sync", "On Get Sport Report:" + this.r.toString());
            this.t.clear();
            if (!TextUtils.isEmpty(this.r.detailDataFilePath)) {
                this.t.add(this.r.detailDataFilePath);
            }
            if (!TextUtils.isEmpty(this.r.gpsDataFilePath)) {
                this.t.add(this.r.gpsDataFilePath);
            }
            m8b.f("Data-Sync", "Sub file list:" + this.t.toString());
            if (!this.t.isEmpty()) {
                I();
                return;
            }
            m8b.b("Data-Sync", "Sub file is zero, on get record success:" + strB);
            R(str, this.r, this.s);
        }
    }

    public final void R(String str, SportRecordData sportRecordData, SportRecordV2 sportRecordV2) {
        boolean zG;
        if (this.q != null) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(" data = ");
                sb.append(sportRecordData);
                sb.append(" dataV2 = ");
                sb.append(sportRecordV2);
                zG = this.q.g(this, str, sportRecordData, sportRecordV2);
            } catch (Throwable th) {
                m8b.f("Data-Sync", "On save sport record error = " + th);
                zG = false;
            }
        } else {
            zG = false;
        }
        v(zG);
        V();
        s(zG ? 1 : 4);
    }

    public final void S(@NotNull c8c.a aVar) {
        WorkoutProto.SportRecordResponse from;
        if (aVar.f()) {
            try {
                from = WorkoutProto.SportRecordResponse.parseFrom(aVar.e().getData());
            } catch (Exception e) {
                m8b.b("Data-Sync", " parse sport record: ex " + e);
                from = null;
            }
            if (from != null) {
                m8b.f("Data-Sync", "sportId =" + from.getSportId() + " sportId status = " + from.getSportIdStatus());
                if (TextUtils.equals(from.getSportId(), this.w) && from.getSportIdStatus() == 0) {
                    T();
                    V();
                    s(3);
                }
            }
        }
    }

    public final void T() {
        Handler handler = this.p;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public final void U() {
        m8b.f("Data-Sync", "Register file listener, uri=" + L());
        qr0.w().L(L(), this.u);
        m8b.f("Data-Sync", "Send request sport record rpt file msg, file_name:" + this.w + " file_type:" + this.x);
        this.d.T(new MessageEvent(4, 2, FitnessProto.StringRequest.newBuilder().setValue(this.w).build().toByteArray()), new c8c() { // from class: com.oplus.aiunit.vision.sii
            public final void f(c8c.a aVar) {
                this.i.S(aVar);
            }
        });
        W(yei.a(this.f).e4() ? 120000 : 60000, "Request rpt file=" + this.w);
    }

    public final void V() {
        m8b.f("Data-Sync", "Unregister file listener, uri=" + L());
        qr0.w().V(L(), this.u);
        if (this.A != null) {
            wl4.devicePrimary.c.cancelFile(this.A);
        }
    }

    public final void W(int i, final String str) {
        if (this.p == null) {
            this.p = new Handler(Looper.getMainLooper());
        }
        this.p.removeCallbacksAndMessages(null);
        this.p.postDelayed(new Runnable() { // from class: com.oplus.aiunit.vision.tii
            @Override // java.lang.Runnable
            public final void run() {
                this.i.O(str);
            }
        }, i);
    }

    @Override // com.heytap.device.data.sporthealth.pull.fetcher.h
    public String m() {
        return "SportRecordFetcher";
    }

    @Override // com.heytap.device.data.sporthealth.pull.fetcher.h
    public synchronized void y() {
        if (this.e) {
            return;
        }
        this.e = true;
        if (k(5)) {
            this.u = new a();
            U();
        } else {
            s(2);
        }
    }
}