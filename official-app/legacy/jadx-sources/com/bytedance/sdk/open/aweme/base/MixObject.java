package com.bytedance.sdk.open.aweme.base;

import android.os.Bundle;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class MixObject implements IMediaObject {
    public ArrayList<String> mMediaPaths = new ArrayList<>();

    @Override // com.bytedance.sdk.open.aweme.base.IMediaObject
    public boolean checkArgs() {
        return true;
    }

    @Override // com.bytedance.sdk.open.aweme.base.IMediaObject
    public void serialize(Bundle bundle) {
        bundle.putStringArrayList("AWEME_EXTRA_MIX_MESSAGE_PATH", this.mMediaPaths);
    }

    @Override // com.bytedance.sdk.open.aweme.base.IMediaObject
    public int type() {
        return 6;
    }

    @Override // com.bytedance.sdk.open.aweme.base.IMediaObject
    public void unserialize(Bundle bundle) {
        this.mMediaPaths.clear();
        ArrayList<String> stringArrayList = bundle.getStringArrayList("AWEME_EXTRA_MIX_MESSAGE_PATH");
        if (stringArrayList != null) {
            this.mMediaPaths = stringArrayList;
        }
    }
}
