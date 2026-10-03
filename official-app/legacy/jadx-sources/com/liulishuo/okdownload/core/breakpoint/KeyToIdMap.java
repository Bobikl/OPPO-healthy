package com.liulishuo.okdownload.core.breakpoint;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.SparseArray;
import com.liulishuo.okdownload.DownloadTask;
import java.util.HashMap;

/* JADX INFO: loaded from: classes5.dex */
public class KeyToIdMap {

    @NonNull
    private final SparseArray<String> idToKeyMap;

    @NonNull
    private final HashMap<String, Integer> keyToIdMap;

    public KeyToIdMap() {
        this(new HashMap(), new SparseArray());
    }

    public void add(@NonNull DownloadTask downloadTask, int i) {
        String strGenerateKey = generateKey(downloadTask);
        this.keyToIdMap.put(strGenerateKey, Integer.valueOf(i));
        this.idToKeyMap.put(i, strGenerateKey);
    }

    public String generateKey(@NonNull DownloadTask downloadTask) {
        return downloadTask.getUrl() + downloadTask.getUri() + downloadTask.getFilename();
    }

    @Nullable
    public Integer get(@NonNull DownloadTask downloadTask) {
        Integer num = this.keyToIdMap.get(generateKey(downloadTask));
        if (num != null) {
            return num;
        }
        return null;
    }

    public void remove(int i) {
        String str = this.idToKeyMap.get(i);
        if (str != null) {
            this.keyToIdMap.remove(str);
            this.idToKeyMap.remove(i);
        }
    }

    public KeyToIdMap(@NonNull HashMap<String, Integer> map, @NonNull SparseArray<String> sparseArray) {
        this.keyToIdMap = map;
        this.idToKeyMap = sparseArray;
    }
}
