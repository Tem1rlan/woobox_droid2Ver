package com.iqonic.woobox.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000?\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0003\b\u0090\u0001\b\u0086\b\u0018\u00002\u00020\u0001B\u00cd\u0004\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0012\b\u0002\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0012\b\u0002\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\u0012\b\u0002\u0010\u0017\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\n\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\'\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0003\u0012\u0012\b\u0002\u00103\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\n\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u00107J\u000b\u0010q\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010r\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003J\u000b\u0010s\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010t\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010u\u001a\u0004\u0018\u00010\u0015H\u00c6\u0003\u00a2\u0006\u0002\u0010JJ\u000b\u0010v\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0013\u0010w\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\nH\u00c6\u0003J\u000b\u0010x\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010y\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010z\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010{\u001a\u0004\u0018\u00010\u0015H\u00c6\u0003\u00a2\u0006\u0002\u0010JJ\u000b\u0010|\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010}\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010~\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010TJ\u000b\u0010\u007f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010TJ\f\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010TJ\u0011\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0015H\u00c6\u0003\u00a2\u0006\u0002\u0010JJ\f\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010TJ\u0011\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010TJ\f\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u0015H\u00c6\u0003\u00a2\u0006\u0002\u0010JJ\u0011\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010TJ\f\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010TJ\f\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0014\u0010\u0096\u0001\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\nH\u00c6\u0003J\u0011\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u0015H\u00c6\u0003\u00a2\u0006\u0002\u0010JJ\f\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0014\u0010\u009b\u0001\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\nH\u00c6\u0003J\f\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0014\u0010\u009d\u0001\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\nH\u00c6\u0003J\f\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J\u00d8\u0004\u0010\u009f\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\u0012\b\u0002\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0012\b\u0002\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\u0012\b\u0002\u0010\u0017\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\n2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\'\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00032\u0012\b\u0002\u00103\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\n2\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0003\u0010\u00a0\u0001J\u0015\u0010\u00a1\u0001\u001a\u00020\u00152\t\u0010\u00a2\u0001\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\n\u0010\u00a3\u0001\u001a\u00020\u0006H\u00d6\u0001J\n\u0010\u00a4\u0001\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u00109R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u00109R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u00109R\u001b\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u00109\"\u0004\b@\u0010AR\u001b\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u0010>R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bG\u00109R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bH\u00109R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\n\n\u0002\u0010K\u001a\u0004\bI\u0010JR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bL\u00109R\u001b\u0010\u0017\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\bM\u0010>R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bN\u00109R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bO\u00109R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bP\u00109R\u0015\u0010\u001b\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\n\n\u0002\u0010K\u001a\u0004\bQ\u0010JR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bR\u00109R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010U\u001a\u0004\bS\u0010TR\u0015\u0010\u001d\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010U\u001a\u0004\bV\u0010TR\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bW\u00109R\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bX\u00109R\u0015\u0010 \u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010U\u001a\u0004\bY\u0010TR\u0013\u0010!\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bZ\u00109R\u0015\u0010\"\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010U\u001a\u0004\b[\u0010TR\u0015\u0010#\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\n\n\u0002\u0010K\u001a\u0004\b\\\u0010JR\u0013\u0010$\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b]\u00109R\u0015\u0010%\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010U\u001a\u0004\b^\u0010TR\u0013\u0010&\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b_\u00109R\u001c\u0010\'\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b`\u00109\"\u0004\ba\u0010AR\u0013\u0010(\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bb\u00109R\u0013\u0010)\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bc\u00109R\u0015\u0010*\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\n\n\u0002\u0010K\u001a\u0004\bd\u0010JR\u0015\u0010+\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010U\u001a\u0004\be\u0010TR\u0013\u0010,\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bf\u00109R\u0015\u0010-\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010U\u001a\u0004\bg\u0010TR\u0013\u0010.\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bh\u00109R\u0013\u0010/\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bi\u00109R\u0013\u00100\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bj\u00109R\u0013\u00101\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bk\u00109R\u0013\u00102\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bl\u00109R\u001b\u00103\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\bm\u0010>R\u0015\u00104\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\n\n\u0002\u0010K\u001a\u0004\bn\u0010JR\u0013\u00105\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bo\u00109R\u0013\u00106\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bp\u00109\u00a8\u0006\u00a5\u0001"}, d2 = {"Lcom/iqonic/woobox/models/ProductDataNew;", "Ljava/io/Serializable;", "average_rating", "", "backorders", "num_pages", "", "brand", "catalog_visibility", "categories", "", "color", "cross_sell_ids", "", "date_created", "Lcom/iqonic/woobox/models/DateCreated;", "date_modified", "Lcom/iqonic/woobox/models/DateModified;", "description", "dimensions", "featured", "", "full", "gallery", "get_purchase_note", "height", "length", "manage_stock", "name", "parent_id", "permalink", "price", "pro_id", "regular_price", "review_count", "reviews_allowed", "sale_price", "shipping_class_id", "short_description", "size", "sku", "slug", "sold_individually", "srno", "status", "stock_quantity", "stock_status", "tax_class", "tax_status", "thumbnail", "type", "upsell_ids", "virtual", "weight", "width", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lcom/iqonic/woobox/models/DateCreated;Lcom/iqonic/woobox/models/DateModified;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "getAverage_rating", "()Ljava/lang/String;", "getBackorders", "getBrand", "getCatalog_visibility", "getCategories", "()Ljava/util/List;", "getColor", "setColor", "(Ljava/lang/String;)V", "getCross_sell_ids", "getDate_created", "()Lcom/iqonic/woobox/models/DateCreated;", "getDate_modified", "()Lcom/iqonic/woobox/models/DateModified;", "getDescription", "getDimensions", "getFeatured", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getFull", "getGallery", "getGet_purchase_note", "getHeight", "getLength", "getManage_stock", "getName", "getNum_pages", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getParent_id", "getPermalink", "getPrice", "getPro_id", "getRegular_price", "getReview_count", "getReviews_allowed", "getSale_price", "getShipping_class_id", "getShort_description", "getSize", "setSize", "getSku", "getSlug", "getSold_individually", "getSrno", "getStatus", "getStock_quantity", "getStock_status", "getTax_class", "getTax_status", "getThumbnail", "getType", "getUpsell_ids", "getVirtual", "getWeight", "getWidth", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lcom/iqonic/woobox/models/DateCreated;Lcom/iqonic/woobox/models/DateModified;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)Lcom/iqonic/woobox/models/ProductDataNew;", "equals", "other", "hashCode", "toString", "app_debug"})
public final class ProductDataNew implements java.io.Serializable {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String average_rating = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String backorders = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer num_pages = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String brand = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String catalog_visibility = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<java.lang.Integer> categories = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String color;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<java.lang.Object> cross_sell_ids = null;
    @org.jetbrains.annotations.Nullable()
    private final com.iqonic.woobox.models.DateCreated date_created = null;
    @org.jetbrains.annotations.Nullable()
    private final com.iqonic.woobox.models.DateModified date_modified = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String description = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String dimensions = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean featured = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String full = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<java.lang.String> gallery = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String get_purchase_note = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String height = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String length = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean manage_stock = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String name = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer parent_id = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String permalink = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String price = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer pro_id = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String regular_price = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer review_count = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean reviews_allowed = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String sale_price = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer shipping_class_id = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String short_description = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String size;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String sku = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String slug = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean sold_individually = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer srno = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String status = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer stock_quantity = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String stock_status = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String tax_class = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String tax_status = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String thumbnail = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String type = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<java.lang.Object> upsell_ids = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean virtual = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String weight = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String width = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAverage_rating() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBackorders() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getNum_pages() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBrand() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCatalog_visibility() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.Integer> getCategories() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getColor() {
        return null;
    }
    
