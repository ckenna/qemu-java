package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <pre>QApiEventDescriptor{name=QUORUM_FAILURE, data={reference=str, sector-num=int, sectors-count=int}}</pre>
 */
// QApiEventDescriptor{name=QUORUM_FAILURE, data={reference=str, sector-num=int, sectors-count=int}}
public class QuorumFailureEvent extends QApiEvent {

	public static class Data {
		@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
		@JsonProperty("reference")
		@Nonnull
		public java.lang.String reference;
		@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
		@JsonProperty("sector-num")
		@Nonnull
		public long sectorNum;
		@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
		@JsonProperty("sectors-count")
		@Nonnull
		public long sectorsCount;
	}

	@JsonProperty("data")
	public Data data;
}
