package com.heytap.store.homemodule.statistics;

import androidx.annotation.Keep;
import com.heytap.store.apm.util.DataReportUtilKt;
import com.heytap.store.base.core.data.IBean;
import com.heytap.store.base.core.util.statistics.bean.SensorsBean;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p010kotlin.Pair;

/* JADX INFO: loaded from: classes5.dex */
@Keep
public class HomeExposureJson extends JSONObject implements IBean {
    private String adId;
    private String adName;
    private String adPosition;
    private String addetail;
    private String attach;
    private String attach2;
    private String code;
    private String exp_id;
    private String experiment_id;
    private String item_id;
    private String item_type;
    private String log_id;
    private String module;
    public String module_code;
    public List<Pair<String, String>> others;
    public String pageId;
    private String page_url;
    private String retrieve_id;
    private String scene_id;
    public String search_id;
    private String section_id;
    private String sku_id;
    private String strategy_id;
    public String stream_ID;
    private String title;
    private String toolid;
    public String transParent;
    private int weight = 0;
    private boolean is_recommendation = false;

    public String getAdId() {
        return this.adId;
    }

    public String getAdName() {
        return this.adName;
    }

    public String getAdPosition() {
        return this.adPosition;
    }

    public String getAddetail() {
        return this.addetail;
    }

    public String getAttach() {
        return this.attach;
    }

    public String getAttach2() {
        return this.attach2;
    }

    public String getCode() {
        return this.code;
    }

    public String getExp_id() {
        return this.exp_id;
    }

    public String getExperiment_id() {
        return this.experiment_id;
    }

    public JSONObject getHomeExposureJson() {
        try {
            put("module", this.module);
            put(SensorsBean.TOOL_ID, this.toolid);
            put(SensorsBean.AD_POSITION, this.adPosition);
            put("adId", this.adId);
            put("adName", this.adName);
            put(SensorsBean.AD_DETAIL, this.addetail);
            put("attach", this.attach);
            put(SensorsBean.ATTACH2, this.attach2);
            put("item_id", this.item_id);
            put(SensorsBean.ITEM_TYPE, this.item_type);
            put("weight", this.weight);
            put(SensorsBean.IS_RECOMMENDATION, this.is_recommendation);
            put("title", this.title);
            put(SensorsBean.SECTION_ID, this.section_id);
            put("scene_id", this.scene_id);
            put(SensorsBean.EXP_ID, this.exp_id);
            put(SensorsBean.EXPERIMENT_ID, this.experiment_id);
            put(SensorsBean.STRATEGY_ID, this.strategy_id);
            put(SensorsBean.RETRIEVE_ID, this.retrieve_id);
            put(SensorsBean.LOG_ID, this.log_id);
            put("transparent", this.transParent);
            put(SensorsBean.MODULE_CODE, this.module_code);
            put(SensorsBean.STREAM_ID, this.stream_ID);
            put("page_id", this.pageId);
            put(SensorsBean.SKU_ID, this.sku_id);
            put(SensorsBean.PAGE_URL, this.page_url);
            put("code", this.code);
            List<Pair<String, String>> list = this.others;
            if (list != null && !list.isEmpty()) {
                for (Pair<String, String> pair : this.others) {
                    put(pair.getFirst(), pair.getSecond());
                }
            }
        } catch (JSONException e2) {
            DataReportUtilKt.reportExceptionEvent(e2);
            e2.printStackTrace();
        }
        return this;
    }

    public String getItem_id() {
        return this.item_id;
    }

    public String getItem_type() {
        return this.item_type;
    }

    public String getLog_id() {
        return this.log_id;
    }

    public String getModule() {
        return this.module;
    }

    public String getModule_code() {
        return this.module_code;
    }

    public String getPageId() {
        return this.pageId;
    }

    public String getPage_url() {
        return this.page_url;
    }

    public String getRetrieve_id() {
        return this.retrieve_id;
    }

    public String getScene_id() {
        return this.scene_id;
    }

    public String getSection_id() {
        return this.section_id;
    }

    public String getSku_id() {
        return this.sku_id;
    }

    public String getStrategy_id() {
        return this.strategy_id;
    }

    public String getStream_ID() {
        return this.stream_ID;
    }

    public String getTitle() {
        return this.title;
    }

    public String getToolid() {
        return this.toolid;
    }

    public int getWeight() {
        return this.weight;
    }

    public boolean isIs_recommendation() {
        return this.is_recommendation;
    }

    public void setAdId(String str) {
        this.adId = str;
    }

    public void setAdName(String str) {
        this.adName = str;
    }

    public void setAdPosition(String str) {
        this.adPosition = str;
    }

    public void setAddetail(String str) {
        this.addetail = str;
    }

    public void setAttach(String str) {
        this.attach = str;
    }

    public void setAttach2(String str) {
        this.attach2 = str;
    }

    public void setCode(String str) {
        this.code = str;
    }

    public void setExp_id(String str) {
        this.exp_id = str;
    }

    public void setExperiment_id(String str) {
        this.experiment_id = str;
    }

    public void setIs_recommendation(boolean z) {
        this.is_recommendation = z;
    }

    public void setItem_id(String str) {
        this.item_id = str;
    }

    public void setItem_type(String str) {
        this.item_type = str;
    }

    public void setLog_id(String str) {
        this.log_id = str;
    }

    public void setModule(String str) {
        this.module = str;
    }

    public void setModule_code(String str) {
        this.module_code = str;
    }

    public void setOthers(List<Pair<String, String>> list) {
        this.others = list;
    }

    public void setPageId(String str) {
        this.pageId = str;
    }

    public void setPage_url(String str) {
        this.page_url = str;
    }

    public void setRetrieve_id(String str) {
        this.retrieve_id = str;
    }

    public void setScene_id(String str) {
        this.scene_id = str;
    }

    public void setSection_id(String str) {
        this.section_id = str;
    }

    public void setSku_id(String str) {
        this.sku_id = str;
    }

    public void setStrategy_id(String str) {
        this.strategy_id = str;
    }

    public void setStream_ID(String str) {
        this.stream_ID = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setToolid(String str) {
        this.toolid = str;
    }

    public void setWeight(int i) {
        this.weight = i;
    }
}
