package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.heytap.databaseengine.model.SpaceCardMetaData;
import com.heytap.databaseengine.model.SpaceInfo;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public class c5i {
    public static boolean a(Map<String, List<SpaceInfo>> map, String str) {
        SpaceInfo spaceInfo;
        return (lza.a(map.get(str)) || (spaceInfo = map.get(str).get(0)) == null || lza.a(spaceInfo.getMaterielList()) || spaceInfo.getMaterielList().get(0) == null) ? false : true;
    }

    public static String b(SpaceCardMetaData spaceCardMetaData) {
        if (!TextUtils.isEmpty(spaceCardMetaData.getDarkImageUrl()) && qe0.y(b78.a())) {
            return spaceCardMetaData.getDarkImageUrl();
        }
        return spaceCardMetaData.getImageUrl();
    }
}
