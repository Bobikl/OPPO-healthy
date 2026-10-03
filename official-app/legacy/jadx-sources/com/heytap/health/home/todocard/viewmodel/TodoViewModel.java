package com.heytap.health.home.todocard.viewmodel;

import android.content.Context;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.heytap.health.home.todocard.bean.TodoData;
import com.oplus.aiunit.vision.i1k;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class TodoViewModel extends ViewModel {
    public MutableLiveData<List<TodoData>> i = new MutableLiveData<>();

    public MutableLiveData<List<TodoData>> u() {
        return this.i;
    }

    public void v(Context context) {
        i1k.a(context, this.i);
    }
}
