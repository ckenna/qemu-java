package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <p><pre>QApiCommandDescriptor{name=send-key, returns=null, data={keys=[KeyValue], *hold-time=int}}</pre></p>
 */
// QApiCommandDescriptor{name=send-key, returns=null, data={keys=[KeyValue], *hold-time=int}}
public class SendKeyCommand extends QApiCommand<SendKeyCommand.Arguments, SendKeyCommand.Response> {
	/** Compound arguments to a SendKeyCommand. */
	public static class Arguments {

		@JsonProperty("keys")
		@Nonnull
		public java.util.List<KeyValue> keys;
		@JsonProperty("hold-time")
		@CheckForNull
		public java.lang.Long holdTime;

		public Arguments() {
		}

		public Arguments(java.util.List<KeyValue> keys, java.lang.Long holdTime) {
			this.keys = keys;
			this.holdTime = holdTime;
		}
	}

	/** Response to a SendKeyCommand. */
	public static class Response extends QApiResponse<java.lang.Void> {
	}

	/** Constructs a new SendKeyCommand. */
	public SendKeyCommand(@Nonnull SendKeyCommand.Arguments argument) {
		super("send-key", Response.class, argument);
	}

	/** Constructs a new SendKeyCommand. */
	public SendKeyCommand(java.util.List<KeyValue> keys, java.lang.Long holdTime) {
		this(new Arguments(keys, holdTime));
	}
}
