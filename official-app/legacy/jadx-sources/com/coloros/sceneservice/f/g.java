package com.coloros.sceneservice.f;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.coloros.sceneservice.dataprovider.bean.SceneStatusInfo;

/* JADX INFO: loaded from: classes13.dex */
public class g extends a {
    public static final String TAG = "SceneStatusManager";
    public static volatile g sInstance;

    public g(Context context) {
        super(context);
    }

    public static g getInstance(Context context) {
        if (sInstance == null) {
            synchronized (g.class) {
                if (sInstance == null) {
                    sInstance = new g(context);
                }
            }
        }
        return sInstance;
    }

    public SceneStatusInfo b(String str) {
        return (SceneStatusInfo) a("scene_name=\"" + str + "\"", null, null);
    }

    @Override // com.coloros.sceneservice.f.a
    public Uri getUri() {
        return com.coloros.sceneservice.e.c.URI;
    }

    public SceneStatusInfo a(int i) {
        return (SceneStatusInfo) a("scene_id=" + i, null, null);
    }

    @Override // com.coloros.sceneservice.f.a
    public SceneStatusInfo a(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        SceneStatusInfo sceneStatusInfo = new SceneStatusInfo();
        sceneStatusInfo.mSceneId = com.coloros.sceneservice.m.c.c(cursor, "scene_id");
        sceneStatusInfo.mSceneName = com.coloros.sceneservice.m.c.e(cursor, "scene_name");
        sceneStatusInfo.mSceneStatus = com.coloros.sceneservice.m.c.c(cursor, "scene_status");
        sceneStatusInfo.mSceneEndTime = com.coloros.sceneservice.m.c.e(cursor, com.coloros.sceneservice.e.c._a);
        sceneStatusInfo.mSceneStartTime = com.coloros.sceneservice.m.c.e(cursor, com.coloros.sceneservice.e.c.Za);
        sceneStatusInfo.mBusinessId = com.coloros.sceneservice.m.c.e(cursor, com.coloros.sceneservice.e.c.ab);
        sceneStatusInfo.mExtraData = com.coloros.sceneservice.m.c.e(cursor, "extra_data");
        return sceneStatusInfo;
    }

    @Override // com.coloros.sceneservice.f.a
    public ContentValues a(SceneStatusInfo sceneStatusInfo) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("scene_id", Integer.valueOf(sceneStatusInfo.mSceneId));
        contentValues.put("scene_name", sceneStatusInfo.mSceneName);
        contentValues.put("scene_status", Integer.valueOf(sceneStatusInfo.mSceneStatus));
        contentValues.put(com.coloros.sceneservice.e.c._a, sceneStatusInfo.mSceneEndTime);
        contentValues.put(com.coloros.sceneservice.e.c.Za, sceneStatusInfo.mSceneStartTime);
        contentValues.put(com.coloros.sceneservice.e.c.ab, sceneStatusInfo.mBusinessId);
        contentValues.put("extra_data", sceneStatusInfo.mExtraData);
        return contentValues;
    }
}
