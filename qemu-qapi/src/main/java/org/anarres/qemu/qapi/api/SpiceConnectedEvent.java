package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
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

	public static class Data {
		@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
		@JsonProperty("server")
		@Nonnull
		public SpiceBasicInfo server;
		@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
		@JsonProperty("client")
		@Nonnull
		public SpiceBasicInfo client;
	}

	@JsonProperty("data")
	public Data data;
}
