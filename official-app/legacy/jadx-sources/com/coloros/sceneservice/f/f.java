package com.coloros.sceneservice.f;

import android.content.ContentValues;
import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.coloros.sceneservice.dataprovider.bean.scene.SceneBankData;
import com.coloros.sceneservice.dataprovider.bean.scene.SceneData;
import com.coloros.sceneservice.dataprovider.bean.scene.SceneExpressageData;
import com.coloros.sceneservice.dataprovider.bean.scene.SceneFlightData;
import com.coloros.sceneservice.dataprovider.bean.scene.SceneHotelData;
import com.coloros.sceneservice.dataprovider.bean.scene.SceneMovieData;
import com.coloros.sceneservice.dataprovider.bean.scene.SceneTrainData;
import com.coloros.sceneservice.dataprovider.listener.SceneDataListener;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public class f extends a {
    public static final int Kb = 100;
    public static final int Lb = 1000;
    public static final int[] Mb = {1, 2, 4, 8, 64};
    public static final String TAG = "SceneDataManager";
    public static volatile f sInstance;
    public ContentObserver Nb;
    public SceneDataListener Ob;
    public Handler mHandler;

    public f(Context context) {
        super(context);
    }

    private SceneData create(int i) {
        if (i == 1) {
            return new SceneFlightData();
        }
        if (i == 2) {
            return new SceneTrainData();
        }
        if (i == 4) {
            return new SceneHotelData();
        }
        if (i == 8) {
            return new SceneMovieData();
        }
        if (i == 16) {
            return new SceneExpressageData();
        }
        if (i != 64) {
            return null;
        }
        return new SceneBankData();
    }

    public static f getInstance(Context context) {
        if (sInstance == null) {
            synchronized (f.class) {
                if (sInstance == null) {
                    sInstance = new f(context);
                }
            }
        }
        return sInstance;
    }

    @Override // com.coloros.sceneservice.f.a
    public Uri getUri() {
        return com.coloros.sceneservice.e.b.URL;
    }

    public synchronized void registerSceneDataObserver(Context context, SceneDataListener sceneDataListener) {
        if (context == null || sceneDataListener == null) {
            com.coloros.sceneservice.m.f.d(TAG, "registerSceneDataObserver context or sceneDataListener is null");
            return;
        }
        this.Ob = sceneDataListener;
        if (this.Nb != null) {
            com.coloros.sceneservice.m.f.d(TAG, "registerSceneDataObserver mContentObserver has created");
            return;
        }
        try {
            this.mHandler = new d(this, Looper.getMainLooper());
            this.Nb = new e(this, new Handler(Looper.getMainLooper()));
            context.getContentResolver().registerContentObserver(com.coloros.sceneservice.e.b.URL, false, this.Nb);
        } catch (Throwable th) {
            com.coloros.sceneservice.m.f.e(TAG, "registerSceneDataObserver e = " + th);
        }
    }

    public synchronized void unregisterSceneDataObserver(Context context) {
        if (context == null) {
            com.coloros.sceneservice.m.f.d(TAG, "context is null");
            return;
        }
        try {
            if (this.Nb != null) {
                context.getContentResolver().unregisterContentObserver(this.Nb);
                this.Nb = null;
            }
        } catch (Throwable th) {
            com.coloros.sceneservice.m.f.e(TAG, "unregisterSceneDataObserver e = " + th);
        }
        this.Ob = null;
        this.mHandler = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b(@NonNull int[] iArr) {
        StringBuilder sb = new StringBuilder();
        sb.append("type in (");
        for (int i : iArr) {
            sb.append(i);
            sb.append(",");
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.coloros.sceneservice.f.a
    public SceneData a(Cursor cursor) {
        SceneData sceneDataCreate = create(com.coloros.sceneservice.b.a.c(cursor, "type"));
        if (sceneDataCreate != null) {
            try {
                sceneDataCreate.setId(String.valueOf(com.coloros.sceneservice.b.a.c(cursor, "_id")));
                sceneDataCreate.setType(com.coloros.sceneservice.b.a.c(cursor, "type"));
                sceneDataCreate.setMatchKey(com.coloros.sceneservice.b.a.e(cursor, com.coloros.sceneservice.e.b.Ma));
                sceneDataCreate.setOccurTime(com.coloros.sceneservice.b.a.d(cursor, com.coloros.sceneservice.e.b.Na).longValue());
                sceneDataCreate.setExpireTime(com.coloros.sceneservice.b.a.d(cursor, com.coloros.sceneservice.e.b.Oa).longValue());
                sceneDataCreate.setLastOnlineTime(com.coloros.sceneservice.b.a.d(cursor, com.coloros.sceneservice.e.b.Pa).longValue());
                sceneDataCreate.setDeleted(com.coloros.sceneservice.b.a.c(cursor, "deleted") == 1);
                sceneDataCreate.setProcessed(com.coloros.sceneservice.b.a.c(cursor, com.coloros.sceneservice.e.b.Qa) == 1);
                sceneDataCreate.setProcessStep(com.coloros.sceneservice.b.a.c(cursor, com.coloros.sceneservice.e.b.Ra));
                sceneDataCreate.setSource(com.coloros.sceneservice.b.a.c(cursor, "source"));
                sceneDataCreate.setContent(com.coloros.sceneservice.m.h.m(com.coloros.sceneservice.b.a.e(cursor, "content")));
                String strE = com.coloros.sceneservice.b.a.e(cursor, "data1");
                sceneDataCreate.setLastUpdateSource(TextUtils.isEmpty(strE) ? -1 : Integer.parseInt(strE));
                sceneDataCreate.setData2(com.coloros.sceneservice.m.h.m(com.coloros.sceneservice.b.a.e(cursor, "data2")));
                sceneDataCreate.setData3(com.coloros.sceneservice.b.a.e(cursor, "data3"));
                sceneDataCreate.setTargetTel(com.coloros.sceneservice.b.a.e(cursor, com.coloros.sceneservice.e.b.Sa));
                sceneDataCreate.setOccurTimezone(com.coloros.sceneservice.b.a.e(cursor, com.coloros.sceneservice.e.b.Ta));
                sceneDataCreate.setExpireTimezone(com.coloros.sceneservice.b.a.e(cursor, com.coloros.sceneservice.e.b.Ua));
                sceneDataCreate.setDataChangedState(com.coloros.sceneservice.b.a.c(cursor, com.coloros.sceneservice.e.b.Va));
            } catch (Throwable th) {
                com.coloros.sceneservice.m.f.e(TAG, "cursorToObject e = " + th);
            }
        }
        return sceneDataCreate;
    }

    @Override // com.coloros.sceneservice.f.a
    public ContentValues a(SceneData sceneData) {
        if (sceneData == null) {
            return null;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("_id", sceneData.getId());
        contentValues.put("type", Integer.valueOf(sceneData.getType()));
        contentValues.put(com.coloros.sceneservice.e.b.Ma, sceneData.getMatchKey());
        contentValues.put(com.coloros.sceneservice.e.b.Na, Long.valueOf(sceneData.getOccurTime()));
        contentValues.put(com.coloros.sceneservice.e.b.Oa, Long.valueOf(sceneData.getExpireTime()));
        contentValues.put(com.coloros.sceneservice.e.b.Pa, Long.valueOf(sceneData.getLastOnlineTime()));
        contentValues.put("deleted", Integer.valueOf(sceneData.isDeleted() ? 1 : 0));
        contentValues.put(com.coloros.sceneservice.e.b.Qa, Integer.valueOf(sceneData.isProcessed() ? 1 : 0));
        contentValues.put(com.coloros.sceneservice.e.b.Ra, Integer.valueOf(sceneData.getProcessStep()));
        contentValues.put("source", Integer.valueOf(sceneData.getSource()));
        contentValues.put("content", com.coloros.sceneservice.m.h.a(sceneData.getContent()));
        contentValues.put(com.coloros.sceneservice.e.b.Sa, sceneData.getTargetTel());
        if (!TextUtils.isEmpty(sceneData.getOccurTimezone())) {
            contentValues.put(com.coloros.sceneservice.e.b.Ta, sceneData.getOccurTimezone());
        }
        if (!TextUtils.isEmpty(sceneData.getExpireTimezone())) {
            contentValues.put(com.coloros.sceneservice.e.b.Ua, sceneData.getExpireTimezone());
        }
        contentValues.put("data1", String.valueOf(sceneData.getLastUpdateSource()));
        contentValues.put("data2", com.coloros.sceneservice.m.h.a(sceneData.getData2()));
        contentValues.put("data3", sceneData.getData3());
        contentValues.put(com.coloros.sceneservice.e.b.Va, Integer.valueOf(sceneData.getDataChangedState()));
        return contentValues;
    }

    @Nullable
    public SceneData a(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            com.coloros.sceneservice.m.f.d(TAG, "querySceneData matchKey is empty");
            return null;
        }
        return (SceneData) a("match_key = ? and type = ?", new String[]{str, i + ""}, null);
    }

    @Nullable
    public List a(int[] iArr) {
        if (iArr != null && iArr.length > 0) {
            return a(null, b(iArr), null, "occur_time ASC ");
        }
        com.coloros.sceneservice.m.f.d(TAG, "querySceneDataWithType type is null");
        return null;
    }
}
