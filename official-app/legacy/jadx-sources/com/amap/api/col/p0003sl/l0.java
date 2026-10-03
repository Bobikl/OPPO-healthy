package com.amap.api.col.p0003sl;

import android.content.Context;
import android.net.SSLSessionCache;
import android.os.Build;
import com.oplus.aiunit.vision.c2n;
import com.oplus.aiunit.vision.w0n;
import io.netty.handler.ssl.SslProtocols;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSessionContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes12.dex */
public final class l0 extends SSLSocketFactory {
    public SSLSocketFactory a;
    public Context b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SSLContext f779c;

    public l0(Context context, SSLContext sSLContext) {
        SSLSocketFactory sSLSocketFactory;
        if (context != null) {
            try {
                this.b = context.getApplicationContext();
            } catch (Throwable th) {
                try {
                    c2n.r(th, "myssl", "<init>");
                    try {
                        if (sSLSocketFactory == null) {
                            return;
                        } else {
                            return;
                        }
                    } catch (Throwable th2) {
                        return;
                    }
                } finally {
                    try {
                        if (this.f779c == null) {
                            this.f779c = SSLContext.getDefault();
                        }
                    } catch (Throwable th3) {
                        c2n.r(th3, "myssl", "<init2>");
                    }
                    try {
                        if (this.a == null) {
                            this.a = (SSLSocketFactory) SSLSocketFactory.getDefault();
                        }
                    } catch (Throwable th4) {
                        c2n.r(th4, "myssl", "<init3>");
                    }
                }
            }
        }
        this.f779c = sSLContext;
        if (sSLContext != null) {
            this.a = sSLContext.getSocketFactory();
        }
        try {
            if (this.f779c == null) {
                this.f779c = SSLContext.getDefault();
            }
        } catch (Throwable th5) {
            c2n.r(th5, "myssl", "<init2>");
        }
        try {
            if (this.a == null) {
                this.a = (SSLSocketFactory) SSLSocketFactory.getDefault();
            }
        } catch (Throwable th6) {
            c2n.r(th6, "myssl", "<init3>");
        }
    }

    public static Socket a(Socket socket) {
        try {
            if (e0.g.b && (socket instanceof SSLSocket)) {
                ((SSLSocket) socket).setEnabledProtocols(new String[]{SslProtocols.TLS_v1_2});
            }
        } catch (Throwable th) {
            c2n.r(th, "myssl", "stlv2");
        }
        return socket;
    }

    public static void d(Socket socket) {
        int i = Build.VERSION.SDK_INT;
        if (e0.g.f693c && e0.g.f694e && (socket instanceof SSLSocket)) {
            int i2 = e0.g.f;
            int i3 = e0.g.d;
            if (i2 <= i3) {
                i3 = e0.g.f;
            }
            if (i3 <= 17 || i <= i3) {
                try {
                    socket.getClass().getMethod(w0n.t("Cc2V0VXNlU2Vzc2lvblRpY2tldHM"), Boolean.TYPE).invoke(socket, Boolean.TRUE);
                } catch (Throwable th) {
                    c2n.r(th, "myssl", "sust");
                }
            }
        }
    }

    public final void b() {
        int i = Build.VERSION.SDK_INT;
        if (!e0.g.f693c || this.b == null || this.f779c == null) {
            return;
        }
        int i2 = e0.g.d;
        if (i2 <= 17 || i <= i2) {
            c(new SSLSessionCache(this.b));
        }
    }

    public final void c(SSLSessionCache sSLSessionCache) {
        SSLContext sSLContext = this.f779c;
        if (sSLContext == null) {
            return;
        }
        try {
            SSLSessionContext clientSessionContext = sSLContext.getClientSessionContext();
            Field declaredField = sSLSessionCache.getClass().getDeclaredField(w0n.t("UbVNlc3Npb25DYWNoZQ"));
            declaredField.setAccessible(true);
            Object obj = declaredField.get(sSLSessionCache);
            Method[] methods = clientSessionContext.getClass().getMethods();
            String strT = w0n.t("Yc2V0UGVyc2lzdGVudENhY2hl");
            for (Method method : methods) {
                if (method.getName().equals(strT)) {
                    method.invoke(clientSessionContext, obj);
                    return;
                }
            }
        } catch (Throwable th) {
            c2n.r(th, "myssl", "isc2");
        }
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket() throws IOException {
        try {
            SSLSocketFactory sSLSocketFactory = this.a;
            if (sSLSocketFactory == null) {
                return null;
            }
            Socket socketA = a(sSLSocketFactory.createSocket());
            d(socketA);
            return socketA;
        } catch (Throwable th) {
            c2n.r(th, "myssl", "cs1");
            if (th instanceof IOException) {
                throw th;
            }
            return null;
        }
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        try {
            SSLSocketFactory sSLSocketFactory = this.a;
            if (sSLSocketFactory != null) {
                return sSLSocketFactory.getDefaultCipherSuites();
            }
        } catch (Throwable th) {
            c2n.r(th, "myssl", "gdcs");
        }
        return new String[0];
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        try {
            SSLSocketFactory sSLSocketFactory = this.a;
            if (sSLSocketFactory != null) {
                return sSLSocketFactory.getSupportedCipherSuites();
            }
        } catch (Throwable th) {
            c2n.r(th, "myssl", "gscs");
        }
        return new String[0];
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        try {
            SSLSocketFactory sSLSocketFactory = this.a;
            if (sSLSocketFactory == null) {
                return null;
            }
            Socket socketA = a(sSLSocketFactory.createSocket(socket, str, i, z));
            d(socketA);
            return socketA;
        } catch (Throwable th) {
            c2n.r(th, "myssl", "cs2");
            if (th instanceof IOException) {
                throw th;
            }
            return null;
        }
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) throws IOException {
        try {
            SSLSocketFactory sSLSocketFactory = this.a;
            if (sSLSocketFactory == null) {
                return null;
            }
            Socket socketA = a(sSLSocketFactory.createSocket(str, i));
            d(socketA);
            return socketA;
        } catch (Throwable th) {
            c2n.r(th, "myssl", "cs3");
            if (!(th instanceof UnknownHostException)) {
                if (th instanceof IOException) {
                    throw th;
                }
                return null;
            }
            throw th;
        }
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException {
        try {
            SSLSocketFactory sSLSocketFactory = this.a;
            if (sSLSocketFactory == null) {
                return null;
            }
            Socket socketA = a(sSLSocketFactory.createSocket(str, i, inetAddress, i2));
            d(socketA);
            return socketA;
        } catch (Throwable th) {
            c2n.r(th, "myssl", "cs4");
            if (!(th instanceof UnknownHostException)) {
                if (th instanceof IOException) {
                    throw th;
                }
                return null;
            }
            throw th;
        }
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        try {
            SSLSocketFactory sSLSocketFactory = this.a;
            if (sSLSocketFactory == null) {
                return null;
            }
            Socket socketA = a(sSLSocketFactory.createSocket(inetAddress, i));
            d(socketA);
            return socketA;
        } catch (Throwable th) {
            c2n.r(th, "myssl", "cs5");
            if (th instanceof IOException) {
                throw th;
            }
            return null;
        }
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        try {
            SSLSocketFactory sSLSocketFactory = this.a;
            if (sSLSocketFactory == null) {
                return null;
            }
            Socket socketA = a(sSLSocketFactory.createSocket(inetAddress, i, inetAddress2, i2));
            d(socketA);
            return socketA;
        } catch (Throwable th) {
            c2n.r(th, "myssl", "cs6");
            if (th instanceof IOException) {
                throw th;
            }
            return null;
        }
    }
}
