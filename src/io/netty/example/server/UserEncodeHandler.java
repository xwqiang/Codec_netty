package io.netty.example.server;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.example.bean.SerializeUtil;
import io.netty.example.bean.UserInfo;
import io.netty.handler.codec.ByteToMessageCodec;

import java.util.List;

public class UserEncodeHandler extends ByteToMessageCodec<UserInfo>{

	@Override
	protected void decode(ChannelHandlerContext ctx, ByteBuf buf, List<Object> out) throws Exception {
		UserInfo u  = (UserInfo) SerializeUtil.unserialize(buf.array());
		out.add(u);
	}

	@Override
	protected void encode(ChannelHandlerContext ctx, UserInfo user, ByteBuf buf) throws Exception {
		byte[] b = SerializeUtil.serialize(user);
		buf = Unpooled.copiedBuffer(b);
		
	}


}
