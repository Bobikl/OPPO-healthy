package com.oplus.aiunit.vision;

import android.net.Uri;
import android.provider.BaseColumns;
import android.util.Base64;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class qmm {
    public static final String a = new String(Base64.decode("Y29tLmNvbG9yb3Muc2F1LmRi".getBytes(StandardCharsets.UTF_8), 2), StandardCharsets.UTF_8);

    public static final class a implements BaseColumns {
        public static final Uri a;
        public static final String b = "pkg_name";
        public static final String c = "type";
        public static final String d = "new_version_code";
        public static final String e = "new_version_name";
        public static final String f = "description";
        public static final String g = "force_download";
        public static final String h = "force_install";
        public static final String i = "can_use_old";
        public static final String j = "md5_patch";
        public static final String k = "md5_all";
        public static final String l = "url";
        public static final String m = "size";
        public static final String n = "all_size";
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
            StringBuilder sbA = pgm.a("content://");
            sbA.append(qmm.a);
            sbA.append("/update_info");
            a = Uri.parse(sbA.toString());
        }
    }
}
