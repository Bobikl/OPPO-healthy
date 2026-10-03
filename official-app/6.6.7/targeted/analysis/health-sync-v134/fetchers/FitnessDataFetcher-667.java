package com.heytap.device.data.sporthealth.pull.fetcher;

import android.content.Context;
import com.google.gson.reflect.TypeToken;
import com.google.protobuf.InvalidProtocolBufferException;
import com.heytap.health.protocol.fitness.FitnessProto;
import com.heytap.health.protocol.workout.WorkoutProto;
import com.heytap.wsport.data.FitRecordDataRead;
import com.oplus.aiunit.vision.ay4;
import com.oplus.aiunit.vision.c8c;
import com.oplus.aiunit.vision.e88;
import com.oplus.aiunit.vision.gv4;
import com.oplus.aiunit.vision.if0;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.ne7;
import com.oplus.aiunit.vision.o3k;
import com.oplus.aiunit.vision.od7;
import com.oplus.aiunit.vision.qr0;
import com.oplus.aiunit.vision.s2k;
import com.oplus.aiunit.vision.vd8;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes15.dex */
public class FitnessDataFetcher extends s2k implements j.b {
    public static final String SPORT_FITNESS_FILE_SAVE_DIR = "sport_fitness_record";
    public j p;
    public String q;

    public class a implements j.c {
        public a() {
        }

        @Override // com.heytap.device.data.sporthealth.pull.fetcher.j.c
        public String a(od7 od7Var) {
            return od7Var.b();
        }

        @Override // com.heytap.device.data.sporthealth.pull.fetcher.j.c
        public boolean b(od7 od7Var) {
            return "fit_record_list_trainform".equals(od7Var.b());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G(c8c.a aVar) {
        if (aVar.f()) {
            try {
                if (WorkoutProto.ErrorCode.parseFrom(aVar.e().getData()).getCode() != 100000) {
                    m8b.f("Data-Sync", "Fitness record is empty");
                    c();
                }
            } catch (InvalidProtocolBufferException e) {
                m8b.b("Data-Sync", "requestFitnessFileList: ex " + e);
                s(3);
            }
        }
    }

    public final String E() {
        if (this.q == null) {
            Context contextA = e88.a();
            File externalFilesDir = contextA.getExternalFilesDir(null);
            if (externalFilesDir == null) {
                externalFilesDir = contextA.getFilesDir();
            }
            this.q = externalFilesDir.getAbsolutePath() + File.separator + SPORT_FITNESS_FILE_SAVE_DIR;
        }
        return this.q;
    }

    public final void H() {
        J();
        FitnessProto.TimeRangeRequest timeRangeRequestZ = z(9);
        m8b.f("Data-Sync", "Fetch fitness record time range:" + o3k.a(((long) this.n) * 1000) + "~" + o3k.a(((long) this.o) * 1000));
        qr0.w().T(new MessageEvent(4, 9, timeRangeRequestZ.toByteArray()), new c8c() { // from class: com.oplus.aiunit.vision.mi7
            public final void f(c8c.a aVar) {
                this.i.G(aVar);
            }
        });
    }

    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public final void F(String str, String str2) {
        try {
            String strR = ne7.r(new File(str2));
            if (strR.startsWith("FitRecordData:")) {
                List list = (List) vd8.b(strR.substring(14), new TypeToken<List<FitRecordDataRead.VoocFitDetail>>() { // from class: com.heytap.device.data.sporthealth.pull.fetcher.FitnessDataFetcher.2
                }.getType());
                StringBuilder sb = new StringBuilder();
                sb.append("On got fitness record list, size=");
                sb.append(list != null ? Integer.valueOf(list.size()) : "null");
                m8b.f("Data-Sync", sb.toString());
                if (list != null && list.size() > 0) {
                    if (gv4.l(list, str)) {
                        int timeEnd = ((int) ((FitRecordDataRead.VoocFitDetail) list.get(list.size() - 1)).getTimeEnd()) + 1;
                        u(9, timeEnd);
                        x((int) ((FitRecordDataRead.VoocFitDetail) list.get(0)).getTimeBegin());
                        w(timeEnd);
                    } else {
                        m8b.f("Data-Sync", "Save fitness record fail, fitness record size=" + list.size());
                        f(3);
                    }
                }
            } else {
                m8b.f("Data-Sync", "Parse fitness record data fail");
                f(3);
            }
        } catch (IOException unused) {
            f(3);
        } finally {
            if (if0.E()) {
                ne7.h(str2);
            }
        }
    }

    public final void J() {
        j jVar = new j(ay4.SPORT_RECORD_FILE_URI, E(), 1);
        this.p = jVar;
        jVar.m(new a());
        this.p.l(this);
        this.p.n();
    }

    @Override // com.heytap.device.data.sporthealth.pull.fetcher.j.b
    public void b(final String str, final String str2) {
        m8b.f("Data-Sync", "On receive fitness file, path=" + str2);
        h.m.execute(new Runnable() { // from class: com.oplus.aiunit.vision.ni7
            @Override // java.lang.Runnable
            public final void run() {
                this.i.F(str, str2);
            }
        });
    }

    @Override // com.heytap.device.data.sporthealth.pull.fetcher.j.b
    public void c() {
        j jVar = this.p;
        if (jVar != null) {
            jVar.o();
            this.p = null;
        }
        s(1);
    }

    @Override // com.heytap.device.data.sporthealth.pull.fetcher.j.b
    public void f(int i) {
        j jVar = this.p;
        if (jVar != null) {
            jVar.o();
            this.p = null;
        }
        s(3);
    }

    @Override // com.heytap.device.data.sporthealth.pull.fetcher.h
    public String m() {
        return "FitnessDataFetcher";
    }

    @Override // com.heytap.device.data.sporthealth.pull.fetcher.h
    public void y() {
        if (this.e) {
            return;
        }
        if (!k(9)) {
            s(2);
        } else {
            this.e = true;
            H();
        }
    }
}