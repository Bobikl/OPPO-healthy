package com.sensorsdata.analytics.android.sdk.visual;

import android.app.Activity;
import android.text.TextUtils;
import android.util.LruCache;
import com.sensorsdata.analytics.android.sdk.util.AppStateTools;
import com.sensorsdata.analytics.android.sdk.util.SnapCache;
import com.sensorsdata.analytics.android.sdk.visual.model.CommonNode;
import com.sensorsdata.analytics.android.sdk.visual.model.FlutterNode;
import com.sensorsdata.analytics.android.sdk.visual.model.FlutterNodeInfo;
import com.sensorsdata.analytics.android.sdk.visual.model.NodeInfo;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class FlutterNodesManager extends AbstractNodesManager {
    @Override // com.sensorsdata.analytics.android.sdk.visual.AbstractNodesManager
    public void handlerVisualizedFailure(String str, List<NodeInfo.AlertInfo> list) {
        AbstractNodesManager.sNodesCache.put(str, FlutterNodeInfo.createAlertInfo(list));
    }

    @Override // com.sensorsdata.analytics.android.sdk.visual.AbstractNodesManager
    public void handlerVisualizedPageInfo(String str) {
        FlutterNodeInfo pageInfo = parsePageInfo(str);
        if (AbstractNodesManager.sPageInfoCache == null) {
            AbstractNodesManager.sPageInfoCache = new LruCache<>(10);
        }
        Activity foregroundActivity = AppStateTools.getInstance().getForegroundActivity();
        if (foregroundActivity == null) {
            return;
        }
        AbstractNodesManager.sPageInfoCache.put(SnapCache.getInstance().getCanonicalName(foregroundActivity.getClass()), pageInfo);
    }

    @Override // com.sensorsdata.analytics.android.sdk.visual.AbstractNodesManager
    public void handlerVisualizedTrack(List<? extends CommonNode> list) {
        Activity foregroundActivity = AppStateTools.getInstance().getForegroundActivity();
        String canonicalName = foregroundActivity != null ? foregroundActivity.getClass().getCanonicalName() : "";
        if (TextUtils.isEmpty(canonicalName)) {
            return;
        }
        AbstractNodesManager.sNodesCache.put(canonicalName, FlutterNodeInfo.createNodesInfo(list));
    }

    @Override // com.sensorsdata.analytics.android.sdk.visual.AbstractNodesManager
    public CommonNode parseExtraNodesInfo(JSONObject jSONObject) {
        FlutterNode flutterNode = new FlutterNode();
        flutterNode.setTitle(jSONObject.optString("title"));
        flutterNode.setScreen_name(jSONObject.optString("screen_name"));
        flutterNode.setVisibility(true);
        return flutterNode;
    }

    public FlutterNodeInfo parsePageInfo(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONObject("data");
            return FlutterNodeInfo.createPageInfo(jSONObject.optString("title"), jSONObject.optString("screen_name"), jSONObject.optString("lib_version"));
        } catch (JSONException e2) {
            e2.printStackTrace();
            return null;
        }
    }
}
