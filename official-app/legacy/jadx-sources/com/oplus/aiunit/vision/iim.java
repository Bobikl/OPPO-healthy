package com.oplus.aiunit.vision;

import android.net.Uri;
import android.provider.BaseColumns;
import android.util.Base64;
import com.heytap.health.watch.notification.impl.pull.NotificationApiService;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes2.dex */
public class iim {
    public static final String a = new String(Base64.decode("Y29tLmNvbG9yb3Muc2F1LmRi".getBytes(StandardCharsets.UTF_8), 2), StandardCharsets.UTF_8);

    public static final class a implements BaseColumns {
        public static final Uri a;
        public static final String b = "pkg_name";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f12556c = "type";
        public static final String d = "new_version_code";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f12557e = "new_version_name";
        public static final String f = "description";
        public static final String g = "force_download";
        public static final String h = "force_install";
        public static final String i = "can_use_old";

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final String f12558j = "md5_patch";
        public static final String k = "md5_all";

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final String f12559l = "url";
        public static final String m = "size";

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final String f12560n = "all_size";
        public static final String o = "patch_file_name";
        public static final String p = "file_name";
        public static final String q = "old_file_dir";
        public static final String r = "downloaded_size";
        public static final String s = "download_finished";
        public static final String t = "patch_finished";
        public static final String u = "install_finished";
        public static final String v = "error_type";
        public static final String w = "sau_type";
        public static final String x = "icon_exists";
        public static final String y = "status_updating";
        public static final String z = "upgrade_status";

        static {
            StringBuilder sbA = hcm.a(NotificationApiService.CONTENT);
            sbA.append(iim.a);
            sbA.append("/update_info");
            a = Uri.parse(sbA.toString());
        }
    }
}
