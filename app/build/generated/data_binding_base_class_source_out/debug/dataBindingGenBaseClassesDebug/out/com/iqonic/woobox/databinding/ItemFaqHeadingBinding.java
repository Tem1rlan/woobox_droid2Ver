// Generated by data binding compiler. Do not edit!
package com.iqonic.woobox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.iqonic.woobox.R;
import com.iqonic.woobox.base.BaseRecyclerAdapter;
import com.iqonic.woobox.models.Category;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemFaqHeadingBinding extends ViewDataBinding {
  @NonNull
  public final TextView tvCategory;

  @Bindable
  protected Category mModel;

  @Bindable
  protected BaseRecyclerAdapter.OnClickListener mCallback;

  protected ItemFaqHeadingBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView tvCategory) {
    super(_bindingComponent, _root, _localFieldCount);
    this.tvCategory = tvCategory;
  }

  public abstract void setModel(@Nullable Category model);

  @Nullable
  public Category getModel() {
    return mModel;
  }

  public abstract void setCallback(@Nullable BaseRecyclerAdapter.OnClickListener callback);

  @Nullable
  public BaseRecyclerAdapter.OnClickListener getCallback() {
    return mCallback;
  }

  @NonNull
  public static ItemFaqHeadingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_faq_heading, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemFaqHeadingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemFaqHeadingBinding>inflateInternal(inflater, R.layout.item_faq_heading, root, attachToRoot, component);
  }

  @NonNull
  public static ItemFaqHeadingBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_faq_heading, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemFaqHeadingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemFaqHeadingBinding>inflateInternal(inflater, R.layout.item_faq_heading, null, false, component);
  }

  public static ItemFaqHeadingBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ItemFaqHeadingBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemFaqHeadingBinding)bind(component, view, R.layout.item_faq_heading);
  }
}
