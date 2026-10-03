package com.heytap.omas.omkms.data;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.heytap.omas.proto.Omkms3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public final class WbKeyTableInfo implements Parcelable {
    public static final Parcelable.Creator<WbKeyTableInfo> CREATOR = new a();
    public static final int DECRYPT_MODE = 1;
    private static final String DEFAULT_MAP_KEY = "default-map-key";
    public static final int ENCRYPT_MODE = 0;
    private static final String TAG = "WbKeyTableInfo";
    private Map<String, WbUseInfo> useInfoMap;

    public static class a implements Parcelable.Creator<WbKeyTableInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public WbKeyTableInfo createFromParcel(Parcel parcel) {
            parcel.toString();
            return new WbKeyTableInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public WbKeyTableInfo[] newArray(int i) {
            return new WbKeyTableInfo[i];
        }
    }

    public static final class b {
        private Map<String, WbUseInfo> a;

        private b() {
        }

        public /* synthetic */ b(a aVar) {
            this();
        }

        public b a(Map<String, WbUseInfo> map) {
            this.a = map;
            return this;
        }

        public WbKeyTableInfo a() {
            return new WbKeyTableInfo(this, null);
        }
    }

    public WbKeyTableInfo() {
        this.useInfoMap = new HashMap();
    }

    @NonNull
    private String genUsedInfoMapKey(h hVar) {
        if (hVar == null) {
            com.heytap.omas.a.e.i.c(TAG, "genUsedInfoMapKey: always should not take place here.initParamSpec=null.");
            return DEFAULT_MAP_KEY;
        }
        return new String(hVar.getAppName()) + "-" + new String(hVar.getWbId()) + "-" + new String(hVar.getWbKeyId()) + "-" + hVar.getWbVersion();
    }

    public static b newBuilder() {
        return new b(null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<Omkms3.KeyStats> getKeyStatus(Context context, h hVar) {
        ArrayList arrayList = new ArrayList();
        this.useInfoMap.toString();
        if (this.useInfoMap.containsKey(genUsedInfoMapKey(hVar))) {
            for (WbUseInfo wbUseInfo : this.useInfoMap.values()) {
                arrayList.add(Omkms3.KeyStats.newBuilder().setKeyId(new String(wbUseInfo.getWbKeyId())).setAppName(new String(wbUseInfo.getAppName())).setWbId(new String(wbUseInfo.getWbId())).setDecryptCount(wbUseInfo.getDecryptCount()).setEncryptCount(wbUseInfo.getEncryptCount()).build());
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        com.heytap.omas.a.e.i.c(TAG, "getKeyStatus: no keyStatus here.");
        return null;
    }

    public WbKeyTableInfo resetCount(h hVar) {
        if (hVar == null) {
            com.heytap.omas.a.e.i.b(TAG, "update: Parameters invalid.");
            return null;
        }
        new ArrayList(this.useInfoMap.keySet()).toString();
        Iterator<WbUseInfo> it = this.useInfoMap.values().iterator();
        while (it.hasNext()) {
            it.next().resetCount(hVar);
        }
        return this;
    }

    public String toString() {
        Iterator<String> it = this.useInfoMap.keySet().iterator();
        String str = "WbKeyTableInfo.toString: ";
        while (it.hasNext()) {
            str = str + this.useInfoMap.get(it.next()).toString();
        }
        return str;
    }

    public WbKeyTableInfo updateCount(h hVar, int i) {
        String strGenUsedInfoMapKey = genUsedInfoMapKey(hVar);
        synchronized (this.useInfoMap) {
            if (this.useInfoMap.containsKey(strGenUsedInfoMapKey)) {
                if (this.useInfoMap.get(strGenUsedInfoMapKey).updateCount(hVar, i) == null) {
                    return null;
                }
                this.useInfoMap.get(strGenUsedInfoMapKey).toString();
                return this;
            }
            WbUseInfo wbUseInfoUpdateCount = WbUseInfo.newBuilder().a(hVar.getAppName()).b(hVar.getWbId()).c(hVar.getWbKeyId()).a(hVar.getWbVersion()).a().updateCount(hVar, i);
            if (wbUseInfoUpdateCount == null) {
                return null;
            }
            this.useInfoMap.put(strGenUsedInfoMapKey, wbUseInfoUpdateCount);
            this.useInfoMap.get(strGenUsedInfoMapKey).toString();
            return this;
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeMap(this.useInfoMap);
    }

    public WbKeyTableInfo(Parcel parcel) {
        HashMap map = new HashMap();
        this.useInfoMap = map;
        parcel.readMap(map, WbKeyTableInfo.class.getClassLoader());
    }

    private WbKeyTableInfo(b bVar) {
        this.useInfoMap = new HashMap();
        this.useInfoMap = bVar.a;
    }

    public /* synthetic */ WbKeyTableInfo(b bVar, a aVar) {
        this(bVar);
    }
}
