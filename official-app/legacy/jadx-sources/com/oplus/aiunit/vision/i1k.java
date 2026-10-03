package com.oplus.aiunit.vision;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.heytap.health.home.todocard.bean.TodoData;
import com.heytap.health.network.core.BaseResponse;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class i1k {

    public class a extends u61<List<TodoData>> {
        public final /* synthetic */ MutableLiveData i;

        public a(MutableLiveData mutableLiveData) {
            this.i = mutableLiveData;
        }

        @Override // com.oplus.aiunit.vision.u61
        public void b(Throwable th, String str) {
            this.i.postValue(null);
        }

        @Override // com.oplus.aiunit.vision.u61
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void d(List<TodoData> list) {
            this.i.postValue(list);
        }
    }

    public interface b {
        @m1e("v1/c2s/user/todo/queryUserTodoList")
        lbd<BaseResponse<List<TodoData>>> a();

        @m1e("v1/c2s/user/todo/reportUserTodoEvent")
        lbd<BaseResponse> b(@av1 Object obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Context context, MutableLiveData<List<TodoData>> mutableLiveData) {
        ((mdd) ((b) com.heytap.health.network.core.a.j(b.class)).a().L0(su8.c()).d1(l4g.a((LifecycleOwner) context))).subscribe(new a(mutableLiveData));
    }

    public static lbd<BaseResponse> b(TodoData todoData) {
        HashMap map = new HashMap();
        map.put("eventType", todoData.getEventType());
        map.put("eventSubType", todoData.getEventSubType());
        map.put("eventId", todoData.getEventId());
        map.put("ssoid", um.c().getSsoid());
        return ((b) com.heytap.health.network.core.a.j(b.class)).b(map);
    }
}
