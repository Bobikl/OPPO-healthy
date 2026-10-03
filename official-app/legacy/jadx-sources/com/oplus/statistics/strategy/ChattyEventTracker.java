package com.oplus.statistics.strategy;

import android.content.Context;
import android.util.ArrayMap;
import androidx.annotation.NonNull;
import com.oplus.aiunit.vision.of5;
import com.oplus.statistics.agent.CommonAgent;
import com.oplus.statistics.data.CommonBean;
import com.oplus.statistics.strategy.ChattyEventTracker;
import com.oplus.statistics.util.LogUtil;
import com.oplus.statistics.util.Supplier;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class ChattyEventTracker {
    public final Map<String, ChattyEvent> a;
    public int b;

    public static class ChattyEvent {
        public final String a;
        public final String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f20122c;
        public int d;

        public ChattyEvent(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.f20122c = str3;
        }

        public int increment() {
            int i = this.d;
            this.d = i + 1;
            return i;
        }
    }

    public static class SingletonHolder {
        public static final ChattyEventTracker a = new ChattyEventTracker();
    }

    public static /* synthetic */ String d() {
        return "context is empty.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(Context context, CommonBean commonBean) {
        g(context, commonBean.getAppId(), commonBean.getLogTag(), commonBean.getEventID());
    }

    public static ChattyEventTracker getInstance() {
        return SingletonHolder.a;
    }

    /* JADX INFO: renamed from: commit, reason: merged with bridge method [inline-methods] */
    public void f(Context context) {
        for (ChattyEvent chattyEvent : this.a.values()) {
            CommonBean commonBean = new CommonBean(context, "21000", "001", "chatty_event");
            ArrayMap arrayMap = new ArrayMap();
            arrayMap.put("app_id", String.valueOf(chattyEvent.a));
            arrayMap.put("log_tag", chattyEvent.b);
            arrayMap.put(of5.ARG_EVENT_ID, chattyEvent.f20122c);
            arrayMap.put("times", String.valueOf(chattyEvent.d));
            commonBean.setLogMap(arrayMap);
            CommonAgent.recordCommon(context, commonBean);
        }
        this.b = 0;
        this.a.clear();
        WorkThread.getInstance().removeMessages(1);
    }

    public final void g(final Context context, String str, String str2, String str3) {
        String str4 = str + str2 + str3;
        ChattyEvent chattyEvent = this.a.get(str4);
        if (chattyEvent == null) {
            ChattyEvent chattyEvent2 = new ChattyEvent(str, str2, str3);
            chattyEvent2.increment();
            this.a.put(str4, chattyEvent2);
        } else {
            chattyEvent.increment();
        }
        int i = this.b + 1;
        this.b = i;
        if (i >= 100) {
            f(context);
        } else {
            if (i != 1 || WorkThread.getInstance().hasMessages(1)) {
                return;
            }
            WorkThread.getInstance().postDelay(1, new Runnable() { // from class: com.oplus.aiunit.vision.s83
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.f(context);
                }
            }, 300000L);
        }
    }

    public void onChattyEvent(@NonNull final CommonBean commonBean) {
        final Context applicationContext = commonBean.getContext().getApplicationContext();
        if (applicationContext == null) {
            LogUtil.e("ChattyEventTracker", new Supplier() { // from class: com.oplus.aiunit.vision.q83
                @Override // com.oplus.statistics.util.Supplier
                public final Object get() {
                    return ChattyEventTracker.d();
                }
            });
        } else {
            WorkThread.execute(new Runnable() { // from class: com.oplus.aiunit.vision.r83
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.e(applicationContext, commonBean);
                }
            });
        }
    }

    public ChattyEventTracker() {
        this.a = new ArrayMap();
    }
}
