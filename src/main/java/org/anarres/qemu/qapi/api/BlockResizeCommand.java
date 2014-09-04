package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <p><pre>QApiCommandDescriptor{name=block_resize, returns=null, data={*device=str, *node-name=str, size=int}}</pre></p>
 */
// QApiCommandDescriptor{name=block_resize, returns=null, data={*device=str, *node-name=str, size=int}}
public class BlockResizeCommand extends QApiCommand<BlockResizeCommand.Arguments, BlockResizeCommand.Response> {
	/** Compound arguments to a BlockResizeCommand. */
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	public static class Arguments {

		@JsonProperty("device")
		@CheckForNull
		public java.lang.String device;
		@JsonProperty("node-name")
		@CheckForNull
		public java.lang.String nodeName;
		@JsonProperty("size")
		@Nonnull
		public long size;

		public Arguments() {
		}

		public Arguments(java.lang.String device, java.lang.String nodeName, long size) {
			this.device = device;
			this.nodeName = nodeName;
			this.size = size;
		}
	}

	/** Response to a BlockResizeCommand. */
	public static class Response extends QApiResponse<java.lang.Void> {
	}

	/** Constructs a new BlockResizeCommand. */
	public BlockResizeCommand(@Nonnull BlockResizeCommand.Arguments argument) {
		super("block_resize", Response.class, argument);
	}

	/** Constructs a new BlockResizeCommand. */
	public BlockResizeCommand(java.lang.String device, java.lang.String nodeName, long size) {
		this(new Arguments(device, nodeName, size));
	}
}
