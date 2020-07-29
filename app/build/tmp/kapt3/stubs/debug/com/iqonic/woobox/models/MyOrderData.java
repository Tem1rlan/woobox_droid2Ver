package com.iqonic.woobox.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bl\b\u0086\b\u0018\u00002\u00020\u0001:\n\u0095\u0001\u0096\u0001\u0097\u0001\u0098\u0001\u0099\u0001B\u00c5\u0003\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a\u0012\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\u001d\u001a\u00020\r\u0012\u0018\b\u0002\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020 0\u001fj\b\u0012\u0004\u0012\u00020 `!\u0012\b\b\u0002\u0010\"\u001a\u00020\u0005\u0012\b\b\u0002\u0010#\u001a\u00020\u0005\u0012\b\b\u0002\u0010$\u001a\u00020\r\u0012\b\b\u0002\u0010%\u001a\u00020\u0005\u0012\b\b\u0002\u0010&\u001a\u00020\u0005\u0012\b\b\u0002\u0010\'\u001a\u00020(\u0012\u000e\b\u0002\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\b\u0012\b\b\u0002\u0010+\u001a\u00020,\u0012\u000e\b\u0002\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\b\u0012\b\b\u0002\u0010/\u001a\u00020\u0005\u0012\b\b\u0002\u00100\u001a\u00020\u001a\u0012\b\b\u0002\u00101\u001a\u00020\u0005\u0012\u000e\b\u0002\u00102\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u00103\u001a\u00020\u001a\u0012\b\b\u0002\u00104\u001a\u00020\u001a\u0012\b\b\u0002\u00105\u001a\u00020\u0005\u0012\b\b\u0002\u00106\u001a\u00020\u0005\u00a2\u0006\u0002\u00107J\t\u0010h\u001a\u00020\u0003H\u00c6\u0003J\t\u0010i\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010k\u001a\u00020\u0005H\u00c6\u0003J\t\u0010l\u001a\u00020\u0005H\u00c6\u0003J\t\u0010m\u001a\u00020\u0005H\u00c6\u0003J\t\u0010n\u001a\u00020\u0005H\u00c6\u0003J\t\u0010o\u001a\u00020\u0005H\u00c6\u0003J\t\u0010p\u001a\u00020\u0005H\u00c6\u0003J\t\u0010q\u001a\u00020\u0005H\u00c6\u0003J\t\u0010r\u001a\u00020\u001aH\u00c6\u0003J\t\u0010s\u001a\u00020\u0005H\u00c6\u0003J\t\u0010t\u001a\u00020\u001aH\u00c6\u0003J\u000f\u0010u\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u00c6\u0003J\t\u0010v\u001a\u00020\rH\u00c6\u0003J\u0019\u0010w\u001a\u0012\u0012\u0004\u0012\u00020 0\u001fj\b\u0012\u0004\u0012\u00020 `!H\u00c6\u0003J\t\u0010x\u001a\u00020\u0005H\u00c6\u0003J\t\u0010y\u001a\u00020\u0005H\u00c6\u0003J\t\u0010z\u001a\u00020\rH\u00c6\u0003J\t\u0010{\u001a\u00020\u0005H\u00c6\u0003J\t\u0010|\u001a\u00020\u0005H\u00c6\u0003J\t\u0010}\u001a\u00020(H\u00c6\u0003J\t\u0010~\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020*0\bH\u00c6\u0003J\n\u0010\u0080\u0001\u001a\u00020,H\u00c6\u0003J\u0010\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u00020.0\bH\u00c6\u0003J\n\u0010\u0082\u0001\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u0083\u0001\u001a\u00020\u001aH\u00c6\u0003J\n\u0010\u0084\u0001\u001a\u00020\u0005H\u00c6\u0003J\u0010\u0010\u0085\u0001\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u00c6\u0003J\n\u0010\u0086\u0001\u001a\u00020\u001aH\u00c6\u0003J\n\u0010\u0087\u0001\u001a\u00020\u001aH\u00c6\u0003J\n\u0010\u0088\u0001\u001a\u00020\u0005H\u00c6\u0003J\u0010\u0010\u0089\u0001\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u00c6\u0003J\n\u0010\u008a\u0001\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u008b\u0001\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u008c\u0001\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u008d\u0001\u001a\u00020\rH\u00c6\u0003J\n\u0010\u008e\u0001\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u008f\u0001\u001a\u00020\u0005H\u00c6\u0003J\u00ca\u0003\u0010\u0090\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\u001d\u001a\u00020\r2\u0018\b\u0002\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020 0\u001fj\b\u0012\u0004\u0012\u00020 `!2\b\b\u0002\u0010\"\u001a\u00020\u00052\b\b\u0002\u0010#\u001a\u00020\u00052\b\b\u0002\u0010$\u001a\u00020\r2\b\b\u0002\u0010%\u001a\u00020\u00052\b\b\u0002\u0010&\u001a\u00020\u00052\b\b\u0002\u0010\'\u001a\u00020(2\u000e\b\u0002\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\b2\b\b\u0002\u0010+\u001a\u00020,2\u000e\b\u0002\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\b2\b\b\u0002\u0010/\u001a\u00020\u00052\b\b\u0002\u00100\u001a\u00020\u001a2\b\b\u0002\u00101\u001a\u00020\u00052\u000e\b\u0002\u00102\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u00103\u001a\u00020\u001a2\b\b\u0002\u00104\u001a\u00020\u001a2\b\b\u0002\u00105\u001a\u00020\u00052\b\b\u0002\u00106\u001a\u00020\u0005H\u00c6\u0001J\u0015\u0010\u0091\u0001\u001a\u00020(2\t\u0010\u0092\u0001\u001a\u0004\u0018\u00010\tH\u00d6\u0003J\n\u0010\u0093\u0001\u001a\u00020\rH\u00d6\u0001J\n\u0010\u0094\u0001\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u0010;R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0011\u0010\n\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u0010;R\u0011\u0010\u000b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u0010;R\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0011\u0010\u000e\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bC\u0010;R\u0011\u0010\u000f\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bD\u0010;R\u0011\u0010\u0010\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bE\u0010;R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bF\u0010;R\u0011\u0010\u0012\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bG\u0010;R\u0011\u0010\u0013\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bH\u0010;R\u0011\u0010\u0014\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bI\u0010;R\u0011\u0010\u0015\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bJ\u0010;R\u0011\u0010\u0016\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bK\u0010;R\u0011\u0010\u0017\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bL\u0010;R\u0011\u0010\u0018\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bM\u0010;R\u0011\u0010\u0019\u001a\u00020\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\bN\u0010OR\u0011\u0010\u001b\u001a\u00020\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\bP\u0010OR\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\bQ\u0010>R\u0011\u0010\u001d\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\bR\u0010BR!\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020 0\u001fj\b\u0012\u0004\u0012\u00020 `!\u00a2\u0006\b\n\u0000\u001a\u0004\bS\u0010TR\u0011\u0010\"\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bU\u0010;R\u0011\u0010#\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bV\u0010;R\u0011\u0010$\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\bW\u0010BR\u0011\u0010%\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bX\u0010;R\u0011\u0010&\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bY\u0010;R\u0011\u0010\'\u001a\u00020(\u00a2\u0006\b\n\u0000\u001a\u0004\bZ\u0010[R\u0017\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\\\u0010>R\u0011\u0010+\u001a\u00020,\u00a2\u0006\b\n\u0000\u001a\u0004\b]\u0010^R\u0017\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b_\u0010>R\u0011\u0010/\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b`\u0010;R\u0011\u00100\u001a\u00020\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\ba\u0010OR\u0011\u00101\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bb\u0010;R\u0017\u00102\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\bc\u0010>R\u0011\u00103\u001a\u00020\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\bd\u0010OR\u0011\u00104\u001a\u00020\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\be\u0010OR\u0011\u00105\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bf\u0010;R\u0011\u00106\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bg\u0010;\u00a8\u0006\u009a\u0001"}, d2 = {"Lcom/iqonic/woobox/models/MyOrderData;", "Ljava/io/Serializable;", "billing", "Lcom/iqonic/woobox/models/MyOrderData$Billing;", "cart_hash", "", "cart_tax", "coupon_lines", "", "", "created_via", "currency", "customer_id", "", "customer_ip_address", "customer_note", "customer_user_agent", "date_completed", "date_completed_gmt", "date_created", "date_created_gmt", "date_modified", "date_modified_gmt", "date_paid", "date_paid_gmt", "discount_tax", "", "discount_total", "fee_lines", "id", "line_items", "Ljava/util/ArrayList;", "Lcom/iqonic/woobox/models/MyOrderData$LineItem;", "Lkotlin/collections/ArrayList;", "number", "order_key", "parent_id", "payment_method", "payment_method_title", "prices_include_tax", "", "refunds", "Lcom/iqonic/woobox/models/MyOrderData$Refund;", "shipping", "Lcom/iqonic/woobox/models/MyOrderData$Shipping;", "shipping_lines", "Lcom/iqonic/woobox/models/MyOrderData$ShippingLine;", "shipping_tax", "shipping_total", "status", "tax_lines", "total", "total_tax", "transaction_id", "version", "(Lcom/iqonic/woobox/models/MyOrderData$Billing;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDLjava/util/List;ILjava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZLjava/util/List;Lcom/iqonic/woobox/models/MyOrderData$Shipping;Ljava/util/List;Ljava/lang/String;DLjava/lang/String;Ljava/util/List;DDLjava/lang/String;Ljava/lang/String;)V", "getBilling", "()Lcom/iqonic/woobox/models/MyOrderData$Billing;", "getCart_hash", "()Ljava/lang/String;", "getCart_tax", "getCoupon_lines", "()Ljava/util/List;", "getCreated_via", "getCurrency", "getCustomer_id", "()I", "getCustomer_ip_address", "getCustomer_note", "getCustomer_user_agent", "getDate_completed", "getDate_completed_gmt", "getDate_created", "getDate_created_gmt", "getDate_modified", "getDate_modified_gmt", "getDate_paid", "getDate_paid_gmt", "getDiscount_tax", "()D", "getDiscount_total", "getFee_lines", "getId", "getLine_items", "()Ljava/util/ArrayList;", "getNumber", "getOrder_key", "getParent_id", "getPayment_method", "getPayment_method_title", "getPrices_include_tax", "()Z", "getRefunds", "getShipping", "()Lcom/iqonic/woobox/models/MyOrderData$Shipping;", "getShipping_lines", "getShipping_tax", "getShipping_total", "getStatus", "getTax_lines", "getTotal", "getTotal_tax", "getTransaction_id", "getVersion", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "Billing", "LineItem", "Refund", "Shipping", "ShippingLine", "app_debug"})
public final class MyOrderData implements java.io.Serializable {
    @org.jetbrains.annotations.NotNull()
    private final com.iqonic.woobox.models.MyOrderData.Billing billing = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String cart_hash = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String cart_tax = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.Object> coupon_lines = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String created_via = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String currency = null;
    private final int customer_id = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String customer_ip_address = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String customer_note = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String customer_user_agent = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String date_completed = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String date_completed_gmt = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String date_created = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String date_created_gmt = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String date_modified = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String date_modified_gmt = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String date_paid = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String date_paid_gmt = null;
    private final double discount_tax = 0.0;
    private final double discount_total = 0.0;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.Object> fee_lines = null;
    private final int id = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.iqonic.woobox.models.MyOrderData.LineItem> line_items = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String number = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String order_key = null;
    private final int parent_id = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String payment_method = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String payment_method_title = null;
    private final boolean prices_include_tax = false;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.iqonic.woobox.models.MyOrderData.Refund> refunds = null;
    @org.jetbrains.annotations.NotNull()
    private final com.iqonic.woobox.models.MyOrderData.Shipping shipping = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.iqonic.woobox.models.MyOrderData.ShippingLine> shipping_lines = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String shipping_tax = null;
    private final double shipping_total = 0.0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String status = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.Object> tax_lines = null;
    private final double total = 0.0;
    private final double total_tax = 0.0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String transaction_id = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String version = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.iqonic.woobox.models.MyOrderData.Billing getBilling() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCart_hash() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCart_tax() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> getCoupon_lines() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCreated_via() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCurrency() {
        return null;
    }
    
