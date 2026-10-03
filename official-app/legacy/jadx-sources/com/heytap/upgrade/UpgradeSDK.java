package com.heytap.upgrade;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.heytap.upgrade.exception.UpgradeException;
import com.heytap.upgrade.model.SplitFileInfoDto;
import com.heytap.upgrade.model.UpgradeInfo;
import com.oplus.aiunit.vision.bba;
import com.oplus.aiunit.vision.g92;
import com.oplus.aiunit.vision.kkk;
import com.oplus.aiunit.vision.nz9;
import com.oplus.aiunit.vision.o93;
import com.oplus.aiunit.vision.p04;
import com.oplus.aiunit.vision.rqk;
import com.oplus.aiunit.vision.sn9;
import com.oplus.aiunit.vision.t26;
import com.oplus.aiunit.vision.u6b;
import com.oplus.aiunit.vision.u82;
import com.oplus.aiunit.vision.v9e;
import com.oplus.aiunit.vision.w81;
import com.oplus.aiunit.vision.w93;
import com.oplus.aiunit.vision.y7a;
import java.io.File;
import java.util.HashMap;

/* JADX INFO: loaded from: classes19.dex */
public enum UpgradeSDK {
    instance;

    public static final String INTENT_COMMIT_ACTION = "commit_action";
    public static final String INTENT_INSTALL_KEY = "install_key";
    private static final String TAG = "UpgradeSDK";
    private y7a initParam;
    public w81 inner;
    private HashMap<String, UpgradeInfo> upgradeInfoMap = new HashMap<>();

    public class a implements sn9 {
        public final /* synthetic */ sn9 a;
        public final /* synthetic */ o93 b;

        public a(sn9 sn9Var, o93 o93Var) {
            this.a = sn9Var;
            this.b = o93Var;
        }

        @Override // com.oplus.aiunit.vision.sn9
        public void a() {
            u6b.b(UpgradeSDK.TAG, "onStartCheck");
            sn9 sn9Var = this.a;
            if (sn9Var != null) {
                sn9Var.a();
            }
        }

        @Override // com.oplus.aiunit.vision.sn9
        public void b(UpgradeInfo upgradeInfo) {
            u6b.b(UpgradeSDK.TAG, "onResult, upgradeInfo=" + upgradeInfo);
            if (upgradeInfo != null) {
                if (upgradeInfo.isBundle()) {
                    UpgradeSDK.this.inner = new g92();
                } else {
                    UpgradeSDK.this.inner = new kkk();
                }
                UpgradeSDK.this.inner.h(rqk.b(), UpgradeSDK.this.initParam);
                UpgradeSDK.this.upgradeInfoMap.put(this.b.c(), upgradeInfo);
            }
            sn9 sn9Var = this.a;
            if (sn9Var != null) {
                sn9Var.b(upgradeInfo);
            }
        }

        @Override // com.oplus.aiunit.vision.sn9
        public void c(UpgradeException upgradeException) {
            u6b.b(UpgradeSDK.TAG, "onCheckError, exception=" + upgradeException);
            sn9 sn9Var = this.a;
            if (sn9Var != null) {
                sn9Var.c(upgradeException);
            }
        }
    }

    UpgradeSDK() {
    }

    public void addDownloadListener(nz9 nz9Var) {
        u6b.b(TAG, "addDownloadListener");
        w81 w81Var = this.inner;
        if (w81Var != null) {
            w81Var.e(nz9Var);
        }
    }

    public void cancelAllDownload() {
        u6b.b(TAG, "cancelAllDownload");
        w81 w81Var = this.inner;
        if (w81Var != null) {
            w81Var.b();
        }
    }

    public void cancelDownload(@NonNull String str) {
        u6b.b(TAG, "cancelDownload for package " + str);
        w81 w81Var = this.inner;
        if (w81Var != null) {
            w81Var.c(str);
        }
    }

    public void checkUpgrade(@NonNull o93 o93Var) {
        w93.a(o93Var, "check upgrade param can not be null");
        u6b.b(TAG, "checkUpgrade for package " + o93Var.c());
        new u82(o93Var, new a(o93Var.b(), o93Var)).h();
    }

    public y7a getInitParam() {
        if (this.initParam == null) {
            this.initParam = y7a.a();
        }
        return this.initParam;
    }

    public boolean hasDownloadComplete(String str, File file, UpgradeInfo upgradeInfo) {
        w93.a(upgradeInfo, "upgradeInfo can not be null");
        if (!upgradeInfo.isBundle()) {
            File file2 = new File(v9e.a(file.getAbsolutePath(), str, upgradeInfo.getMd5()));
            return file2.exists() && TextUtils.equals(rqk.e(file2), upgradeInfo.getMd5());
        }
        if (upgradeInfo.getSplitFileList() == null) {
            return false;
        }
        for (SplitFileInfoDto splitFileInfoDto : upgradeInfo.getSplitFileList()) {
            File file3 = new File(v9e.a(file.getAbsolutePath(), str, splitFileInfoDto.getMd5()));
            if (!file3.exists() || file3.length() != splitFileInfoDto.getSize() || !TextUtils.equals(rqk.e(file3), splitFileInfoDto.getMd5())) {
                return false;
            }
        }
        return true;
    }

    public boolean hasExistDownLoadTask(String str, File file, UpgradeInfo upgradeInfo) {
        if (isDownloading(str)) {
            return true;
        }
        w93.a(upgradeInfo, "upgradeInfo can not be null");
        if (!upgradeInfo.isBundle()) {
            File file2 = new File(v9e.a(file.getAbsolutePath(), str, upgradeInfo.getMd5()));
            return file2.exists() && !TextUtils.equals(rqk.e(file2), upgradeInfo.getMd5());
        }
        if (upgradeInfo.getSplitFileList() != null) {
            for (SplitFileInfoDto splitFileInfoDto : upgradeInfo.getSplitFileList()) {
                File file3 = new File(v9e.a(file.getAbsolutePath(), str, splitFileInfoDto.getMd5()));
                if (!file3.exists()) {
                    return false;
                }
                if (file3.length() != splitFileInfoDto.getSize() || !TextUtils.equals(rqk.e(file3), splitFileInfoDto.getMd5())) {
                    return true;
                }
            }
        }
        return false;
    }

    public void init(Context context, y7a y7aVar) {
        rqk.v(context);
        u6b.b(TAG, "init");
        this.initParam = y7aVar;
        w93.a(y7aVar, "init param is null, can not use UpgradeSDK");
        p04.DEBUG = y7aVar.e();
        if (y7aVar.d() != null) {
            p04.SERVER_DECISION = y7aVar.d().ordinal();
        }
    }

    public void install(bba bbaVar) {
        w93.a(bbaVar, "install upgrade param can not be null");
        new StringBuilder().append("install package ");
        throw null;
    }

    public boolean isDownloading(@NonNull String str) {
        w81 w81Var = this.inner;
        if (w81Var == null) {
            return false;
        }
        return w81Var.d(str);
    }

    public void setRootServerUrl(String str) {
        p04.c(str);
    }

    public boolean startDownload(t26 t26Var) {
        w93.a(t26Var, "download upgrade param can not be null");
        u6b.b(TAG, "startDownload for package " + t26Var.c());
        w93.a(this.inner, "you should invoke UpgradeSDK#checkUpgrade(CheckParam) first");
        if (t26Var.e() == null) {
            t26Var.h(this.upgradeInfoMap.get(t26Var.c()));
        }
        w93.a(t26Var.e(), "you should invoke UpgradeSDK#checkUpgrade(CheckParam) first");
        return this.inner.a(t26Var);
    }
}
