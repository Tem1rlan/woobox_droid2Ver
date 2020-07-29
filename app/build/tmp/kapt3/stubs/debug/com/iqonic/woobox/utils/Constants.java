package com.iqonic.woobox.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u00c6\u0002\u0018\u00002\u00020\u0001:\t\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001bB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u000e\u0010\u000b\u001a\u00020\fX\u0086T\u00a2\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u0010X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\fX\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/iqonic/woobox/utils/Constants;", "", "()V", "DATE_FORMAT", "Ljava/text/SimpleDateFormat;", "getDATE_FORMAT", "()Ljava/text/SimpleDateFormat;", "DD_MMM_YYYY", "getDD_MMM_YYYY", "FULL_DATE_FORMATTER", "getFULL_DATE_FORMATTER", "PLAY_STORE_URL_PREFIX", "", "YYYY_MM_DD", "getYYYY_MM_DD", "isAllowedToCreate", "", "()Z", "myPreferences", "AppBroadcasts", "Config", "DateFormatCodes", "KeyIntent", "OrderStatus", "RequestCode", "SharedPref", "THEME", "ViewAllCode", "app_debug"})
public final class Constants {
    @org.jetbrains.annotations.NotNull()
    private static final java.text.SimpleDateFormat FULL_DATE_FORMATTER = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.text.SimpleDateFormat DATE_FORMAT = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.text.SimpleDateFormat DD_MMM_YYYY = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.text.SimpleDateFormat YYYY_MM_DD = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PLAY_STORE_URL_PREFIX = "https://play.google.com/store/apps/details?id=";
    private static final boolean isAllowedToCreate = true;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String myPreferences = "MyPreferences";
    public static final com.iqonic.woobox.utils.Constants INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.text.SimpleDateFormat getFULL_DATE_FORMATTER() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.text.SimpleDateFormat getDATE_FORMAT() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.text.SimpleDateFormat getDD_MMM_YYYY() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.text.SimpleDateFormat getYYYY_MM_DD() {
        return null;
    }
    
    public final boolean isAllowedToCreate() {
        return false;
    }
    
    private Constants() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/iqonic/woobox/utils/Constants$Config;", "", "()V", "BASE_URL", "", "DEFAULT_URL", "consumerKey", "consumerSecret", "token", "tokenSecret", "app_debug"})
    public static final class Config {
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String DEFAULT_URL = "http://192.168.100.27:8080/test/";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String BASE_URL = "http://192.168.100.27:8080/test/wp-json/";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String consumerKey = "fOAk4PbC9hlw";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String consumerSecret = "IUeTtvx6HpyjSuIq2qmNXUVAQMubcZAzeSTtrD3Wxb74XnsN";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String token = "QotDwdcHo7QyxUmDsaZ8MEkM";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String tokenSecret = "IxA7u5oXsclKqWceiUb2N2L85KGGU4MzUAFIIjEaLtGYIZq0";
        public static final com.iqonic.woobox.utils.Constants.Config INSTANCE = null;
        
        private Config() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/iqonic/woobox/utils/Constants$RequestCode;", "", "()V", "ACCOUNT", "", "ADD_ADDRESS", "SETTINGS", "SIGN_IN", "app_debug"})
    public static final class RequestCode {
        public static final int ADD_ADDRESS = 201;
        public static final int ACCOUNT = 204;
        public static final int SETTINGS = 205;
        public static final int SIGN_IN = 206;
        public static final com.iqonic.woobox.utils.Constants.RequestCode INSTANCE = null;
        
        private RequestCode() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\'\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006+"}, d2 = {"Lcom/iqonic/woobox/utils/Constants$SharedPref;", "", "()V", "CART_DATA", "", "CATEGORY_DATA", "CONTACT", "COPYRIGHT_TEXT", "DEFAULT_CURRENCY", "FACEBOOK", "INSTAGRAM", "IS_LOGGED_IN", "IS_SOCIAL_LOGIN", "KEY_ADDRESS", "KEY_CART_COUNT", "KEY_DASHBOARD", "KEY_ORDERS", "KEY_ORDER_COUNT", "KEY_RECENTS", "KEY_USER_ADDRESS", "KEY_WISHLIST_COUNT", "LANGUAGE", "PRIVACY_POLICY", "SHOW_SWIPE", "SLIDER_IMAGES_DATA", "SWIPE", "TERM_CONDITION", "THEME", "THEME_COLOR", "TWITTER", "USER_DISPLAY_NAME", "USER_EMAIL", "USER_FIRST_NAME", "USER_ID", "USER_LAST_NAME", "USER_NICE_NAME", "USER_PASSWORD", "USER_PROFILE", "USER_ROLE", "USER_TOKEN", "USER_USERNAME", "WHATSAPP", "WISHLIST_DATA", "app_debug"})
    public static final class SharedPref {
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String KEY_ORDERS = "orders";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String KEY_ORDER_COUNT = "order_count";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String KEY_RECENTS = "recentProduct";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String IS_LOGGED_IN = "isLoggedIn";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String USER_ID = "user_id";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String USER_DISPLAY_NAME = "user_display_name";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String USER_EMAIL = "user_email";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String USER_FIRST_NAME = "user_first_name";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String USER_LAST_NAME = "user_last_name";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String USER_PASSWORD = "user_password";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String USER_ROLE = "user_role";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String USER_USERNAME = "user_username";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String USER_NICE_NAME = "user_nice_name";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String USER_TOKEN = "token";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String USER_PROFILE = "user_profile";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String SWIPE = "swipe";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String SHOW_SWIPE = "showswipe";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String KEY_USER_ADDRESS = "user_address";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String CART_DATA = "cart_data";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String WISHLIST_DATA = "wishlist_data";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String KEY_WISHLIST_COUNT = "wishlist_count";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String KEY_CART_COUNT = "cart_count";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String SLIDER_IMAGES_DATA = "slider_images_data";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String CATEGORY_DATA = "category_data";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String THEME_COLOR = "theme_color";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String DEFAULT_CURRENCY = "default_currency";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String WHATSAPP = "whatsapp";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String FACEBOOK = "facebook";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String TWITTER = "twitter";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String INSTAGRAM = "instagram";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String CONTACT = "contact";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String PRIVACY_POLICY = "privacy_policy";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String TERM_CONDITION = "term_condition";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String COPYRIGHT_TEXT = "copyright_text";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String LANGUAGE = "selected_language";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String THEME = "selected_theme";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String IS_SOCIAL_LOGIN = "is_social_login";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String KEY_DASHBOARD = "selected_dashboard";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String KEY_ADDRESS = "selected_address";
        public static final com.iqonic.woobox.utils.Constants.SharedPref INSTANCE = null;
        
