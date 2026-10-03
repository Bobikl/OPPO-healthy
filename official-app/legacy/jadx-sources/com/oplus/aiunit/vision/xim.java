package com.oplus.aiunit.vision;

import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.xingin.xhssharesdk.log.IShareLogger;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes10.dex */
public final class xim {
    public static IShareLogger a;
    public static volatile ExecutorService b;

    public interface a {
        void a(Exception exc);

        void onSuccess(String str);
    }

    public interface b {
        @Nullable
        @WorkerThread
        Map<String, Object> a();
    }

    public static class c implements a {
        public final a a;

        public c(cqm cqmVar) {
            this.a = cqmVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(String str) {
            a aVar = this.a;
            if (aVar != null) {
                aVar.onSuccess(str);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void e(Exception exc) {
            a aVar = this.a;
            if (aVar != null) {
                aVar.a(exc);
            }
        }

        @Override // com.oplus.aiunit.vision.xim.a
        public final void a(final Exception exc) {
            yim.a(new Runnable() { // from class: com.oplus.aiunit.vision.kgm
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.e(exc);
                }
            });
        }

        @Override // com.oplus.aiunit.vision.xim.a
        public final void onSuccess(final String str) {
            yim.a(new Runnable() { // from class: com.oplus.aiunit.vision.lgm
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.d(str);
                }
            });
        }
    }

    public static void a(final String str, @Nullable final b bVar, cqm cqmVar) {
        final c cVar = new c(cqmVar);
        if (b == null) {
            b = Executors.newCachedThreadPool();
        }
        final Map map = null;
        b.execute(new Runnable() { // from class: com.oplus.aiunit.vision.efm
            @Override // java.lang.Runnable
            public final void run() {
                xim.b(str, map, bVar, cVar);
            }
        });
    }

    public static /* synthetic */ void b(String str, Map map, b bVar, c cVar) {
        IShareLogger iShareLogger;
        String str2;
        try {
            IShareLogger iShareLogger2 = a;
            if (iShareLogger2 != null) {
                iShareLogger2.d("XhsShare_NetworkManager", "Post start, url is " + str);
            }
            HashMap map2 = new HashMap();
            if (map == null && (bVar == null || (map = bVar.a()) == null)) {
                map = map2;
            }
            String strA = smm.a(str, map);
            IShareLogger iShareLogger3 = a;
            if (iShareLogger3 != null) {
                iShareLogger3.d("XhsShare_NetworkManager", "Post end, response is " + strA);
            }
            cVar.onSuccess(strA);
        } catch (com.xingin.xhssharesdk.l.b e2) {
            e = e2;
            iShareLogger = a;
            if (iShareLogger != null) {
                str2 = "Network Error!";
                iShareLogger.w("XhsShare_NetworkManager", str2, e);
            }
            cVar.a(e);
        } catch (com.xingin.xhssharesdk.l.c e3) {
            e = e3;
            iShareLogger = a;
            if (iShareLogger != null) {
                str2 = "Invalid Params!";
                iShareLogger.w("XhsShare_NetworkManager", str2, e);
            }
            cVar.a(e);
        } catch (IOException e4) {
            e = e4;
            iShareLogger = a;
            if (iShareLogger != null) {
                str2 = "IOException!";
                iShareLogger.w("XhsShare_NetworkManager", str2, e);
            }
            cVar.a(e);
        }
    }
}
