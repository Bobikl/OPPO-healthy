package com.example.opponotificationrelay;

/** 事件驱动：安静不等于过期，管道断开才使订阅失效；离线须二次确认。 */
public final class HandoverPolicy {
    public enum Presence { ONLINE, OFFLINE, UNKNOWN }
    public static final long QUIET_MS = 9000;
    private Presence presence = Presence.UNKNOWN;
    private boolean channel;
    private long offlineSince = -1, revision, confirmedRevision = -1;
    public synchronized void open() { channel = true; invalidate(); }
    public synchronized void close() { channel = false; invalidate(); }
    private void invalidate() {
        presence = Presence.UNKNOWN; offlineSince = -1; confirmedRevision = -1; revision++;
    }
    public synchronized void sample(Presence value, long now) {
        if (!channel) return;
        if (value == Presence.UNKNOWN) { invalidate(); return; }
        if (presence != value) {
            revision++; confirmedRevision = -1;
            offlineSince = value == Presence.OFFLINE ? now : -1;
        }
        presence = value;
    }
    public synchronized Presence presence() { return presence; }
    public synchronized long revision() { return revision; }
    public synchronized long remaining(long now) {
        return channel && presence == Presence.OFFLINE && offlineSince >= 0
            ? Math.max(0, QUIET_MS - (now - offlineSince)) : -1;
    }
    public synchronized boolean needsConfirmation(long now) {
        return remaining(now) == 0 && confirmedRevision != revision;
    }
    public synchronized boolean confirmOffline(long expectedRevision, long now) {
        if (revision != expectedRevision || !needsConfirmation(now)) return false;
        confirmedRevision = revision;
        return true;
    }
    public synchronized boolean canOwn(long now) {
        return channel && presence == Presence.OFFLINE && remaining(now) == 0 && confirmedRevision == revision;
    }
    public synchronized String reason(long now) {
        if (!channel || presence == Presence.UNKNOWN) return "官方状态未知，已暂停接管";
        if (presence == Presence.ONLINE) return "OPPO 健康正在运行，已让出手表通道";
        if (remaining(now) > 0) return "官方已退出，等待 9 秒稳定窗口后再次确认";
        if (!canOwn(now)) return "正在再次确认官方已退出，暂不接管";
        return "官方已退出，独立版接管";
    }
}