    public final void setColor(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.Object> getCross_sell_ids() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.iqonic.woobox.models.DateCreated getDate_created() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.iqonic.woobox.models.DateModified getDate_modified() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDimensions() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getFeatured() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFull() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> getGallery() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getGet_purchase_note() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getHeight() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLength() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getManage_stock() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getParent_id() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPermalink() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPrice() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getPro_id() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRegular_price() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getReview_count() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getReviews_allowed() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSale_price() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getShipping_class_id() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getShort_description() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSize() {
        return null;
    }
    
    public final void setSize(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSku() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSlug() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getSold_individually() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getSrno() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getStock_quantity() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStock_status() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTax_class() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTax_status() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getThumbnail() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getType() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.Object> getUpsell_ids() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getVirtual() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getWeight() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getWidth() {
        return null;
    }
    
    public ProductDataNew(@org.jetbrains.annotations.Nullable()
    java.lang.String average_rating, @org.jetbrains.annotations.Nullable()
    java.lang.String backorders, @org.jetbrains.annotations.Nullable()
    java.lang.Integer num_pages, @org.jetbrains.annotations.Nullable()
    java.lang.String brand, @org.jetbrains.annotations.Nullable()
    java.lang.String catalog_visibility, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.Integer> categories, @org.jetbrains.annotations.Nullable()
    java.lang.String color, @org.jetbrains.annotations.Nullable()
    java.util.List<? extends java.lang.Object> cross_sell_ids, @org.jetbrains.annotations.Nullable()
    com.iqonic.woobox.models.DateCreated date_created, @org.jetbrains.annotations.Nullable()
    com.iqonic.woobox.models.DateModified date_modified, @org.jetbrains.annotations.Nullable()
    java.lang.String description, @org.jetbrains.annotations.Nullable()
    java.lang.String dimensions, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean featured, @org.jetbrains.annotations.Nullable()
    java.lang.String full, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> gallery, @org.jetbrains.annotations.Nullable()
    java.lang.String get_purchase_note, @org.jetbrains.annotations.Nullable()
    java.lang.String height, @org.jetbrains.annotations.Nullable()
    java.lang.String length, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean manage_stock, @org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.Integer parent_id, @org.jetbrains.annotations.Nullable()
    java.lang.String permalink, @org.jetbrains.annotations.Nullable()
    java.lang.String price, @org.jetbrains.annotations.Nullable()
    java.lang.Integer pro_id, @org.jetbrains.annotations.Nullable()
    java.lang.String regular_price, @org.jetbrains.annotations.Nullable()
    java.lang.Integer review_count, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean reviews_allowed, @org.jetbrains.annotations.Nullable()
    java.lang.String sale_price, @org.jetbrains.annotations.Nullable()
    java.lang.Integer shipping_class_id, @org.jetbrains.annotations.Nullable()
    java.lang.String short_description, @org.jetbrains.annotations.Nullable()
    java.lang.String size, @org.jetbrains.annotations.Nullable()
    java.lang.String sku, @org.jetbrains.annotations.Nullable()
    java.lang.String slug, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean sold_individually, @org.jetbrains.annotations.Nullable()
    java.lang.Integer srno, @org.jetbrains.annotations.Nullable()
    java.lang.String status, @org.jetbrains.annotations.Nullable()
    java.lang.Integer stock_quantity, @org.jetbrains.annotations.Nullable()
    java.lang.String stock_status, @org.jetbrains.annotations.Nullable()
    java.lang.String tax_class, @org.jetbrains.annotations.Nullable()
    java.lang.String tax_status, @org.jetbrains.annotations.Nullable()
    java.lang.String thumbnail, @org.jetbrains.annotations.Nullable()
    java.lang.String type, @org.jetbrains.annotations.Nullable()
    java.util.List<? extends java.lang.Object> upsell_ids, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean virtual, @org.jetbrains.annotations.Nullable()
    java.lang.String weight, @org.jetbrains.annotations.Nullable()
    java.lang.String width) {
        super();
    }
    
    public ProductDataNew() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.Integer> component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.Object> component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.iqonic.woobox.models.DateCreated component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.iqonic.woobox.models.DateModified component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component18() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component19() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component20() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component21() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component22() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component23() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component24() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component25() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component26() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component27() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component28() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component29() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component30() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component31() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component32() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component33() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component34() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component35() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component36() {
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
    public final java.lang.String component39() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component40() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component41() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component42() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.Object> component43() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component44() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component45() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component46() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.iqonic.woobox.models.ProductDataNew copy(@org.jetbrains.annotations.Nullable()
    java.lang.String average_rating, @org.jetbrains.annotations.Nullable()
    java.lang.String backorders, @org.jetbrains.annotations.Nullable()
    java.lang.Integer num_pages, @org.jetbrains.annotations.Nullable()
    java.lang.String brand, @org.jetbrains.annotations.Nullable()
    java.lang.String catalog_visibility, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.Integer> categories, @org.jetbrains.annotations.Nullable()
    java.lang.String color, @org.jetbrains.annotations.Nullable()
    java.util.List<? extends java.lang.Object> cross_sell_ids, @org.jetbrains.annotations.Nullable()
    com.iqonic.woobox.models.DateCreated date_created, @org.jetbrains.annotations.Nullable()
    com.iqonic.woobox.models.DateModified date_modified, @org.jetbrains.annotations.Nullable()
    java.lang.String description, @org.jetbrains.annotations.Nullable()
    java.lang.String dimensions, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean featured, @org.jetbrains.annotations.Nullable()
    java.lang.String full, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> gallery, @org.jetbrains.annotations.Nullable()
    java.lang.String get_purchase_note, @org.jetbrains.annotations.Nullable()
    java.lang.String height, @org.jetbrains.annotations.Nullable()
    java.lang.String length, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean manage_stock, @org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.Integer parent_id, @org.jetbrains.annotations.Nullable()
    java.lang.String permalink, @org.jetbrains.annotations.Nullable()
    java.lang.String price, @org.jetbrains.annotations.Nullable()
    java.lang.Integer pro_id, @org.jetbrains.annotations.Nullable()
    java.lang.String regular_price, @org.jetbrains.annotations.Nullable()
    java.lang.Integer review_count, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean reviews_allowed, @org.jetbrains.annotations.Nullable()
    java.lang.String sale_price, @org.jetbrains.annotations.Nullable()
    java.lang.Integer shipping_class_id, @org.jetbrains.annotations.Nullable()
    java.lang.String short_description, @org.jetbrains.annotations.Nullable()
    java.lang.String size, @org.jetbrains.annotations.Nullable()
    java.lang.String sku, @org.jetbrains.annotations.Nullable()
    java.lang.String slug, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean sold_individually, @org.jetbrains.annotations.Nullable()
    java.lang.Integer srno, @org.jetbrains.annotations.Nullable()
    java.lang.String status, @org.jetbrains.annotations.Nullable()
    java.lang.Integer stock_quantity, @org.jetbrains.annotations.Nullable()
    java.lang.String stock_status, @org.jetbrains.annotations.Nullable()
    java.lang.String tax_class, @org.jetbrains.annotations.Nullable()
    java.lang.String tax_status, @org.jetbrains.annotations.Nullable()
    java.lang.String thumbnail, @org.jetbrains.annotations.Nullable()
    java.lang.String type, @org.jetbrains.annotations.Nullable()
    java.util.List<? extends java.lang.Object> upsell_ids, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean virtual, @org.jetbrains.annotations.Nullable()
    java.lang.String weight, @org.jetbrains.annotations.Nullable()
    java.lang.String width) {
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