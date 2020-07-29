package com.iqonic.woobox.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000M\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0003\b\u0087\u0002\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u00fd\u0006\u0012\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0013\u0012\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0004\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\'\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0004\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010!\u0012\u0010\b\u0002\u0010)\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010\u0004\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010!\u0012\u0010\b\u0002\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0004\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u00108\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u0004\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010F\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0004\u0012\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010I\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010J\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010K\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010L\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0004\u0012\n\b\u0002\u0010M\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010PJ\u0012\u0010\u00e7\u0001\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u00c6\u0003J\u0012\u0010\u00e8\u0001\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0004H\u00c6\u0003J\u0012\u0010\u00e9\u0001\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0004H\u00c6\u0003J\f\u0010\u00ea\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\f\u0010\u00eb\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\f\u0010\u00ec\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\f\u0010\u00ed\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\f\u0010\u00ee\u0001\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003J\f\u0010\u00ef\u0001\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003J\f\u0010\u00f0\u0001\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003J\f\u0010\u00f1\u0001\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003J\f\u0010\u00f2\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u0012\u0010\u00f3\u0001\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0004H\u00c6\u0003J\f\u0010\u00f4\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\f\u0010\u00f5\u0001\u001a\u0004\u0018\u00010\u001fH\u00c6\u0003J\u0012\u0010\u00f6\u0001\u001a\u0004\u0018\u00010!H\u00c6\u0003\u00a2\u0006\u0003\u0010\u0087\u0001J\u0012\u0010\u00f7\u0001\u001a\u0004\u0018\u00010!H\u00c6\u0003\u00a2\u0006\u0003\u0010\u0087\u0001J\u0011\u0010\u00f8\u0001\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010ZJ\u0012\u0010\u00f9\u0001\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0004H\u00c6\u0003J\f\u0010\u00fa\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u0011\u0010\u00fb\u0001\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010ZJ\u0012\u0010\u00fc\u0001\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0004H\u00c6\u0003J\f\u0010\u00fd\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u0012\u0010\u00fe\u0001\u001a\u0004\u0018\u00010!H\u00c6\u0003\u00a2\u0006\u0003\u0010\u0087\u0001J\u0012\u0010\u00ff\u0001\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010\u0004H\u00c6\u0003J\u0011\u0010\u0080\u0002\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010ZJ\u0012\u0010\u0081\u0002\u001a\u0004\u0018\u00010!H\u00c6\u0003\u00a2\u0006\u0003\u0010\u0087\u0001J\u0012\u0010\u0082\u0002\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0004H\u00c6\u0003J\f\u0010\u0083\u0002\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u0011\u0010\u0084\u0002\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010ZJ\u0012\u0010\u0085\u0002\u001a\u0004\u0018\u00010!H\u00c6\u0003\u00a2\u0006\u0003\u0010\u0087\u0001J\f\u0010\u0086\u0002\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u0012\u0010\u0087\u0002\u001a\u0004\u0018\u00010!H\u00c6\u0003\u00a2\u0006\u0003\u0010\u0087\u0001J\f\u0010\u0088\u0002\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\f\u0010\u0089\u0002\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u0011\u0010\u008a\u0002\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010ZJ\f\u0010\u008b\u0002\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u0012\u0010\u008c\u0002\u001a\u0004\u0018\u00010!H\u00c6\u0003\u00a2\u0006\u0003\u0010\u0087\u0001J\f\u0010\u008d\u0002\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u0012\u0010\u008e\u0002\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u0004H\u00c6\u0003J\u0011\u0010\u008f\u0002\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010ZJ\f\u0010\u0090\u0002\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\f\u0010\u0091\u0002\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u0012\u0010\u0092\u0002\u001a\u0004\u0018\u00010!H\u00c6\u0003\u00a2\u0006\u0003\u0010\u0087\u0001J\u0011\u0010\u0093\u0002\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010ZJ\u0011\u0010\u0094\u0002\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010ZJ\u0011\u0010\u0095\u0002\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010ZJ\f\u0010\u0096\u0002\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\f\u0010\u0097\u0002\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\f\u0010\u0098\u0002\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u0011\u0010\u0099\u0002\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010ZJ\f\u0010\u009a\u0002\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\f\u0010\u009b\u0002\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003J\f\u0010\u009c\u0002\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u0012\u0010\u009d\u0002\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0004H\u00c6\u0003J\f\u0010\u009e\u0002\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\f\u0010\u009f\u0002\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\f\u0010\u00a0\u0002\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u0012\u0010\u00a1\u0002\u001a\u0004\u0018\u00010!H\u00c6\u0003\u00a2\u0006\u0003\u0010\u0087\u0001J\f\u0010\u00a2\u0002\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u0012\u0010\u00a3\u0002\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0004H\u00c6\u0003J\u0012\u0010\u00a4\u0002\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0004H\u00c6\u0003J\u0011\u0010\u00a5\u0002\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010ZJ\f\u0010\u00a6\u0002\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\f\u0010\u00a7\u0002\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u0011\u0010\u00a8\u0002\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010ZJ\f\u0010\u00a9\u0002\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\f\u0010\u00aa\u0002\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u0088\u0007\u0010\u00ab\u0002\u001a\u00020\u00002\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00042\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00042\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00132\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00042\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00042\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\'\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00042\n\b\u0002\u0010(\u001a\u0004\u0018\u00010!2\u0010\b\u0002\u0010)\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010\u00042\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010!2\u0010\b\u0002\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00042\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u00100\u001a\u0004\u0018\u00010!2\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u00102\u001a\u0004\u0018\u00010!2\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u00106\u001a\u0004\u0018\u00010!2\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u00108\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u00042\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010<\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010F\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00042\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010I\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010J\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010K\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00042\u0010\b\u0002\u0010L\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00042\n\b\u0002\u0010M\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001\u00a2\u0006\u0003\u0010\u00ac\u0002J\u0015\u0010\u00ad\u0002\u001a\u00020\u000b2\t\u0010\u00ae\u0002\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003J\n\u0010\u00af\u0002\u001a\u00020!H\u00d6\u0001J\n\u0010\u00b0\u0002\u001a\u00020\u0007H\u00d6\u0001R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010]\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b^\u0010V\"\u0004\b_\u0010XR\u001e\u0010\r\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010]\u001a\u0004\b`\u0010Z\"\u0004\ba\u0010\\R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bb\u0010V\"\u0004\bc\u0010XR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bd\u0010V\"\u0004\be\u0010XR\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bf\u0010R\"\u0004\bg\u0010TR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bh\u0010V\"\u0004\bi\u0010XR\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bj\u0010R\"\u0004\bk\u0010TR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bl\u0010V\"\u0004\bm\u0010XR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bn\u0010V\"\u0004\bo\u0010XR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bp\u0010V\"\u0004\bq\u0010XR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\br\u0010V\"\u0004\bs\u0010XR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bx\u0010u\"\u0004\by\u0010wR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bz\u0010u\"\u0004\b{\u0010wR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b|\u0010u\"\u0004\b}\u0010wR\"\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b~\u0010R\"\u0004\b\u007f\u0010TR\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0080\u0001\u0010V\"\u0005\b\u0081\u0001\u0010XR \u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001\"\u0006\b\u0084\u0001\u0010\u0085\u0001R#\u0010 \u001a\u0004\u0018\u00010!X\u0086\u000e\u00a2\u0006\u0015\n\u0003\u0010\u008a\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001\"\u0006\b\u0088\u0001\u0010\u0089\u0001R#\u0010\"\u001a\u0004\u0018\u00010!X\u0086\u000e\u00a2\u0006\u0015\n\u0003\u0010\u008a\u0001\u001a\u0006\b\u008b\u0001\u0010\u0087\u0001\"\u0006\b\u008c\u0001\u0010\u0089\u0001R \u0010#\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010]\u001a\u0005\b\u008d\u0001\u0010Z\"\u0005\b\u008e\u0001\u0010\\R$\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u008f\u0001\u0010R\"\u0005\b\u0090\u0001\u0010TR\u001e\u0010%\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0091\u0001\u0010V\"\u0005\b\u0092\u0001\u0010XR \u0010&\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010]\u001a\u0005\b\u0093\u0001\u0010Z\"\u0005\b\u0094\u0001\u0010\\R$\u0010\'\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0095\u0001\u0010R\"\u0005\b\u0096\u0001\u0010TR#\u0010(\u001a\u0004\u0018\u00010!X\u0086\u000e\u00a2\u0006\u0015\n\u0003\u0010\u008a\u0001\u001a\u0006\b\u0097\u0001\u0010\u0087\u0001\"\u0006\b\u0098\u0001\u0010\u0089\u0001R\u001e\u0010O\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0099\u0001\u0010V\"\u0005\b\u009a\u0001\u0010XR$\u0010)\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u009b\u0001\u0010R\"\u0005\b\u009c\u0001\u0010TR \u0010+\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010]\u001a\u0005\b\u009d\u0001\u0010Z\"\u0005\b\u009e\u0001\u0010\\R#\u0010,\u001a\u0004\u0018\u00010!X\u0086\u000e\u00a2\u0006\u0015\n\u0003\u0010\u008a\u0001\u001a\u0006\b\u009f\u0001\u0010\u0087\u0001\"\u0006\b\u00a0\u0001\u0010\u0089\u0001R$\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00a1\u0001\u0010R\"\u0005\b\u00a2\u0001\u0010TR\u001e\u0010.\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00a3\u0001\u0010V\"\u0005\b\u00a4\u0001\u0010XR \u0010/\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010]\u001a\u0005\b\u00a5\u0001\u0010Z\"\u0005\b\u00a6\u0001\u0010\\R#\u00100\u001a\u0004\u0018\u00010!X\u0086\u000e\u00a2\u0006\u0015\n\u0003\u0010\u008a\u0001\u001a\u0006\b\u00a7\u0001\u0010\u0087\u0001\"\u0006\b\u00a8\u0001\u0010\u0089\u0001R\u001e\u00101\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00a9\u0001\u0010V\"\u0005\b\u00aa\u0001\u0010XR#\u00102\u001a\u0004\u0018\u00010!X\u0086\u000e\u00a2\u0006\u0015\n\u0003\u0010\u008a\u0001\u001a\u0006\b\u00ab\u0001\u0010\u0087\u0001\"\u0006\b\u00ac\u0001\u0010\u0089\u0001R\u001e\u00103\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00ad\u0001\u0010V\"\u0005\b\u00ae\u0001\u0010XR \u00104\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010]\u001a\u0005\b\u00af\u0001\u0010Z\"\u0005\b\u00b0\u0001\u0010\\R\u001e\u00105\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00b1\u0001\u0010V\"\u0005\b\u00b2\u0001\u0010XR#\u00106\u001a\u0004\u0018\u00010!X\u0086\u000e\u00a2\u0006\u0015\n\u0003\u0010\u008a\u0001\u001a\u0006\b\u00b3\u0001\u0010\u0087\u0001\"\u0006\b\u00b4\u0001\u0010\u0089\u0001R\u001e\u00107\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00b5\u0001\u0010V\"\u0005\b\u00b6\u0001\u0010XR$\u00108\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00b7\u0001\u0010R\"\u0005\b\u00b8\u0001\u0010TR \u00109\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010]\u001a\u0005\b\u00b9\u0001\u0010Z\"\u0005\b\u00ba\u0001\u0010\\R\u001e\u0010:\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00bb\u0001\u0010V\"\u0005\b\u00bc\u0001\u0010XR\u001e\u0010;\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00bd\u0001\u0010V\"\u0005\b\u00be\u0001\u0010XR#\u0010<\u001a\u0004\u0018\u00010!X\u0086\u000e\u00a2\u0006\u0015\n\u0003\u0010\u008a\u0001\u001a\u0006\b\u00bf\u0001\u0010\u0087\u0001\"\u0006\b\u00c0\u0001\u0010\u0089\u0001R \u0010=\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010]\u001a\u0005\b\u00c1\u0001\u0010Z\"\u0005\b\u00c2\u0001\u0010\\R \u0010>\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010]\u001a\u0005\b\u00c3\u0001\u0010Z\"\u0005\b\u00c4\u0001\u0010\\R\u001e\u0010?\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00c5\u0001\u0010V\"\u0005\b\u00c6\u0001\u0010XR\u001e\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00c7\u0001\u0010V\"\u0005\b\u00c8\u0001\u0010XR\u001e\u0010@\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00c9\u0001\u0010V\"\u0005\b\u00ca\u0001\u0010XR\u001e\u0010A\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00cb\u0001\u0010V\"\u0005\b\u00cc\u0001\u0010XR \u0010B\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010]\u001a\u0005\b\u00cd\u0001\u0010Z\"\u0005\b\u00ce\u0001\u0010\\R\u001e\u0010C\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00cf\u0001\u0010V\"\u0005\b\u00d0\u0001\u0010XR\u001e\u0010D\u001a\u0004\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00d1\u0001\u0010u\"\u0005\b\u00d2\u0001\u0010wR\u001e\u0010E\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00d3\u0001\u0010V\"\u0005\b\u00d4\u0001\u0010XR$\u0010F\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00d5\u0001\u0010R\"\u0005\b\u00d6\u0001\u0010TR\u001e\u0010G\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00d7\u0001\u0010V\"\u0005\b\u00d8\u0001\u0010XR\u001e\u0010H\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00d9\u0001\u0010V\"\u0005\b\u00da\u0001\u0010XR#\u0010I\u001a\u0004\u0018\u00010!X\u0086\u000e\u00a2\u0006\u0015\n\u0003\u0010\u008a\u0001\u001a\u0006\b\u00db\u0001\u0010\u0087\u0001\"\u0006\b\u00dc\u0001\u0010\u0089\u0001R\u001e\u0010J\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00dd\u0001\u0010V\"\u0005\b\u00de\u0001\u0010XR$\u0010K\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00df\u0001\u0010R\"\u0005\b\u00e0\u0001\u0010TR$\u0010L\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00e1\u0001\u0010R\"\u0005\b\u00e2\u0001\u0010TR \u0010M\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010]\u001a\u0005\b\u00e3\u0001\u0010Z\"\u0005\b\u00e4\u0001\u0010\\R\u001e\u0010N\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00e5\u0001\u0010V\"\u0005\b\u00e6\u0001\u0010X\u00a8\u0006\u00b1\u0002"}, d2 = {"Lcom/iqonic/woobox/models/ProductModel;", "Lcom/iqonic/woobox/models/BaseResponse;", "Ljava/io/Serializable;", "attributes", "", "Lcom/iqonic/woobox/models/Attributes;", "average_rating", "", "size", "color", "backordered", "", "backorders", "backorders_allowed", "button_text", "catalog_visibility", "categories", "Lcom/iqonic/woobox/models/Categories;", "cross_sell_ids", "", "date_created", "date_created_gmt", "date_modified", "date_modified_gmt", "date_on_sale_from", "date_on_sale_from_gmt", "date_on_sale_to", "date_on_sale_to_gmt", "default_attributes", "description", "dimensions", "Lcom/iqonic/woobox/models/Dimensions;", "download_expiry", "", "download_limit", "downloadable", "downloads", "external_url", "featured", "grouped_products", "id", "images", "Lcom/iqonic/woobox/models/ImagesData;", "manage_stock", "menu_order", "meta_data", "name", "on_sale", "parent_id", "permalink", "price", "price_html", "purchasable", "purchase_note", "rating_count", "regular_price", "related_ids", "reviews_allowed", "sale_price", "shipping_class", "shipping_class_id", "shipping_required", "shipping_taxable", "short_description", "sku", "slug", "sold_individually", "status", "stock_quantity", "stock_status", "tags", "tax_class", "tax_status", "total_sales", "type", "upsell_ids", "variations", "virtual", "weight", "image", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/List;Ljava/lang/String;Lcom/iqonic/woobox/models/Dimensions;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "getAttributes", "()Ljava/util/List;", "setAttributes", "(Ljava/util/List;)V", "getAverage_rating", "()Ljava/lang/String;", "setAverage_rating", "(Ljava/lang/String;)V", "getBackordered", "()Ljava/lang/Boolean;", "setBackordered", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getBackorders", "setBackorders", "getBackorders_allowed", "setBackorders_allowed", "getButton_text", "setButton_text", "getCatalog_visibility", "setCatalog_visibility", "getCategories", "setCategories", "getColor", "setColor", "getCross_sell_ids", "setCross_sell_ids", "getDate_created", "setDate_created", "getDate_created_gmt", "setDate_created_gmt", "getDate_modified", "setDate_modified", "getDate_modified_gmt", "setDate_modified_gmt", "getDate_on_sale_from", "()Ljava/lang/Object;", "setDate_on_sale_from", "(Ljava/lang/Object;)V", "getDate_on_sale_from_gmt", "setDate_on_sale_from_gmt", "getDate_on_sale_to", "setDate_on_sale_to", "getDate_on_sale_to_gmt", "setDate_on_sale_to_gmt", "getDefault_attributes", "setDefault_attributes", "getDescription", "setDescription", "getDimensions", "()Lcom/iqonic/woobox/models/Dimensions;", "setDimensions", "(Lcom/iqonic/woobox/models/Dimensions;)V", "getDownload_expiry", "()Ljava/lang/Integer;", "setDownload_expiry", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getDownload_limit", "setDownload_limit", "getDownloadable", "setDownloadable", "getDownloads", "setDownloads", "getExternal_url", "setExternal_url", "getFeatured", "setFeatured", "getGrouped_products", "setGrouped_products", "getId", "setId", "getImage", "setImage", "getImages", "setImages", "getManage_stock", "setManage_stock", "getMenu_order", "setMenu_order", "getMeta_data", "setMeta_data", "getName", "setName", "getOn_sale", "setOn_sale", "getParent_id", "setParent_id", "getPermalink", "setPermalink", "getPrice", "setPrice", "getPrice_html", "setPrice_html", "getPurchasable", "setPurchasable", "getPurchase_note", "setPurchase_note", "getRating_count", "setRating_count", "getRegular_price", "setRegular_price", "getRelated_ids", "setRelated_ids", "getReviews_allowed", "setReviews_allowed", "getSale_price", "setSale_price", "getShipping_class", "setShipping_class", "getShipping_class_id", "setShipping_class_id", "getShipping_required", "setShipping_required", "getShipping_taxable", "setShipping_taxable", "getShort_description", "setShort_description", "getSize", "setSize", "getSku", "setSku", "getSlug", "setSlug", "getSold_individually", "setSold_individually", "getStatus", "setStatus", "getStock_quantity", "setStock_quantity", "getStock_status", "setStock_status", "getTags", "setTags", "getTax_class", "setTax_class", "getTax_status", "setTax_status", "getTotal_sales", "setTotal_sales", "getType", "setType", "getUpsell_ids", "setUpsell_ids", "getVariations", "setVariations", "getVirtual", "setVirtual", "getWeight", "setWeight", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component5", "component50", "component51", "component52", "component53", "component54", "component55", "component56", "component57", "component58", "component59", "component6", "component60", "component61", "component62", "component63", "component64", "component65", "component66", "component67", "component68", "component7", "component8", "component9", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/List;Ljava/lang/String;Lcom/iqonic/woobox/models/Dimensions;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)Lcom/iqonic/woobox/models/ProductModel;", "equals", "other", "hashCode", "toString", "app_debug"})
public final class ProductModel extends com.iqonic.woobox.models.BaseResponse implements java.io.Serializable {
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.iqonic.woobox.models.Attributes> attributes;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String average_rating;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String size;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String color;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean backordered;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String backorders;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean backorders_allowed;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String button_text;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String catalog_visibility;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.iqonic.woobox.models.Categories> categories;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<? extends java.lang.Object> cross_sell_ids;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String date_created;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String date_created_gmt;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String date_modified;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String date_modified_gmt;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object date_on_sale_from;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object date_on_sale_from_gmt;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object date_on_sale_to;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object date_on_sale_to_gmt;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<? extends java.lang.Object> default_attributes;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String description;
    @org.jetbrains.annotations.Nullable()
    private com.iqonic.woobox.models.Dimensions dimensions;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer download_expiry;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer download_limit;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean downloadable;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<? extends java.lang.Object> downloads;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String external_url;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean featured;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<? extends java.lang.Object> grouped_products;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer id;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.iqonic.woobox.models.ImagesData> images;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean manage_stock;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer menu_order;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<? extends java.lang.Object> meta_data;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String name;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean on_sale;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer parent_id;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String permalink;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer price;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String price_html;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean purchasable;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String purchase_note;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer rating_count;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String regular_price;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<java.lang.Integer> related_ids;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean reviews_allowed;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String sale_price;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String shipping_class;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer shipping_class_id;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean shipping_required;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean shipping_taxable;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String short_description;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String sku;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String slug;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean sold_individually;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String status;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object stock_quantity;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String stock_status;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<? extends java.lang.Object> tags;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String tax_class;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String tax_status;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer total_sales;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String type;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<? extends java.lang.Object> upsell_ids;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<? extends java.lang.Object> variations;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean virtual;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String weight;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String image;
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.iqonic.woobox.models.Attributes> getAttributes() {
        return null;
    }
    
