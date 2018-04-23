package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <pre>QApiStructDescriptor{name=BlockDeviceStats, data={rd_bytes=int, wr_bytes=int, rd_operations=int, wr_operations=int, flush_operations=int, flush_total_time_ns=int, wr_total_time_ns=int, rd_total_time_ns=int, wr_highest_offset=int, rd_merged=int, wr_merged=int, *idle_time_ns=int, failed_rd_operations=int, failed_wr_operations=int, failed_flush_operations=int, invalid_rd_operations=int, invalid_wr_operations=int, invalid_flush_operations=int, account_invalid=bool, account_failed=bool, timed_stats=[BlockDeviceTimedStats], *x_rd_latency_histogram=BlockLatencyHistogramInfo, *x_wr_latency_histogram=BlockLatencyHistogramInfo, *x_flush_latency_histogram=BlockLatencyHistogramInfo}, innerTypes=null, fields=null, base=null}</pre>
 */
// QApiStructDescriptor{name=BlockDeviceStats, data={rd_bytes=int, wr_bytes=int, rd_operations=int, wr_operations=int, flush_operations=int, flush_total_time_ns=int, wr_total_time_ns=int, rd_total_time_ns=int, wr_highest_offset=int, rd_merged=int, wr_merged=int, *idle_time_ns=int, failed_rd_operations=int, failed_wr_operations=int, failed_flush_operations=int, invalid_rd_operations=int, invalid_wr_operations=int, invalid_flush_operations=int, account_invalid=bool, account_failed=bool, timed_stats=[BlockDeviceTimedStats], *x_rd_latency_histogram=BlockLatencyHistogramInfo, *x_wr_latency_histogram=BlockLatencyHistogramInfo, *x_flush_latency_histogram=BlockLatencyHistogramInfo}, innerTypes=null, fields=null, base=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class BlockDeviceStats extends QApiType {

	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("rd_bytes")
	@Nonnull
	public long rdBytes;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("wr_bytes")
	@Nonnull
	public long wrBytes;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("rd_operations")
	@Nonnull
	public long rdOperations;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("wr_operations")
	@Nonnull
	public long wrOperations;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("flush_operations")
	@Nonnull
	public long flushOperations;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("flush_total_time_ns")
	@Nonnull
	public long flushTotalTimeNs;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("wr_total_time_ns")
	@Nonnull
	public long wrTotalTimeNs;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("rd_total_time_ns")
	@Nonnull
	public long rdTotalTimeNs;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("wr_highest_offset")
	@Nonnull
	public long wrHighestOffset;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("rd_merged")
	@Nonnull
	public long rdMerged;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("wr_merged")
	@Nonnull
	public long wrMerged;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("idle_time_ns")
	@CheckForNull
	public java.lang.Long idleTimeNs;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("failed_rd_operations")
	@Nonnull
	public long failedRdOperations;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("failed_wr_operations")
	@Nonnull
	public long failedWrOperations;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("failed_flush_operations")
	@Nonnull
	public long failedFlushOperations;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("invalid_rd_operations")
	@Nonnull
	public long invalidRdOperations;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("invalid_wr_operations")
	@Nonnull
	public long invalidWrOperations;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("invalid_flush_operations")
	@Nonnull
	public long invalidFlushOperations;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("account_invalid")
	@Nonnull
	public boolean accountInvalid;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("account_failed")
	@Nonnull
	public boolean accountFailed;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("timed_stats")
	@Nonnull
	public java.util.List<BlockDeviceTimedStats> timedStats;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("x_rd_latency_histogram")
	@CheckForNull
	public BlockLatencyHistogramInfo xRdLatencyHistogram;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("x_wr_latency_histogram")
	@CheckForNull
	public BlockLatencyHistogramInfo xWrLatencyHistogram;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("x_flush_latency_histogram")
	@CheckForNull
	public BlockLatencyHistogramInfo xFlushLatencyHistogram;

	@Nonnull
	public BlockDeviceStats withRdBytes(long value) {
		this.rdBytes = value;
		return this;
	}

	@Nonnull
	public BlockDeviceStats withWrBytes(long value) {
		this.wrBytes = value;
		return this;
	}

	@Nonnull
	public BlockDeviceStats withRdOperations(long value) {
		this.rdOperations = value;
		return this;
	}

	@Nonnull
	public BlockDeviceStats withWrOperations(long value) {
		this.wrOperations = value;
		return this;
	}

	@Nonnull
	public BlockDeviceStats withFlushOperations(long value) {
		this.flushOperations = value;
		return this;
	}

	@Nonnull
	public BlockDeviceStats withFlushTotalTimeNs(long value) {
		this.flushTotalTimeNs = value;
		return this;
	}

	@Nonnull
	public BlockDeviceStats withWrTotalTimeNs(long value) {
		this.wrTotalTimeNs = value;
		return this;
	}

	@Nonnull
	public BlockDeviceStats withRdTotalTimeNs(long value) {
		this.rdTotalTimeNs = value;
		return this;
	}

	@Nonnull
	public BlockDeviceStats withWrHighestOffset(long value) {
		this.wrHighestOffset = value;
		return this;
	}

	@Nonnull
	public BlockDeviceStats withRdMerged(long value) {
		this.rdMerged = value;
		return this;
	}

	@Nonnull
	public BlockDeviceStats withWrMerged(long value) {
		this.wrMerged = value;
		return this;
	}

	@Nonnull
	public BlockDeviceStats withIdleTimeNs(java.lang.Long value) {
		this.idleTimeNs = value;
		return this;
	}

	@Nonnull
	public BlockDeviceStats withFailedRdOperations(long value) {
		this.failedRdOperations = value;
		return this;
	}

	@Nonnull
	public BlockDeviceStats withFailedWrOperations(long value) {
		this.failedWrOperations = value;
		return this;
	}

	@Nonnull
	public BlockDeviceStats withFailedFlushOperations(long value) {
		this.failedFlushOperations = value;
		return this;
	}

	@Nonnull
	public BlockDeviceStats withInvalidRdOperations(long value) {
		this.invalidRdOperations = value;
		return this;
	}

	@Nonnull
	public BlockDeviceStats withInvalidWrOperations(long value) {
		this.invalidWrOperations = value;
		return this;
	}

	@Nonnull
	public BlockDeviceStats withInvalidFlushOperations(long value) {
		this.invalidFlushOperations = value;
		return this;
	}

	@Nonnull
	public BlockDeviceStats withAccountInvalid(boolean value) {
		this.accountInvalid = value;
		return this;
	}

	@Nonnull
	public BlockDeviceStats withAccountFailed(boolean value) {
		this.accountFailed = value;
		return this;
	}

	@Nonnull
	public BlockDeviceStats withTimedStats(java.util.List<BlockDeviceTimedStats> value) {
		this.timedStats = value;
		return this;
	}

	@Nonnull
	public BlockDeviceStats withXRdLatencyHistogram(BlockLatencyHistogramInfo value) {
		this.xRdLatencyHistogram = value;
		return this;
	}

	@Nonnull
	public BlockDeviceStats withXWrLatencyHistogram(BlockLatencyHistogramInfo value) {
		this.xWrLatencyHistogram = value;
		return this;
	}

	@Nonnull
	public BlockDeviceStats withXFlushLatencyHistogram(BlockLatencyHistogramInfo value) {
		this.xFlushLatencyHistogram = value;
		return this;
	}

	public BlockDeviceStats() {
	}

	public BlockDeviceStats(long rdBytes, long wrBytes, long rdOperations, long wrOperations, long flushOperations, long flushTotalTimeNs, long wrTotalTimeNs, long rdTotalTimeNs, long wrHighestOffset, long rdMerged, long wrMerged, java.lang.Long idleTimeNs, long failedRdOperations, long failedWrOperations, long failedFlushOperations, long invalidRdOperations, long invalidWrOperations, long invalidFlushOperations, boolean accountInvalid, boolean accountFailed, java.util.List<BlockDeviceTimedStats> timedStats, BlockLatencyHistogramInfo xRdLatencyHistogram, BlockLatencyHistogramInfo xWrLatencyHistogram, BlockLatencyHistogramInfo xFlushLatencyHistogram) {
		this.rdBytes = rdBytes;
		this.wrBytes = wrBytes;
		this.rdOperations = rdOperations;
		this.wrOperations = wrOperations;
		this.flushOperations = flushOperations;
		this.flushTotalTimeNs = flushTotalTimeNs;
		this.wrTotalTimeNs = wrTotalTimeNs;
		this.rdTotalTimeNs = rdTotalTimeNs;
		this.wrHighestOffset = wrHighestOffset;
		this.rdMerged = rdMerged;
		this.wrMerged = wrMerged;
		this.idleTimeNs = idleTimeNs;
		this.failedRdOperations = failedRdOperations;
		this.failedWrOperations = failedWrOperations;
		this.failedFlushOperations = failedFlushOperations;
		this.invalidRdOperations = invalidRdOperations;
		this.invalidWrOperations = invalidWrOperations;
		this.invalidFlushOperations = invalidFlushOperations;
		this.accountInvalid = accountInvalid;
		this.accountFailed = accountFailed;
		this.timedStats = timedStats;
		this.xRdLatencyHistogram = xRdLatencyHistogram;
		this.xWrLatencyHistogram = xWrLatencyHistogram;
		this.xFlushLatencyHistogram = xFlushLatencyHistogram;
	}

	@JsonIgnore
	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("rd_bytes");
		names.add("wr_bytes");
		names.add("rd_operations");
		names.add("wr_operations");
		names.add("flush_operations");
		names.add("flush_total_time_ns");
		names.add("wr_total_time_ns");
		names.add("rd_total_time_ns");
		names.add("wr_highest_offset");
		names.add("rd_merged");
		names.add("wr_merged");
		names.add("idle_time_ns");
		names.add("failed_rd_operations");
		names.add("failed_wr_operations");
		names.add("failed_flush_operations");
		names.add("invalid_rd_operations");
		names.add("invalid_wr_operations");
		names.add("invalid_flush_operations");
		names.add("account_invalid");
		names.add("account_failed");
		names.add("timed_stats");
		names.add("x_rd_latency_histogram");
		names.add("x_wr_latency_histogram");
		names.add("x_flush_latency_histogram");
		return names;
	}

	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("rd_bytes".equals(name))
			return rdBytes;
		if ("wr_bytes".equals(name))
			return wrBytes;
		if ("rd_operations".equals(name))
			return rdOperations;
		if ("wr_operations".equals(name))
			return wrOperations;
		if ("flush_operations".equals(name))
			return flushOperations;
		if ("flush_total_time_ns".equals(name))
			return flushTotalTimeNs;
		if ("wr_total_time_ns".equals(name))
			return wrTotalTimeNs;
		if ("rd_total_time_ns".equals(name))
			return rdTotalTimeNs;
		if ("wr_highest_offset".equals(name))
			return wrHighestOffset;
		if ("rd_merged".equals(name))
			return rdMerged;
		if ("wr_merged".equals(name))
			return wrMerged;
		if ("idle_time_ns".equals(name))
			return idleTimeNs;
		if ("failed_rd_operations".equals(name))
			return failedRdOperations;
		if ("failed_wr_operations".equals(name))
			return failedWrOperations;
		if ("failed_flush_operations".equals(name))
			return failedFlushOperations;
		if ("invalid_rd_operations".equals(name))
			return invalidRdOperations;
		if ("invalid_wr_operations".equals(name))
			return invalidWrOperations;
		if ("invalid_flush_operations".equals(name))
			return invalidFlushOperations;
		if ("account_invalid".equals(name))
			return accountInvalid;
		if ("account_failed".equals(name))
			return accountFailed;
		if ("timed_stats".equals(name))
			return timedStats;
		if ("x_rd_latency_histogram".equals(name))
			return xRdLatencyHistogram;
		if ("x_wr_latency_histogram".equals(name))
			return xWrLatencyHistogram;
		if ("x_flush_latency_histogram".equals(name))
			return xFlushLatencyHistogram;
		return super.getFieldByName(name);
	}
}
