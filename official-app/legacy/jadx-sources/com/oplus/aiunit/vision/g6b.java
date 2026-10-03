package com.oplus.aiunit.vision;

import android.util.Log;
import com.oplus.pantaconnect.sdk.discovery.fusion.ServiceNodeBundleKeys;
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

/* JADX INFO: loaded from: classes18.dex */
public class g6b implements jea {
    public static final String END = "\n请求结束 --> END ";
    public static final Charset a = Charset.forName("UTF-8");

    public final boolean a(gj8 gj8Var) {
        String strA = gj8Var.a(ar9.CONTENT_ENCODING);
        return (strA == null || strA.equalsIgnoreCase(ServiceNodeBundleKeys.IDENTITY)) ? false : true;
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

    @Override // com.oplus.aiunit.vision.jea
    public ytf intercept(jea.a aVar) throws Exception {
        StringBuilder sb = new StringBuilder();
        Request request = aVar.request();
        gqf body = request.getBody();
        boolean z = body != null;
        jy3 jy3VarD = aVar.d();
        sb.append("请求方式 ----> " + request.getMethod() + "\n请求地址: " + request.getUrl() + "\nHttp 版本:" + (jy3VarD != null ? jy3VarD.protocol() : Protocol.HTTP_1_1));
        if (z && body.getContentType() != null) {
            sb.append("\n请求头 ----> Content-Type: ");
            sb.append(body.getContentType());
        }
        sb.append("\n请求参数 ----> ");
        gj8 headers = request.getHeaders();
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            String strC = headers.c(i);
            if (!"Content-Type".equalsIgnoreCase(strC) && !"Content-Length".equalsIgnoreCase(strC)) {
                sb.append(strC);
                sb.append(": ");
                sb.append(headers.h(i));
            }
        }
        if (!z) {
            sb.append("\n请求结束 --> END " + request.getMethod());
        } else if (a(request.getHeaders())) {
            sb.append("\n请求结束 --> END " + request.getMethod() + " (encoded body omitted)");
        } else {
            Buffer buffer = new Buffer();
            body.writeTo(buffer);
            Charset charset = a;
            MediaType contentType = body.getContentType();
            if (contentType != null) {
                charset = contentType.charset(charset);
            }
            if (b(buffer)) {
                sb.append("\n请求体 ----> " + buffer.readString(charset));
                sb.append("\n请求结束 --> END " + request.getMethod() + " (" + body.contentLength() + "-byte body)");
            } else {
                sb.append("\n请求结束 --> END " + request.getMethod() + " (binary " + body.contentLength() + "-byte body omitted)");
            }
        }
        long jNanoTime = System.nanoTime();
        try {
            ytf ytfVarC = aVar.c(request);
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime);
            cuf body2 = ytfVarC.getBody();
            sb.append("\n请求头 ----> \n" + ytfVarC.getRequest().getHeaders().toString());
            if (body != null) {
                long contentLength = body2.getContentLength();
                sb.append("请求code ----> " + ytfVarC.getCode() + " 用时:(" + millis + "ms)");
                BufferedSource source = body2.getSource();
                source.request(Long.MAX_VALUE);
                Buffer bufferField = source.getBufferField();
                Charset charset2 = a;
                MediaType k = body2.getK();
                if (k != null) {
                    try {
                        charset2 = k.charset(charset2);
                    } catch (UnsupportedCharsetException unused) {
                        sb.append("\nCouldn't decode the response body; charset is likely malformed.");
                        sb.append("\n<-- END HTTP");
                        return ytfVarC;
                    }
                }
                if (!b(bufferField)) {
                    sb.append("\n<-- END HTTP (binary " + bufferField.size() + "-byte body omitted)");
                    return ytfVarC;
                }
                if (contentLength != 0) {
                    sb.append("\n返回数据 ---->");
                    sb.append(Weather.SEPARATOR + bufferField.clone().readString(charset2));
                }
                sb.append("\n<-- 请求结束 END HTTP (" + bufferField.size() + "-byte body)");
            }
            Log.i("LogInterceptor", "请求信息如下:\n" + ((Object) sb));
            return ytfVarC;
        } catch (Exception e2) {
            sb.append("\n请求出错 ----> ");
            sb.append(e2.getMessage());
            Log.i("LogInterceptor", "请求信息如下:\n" + ((Object) sb));
            throw e2;
        }
    }
}