        private SharedPref() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/iqonic/woobox/utils/Constants$KeyIntent;", "", "()V", "ADDRESS_ID", "", "CATEGORY_DATA", "DATA", "IS_ADDED_TO_CART", "KEYID", "PRODUCT_ID", "SHOW_PAGINATION", "TITLE", "VIEWALLID", "app_debug"})
    public static final class KeyIntent {
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String PRODUCT_ID = "product_id";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String CATEGORY_DATA = "category_data";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String IS_ADDED_TO_CART = "isAddedToCart";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String TITLE = "title";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String ADDRESS_ID = "address_id";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String KEYID = "key_id";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String DATA = "data";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String VIEWALLID = "viewallid";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String SHOW_PAGINATION = "show_pagination";
        public static final com.iqonic.woobox.utils.Constants.KeyIntent INSTANCE = null;
        
        private KeyIntent() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/iqonic/woobox/utils/Constants$OrderStatus;", "", "()V", "CANCELLED", "", "COMPLETED", "ONHOLD", "PENDING", "PROCESSING", "REFUNDED", "app_debug"})
    public static final class OrderStatus {
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String PENDING = "pending";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String PROCESSING = "processing";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String ONHOLD = "on-hold";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String COMPLETED = "completed";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String CANCELLED = "cancelled";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String REFUNDED = "refunded";
        public static final com.iqonic.woobox.utils.Constants.OrderStatus INSTANCE = null;
        
        private OrderStatus() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/iqonic/woobox/utils/Constants$ViewAllCode;", "", "()V", "CATEGORY_FEATURED", "", "CATEGORY_NEWEST", "FEATURED", "NEWEST", "RECENTSEARCH", "TOPSELLING", "app_debug"})
    public static final class ViewAllCode {
        public static final int RECENTSEARCH = 100;
        public static final int TOPSELLING = 101;
        public static final int NEWEST = 102;
        public static final int FEATURED = 103;
        public static final int CATEGORY_NEWEST = 104;
        public static final int CATEGORY_FEATURED = 105;
        public static final com.iqonic.woobox.utils.Constants.ViewAllCode INSTANCE = null;
        
        private ViewAllCode() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/iqonic/woobox/utils/Constants$AppBroadcasts;", "", "()V", "ADDRESS_UPDATE", "", "CART_COUNT_CHANGE", "ORDER_COUNT_CHANGE", "PROFILE_UPDATE", "WISHLIST_UPDATE", "app_debug"})
    public static final class AppBroadcasts {
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String CART_COUNT_CHANGE = "app.broadcast.setCartCount";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String ORDER_COUNT_CHANGE = "app.broadcast.OnOrderCountChanged";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String PROFILE_UPDATE = "app.broadcast.OnProfileUpdated";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String WISHLIST_UPDATE = "app.broadcast.OnWishListUpdated";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String ADDRESS_UPDATE = "app.broadcast.OnAddressUpdated";
        public static final com.iqonic.woobox.utils.Constants.AppBroadcasts INSTANCE = null;
        
        private AppBroadcasts() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/iqonic/woobox/utils/Constants$DateFormatCodes;", "", "()V", "YMD", "", "YMD_HMS", "app_debug"})
    public static final class DateFormatCodes {
        public static final int YMD_HMS = 0;
        public static final int YMD = 1;
        public static final com.iqonic.woobox.utils.Constants.DateFormatCodes INSTANCE = null;
        
        private DateFormatCodes() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/iqonic/woobox/utils/Constants$THEME;", "", "()V", "DARK", "", "LIGHT", "app_debug"})
    public static final class THEME {
        public static final int DARK = 1;
        public static final int LIGHT = 2;
        public static final com.iqonic.woobox.utils.Constants.THEME INSTANCE = null;
        
        private THEME() {
            super();
        }
    }
}