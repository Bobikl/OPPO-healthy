package com.omron;

import com.heytap.health.settings.watch.sporthealthsettings2.ui.collaborationRelated.CloudDownloadWorker;
import com.heytap.store.base.core.http.HttpConst;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.efd;
import com.oplus.aiunit.vision.gqf;
import com.oplus.aiunit.vision.mie;
import com.oplus.aiunit.vision.to2;
import com.oplus.aiunit.vision.wr2;
import com.oplus.aiunit.vision.ytf;
import com.oplus.aiunit.vision.zs2;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import okhttp3.MediaType;
import okhttp3.Request;

/* JADX INFO: loaded from: classes5.dex */
public class av {
    private static efd a;
    private static volatile av b;

    public class a implements zs2 {
        final /* synthetic */ b a;
        final /* synthetic */ int b;

        public a(b bVar, int i) {
            this.a = bVar;
            this.b = i;
        }

        @Override // com.oplus.aiunit.vision.zs2
        public void onFailure(wr2 wr2Var, IOException iOException) {
            this.a.b(this.b, iOException.toString());
        }

        @Override // com.oplus.aiunit.vision.zs2
        public void onResponse(wr2 wr2Var, ytf ytfVar) throws IOException {
            this.a.a(this.b, ytfVar.getBody().s());
        }
    }

    public interface b {
        void a(int i, String str);

        void b(int i, String str);
    }

    private av() {
    }

    public static av a() {
        if (a == null && b == null) {
            synchronized (av.class) {
                if (a == null) {
                    a = new efd();
                }
                if (b == null) {
                    b = new av();
                }
                b();
            }
        }
        return b;
    }

    private static void b() {
        File file = new File(b78.a().getExternalCacheDir().getAbsolutePath() + "/cache");
        efd.a aVar = new efd.a();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        a = aVar.g(3L, timeUnit).b0(3L, timeUnit).X(3L, timeUnit).i(new aw(5L, timeUnit)).Y(false).d(new to2(file.getAbsoluteFile(), (long) mie.MAX_IMG_SIZE)).c();
    }

    public void a(int i, b bVar, String str, String str2, String str3, String str4) {
        String strValueOf;
        gqf gqfVarCreate = gqf.create(MediaType.parse("application/json"), str2);
        String mediaType = gqfVarCreate.getB().getMediaType();
        try {
            strValueOf = String.valueOf(gqfVarCreate.contentLength());
        } catch (IOException e2) {
            e2.printStackTrace();
            strValueOf = null;
        }
        a.a(new Request.Builder().url(str).addHeader("Content-Type", mediaType).addHeader("Content-Length", strValueOf).addHeader("Host", "sdkb.omronhealthcare.com.cn").addHeader(HttpConst.APP_KEY, str3).addHeader(CloudDownloadWorker.KEY_SECRET, str4).post(gqfVarCreate).build()).g(new a(bVar, i));
    }
}
