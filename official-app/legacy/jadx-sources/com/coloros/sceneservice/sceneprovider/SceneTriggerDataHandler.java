package com.coloros.sceneservice.sceneprovider;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Keep;
import com.coloros.sceneservice.j.c;
import com.coloros.sceneservice.m.e;
import com.coloros.sceneservice.m.f;
import com.coloros.sceneservice.m.g;
import com.coloros.sceneservice.sceneprovider.model.SceneInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class SceneTriggerDataHandler {
    public static final String TAG = "SceneTriggerDataHandler";
    public static final String Ub = "sceneId";
    public static final String Vb = "_list";
    public static final String Wb = ",";

    @Keep
    public static void parseSceneIntent(Intent intent, List list) {
        if (intent == null) {
            f.w(TAG, "parseSceneIntent intent is null, return");
            return;
        }
        String stringExtra = intent.getStringExtra("sceneId");
        if (TextUtils.isEmpty(stringExtra)) {
            f.w(TAG, "onReceive: sceneId is empty");
            return;
        }
        Bundle extras = intent.getExtras();
        f.d(TAG, "parseSceneIntent:  sceneId:" + stringExtra);
        if (extras == null) {
            f.w(TAG, "parseSceneIntent: sceneData is null!");
            return;
        }
        String[] strArrSplit = stringExtra.split(",");
        if (strArrSplit.length <= 0) {
            return;
        }
        for (String str : strArrSplit) {
            if (!list.contains(str)) {
                f.d(TAG, "sceneIds is not support " + str);
                return;
            }
            int i = g.parseInt(str, 0);
            if (i <= 0) {
                f.d(TAG, "parseSceneIntent:sceneId invalid, continue");
            } else {
                ArrayList<Parcelable> parcelableArrayList = extras.getParcelableArrayList(str + Vb);
                if (!e.a(parcelableArrayList)) {
                    for (Parcelable parcelable : parcelableArrayList) {
                        SceneInfo sceneInfo = new SceneInfo(i);
                        if (parcelable instanceof Bundle) {
                            sceneInfo.setPolicyData((Bundle) parcelable);
                        }
                        try {
                            f.d(TAG, "submitServiceTask begin:");
                            c.getInstance().a(sceneInfo);
                            f.d(TAG, "submitServiceTask end:");
                        } catch (Exception e2) {
                            f.w(TAG, "submitServiceTask error e =" + e2);
                        }
                    }
                }
                try {
                    Bundle bundle = e.a(parcelableArrayList) ? null : (Bundle) parcelableArrayList.get(0);
                    f.d(TAG, "submitSceneTask begin");
                    c.getInstance().a(i, bundle);
                    f.d(TAG, "submitSceneTask end");
                } catch (Exception e3) {
                    f.d(TAG, "submitSceneTask error " + e3);
                }
            }
        }
    }
}
