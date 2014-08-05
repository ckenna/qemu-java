package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <p><pre>QApiTypeDescriptor{name=SpiceChannel, data={connection-id=int, channel-type=int, channel-id=int, tls=bool}, innerTypes=null}</pre></p>
 */
// QApiTypeDescriptor{name=SpiceChannel, data={connection-id=int, channel-type=int, channel-id=int, tls=bool}, innerTypes=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class SpiceChannel extends SpiceBasicInfo {

	@JsonProperty("connection-id")
	@Nonnull
	public long connectionId;
	@JsonProperty("channel-type")
	@Nonnull
	public long channelType;
	@JsonProperty("channel-id")
	@Nonnull
	public long channelId;
	@JsonProperty("tls")
	@Nonnull
	public boolean tls;

	@Nonnull
	public SpiceChannel withConnectionId(long value) {
		this.connectionId = value;
		return this;
	}

	@Nonnull
	public SpiceChannel withChannelType(long value) {
		this.channelType = value;
		return this;
	}

	@Nonnull
	public SpiceChannel withChannelId(long value) {
		this.channelId = value;
		return this;
	}

	@Nonnull
	public SpiceChannel withTls(boolean value) {
		this.tls = value;
		return this;
	}

	public SpiceChannel() {
	}

	public SpiceChannel(long connectionId, long channelType, long channelId, boolean tls) {
		this.connectionId = connectionId;
		this.channelType = channelType;
		this.channelId = channelId;
		this.tls = tls;
	}
}
