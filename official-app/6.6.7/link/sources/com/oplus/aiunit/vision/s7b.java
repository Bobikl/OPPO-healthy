package com.oplus.aiunit.vision;

import android.util.Log;
import com.oplus.weatherservicesdk.data.Weather;
import java.io.EOFException;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.concurrent.TimeUnit;
import okhttp3.MediaType;
import okhttp3.Protocol;
import okhttp3.Request;
import okio.Buffer;
import okio.BufferedSource;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class s7b implements rfa {
    public static final String END = "\n请求结束 --> END ";
    public static final Charset a = Charset.forName("UTF-8");

    public final boolean a(jk8 jk8Var) {
        String strA = jk8Var.a("Content-Encoding");
        return (strA == null || strA.equalsIgnoreCase("identity")) ? false : true;
    }

    public final boolean b(Buffer buffer) throws EOFException {
        try {
            Buffer buffer2 = new Buffer();
            buffer.copyTo(buffer2, 0L, buffer.size() < 64 ? buffer.size() : 64L);
            for (int i = 0; i < 16 && !buffer2.exhausted(); i++) {
                int utf8CodePoint = buffer2.readUtf8CodePoint();
                if (Character.isISOControl(utf8CodePoint) && !Character.isWhitespace(utf8CodePoint)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public axf intercept(rfa.a aVar) throws Exception {
        StringBuilder sb = new StringBuilder();
        Request request = aVar.request();
        itf itfVarA = request.a();
        boolean z = itfVarA != null;
        wy3 wy3VarD = aVar.d();
        sb.append("请求方式 ----> " + request.l() + "\n请求地址: " + request.t() + "\nHttp 版本:" + (wy3VarD != null ? wy3VarD.protocol() : Protocol.HTTP_1_1));
        if (z && itfVarA.contentType() != null) {
            sb.append("\n请求头 ----> Content-Type: ");
            sb.append(itfVarA.contentType());
        }
        sb.append("\n请求参数 ----> ");
        jk8 jk8VarH = request.h();
        int size = jk8VarH.size();
        for (int i = 0; i < size; i++) {
            String strC = jk8VarH.c(i);
            if (!"Content-Type".equalsIgnoreCase(strC) && !"Content-Length".equalsIgnoreCase(strC)) {
                sb.append(strC);
                sb.append(": ");
                sb.append(jk8VarH.h(i));
            }
        }
        if (!z) {
            sb.append("\n请求结束 --> END " + request.l());
        } else if (a(request.h())) {
            sb.append("\n请求结束 --> END " + request.l() + " (encoded body omitted)");
        } else {
            Buffer buffer = new Buffer();
            itfVarA.writeTo(buffer);
            Charset charset = a;
            MediaType mediaTypeContentType = itfVarA.contentType();
            if (mediaTypeContentType != null) {
                charset = mediaTypeContentType.charset(charset);
            }
            if (b(buffer)) {
                sb.append("\n请求体 ----> " + buffer.readString(charset));
                sb.append("\n请求结束 --> END " + request.l() + " (" + itfVarA.contentLength() + "-byte body)");
            } else {
                sb.append("\n请求结束 --> END " + request.l() + " (binary " + itfVarA.contentLength() + "-byte body omitted)");
            }
        }
        long jNanoTime = System.nanoTime();
        try {
            axf axfVarC = aVar.c(request);
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime);
            exf exfVarG = axfVarC.g();
            sb.append("\n请求头 ----> \n" + axfVarC.C().h().toString());
            if (itfVarA != null) {
                long jL = exfVarG.l();
                sb.append("请求code ----> " + axfVarC.m() + " 用时:(" + millis + "ms)");
                BufferedSource bufferedSourceP = exfVarG.p();
                bufferedSourceP.request(Long.MAX_VALUE);
                Buffer buffer2 = bufferedSourceP.buffer();
                Charset charset2 = a;
                MediaType mediaTypeM = exfVarG.m();
                if (mediaTypeM != null) {
                    try {
                        charset2 = mediaTypeM.charset(charset2);
                    } catch (UnsupportedCharsetException unused) {
                        sb.append("\nCouldn't decode the response body; charset is likely malformed.");
                        sb.append("\n<-- END HTTP");
                        return axfVarC;
                    }
                }
                if (!b(buffer2)) {
                    sb.append("\n<-- END HTTP (binary " + buffer2.size() + "-byte body omitted)");
                    return axfVarC;
                }
                if (jL != 0) {
                    sb.append("\n返回数据 ---->");
                    sb.append(Weather.SEPARATOR + buffer2.clone().readString(charset2));
                }
                sb.append("\n<-- 请求结束 END HTTP (" + buffer2.size() + "-byte body)");
            }
            Log.i("LogInterceptor", "请求信息如下:\n" + ((Object) sb));
            return axfVarC;
        } catch (Exception e) {
            sb.append("\n请求出错 ----> ");
            sb.append(e.getMessage());
            Log.i("LogInterceptor", "请求信息如下:\n" + ((Object) sb));
            throw e;
        }
    }
}
