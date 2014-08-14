package io.netty.example.server;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.example.bean.UserInfo;

public class EchoClientHandler extends SimpleChannelInboundHandler<UserInfo> {

    private final UserInfo firstMessage;

    /**
     * Creates a client-side handler.
     */
    public EchoClientHandler() {
        firstMessage = new UserInfo("zhangsan");
    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) {
    	System.out.println("write message to server "+ firstMessage);
        ctx.writeAndFlush(firstMessage);
    }


 

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
        // Close the connection when an exception is raised.
        cause.printStackTrace();
        ctx.close();
    }

	@Override
	protected void channelRead0(ChannelHandlerContext ctx, UserInfo msg) throws Exception {
		System.out.println("receive userinfo object from  server "+msg);
	}
}