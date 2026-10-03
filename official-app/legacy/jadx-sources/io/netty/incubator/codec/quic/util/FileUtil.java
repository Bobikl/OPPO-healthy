package io.netty.incubator.codec.quic.util;

import android.content.Context;
import com.oplus.weatherservicesdk.data.Weather;
import io.netty.util.internal.logging.InternalLogger;
import io.netty.util.internal.logging.InternalLoggerFactory;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Calendar;

/* JADX INFO: loaded from: classes10.dex */
public class FileUtil {
    public static final String STATISTIC_20214_FILENAME = "stat_20214";
    public static final String STATISTIC_CUSTOM_FILE_PATH = "stat_custom";
    private static final InternalLogger logger = InternalLoggerFactory.getInstance("TrackHelper");

    public static synchronized void clearLog(Context context) {
        File file = new File(context.getExternalCacheDir().getPath() + File.separator + STATISTIC_20214_FILENAME);
        if (file.exists()) {
            file.delete();
        }
    }

    private static String getCurrentTime() {
        Calendar calendar = Calendar.getInstance();
        return calendar.get(1) + "-" + (calendar.get(2) + 1) + "-" + calendar.get(5) + "-" + calendar.get(11) + "-" + calendar.get(12) + "-" + calendar.get(13) + ":";
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x00a0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x00aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:? A[Catch: all -> 0x00b3, SYNTHETIC, TRY_LEAVE, TryCatch #4 {, blocks: (B:4:0x0003, B:8:0x006e, B:12:0x0076, B:15:0x007b, B:11:0x0073, B:25:0x008b, B:30:0x0095, B:28:0x0090, B:38:0x00a0, B:43:0x00aa, B:47:0x00b2, B:46:0x00af, B:41:0x00a5), top: B:57:0x0003, inners: #5, #6, #7, #9 }] */
    public static synchronized void saveLog(Context context, String str) {
        RandomAccessFile randomAccessFile;
        FileChannel fileChannelPosition = null;
        try {
            randomAccessFile = new RandomAccessFile(context.getExternalCacheDir().getPath() + File.separator + STATISTIC_20214_FILENAME, "rwd");
            try {
                try {
                    fileChannelPosition = randomAccessFile.getChannel().position(randomAccessFile.length());
                    String str2 = getCurrentTime() + str + Weather.SEPARATOR;
                    fileChannelPosition.write(ByteBuffer.wrap(str2.getBytes()));
                    logger.info("（调试使用）数据已保存：" + str2);
                    try {
                        fileChannelPosition.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                    try {
                        randomAccessFile.close();
                    } catch (IOException e3) {
                        e = e3;
                        e.printStackTrace();
                    }
                } catch (Exception e4) {
                    e = e4;
                    e.printStackTrace();
                    if (fileChannelPosition != null) {
                        try {
                            fileChannelPosition.close();
                        } catch (IOException e5) {
                            e5.printStackTrace();
                        }
                    }
                    if (randomAccessFile != null) {
                        try {
                            randomAccessFile.close();
                        } catch (IOException e6) {
                            e = e6;
                            e.printStackTrace();
                        }
                    }
                }
            } catch (Throwable th) {
                th = th;
                if (fileChannelPosition != null) {
                    if (randomAccessFile != null) {
                        throw th;
                    }
                    randomAccessFile.close();
                    throw th;
                }
                try {
                    fileChannelPosition.close();
                } catch (IOException e7) {
                    e7.printStackTrace();
                }
                if (randomAccessFile != null) {
                    throw th;
                }
                try {
                    randomAccessFile.close();
                    throw th;
                } catch (IOException e8) {
                    e8.printStackTrace();
                    throw th;
                }
                throw th;
            }
        } catch (Exception e9) {
            e = e9;
            randomAccessFile = null;
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile = null;
            if (fileChannelPosition != null) {
                if (randomAccessFile != null) {
                    throw th;
                }
                randomAccessFile.close();
                throw th;
            }
            fileChannelPosition.close();
            if (randomAccessFile != null) {
                throw th;
            }
            randomAccessFile.close();
            throw th;
            throw th;
        }
    }
}
