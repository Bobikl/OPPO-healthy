package com.heytap.store.apm;

import com.heytap.store.apm.Net.utils.NetWorkUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class PageTrackBean {
    public static final String CREATE_TIME = "pagePrepareTime";
    public static final String LAYOUT_TIME = "layoutTime";
    public static final String PAGE_API_REQUEST_END = "requestEnd";
    public static final String PAGE_API_REQUEST_START = "requestStart";
    public static final String PAGE_END = "pageEnd";
    public static final String PAGE_LAYOUT_START = "layoutStart";
    public static final String PAGE_START = "pageStart";
    public static final String PARSE_TIME = "dataParseTime";
    public static final String REQUEST_TIME = "requestTime";
    public static final int STATUS_OK = 1;
    public static final int STATUS_TIMEOUT = 0;
    public static final String TOTAL_TIME = "totalTime";
    private String pageErrorMgs;
    private String pageId;
    private String pageName;
    private int status = -1;
    private Map<String, Long> eventList = new HashMap();
    private Map<String, Long> trackItemList = new HashMap();

    public PageTrackBean(String str) {
        this.pageName = str;
        this.eventList.put(PAGE_START, Long.valueOf(System.currentTimeMillis()));
    }

    private void generateTraceData() {
        this.trackItemList.put(CREATE_TIME, Long.valueOf(NetWorkUtils.getEventCostTime(this.eventList, PAGE_START, PAGE_API_REQUEST_START)));
        this.trackItemList.put(REQUEST_TIME, Long.valueOf(NetWorkUtils.getEventCostTime(this.eventList, PAGE_API_REQUEST_START, PAGE_API_REQUEST_END)));
        this.trackItemList.put(PARSE_TIME, Long.valueOf(NetWorkUtils.getEventCostTime(this.eventList, PAGE_API_REQUEST_END, PAGE_LAYOUT_START)));
        this.trackItemList.put(LAYOUT_TIME, Long.valueOf(NetWorkUtils.getEventCostTime(this.eventList, PAGE_LAYOUT_START, PAGE_END)));
        this.trackItemList.put(TOTAL_TIME, Long.valueOf(NetWorkUtils.getEventCostTime(this.eventList, PAGE_START, PAGE_END)));
    }

    public Map<String, Long> getEventList() {
        return this.eventList;
    }

    public long getLoadDuration() {
        if (this.trackItemList.containsKey(TOTAL_TIME)) {
            return this.trackItemList.get(TOTAL_TIME).longValue();
        }
        return 0L;
    }

    public String getPageErrorMgs() {
        return this.pageErrorMgs;
    }

    public String getPageId() {
        return this.pageId;
    }

    public String getPageName() {
        return this.pageName;
    }

    public int getStatus() {
        return this.status;
    }

    public Map<String, Long> getTrackItemList() {
        return this.trackItemList;
    }

    public void saveTime(String str, long j2) {
        this.eventList.put(str, Long.valueOf(j2));
    }

    public void setPageErrorMgs(String str) {
        this.pageErrorMgs = str;
    }

    public void setPageId(String str) {
        this.pageId = str;
    }

    public void setStatus(int i) {
        this.status = i;
        this.eventList.put(PAGE_END, Long.valueOf(System.currentTimeMillis()));
        generateTraceData();
    }
}
