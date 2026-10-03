package com.heytap.log.flush;

import android.util.Log;
import com.heytap.log.Logger;
import com.heytap.log.config.DynConfigManager;
import com.heytap.log.core.FileStrategy;
import com.heytap.log.core.LoganConfig;
import com.heytap.log.core.LoganProtocol;
import com.heytap.log.util.SPUtil;
import com.heytap.log.util.String2IntUtil;
import com.heytap.log.util.ThreadUtil;
import java.io.File;

/* JADX INFO: loaded from: classes19.dex */
public class KitFlush {
    private static final String FILE_PREFIX_KEY = "HLog_File_";
    private static final String TAG = "HLog_KitFlush";

    public static void flush(final String str) {
        Log.d(TAG, "ready to flush business : " + str);
        ThreadUtil.executeInThreadPool(new Runnable() { // from class: com.heytap.log.flush.KitFlush.1
            @Override // java.lang.Runnable
            public void run() {
                FileStrategy fileStrategy = new FileStrategy();
                long jCurrentTimeMillis = System.currentTimeMillis();
                String string = SPUtil.getInstance().getString(DynConfigManager.CACHE_NX_DIR_KEY);
                String string2 = SPUtil.getInstance().getString(DynConfigManager.LOG_NX_DIR_KEY);
                LoganProtocol loganProtocol = new LoganProtocol();
                int[] iArr = Logger.encryptIV;
                loganProtocol.logan_init(string, string2, 100, new String(String2IntUtil.tostring(iArr).getBytes()), new String(String2IntUtil.tostring(iArr).getBytes()), LoganConfig.MAX_LOGAN_MMAP_LENGTH);
                loganProtocol.logan_debug(true);
                String strMakeFileName = fileStrategy.makeFileName(KitFlush.FILE_PREFIX_KEY + str + "_", jCurrentTimeMillis);
                File file = new File(strMakeFileName);
                if (!file.exists()) {
                    file.mkdirs();
                }
                loganProtocol.logan_open(strMakeFileName);
                loganProtocol.logan_flush();
                loganProtocol.logan_clean();
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException e2) {
                    throw new RuntimeException(e2);
                }
            }
        });
    }
}
