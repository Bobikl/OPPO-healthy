package com.oplus.aiunit.vision;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.heytap.health.base.task.ThreadUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public class mn0 {
    public volatile boolean a;
    public volatile boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<c> f14133c;
    public final List<c> d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final BroadcastReceiver f14134e;

    public class a extends BroadcastReceiver {
        public a() {
        }

        public static /* synthetic */ void e(List list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((c) it.next()).task();
            }
        }

        public final void b() {
            if (mn0.this.a) {
                return;
            }
            a7b.f("AuthorizeInit", "agreementInit");
            ArrayList arrayList = new ArrayList();
            mn0.this.a = true;
            for (c cVar : mn0.this.f14133c) {
                if (cVar.a()) {
                    arrayList.add(cVar);
                } else {
                    cVar.task();
                }
            }
            c(arrayList);
            d();
        }

        public final void c(final List<c> list) {
            if (list == null || list.size() <= 0) {
                return;
            }
            ThreadUtils.doInBackground(new Runnable() { // from class: com.oplus.aiunit.vision.ln0
                @Override // java.lang.Runnable
                public final void run() {
                    mn0.a.e(list);
                }
            });
        }

        public final void d() {
            if (mn0.this.b) {
                return;
            }
            a7b.f("AuthorizeInit", "internetInit");
            ArrayList arrayList = new ArrayList();
            mn0.this.b = true;
            for (c cVar : mn0.this.d) {
                if (cVar.a()) {
                    arrayList.add(cVar);
                } else {
                    cVar.task();
                }
            }
            c(arrayList);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            a7b.f("AuthorizeInit", "receiver intent = " + intent.getAction());
            if ("ACTION_AGREE_PRIVACY_AGREEMENT".equals(intent.getAction())) {
                b();
            } else if ("ACTION_AGREE_INTERNET".equals(intent.getAction())) {
                d();
            }
        }
    }

    public static class b {
        public static final mn0 a = new mn0();
    }

    public interface c {
        default boolean a() {
            return false;
        }

        void task();
    }

    public static mn0 g() {
        return b.a;
    }

    public void h(c cVar) {
        a7b.f("AuthorizeInit", "needInternetTask haveInternet：" + this.b);
        if (this.b) {
            cVar.task();
        } else {
            this.d.add(cVar);
        }
    }

    public void i(c cVar) {
        a7b.f("AuthorizeInit", "needPrivacyAgreementTask hasAgreementInit：" + this.a);
        if (this.a) {
            cVar.task();
        } else {
            this.f14133c.add(cVar);
        }
    }

    public mn0() {
        this.f14133c = new ArrayList();
        this.d = new ArrayList();
        a aVar = new a();
        this.f14134e = aVar;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("ACTION_AGREE_PRIVACY_AGREEMENT");
        intentFilter.addAction("ACTION_AGREE_INTERNET");
        rdf.a(b78.a(), aVar, intentFilter, 4);
        this.a = m3k.h();
        this.b = m3k.i();
        a7b.f("AuthorizeInit", "AuthorizeInit hasAgreementInit is " + this.a + ", hasInternetInit is " + this.b);
    }
}
