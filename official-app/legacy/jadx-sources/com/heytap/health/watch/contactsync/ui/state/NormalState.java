package com.heytap.health.watch.contactsync.ui.state;

import com.heytap.health.watch.contactsync.ui.bean.ContactItemBean;
import com.heytap.health.watch.contactsync.ui.model.ContactViewModel;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class NormalState extends AState {
    public NormalState(StateContext stateContext) {
        super(stateContext);
    }

    @Override // com.heytap.health.watch.contactsync.ui.state.AState
    public void doAction(List<ContactItemBean> list, ContactViewModel contactViewModel) {
        Iterator<ContactItemBean> it = list.iterator();
        while (it.hasNext()) {
            it.next().setSelect(false);
        }
        contactViewModel.M().postValue(0);
        changeState(this.mStateContext.getDoneState());
    }
}
