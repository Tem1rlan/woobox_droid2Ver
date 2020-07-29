package com.iqonic.woobox;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.iqonic.woobox.databinding.ActivityProductDetailBindingImpl;
import com.iqonic.woobox.databinding.FragmentItemreviewBindingImpl;
import com.iqonic.woobox.databinding.ItemAddressBindingImpl;
import com.iqonic.woobox.databinding.ItemAddressNewBindingImpl;
import com.iqonic.woobox.databinding.ItemBlogBindingImpl;
import com.iqonic.woobox.databinding.ItemCartBindingImpl;
import com.iqonic.woobox.databinding.ItemCategory2BindingImpl;
import com.iqonic.woobox.databinding.ItemCategory3BindingImpl;
import com.iqonic.woobox.databinding.ItemCategoryBindingImpl;
import com.iqonic.woobox.databinding.ItemColorBindingImpl;
import com.iqonic.woobox.databinding.ItemFaqHeadingBindingImpl;
import com.iqonic.woobox.databinding.ItemFaqSubheadingBindingImpl;
import com.iqonic.woobox.databinding.ItemFilterBrandBindingImpl;
import com.iqonic.woobox.databinding.ItemFilterCategoryBindingImpl;
import com.iqonic.woobox.databinding.ItemFilterDiscountBindingImpl;
import com.iqonic.woobox.databinding.ItemHomeNewestProductBindingImpl;
import com.iqonic.woobox.databinding.ItemNavigationCategoryBindingImpl;
import com.iqonic.woobox.databinding.ItemNavigationSubcategoryBindingImpl;
import com.iqonic.woobox.databinding.ItemNewestProductBindingImpl;
import com.iqonic.woobox.databinding.ItemOrderBindingImpl;
import com.iqonic.woobox.databinding.ItemOrderlistBindingImpl;
import com.iqonic.woobox.databinding.ItemProductBindingImpl;
import com.iqonic.woobox.databinding.ItemReviewBindingImpl;
import com.iqonic.woobox.databinding.ItemRewardBindingImpl;
import com.iqonic.woobox.databinding.ItemSizeBindingImpl;
import com.iqonic.woobox.databinding.ItemTrackBindingImpl;
import com.iqonic.woobox.databinding.ItemUserAddressBindingImpl;
import com.iqonic.woobox.databinding.ItemViewproductgridBindingImpl;
import com.iqonic.woobox.databinding.ItemWishlistBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYPRODUCTDETAIL = 1;

  private static final int LAYOUT_FRAGMENTITEMREVIEW = 2;

  private static final int LAYOUT_ITEMADDRESS = 3;

  private static final int LAYOUT_ITEMADDRESSNEW = 4;

  private static final int LAYOUT_ITEMBLOG = 5;

  private static final int LAYOUT_ITEMCART = 6;

  private static final int LAYOUT_ITEMCATEGORY = 7;

  private static final int LAYOUT_ITEMCATEGORY2 = 8;

  private static final int LAYOUT_ITEMCATEGORY3 = 9;

  private static final int LAYOUT_ITEMCOLOR = 10;

  private static final int LAYOUT_ITEMFAQHEADING = 11;

  private static final int LAYOUT_ITEMFAQSUBHEADING = 12;

  private static final int LAYOUT_ITEMFILTERBRAND = 13;

  private static final int LAYOUT_ITEMFILTERCATEGORY = 14;

  private static final int LAYOUT_ITEMFILTERDISCOUNT = 15;

  private static final int LAYOUT_ITEMHOMENEWESTPRODUCT = 16;

  private static final int LAYOUT_ITEMNAVIGATIONCATEGORY = 17;

  private static final int LAYOUT_ITEMNAVIGATIONSUBCATEGORY = 18;

  private static final int LAYOUT_ITEMNEWESTPRODUCT = 19;

  private static final int LAYOUT_ITEMORDER = 20;

  private static final int LAYOUT_ITEMORDERLIST = 21;

  private static final int LAYOUT_ITEMPRODUCT = 22;

  private static final int LAYOUT_ITEMREVIEW = 23;

  private static final int LAYOUT_ITEMREWARD = 24;

  private static final int LAYOUT_ITEMSIZE = 25;

  private static final int LAYOUT_ITEMTRACK = 26;

  private static final int LAYOUT_ITEMUSERADDRESS = 27;

  private static final int LAYOUT_ITEMVIEWPRODUCTGRID = 28;

  private static final int LAYOUT_ITEMWISHLIST = 29;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(29);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.iqonic.woobox.R.layout.activity_product_detail, LAYOUT_ACTIVITYPRODUCTDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.iqonic.woobox.R.layout.fragment_itemreview, LAYOUT_FRAGMENTITEMREVIEW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.iqonic.woobox.R.layout.item_address, LAYOUT_ITEMADDRESS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.iqonic.woobox.R.layout.item_address_new, LAYOUT_ITEMADDRESSNEW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.iqonic.woobox.R.layout.item_blog, LAYOUT_ITEMBLOG);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.iqonic.woobox.R.layout.item_cart, LAYOUT_ITEMCART);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.iqonic.woobox.R.layout.item_category, LAYOUT_ITEMCATEGORY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.iqonic.woobox.R.layout.item_category_2, LAYOUT_ITEMCATEGORY2);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.iqonic.woobox.R.layout.item_category_3, LAYOUT_ITEMCATEGORY3);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.iqonic.woobox.R.layout.item_color, LAYOUT_ITEMCOLOR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.iqonic.woobox.R.layout.item_faq_heading, LAYOUT_ITEMFAQHEADING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.iqonic.woobox.R.layout.item_faq_subheading, LAYOUT_ITEMFAQSUBHEADING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.iqonic.woobox.R.layout.item_filter_brand, LAYOUT_ITEMFILTERBRAND);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.iqonic.woobox.R.layout.item_filter_category, LAYOUT_ITEMFILTERCATEGORY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.iqonic.woobox.R.layout.item_filter_discount, LAYOUT_ITEMFILTERDISCOUNT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.iqonic.woobox.R.layout.item_home_newest_product, LAYOUT_ITEMHOMENEWESTPRODUCT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.iqonic.woobox.R.layout.item_navigation_category, LAYOUT_ITEMNAVIGATIONCATEGORY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.iqonic.woobox.R.layout.item_navigation_subcategory, LAYOUT_ITEMNAVIGATIONSUBCATEGORY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.iqonic.woobox.R.layout.item_newest_product, LAYOUT_ITEMNEWESTPRODUCT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.iqonic.woobox.R.layout.item_order, LAYOUT_ITEMORDER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.iqonic.woobox.R.layout.item_orderlist, LAYOUT_ITEMORDERLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.iqonic.woobox.R.layout.item_product, LAYOUT_ITEMPRODUCT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.iqonic.woobox.R.layout.item_review, LAYOUT_ITEMREVIEW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.iqonic.woobox.R.layout.item_reward, LAYOUT_ITEMREWARD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.iqonic.woobox.R.layout.item_size, LAYOUT_ITEMSIZE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.iqonic.woobox.R.layout.item_track, LAYOUT_ITEMTRACK);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.iqonic.woobox.R.layout.item_user_address, LAYOUT_ITEMUSERADDRESS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.iqonic.woobox.R.layout.item_viewproductgrid, LAYOUT_ITEMVIEWPRODUCTGRID);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.iqonic.woobox.R.layout.item_wishlist, LAYOUT_ITEMWISHLIST);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYPRODUCTDETAIL: {
          if ("layout/activity_product_detail_0".equals(tag)) {
            return new ActivityProductDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_product_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTITEMREVIEW: {
          if ("layout/fragment_itemreview_0".equals(tag)) {
            return new FragmentItemreviewBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_itemreview is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMADDRESS: {
          if ("layout/item_address_0".equals(tag)) {
            return new ItemAddressBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_address is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMADDRESSNEW: {
          if ("layout/item_address_new_0".equals(tag)) {
            return new ItemAddressNewBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_address_new is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMBLOG: {
          if ("layout/item_blog_0".equals(tag)) {
            return new ItemBlogBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_blog is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMCART: {
          if ("layout/item_cart_0".equals(tag)) {
            return new ItemCartBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_cart is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMCATEGORY: {
          if ("layout/item_category_0".equals(tag)) {
            return new ItemCategoryBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_category is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMCATEGORY2: {
          if ("layout/item_category_2_0".equals(tag)) {
            return new ItemCategory2BindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_category_2 is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMCATEGORY3: {
          if ("layout/item_category_3_0".equals(tag)) {
            return new ItemCategory3BindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_category_3 is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMCOLOR: {
          if ("layout/item_color_0".equals(tag)) {
            return new ItemColorBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_color is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMFAQHEADING: {
          if ("layout/item_faq_heading_0".equals(tag)) {
            return new ItemFaqHeadingBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_faq_heading is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMFAQSUBHEADING: {
          if ("layout/item_faq_subheading_0".equals(tag)) {
            return new ItemFaqSubheadingBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_faq_subheading is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMFILTERBRAND: {
          if ("layout/item_filter_brand_0".equals(tag)) {
            return new ItemFilterBrandBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_filter_brand is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMFILTERCATEGORY: {
          if ("layout/item_filter_category_0".equals(tag)) {
            return new ItemFilterCategoryBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_filter_category is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMFILTERDISCOUNT: {
          if ("layout/item_filter_discount_0".equals(tag)) {
            return new ItemFilterDiscountBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_filter_discount is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMHOMENEWESTPRODUCT: {
          if ("layout/item_home_newest_product_0".equals(tag)) {
            return new ItemHomeNewestProductBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_home_newest_product is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMNAVIGATIONCATEGORY: {
          if ("layout/item_navigation_category_0".equals(tag)) {
            return new ItemNavigationCategoryBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_navigation_category is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMNAVIGATIONSUBCATEGORY: {
          if ("layout/item_navigation_subcategory_0".equals(tag)) {
            return new ItemNavigationSubcategoryBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_navigation_subcategory is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMNEWESTPRODUCT: {
          if ("layout/item_newest_product_0".equals(tag)) {
            return new ItemNewestProductBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_newest_product is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMORDER: {
          if ("layout/item_order_0".equals(tag)) {
            return new ItemOrderBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_order is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMORDERLIST: {
          if ("layout/item_orderlist_0".equals(tag)) {
            return new ItemOrderlistBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_orderlist is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMPRODUCT: {
          if ("layout/item_product_0".equals(tag)) {
            return new ItemProductBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_product is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMREVIEW: {
          if ("layout/item_review_0".equals(tag)) {
            return new ItemReviewBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_review is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMREWARD: {
          if ("layout/item_reward_0".equals(tag)) {
            return new ItemRewardBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_reward is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMSIZE: {
          if ("layout/item_size_0".equals(tag)) {
            return new ItemSizeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_size is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMTRACK: {
          if ("layout/item_track_0".equals(tag)) {
            return new ItemTrackBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_track is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMUSERADDRESS: {
          if ("layout/item_user_address_0".equals(tag)) {
            return new ItemUserAddressBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_user_address is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMVIEWPRODUCTGRID: {
          if ("layout/item_viewproductgrid_0".equals(tag)) {
            return new ItemViewproductgridBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_viewproductgrid is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMWISHLIST: {
          if ("layout/item_wishlist_0".equals(tag)) {
            return new ItemWishlistBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_wishlist is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(4);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "callback");
      sKeys.put(2, "model");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(29);

    static {
      sKeys.put("layout/activity_product_detail_0", com.iqonic.woobox.R.layout.activity_product_detail);
      sKeys.put("layout/fragment_itemreview_0", com.iqonic.woobox.R.layout.fragment_itemreview);
      sKeys.put("layout/item_address_0", com.iqonic.woobox.R.layout.item_address);
      sKeys.put("layout/item_address_new_0", com.iqonic.woobox.R.layout.item_address_new);
      sKeys.put("layout/item_blog_0", com.iqonic.woobox.R.layout.item_blog);
      sKeys.put("layout/item_cart_0", com.iqonic.woobox.R.layout.item_cart);
      sKeys.put("layout/item_category_0", com.iqonic.woobox.R.layout.item_category);
      sKeys.put("layout/item_category_2_0", com.iqonic.woobox.R.layout.item_category_2);
      sKeys.put("layout/item_category_3_0", com.iqonic.woobox.R.layout.item_category_3);
      sKeys.put("layout/item_color_0", com.iqonic.woobox.R.layout.item_color);
      sKeys.put("layout/item_faq_heading_0", com.iqonic.woobox.R.layout.item_faq_heading);
      sKeys.put("layout/item_faq_subheading_0", com.iqonic.woobox.R.layout.item_faq_subheading);
      sKeys.put("layout/item_filter_brand_0", com.iqonic.woobox.R.layout.item_filter_brand);
      sKeys.put("layout/item_filter_category_0", com.iqonic.woobox.R.layout.item_filter_category);
      sKeys.put("layout/item_filter_discount_0", com.iqonic.woobox.R.layout.item_filter_discount);
      sKeys.put("layout/item_home_newest_product_0", com.iqonic.woobox.R.layout.item_home_newest_product);
      sKeys.put("layout/item_navigation_category_0", com.iqonic.woobox.R.layout.item_navigation_category);
      sKeys.put("layout/item_navigation_subcategory_0", com.iqonic.woobox.R.layout.item_navigation_subcategory);
      sKeys.put("layout/item_newest_product_0", com.iqonic.woobox.R.layout.item_newest_product);
      sKeys.put("layout/item_order_0", com.iqonic.woobox.R.layout.item_order);
      sKeys.put("layout/item_orderlist_0", com.iqonic.woobox.R.layout.item_orderlist);
      sKeys.put("layout/item_product_0", com.iqonic.woobox.R.layout.item_product);
      sKeys.put("layout/item_review_0", com.iqonic.woobox.R.layout.item_review);
      sKeys.put("layout/item_reward_0", com.iqonic.woobox.R.layout.item_reward);
      sKeys.put("layout/item_size_0", com.iqonic.woobox.R.layout.item_size);
      sKeys.put("layout/item_track_0", com.iqonic.woobox.R.layout.item_track);
      sKeys.put("layout/item_user_address_0", com.iqonic.woobox.R.layout.item_user_address);
      sKeys.put("layout/item_viewproductgrid_0", com.iqonic.woobox.R.layout.item_viewproductgrid);
      sKeys.put("layout/item_wishlist_0", com.iqonic.woobox.R.layout.item_wishlist);
    }
  }
}
