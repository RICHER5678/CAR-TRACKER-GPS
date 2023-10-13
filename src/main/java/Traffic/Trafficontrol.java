/*
 * Copyright 2023 BAGOMBEKA JOB (bagombekajob16@gmail.com)

 */



 
package org.traccar;

import io.netty.channel.group.ChannelGroup;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.ssl.SslHandler;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import io.netty.util.concurrent.GlobalEventExecutor;
import org.traccar.config.Config;
import org.traccar.config.Keys;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import java.util.concurrent.TimeUnit;


public interface TrackerConnector extends LifecycleObject {

    boolean isDatagram();

    boolean isSecure();

    ChannelGroup getChannelGroup();

}
