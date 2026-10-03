package com.heytap.accessory.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.heytap.accessory.discovery.IScanFilter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class ClassScanFilter implements IScanFilter {
    public static final Parcelable.Creator<ClassScanFilter> CREATOR = new Parcelable.Creator<ClassScanFilter>() { // from class: com.heytap.accessory.bean.ClassScanFilter.1
        @Override // android.os.Parcelable.Creator
        public ClassScanFilter createFromParcel(Parcel parcel) {
            return new ClassScanFilter(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public ClassScanFilter[] newArray(int i) {
            return new ClassScanFilter[i];
        }
    };
    public static final String KEY = "ClassScanFilter";
    private Map<Integer, HashSet<Integer>> mMap;

    private ClassScanFilter() {
        this.mMap = new HashMap();
    }

    public static ClassScanFilter create() {
        return new ClassScanFilter();
    }

    private HashSet<Integer> getMajorSet(int i) {
        HashSet<Integer> hashSet = this.mMap.get(Integer.valueOf(i));
        if (hashSet != null) {
            return hashSet;
        }
        HashSet<Integer> hashSet2 = new HashSet<>();
        this.mMap.put(Integer.valueOf(i), hashSet2);
        return hashSet2;
    }

    private boolean validityCheck(int i, int i2, int i3) {
        return i3 < i || i3 > i2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.heytap.accessory.discovery.IScanFilter
    public String getKey() {
        return KEY;
    }

    public Map<Integer, HashSet<Integer>> getMap() {
        return this.mMap;
    }

    public ClassScanFilter put(int i, int i2) {
        if (validityCheck(1, 8, i)) {
            throw new IllegalArgumentException("unknown major: " + i);
        }
        switch (i) {
            case 1:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                if (!validityCheck(0, 0, i2)) {
                    getMajorSet(i).add(Integer.valueOf(i2));
                    return this;
                }
                throw new IllegalArgumentException("unknown major: " + i + ", minor: " + i2);
            case 2:
            default:
                throw new IllegalArgumentException("unknown major in switch: " + i);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ClassScanFilter {\n");
        for (Map.Entry<Integer, HashSet<Integer>> entry : this.mMap.entrySet()) {
            sb.append("major " + entry.getKey() + ", minor [");
            Iterator<Integer> it = entry.getValue().iterator();
            while (it.hasNext()) {
                sb.append(" " + it.next());
            }
            sb.append(" ]\n");
        }
        sb.append("\n}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mMap.size());
        for (Map.Entry<Integer, HashSet<Integer>> entry : this.mMap.entrySet()) {
            parcel.writeValue(entry.getKey());
            parcel.writeInt(entry.getValue().size());
            Iterator<Integer> it = entry.getValue().iterator();
            while (it.hasNext()) {
                parcel.writeValue(it.next());
            }
        }
    }

    public ClassScanFilter(Parcel parcel) {
        this.mMap = new HashMap();
        int i = parcel.readInt();
        this.mMap = new HashMap(i);
        if (i > 0) {
            for (int i2 = 0; i2 < i; i2++) {
                Integer num = (Integer) parcel.readValue(Integer.class.getClassLoader());
                if (num == null) {
                    return;
                }
                HashSet<Integer> hashSet = new HashSet<>();
                this.mMap.put(num, hashSet);
                int i3 = parcel.readInt();
                if (i3 > 0) {
                    for (int i4 = 0; i4 < i3; i4++) {
                        hashSet.add((Integer) parcel.readValue(Integer.class.getClassLoader()));
                    }
                }
            }
        }
    }
}
