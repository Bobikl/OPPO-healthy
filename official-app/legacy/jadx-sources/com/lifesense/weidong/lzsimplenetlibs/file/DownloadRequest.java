package com.lifesense.weidong.lzsimplenetlibs.file;

import android.net.Uri;
import com.lifesense.weidong.lzsimplenetlibs.base.BaseRequest;
import com.lifesense.weidong.lzsimplenetlibs.net.callback.IRequestCallBack;
import java.io.File;

/* JADX INFO: loaded from: classes5.dex */
public class DownloadRequest extends BaseRequest {
    public boolean canceled;
    public boolean isResume = true;
    public OnLoadingListener onLoadingListener;
    public String sourceUrl;
    public String target;

    public interface OnLoadingListener {
        void onLoading(long j2, long j3);
    }

    public DownloadRequest(String str, String str2) {
        setRequestMethod("GET");
        init(str, str2);
    }

    private void init(String str, String str2) {
        long length = new File(str).length();
        if (this.isResume && length > 0) {
            addHeaderParams("Range", "bytes=" + length + "-");
        }
        this.target = str;
        Uri uri = Uri.parse(str2);
        setDomain(uri.getScheme() + "://" + uri.getHost());
        this.sourceUrl = uri.getPath();
        for (String str3 : uri.getQueryParameterNames()) {
            addUrlParams(str3, uri.getQueryParameter(str3));
        }
    }

    public void cancel() {
        this.canceled = true;
    }

    public void execute(IDownloadRequestCallback iDownloadRequestCallback) {
        super.execute((IRequestCallBack) iDownloadRequestCallback);
    }

    public OnLoadingListener getOnLoadingListener() {
        return this.onLoadingListener;
    }

    @Override // com.lifesense.weidong.lzsimplenetlibs.base.BaseRequest
    public String getResponseClassName() {
        return DownloadResponse.class.getName();
    }

    public String getTarget() {
        return this.target;
    }

    @Override // com.lifesense.weidong.lzsimplenetlibs.base.BaseRequest
    public String getUrlWithoutProtocol() {
        return this.sourceUrl;
    }

    public boolean isCanceled() {
        return this.canceled;
    }

    public boolean isResume() {
        return this.isResume;
    }

    public void setOnLoadingListener(OnLoadingListener onLoadingListener) {
        this.onLoadingListener = onLoadingListener;
    }

    public void setResume(boolean z) {
        this.isResume = z;
    }
}
