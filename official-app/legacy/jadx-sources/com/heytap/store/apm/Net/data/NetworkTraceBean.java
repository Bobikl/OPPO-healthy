package com.heytap.store.apm.Net.data;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class NetworkTraceBean implements Serializable {
    public static String CALL_END = "callEnd";
    public static String CALL_START = "callStart";
    public static String CONNECT_END = "connectEnd";
    public static String CONNECT_START = "connectStart";
    public static String DNS_END = "dnsEnd";
    public static String DNS_START = "dnsStart";
    public static String REQUEST_BODY_END = "requestBodyEnd";
    public static String REQUEST_BODY_START = "requestBodyStart";
    public static String REQUEST_HEADERS_END = "requestHeadersEnd";
    public static String REQUEST_HEADERS_START = "requestHeadersStart";
    public static String RESPONSE_BODY_END = "responseBodyEnd";
    public static String RESPONSE_BODY_START = "responseBodyStart";
    public static String RESPONSE_HEADERS_END = "responseHeadersEnd";
    public static String RESPONSE_HEADERS_START = "responseHeadersStart";
    public static String SECURE_CONNECT_END = "secureConnectEnd";
    public static String SECURE_CONNECT_START = "secureConnectStart";
    public static String TRACE_NAME_CONNECT = "Connect";
    public static String TRACE_NAME_DNS = "DNS";
    public static String TRACE_NAME_REQUEST_BODY = "Request Body";
    public static String TRACE_NAME_REQUEST_HEADERS = "Request Headers";
    public static String TRACE_NAME_RESPONSE_BODY = "Response Body";
    public static String TRACE_NAME_RESPONSE_HEADERS = "Response Headers";
    public static String TRACE_NAME_SECURE_CONNECT = "Secure Connect";
    public static String TRACE_NAME_TOTAL = "Total Time";
    private int httpCode;
    private String id;
    private long time;
    private String url;
    private int businessCode = 200;
    private String traceId = "";
    private String businessMsg = "";
    private String contentLength = "";
    private Map<String, Long> networkEventsMap = new HashMap();
    private Map<String, Long> traceItemList = new HashMap();
    private Map<String, String> requestHeadersMap = new HashMap();
    private Map<String, String> requestParamsMap = new HashMap();

    public int getBusinessCode() {
        return this.businessCode;
    }

    public String getBusinessMsg() {
        return this.businessMsg;
    }

    public String getContentLength() {
        return this.contentLength;
    }

    public int getHttpCode() {
        return this.httpCode;
    }

    public String getId() {
        return this.id;
    }

    public Map<String, Long> getNetworkEventsMap() {
        return this.networkEventsMap;
    }

    public Map<String, String> getRequestHeadersMap() {
        return this.requestHeadersMap;
    }

    public Map<String, String> getRequestParamsMap() {
        return this.requestParamsMap;
    }

    public long getTime() {
        return this.time;
    }

    public String getTraceId() {
        return this.traceId;
    }

    public Map<String, Long> getTraceItemList() {
        return this.traceItemList;
    }

    public String getUrl() {
        return this.url;
    }

    public void setBusinessCode(int i) {
        this.businessCode = i;
    }

    public void setBusinessMsg(String str) {
        this.businessMsg = str;
    }

    public void setContentLength(String str) {
        this.contentLength = str;
    }

    public void setHttpCode(int i) {
        this.httpCode = i;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setNetworkEventsMap(Map<String, Long> map) {
        this.networkEventsMap = map;
    }

    public void setRequestHeadersMap(Map<String, String> map) {
        this.requestHeadersMap = map;
    }

    public void setTime(long j2) {
        this.time = j2;
    }

    public void setTraceId(String str) {
        this.traceId = str;
    }

    public void setTraceItemList(Map<String, Long> map) {
        this.traceItemList = map;
    }

    public void setUrl(String str) {
        this.url = str;
    }
}
