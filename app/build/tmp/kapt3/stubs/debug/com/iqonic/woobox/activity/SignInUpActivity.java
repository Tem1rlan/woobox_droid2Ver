package com.iqonic.woobox.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u0006\u0010\u0014\u001a\u00020\u000eJ\u0006\u0010\u0015\u001a\u00020\u000eJ \u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u0006\u0010\u0019\u001a\u00020\u000eJ\u0006\u0010\u001a\u001a\u00020\u000eJ\"\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0014J\b\u0010!\u001a\u00020\u000eH\u0016J\u0012\u0010\"\u001a\u00020\u000e2\b\u0010#\u001a\u0004\u0018\u00010$H\u0014R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lcom/iqonic/woobox/activity/SignInUpActivity;", "Lcom/iqonic/woobox/AppBaseActivity;", "()V", "callbackManager", "Lcom/facebook/CallbackManager;", "mAuth", "Lcom/google/firebase/auth/FirebaseAuth;", "mGoogleSignInClient", "Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;", "mSignInFragment", "Lcom/iqonic/woobox/fragments/SignInFragment;", "mSignUpFragment", "Lcom/iqonic/woobox/fragments/SignUpFragment;", "authenticate", "", "credential", "Lcom/google/firebase/auth/AuthCredential;", "token", "", "type", "doFacebookLogin", "doGoogleLogin", "doSocialLogin", "user", "Lcom/google/firebase/auth/FirebaseUser;", "loadSignInFragment", "loadSignUpFragment", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class SignInUpActivity extends com.iqonic.woobox.AppBaseActivity {
    private final com.iqonic.woobox.fragments.SignInFragment mSignInFragment = null;
    private final com.iqonic.woobox.fragments.SignUpFragment mSignUpFragment = null;
    private com.facebook.CallbackManager callbackManager;
    private com.google.firebase.auth.FirebaseAuth mAuth;
    private com.google.android.gms.auth.api.signin.GoogleSignInClient mGoogleSignInClient;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    private final void authenticate(com.google.firebase.auth.AuthCredential credential, java.lang.String token, java.lang.String type) {
    }
    
    private final void doSocialLogin(com.google.firebase.auth.FirebaseUser user, java.lang.String token, java.lang.String type) {
    }
    
    public final void loadSignUpFragment() {
    }
    
    public final void loadSignInFragment() {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    public final void doFacebookLogin() {
    }
    
    public final void doGoogleLogin() {
    }
    
    public SignInUpActivity() {
        super();
    }
}