    public final int getCustomer_id() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCustomer_ip_address() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCustomer_note() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCustomer_user_agent() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDate_completed() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDate_completed_gmt() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDate_created() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDate_created_gmt() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDate_modified() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDate_modified_gmt() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDate_paid() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDate_paid_gmt() {
        return null;
    }
    
    public final double getDiscount_tax() {
        return 0.0;
    }
    
    public final double getDiscount_total() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> getFee_lines() {
        return null;
    }
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.iqonic.woobox.models.MyOrderData.LineItem> getLine_items() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNumber() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOrder_key() {
        return null;
    }
    
    public final int getParent_id() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPayment_method() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPayment_method_title() {
        return null;
    }
    
    public final boolean getPrices_include_tax() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.iqonic.woobox.models.MyOrderData.Refund> getRefunds() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.iqonic.woobox.models.MyOrderData.Shipping getShipping() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.iqonic.woobox.models.MyOrderData.ShippingLine> getShipping_lines() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getShipping_tax() {
        return null;
    }
    
    public final double getShipping_total() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> getTax_lines() {
        return null;
    }
    
    public final double getTotal() {
        return 0.0;
    }
    
    public final double getTotal_tax() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTransaction_id() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getVersion() {
        return null;
    }
    
    public MyOrderData(@org.jetbrains.annotations.NotNull()
    com.iqonic.woobox.models.MyOrderData.Billing billing, @org.jetbrains.annotations.NotNull()
    java.lang.String cart_hash, @org.jetbrains.annotations.NotNull()
    java.lang.String cart_tax, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> coupon_lines, @org.jetbrains.annotations.NotNull()
    java.lang.String created_via, @org.jetbrains.annotations.NotNull()
    java.lang.String currency, int customer_id, @org.jetbrains.annotations.NotNull()
    java.lang.String customer_ip_address, @org.jetbrains.annotations.NotNull()
    java.lang.String customer_note, @org.jetbrains.annotations.NotNull()
    java.lang.String customer_user_agent, @org.jetbrains.annotations.Nullable()
    java.lang.String date_completed, @org.jetbrains.annotations.NotNull()
    java.lang.String date_completed_gmt, @org.jetbrains.annotations.NotNull()
    java.lang.String date_created, @org.jetbrains.annotations.NotNull()
    java.lang.String date_created_gmt, @org.jetbrains.annotations.NotNull()
    java.lang.String date_modified, @org.jetbrains.annotations.NotNull()
    java.lang.String date_modified_gmt, @org.jetbrains.annotations.NotNull()
    java.lang.String date_paid, @org.jetbrains.annotations.NotNull()
    java.lang.String date_paid_gmt, double discount_tax, double discount_total, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> fee_lines, int id, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.iqonic.woobox.models.MyOrderData.LineItem> line_items, @org.jetbrains.annotations.NotNull()
    java.lang.String number, @org.jetbrains.annotations.NotNull()
    java.lang.String order_key, int parent_id, @org.jetbrains.annotations.NotNull()
    java.lang.String payment_method, @org.jetbrains.annotations.NotNull()
    java.lang.String payment_method_title, boolean prices_include_tax, @org.jetbrains.annotations.NotNull()
    java.util.List<com.iqonic.woobox.models.MyOrderData.Refund> refunds, @org.jetbrains.annotations.NotNull()
    com.iqonic.woobox.models.MyOrderData.Shipping shipping, @org.jetbrains.annotations.NotNull()
    java.util.List<com.iqonic.woobox.models.MyOrderData.ShippingLine> shipping_lines, @org.jetbrains.annotations.NotNull()
    java.lang.String shipping_tax, double shipping_total, @org.jetbrains.annotations.NotNull()
    java.lang.String status, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> tax_lines, double total, double total_tax, @org.jetbrains.annotations.NotNull()
    java.lang.String transaction_id, @org.jetbrains.annotations.NotNull()
    java.lang.String version) {
        super();
    }
    
