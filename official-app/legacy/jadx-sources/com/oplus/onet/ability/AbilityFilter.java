package com.oplus.onet.ability;

import android.os.Parcel;
import android.os.Parcelable;
import com.heytap.accessory.discovery.IScanFilter;
import com.oplus.aiunit.vision.zqm;
import java.util.Arrays;
import java.util.List;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

/* JADX INFO: loaded from: classes8.dex */
public class AbilityFilter implements IScanFilter {
    public static final Parcelable.Creator<AbilityFilter> CREATOR = new a();
    public static final String TAG = "AbilityFilter";
    private List<Integer> mAbilityList;
    private String mPkgName;

    public class a implements Parcelable.Creator<AbilityFilter> {
        @Override // android.os.Parcelable.Creator
        public final AbilityFilter createFromParcel(Parcel parcel) {
            return new AbilityFilter(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final AbilityFilter[] newArray(int i) {
            return new AbilityFilter[i];
        }
    }

    public AbilityFilter(Parcel parcel) {
        this.mPkgName = parcel.readString();
        int[] iArrCreateIntArray = parcel.createIntArray();
        if (iArrCreateIntArray == null || iArrCreateIntArray.length <= 0) {
            return;
        }
        this.mAbilityList = (List) Arrays.stream(iArrCreateIntArray).boxed().collect(Collectors.toList());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<Integer> getAbilityList() {
        return this.mAbilityList;
    }

    @Override // com.heytap.accessory.discovery.IScanFilter
    public String getKey() {
        return TAG;
    }

    public String getPkgName() {
        return this.mPkgName;
    }

    public String toString() {
        StringBuilder sbA = zqm.a("AbilityFilter{mPkgName='");
        sbA.append(this.mPkgName);
        sbA.append('\'');
        sbA.append(", mAbilityList=");
        sbA.append(this.mAbilityList);
        sbA.append('}');
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mPkgName);
        List<Integer> list = this.mAbilityList;
        if (list == null || list.size() <= 0) {
            return;
        }
        parcel.writeIntArray(this.mAbilityList.stream().mapToInt(new ToIntFunction() { // from class: com.oplus.aiunit.vision.i2
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                return ((Integer) obj).intValue();
            }
        }).toArray());
    }

    public AbilityFilter(String str, List<Integer> list) {
        this.mPkgName = str;
        this.mAbilityList = list;
    }
}
