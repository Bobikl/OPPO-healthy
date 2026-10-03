package com.omron;

import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public abstract class es {
    private String a = es.class.getSimpleName();
    private String b = es.class.getSimpleName();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f8994c;
    private b d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private HandlerThread f8995e;

    public static class b extends el {
        private static final Object o = new Object();
        private boolean a;
        private Message b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Object[] f8996c;
        private boolean d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private C0848b[] f8997e;
        private int f;
        private C0848b[] g;
        private int h;
        private a i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private es f8998j;
        private HashMap<er, C0848b> k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private er f8999l;
        private er m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private ArrayList<Message> f9000n;

        public static class a extends er {
            private a() {
            }

            @Override // com.omron.er
            public boolean a(Message message) {
                return false;
            }
        }

        /* JADX INFO: renamed from: com.omron.es$b$b, reason: collision with other inner class name */
        public static class C0848b {
            er a;
            C0848b b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            boolean f9001c;

            private C0848b() {
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("state=");
                sb.append(this.a.b());
                sb.append(",active=");
                sb.append(this.f9001c);
                sb.append(",parent=");
                C0848b c0848b = this.b;
                sb.append(c0848b == null ? "null" : c0848b.a.b());
                return sb.toString();
            }
        }

        private b(Looper looper, es esVar) {
            super(looper);
            this.a = false;
            this.f = -1;
            this.i = new a();
            this.k = new HashMap<>();
            this.f9000n = new ArrayList<>();
            this.f8998j = esVar;
            a(this.i, (er) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final C0848b a(er erVar, er erVar2) {
            C0848b c0848bA;
            es esVar = this.f8998j;
            StringBuilder sb = new StringBuilder();
            sb.append("addStateInternal: E state=");
            sb.append(erVar.b());
            sb.append(",parent=");
            sb.append(erVar2 == null ? "" : erVar2.b());
            esVar.a(sb.toString());
            if (erVar2 != null) {
                c0848bA = this.k.get(erVar2);
                if (c0848bA == null) {
                    c0848bA = a(erVar2, (er) null);
                }
            } else {
                c0848bA = null;
            }
            C0848b c0848b = this.k.get(erVar);
            if (c0848b == null) {
                c0848b = new C0848b();
                this.k.put(erVar, c0848b);
            }
            C0848b c0848b2 = c0848b.b;
            if (c0848b2 != null && c0848b2 != c0848bA) {
                throw new RuntimeException("state already added");
            }
            c0848b.a = erVar;
            c0848b.b = c0848bA;
            c0848b.f9001c = false;
            this.f8998j.a("addStateInternal: X stateInfo: " + c0848b);
            return c0848b;
        }

        private final er b(Message message) {
            C0848b c0848b = this.f8997e[this.f];
            this.f8998j.a("processMsg: " + c0848b.a.b() + String.format(Locale.US, " msg.what=0x%08x", Integer.valueOf(message.what)));
            if (a(message)) {
                a(this.i, (Object[]) null);
            } else {
                while (!c0848b.a.a(message) && (c0848b = c0848b.b) != null) {
                    this.f8998j.a("processMsg: " + c0848b.a.b() + String.format(Locale.US, " msg.what=0x%08x", Integer.valueOf(message.what)));
                }
            }
            if (c0848b != null) {
                return c0848b.a;
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void c() {
            int i = 0;
            for (C0848b c0848b : this.k.values()) {
                int i2 = 0;
                while (c0848b != null) {
                    c0848b = c0848b.b;
                    i2++;
                }
                if (i < i2) {
                    i = i2;
                }
            }
            this.f8997e = new C0848b[i];
            this.g = new C0848b[i];
            f();
            sendMessageAtFrontOfQueue(obtainMessage(-2, o));
        }

        private final void d() {
            for (int size = this.f9000n.size() - 1; size >= 0; size += -1) {
                Message message = this.f9000n.get(size);
                this.f8998j.a("moveDeferredMessageAtFrontOfQueue; " + String.format(Locale.US, "msg.what=0x%08x", Integer.valueOf(message.what)));
                sendMessageAtFrontOfQueue(message);
            }
            this.f9000n.clear();
        }

        private final int e() {
            int i = this.f + 1;
            int i2 = i;
            for (int i3 = this.h - 1; i3 >= 0; i3--) {
                this.f8997e[i2] = this.g[i3];
                i2++;
            }
            this.f = i2 - 1;
            return i;
        }

        private final void f() {
            this.f8998j.a("setupInitialStateStack: E mInitialState=" + this.f8999l.b());
            C0848b c0848b = this.k.get(this.f8999l);
            this.h = 0;
            while (c0848b != null) {
                C0848b[] c0848bArr = this.g;
                int i = this.h;
                c0848bArr[i] = c0848b;
                c0848b = c0848b.b;
                this.h = i + 1;
            }
            this.f = -1;
            e();
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            er erVarB;
            if (this.a) {
                return;
            }
            this.b = message;
            if (this.d) {
                erVarB = b(message);
            } else {
                if (message.what != -2 || message.obj != o) {
                    throw new RuntimeException("StateMachine.handleMessage: The start method not called, received msg: " + message);
                }
                this.d = true;
                a(0);
                erVarB = null;
            }
            a(erVarB, message);
        }

        private final C0848b b(er erVar) {
            this.h = 0;
            C0848b c0848b = this.k.get(erVar);
            do {
                C0848b[] c0848bArr = this.g;
                int i = this.h;
                this.h = i + 1;
                c0848bArr[i] = c0848b;
                c0848b = c0848b.b;
                if (c0848b == null) {
                    break;
                }
            } while (!c0848b.f9001c);
            return c0848b;
        }

        private final void a(int i) {
            Object[] objArr = this.f8996c;
            this.f8996c = null;
            while (i <= this.f) {
                this.f8998j.a("invokeEnterMethods: " + this.f8997e[i].a.b());
                this.f8997e[i].a.a(objArr);
                this.f8997e[i].f9001c = true;
                i++;
            }
        }

        private final void b() {
            if (this.f8998j.f8995e != null) {
                getLooper().quit();
                this.f8998j.f8995e = null;
            }
            this.f8998j.d = null;
            this.f8998j = null;
            this.b = null;
            this.f8997e = null;
            this.g = null;
            this.k.clear();
            this.f8999l = null;
            this.m = null;
            this.f9000n.clear();
            this.a = true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void a(er erVar) {
            this.f8998j.a("setInitialState: initialState=" + erVar.b());
            this.f8999l = erVar;
        }

        private void a(er erVar, Message message) {
            er erVar2 = this.m;
            if (erVar2 != null) {
                while (true) {
                    a(b(erVar2));
                    a(e());
                    d();
                    er erVar3 = this.m;
                    if (erVar2 == erVar3) {
                        break;
                    } else {
                        erVar2 = erVar3;
                    }
                }
                this.m = null;
            }
            if (erVar2 == null || erVar2 != this.i) {
                return;
            }
            b();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void a(er erVar, Object[] objArr) {
            this.m = erVar;
            this.f8996c = objArr;
        }

        private final void a(C0848b c0848b) {
            C0848b c0848b2;
            while (true) {
                int i = this.f;
                if (i < 0 || (c0848b2 = this.f8997e[i]) == c0848b) {
                    return;
                }
                er erVar = c0848b2.a;
                this.f8998j.a("invokeExitMethods: " + erVar.b());
                erVar.a();
                C0848b[] c0848bArr = this.f8997e;
                int i2 = this.f;
                c0848bArr[i2].f9001c = false;
                this.f = i2 - 1;
            }
        }

        private final boolean a(Message message) {
            return message.what == -1 && message.obj == o;
        }
    }

    public es(@Nullable String str, @Nullable Looper looper) {
        a(str, looper);
    }

    private Message b(int i) {
        return Message.obtain(this.d, i);
    }

    public final void c(int i) {
        this.d.removeMessages(i);
    }

    public final void d(int i) {
        this.d.sendMessage(b(i));
    }

    public void b() {
        this.d.c();
    }

    public final void c(er erVar) {
        this.d.a(erVar, (Object[]) null);
    }

    private Message a(int i, int i2) {
        return Message.obtain(this.d, i, i2, 0);
    }

    public final void b(int i, int i2) {
        this.d.sendMessage(a(i, i2));
    }

    private Message a(int i, int i2, int i3, Object obj) {
        return Message.obtain(this.d, i, i2, i3, obj);
    }

    public final void b(int i, int i2, int i3, Object obj) {
        this.d.sendMessage(a(i, i2, i3, obj));
    }

    private Message a(int i, Object obj) {
        return Message.obtain(this.d, i, obj);
    }

    public final void b(int i, Object obj) {
        this.d.sendMessage(a(i, obj));
    }

    public final el a() {
        return this.d;
    }

    public final void b(er erVar) {
        this.d.a(erVar);
    }

    public void b(String str) {
        this.b = str;
    }

    public final void a(int i, long j2) {
        this.d.sendMessageDelayed(b(i), j2);
    }

    public final void a(er erVar) {
        this.d.a(erVar, (er) null);
    }

    public final void a(er erVar, er erVar2) {
        this.d.a(erVar, erVar2);
    }

    public final void a(er erVar, Object[] objArr) {
        this.d.a(erVar, objArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        if (this.f8994c) {
            eq.a(this.b, str);
        }
    }

    private void a(@Nullable String str, @Nullable Looper looper) {
        if (str == null) {
            str = getClass().getSimpleName();
        }
        if (looper == null) {
            HandlerThread handlerThread = new HandlerThread(str);
            this.f8995e = handlerThread;
            handlerThread.start();
            looper = this.f8995e.getLooper();
        }
        this.a = str;
        this.d = new b(looper, this);
    }

    public void a(boolean z) {
        this.f8994c = z;
    }

    public final boolean a(int i) {
        return this.d.hasMessages(i);
    }
}
