package com.lifesense.weidong.lzsimplenetlibs.net.invoker;

import android.os.SystemClock;
import android.text.TextUtils;
import com.lifesense.weidong.lzsimplenetlibs.base.BaseRequest;
import com.lifesense.weidong.lzsimplenetlibs.base.BaseResponse;
import com.lifesense.weidong.lzsimplenetlibs.cookie.LZCookieManager;
import com.lifesense.weidong.lzsimplenetlibs.file.DownloadRequest;
import com.lifesense.weidong.lzsimplenetlibs.net.HttpResponse;
import com.lifesense.weidong.lzsimplenetlibs.net.exception.UserCanceledException;
import com.liulishuo.okdownload.core.Util;
import com.oplus.smartenginehelper.ParserTag;
import com.platform.usercenter.network.header.HeaderConstant;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import org.apache.commons.collections4.MapUtils;

/* JADX INFO: loaded from: classes5.dex */
public abstract class BaseApiInvoker implements ApiInvoker {
    public final String TAG = getClass().getSimpleName();

    private void doPost(BaseRequest baseRequest, BaseResponse baseResponse) throws Throwable {
        byte[] bytesFromStream;
        HttpResponse httpResponsePerformRequest = performRequest(baseRequest);
        if (baseRequest instanceof DownloadRequest) {
            DownloadRequest downloadRequest = (DownloadRequest) baseRequest;
            if (downloadRequest.isResume() && !isSupportRange(httpResponsePerformRequest)) {
                downloadRequest.setResume(false);
            }
            bytesFromStream = getBytesFromStreamWithLoading(downloadRequest, httpResponsePerformRequest);
        } else {
            bytesFromStream = getBytesFromStream(httpResponsePerformRequest.getResponseContent());
        }
        LZCookieManager.getInstance().saveCookie(httpResponsePerformRequest);
        if (bytesFromStream == null || bytesFromStream.length <= 0) {
            return;
        }
        baseResponse.setContent(new String(bytesFromStream));
        baseResponse.setmRet(200);
    }

