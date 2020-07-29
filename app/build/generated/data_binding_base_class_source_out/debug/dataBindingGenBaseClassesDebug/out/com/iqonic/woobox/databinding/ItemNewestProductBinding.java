// Generated by data binding compiler. Do not edit!
package com.iqonic.woobox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.iqonic.woobox.R;
import com.iqonic.woobox.base.BaseRecyclerAdapter;
import com.iqonic.woobox.models.ProductDataNew;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemNewestProductBinding extends ViewDataBinding {
  @NonNull
  public final ImageView ivDislike;

  @NonNull
  public final ImageView ivProduct;

  @NonNull
  public final ImageView ivlike;

  @NonNull
  public final LinearLayout listProductRaw;

  @NonNull
  public final LinearLayout llProductColor;

  @NonNull
  public final LinearLayout llProductSize;

  @NonNull
  public final TextView tvProductActualPrice;

  @NonNull
  public final TextView tvProductName;

  @NonNull
  public final TextView tvProductPrice;

  @NonNull
  public final TextView tvProductRate;

  @NonNull
  public final TextView tvSize;

  @Bindable
  protected ProductDataNew mModel;

  @Bindable
  protected BaseRecyclerAdapter.OnClickListener mCallback;

  protected ItemNewestProductBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView ivDislike, ImageView ivProduct, ImageView ivlike, LinearLayout listProductRaw,
      LinearLayout llProductColor, LinearLayout llProductSize, TextView tvProductActualPrice,
      TextView tvProductName, TextView tvProductPrice, TextView tvProductRate, TextView tvSize) {
    super(_bindingComponent, _root, _localFieldCount);
    this.ivDislike = ivDislike;
    this.ivProduct = ivProduct;
    this.ivlike = ivlike;
    this.listProductRaw = listProductRaw;
    this.llProductColor = llProductColor;
    this.llProductSize = llProductSize;
    this.tvProductActualPrice = tvProductActualPrice;
    this.tvProductName = tvProductName;
    this.tvProductPrice = tvProductPrice;
    this.tvProductRate = tvProductRate;
    this.tvSize = tvSize;
  }

  public abstract void setModel(@Nullable ProductDataNew model);

  @Nullable
  public ProductDataNew getModel() {
    return mModel;
  }

  public abstract void setCallback(@Nullable BaseRecyclerAdapter.OnClickListener callback);

  @Nullable
  public BaseRecyclerAdapter.OnClickListener getCallback() {
    return mCallback;
  }

  @NonNull
  public static ItemNewestProductBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_newest_product, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemNewestProductBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemNewestProductBinding>inflateInternal(inflater, R.layout.item_newest_product, root, attachToRoot, component);
  }

  @NonNull
  public static ItemNewestProductBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_newest_product, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemNewestProductBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemNewestProductBinding>inflateInternal(inflater, R.layout.item_newest_product, null, false, component);
  }

  public static ItemNewestProductBinding bind(@NonNull View view) {
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
  public static ItemNewestProductBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemNewestProductBinding)bind(component, view, R.layout.item_newest_product);
  }
}