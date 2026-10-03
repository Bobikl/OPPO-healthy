package com.bytedance.sdk.open.aweme.base;

import android.os.Bundle;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class ImageObject implements IMediaObject {
    private static final String TAG = "ImageObject";
    public ArrayList<String> mImagePaths;

    public ImageObject() {
    }

    public ImageObject(ArrayList<String> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        this.mImagePaths = arrayList2;
        arrayList2.addAll(arrayList);
    }

    @Override // com.bytedance.sdk.open.aweme.base.IMediaObject
    public boolean checkArgs() {
        return true;
    }

    @Override // com.bytedance.sdk.open.aweme.base.IMediaObject
    public void serialize(Bundle bundle) {
        bundle.putStringArrayList("AWEME_EXTRA_IMAGE_MESSAGE_PATH", this.mImagePaths);
    }

    @Override // com.bytedance.sdk.open.aweme.base.IMediaObject
    public int type() {
        return 2;
    }

    @Override // com.bytedance.sdk.open.aweme.base.IMediaObject
    public void unserialize(Bundle bundle) {
        this.mImagePaths = bundle.getStringArrayList("AWEME_EXTRA_IMAGE_MESSAGE_PATH");
    }
}
