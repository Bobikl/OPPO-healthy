package com.example.opponotificationrelay;

/** 经过标准 NotificationListenerService 归一化后的通知事件。 */
public final class RelayEvent {
    public final boolean removed;
    public final int id;
    public final String tag;
    public final String key;
    public final String packageName;
    public final String appName;
    public final String title;
    public final String content;
    public final String subContent;
    public final long postTime;
    public final long whenTimeMillis;
    public final int notificationFlags;
    public final String group;
    public final String groupKey;
    public final boolean isGroupSummary;
    public final boolean isWorkProfile;
    public final boolean isInterruptible;
    public final boolean shouldOnlyAlertOnce;
    public final int groupAlertBehavior;
    public final boolean hasRemoteInput;

    private RelayEvent(
            boolean removed,
            int id,
            String tag,
            String key,
            String packageName,
            String appName,
            String title,
            String content,
            String subContent,
            long postTime,
            long whenTimeMillis,
            int notificationFlags,
            String group,
            String groupKey,
            boolean isGroupSummary,
            boolean isWorkProfile,
            boolean isInterruptible,
            boolean shouldOnlyAlertOnce,
            int groupAlertBehavior,
            boolean hasRemoteInput) {
        this.removed = removed;
        this.id = id;
        this.tag = MessageBudget.identifier(tag,1024);
        this.key = MessageBudget.identifier(key,MessageBudget.MAX_IDENTIFIER_BYTES);
        this.packageName = MessageBudget.identifier(packageName,256);
        this.appName = MessageBudget.text(appName,MessageBudget.MAX_LABEL_BYTES);
        this.title = MessageBudget.text(title,MessageBudget.MAX_TITLE_BYTES);
        this.content = MessageBudget.text(content,MessageBudget.MAX_BODY_BYTES);
        this.subContent = MessageBudget.text(subContent,MessageBudget.MAX_SUB_BYTES);
        this.postTime = postTime;
        this.whenTimeMillis = whenTimeMillis != 0L ? whenTimeMillis : postTime;
        this.notificationFlags = notificationFlags;
        this.group = MessageBudget.identifier(group,1024);
        this.groupKey = MessageBudget.identifier(groupKey,MessageBudget.MAX_IDENTIFIER_BYTES);
        this.isGroupSummary = isGroupSummary;
        this.isWorkProfile = isWorkProfile;
        this.isInterruptible = isInterruptible;
        this.shouldOnlyAlertOnce = shouldOnlyAlertOnce;
        this.groupAlertBehavior = groupAlertBehavior;
        this.hasRemoteInput = hasRemoteInput;
    }

    public static RelayEvent posted(
            int id,
            String tag,
            String key,
            String packageName,
            String appName,
            String title,
            String content,
            String subContent,
            long postTime,
            boolean hasRemoteInput) {
        String normalizedTitle = safe(title);
        String normalizedContent = safe(content);
        if (normalizedTitle.length() > 0 && normalizedContent.length() == 0) {
            normalizedContent = normalizedTitle;
        }
        if (normalizedTitle.length() == 0 && normalizedContent.length() > 0) {
            normalizedTitle = normalizedContent;
        }
        return new RelayEvent(false, id, tag, key, packageName, appName,
                normalizedTitle, normalizedContent, subContent, postTime, postTime,
                0, "", "", false, false, true, false, 0, hasRemoteInput);
    }

    public static RelayEvent posted(
            int id,
            String tag,
            String key,
            String packageName,
            String appName,
            String title,
            String content,
            String subContent,
            long postTime,
            long whenTimeMillis,
            int notificationFlags,
            String group,
            String groupKey,
            boolean isGroupSummary,
            boolean isWorkProfile,
            boolean isInterruptible,
            boolean shouldOnlyAlertOnce,
            int groupAlertBehavior,
            boolean hasRemoteInput) {
        String normalizedTitle = safe(title);
        String normalizedContent = safe(content);
        if (normalizedTitle.length() > 0 && normalizedContent.length() == 0) {
            normalizedContent = normalizedTitle;
        }
        if (normalizedTitle.length() == 0 && normalizedContent.length() > 0) {
            normalizedTitle = normalizedContent;
        }
        return new RelayEvent(false, id, tag, key, packageName, appName,
                normalizedTitle, normalizedContent, subContent, postTime, whenTimeMillis,
                notificationFlags, group, groupKey, isGroupSummary, isWorkProfile,
                isInterruptible, shouldOnlyAlertOnce, groupAlertBehavior, hasRemoteInput);
    }

    public RelayEvent withAppName(String name) {
        return new RelayEvent(removed,id,tag,key,packageName,name,title,content,subContent,postTime,whenTimeMillis,
            notificationFlags,group,groupKey,isGroupSummary,isWorkProfile,isInterruptible,shouldOnlyAlertOnce,groupAlertBehavior,hasRemoteInput);
    }
    public long retainedBytes() {
        return 192L+2L*(tag.length()+key.length()+packageName.length()+appName.length()+title.length()+content.length()
            +subContent.length()+group.length()+groupKey.length());
    }
    public static RelayEvent removed(int id, String tag, String key, String packageName) {
        return new RelayEvent(true, id, tag, key, packageName, "", "", "", "", 0L,
                0L, 0, "", "", false, false, false, false, 0, false);
    }

    private static String safe(String value) {
        return value == null ? "" : value;
    }
}
