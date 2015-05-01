package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <pre>QApiEventDescriptor{name=BLOCK_WRITE_THRESHOLD, data={node-name=str, amount-exceeded=uint64, write-threshold=uint64}}</pre>
 */
// QApiEventDescriptor{name=BLOCK_WRITE_THRESHOLD, data={node-name=str, amount-exceeded=uint64, write-threshold=uint64}}
public class BlockWriteThresholdEvent extends QApiEvent {
	@JsonProperty("node-name")
	@Nonnull
	public java.lang.String nodeName;
	@JsonProperty("amount-exceeded")
	@Nonnull
	public long amountExceeded;
	@JsonProperty("write-threshold")
	@Nonnull
	public long writeThreshold;
}
