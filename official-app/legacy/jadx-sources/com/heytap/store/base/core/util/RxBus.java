package com.heytap.store.base.core.util;

import androidx.annotation.NonNull;
import com.oplus.aiunit.vision.kbd;
import com.oplus.aiunit.vision.r2j;
import io.reactivex.subjects.PublishSubject;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class RxBus {
    public static final String BROWSE_COMMENT_IMG = "browse_comment_img";
    public static final String FOREGROUND = "foreground";
    public static final String GIFT_JUMP = "gift_jump";
    public static final String HIDE_PRODUCT_WEB = "hide_product_web";
    public static final String INSERTITEM = "insertitem";
    public static final String LIVE_APPOINT_STATUS = "live_appoint_status";
    public static final String LIVE_APPOINT_STATUS_FOR_HOME_LIVE = "live_appoint_status_for_home_live";
    public static final String LOCATION = "location";
    public static final String LOGIN = "login";
    public static final String NEED_TO_LOGGIN = "need_to_loggin";
    public static final String NOTIFY_SKU_CHANGED = "notify_sku_changed";
    public static final String ON_LINE_STORE = "on_line_store";
    public static final String ORDER_PATAMES = "order_patames";
    public static final String PRODUCT_CHANGE_CLOSE = "product_change_close";
    public static final String PRODUCT_CHANGE_UPLOAD = "product_change_upload";
    public static final String QUANTITY = "quantity";
    public static final String RECEIVED_PUSH_PENETRATE = "received_push_penetrate";
    public static final String REFRESH = "refresh";
    public static final String REMOVE_NPS_QUESTIONNAIRE = "remove_nps_questionnaire";
    public static final String SCROLL_PRODUCT_PARAM = "scroll_product_param";
    public static final String SERVICES = "services";
    public static final String SHARE = "share";
    public static final String SHOWCALENDERDIALOG = "showCalenderDialog";
    public static final String SHOW_CHANGE = "show_change";
    public static final String SHOW_PRODUCT_WEB = "show_product_web";
    public static final String SHOW_SKU_DIALOG = "show_sku_dialog";
    private static final String TAG = "RxBus";
    public static final String UPDATE_SELECTED_CONTENT = "update_selected_content";
    public static final String UPDATE_SIGN_STATUS = "update_sign_status";
    public static final String VIP_REFRESH = "vip_refresh";
    public static final String WEBVIEW_URL_CHANGED = "webview_url_changed";
    public static final String WEB_CALL_BACK_FROM_RN = "web_call_back_from_rn";
    public static final String WX_OAUTH_DONE = "wx_auth_done";
    private static RxBus instance;
    private final ConcurrentHashMap<Object, CopyOnWriteArrayList<r2j>> subjectMapper = new ConcurrentHashMap<>();

    public static class Event {
        public final Object o;
        public final String tag;

        public Event(String str, Object obj) {
            this.tag = str;
            this.o = obj;
        }

        public String toString() {
            return "Event{tag='" + this.tag + "', o=" + this.o + '}';
        }
    }

    private RxBus() {
    }

    public static synchronized RxBus get() {
        if (instance == null) {
            instance = new RxBus();
        }
        return instance;
    }

    public void clear() {
        if (this.subjectMapper.isEmpty()) {
            return;
        }
        this.subjectMapper.clear();
    }

    public void post(@NonNull Object obj) {
        CopyOnWriteArrayList<r2j> copyOnWriteArrayList = this.subjectMapper.get(obj.getClass());
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
            return;
        }
        Iterator<r2j> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            it.next().onNext(obj);
        }
    }

    public <T> kbd<T> register(@NonNull Class<T> cls) {
        CopyOnWriteArrayList<r2j> copyOnWriteArrayList = this.subjectMapper.get(cls);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            this.subjectMapper.put(cls, copyOnWriteArrayList);
        }
        PublishSubject publishSubjectJ = PublishSubject.J();
        copyOnWriteArrayList.add(publishSubjectJ);
        return publishSubjectJ;
    }

    public <T> void unregister(@NonNull Class<T> cls, @NonNull kbd kbdVar) {
        CopyOnWriteArrayList<r2j> copyOnWriteArrayList = this.subjectMapper.get(cls);
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.remove(kbdVar);
            if (copyOnWriteArrayList.isEmpty()) {
                this.subjectMapper.remove(cls);
            }
        }
    }

    public void unregister(@NonNull Object obj, @NonNull kbd kbdVar) {
        CopyOnWriteArrayList<r2j> copyOnWriteArrayList = this.subjectMapper.get(obj);
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.remove((r2j) kbdVar);
            this.subjectMapper.remove(obj);
        }
    }
}
