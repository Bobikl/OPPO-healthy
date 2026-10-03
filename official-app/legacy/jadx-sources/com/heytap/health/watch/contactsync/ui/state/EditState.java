package com.heytap.health.watch.contactsync.ui.state;

import com.heytap.health.watch.contactsync.ui.bean.ContactItemBean;
import com.heytap.health.watch.contactsync.ui.model.ContactViewModel;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class EditState extends AState {
    public EditState(StateContext stateContext) {
        super(stateContext);
    }

    @Override // com.heytap.health.watch.contactsync.ui.state.AState
    public void doAction(List<ContactItemBean> list, ContactViewModel contactViewModel) {
        changeState(this.mStateContext.getNormalState());
    }
}