    public MyOrderData() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.iqonic.woobox.models.MyOrderData.Billing component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    public final int component7() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component18() {
        return null;
    }
    
    public final double component19() {
        return 0.0;
    }
    
    public final double component20() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> component21() {
        return null;
    }
    
    public final int component22() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.iqonic.woobox.models.MyOrderData.LineItem> component23() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component24() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component25() {
        return null;
    }
    
    public final int component26() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component27() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component28() {
        return null;
    }
    
    public final boolean component29() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.iqonic.woobox.models.MyOrderData.Refund> component30() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.iqonic.woobox.models.MyOrderData.Shipping component31() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.iqonic.woobox.models.MyOrderData.ShippingLine> component32() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component33() {
        return null;
    }
    
    public final double component34() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component35() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> component36() {
        return null;
    }
    
    public final double component37() {
        return 0.0;
    }
    
    public final double component38() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component39() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component40() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.iqonic.woobox.models.MyOrderData copy(@org.jetbrains.annotations.NotNull()
    com.iqonic.woobox.models.MyOrderData.Billing billing, @org.jetbrains.annotations.NotNull()
    java.lang.String cart_hash, @org.jetbrains.annotations.NotNull()
    java.lang.String cart_tax, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> coupon_lines, @org.jetbrains.annotations.NotNull()
    java.lang.String created_via, @org.jetbrains.annotations.NotNull()
    java.lang.String currency, int customer_id, @org.jetbrains.annotations.NotNull()
    java.lang.String customer_ip_address, @org.jetbrains.annotations.NotNull()
    java.lang.String customer_note, @org.jetbrains.annotations.NotNull()
    java.lang.String customer_user_agent, @org.jetbrains.annotations.Nullable()
    java.lang.String date_completed, @org.jetbrains.annotations.NotNull()
    java.lang.String date_completed_gmt, @org.jetbrains.annotations.NotNull()
    java.lang.String date_created, @org.jetbrains.annotations.NotNull()
    java.lang.String date_created_gmt, @org.jetbrains.annotations.NotNull()
    java.lang.String date_modified, @org.jetbrains.annotations.NotNull()
    java.lang.String date_modified_gmt, @org.jetbrains.annotations.NotNull()
    java.lang.String date_paid, @org.jetbrains.annotations.NotNull()
    java.lang.String date_paid_gmt, double discount_tax, double discount_total, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> fee_lines, int id, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.iqonic.woobox.models.MyOrderData.LineItem> line_items, @org.jetbrains.annotations.NotNull()
    java.lang.String number, @org.jetbrains.annotations.NotNull()
    java.lang.String order_key, int parent_id, @org.jetbrains.annotations.NotNull()
    java.lang.String payment_method, @org.jetbrains.annotations.NotNull()
    java.lang.String payment_method_title, boolean prices_include_tax, @org.jetbrains.annotations.NotNull()
    java.util.List<com.iqonic.woobox.models.MyOrderData.Refund> refunds, @org.jetbrains.annotations.NotNull()
    com.iqonic.woobox.models.MyOrderData.Shipping shipping, @org.jetbrains.annotations.NotNull()
    java.util.List<com.iqonic.woobox.models.MyOrderData.ShippingLine> shipping_lines, @org.jetbrains.annotations.NotNull()
    java.lang.String shipping_tax, double shipping_total, @org.jetbrains.annotations.NotNull()
    java.lang.String status, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> tax_lines, double total, double total_tax, @org.jetbrains.annotations.NotNull()
    java.lang.String transaction_id, @org.jetbrains.annotations.NotNull()
    java.lang.String version) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0005H\u00c6\u0003J\'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b\u00a8\u0006\u0017"}, d2 = {"Lcom/iqonic/woobox/models/MyOrderData$Refund;", "Ljava/io/Serializable;", "id", "", "refund", "", "total", "(ILjava/lang/String;Ljava/lang/String;)V", "getId", "()I", "getRefund", "()Ljava/lang/String;", "getTotal", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "app_debug"})
    public static final class Refund implements java.io.Serializable {
        private final int id = 0;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String refund = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String total = null;
        
