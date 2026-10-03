package com.oplus.aiunit.vision;

import com.oppo.bluetooth.btnet.bluetoothproxyserver.httpMessage.exception.ConnectServerError;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.ConnectException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;

/* JADX INFO: loaded from: classes9.dex */
public class q1i {
    public static Socket a(String str, int i, int i2) throws ConnectServerError {
        c3f.a("SocketUtil", "host = " + str + "  port = " + i + " connectTimeout =" + i2);
        Socket socket = new Socket();
        try {
            socket.connect(new InetSocketAddress(InetAddress.getByName(str), i), i2);
            return socket;
        } catch (ConnectException e2) {
            c3f.b("SocketUtil", "Connect Server ConnectionException" + e2.toString());
            return null;
        } catch (SocketTimeoutException e3) {
            c3f.b("SocketUtil", "Connect Server Is Timeout." + e3.toString());
            return null;
        } catch (UnknownHostException e4) {
            c3f.b("SocketUtil", "Connect Server UnknownHostException" + e4.toString());
            return null;
        } catch (IOException e5) {
            c3f.b("SocketUtil", "Connect Server IOException" + e5.toString());
            return null;
        }
    }

    public static boolean b(OutputStream outputStream, vj9 vj9Var, boolean z) {
        if (z) {
            vj9Var.g();
        }
        try {
            return c(outputStream, vj9Var.toString().getBytes("ISO-8859-1"));
        } catch (UnsupportedEncodingException e2) {
            c3f.b("SocketUtil", "writeSocket: ex " + e2);
            return false;
        }
    }

    public static boolean c(OutputStream outputStream, byte[] bArr) {
        if (outputStream == null) {
            c3f.e("SocketUtil", "输出流为空!");
            return false;
        }
        try {
            outputStream.write(bArr);
            outputStream.flush();
            return true;
        } catch (IOException e2) {
            c3f.b("SocketUtil", "writeSocket IOException:" + e2);
            return false;
        }
    }

    public static boolean d(OutputStream outputStream, byte[] bArr, boolean z) {
        return c(outputStream, bArr);
    }
}
