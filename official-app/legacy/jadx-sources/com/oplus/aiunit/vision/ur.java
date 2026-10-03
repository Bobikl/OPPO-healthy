package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes19.dex */
public class ur {
    public static final int STATUS_LOADING = 0;
    public static final int STATUS_LOAD_NET_EXCEPTION = 2;
    public static final int STATUS_LOAD_SUCCESS = 1;
    public static final int STATUS_LOAD_SYNC_EXCEPTION = 3;
    public static final String TAG = "AiResLoadManager";
    public c a;
    public os4 b;

    public class a implements os4 {
        public final /* synthetic */ String i;

        public a(String str) {
            this.i = str;
        }

        @Override // com.oplus.aiunit.vision.os4
        public String getDeviceMac() {
            return this.i;
        }

        @Override // com.oplus.aiunit.vision.os4
        public void i6(String str, int i, int i2) {
            ltl.i(ur.TAG, "[onDataChanged] status = " + i);
            if (i == -1) {
                ur.this.b(1);
                return;
            }
            if (i == 0 || i == 1) {
                ur.this.b(2);
            } else if (i == 2 || i == 4) {
                ur.this.b(3);
            }
        }
    }

    public static class b {
        public static final ur a = new ur();
    }

    public interface c {
        void a(int i);
    }

    public static ur a() {
        return b.a;
    }

    public synchronized void b(int i) {
        ltl.a(TAG, "[setListenerStatus]  status " + i);
        c cVar = this.a;
        if (cVar != null) {
            cVar.a(i);
        }
    }

    public void c(String str, c cVar) {
        this.a = cVar;
        d(str);
    }

    public void d(String str) {
        ltl.a(TAG, "[syncWatchRes] mac " + str);
        b(0);
        if (this.b == null) {
            this.b = new a(str);
            ltl.d(TAG, "[syncWatchRes] --> new mDataChangeListener , register ");
        }
        ntl.m().q(this.b);
        ltl.d(TAG, "[syncWatchRes] --> start sync");
        jej.f().l(str);
    }

    public void e() {
        this.a = null;
        if (this.b != null) {
            ntl.m().t(this.b);
            this.b = null;
            ltl.d(TAG, "[unRegisterListener] --> unregister");
        }
    }

    public ur() {
    }
}
