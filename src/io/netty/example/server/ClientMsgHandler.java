package io.netty.example.server;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.example.bean.Msg;

public class ClientMsgHandler extends SimpleChannelInboundHandler<Msg> {

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
        cause.printStackTrace();
        ctx.close();
    }

	@Override
	protected void channelRead0(ChannelHandlerContext ctx, Msg msg)
			throws Exception {
		System.out.println("receive msg object from  server "+msg);
		
	}
}