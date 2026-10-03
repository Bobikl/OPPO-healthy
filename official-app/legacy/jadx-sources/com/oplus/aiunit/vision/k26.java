package com.oplus.aiunit.vision;

import com.heytap.upgrade.model.SplitFileInfoDto;
import com.heytap.upgrade.model.UpgradeInfo;
import java.io.File;

/* JADX INFO: loaded from: classes19.dex */
public class k26 {
    public static boolean a(File file, String str) {
        return d(file, str);
    }

    public static boolean b(File file, String str, UpgradeInfo upgradeInfo) {
        if (upgradeInfo.isBundle()) {
            boolean z = false;
            for (SplitFileInfoDto splitFileInfoDto : upgradeInfo.getSplitFileList()) {
                String strA = v9e.a(file.getAbsolutePath(), str, splitFileInfoDto.getMd5());
                File file2 = new File(strA);
                if (!file2.exists()) {
                    u6b.b("DownloadHooker", "not cached download file:" + strA);
                } else if (file2.length() > splitFileInfoDto.getSize()) {
                    u6b.b("DownloadHooker", "has cached part of download file, but over size, delete it:" + strA);
                    file2.delete();
                    z = true;
                } else {
                    u6b.b("DownloadHooker", "has cached part of download file, allow continue to download:" + strA);
                }
            }
            if (z) {
                return false;
            }
        } else {
            String strA2 = v9e.a(file.getAbsolutePath(), str, upgradeInfo.getMd5());
            File file3 = new File(strA2);
            if (!file3.exists()) {
                u6b.b("DownloadHooker", "not cached download file:" + strA2);
            } else {
                if (file3.length() > upgradeInfo.getApkFileSize()) {
                    u6b.b("DownloadHooker", "has cached part of download file, but over size, delete it:" + strA2);
                    file3.delete();
                    return false;
                }
                u6b.b("DownloadHooker", "has cached part of download file, allow continue to download:" + strA2);
            }
        }
        return c(file, str, upgradeInfo);
    }

    public static boolean c(File file, String str, UpgradeInfo upgradeInfo) {
        if (!upgradeInfo.isBundle()) {
            return d(new File(v9e.a(file.getAbsolutePath(), str, upgradeInfo.getMd5())), upgradeInfo.getMd5());
        }
        while (true) {
            boolean z = true;
            for (SplitFileInfoDto splitFileInfoDto : upgradeInfo.getSplitFileList()) {
                File file2 = new File(v9e.a(file.getAbsolutePath(), str, splitFileInfoDto.getMd5()));
                if (!z || !d(file2, splitFileInfoDto.getMd5())) {
                    z = false;
                }
            }
            return z;
        }
    }

    public static boolean d(File file, String str) throws Throwable {
        if (file == null) {
            return false;
        }
        u6b.a("DownloadHooker downloadPath=" + file.getAbsolutePath());
        if (!file.exists()) {
            return false;
        }
        String strE = rqk.e(file);
        u6b.b("DownloadHooker", file.getName() + ",expect md5: " + str + "\tfile md5: " + strE);
        return str != null && str.equals(strE);
    }
}
