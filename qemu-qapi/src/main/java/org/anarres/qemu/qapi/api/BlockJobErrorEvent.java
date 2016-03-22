package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <pre>QApiEventDescriptor{name=BLOCK_JOB_ERROR, data={device=str, operation=IoOperationType, action=BlockErrorAction}}</pre>
 */
// QApiEventDescriptor{name=BLOCK_JOB_ERROR, data={device=str, operation=IoOperationType, action=BlockErrorAction}}
public class BlockJobErrorEvent extends QApiEvent {

	public static class Data {
		@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
		@JsonProperty("device")
		@Nonnull
		public java.lang.String device;
		@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
		@JsonProperty("operation")
		@Nonnull
		public IoOperationType operation;
		@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
		@JsonProperty("action")
		@Nonnull
		public BlockErrorAction action;
	}

	@JsonProperty("data")
	public Data data;
}
