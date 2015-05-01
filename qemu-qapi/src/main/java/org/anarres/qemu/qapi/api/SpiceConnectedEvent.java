package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <pre>QApiEventDescriptor{name=SPICE_CONNECTED, data={server=SpiceBasicInfo, client=SpiceBasicInfo}}</pre>
 */
// QApiEventDescriptor{name=SPICE_CONNECTED, data={server=SpiceBasicInfo, client=SpiceBasicInfo}}
public class SpiceConnectedEvent extends QApiEvent {
	@JsonProperty("server")
	@Nonnull
	public SpiceBasicInfo server;
	@JsonProperty("client")
	@Nonnull
	public SpiceBasicInfo client;
}
