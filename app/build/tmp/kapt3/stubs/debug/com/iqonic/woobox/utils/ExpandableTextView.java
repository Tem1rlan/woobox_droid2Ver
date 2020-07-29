package com.iqonic.woobox.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nB\'\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u00a2\u0006\u0002\u0010\fJ\b\u00105\u001a\u000206H\u0002J\b\u00107\u001a\u000206H\u0002J\u0012\u00108\u001a\u0002062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J\u0006\u00109\u001a\u000206J\u0006\u0010:\u001a\u000206J\u0006\u0010;\u001a\u00020\tJ\b\u0010<\u001a\u00020\tH\u0002J\u0006\u0010=\u001a\u00020\tJ\u0012\u0010>\u001a\u0002062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J\u000e\u0010?\u001a\u0002062\u0006\u0010\u0013\u001a\u00020\u0014J\u0010\u0010@\u001a\u0002062\b\u0010A\u001a\u0004\u0018\u00010BJ\u000e\u0010C\u001a\u0002062\u0006\u0010\u001c\u001a\u00020\tJ\u000e\u0010D\u001a\u0002062\u0006\u0010\u001d\u001a\u00020\u0014J\u000e\u0010E\u001a\u0002062\u0006\u0010F\u001a\u00020\u0014J\u000e\u0010G\u001a\u0002062\u0006\u0010H\u001a\u00020\u001fJ\u000e\u0010I\u001a\u0002062\u0006\u0010J\u001a\u00020\tJ\u000e\u0010K\u001a\u0002062\u0006\u0010L\u001a\u00020\tJ\u000e\u0010M\u001a\u0002062\u0006\u0010N\u001a\u00020\tJ\u000e\u0010O\u001a\u0002062\u0006\u0010P\u001a\u00020QJ\u000e\u0010R\u001a\u0002062\u0006\u0010J\u001a\u00020\tJ\u000e\u0010S\u001a\u0002062\u0006\u0010L\u001a\u00020\tJ\u001a\u0010T\u001a\u0002062\b\u0010U\u001a\u0004\u0018\u00010\u00172\u0006\u0010V\u001a\u00020\tH\u0002J\u0006\u0010W\u001a\u000206J\u0010\u0010W\u001a\u0002062\u0006\u0010:\u001a\u00020\u001fH\u0002R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001f@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R$\u0010#\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u001f@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010!\"\u0004\b$\u0010%R\u0010\u0010&\u001a\u0004\u0018\u00010\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\'\u001a\u0004\u0018\u00010(X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010)\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001c\u0010.\u001a\u0004\u0018\u00010\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0019\"\u0004\b0\u0010\u001bR$\u00101\u001a\u00020\t2\u0006\u00101\u001a\u00020\t@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010+\"\u0004\b3\u0010-R\u000e\u00104\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006X"}, d2 = {"Lcom/iqonic/woobox/utils/ExpandableTextView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "animationDuration", "", "getAnimationDuration", "()J", "setAnimationDuration", "(J)V", "collapseInterpolator", "Landroid/animation/TimeInterpolator;", "collapsedHeight", "content", "Landroid/widget/TextView;", "getContent", "()Landroid/widget/TextView;", "setContent", "(Landroid/widget/TextView;)V", "contentTextStyle", "expandInterpolator", "<set-?>", "", "isDefaultExpand", "()Z", "moreLessShow", "isMoreLessShow", "setMoreLessShow", "(Z)V", "mContext", "mMainLayout", "Landroid/view/View;", "maxLine", "getMaxLine", "()I", "setMaxLine", "(I)V", "moreLess", "getMoreLess", "setMoreLess", "moreLessGravity", "getMoreLessGravity", "setMoreLessGravity", "moreLessTextStyle", "applyMoreLessStyle", "", "applyStyle", "applyXmlAttributes", "collapse", "expand", "getContentTextStyle", "getID", "getMoreLessTextStyle", "init", "setCollapseInterpolator", "setContentClick", "listener", "Landroid/view/View$OnClickListener;", "setContentTextStyle", "setExpandInterpolator", "setInterpolator", "interpolator", "setMoreLessAllCaps", "allCaps", "setMoreLessColor", "color", "setMoreLessTextSize", "size", "setMoreLessTextStyle", "textStyle", "setText", "text", "", "setTextColor", "setTextSize", "setTypeface", "textView", "testStyle", "toggle", "app_debug"})
public final class ExpandableTextView extends android.widget.LinearLayout {
    private android.view.View mMainLayout;
    @org.jetbrains.annotations.Nullable()
    private android.widget.TextView content;
    @org.jetbrains.annotations.Nullable()
    private android.widget.TextView moreLess;
    private int maxLine;
    private int collapsedHeight;
    private android.animation.TimeInterpolator expandInterpolator;
    private android.animation.TimeInterpolator collapseInterpolator;
    
