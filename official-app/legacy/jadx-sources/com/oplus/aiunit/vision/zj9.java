package com.oplus.aiunit.vision;

import android.content.Context;
import android.net.Uri;
import com.danikula.videocache.ProxyCacheException;
import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes13.dex */
public class zj9 {
    public final Object a;
    public final ExecutorService b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, ak9> f19449c;
    public final ServerSocket d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f19450e;
    public final Thread f;
    public final mt3 g;
    public final jke h;

    public static final class b {
        public File a;
        public u3i d;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public du5 f19451c = new m2k(536870912);
        public wb7 b = new lpb();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public di8 f19452e = new vl6();

        public b(Context context) {
            this.d = v3i.b(context);
            this.a = gui.b(context);
        }

        public zj9 a() {
            return new zj9(b());
        }

        public final mt3 b() {
            return new mt3(this.a, this.b, this.f19451c, this.d, this.f19452e);
        }

        public b c(int i) {
            this.f19451c = new l2k(i);
            return this;
        }

        public b d(long j2) {
            this.f19451c = new m2k(j2);
            return this;
        }
    }

    public final class c implements Runnable {
        public final Socket i;

        public c(Socket socket) {
            this.i = socket;
        }

        @Override // java.lang.Runnable
        public void run() {
            zj9.this.n(this.i);
        }
    }

    public final class d implements Runnable {
        public final CountDownLatch i;

        public d(CountDownLatch countDownLatch) {
            this.i = countDownLatch;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.i.countDown();
            zj9.this.q();
        }
    }

    public final String c(String str) {
        return String.format(Locale.US, "http://%s:%d/%s", "127.0.0.1", Integer.valueOf(this.f19450e), b3f.f(str));
    }

    public final void d(Socket socket) {
        try {
            if (socket.isClosed()) {
                return;
            }
            socket.close();
        } catch (IOException e2) {
            m(new ProxyCacheException("Error closing socket", e2));
        }
    }

    public final void e(Socket socket) {
        try {
            if (socket.isInputShutdown()) {
                return;
            }
            socket.shutdownInput();
        } catch (SocketException e2) {
            e2.printStackTrace();
        } catch (IOException e3) {
            m(new ProxyCacheException("Error closing socket input stream", e3));
        }
    }

    public final void f(Socket socket) {
        try {
            if (socket.isOutputShutdown()) {
                return;
            }
            socket.shutdownOutput();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    public final File g(String str) {
        mt3 mt3Var = this.g;
        return new File(mt3Var.a, mt3Var.b.a(str));
    }

    public final ak9 h(String str) throws ProxyCacheException {
        ak9 ak9Var;
        synchronized (this.a) {
            ak9Var = this.f19449c.get(str);
            if (ak9Var == null) {
                ak9Var = new ak9(str, this.g);
                this.f19449c.put(str, ak9Var);
            }
        }
        return ak9Var;
    }

    public String i(String str) {
        return j(str, true);
    }

    public String j(String str, boolean z) {
        if (!z || !l(str)) {
            return k() ? c(str) : str;
        }
        File fileG = g(str);
        p(fileG);
        return Uri.fromFile(fileG).toString();
    }

    public final boolean k() {
        return this.h.e(3, 70);
    }

    public boolean l(String str) {
        voe.e(str, "Url can't be null!");
        return g(str).exists();
    }

    public final void m(Throwable th) {
        th.printStackTrace();
    }

    public final void n(Socket socket) {
        try {
            v58 v58VarC = v58.c(socket.getInputStream());
            String strE = b3f.e(v58VarC.a);
            if (this.h.d(strE)) {
                this.h.g(socket);
            } else {
                h(strE).c(v58VarC, socket);
            }
        } catch (SocketException e2) {
            e2.printStackTrace();
        } catch (ProxyCacheException | IOException e3) {
            m(new ProxyCacheException("Error processing request", e3));
        } finally {
            o(socket);
        }
    }

    public final void o(Socket socket) {
        e(socket);
        f(socket);
        d(socket);
    }

    public final void p(File file) {
        try {
            this.g.f14215c.a(file);
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    public final void q() {
        while (!Thread.currentThread().isInterrupted()) {
            try {
                this.b.submit(new c(this.d.accept()));
            } catch (IOException e2) {
                m(new ProxyCacheException("Error during waiting connection", e2));
                return;
            }
        }
    }

    public zj9(mt3 mt3Var) {
        this.a = new Object();
        this.b = Executors.newFixedThreadPool(8);
        this.f19449c = new ConcurrentHashMap();
        this.g = (mt3) voe.d(mt3Var);
        try {
            ServerSocket serverSocket = new ServerSocket(0, 8, InetAddress.getByName("127.0.0.1"));
            this.d = serverSocket;
            int localPort = serverSocket.getLocalPort();
            this.f19450e = localPort;
            o2a.a("127.0.0.1", localPort);
            CountDownLatch countDownLatch = new CountDownLatch(1);
            Thread thread = new Thread(new d(countDownLatch));
            this.f = thread;
            thread.start();
            countDownLatch.await();
            this.h = new jke("127.0.0.1", localPort);
        } catch (IOException | InterruptedException e2) {
            this.b.shutdown();
            throw new IllegalStateException("Error starting local proxy server", e2);
        }
    }
}
