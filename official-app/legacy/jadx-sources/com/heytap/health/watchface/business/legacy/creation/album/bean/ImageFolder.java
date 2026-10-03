package com.heytap.health.watchface.business.legacy.creation.album.bean;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.oplus.aiunit.vision.ltl;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class ImageFolder {
    public static final String TAG = "ImageFolder";
    public ImageItem mCover;
    public ArrayList<ImageItem> mImages;
    public String mName;
    public String mPath;

    public boolean equals(Object obj) {
        String str = this.mPath;
        if (str != null && this.mName != null) {
            try {
                ImageFolder imageFolder = (ImageFolder) obj;
                return str.equalsIgnoreCase(imageFolder.mPath) && this.mName.equalsIgnoreCase(imageFolder.mName);
            } catch (ClassCastException e2) {
                ltl.b(TAG, "[equals] --> " + e2.getMessage());
            }
        }
        return super.equals(obj);
    }

    public int hashCode() {
        return super.hashCode();
    }

    @NonNull
    public String toString() {
        return "ImageFolder{mName='" + this.mName + "', mPath='" + this.mPath + "', mCover=" + this.mCover + ", mImages=" + this.mImages + '}';
    }
}
