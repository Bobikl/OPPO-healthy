package com.heytap.accountsdk.authencation;

import android.content.Context;
import android.os.Handler;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.heytap.accountsdk.authencation.inner.UCAuthContainerActivity;
import com.platform.usercenter.basic.annotation.Keep;

/* JADX INFO: loaded from: classes14.dex */
@Keep
public class UCAuthencationRequest implements Parcelable {
    public static final Parcelable.Creator<UCAuthencationRequest> CREATOR = new a();
    public String appId;
    public String businessId;
    public Messenger callback;
    public String formatTips;
    public String requestTag;
    public String ssoid;
    public String userToken;

    @Keep
    public static class Builder {
        public String appId;
        public String businessId;
        public Messenger callback;
        public String formatTips;
        public boolean isVerifyByToken;
        public String requestTag;
        public String ssoid;
        public String userToken;

        public Builder appId(String str) {
            this.appId = str;
            return this;
        }

        public UCAuthencationRequest build() {
            return new UCAuthencationRequest(this, null);
        }

        public Builder businessId(String str) {
            this.businessId = str;
            return this;
        }

        public Builder callback(Handler handler) {
            this.callback = new Messenger(handler);
            return this;
        }

        public Builder formatTips(String str) {
            this.formatTips = str;
            return this;
        }

        public Builder requestTag(String str) {
            this.requestTag = str;
            return this;
        }

        public Builder ssoid(String str) {
            if (!TextUtils.isEmpty(this.userToken)) {
                throw new IllegalArgumentException("userToken already set ! authencation only support one way of ssoid or userToken");
            }
            this.ssoid = str;
            return this;
        }

        public Builder userToken(String str) {
            if (!TextUtils.isEmpty(this.ssoid)) {
                throw new IllegalArgumentException("ssoid already set ! authencation only support one way of ssoid or userToken");
            }
            this.userToken = str;
            this.isVerifyByToken = true;
            return this;
        }
    }

    public class a implements Parcelable.Creator<UCAuthencationRequest> {
        @Override // android.os.Parcelable.Creator
        public UCAuthencationRequest createFromParcel(Parcel parcel) {
            return new UCAuthencationRequest(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public UCAuthencationRequest[] newArray(int i) {
            return new UCAuthencationRequest[i];
        }
    }

    public /* synthetic */ UCAuthencationRequest(Builder builder, a aVar) {
        this(builder);
    }

    public void auth(Context context) {
        UCAuthContainerActivity.a(context, this);
    }

    public boolean availidate() {
        return (TextUtils.isEmpty(this.appId) || TextUtils.isEmpty(this.businessId)) ? false : true;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "UCAuthencationRequest{requestTag='" + this.requestTag + "', appId='" + this.appId + "', businessId='" + this.businessId + "', ssoid='" + this.ssoid + "', userToken='" + this.userToken + "', formatTips='" + this.formatTips + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.requestTag);
        parcel.writeString(this.appId);
        parcel.writeString(this.businessId);
        parcel.writeString(this.ssoid);
        parcel.writeString(this.userToken);
        parcel.writeString(this.formatTips);
        parcel.writeParcelable(this.callback, i);
    }

    public UCAuthencationRequest(Builder builder) {
        this.requestTag = builder.requestTag;
        this.formatTips = builder.formatTips;
        this.appId = builder.appId;
        this.businessId = builder.businessId;
        if (builder.isVerifyByToken) {
            this.userToken = builder.userToken;
        } else {
            this.ssoid = builder.ssoid;
        }
        this.callback = builder.callback;
    }

    public UCAuthencationRequest(Parcel parcel) {
        this.requestTag = parcel.readString();
        this.appId = parcel.readString();
        this.businessId = parcel.readString();
        this.ssoid = parcel.readString();
        this.userToken = parcel.readString();
        this.formatTips = parcel.readString();
        this.callback = (Messenger) parcel.readParcelable(Messenger.class.getClassLoader());
    }
}