        public final int getId() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getRefund() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTotal() {
            return null;
        }
        
        public Refund(int id, @org.jetbrains.annotations.NotNull()
        java.lang.String refund, @org.jetbrains.annotations.NotNull()
        java.lang.String total) {
            super();
        }
        
        public Refund() {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.iqonic.woobox.models.MyOrderData.Refund copy(int id, @org.jetbrains.annotations.NotNull()
        java.lang.String refund, @org.jetbrains.annotations.NotNull()
        java.lang.String total) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b$\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bs\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\u0003H\u00c6\u0003J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0003H\u00c6\u0003J\t\u0010#\u001a\u00020\u0003H\u00c6\u0003J\t\u0010$\u001a\u00020\u0003H\u00c6\u0003J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003Jw\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*H\u00d6\u0003J\t\u0010+\u001a\u00020,H\u00d6\u0001J\t\u0010-\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0011\u0010\f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010R\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0010\u00a8\u0006."}, d2 = {"Lcom/iqonic/woobox/models/MyOrderData$Billing;", "Ljava/io/Serializable;", "address_1", "", "address_2", "city", "company", "country", "email", "first_name", "last_name", "phone", "postcode", "state", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAddress_1", "()Ljava/lang/String;", "getAddress_2", "getCity", "getCompany", "getCountry", "getEmail", "getFirst_name", "getLast_name", "getPhone", "getPostcode", "getState", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class Billing implements java.io.Serializable {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String address_1 = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String address_2 = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String city = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String company = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String country = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String email = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String first_name = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String last_name = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String phone = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String postcode = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String state = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getAddress_1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getAddress_2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCity() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCompany() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCountry() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getEmail() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getFirst_name() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getLast_name() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPhone() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPostcode() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getState() {
            return null;
        }
        