    private byte[] getBytesFromStream(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int i = inputStream.read(bArr);
            if (i == -1) {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                inputStream.close();
                return byteArray;
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
    }

    private byte[] getBytesFromStreamWithLoading(DownloadRequest downloadRequest, HttpResponse httpResponse) throws Throwable {
        FileOutputStream fileOutputStream;
        long length;
        int i;
        SystemClock.uptimeMillis();
        String target = downloadRequest.getTarget();
        InputStream inputStream = null;
        if (TextUtils.isEmpty(target) || target.trim().length() == 0) {
            return null;
        }
        File file = new File(target);
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        if (!file.exists()) {
            file.createNewFile();
        }
        if (downloadRequest.isCanceled() || httpResponse.getResponseStatus() == 416) {
            return target.getBytes();
        }
        try {
            if (downloadRequest.isResume()) {
                length = file.length();
                fileOutputStream = new FileOutputStream(target, true);
            } else {
                fileOutputStream = new FileOutputStream(target);
                length = 0;
            }
            try {
                if (downloadRequest.isCanceled()) {
                    byte[] bytes = target.getBytes();
                    fileOutputStream.close();
                    return bytes;
                }
                InputStream responseContent = httpResponse.getResponseContent();
                long contentLength = ((long) httpResponse.getContentLength()) + length;
                if (length < contentLength && !downloadRequest.isCanceled()) {
                    DownloadRequest.OnLoadingListener onLoadingListener = downloadRequest.getOnLoadingListener();
                    byte[] bArr = new byte[1024];
                    while (!downloadRequest.isCanceled() && length < contentLength && (i = responseContent.read(bArr, 0, 1024)) > 0) {
                        fileOutputStream.write(bArr, 0, i);
                        length += (long) i;
                        if (onLoadingListener != null) {
                            onLoadingListener.onLoading(contentLength, length);
                        }
                    }
                    if (onLoadingListener != null) {
                        onLoadingListener.onLoading(contentLength, length);
                    }
                    if (downloadRequest.isCanceled() && length < contentLength) {
                        throw new UserCanceledException("user stop download thread");
                    }
                    if (responseContent != null) {
                        responseContent.close();
                    }
                    fileOutputStream.close();
                    return target.getBytes();
                }
                byte[] bytes2 = target.getBytes();
                if (responseContent != null) {
                    responseContent.close();
                }
                fileOutputStream.close();
                return bytes2;
            } catch (Throwable th) {
                th = th;
                if (0 != 0) {
                    inputStream.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = null;
        }
    }

    private String getHeader(HttpResponse httpResponse, String str) {
        return httpResponse.getHeaderField(str);
    }

    public static boolean hasResponseBody(String str, int i) {
        return (str == "HEAD" || (100 <= i && i < 200) || i == 204 || i == 304) ? false : true;
    }

    private String preHandler(BaseRequest baseRequest) {
        return String.format("%s%s", baseRequest.getUrl(), baseRequest.formatUrlParams());
    }

    private void setBytesToStream(OutputStream outputStream, byte[] bArr) throws IOException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        byte[] bArr2 = new byte[1024];
        while (true) {
            int i = byteArrayInputStream.read(bArr2);
            if (i == -1) {
                outputStream.flush();
                outputStream.close();
                byteArrayInputStream.close();
                return;
            }
            outputStream.write(bArr2, 0, i);
        }
    }

    public void doGet(BaseRequest baseRequest, BaseResponse baseResponse) throws Throwable {
        byte[] bytesFromStream;
        HttpResponse httpResponsePerformRequest = performRequest(baseRequest);
        if (baseRequest instanceof DownloadRequest) {
            DownloadRequest downloadRequest = (DownloadRequest) baseRequest;
            if (downloadRequest.isResume() && !isSupportRange(httpResponsePerformRequest)) {
                downloadRequest.setResume(false);
            }
            bytesFromStream = getBytesFromStreamWithLoading(downloadRequest, httpResponsePerformRequest);
        } else {
            bytesFromStream = getBytesFromStream(httpResponsePerformRequest.getResponseContent());
        }
        LZCookieManager.getInstance().saveCookie(httpResponsePerformRequest);
        if (bytesFromStream == null || bytesFromStream.length <= 0) {
            return;
        }
        baseResponse.setContent(new String(bytesFromStream));
        baseResponse.setmRet(200);
    }

    @Override // com.lifesense.weidong.lzsimplenetlibs.net.invoker.ApiInvoker
    public void executeCall(BaseRequest baseRequest, BaseResponse baseResponse) throws Throwable {
        int i;
        try {
            if (ParserTag.TAG_GET.equalsIgnoreCase(baseRequest.getRequestMethod())) {
                doGet(baseRequest, baseResponse);
            } else if ("post".equalsIgnoreCase(baseRequest.getRequestMethod())) {
                doPost(baseRequest, baseResponse);
            }
        } catch (UserCanceledException e2) {
            e = e2;
            i = HttpStatus.USER_CANCEL;
            baseResponse.setmRet(i);
            baseResponse.setmMsg(e.getMessage());
        } catch (Exception e3) {
            e = e3;
            i = 404;
            baseResponse.setmRet(i);
            baseResponse.setmMsg(e.getMessage());
        }
    }

    public abstract URLConnection getURLConnection(String str, String str2);

    public boolean isSupportRange(HttpResponse httpResponse) {
        if (TextUtils.equals(httpResponse.getHeaderField(Util.ACCEPT_RANGES), "bytes")) {
            return true;
        }
        String header = getHeader(httpResponse, Util.CONTENT_RANGE);
        return header != null && header.startsWith("bytes");
    }

    public HttpResponse performRequest(BaseRequest baseRequest) throws IOException {
        HttpURLConnection httpURLConnection;
        int responseCode;
        HttpResponse httpResponse;
        InputStream errorStream;
        int i = 0;
        while (true) {
            if (i >= 3) {
                throw new IOException();
            }
            URL url = new URL(preHandler(baseRequest));
            String aSCIIString = new URI(url.getProtocol(), url.getUserInfo(), url.getHost(), url.getPort(), url.getPath(), url.getQuery(), url.getRef()).toASCIIString();
            LZCookieManager.getInstance().addUriCookiesToHeads(baseRequest.getHeaderParams(), URI.create(aSCIIString));
            String requestMethod = baseRequest.getRequestMethod();
            httpURLConnection = (HttpURLConnection) getURLConnection(aSCIIString, requestMethod);
            if (MapUtils.isNotEmpty(baseRequest.getHeaderParams())) {
                for (Map.Entry<String, String> entry : baseRequest.getHeaderParams().entrySet()) {
                    httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                }
            }
            if ("POST".equals(requestMethod)) {
                httpURLConnection.setRequestProperty("Content-Type", BaseRequest.CONTENT_TYPE_JSON);
                if (TextUtils.isEmpty(baseRequest.dictToBody())) {
                    setBytesToStream(httpURLConnection.getOutputStream(), new byte[0]);
                } else {
                    setBytesToStream(httpURLConnection.getOutputStream(), baseRequest.dictToBody().getBytes());
                }
            }
            responseCode = httpURLConnection.getResponseCode();
            if (responseCode == -1) {
                throw new IOException("Could not retrieve response code from HttpUrlConnection.");
            }
            httpResponse = new HttpResponse();
            httpResponse.setResponseStatus(responseCode);
            httpResponse.setUrl(httpURLConnection.getURL());
            if (!(baseRequest instanceof DownloadRequest)) {
                break;
            }
            DownloadRequest downloadRequest = (DownloadRequest) baseRequest;
            if (downloadRequest.isResume() && !isSupportRange(httpResponse)) {
                downloadRequest.setResume(false);
            }
            if (responseCode == 416) {
                return httpResponse;
            }
            if (responseCode != 301 && responseCode != 302) {
                break;
            }
            baseRequest.setUrl(httpURLConnection.getHeaderField(HeaderConstant.HEAD_K_302_LOCATION));
            i++;
        }
        httpResponse.setErrorMessage(httpURLConnection.getResponseMessage());
        httpResponse.setContentLength(httpURLConnection.getContentLength());
        httpResponse.setContentType(httpURLConnection.getContentType());
        if (hasResponseBody(httpURLConnection.getRequestMethod(), responseCode)) {
            try {
                errorStream = httpURLConnection.getInputStream();
            } catch (IOException unused) {
                errorStream = httpURLConnection.getErrorStream();
            }
            httpResponse.setResponseContent(errorStream);
        }
        httpResponse.setHeaderFields(httpURLConnection.getHeaderFields());
        return httpResponse;
    }
}
