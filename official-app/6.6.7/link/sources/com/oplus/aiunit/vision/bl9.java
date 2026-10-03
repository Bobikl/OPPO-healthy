package com.oplus.aiunit.vision;

import com.oppo.bluetooth.btnet.bluetoothproxyserver.httpMessage.exception.BuildHttpMessageError;
import java.io.IOException;
import java.io.InputStream;
import java.net.SocketTimeoutException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public abstract class bl9 {
    public rpi a;
    public Map<String, String> b = new HashMap();
    public String c;

    public bl9(InputStream inputStream) throws BuildHttpMessageError {
        d(inputStream);
    }

    public void a(String str, String str2) {
        if (z4j.b(str) && z4j.b(str2)) {
            o5f.a("HttpMessage", "key：" + str + "  value:" + str2);
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
            } catch (IOException e) {
                o5f.b("HttpMessage", "buildBody: ex " + e);
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
                char c = (char) i;
                if (c == '\n') {
                    if (sb.length() == 0) {
                        return;
                    }
                    String string = sb.toString();
                    int iIndexOf = string.indexOf(":");
                    a(string.substring(0, iIndexOf), string.substring(iIndexOf + 1));
                    sb.setLength(0);
                } else if (c != '\r') {
                    sb.append(c);
                }
            } catch (SocketTimeoutException e) {
                o5f.b("HttpMessage", "buildHeader: ex " + e);
                throw new BuildHttpMessageError("buildHeader SocketTimeoutException");
            } catch (IOException e2) {
                o5f.b("HttpMessage", "buildHeader: ex " + e2);
                throw new BuildHttpMessageError("buildHeader IOException");
            }
        }
    }

    public bl9 d(InputStream inputStream) throws BuildHttpMessageError {
        if (inputStream == null) {
            throw new BuildHttpMessageError("inputStream is null");
        }
        String strF = f(inputStream);
        this.a = e(strF);
        if (z4j.a(strF) || this.a == null) {
            throw new BuildHttpMessageError("startLine is null");
        }
        c(inputStream);
        if (l()) {
            b(inputStream);
        }
        return this;
    }

    public abstract rpi e(String str);

    public final String f(InputStream inputStream) throws BuildHttpMessageError {
        char c;
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                int i = inputStream.read();
                if (i == -1 || (c = (char) i) == '\n') {
                    break;
                    break;
                }
                if (c != '\r') {
                    sb.append(c);
                }
            } catch (SocketTimeoutException e) {
                o5f.b("HttpMessage", "buildStartLine: ex " + e);
                throw new BuildHttpMessageError("buildStartLine SocketTimeoutException");
            } catch (IOException e2) {
                o5f.b("HttpMessage", "buildStartLine: ex " + e2);
                throw new BuildHttpMessageError("buildStartLine IOException");
            }
        }
        return sb.toString().trim();
    }

    public abstract bl9 g();

    public String h(String str) {
        if (z4j.b(str)) {
            return this.b.get(str.trim().toLowerCase());
        }
        return null;
    }

    public Map<String, String> i() {
        return this.b;
    }

    public rpi j() {
        return this.a;
    }

    public boolean k() {
        return this.b.isEmpty();
    }

    public abstract boolean l();

    public void m(String str) {
        this.c = str;
    }

    public void n(rpi rpiVar) {
        this.a = rpiVar;
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
        if (z4j.b(this.c)) {
            sb.append(this.c);
        }
        return sb.toString();
    }
}
