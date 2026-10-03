package com.heytap.databaseengine.model.proxy;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.heytap.databaseengine.model.SportHealthData;
import com.heytap.databaseengine.model.UserInfo;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class UserInfoProxy extends SportHealthData implements Parcelable {
    public static final Parcelable.Creator<UserInfoProxy> CREATOR = new a();
    private String userName;

    public class a implements Parcelable.Creator<UserInfoProxy> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public UserInfoProxy createFromParcel(Parcel parcel) {
            return new UserInfoProxy(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public UserInfoProxy[] newArray(int i) {
            return new UserInfoProxy[i];
        }
    }

    public UserInfoProxy(@NonNull UserInfo userInfo) {
        this.userName = userInfo.getUserName();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getUserName() {
        return this.userName;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String toString() {
        return "UserInfoProxy:\nuserName=" + getUserName() + '\n';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.userName);
    }

    public UserInfoProxy(Parcel parcel) {
        this.userName = parcel.readString();
    }
}
