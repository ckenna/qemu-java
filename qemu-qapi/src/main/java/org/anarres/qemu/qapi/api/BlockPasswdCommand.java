package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <pre>QApiCommandDescriptor{name=block_passwd, returns=null, data={*device=str, *node-name=str, password=str}}</pre>
 */
// QApiCommandDescriptor{name=block_passwd, returns=null, data={*device=str, *node-name=str, password=str}}
public class BlockPasswdCommand extends QApiCommand<BlockPasswdCommand.Arguments, BlockPasswdCommand.Response> {
	/** Compound arguments to a BlockPasswdCommand. */
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	public static class Arguments {

		@JsonProperty("device")
		@CheckForNull
		public java.lang.String device;
		@JsonProperty("node-name")
		@CheckForNull
		public java.lang.String nodeName;
		@JsonProperty("password")
		@Nonnull
		public java.lang.String password;

		public Arguments() {
		}

		public Arguments(java.lang.String device, java.lang.String nodeName, java.lang.String password) {
			this.device = device;
			this.nodeName = nodeName;
			this.password = password;
		}
	}

	/** Response to a BlockPasswdCommand. */
	public static class Response extends QApiResponse<java.lang.Void> {
	}

	/** Constructs a new BlockPasswdCommand. */
	public BlockPasswdCommand(@Nonnull BlockPasswdCommand.Arguments argument) {
		super("block_passwd", Response.class, argument);
	}

	/** Constructs a new BlockPasswdCommand. */
	public BlockPasswdCommand(java.lang.String device, java.lang.String nodeName, java.lang.String password) {
		this(new Arguments(device, nodeName, password));
	}
}
