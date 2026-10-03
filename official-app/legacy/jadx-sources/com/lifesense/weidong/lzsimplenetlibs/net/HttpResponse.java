package com.lifesense.weidong.lzsimplenetlibs.net;

import java.io.InputStream;
import java.net.URL;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class HttpResponse {
    public int contentLength;
    public String contentType;
    public String context;
    public String errorMessage;
    public Map<String, List<String>> headerFields;
    public InputStream responseContent;
    public int responseStatus;
    public URL url;

    public int getContentLength() {
        return this.contentLength;
    }

    public String getContentType() {
        return this.contentType;
    }

    public String getContext() {
        return this.context;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public String getHeaderField(String str) {
        List<String> list;
        Map<String, List<String>> map = this.headerFields;
        if (map == null || (list = map.get(str)) == null || list.size() <= 0) {
            return null;
        }
        list.get(0);
        return null;
    }

    public Map<String, List<String>> getHeaderFields() {
        return this.headerFields;
    }

    public InputStream getResponseContent() {
        return this.responseContent;
    }

    public int getResponseStatus() {
        return this.responseStatus;
    }

    public URL getUrl() {
        return this.url;
    }

    public void setContentLength(int i) {
        this.contentLength = i;
    }

    public void setContentType(String str) {
        this.contentType = str;
    }

    public void setContext(String str) {
        this.context = str;
    }

    public void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public void setHeaderFields(Map<String, List<String>> map) {
        this.headerFields = map;
    }

    public void setResponseContent(InputStream inputStream) {
        this.responseContent = inputStream;
    }

    public void setResponseStatus(int i) {
        this.responseStatus = i;
    }

    public void setUrl(URL url) {
        this.url = url;
    }

    public String toString() {
        return "HttpResponse{responseStatus=" + this.responseStatus + ", contentLength=" + this.contentLength + ", contentType='" + this.contentType + "', headerFields=" + this.headerFields + ", errorMessage='" + this.errorMessage + "', context='" + this.context + "', responseContent=" + this.responseContent + '}';
    }
}