    /**
     * Sets the duration of the expand / collapse animation.
     *
     * @param animationDuration duration in milliseconds.
     */
    private long animationDuration;
    private int moreLessGravity;
    
    /**
     * Options
     */
    private boolean isMoreLessShow;
    private int moreLessTextStyle;
    private int contentTextStyle;
    private boolean isDefaultExpand;
    private android.content.Context mContext;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.TextView getContent() {
        return null;
    }
    
    public final void setContent(@org.jetbrains.annotations.Nullable()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.TextView getMoreLess() {
        return null;
    }
    
    public final void setMoreLess(@org.jetbrains.annotations.Nullable()
    android.widget.TextView p0) {
    }
    
    public final int getMaxLine() {
        return 0;
    }
    
    public final void setMaxLine(int p0) {
    }
    
    public final long getAnimationDuration() {
        return 0L;
    }
    
    public final void setAnimationDuration(long p0) {
    }
    
    public final int getMoreLessGravity() {
        return 0;
    }
    
    public final void setMoreLessGravity(int moreLessGravity) {
    }
    
    public final boolean isMoreLessShow() {
        return false;
    }
    
    public final void setMoreLessShow(boolean moreLessShow) {
    }
    
    public final boolean isDefaultExpand() {
        return false;
    }
    
    private final int getID() {
        return 0;
    }
    
    private final void init(android.util.AttributeSet attrs) {
    }
    
    private final void applyXmlAttributes(android.util.AttributeSet attrs) {
    }
    
    public final void toggle() {
    }
    
    private final void toggle(boolean expand) {
    }
    
    public final void setText(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
    
    /**
     * Expand this [TextView].
     *
     * @return true if expanded, false otherwise.
     */
    public final void expand() {
    }
    
    /**
     * Collapse this [TextView].
     *
     * @return true if collapsed, false otherwise.
     */
    public final void collapse() {
    }
    
    /**
     * Sets a [TimeInterpolator] for expanding and collapsing.
     *
     * @param interpolator the interpolator
     */
    public final void setInterpolator(@org.jetbrains.annotations.NotNull()
    android.animation.TimeInterpolator interpolator) {
    }
    
    /**
     * Sets a [TimeInterpolator] for expanding.
     *
     * @param expandInterpolator the interpolator
     */
    public final void setExpandInterpolator(@org.jetbrains.annotations.NotNull()
    android.animation.TimeInterpolator expandInterpolator) {
    }
    
    /**
     * Sets a [TimeInterpolator] for collpasing.
     *
     * @param collapseInterpolator the interpolator
     */
    public final void setCollapseInterpolator(@org.jetbrains.annotations.NotNull()
    android.animation.TimeInterpolator collapseInterpolator) {
    }
    
    public final int getMoreLessTextStyle() {
        return 0;
    }
    
    public final void setMoreLessTextStyle(int textStyle) {
    }
    
    private final void applyMoreLessStyle() {
    }
    
    private final void setTypeface(android.widget.TextView textView, int testStyle) {
    }
    
    private final void applyStyle() {
    }
    
    public final int getContentTextStyle() {
        return 0;
    }
    
    public final void setContentTextStyle(int contentTextStyle) {
    }
    
    public final void setTextColor(int color) {
    }
    
    public final void setMoreLessColor(int color) {
    }
    
    public final void setMoreLessTextSize(int size) {
    }
    
    public final void setTextSize(int size) {
    }
    
    public final void setMoreLessAllCaps(boolean allCaps) {
    }
    
    public final void setContentClick(@org.jetbrains.annotations.Nullable()
    android.view.View.OnClickListener listener) {
    }
    
    public ExpandableTextView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    public ExpandableTextView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public ExpandableTextView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    @androidx.annotation.RequiresApi(api = android.os.Build.VERSION_CODES.LOLLIPOP)
    public ExpandableTextView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(null);
    }
}