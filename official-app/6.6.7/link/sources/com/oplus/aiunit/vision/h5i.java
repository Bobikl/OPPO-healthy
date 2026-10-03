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

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class h5i {
    public static Socket a(String str, int i, int i2) throws ConnectServerError {
        o5f.a("SocketUtil", "host = " + str + "  port = " + i + " connectTimeout =" + i2);
        Socket socket = new Socket();
        try {
            socket.connect(new InetSocketAddress(InetAddress.getByName(str), i), i2);
            return socket;
        } catch (ConnectException e) {
            o5f.b("SocketUtil", "Connect Server ConnectionException" + e.toString());
            return null;
        } catch (SocketTimeoutException e2) {
            o5f.b("SocketUtil", "Connect Server Is Timeout." + e2.toString());
            return null;
        } catch (UnknownHostException e3) {
            o5f.b("SocketUtil", "Connect Server UnknownHostException" + e3.toString());
            return null;
        } catch (IOException e4) {
            o5f.b("SocketUtil", "Connect Server IOException" + e4.toString());
            return null;
        }
    }

    public static boolean b(OutputStream outputStream, bl9 bl9Var, boolean z) {
        if (z) {
            bl9Var.g();
        }
        try {
            return c(outputStream, bl9Var.toString().getBytes("ISO-8859-1"));
        } catch (UnsupportedEncodingException e) {
            o5f.b("SocketUtil", "writeSocket: ex " + e);
            return false;
        }
    }

    public static boolean c(OutputStream outputStream, byte[] bArr) {
        if (outputStream == null) {
            o5f.e("SocketUtil", "输出流为空!");
            return false;
        }
        try {
            outputStream.write(bArr);
            outputStream.flush();
            return true;
        } catch (IOException e) {
            o5f.b("SocketUtil", "writeSocket IOException:" + e);
            return false;
        }
    }

    public static boolean d(OutputStream outputStream, byte[] bArr, boolean z) {
        return c(outputStream, bArr);
    }
}
