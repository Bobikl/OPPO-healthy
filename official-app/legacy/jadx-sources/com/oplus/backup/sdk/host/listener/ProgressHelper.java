package com.oplus.backup.sdk.host.listener;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class ProgressHelper {
    public static final String BR_ERROR_CODE = "fail_reason";
    public static final String BR_ERROR_MSG = "fail_message";
    public static final String BR_RESULT = "br_result";
    public static final int BR_RESULT_CANCEL = 3;
    public static final int BR_RESULT_FAILED = 2;
    public static final int BR_RESULT_SUCCESS = 1;
    public static final String COMPLETED_COUNT = "completed_count";
    public static final String COMPLETED_FILE_PATHS = "completed_paths";
    public static final String ERROR_MESSAGE = "error_message";
    public static final int ERROR_SERVICE_CONNECTION_FAIL = 1;
    public static final String ERROR_TYPE = "error_type";
    public static final String FILE_TYPE = "file_type";
    public static final int INVALID_COUNT = Integer.MIN_VALUE;
    public static final String MAX_COUNT = "max_count";
    public static final String PREVIEW_DATA_SIZE = "preview_data_size";
    public static final String PREVIEW_LIST = "preview_list";
    public static final String PREVIEW_LIST_ITEM_CACHE_SIZE = "preview_list_item_cache_size";
    public static final String PREVIEW_LIST_ITEM_COUNT = "preview_list_item_count";
    public static final String PREVIEW_LIST_ITEM_DATA_SIZE = "preview_list_item_data_size";
    public static final String PREVIEW_LIST_ITEM_DEFAULT_SELECTED = "preview_list_item_default_selected";
    public static final String PREVIEW_LIST_ITEM_ICON = "preview_list_item_icon";
    public static final String PREVIEW_LIST_ITEM_PACKAGE = "preview_list_item_package";
    public static final String PREVIEW_LIST_ITEM_SUB_TITLE = "preview_list_item_sub_title";
    public static final String PREVIEW_LIST_ITEM_TITLE = "preview_list_item_title";
    public static final String PREVIEW_LIST_SHOW_PLUGIN_ITEM = "preview_list_show_plugin_item";
    public static final String PREVIEW_SELECTED_LIST = "preview_selected_list";

    public static Bundle buildErrorBundle(int i, String str) {
        Bundle bundle = new Bundle();
        bundle.putInt("error_type", i);
        bundle.putString("error_message", str);
        return bundle;
    }

    public static int getBRResult(Bundle bundle, int i) {
        return bundle != null ? bundle.getInt(BR_RESULT, i) : i;
    }

    public static int getErrorType(Bundle bundle) {
        if (bundle != null) {
            return bundle.getInt("error_type");
        }
        return 0;
    }

    public static int getMaxCount(Bundle bundle) {
        return getMaxCount(bundle, 0);
    }

    public static String getPreviewListItemTitle(Bundle bundle) {
        if (bundle != null) {
            return bundle.getString(PREVIEW_LIST_ITEM_TITLE);
        }
        return null;
    }

    public static List<Bundle> getPreviewSelectedList(Bundle bundle) {
        if (bundle != null) {
            return bundle.getParcelableArrayList(PREVIEW_SELECTED_LIST);
        }
        return null;
    }

    public static void putBRResult(Bundle bundle, int i) {
        if (bundle != null) {
            bundle.putInt(BR_RESULT, i);
        }
    }

    public static void putCompletedCount(Bundle bundle, int i) {
        if (bundle != null) {
            bundle.putInt(COMPLETED_COUNT, i);
        }
    }

    public static void putFailedInfo(Bundle bundle, int i, String str) {
        if (bundle != null) {
            bundle.putInt("fail_reason", i);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            bundle.putString(BR_ERROR_MSG, str);
        }
    }

    public static void putFileType(Bundle bundle, String str) {
        if (bundle != null) {
            bundle.putString("file_type", str);
        }
    }

    public static void putMaxCount(Bundle bundle, int i) {
        if (bundle != null) {
            bundle.putInt("max_count", i);
        }
    }

    public static void putPreviewArrayList(Bundle bundle, ArrayList<Bundle> arrayList) {
        if (bundle != null) {
            bundle.putParcelableArrayList(PREVIEW_LIST, arrayList);
        }
    }

    public static void putPreviewDataSize(Bundle bundle, long j2) {
        if (bundle != null) {
            bundle.putLong(PREVIEW_DATA_SIZE, j2);
        }
    }

    public static void putPreviewListItemIcon(Bundle bundle, int i) {
        if (bundle != null) {
            bundle.putInt(PREVIEW_LIST_ITEM_ICON, i);
        }
    }

    public static void putPreviewListItemPackage(Bundle bundle, String str) {
        if (bundle != null) {
            bundle.putString(PREVIEW_LIST_ITEM_PACKAGE, str);
        }
    }

    public static void putPreviewListItemSubCacheSize(Bundle bundle, long j2) {
        if (bundle != null) {
            bundle.putLong(PREVIEW_LIST_ITEM_CACHE_SIZE, j2);
        }
    }

    public static void putPreviewListItemSubDataSize(Bundle bundle, long j2) {
        if (bundle != null) {
            bundle.putLong(PREVIEW_LIST_ITEM_DATA_SIZE, j2);
        }
    }

    public static void putPreviewListItemSubTitle(Bundle bundle, String str) {
        if (bundle != null) {
            bundle.putString(PREVIEW_LIST_ITEM_SUB_TITLE, str);
        }
    }

    public static void putPreviewListItemTitle(Bundle bundle, String str) {
        if (bundle != null) {
            bundle.putString(PREVIEW_LIST_ITEM_TITLE, str);
        }
    }

    public static int getMaxCount(Bundle bundle, int i) {
        return bundle != null ? bundle.getInt("max_count", i) : i;
    }
}
