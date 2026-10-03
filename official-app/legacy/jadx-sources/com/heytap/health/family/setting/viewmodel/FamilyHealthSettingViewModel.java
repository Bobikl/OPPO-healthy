package com.heytap.health.family.setting.viewmodel;

import androidx.lifecycle.ViewModel;
import com.heytap.health.base.livedata.OLiveData;
import com.heytap.health.health.familymode.request.InviteRequest;
import com.heytap.health.health.familymode.request.ReplyInvitationRequest;
import com.heytap.health.health.familymode.response.FriendInfo;
import com.heytap.health.health.familymode.response.FriendList;
import com.heytap.health.health.familymode.response.InviteResponse;
import com.oplus.aiunit.vision.r47;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public class FamilyHealthSettingViewModel extends ViewModel {
    public final r47 i = new r47();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final OLiveData<InviteResponse> f4250j = new OLiveData<>();
    public final OLiveData<FriendList> k = new OLiveData<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final OLiveData<Integer> f4251l = new OLiveData<>();

    public OLiveData<FriendList> u() {
        return this.k;
    }

    public void v() {
        this.i.a(this.k);
    }

    public OLiveData<InviteResponse> w() {
        return this.f4250j;
    }

    public OLiveData<Integer> x() {
        return this.f4251l;
    }

    public void y(FriendInfo friendInfo, int i, int i2, ArrayList<Integer> arrayList) {
        ReplyInvitationRequest replyInvitationRequest = new ReplyInvitationRequest();
        replyInvitationRequest.setGroupType(1);
        replyInvitationRequest.setAnswer(i);
        replyInvitationRequest.setInviterNickname(friendInfo.getFriendNickname());
        replyInvitationRequest.setInviterSsoid(friendInfo.getFriendSsoid());
        replyInvitationRequest.setNoNoticeForSameInvitation(i2);
        replyInvitationRequest.setSharedDataTypeList(arrayList);
        if (friendInfo.getExpectFriendNickName() != null) {
            replyInvitationRequest.setExpectFriendNickname(friendInfo.getExpectFriendNickName());
        } else {
            replyInvitationRequest.setExpectFriendNickname(friendInfo.getFriendNickname());
        }
        this.i.b(this.f4251l, replyInvitationRequest);
    }

    public void z(int i, @NotNull FriendInfo friendInfo, String str, ArrayList<Integer> arrayList, ArrayList<Integer> arrayList2) {
        InviteRequest inviteRequest = new InviteRequest();
        inviteRequest.setGroupType(1);
        inviteRequest.setInvitationType(i);
        if (i == 1) {
            str = friendInfo.getFriendSsoid();
        }
        inviteRequest.setInviteeId(str);
        inviteRequest.setInviteeSsoid(friendInfo.getFriendSsoid());
        inviteRequest.setInviteeNickname(friendInfo.getFriendNickname());
        inviteRequest.setExpectSharedDataTypeList(arrayList);
        inviteRequest.setExpectFriendNickname(friendInfo.getExpectFriendNickName());
        inviteRequest.setSharedDataTypeList(arrayList2);
        this.i.c(this.f4250j, inviteRequest);
    }
}
