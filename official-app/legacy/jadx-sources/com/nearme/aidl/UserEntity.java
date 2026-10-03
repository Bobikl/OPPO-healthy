package com.nearme.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.autofill.HintConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Keep
public class UserEntity implements Parcelable {
    public static final Parcelable.Creator<UserEntity> CREATOR = new Parcelable.Creator<UserEntity>() { // from class: com.nearme.aidl.UserEntity.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public UserEntity createFromParcel(Parcel parcel) {
            int i = parcel.readInt();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            UserEntity userEntity = new UserEntity();
            userEntity.setResult(i);
            userEntity.setResultMsg(string);
            userEntity.setUsername(string2);
            userEntity.setAuthToken(string3);
            return userEntity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public UserEntity[] newArray(int i) {
            return new UserEntity[i];
        }
    };
    private String authToken;
    private int result;
    private String resultMsg;
    private String username;

    public UserEntity() {
        this.result = 0;
        this.resultMsg = "";
        this.username = "";
        this.authToken = "";
    }

    public static UserEntity fromGson(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        UserEntity userEntity = new UserEntity();
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.isNull("result") && jSONObject.get("result") != JSONObject.NULL) {
                userEntity.setResult(jSONObject.getInt("result"));
            }
            if (!jSONObject.isNull("resultMsg") && jSONObject.get("resultMsg") != JSONObject.NULL) {
                userEntity.setResultMsg(jSONObject.getString("resultMsg"));
            }
            if (!jSONObject.isNull(HintConstants.AUTOFILL_HINT_USERNAME) && jSONObject.get(HintConstants.AUTOFILL_HINT_USERNAME) != JSONObject.NULL) {
                userEntity.setUsername(jSONObject.getString(HintConstants.AUTOFILL_HINT_USERNAME));
            }
            if (!jSONObject.isNull("authToken") && jSONObject.get("authToken") != JSONObject.NULL) {
                userEntity.setAuthToken(jSONObject.getString("authToken"));
            }
            return userEntity;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static String toJson(UserEntity userEntity) {
        if (userEntity == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("result", userEntity.getResult());
            jSONObject.put("resultMsg", userEntity.getResultMsg());
            jSONObject.put(HintConstants.AUTOFILL_HINT_USERNAME, userEntity.getUsername());
            jSONObject.put("authToken", userEntity.getAuthToken());
            return jSONObject.toString();
        } catch (JSONException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAuthToken() {
        return this.authToken;
    }

    public int getResult() {
        return this.result;
    }

    public String getResultMsg() {
        return this.resultMsg;
    }

    public String getUsername() {
        return this.username;
    }

    public void setAuthToken(String str) {
        this.authToken = str;
    }

    public void setResult(int i) {
        this.result = i;
    }

    public void setResultMsg(String str) {
        this.resultMsg = str;
    }

    public void setUsername(String str) {
        this.username = str;
    }

    public String toString() {
        return "{UserEntity : [result = " + this.result + "],[resultMsg = " + this.resultMsg + "],[username = " + this.username + "],[authToken = " + this.authToken + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.result);
        parcel.writeString(this.resultMsg);
        parcel.writeString(this.username);
        parcel.writeString(this.authToken);
    }

    public UserEntity(int i, String str, String str2, String str3) {
        this.result = i;
        this.resultMsg = str;
        this.username = str2;
        this.authToken = str3;
    }
}
