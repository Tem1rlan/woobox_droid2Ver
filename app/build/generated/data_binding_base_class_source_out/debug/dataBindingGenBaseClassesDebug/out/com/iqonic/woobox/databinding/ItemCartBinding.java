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
import com.iqonic.woobox.models.CartResponse;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemCartBinding extends ViewDataBinding {
  @NonNull
  public final TextView edtQty;

  @NonNull
  public final ImageView ivDecreaseQuantity;

  @NonNull
  public final ImageView ivIncreaseQuantity;

  @NonNull
  public final ImageView ivProduct;

  @NonNull
  public final LinearLayout llButton;

  @NonNull
  public final LinearLayout llMoveTocart;

  @NonNull
  public final LinearLayout llRemove;

  @NonNull
  public final LinearLayout rlContent;

  @NonNull
  public final TextView tvOriginalPrice;

  @NonNull
  public final TextView tvPrice;

  @NonNull
  public final TextView tvProductName;

  @Bindable
  protected CartResponse mModel;

  @Bindable
  protected BaseRecyclerAdapter.OnClickListener mCallback;

  protected ItemCartBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView edtQty, ImageView ivDecreaseQuantity, ImageView ivIncreaseQuantity,
      ImageView ivProduct, LinearLayout llButton, LinearLayout llMoveTocart, LinearLayout llRemove,
      LinearLayout rlContent, TextView tvOriginalPrice, TextView tvPrice, TextView tvProductName) {
    super(_bindingComponent, _root, _localFieldCount);
    this.edtQty = edtQty;
    this.ivDecreaseQuantity = ivDecreaseQuantity;
    this.ivIncreaseQuantity = ivIncreaseQuantity;
    this.ivProduct = ivProduct;
    this.llButton = llButton;
    this.llMoveTocart = llMoveTocart;
    this.llRemove = llRemove;
    this.rlContent = rlContent;
    this.tvOriginalPrice = tvOriginalPrice;
    this.tvPrice = tvPrice;
    this.tvProductName = tvProductName;
  }

  public abstract void setModel(@Nullable CartResponse model);

  @Nullable
  public CartResponse getModel() {
    return mModel;
  }

  public abstract void setCallback(@Nullable BaseRecyclerAdapter.OnClickListener callback);

  @Nullable
  public BaseRecyclerAdapter.OnClickListener getCallback() {
    return mCallback;
  }

  @NonNull
  public static ItemCartBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_cart, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemCartBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemCartBinding>inflateInternal(inflater, R.layout.item_cart, root, attachToRoot, component);
  }

  @NonNull
  public static ItemCartBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_cart, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemCartBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemCartBinding>inflateInternal(inflater, R.layout.item_cart, null, false, component);
  }

  public static ItemCartBinding bind(@NonNull View view) {
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
  public static ItemCartBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemCartBinding)bind(component, view, R.layout.item_cart);
  }
}
