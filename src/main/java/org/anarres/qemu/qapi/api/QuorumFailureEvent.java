package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <p><pre>QApiEventDescriptor{name=QUORUM_FAILURE, data={reference=str, sector-num=int, sectors-count=int}}</pre></p>
 */
// QApiEventDescriptor{name=QUORUM_FAILURE, data={reference=str, sector-num=int, sectors-count=int}}
public class QuorumFailureEvent extends QApiEvent {
	@JsonProperty("reference")
	@Nonnull
	public java.lang.String reference;
	@JsonProperty("sector-num")
	@Nonnull
	public long sectorNum;
	@JsonProperty("sectors-count")
	@Nonnull
	public long sectorsCount;
}