        public Billing(@org.jetbrains.annotations.NotNull()
        java.lang.String address_1, @org.jetbrains.annotations.NotNull()
        java.lang.String address_2, @org.jetbrains.annotations.NotNull()
        java.lang.String city, @org.jetbrains.annotations.NotNull()
        java.lang.String company, @org.jetbrains.annotations.NotNull()
        java.lang.String country, @org.jetbrains.annotations.NotNull()
        java.lang.String email, @org.jetbrains.annotations.NotNull()
        java.lang.String first_name, @org.jetbrains.annotations.NotNull()
        java.lang.String last_name, @org.jetbrains.annotations.NotNull()
        java.lang.String phone, @org.jetbrains.annotations.NotNull()
        java.lang.String postcode, @org.jetbrains.annotations.NotNull()
        java.lang.String state) {
            super();
        }
        
        public Billing() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component5() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component6() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component7() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component8() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component9() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component10() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component11() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.iqonic.woobox.models.MyOrderData.Billing copy(@org.jetbrains.annotations.NotNull()
        java.lang.String address_1, @org.jetbrains.annotations.NotNull()
        java.lang.String address_2, @org.jetbrains.annotations.NotNull()
        java.lang.String city, @org.jetbrains.annotations.NotNull()
        java.lang.String company, @org.jetbrains.annotations.NotNull()
        java.lang.String country, @org.jetbrains.annotations.NotNull()
        java.lang.String email, @org.jetbrains.annotations.NotNull()
        java.lang.String first_name, @org.jetbrains.annotations.NotNull()
        java.lang.String last_name, @org.jetbrains.annotations.NotNull()
        java.lang.String phone, @org.jetbrains.annotations.NotNull()
        java.lang.String postcode, @org.jetbrains.annotations.NotNull()
        java.lang.String state) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b-\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0012\u001a\u00020\n\u0012\b\b\u0002\u0010\u0013\u001a\u00020\b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0015J\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\t\u0010)\u001a\u00020\bH\u00c6\u0003J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\t\u0010+\u001a\u00020\nH\u00c6\u0003J\t\u0010,\u001a\u00020\bH\u00c6\u0003J\t\u0010-\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\t\u0010/\u001a\u00020\bH\u00c6\u0003J\t\u00100\u001a\u00020\nH\u00c6\u0003J\t\u00101\u001a\u00020\u0003H\u00c6\u0003J\t\u00102\u001a\u00020\u0003H\u00c6\u0003J\t\u00103\u001a\u00020\bH\u00c6\u0003J\t\u00104\u001a\u00020\bH\u00c6\u0003J\t\u00105\u001a\u00020\bH\u00c6\u0003J\u00a1\u0001\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\b2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0012\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\u0003H\u00c6\u0001J\u0013\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010\u0006H\u00d6\u0003J\t\u0010:\u001a\u00020\u0003H\u00d6\u0001J\t\u0010;\u001a\u00020\bH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0011\u0010\f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017R\u0011\u0010\r\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u0011\u0010\u000e\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u0011\u0010\u000f\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001bR\u0011\u0010\u0010\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001bR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0019R\u0011\u0010\u0012\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001dR\u0011\u0010\u0013\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001bR\u0011\u0010\u0014\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u0017\u00a8\u0006<"}, d2 = {"Lcom/iqonic/woobox/models/MyOrderData$LineItem;", "Ljava/io/Serializable;", "id", "", "meta_data", "", "", "name", "", "price", "", "product_id", "quantity", "sku", "subtotal", "subtotal_tax", "tax_class", "taxes", "total", "total_tax", "variation_id", "(ILjava/util/List;Ljava/lang/String;DIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;DLjava/lang/String;I)V", "getId", "()I", "getMeta_data", "()Ljava/util/List;", "getName", "()Ljava/lang/String;", "getPrice", "()D", "getProduct_id", "getQuantity", "getSku", "getSubtotal", "getSubtotal_tax", "getTax_class", "getTaxes", "getTotal", "getTotal_tax", "getVariation_id", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
    public static final class LineItem implements java.io.Serializable {
        private final int id = 0;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<java.lang.Object> meta_data = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String name = null;
        private final double price = 0.0;
        private final int product_id = 0;
        private final int quantity = 0;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String sku = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String subtotal = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String subtotal_tax = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String tax_class = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<java.lang.Object> taxes = null;
        private final double total = 0.0;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String total_tax = null;
        private final int variation_id = 0;
        
