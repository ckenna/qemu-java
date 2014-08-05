package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <p><pre>QApiCommandDescriptor{name=ringbuf-write, returns=null, data={device=str, data=str, *format=DataFormat}}</pre></p>
 */
// QApiCommandDescriptor{name=ringbuf-write, returns=null, data={device=str, data=str, *format=DataFormat}}
public class RingbufWriteCommand extends QApiCommand<RingbufWriteCommand.Arguments, RingbufWriteCommand.Response> {
	/** Compound arguments to a RingbufWriteCommand. */
	public static class Arguments {

		@JsonProperty("device")
		@Nonnull
		public java.lang.String device;
		@JsonProperty("data")
		@Nonnull
		public java.lang.String data;
		@JsonProperty("format")
		@CheckForNull
		public DataFormat format;

		public Arguments() {
		}

		public Arguments(java.lang.String device, java.lang.String data, DataFormat format) {
			this.device = device;
			this.data = data;
			this.format = format;
		}
	}

	/** Response to a RingbufWriteCommand. */
	public static class Response extends QApiResponse<java.lang.Void> {
	}

	/** Constructs a new RingbufWriteCommand. */
	public RingbufWriteCommand(@Nonnull RingbufWriteCommand.Arguments argument) {
		super("ringbuf-write", Response.class, argument);
	}

	/** Constructs a new RingbufWriteCommand. */
	public RingbufWriteCommand(java.lang.String device, java.lang.String data, DataFormat format) {
		this(new Arguments(device, data, format));
	}
}
