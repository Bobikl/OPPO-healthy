package com.sensorsdata.analytics.android.sdk.visual;

import android.text.TextUtils;
import android.util.LruCache;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import com.oplus.aiunit.vision.y04;
import com.sensorsdata.analytics.android.autotrack.core.beans.AutoTrackConstants;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.util.Dispatcher;
import com.sensorsdata.analytics.android.sdk.visual.constant.VisualConstants;
import com.sensorsdata.analytics.android.sdk.visual.model.CommonNode;
import com.sensorsdata.analytics.android.sdk.visual.model.NodeInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractNodesManager {
    protected static final String CALL_TYPE_PAGE_INFO = "page_info";
    protected static final String CALL_TYPE_VISUALIZED_TRACK = "visualized_track";
    protected static final int LRU_CACHE_MAX_SIZE = 10;
    private static final String TAG = "SA.Visual.AbstractNodesManager";
    protected static LruCache<String, NodeInfo> sNodesCache;
    protected static LruCache<String, NodeInfo> sPageInfoCache;
    protected boolean mHasAlertInfo;
    private boolean mHasWebView;
    protected String mLastThirdNodeMsg = null;

    public static class NodeRect {
        public float left;
        public float top;

        public NodeRect(float f, float f2) {
            this.top = f;
            this.left = f2;
        }
    }

    private void findWebNodes(JSONArray jSONArray, List<CommonNode> list, Map<String, NodeRect> map) {
        if (jSONArray != null) {
            try {
                if (jSONArray.length() > 0) {
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                        CommonNode extraNodesInfo = parseExtraNodesInfo(jSONObjectOptJSONObject);
                        extraNodesInfo.setId(jSONObjectOptJSONObject.optString("id"));
                        extraNodesInfo.set$element_content(jSONObjectOptJSONObject.optString(AutoTrackConstants.ELEMENT_CONTENT));
                        extraNodesInfo.setTop((float) jSONObjectOptJSONObject.optDouble("top"));
                        extraNodesInfo.setLeft((float) jSONObjectOptJSONObject.optDouble(y04.TIME_STYLE_LEFT_DIR_NAME));
                        extraNodesInfo.setScrollX((float) jSONObjectOptJSONObject.optDouble("scrollX"));
                        extraNodesInfo.setScrollY((float) jSONObjectOptJSONObject.optDouble("scrollY"));
                        extraNodesInfo.setWidth((float) jSONObjectOptJSONObject.optDouble(Fields.WIDTH_FIELD));
                        extraNodesInfo.setHeight((float) jSONObjectOptJSONObject.optDouble(Fields.HEIGHT_FIELD));
                        extraNodesInfo.setLevel(jSONObjectOptJSONObject.optInt("level"));
                        extraNodesInfo.set$element_path(jSONObjectOptJSONObject.optString(VisualConstants.ELEMENT_PATH));
                        extraNodesInfo.set$element_position(jSONObjectOptJSONObject.optString(VisualConstants.ELEMENT_POSITION));
                        extraNodesInfo.setEnable_click(jSONObjectOptJSONObject.optBoolean("enable_click", true));
                        extraNodesInfo.setIs_list_view(jSONObjectOptJSONObject.optBoolean("is_list_view"));
                        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("subelements");
                        ArrayList arrayList = new ArrayList();
                        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                            for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                                String strOptString = jSONArrayOptJSONArray.optString(i2);
                                if (!TextUtils.isEmpty(strOptString)) {
                                    arrayList.add(strOptString);
                                    if (!map.containsKey(strOptString)) {
                                        map.put(strOptString, new NodeRect(extraNodesInfo.getTop(), extraNodesInfo.getLeft()));
                                    }
                                }
                            }
                        }
                        if (arrayList.size() > 0) {
                            extraNodesInfo.setSubelements(arrayList);
                        }
                        list.add(extraNodesInfo);
                    }
                }
            } catch (Exception e2) {
                SALog.printStackTrace(e2);
            }
        }
    }

    private void modifyWebNodes(List<? extends CommonNode> list, Map<String, NodeRect> map) {
        if (list == null || list.size() == 0) {
            return;
        }
        synchronized (this) {
            for (CommonNode commonNode : list) {
                commonNode.setOriginLeft(commonNode.getLeft());
                commonNode.setOriginTop(commonNode.getTop());
                if (map.containsKey(commonNode.getId())) {
                    NodeRect nodeRect = map.get(commonNode.getId());
                    if (nodeRect != null) {
                        commonNode.setTop(commonNode.getTop() - nodeRect.top);
                        commonNode.setLeft(commonNode.getLeft() - nodeRect.left);
                    }
                } else {
                    commonNode.setRootView(true);
                    float scrollY = !Float.isNaN(commonNode.getScrollY()) ? commonNode.getScrollY() : 0.0f;
                    float scrollX = Float.isNaN(commonNode.getScrollX()) ? 0.0f : commonNode.getScrollX();
                    commonNode.setTop(commonNode.getTop() + scrollY);
                    commonNode.setLeft(commonNode.getLeft() + scrollX);
                }
            }
        }
    }

    private List<NodeInfo.AlertInfo> parseAlertResult(String str) {
        ArrayList arrayList = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONArray jSONArrayOptJSONArray = new JSONObject(str).optJSONArray("data");
            if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
                return null;
            }
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                try {
                    JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(i);
                    if (jSONObject != null) {
                        arrayList2.add(new NodeInfo.AlertInfo(jSONObject.optString("title"), jSONObject.optString("message"), jSONObject.optString("link_text"), jSONObject.optString("link_url")));
                    }
                } catch (JSONException e2) {
                    e = e2;
                    arrayList = arrayList2;
                } catch (Exception e3) {
                    e = e3;
                    arrayList = arrayList2;
                    SALog.printStackTrace(e);
                    return arrayList;
                }
            }
            return arrayList2;
        } catch (JSONException e4) {
            e = e4;
        } catch (Exception e5) {
            e = e5;
        }
        SALog.printStackTrace(e);
        return arrayList;
    }

    private List<CommonNode> parseResult(String str) {
        JSONArray jSONArrayOptJSONArray = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        List<CommonNode> arrayList = new ArrayList<>();
        Map<String, NodeRect> map = new HashMap<>();
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("data");
            try {
                jSONArrayOptJSONArray = jSONObject.optJSONArray("extra_elements");
            } catch (Exception e2) {
                SALog.printStackTrace(e2);
            }
            if (jSONArrayOptJSONArray2 != null) {
                findWebNodes(jSONArrayOptJSONArray2, arrayList, map);
            }
            if (jSONArrayOptJSONArray != null) {
                findWebNodes(jSONArrayOptJSONArray, arrayList, map);
            }
            modifyWebNodes(arrayList, map);
            try {
                Collections.sort(arrayList, new Comparator<CommonNode>() { // from class: com.sensorsdata.analytics.android.sdk.visual.AbstractNodesManager.1
                    @Override // java.util.Comparator
                    public int compare(CommonNode commonNode, CommonNode commonNode2) {
                        return commonNode.getLevel() - commonNode2.getLevel();
                    }
                });
            } catch (Exception e3) {
                SALog.printStackTrace(e3);
            }
        } catch (JSONException e4) {
            SALog.printStackTrace(e4);
        } catch (Exception e5) {
            SALog.printStackTrace(e5);
        }
        return arrayList;
    }

    public void clear() {
        this.mLastThirdNodeMsg = null;
        this.mHasAlertInfo = false;
    }

    public String getLastThirdMsg() {
        return this.mLastThirdNodeMsg;
    }

    public NodeInfo getNodes(String str) {
        if (!VisualizedAutoTrackService.getInstance().isServiceRunning() && !HeatMapService.getInstance().isServiceRunning()) {
            return null;
        }
        if (sNodesCache == null) {
            sNodesCache = new LruCache<>(10);
        }
        return sNodesCache.get(str);
    }

    public NodeInfo getPageInfo(String str) {
        if (!VisualizedAutoTrackService.getInstance().isServiceRunning() && !HeatMapService.getInstance().isServiceRunning()) {
            return null;
        }
        if (sPageInfoCache == null) {
            sPageInfoCache = new LruCache<>(10);
        }
        return sPageInfoCache.get(str);
    }

    public void handlerFailure(String str, String str2) {
        try {
            Dispatcher.getInstance().removeCallbacksAndMessages();
            if ((VisualizedAutoTrackService.getInstance().isServiceRunning() || HeatMapService.getInstance().isServiceRunning()) && !TextUtils.isEmpty(str2)) {
                SALog.i(TAG, "handlerFailure url " + str + ",msg: " + str2);
                this.mHasAlertInfo = true;
                this.mLastThirdNodeMsg = String.valueOf(System.currentTimeMillis());
                List<NodeInfo.AlertInfo> alertResult = parseAlertResult(str2);
                if (alertResult == null || alertResult.size() <= 0) {
                    return;
                }
                if (sNodesCache == null) {
                    sNodesCache = new LruCache<>(10);
                }
                handlerVisualizedFailure(str, alertResult);
            }
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005e  */
    public void handlerMessage(String str) {
        Dispatcher.getInstance().removeCallbacksAndMessages();
        if ((VisualizedAutoTrackService.getInstance().isServiceRunning() || HeatMapService.getInstance().isServiceRunning()) && !TextUtils.isEmpty(str)) {
            this.mLastThirdNodeMsg = String.valueOf(System.currentTimeMillis());
            byte b = 0;
            this.mHasAlertInfo = false;
            try {
                String strOptString = new JSONObject(str).optString("callType");
                int iHashCode = strOptString.hashCode();
                if (iHashCode != 817885468) {
                    if (iHashCode == 883555422 && strOptString.equals(CALL_TYPE_PAGE_INFO)) {
                        b = 1;
                    } else {
                        b = -1;
                    }
                } else if (!strOptString.equals(CALL_TYPE_VISUALIZED_TRACK)) {
                    b = -1;
                }
                if (b != 0) {
                    if (b != 1) {
                        return;
                    }
                    handlerVisualizedPageInfo(str);
                    return;
                }
                List<CommonNode> result = parseResult(str);
                if (result == null || result.size() <= 0) {
                    return;
                }
                if (sNodesCache == null) {
                    sNodesCache = new LruCache<>(10);
                }
                handlerVisualizedTrack(result);
            } catch (JSONException e2) {
                SALog.printStackTrace(e2);
            } catch (Exception e3) {
                SALog.printStackTrace(e3);
            }
        }
    }

    public abstract void handlerVisualizedFailure(String str, List<NodeInfo.AlertInfo> list);

    public abstract void handlerVisualizedPageInfo(String str);

    public abstract void handlerVisualizedTrack(List<? extends CommonNode> list);

    public boolean hasAlertInfo() {
        return this.mHasAlertInfo;
    }

    public boolean hasThirdView() {
        return this.mHasWebView;
    }

    public abstract CommonNode parseExtraNodesInfo(JSONObject jSONObject);

    public void setHasThirdView(boolean z) {
        this.mHasWebView = z;
    }
}