        public final int getId() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.Object> getMeta_data() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getName() {
            return null;
        }
        
        public final double getPrice() {
            return 0.0;
        }
        
        public final int getProduct_id() {
            return 0;
        }
        
        public final int getQuantity() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSku() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSubtotal() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSubtotal_tax() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTax_class() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.Object> getTaxes() {
            return null;
        }
        
        public final double getTotal() {
            return 0.0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTotal_tax() {
            return null;
        }
        
        public final int getVariation_id() {
            return 0;
        }
        
        public LineItem(int id, @org.jetbrains.annotations.NotNull()
        java.util.List<? extends java.lang.Object> meta_data, @org.jetbrains.annotations.NotNull()
        java.lang.String name, double price, int product_id, int quantity, @org.jetbrains.annotations.NotNull()
        java.lang.String sku, @org.jetbrains.annotations.NotNull()
        java.lang.String subtotal, @org.jetbrains.annotations.NotNull()
        java.lang.String subtotal_tax, @org.jetbrains.annotations.NotNull()
        java.lang.String tax_class, @org.jetbrains.annotations.NotNull()
        java.util.List<? extends java.lang.Object> taxes, double total, @org.jetbrains.annotations.NotNull()
        java.lang.String total_tax, int variation_id) {
            super();
        }
        
        public LineItem() {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.Object> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component3() {
            return null;
        }
        
        public final double component4() {
            return 0.0;
        }
        
        public final int component5() {
            return 0;
        }
        
        public final int component6() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component7() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component8() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component9() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component10() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.Object> component11() {
            return null;
        }
        
        public final double component12() {
            return 0.0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component13() {
            return null;
        }
        
        public final int component14() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.iqonic.woobox.models.MyOrderData.LineItem copy(int id, @org.jetbrains.annotations.NotNull()
        java.util.List<? extends java.lang.Object> meta_data, @org.jetbrains.annotations.NotNull()
        java.lang.String name, double price, int product_id, int quantity, @org.jetbrains.annotations.NotNull()
        java.lang.String sku, @org.jetbrains.annotations.NotNull()
        java.lang.String subtotal, @org.jetbrains.annotations.NotNull()
        java.lang.String subtotal_tax, @org.jetbrains.annotations.NotNull()
        java.lang.String tax_class, @org.jetbrains.annotations.NotNull()
        java.util.List<? extends java.lang.Object> taxes, double total, @org.jetbrains.annotations.NotNull()
        java.lang.String total_tax, int variation_id) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001&BW\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u00a2\u0006\u0002\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\bH\u00c6\u0003J\t\u0010\u001c\u001a\u00020\bH\u00c6\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0005H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\bH\u00c6\u0003J\t\u0010\u001f\u001a\u00020\bH\u00c6\u0003J[\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00052\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\bH\u00c6\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u000bH\u00d6\u0003J\t\u0010$\u001a\u00020\u0003H\u00d6\u0001J\t\u0010%\u001a\u00020\bH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\f\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\r\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014\u00a8\u0006\'"}, d2 = {"Lcom/iqonic/woobox/models/MyOrderData$ShippingLine;", "Ljava/io/Serializable;", "id", "", "meta_data", "", "Lcom/iqonic/woobox/models/MyOrderData$ShippingLine$MetaData;", "method_id", "", "method_title", "taxes", "", "total", "total_tax", "(ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()I", "getMeta_data", "()Ljava/util/List;", "getMethod_id", "()Ljava/lang/String;", "getMethod_title", "getTaxes", "getTotal", "getTotal_tax", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "MetaData", "app_debug"})
    public static final class ShippingLine implements java.io.Serializable {
        private final int id = 0;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.iqonic.woobox.models.MyOrderData.ShippingLine.MetaData> meta_data = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String method_id = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String method_title = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<java.lang.Object> taxes = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String total = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String total_tax = null;
        
        public final int getId() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.iqonic.woobox.models.MyOrderData.ShippingLine.MetaData> getMeta_data() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getMethod_id() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getMethod_title() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.Object> getTaxes() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTotal() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTotal_tax() {
            return null;
        }
        
        public ShippingLine(int id, @org.jetbrains.annotations.NotNull()
        java.util.List<com.iqonic.woobox.models.MyOrderData.ShippingLine.MetaData> meta_data, @org.jetbrains.annotations.NotNull()
        java.lang.String method_id, @org.jetbrains.annotations.NotNull()
        java.lang.String method_title, @org.jetbrains.annotations.NotNull()
        java.util.List<? extends java.lang.Object> taxes, @org.jetbrains.annotations.NotNull()
        java.lang.String total, @org.jetbrains.annotations.NotNull()
        java.lang.String total_tax) {
            super();
        }
        
        public ShippingLine() {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.iqonic.woobox.models.MyOrderData.ShippingLine.MetaData> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.Object> component5() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component6() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component7() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.iqonic.woobox.models.MyOrderData.ShippingLine copy(int id, @org.jetbrains.annotations.NotNull()
        java.util.List<com.iqonic.woobox.models.MyOrderData.ShippingLine.MetaData> meta_data, @org.jetbrains.annotations.NotNull()
        java.lang.String method_id, @org.jetbrains.annotations.NotNull()
        java.lang.String method_title, @org.jetbrains.annotations.NotNull()
        java.util.List<? extends java.lang.Object> taxes, @org.jetbrains.annotations.NotNull()
        java.lang.String total, @org.jetbrains.annotations.NotNull()
        java.lang.String total_tax) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
        
        @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0005H\u00c6\u0003J\'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b\u00a8\u0006\u0017"}, d2 = {"Lcom/iqonic/woobox/models/MyOrderData$ShippingLine$MetaData;", "Ljava/io/Serializable;", "id", "", "key", "", "value", "(ILjava/lang/String;Ljava/lang/String;)V", "getId", "()I", "getKey", "()Ljava/lang/String;", "getValue", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "app_debug"})
        public static final class MetaData implements java.io.Serializable {
            private final int id = 0;
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String key = null;
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String value = null;
            
            public final int getId() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getKey() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getValue() {
                return null;
            }
            
            public MetaData(int id, @org.jetbrains.annotations.NotNull()
            java.lang.String key, @org.jetbrains.annotations.NotNull()
            java.lang.String value) {
                super();
            }
            
            public MetaData() {
                super();
            }
            
            public final int component1() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component3() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.iqonic.woobox.models.MyOrderData.ShippingLine.MetaData copy(int id, @org.jetbrains.annotations.NotNull()
            java.lang.String key, @org.jetbrains.annotations.NotNull()
            java.lang.String value) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
                return false;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B_\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003Jc\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u00d6\u0003J\t\u0010%\u001a\u00020&H\u00d6\u0001J\t\u0010\'\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e\u00a8\u0006("}, d2 = {"Lcom/iqonic/woobox/models/MyOrderData$Shipping;", "Ljava/io/Serializable;", "address_1", "", "address_2", "city", "company", "country", "first_name", "last_name", "postcode", "state", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAddress_1", "()Ljava/lang/String;", "getAddress_2", "getCity", "getCompany", "getCountry", "getFirst_name", "getLast_name", "getPostcode", "getState", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class Shipping implements java.io.Serializable {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String address_1 = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String address_2 = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String city = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String company = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String country = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String first_name = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String last_name = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String postcode = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String state = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getAddress_1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getAddress_2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCity() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCompany() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCountry() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getFirst_name() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getLast_name() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPostcode() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getState() {
            return null;
        }
        
        public Shipping(@org.jetbrains.annotations.NotNull()
        java.lang.String address_1, @org.jetbrains.annotations.NotNull()
        java.lang.String address_2, @org.jetbrains.annotations.NotNull()
        java.lang.String city, @org.jetbrains.annotations.NotNull()
        java.lang.String company, @org.jetbrains.annotations.NotNull()
        java.lang.String country, @org.jetbrains.annotations.NotNull()
        java.lang.String first_name, @org.jetbrains.annotations.NotNull()
        java.lang.String last_name, @org.jetbrains.annotations.NotNull()
        java.lang.String postcode, @org.jetbrains.annotations.NotNull()
        java.lang.String state) {
            super();
        }
        
        public Shipping() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component5() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component6() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component7() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component8() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component9() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.iqonic.woobox.models.MyOrderData.Shipping copy(@org.jetbrains.annotations.NotNull()
        java.lang.String address_1, @org.jetbrains.annotations.NotNull()
        java.lang.String address_2, @org.jetbrains.annotations.NotNull()
        java.lang.String city, @org.jetbrains.annotations.NotNull()
        java.lang.String company, @org.jetbrains.annotations.NotNull()
        java.lang.String country, @org.jetbrains.annotations.NotNull()
        java.lang.String first_name, @org.jetbrains.annotations.NotNull()
        java.lang.String last_name, @org.jetbrains.annotations.NotNull()
        java.lang.String postcode, @org.jetbrains.annotations.NotNull()
        java.lang.String state) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
}