package com.heytap.health.watchface.business.legacy.creation.album.bean;

import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.heytap.health.watchface.business.store.view.ClipImageView;
import com.oplus.aiunit.vision.ltl;
import java.util.Objects;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class ImageItem {
    public static final String TAG = "ImageItem";
    public long mAddTime;
    public String mCutPath;
    public ClipImageView.CropParams mExtraParams;
    public String mFgCutPath;
    public String mFgPath;
    public FrontBgStatus mFgStatus;
    public int mHeight;
    public long mId;
    public boolean mIsGray;
    public boolean mIsLivePhoto;
    public String mMimeType;
    public String mName;
    public String mPath;
    public long mSize;
    public String mUriPath;
    public String mVideoPath;
    public int mWidth;

    public boolean equals(Object obj) {
        ImageItem imageItem;
        try {
            imageItem = (ImageItem) obj;
        } catch (ClassCastException e2) {
            ltl.b(TAG, "[equals] --> " + e2.getMessage());
            imageItem = null;
        }
        if (obj == null) {
            return false;
        }
        String str = this.mCutPath;
        if (str != null || imageItem.mCutPath != null) {
            String str2 = imageItem.mCutPath;
            if (str2 == null || str == null) {
                return false;
            }
            return str.equalsIgnoreCase(str2);
        }
        String str3 = this.mVideoPath;
        if (str3 != null) {
            String str4 = imageItem.mVideoPath;
            if (str4 == null) {
                return false;
            }
            return str3.equalsIgnoreCase(str4);
        }
        String str5 = this.mUriPath;
        if (str5 != null) {
            String str6 = imageItem.mUriPath;
            if (str6 == null) {
                return false;
            }
            return str5.equalsIgnoreCase(str6);
        }
        String str7 = this.mPath;
        if (str7 == null) {
            return super.equals(obj);
        }
        String str8 = imageItem.mPath;
        if (str8 == null) {
            return false;
        }
        return str7.equalsIgnoreCase(str8);
    }

    public String getPreviewUrl() {
        return !TextUtils.isEmpty(this.mCutPath) ? this.mCutPath : this.mUriPath;
    }

    public int hashCode() {
        return Objects.hash(this.mPath, this.mUriPath, this.mVideoPath, this.mCutPath);
    }

    @NonNull
    public String toString() {
        return "ImageItem{mName='" + this.mName + "', mPath='" + this.mPath + "', mUriPath=" + this.mUriPath + ", mVideoPath=" + this.mVideoPath + ", mIsLivePhoto=" + this.mIsLivePhoto + ", mCutPath=" + this.mCutPath + ", mFgPath=" + this.mFgPath + ", mFgCutPath=" + this.mFgCutPath + ", mFgStatus=" + this.mFgStatus + '}';
    }
}
