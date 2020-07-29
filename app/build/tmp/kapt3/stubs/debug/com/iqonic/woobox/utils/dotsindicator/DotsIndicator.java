package com.iqonic.woobox.utils.dotsindicator;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0017\u0018\u0000 22\u00020\u0001:\u000223B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\"\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u000b2\b\b\u0001\u0010\u001f\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\bH\u0002J\u0010\u0010!\u001a\u00020\u001d2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bJ\b\u0010\"\u001a\u00020\bH\u0002J\u0010\u0010#\u001a\n $*\u0004\u0018\u00010\b0\bH\u0002J\b\u0010%\u001a\u00020\u001dH\u0002J\u0010\u0010%\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020\u000bH\u0002J\b\u0010\'\u001a\u00020\u000bH\u0002J\u0010\u0010(\u001a\u00020\u001d2\u0006\u0010)\u001a\u00020\u000bH\u0002J\b\u0010*\u001a\u00020\u001dH\u0002J\u001a\u0010+\u001a\u00020\u001d2\b\b\u0001\u0010,\u001a\u00020\u000b2\b\b\u0003\u0010-\u001a\u00020\u000bJ\u0010\u0010.\u001a\u00020\u001d2\b\b\u0001\u0010/\u001a\u00020\u000bJ\u0010\u00100\u001a\u00020\u001d2\b\b\u0001\u00101\u001a\u00020\u000bR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00064"}, d2 = {"Lcom/iqonic/woobox/utils/dotsindicator/DotsIndicator;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "animatorIn", "Landroid/animation/Animator;", "animatorOut", "animatorResId", "", "animatorReverseResId", "backgroundResId", "dotTint", "immediateAnimatorIn", "immediateAnimatorOut", "indicatorBackgroundResId", "indicatorHeight", "indicatorMargin", "indicatorUnselectedBackgroundResId", "indicatorWidth", "internalPageChangeListener", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "lastPosition", "unselectedBackgroundId", "viewPager", "Landroidx/viewpager/widget/ViewPager;", "addIndicator", "", "orientation", "drawableRes", "animator", "attachViewPager", "createAnimatorIn", "createAnimatorOut", "kotlin.jvm.PlatformType", "createIndicators", "count", "currentItem", "internalPageSelected", "position", "invalidateDots", "setDotDrawable", "indicatorRes", "unselectedIndicatorRes", "setDotTint", "tint", "setDotTintRes", "tintRes", "Companion", "ReverseInterpolator", "app_debug"})
public final class DotsIndicator extends android.widget.LinearLayout {
    private androidx.viewpager.widget.ViewPager viewPager;
    private int indicatorMargin;
    private int indicatorWidth;
    private int indicatorHeight;
    private int indicatorBackgroundResId;
    private int indicatorUnselectedBackgroundResId;
    private android.animation.Animator animatorOut;
    private android.animation.Animator animatorIn;
    private android.animation.Animator immediateAnimatorOut;
    private android.animation.Animator immediateAnimatorIn;
    private int lastPosition;
    private int animatorResId;
    private int animatorReverseResId;
    private int backgroundResId;
    private int unselectedBackgroundId;
    private int dotTint;
    private final androidx.viewpager.widget.ViewPager.OnPageChangeListener internalPageChangeListener = null;
    private static final int DEFAULT_INDICATOR_WIDTH = 5;
    public static final com.iqonic.woobox.utils.dotsindicator.DotsIndicator.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    public final void setDotDrawable(@androidx.annotation.DrawableRes()
    int indicatorRes, @androidx.annotation.DrawableRes()
    int unselectedIndicatorRes) {
    }
    
    public final void setDotTint(@androidx.annotation.ColorInt()
    int tint) {
    }
    
    public final void setDotTintRes(@androidx.annotation.ColorRes()
    int tintRes) {
    }
    
    public final void attachViewPager(@org.jetbrains.annotations.Nullable()
    androidx.viewpager.widget.ViewPager viewPager) {
    }
    
    private final void invalidateDots() {
    }
    
    private final void createIndicators(int count) {
    }
    
    private final void internalPageSelected(int position) {
    }
    
    private final void createIndicators() {
    }
    
    private final void addIndicator(int orientation, @androidx.annotation.DrawableRes()
    int drawableRes, android.animation.Animator animator) {
    }
    
    private final android.animation.Animator createAnimatorOut() {
        return null;
    }
    
    private final android.animation.Animator createAnimatorIn() {
        return null;
    }
    
    private final int currentItem() {
        return 0;
    }
    
    public DotsIndicator(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a8\u0006\u0006"}, d2 = {"Lcom/iqonic/woobox/utils/dotsindicator/DotsIndicator$ReverseInterpolator;", "Landroid/view/animation/Interpolator;", "(Lcom/iqonic/woobox/utils/dotsindicator/DotsIndicator;)V", "getInterpolation", "", "value", "app_debug"})
    final class ReverseInterpolator implements android.view.animation.Interpolator {
        
        @java.lang.Override()
        public float getInterpolation(float value) {
            return 0.0F;
        }
        
        public ReverseInterpolator() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/iqonic/woobox/utils/dotsindicator/DotsIndicator$Companion;", "", "()V", "DEFAULT_INDICATOR_WIDTH", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}