package com.oplus.statistics.data;

import android.content.Context;
import androidx.annotation.NonNull;
import com.oplus.statistics.DataOverSizeException;
import com.oplus.statistics.util.CastUtil;
import com.oplus.statistics.util.LogUtil;
import com.oplus.statistics.util.Supplier;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class CommonBatchBean extends CommonBean {
    public CommonBatchBean(Context context) {
        super(context);
    }

    @Override // com.oplus.statistics.data.CommonBean, com.oplus.statistics.data.TrackEvent
    public int getEventType() {
        return 1010;
    }

    public void setLogMap(List<Map<String, String>> list) throws DataOverSizeException {
        JSONArray jSONArray = new JSONArray();
        Iterator<Map<String, String>> it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(CastUtil.map2JsonObject(it.next()));
        }
        String string = jSONArray.toString();
        if (string.length() < 131072) {
            this.h = string;
            d("mapList", string);
            return;
        }
        final String str = "DataOverSizeException :" + getAppId() + ", " + getLogTag() + ", " + getEventID();
        str.getClass();
        LogUtil.w("CommonBatchBean", new Supplier() { // from class: com.oplus.aiunit.vision.dn3
            @Override // com.oplus.statistics.util.Supplier
            public final Object get() {
                return str.toString();
            }
        });
        throw new DataOverSizeException(str);
    }

    public CommonBatchBean(@NonNull Context context, String str, String str2, String str3) {
        super(context, str, str2, str3);
    }
}