    public final void setAttributes(@org.jetbrains.annotations.Nullable()
    java.util.List<com.iqonic.woobox.models.Attributes> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAverage_rating() {
        return null;
    }
    
    public final void setAverage_rating(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSize() {
        return null;
    }
    
    public final void setSize(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getColor() {
        return null;
    }
    
    public final void setColor(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getBackordered() {
        return null;
    }
    
    public final void setBackordered(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBackorders() {
        return null;
    }
    
    public final void setBackorders(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getBackorders_allowed() {
        return null;
    }
    
    public final void setBackorders_allowed(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getButton_text() {
        return null;
    }
    
    public final void setButton_text(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCatalog_visibility() {
        return null;
    }
    
    public final void setCatalog_visibility(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.iqonic.woobox.models.Categories> getCategories() {
        return null;
    }
    
    public final void setCategories(@org.jetbrains.annotations.Nullable()
    java.util.List<com.iqonic.woobox.models.Categories> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.Object> getCross_sell_ids() {
        return null;
    }
    
    public final void setCross_sell_ids(@org.jetbrains.annotations.Nullable()
    java.util.List<? extends java.lang.Object> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDate_created() {
        return null;
    }
    
    public final void setDate_created(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDate_created_gmt() {
        return null;
    }
    
    public final void setDate_created_gmt(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDate_modified() {
        return null;
    }
    
    public final void setDate_modified(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDate_modified_gmt() {
        return null;
    }
    
    public final void setDate_modified_gmt(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getDate_on_sale_from() {
        return null;
    }
    
    public final void setDate_on_sale_from(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getDate_on_sale_from_gmt() {
        return null;
    }
    
    public final void setDate_on_sale_from_gmt(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getDate_on_sale_to() {
        return null;
    }
    
    public final void setDate_on_sale_to(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getDate_on_sale_to_gmt() {
        return null;
    }
    
    public final void setDate_on_sale_to_gmt(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.Object> getDefault_attributes() {
        return null;
    }
    
    public final void setDefault_attributes(@org.jetbrains.annotations.Nullable()
    java.util.List<? extends java.lang.Object> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDescription() {
        return null;
    }
    
    public final void setDescription(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.iqonic.woobox.models.Dimensions getDimensions() {
        return null;
    }
    
    public final void setDimensions(@org.jetbrains.annotations.Nullable()
    com.iqonic.woobox.models.Dimensions p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getDownload_expiry() {
        return null;
    }
    
    public final void setDownload_expiry(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getDownload_limit() {
        return null;
    }
    
    public final void setDownload_limit(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getDownloadable() {
        return null;
    }
    
    public final void setDownloadable(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.Object> getDownloads() {
        return null;
    }
    
    public final void setDownloads(@org.jetbrains.annotations.Nullable()
    java.util.List<? extends java.lang.Object> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getExternal_url() {
        return null;
    }
    
    public final void setExternal_url(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getFeatured() {
        return null;
    }
    
    public final void setFeatured(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.Object> getGrouped_products() {
        return null;
    }
    
    public final void setGrouped_products(@org.jetbrains.annotations.Nullable()
    java.util.List<? extends java.lang.Object> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.iqonic.woobox.models.ImagesData> getImages() {
        return null;
    }
    
    public final void setImages(@org.jetbrains.annotations.Nullable()
    java.util.List<com.iqonic.woobox.models.ImagesData> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getManage_stock() {
        return null;
    }
    
    public final void setManage_stock(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getMenu_order() {
        return null;
    }
    
    public final void setMenu_order(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.Object> getMeta_data() {
        return null;
    }
    
    public final void setMeta_data(@org.jetbrains.annotations.Nullable()
    java.util.List<? extends java.lang.Object> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getOn_sale() {
        return null;
    }
    
    public final void setOn_sale(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getParent_id() {
        return null;
    }
    
    public final void setParent_id(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPermalink() {
        return null;
    }
    
    public final void setPermalink(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getPrice() {
        return null;
    }
    
    public final void setPrice(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPrice_html() {
        return null;
    }
    
    public final void setPrice_html(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getPurchasable() {
        return null;
    }
    
    public final void setPurchasable(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPurchase_note() {
        return null;
    }
    
    public final void setPurchase_note(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getRating_count() {
        return null;
    }
    
    public final void setRating_count(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRegular_price() {
        return null;
    }
    
    public final void setRegular_price(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.Integer> getRelated_ids() {
        return null;
    }
    
    public final void setRelated_ids(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getReviews_allowed() {
        return null;
    }
    
    public final void setReviews_allowed(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSale_price() {
        return null;
    }
    
    public final void setSale_price(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getShipping_class() {
        return null;
    }
    
    public final void setShipping_class(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getShipping_class_id() {
        return null;
    }
    
    public final void setShipping_class_id(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getShipping_required() {
        return null;
    }
    
    public final void setShipping_required(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getShipping_taxable() {
        return null;
    }
    
    public final void setShipping_taxable(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getShort_description() {
        return null;
    }
    
    public final void setShort_description(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSku() {
        return null;
    }
    
    public final void setSku(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSlug() {
        return null;
    }
    
    public final void setSlug(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getSold_individually() {
        return null;
    }
    
    public final void setSold_individually(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStatus() {
        return null;
    }
    
    public final void setStatus(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getStock_quantity() {
        return null;
    }
    
    public final void setStock_quantity(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStock_status() {
        return null;
    }
    
    public final void setStock_status(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.Object> getTags() {
        return null;
    }
    
    public final void setTags(@org.jetbrains.annotations.Nullable()
    java.util.List<? extends java.lang.Object> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTax_class() {
        return null;
    }
    
    public final void setTax_class(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTax_status() {
        return null;
    }
    
    public final void setTax_status(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getTotal_sales() {
        return null;
    }
    
    public final void setTotal_sales(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getType() {
        return null;
    }
    
    public final void setType(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.Object> getUpsell_ids() {
        return null;
    }
    
    public final void setUpsell_ids(@org.jetbrains.annotations.Nullable()
    java.util.List<? extends java.lang.Object> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.Object> getVariations() {
        return null;
    }
    
    public final void setVariations(@org.jetbrains.annotations.Nullable()
    java.util.List<? extends java.lang.Object> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getVirtual() {
        return null;
    }
    
    public final void setVirtual(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getWeight() {
        return null;
    }
    
    public final void setWeight(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getImage() {
        return null;
    }
    
    public final void setImage(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public ProductModel(@org.jetbrains.annotations.Nullable()
    java.util.List<com.iqonic.woobox.models.Attributes> attributes, @org.jetbrains.annotations.Nullable()
    java.lang.String average_rating, @org.jetbrains.annotations.Nullable()
    java.lang.String size, @org.jetbrains.annotations.Nullable()
    java.lang.String color, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean backordered, @org.jetbrains.annotations.Nullable()
    java.lang.String backorders, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean backorders_allowed, @org.jetbrains.annotations.Nullable()
    java.lang.String button_text, @org.jetbrains.annotations.Nullable()
    java.lang.String catalog_visibility, @org.jetbrains.annotations.Nullable()
    java.util.List<com.iqonic.woobox.models.Categories> categories, @org.jetbrains.annotations.Nullable()
    java.util.List<? extends java.lang.Object> cross_sell_ids, @org.jetbrains.annotations.Nullable()
    java.lang.String date_created, @org.jetbrains.annotations.Nullable()
    java.lang.String date_created_gmt, @org.jetbrains.annotations.Nullable()
    java.lang.String date_modified, @org.jetbrains.annotations.Nullable()
    java.lang.String date_modified_gmt, @org.jetbrains.annotations.Nullable()
    java.lang.Object date_on_sale_from, @org.jetbrains.annotations.Nullable()
    java.lang.Object date_on_sale_from_gmt, @org.jetbrains.annotations.Nullable()
    java.lang.Object date_on_sale_to, @org.jetbrains.annotations.Nullable()
    java.lang.Object date_on_sale_to_gmt, @org.jetbrains.annotations.Nullable()
    java.util.List<? extends java.lang.Object> default_attributes, @org.jetbrains.annotations.Nullable()
    java.lang.String description, @org.jetbrains.annotations.Nullable()
    com.iqonic.woobox.models.Dimensions dimensions, @org.jetbrains.annotations.Nullable()
    java.lang.Integer download_expiry, @org.jetbrains.annotations.Nullable()
    java.lang.Integer download_limit, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean downloadable, @org.jetbrains.annotations.Nullable()
    java.util.List<? extends java.lang.Object> downloads, @org.jetbrains.annotations.Nullable()
    java.lang.String external_url, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean featured, @org.jetbrains.annotations.Nullable()
    java.util.List<? extends java.lang.Object> grouped_products, @org.jetbrains.annotations.Nullable()
    java.lang.Integer id, @org.jetbrains.annotations.Nullable()
    java.util.List<com.iqonic.woobox.models.ImagesData> images, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean manage_stock, @org.jetbrains.annotations.Nullable()
    java.lang.Integer menu_order, @org.jetbrains.annotations.Nullable()
    java.util.List<? extends java.lang.Object> meta_data, @org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean on_sale, @org.jetbrains.annotations.Nullable()
    java.lang.Integer parent_id, @org.jetbrains.annotations.Nullable()
    java.lang.String permalink, @org.jetbrains.annotations.Nullable()
    java.lang.Integer price, @org.jetbrains.annotations.Nullable()
    java.lang.String price_html, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean purchasable, @org.jetbrains.annotations.Nullable()
    java.lang.String purchase_note, @org.jetbrains.annotations.Nullable()
    java.lang.Integer rating_count, @org.jetbrains.annotations.Nullable()
    java.lang.String regular_price, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.Integer> related_ids, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean reviews_allowed, @org.jetbrains.annotations.Nullable()
    java.lang.String sale_price, @org.jetbrains.annotations.Nullable()
    java.lang.String shipping_class, @org.jetbrains.annotations.Nullable()
    java.lang.Integer shipping_class_id, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean shipping_required, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean shipping_taxable, @org.jetbrains.annotations.Nullable()
    java.lang.String short_description, @org.jetbrains.annotations.Nullable()
    java.lang.String sku, @org.jetbrains.annotations.Nullable()
    java.lang.String slug, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean sold_individually, @org.jetbrains.annotations.Nullable()
    java.lang.String status, @org.jetbrains.annotations.Nullable()
    java.lang.Object stock_quantity, @org.jetbrains.annotations.Nullable()
    java.lang.String stock_status, @org.jetbrains.annotations.Nullable()
    java.util.List<? extends java.lang.Object> tags, @org.jetbrains.annotations.Nullable()
    java.lang.String tax_class, @org.jetbrains.annotations.Nullable()
    java.lang.String tax_status, @org.jetbrains.annotations.Nullable()
    java.lang.Integer total_sales, @org.jetbrains.annotations.Nullable()
    java.lang.String type, @org.jetbrains.annotations.Nullable()
    java.util.List<? extends java.lang.Object> upsell_ids, @org.jetbrains.annotations.Nullable()
    java.util.List<? extends java.lang.Object> variations, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean virtual, @org.jetbrains.annotations.Nullable()
    java.lang.String weight, @org.jetbrains.annotations.Nullable()
    java.lang.String image) {
        super(null);
    }
    
    public ProductModel() {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.iqonic.woobox.models.Attributes> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.iqonic.woobox.models.Categories> component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.Object> component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component18() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component19() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.Object> component20() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component21() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.iqonic.woobox.models.Dimensions component22() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component23() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component24() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component25() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.Object> component26() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component27() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component28() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.Object> component29() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component30() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.iqonic.woobox.models.ImagesData> component31() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component32() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component33() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.Object> component34() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component35() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component36() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component37() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component38() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component39() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component40() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component41() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component42() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component43() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component44() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.Integer> component45() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component46() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component47() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component48() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component49() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component50() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component51() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component52() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component53() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component54() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component55() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component56() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component57() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component58() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.Object> component59() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component60() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component61() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component62() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component63() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.Object> component64() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.Object> component65() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component66() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component67() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component68() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.iqonic.woobox.models.ProductModel copy(@org.jetbrains.annotations.Nullable()
    java.util.List<com.iqonic.woobox.models.Attributes> attributes, @org.jetbrains.annotations.Nullable()
    java.lang.String average_rating, @org.jetbrains.annotations.Nullable()
    java.lang.String size, @org.jetbrains.annotations.Nullable()
    java.lang.String color, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean backordered, @org.jetbrains.annotations.Nullable()
    java.lang.String backorders, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean backorders_allowed, @org.jetbrains.annotations.Nullable()
    java.lang.String button_text, @org.jetbrains.annotations.Nullable()
    java.lang.String catalog_visibility, @org.jetbrains.annotations.Nullable()
    java.util.List<com.iqonic.woobox.models.Categories> categories, @org.jetbrains.annotations.Nullable()
    java.util.List<? extends java.lang.Object> cross_sell_ids, @org.jetbrains.annotations.Nullable()
    java.lang.String date_created, @org.jetbrains.annotations.Nullable()
    java.lang.String date_created_gmt, @org.jetbrains.annotations.Nullable()
    java.lang.String date_modified, @org.jetbrains.annotations.Nullable()
    java.lang.String date_modified_gmt, @org.jetbrains.annotations.Nullable()
    java.lang.Object date_on_sale_from, @org.jetbrains.annotations.Nullable()
    java.lang.Object date_on_sale_from_gmt, @org.jetbrains.annotations.Nullable()
    java.lang.Object date_on_sale_to, @org.jetbrains.annotations.Nullable()
    java.lang.Object date_on_sale_to_gmt, @org.jetbrains.annotations.Nullable()
    java.util.List<? extends java.lang.Object> default_attributes, @org.jetbrains.annotations.Nullable()
    java.lang.String description, @org.jetbrains.annotations.Nullable()
    com.iqonic.woobox.models.Dimensions dimensions, @org.jetbrains.annotations.Nullable()
    java.lang.Integer download_expiry, @org.jetbrains.annotations.Nullable()
    java.lang.Integer download_limit, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean downloadable, @org.jetbrains.annotations.Nullable()
    java.util.List<? extends java.lang.Object> downloads, @org.jetbrains.annotations.Nullable()
    java.lang.String external_url, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean featured, @org.jetbrains.annotations.Nullable()
    java.util.List<? extends java.lang.Object> grouped_products, @org.jetbrains.annotations.Nullable()
    java.lang.Integer id, @org.jetbrains.annotations.Nullable()
    java.util.List<com.iqonic.woobox.models.ImagesData> images, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean manage_stock, @org.jetbrains.annotations.Nullable()
    java.lang.Integer menu_order, @org.jetbrains.annotations.Nullable()
    java.util.List<? extends java.lang.Object> meta_data, @org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean on_sale, @org.jetbrains.annotations.Nullable()
    java.lang.Integer parent_id, @org.jetbrains.annotations.Nullable()
    java.lang.String permalink, @org.jetbrains.annotations.Nullable()
    java.lang.Integer price, @org.jetbrains.annotations.Nullable()
    java.lang.String price_html, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean purchasable, @org.jetbrains.annotations.Nullable()
    java.lang.String purchase_note, @org.jetbrains.annotations.Nullable()
    java.lang.Integer rating_count, @org.jetbrains.annotations.Nullable()
    java.lang.String regular_price, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.Integer> related_ids, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean reviews_allowed, @org.jetbrains.annotations.Nullable()
    java.lang.String sale_price, @org.jetbrains.annotations.Nullable()
    java.lang.String shipping_class, @org.jetbrains.annotations.Nullable()
    java.lang.Integer shipping_class_id, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean shipping_required, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean shipping_taxable, @org.jetbrains.annotations.Nullable()
    java.lang.String short_description, @org.jetbrains.annotations.Nullable()
    java.lang.String sku, @org.jetbrains.annotations.Nullable()
    java.lang.String slug, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean sold_individually, @org.jetbrains.annotations.Nullable()
    java.lang.String status, @org.jetbrains.annotations.Nullable()
    java.lang.Object stock_quantity, @org.jetbrains.annotations.Nullable()
    java.lang.String stock_status, @org.jetbrains.annotations.Nullable()
    java.util.List<? extends java.lang.Object> tags, @org.jetbrains.annotations.Nullable()
    java.lang.String tax_class, @org.jetbrains.annotations.Nullable()
    java.lang.String tax_status, @org.jetbrains.annotations.Nullable()
    java.lang.Integer total_sales, @org.jetbrains.annotations.Nullable()
    java.lang.String type, @org.jetbrains.annotations.Nullable()
    java.util.List<? extends java.lang.Object> upsell_ids, @org.jetbrains.annotations.Nullable()
    java.util.List<? extends java.lang.Object> variations, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean virtual, @org.jetbrains.annotations.Nullable()
    java.lang.String weight, @org.jetbrains.annotations.Nullable()
    java.lang.String image) {
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