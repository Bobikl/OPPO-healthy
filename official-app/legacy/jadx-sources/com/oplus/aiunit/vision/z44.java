package com.oplus.aiunit.vision;

import android.net.Uri;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0014\u0010\u0001\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0014\u0010\u0003\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0002\"\u0014\u0010\u0004\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0002\"\u0014\u0010\u0005\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0002\"\u0014\u0010\u0006\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0002\"\u0014\u0010\u0007\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0002\"\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\n\"\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\n\"\u0014\u0010\f\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\n\"\u0014\u0010\r\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\n\"\u0014\u0010\u000e\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\n\"\u0014\u0010\u000f\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\n\"\u0014\u0010\u0010\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\n\"\u0014\u0010\u0011\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\n\"\u0014\u0010\u0012\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\n\"\u0014\u0010\u0013\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\n\"\u0014\u0010\u0014\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0002\"\u0014\u0010\u0015\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\n\"\u0014\u0010\u0016\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0002\"\u0014\u0010\u0017\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\n\"\u0014\u0010\u0018\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\n\"\u0014\u0010\u0019\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\n\"\u0014\u0010\u001a\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\n\"\u0014\u0010\u001b\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\n\"\u0014\u0010\u001c\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0002\"\u0014\u0010\u001d\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0002\"\u0014\u0010\u001e\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0002\"\u0014\u0010\u001f\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0002\"\u0017\u0010$\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#¨\u0006%"}, d2 = {"", "MESSAGE_API_PATH", "Ljava/lang/String;", "ACTION_FULL_CHECK", "ACTION_CLEAR_DEVICE_DATA", "NATIVE_SYNC_CONTACT_ACTION", "NATIVE_SYNC_CALL_LOG_ACTION", "NATIVE_SYNC_BLACK_LIST_ACTION", "", "CMD_CONTACT_PERM_GRANTED", "I", "CMD_SYNC_CONTACT_ACTION", "CMD_SYNC_CALL_LOG_ACTION", "CMD_SYNC_BLACK_LIST_ACTION", "CMD_DEVICE_REMOVE_ACTION", "CMD_DEVICE_COMMONLY_USED_CONTACT", "CMD_SEND_CONTACT_SORT", "CMD_SYNC_CONTACT_FOR_SWITCH_MODEL", "CMD_SYNC_CONTACT_FAMILY", "CMD_ACTION_CONTACT_FULL_SYNC", "H5_PATH_PRIVACY_SETTING", "CONTACT_SYNC_REPORT_EVENT_ID", "CONTACT_SYNC_REPORT_EVENT_FIELD_NOT", "CONTACT_SYNC_REPORT_EVENT_NO_PERMISSION", "CONTACT_SYNC_REPORT_EVENT_ERROR", "CONTACT_SYNC_REPORT_EVENT_UNKNOWN", "CONTACT_SYNC_REPORT_EVENT_FAMILY", "CONTACT_SYNC_REPORT_EVENT_NO_DIFF", "CONTACT_SYNC_REPORT_EVENT_FIELD_SYNC_RESULT", "CONTACT_SYNC_REPORT_EVENT_FIELD_DATA", "CONTACT_SYNC_REPORT_EVENT_FIELD_CLICK", "CONTACT_SYNC_REPORT_EVENT_FIELD_SYNC_TYPE", "Landroid/net/Uri;", "a", "Landroid/net/Uri;", "()Landroid/net/Uri;", "blockedSourceoppoUri", "contactsync_impl_release"}, k = 2, mv = {1, 8, 0})
public final class z44 {

    @NotNull
    public static final String ACTION_CLEAR_DEVICE_DATA = "com.heytap.health.watch.contactsync.action.ACTION_CLEAR_DEVICE_DATA";

    @NotNull
    public static final String ACTION_FULL_CHECK = "com.heytap.health.watch.contactsync.action.ACTION_FULL_CHECK";
    public static final int CMD_ACTION_CONTACT_FULL_SYNC = 11;
    public static final int CMD_CONTACT_PERM_GRANTED = 1;
    public static final int CMD_DEVICE_COMMONLY_USED_CONTACT = 7;
    public static final int CMD_DEVICE_REMOVE_ACTION = 6;
    public static final int CMD_SEND_CONTACT_SORT = 8;
    public static final int CMD_SYNC_BLACK_LIST_ACTION = 5;
    public static final int CMD_SYNC_CALL_LOG_ACTION = 4;
    public static final int CMD_SYNC_CONTACT_ACTION = 3;
    public static final int CMD_SYNC_CONTACT_FAMILY = 10;
    public static final int CMD_SYNC_CONTACT_FOR_SWITCH_MODEL = 9;
    public static final int CONTACT_SYNC_REPORT_EVENT_ERROR = 2;
    public static final int CONTACT_SYNC_REPORT_EVENT_FAMILY = 4;

    @NotNull
    public static final String CONTACT_SYNC_REPORT_EVENT_FIELD_CLICK = "click_button";

    @NotNull
    public static final String CONTACT_SYNC_REPORT_EVENT_FIELD_DATA = "dail_contactdata";

    @NotNull
    public static final String CONTACT_SYNC_REPORT_EVENT_FIELD_NOT = "contact_synchronization_cannot";

    @NotNull
    public static final String CONTACT_SYNC_REPORT_EVENT_FIELD_SYNC_RESULT = "synchronize_contacts_watch";

    @NotNull
    public static final String CONTACT_SYNC_REPORT_EVENT_FIELD_SYNC_TYPE = "synchronize_contacts_type";
    public static final int CONTACT_SYNC_REPORT_EVENT_ID = 2029;
    public static final int CONTACT_SYNC_REPORT_EVENT_NO_DIFF = 5;
    public static final int CONTACT_SYNC_REPORT_EVENT_NO_PERMISSION = 1;
    public static final int CONTACT_SYNC_REPORT_EVENT_UNKNOWN = 3;

    @NotNull
    public static final String H5_PATH_PRIVACY_SETTING = "call-record-guide/index.html";

    @NotNull
    public static final String MESSAGE_API_PATH = "/contactsync/sync";

    @NotNull
    public static final String NATIVE_SYNC_BLACK_LIST_ACTION = "com.op.smartwear.native.blacklist.RECEIVER";

    @NotNull
    public static final String NATIVE_SYNC_CALL_LOG_ACTION = "com.op.smartwear.native.call.log.RECEIVER";

    @NotNull
    public static final String NATIVE_SYNC_CONTACT_ACTION = "com.op.smartwear.native.contact.RECEIVER";

    @NotNull
    public static final Uri a;

    static {
        Uri uriWithAppendedPath = Uri.withAppendedPath(Uri.parse("content://com.coloros.provider.BlackListProvider"), "bl_list");
        Intrinsics.checkNotNullExpressionValue(uriWithAppendedPath, "<clinit>");
        a = uriWithAppendedPath;
    }

    @NotNull
    public static final Uri a() {
        return a;
    }
}
