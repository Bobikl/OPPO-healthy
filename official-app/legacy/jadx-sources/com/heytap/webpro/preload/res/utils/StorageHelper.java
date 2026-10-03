package com.heytap.webpro.preload.res.utils;

import android.app.usage.StorageStatsManager;
import android.content.Context;
import android.os.storage.StorageManager;
import androidx.annotation.Keep;
import androidx.annotation.RequiresApi;
import com.oplus.aiunit.vision.cvk;
import com.oplus.aiunit.vision.q7b;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public class StorageHelper {
    public static final long UNIT = 1000;
    public static StorageBean a;

    @Keep
    public static class StorageBean {
        private long systemSize;
        private long systemSizeWithByte;
        private long totalSize;
        private long totalSizeWithByte;
        private long usedSize;
        private long usedSizeWithByte;

        public long getSystemSize() {
            return this.systemSize;
        }

        public long getSystemSizeWithByte() {
            return this.systemSizeWithByte;
        }

        public long getTotalSize() {
            return this.totalSize;
        }

        public long getTotalSizeWithByte() {
            return this.totalSizeWithByte;
        }

        public long getUsedSize() {
            return this.usedSize;
        }

        public long getUsedSizeWithByte() {
            return this.usedSizeWithByte;
        }

        public void setSystemSize(long j2) {
            this.systemSize = j2;
        }

        public void setSystemSizeWithByte(long j2) {
            this.systemSizeWithByte = j2;
        }

        public void setTotalSize(long j2) {
            this.totalSize = j2;
        }

        public void setTotalSizeWithByte(long j2) {
            this.totalSizeWithByte = j2;
        }

        public void setUsedSize(long j2) {
            this.usedSize = j2;
        }

        public void setUsedSizeWithByte(long j2) {
            this.usedSizeWithByte = j2;
        }
    }

    public static void a(Context context, Object obj, StorageManager storageManager, StorageBean storageBean) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        long jLongValue;
        long totalSpace;
        long freeSpace = 0;
        if (cvk.c()) {
            jLongValue = d(context, (String) obj.getClass().getDeclaredMethod("getFsUuid", new Class[0]).invoke(obj, new Object[0]));
        } else {
            jLongValue = cvk.b() ? ((Long) StorageManager.class.getMethod("getPrimaryStorageSize", new Class[0]).invoke(storageManager, new Object[0])).longValue() : 0L;
        }
        if (((Boolean) obj.getClass().getDeclaredMethod("isMountedReadable", new Class[0]).invoke(obj, new Object[0])).booleanValue()) {
            File file = (File) obj.getClass().getDeclaredMethod("getPath", new Class[0]).invoke(obj, new Object[0]);
            if (jLongValue == 0) {
                jLongValue = file.getTotalSpace();
            }
            totalSpace = jLongValue - file.getTotalSpace();
            freeSpace = 0 + (jLongValue - file.getFreeSpace());
        } else {
            totalSpace = 0;
        }
        storageBean.totalSizeWithByte = jLongValue;
        storageBean.systemSizeWithByte = jLongValue;
        storageBean.usedSizeWithByte = freeSpace;
        storageBean.totalSize = ((jLongValue / 1000) / 1000) / 1000;
        storageBean.systemSize = ((totalSpace / 1000) / 1000) / 1000;
        storageBean.usedSize = ((freeSpace / 1000) / 1000) / 1000;
    }

    public static void b(Object obj, StorageBean storageBean) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Method declaredMethod = obj.getClass().getDeclaredMethod("isMountedReadable", new Class[0]);
        if (declaredMethod.invoke(obj, new Object[0]) != null && ((Boolean) declaredMethod.invoke(obj, new Object[0])).booleanValue()) {
            File file = (File) obj.getClass().getDeclaredMethod("getPath", new Class[0]).invoke(obj, new Object[0]);
            long totalSpace = (file.getTotalSpace() - file.getFreeSpace()) + 0;
            storageBean.usedSizeWithByte = totalSpace;
            long totalSpace2 = 0 + file.getTotalSpace();
            storageBean.totalSizeWithByte = totalSpace2;
            storageBean.totalSize = ((totalSpace2 / 1000) / 1000) / 1000;
            storageBean.usedSize = ((totalSpace / 1000) / 1000) / 1000;
        }
    }

    public static StorageBean c(Context context) {
        StorageBean storageBean = a;
        if (storageBean != null) {
            return storageBean;
        }
        a = new StorageBean();
        StorageManager storageManager = (StorageManager) context.getSystemService("storage");
        if (cvk.a()) {
            try {
                List list = (List) StorageManager.class.getDeclaredMethod("getVolumes", new Class[0]).invoke(storageManager, new Object[0]);
                if (list == null) {
                    return a;
                }
                Iterator it = list.iterator();
                while (it.hasNext() && !e(it.next(), context, storageManager)) {
                }
            } catch (Exception e2) {
                q7b.g("StorageHelper", e2);
            }
        }
        return a;
    }

    @RequiresApi(api = 26)
    public static long d(Context context, String str) {
        try {
            return ((StorageStatsManager) context.getSystemService(StorageStatsManager.class)).getTotalBytes(str == null ? StorageManager.UUID_DEFAULT : UUID.fromString(str));
        } catch (Exception e2) {
            q7b.g("StorageHelper", e2);
            return -1L;
        }
    }

    public static boolean e(Object obj, Context context, StorageManager storageManager) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
        int i = obj.getClass().getField("type").getInt(obj);
        if (i != 1 && i != 0) {
            return false;
        }
        if (i == 1) {
            a(context, obj, storageManager, a);
        } else {
            b(obj, a);
        }
        return true;
    }
}
