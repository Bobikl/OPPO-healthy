package com.oplus.aiunit.vision;

import com.oppo.bluetooth.btnet.bluetoothproxyserver.httpMessage.exception.BuildHttpMessageError;
import java.io.IOException;
import java.io.InputStream;
import java.net.SocketTimeoutException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public abstract class vj9 {
    public zli a;
    public Map<String, String> b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f17880c;

    public vj9(InputStream inputStream) throws BuildHttpMessageError {
        d(inputStream);
    }

    public void a(String str, String str2) {
        if (g1j.b(str) && g1j.b(str2)) {
            c3f.a("HttpMessage", "key：" + str + "  value:" + str2);
            this.b.put(str.trim().toLowerCase(), str2.trim());
        }
    }

    public final void b(InputStream inputStream) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                int i = inputStream.read();
                if (i == -1) {
                    break;
                } else {
                    sb.append((char) i);
                }
            } catch (IOException e2) {
                c3f.b("HttpMessage", "buildBody: ex " + e2);
            }
        }
        m(sb.toString());
    }

    public final void c(InputStream inputStream) throws BuildHttpMessageError {
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                int i = inputStream.read();
                if (i == -1) {
                    return;
                }
                char c2 = (char) i;
                if (c2 == '\n') {
                    if (sb.length() == 0) {
                        return;
                    }
                    String string = sb.toString();
                    int iIndexOf = string.indexOf(":");
                    a(string.substring(0, iIndexOf), string.substring(iIndexOf + 1));
                    sb.setLength(0);
                } else if (c2 != '\r') {
                    sb.append(c2);
                }
            } catch (SocketTimeoutException e2) {
                c3f.b("HttpMessage", "buildHeader: ex " + e2);
                throw new BuildHttpMessageError("buildHeader SocketTimeoutException");
            } catch (IOException e3) {
                c3f.b("HttpMessage", "buildHeader: ex " + e3);
                throw new BuildHttpMessageError("buildHeader IOException");
            }
        }
    }

    public vj9 d(InputStream inputStream) throws BuildHttpMessageError {
        if (inputStream == null) {
            throw new BuildHttpMessageError("inputStream is null");
        }
        String strF = f(inputStream);
        this.a = e(strF);
        if (g1j.a(strF) || this.a == null) {
            throw new BuildHttpMessageError("startLine is null");
        }
        c(inputStream);
        if (l()) {
            b(inputStream);
        }
        return this;
    }

    public abstract zli e(String str);

    public final String f(InputStream inputStream) throws BuildHttpMessageError {
        char c2;
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                int i = inputStream.read();
                if (i == -1 || (c2 = (char) i) == '\n') {
                    break;
                    break;
                }
                if (c2 != '\r') {
                    sb.append(c2);
                }
            } catch (SocketTimeoutException e2) {
                c3f.b("HttpMessage", "buildStartLine: ex " + e2);
                throw new BuildHttpMessageError("buildStartLine SocketTimeoutException");
            } catch (IOException e3) {
                c3f.b("HttpMessage", "buildStartLine: ex " + e3);
                throw new BuildHttpMessageError("buildStartLine IOException");
            }
        }
        return sb.toString().trim();
    }

    public abstract vj9 g();

    public String h(String str) {
        if (g1j.b(str)) {
            return this.b.get(str.trim().toLowerCase());
        }
        return null;
    }

    public Map<String, String> i() {
        return this.b;
    }

    public zli j() {
        return this.a;
    }

    public boolean k() {
        return this.b.isEmpty();
    }

    public abstract boolean l();

    public void m(String str) {
        this.f17880c = str;
    }

    public void n(zli zliVar) {
        this.a = zliVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (j() == null) {
            return null;
        }
        sb.append(j());
        sb.append("\r\n");
        if (!k()) {
            for (Map.Entry<String, String> entry : this.b.entrySet()) {
                sb.append(entry.getKey());
                sb.append(": ");
                sb.append(entry.getValue());
                sb.append("\r\n");
            }
        }
        sb.append("\r\n");
        if (g1j.b(this.f17880c)) {
            sb.append(this.f17880c);
        }
        return sb.toString();
    }
}
