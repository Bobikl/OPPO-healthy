package com.heytap.accessory.utils.buffer;

import android.content.Context;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
class BufferPoolConfig {
    int mCacheSize;
    Context mContext;
    boolean mIsDefault;
    String mLogTag;
    int mMaxChunkSize;

    private BufferPoolConfig(Context context) {
        if (context == null) {
            throw new RuntimeException("Failed to configure the Pool!");
        }
        this.mContext = context.getApplicationContext();
        this.mIsDefault = true;
    }

    public static BufferPoolConfig createDefault(Context context) {
        return new BufferPoolConfig(context);
    }

    public BufferPoolConfig(Context context, String str, int i, int i2) {
        if (context != null) {
            this.mContext = context.getApplicationContext();
            this.mLogTag = str;
            this.mCacheSize = i;
            this.mMaxChunkSize = i2;
            return;
        }
        throw new RuntimeException("Failed to configure the Pool!");
    }
}
