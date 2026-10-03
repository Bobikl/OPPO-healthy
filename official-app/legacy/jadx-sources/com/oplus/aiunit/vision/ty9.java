package com.oplus.aiunit.vision;

import android.os.RemoteException;
import com.heytap.databaseengine.callback.IDataReadResultListener;
import com.heytap.databaseengine.option.DataDeleteOption;
import com.heytap.databaseengine.option.DataReadOption;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public interface ty9<V> {
    int b(DataDeleteOption dataDeleteOption);

    int c(List<V> list);

    void read(DataReadOption dataReadOption, IDataReadResultListener iDataReadResultListener) throws RemoteException;
}
