package com.heytap.health.community.net;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001a\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001e¨\u0006\u001f"}, d2 = {"Lcom/heytap/health/community/net/CommunityErrorCode;", "", "code", "", "message", "", "(Ljava/lang/String;IILjava/lang/String;)V", "getCode", "()I", "getMessage", "()Ljava/lang/String;", "COMMUNITY_USER_MUZZLE", "COMMUNITY_USER_BAN", "COMMUNITY_CONTENT_ILLEGAL", "COMMUNITY_POST_NO_EXIST", "COMMUNITY_COMMENT_NO_EXIST", "COMMUNITY_PICTURE_NO_EXIST", "COMMUNITY_USER_NO_EXIST", "COMMUNITY_HOME_PAGE_REVIEW_EXIST", "COMMUNITY_ALREADY_FOLLOW", "COMMUNITY_ALREADY_CANCEL_FOLLOW", "COMMUNITY_ALREADY_LIKE", "COMMUNITY_ALREADY_CANCEL_LIKE", "COMMUNITY_RANK_ERR", "COMMUNITY_COMMENT_DATE_LIMIT", "COMMUNITY_HOME_PAGE_IMAGE_REVIEW_EXIST", "COMMUNITY_ALREADY_BLOCK", "COMMUNITY_ALREADY_CANCEL_BLOCK", "COMMUNITY_BLOCK_OFFICIAL_NOT_ALLOW", "COMMUNITY_BE_BLOCKED_OPERATION_NOT_ALLOW", "COMMUNITY_BLOCK_OPERATION_NOT_ALLOW", "community_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum CommunityErrorCode {
    COMMUNITY_USER_MUZZLE(250000, "用户已被禁言"),
    COMMUNITY_USER_BAN(250001, "用户已被封禁"),
    COMMUNITY_CONTENT_ILLEGAL(250002, "存在非法字符或长度太长"),
    COMMUNITY_POST_NO_EXIST(250003, "帖子不存在"),
    COMMUNITY_COMMENT_NO_EXIST(250004, "评论不存在"),
    COMMUNITY_PICTURE_NO_EXIST(250005, "图片不存在"),
    COMMUNITY_USER_NO_EXIST(250006, "社区用户不存在"),
    COMMUNITY_HOME_PAGE_REVIEW_EXIST(250007, "已存在审核中的主页信息"),
    COMMUNITY_ALREADY_FOLLOW(250008, "已关注"),
    COMMUNITY_ALREADY_CANCEL_FOLLOW(250009, "已取消关注"),
    COMMUNITY_ALREADY_LIKE(250010, "已点赞"),
    COMMUNITY_ALREADY_CANCEL_LIKE(250011, "已取消点赞"),
    COMMUNITY_RANK_ERR(250012, "插入热榜排序错误"),
    COMMUNITY_COMMENT_DATE_LIMIT(250013, "评论超过每日限额"),
    COMMUNITY_HOME_PAGE_IMAGE_REVIEW_EXIST(2500014, "已存在审核中的背景图信息"),
    COMMUNITY_ALREADY_BLOCK(250015, "已拉黑"),
    COMMUNITY_ALREADY_CANCEL_BLOCK(250016, "已取消拉黑"),
    COMMUNITY_BLOCK_OFFICIAL_NOT_ALLOW(250017, "无法拉黑官方帐号"),
    COMMUNITY_BE_BLOCKED_OPERATION_NOT_ALLOW(250018, "由于对方设置，你无法执行操作"),
    COMMUNITY_BLOCK_OPERATION_NOT_ALLOW(250019, "由于你设置，你无法执行操作");

    private final int code;

    @NotNull
    private final String message;

    CommunityErrorCode(int i, String str) {
        this.code = i;
        this.message = str;
    }

    public final int getCode() {
        return this.code;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }
}
