package com.oplus.aiunit.vision;

import android.util.Log;
import com.danikula.videocache.ProxyCacheException;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.Socket;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes13.dex */
public class jke {
    public final ExecutorService a = Executors.newSingleThreadExecutor();
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f12932c;

    public class b implements Callable<Boolean> {
        public b() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() throws Exception {
            return Boolean.valueOf(jke.this.f());
        }
    }

    public jke(String str, int i) {
        this.b = (String) voe.d(str);
        this.f12932c = i;
    }

    public final List<Proxy> b() {
        try {
            return ProxySelector.getDefault().select(new URI(c()));
        } catch (URISyntaxException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public final String c() {
        return String.format(Locale.US, "http://%s:%d/%s", this.b, Integer.valueOf(this.f12932c), "ping");
    }

    public boolean d(String str) {
        return "ping".equals(str);
    }

    public boolean e(int i, int i2) {
        voe.b(i >= 1);
        voe.b(i2 > 0);
        int i3 = 0;
        while (i3 < i) {
            try {
                if (((Boolean) this.a.submit(new b()).get(i2, TimeUnit.MILLISECONDS)).booleanValue()) {
                    return true;
                }
                i3++;
                i2 *= 2;
            } catch (InterruptedException | ExecutionException e2) {
                Log.d("video", "Error pinging server due to unexpected error " + e2);
            } catch (TimeoutException unused) {
                Log.d("video", "Error pinging server (attempt: " + i3 + ", timeout: " + i2 + "). ");
            }
        }
        String str = String.format(Locale.US, "Error pinging server (attempts: %d, max timeout: %d). If you see this message, please, report at https://github.com/danikula/AndroidVideoCache/issues/134. Default proxies are: %s", Integer.valueOf(i3), Integer.valueOf(i2 / 2), b());
        Log.e("video", str + new ProxyCacheException(str));
        return false;
    }

    public final boolean f() throws ProxyCacheException {
        zk9 zk9Var = new zk9(c());
        try {
            byte[] bytes = "ping ok".getBytes();
            zk9Var.a(0L);
            byte[] bArr = new byte[bytes.length];
            zk9Var.read(bArr);
            boolean zEquals = Arrays.equals(bytes, bArr);
            Log.i("video", "Ping response: `" + new String(bArr) + "`, pinged? " + zEquals);
            return zEquals;
        } catch (ProxyCacheException e2) {
            Log.e("video", "Error reading ping response " + e2);
            return false;
        } finally {
            zk9Var.close();
        }
    }

    public void g(Socket socket) throws IOException {
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("HTTP/1.1 200 OK\n\n".getBytes());
        outputStream.write("ping ok".getBytes());
    }
}
